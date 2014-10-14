Arrows
======

Arrows is designed to make you write less code, while sacrificing speed but keeping at least a decent amount of legibility. It adheres to the off-side rule (which means thah code blocks are expressed by their identation, similarly to languages like Python of Occam) and contains just a single basic datatype of integer, while arrays of integers can be interpreted (and manipulated) as strings. Language should also provide garbage collector, if I get to it :).

Syntax,preprocessor and comments
--------------------------------
Commands are separated by newline characters and by default, a new block is recognized by indenting by 4 spaces or a single tab. This can be changed in a way similar to C preprocessor directives, by adding `#tabsize=x` where x is the number of spaces defining a new block. This still equalls a single tab character (the size of which you should set in your editor). The second such directive is `#bytes=y` where y is the maximum number of bytes a variable or an array element can grow to before it overflows (more on this in the data types section). By default, this should be (theoretically) infinite. These are the only two directives of the language, and should preceed the rest of the code.

```
#tabsize=4
#bytesize=16
```

All other lines beggining with # are treated like single line comments and are ignored, multiline comments are bounded by ~

```
#this is a comment
@> x ~ this
comment spawns multiple
lines ~ <@ "hello" + x
```

Reserved Words
--------------------------------
* _for_ 
* _while_
* _break_
* _skip_
* _ret_
* _pass_
* _null_

Operators
--------------------------------
**Assignment:** `>>` `+>` `->` `/>` `*>` `&>` `<<` `<+` `<-` `</` `<*` `<&` `<->`

**Arithmetic:** `+` `-` `*` `/` `%` `++` `--`

**Logic:** `!` `=` `<` `>` `>=` `<=` `==` `&` `|`

**Parentheses:**`(` `)`

**I/O:** `>>` `@>` `$>` `<<` `<@` `<!` `<$` 

**Other:** `?` `?!` `!^`

Assignment works in the way that the "arrow" points to (the greater than '>' sign points right, less than '<' points left). For example `x>>y` assigns the value of x to y. `<->` is the swap operator - which swaps the values of given variables. Assignments can be chained and mixed with arithmetic or logical expressions - these are evaluated from left to right, as if the expression on the "open" side of an arrow is consumed (see example). Arrows containing arithmetic signs work similarly to `+=`,`-=`,`*=` and `/=` in other languages. `&>` and `<&` copies the reference instead of a value (therefore,`x&>y` makes y essentially a pointer to x). `==` operator checks if given arguments are the same elements (point to the same place in memory), the rest of the logical operators work with values - and all of them return 0 or 1 as false or true. The `?` and `?!` operators will be covered in the strings section.

Priority of operations is same as it's usually in math, with assignments having the lowest priority. If this isn't desirable, the order of operations can be altered by using parentheses.
```
x >> y                      # x=y - error, x is not declared, we don't know what assign to y
x << 47
x >> y                      # now it's ok
x +> y <- z                 # y=y+x-z
x*y /> a >> z >> v <* 1/a   # z=a/(x*y), v=1/(x*y)
y<&x
y<<42                       # y=x=42
z=42
x=z                         # true - returns 1
x==z                        # false - returns 0
x==y                        # true
```
Basic data types and variables
--------------------------------
There is just a single data type of "inflatable" integer - int. Each one starts as an 8 bit and doubles it's size every time it would overflow otherwise. If an overflowing int is a part of an array, the whole array adjusts its size. Ints can be assigned a null value, which trows an error if it is being manipulated with (except for printing and `!`,`=` and `==` operators). All of the assignment, arithmetic and logic operators can be used with a int as an argument, where `!x` is interpreted as true if `x=0` or `x=null` and false otherwise.

Variable names characters, numbers and underscores and must nost start with a number.

Arrays,strings and range
--------------------------------
Arrays are also inflatible - if you try to assign to an element that wasn't used before, the array will be extended up to the given point. New elements are pre-filled with 0. 
```
x[]                 #new 1d array
y[][]               #new 2d array
a[][] >> b >> c     #creates 3 separate 2 dimensional arrays, by copying an empty a array into b and c
d << "hello world"  # arrays and strings are the same thing
f[10] << 47         # 1d array of size 11, where the last element has the value of 47
f << 42             # fills an existing array with 42
e[10][10][3][7]
e << 8              #fills every non-array dimension with 8
```
Arrays can be interpreted as strings. This happens when 
- they're printed on screen via a "print string" operator `<@` or `<$` (more on this in I/O)
- `+>` `->` `<+` `<-` `+` `-` `?` `?!` operators are used (of course, we can use these on int arrays, and each int will be treated like a single character)
- `"string"` (a string bounded by quotation marks) is assigned to an array
```
x << "hello"
x << "hell" + "o" # same effect as the previous statement
x <+ " world"     # concatenation
x <- "orl"        # x="hello wd", using - on strings in expressions has the same effect
x <- [5]          # x="hellowd"
x <- [1..2]       # x="hlowd"
x ? "low"         # returns 1 (true) - low is a substring of x
x ?! "wd"	  # returns 3 - the position of the substring within the string
?x 		  # returns 5 - the length of x
```
The use of various assignment operators and python-like range allows us to treat arrays in a similar way as vectors in other languages (but slower :) )
```
x[10]           #0 filled
x<<47           #fills the array with 47
x <- [2..3]     #deletes some of the 47s
?x 	 	#returns 8 - length of the array
x[20] << 42     #creates 12 new elements, all but the last one with values 0
x[8..20] << 47  #the array is again full of 47s
```
Except for `!`, all of the logic operators can be used on arrays.
```
x << "hello"
y << "hello"
x=y:				#this is true
	<< "hello world"
```
Input/Output
--------------------------------
There are various operators for both input and output, all of which can be chained on a single line (input with input, output with output). Input operators require at least one argument on the left side, output doesn't need any.
* `>>` interprets numbers as integers, can be set tu read multiple integers into a single array, skips over text, reads up to a single line
* `@>` interprets everything as a string, reads a single word separated by spaces, a maximum length as well as an exact location within an array can be chosen
* `$>` interprets everything as a string, reads the whole line, a maximum length as well as an exact location within an array can be chosen
* `<<` writes ints and interprets arrays as ints, adds a newline if it's the last (or the only one) in the "chain" of output - newline is written even if no argument is given
* `<!` writes ints without the newline
* `<$` writes strings together with a newline character
* `<@` strings without newline

Syntax shown in the following example.

```
>> x,y,z        #can write into multiple ints
a[]
>> a            #or an array
>> a[10..15]    #or a given part of an array
@> a            #similar with strings (this overwrites)
@> a[?a+]       #this concatenates
@> a[10..15]    #this limits
$> a            #same with the whole line
```

```
10 >> x >> y >> z
<< x,y,z:" ",":","..."  #for every variable/constant used, we can specify a string behind a colon that is concatenated to it,
                        #by default it is an empty string. the previous statement prints "10 10:10..."
```
```
a[1][2][2] << 0
a << 47                 #fills every non-array dimension with 47
<< a:"\n\n","\n"," "    #for every dimension of an array, we can specify a string elements in it are separated byt
#previous statement produces output:
47 47 47
47 47 47
47 47 47

47 47 47
47 47 47
47 47 47
```
```
a[] << "foobar"
<< a            #prints some random numbers, corresponding to the ascii values of characters of "foobar"
<@ a            #prints "foobar"
<$ a            #prints "foobar\n"
<@ a <<         #since once the line starts with output, all of the operators are interpreted as I/O, prints "foobar\n"
```

If and switch
Boolean statement followed by a colon is considered an if statement.
```
x>y:
	<< "x is greater"
!^:
	<< "y is greater"
```
A single variable followed by colon is considered a switch statement. This variable can be both and int or an array, and different "cases" are allowed for both of these (in general - with int you can ask about the value, with array about the length or the string it contains).
```
x << 8
a[]
x:
	8:        #x equal to 8
		pass    #pass does nothing, "syntaktic sugar"
	!47:      #x not equal to 47
		pass    
	[1..3]:   #x between (and including) 1 and 3
		pass
	[0-]:     #x is negative (smaller than 0)
		pass
a:
	8:        #array has length 8 (?x=8)
		pass
	!47:      #array doesn't have length 47 (?x!=47)
		pass
	[5-]:     #array length is smaller than 5 (any range can be given as a "case" statement)
		pass
	"jablko": #string (array) equals "jablko"
		pass
	?!"blko": #string contains a substring "blko"
		pass
```

Loops
--------------------------------
```
for i >> [0..10]: # the >> in for statement means that i will be rising from the lower end of the given range
	pass            #pass does nothing

for i << [10-]:   #similarly, here the i will (endlessly) decrease, starting from number 10 (the << operator)
	pass

while x>y:        #works as expected
	pass
```

To further control the flow, you can use the `break` or the `skip` statement, where the latter is equivallent to `continue` used in most languages (which is a long word, therefore we use `skip`).

Functions
--------------------------------
Finally, something that writes and works (almost) like something from a normal programming language (expect that we steal the ability to return multiple variables from python).

```
my_function():
	ret 10,11

my_function() >> x,y
```
