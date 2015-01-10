Arrows
======

Changelog
--------------------------------
* no longer using "python-like" syntax (statements still separated by line, block are now indicated with '{' '}')
* reduced the number of operators, also skipped on optional parts
* no pointers (arrays are still passed as reference to functions)
* no global variables
* no preprocessor directives
* _pass_
* _null_
* _def_

Arrows is designed to make you write less code, while sacrificing speed but keeping at least a decent amount of legibility. It adheres to the off-side rule (which means thah code blocks are expressed by their identation, similarly to languages like Python of Occam) and contains just a single basic datatype of integer, while arrays of integers can be interpreted (and manipulated) as strings. Language should also provide garbage collector, if I get to it :).

Syntax,preprocessor and comments
--------------------------------
All functions must be declared before the rest of the code. Each statement must end with a newline character - expect for statements inside `while` , `for` , `if`, where this is optional.

All lines beggining with # are treated like single line comments and are ignored
```
#this is a comment
<@ "hello"
```

Reserved Words
--------------------------------
* _for_ 
* _while_
* _ret_
* _def_

Operators
--------------------------------
**Assignment:** `>>` `+>` `->` `/>` `*>` `&>` `<<` `<+` `<-` `</` `<*`

**Arithmetic:** `+` `-` `*` `/`

**Logic:** `!` `=` `<` `>` `>=` `<=` `&` `|`

**Parentheses:**`(` `)` `{` `}`

**I/O:** `>>` `@>` `<<` `<@` 

**Other:** `!^`

Assignment works in the way that the "arrow" points to (the greater than '>' sign points right, less than '<' points left). For example `x>>y` assigns the value of x to y. `<->` is the swap operator - which swaps the values of given variables. Assignments can be chained and mixed with arithmetic or logical expressions - these are evaluated from left to right, as if the expression on the "open" side of an arrow is consumed (see example). Arrows containing arithmetic signs work similarly to `+=`,`-=`,`*=` and `/=` in other languages. The rest of the logical operators work with values - and all of them return 0 or 1 as false or true (but of integer type).

Priority of operations is same as it's usually in math, with assignments having the lowest priority. If this isn't desirable, the order of operations can be altered by using parentheses.
```
x >> y                      # x=y - error, x is not declared, we don't know what assign to y
x << 47
x >> y                      # now it's ok
x +> y <- z                 # y=y+x-z
x*y /> a >> z >> v <* 1/a   # z=a/(x*y), v=1/(x*y)
y<<42                       # y=x=42
z<<42						
x=z                         # true - returns 1
```
Basic data types and variables
--------------------------------
The only basic data type is integer. Strings are just a different interpretations of integer arrays.

Arrays,strings and range (optional parts)
--------------------------------
Arrays can be allocated dynamically - they are not inflatible, but we can define them anywhere in the code, with size given as integer parameter
```
x[10]               #new 1d array
x[0] << 8
x[1] << 47
y[x[0]][x[1]]       #new 2d array
```
Arrays can be interpreted as strings. This happens when 
- they're printed on screen via a "print string" operator `<@` or `<$` (more on this in I/O)
- `"string"` (a string bounded by quotation marks) is assigned to an array (there must be enough room, assignemnt always happens as if it was to a 1d array, even if it's not)
```
x[10] << "hello"
<@ x		  		  # prints "hello\n"
```

Input/Output (optional parts)
--------------------------------
There are various operators for both input and output, all of which can be chained on a single line (input with input, output with output). Input operators require at least one argument on the left side, output doesn't need any.
* `>>` interprets numbers as integers, can be set tu read multiple integers
* `@>` interprets everything as a string, reads a single word separated by spaces, a maximum length as well as an exact location within an array can be chosen
* `<<` writes ints and interprets arrays as ints, adds a newline if it's the last (or the only one) in the "chain" of output
* `<@` writes strings together with a newline character

Syntax shown in the following example.

Output
```
a[] << "foobar"
<< a            #prints some random numbers, corresponding to the ascii values of characters of "foobar"
<@ a            #prints "foobar\n"
```
Output
```
>> x,y,z        #can write into multiple ints
a[]
>> a            #or an array
@> a            #similar with strings (this overwrites)
```
```
10 >> x >> y >> z
<< x,y,z:"blah"  		#we can specify a separateor, added between multiple outputting integers (or strings, same syntax there)
```

If statement
------------------------------
Boolean statement followed by a colon is considered an if statement.
```
x>y:
	<< "x is greater"
!^:
	<< "y is greater"
```


Loops
--------------------------------
```
for i >> [0..10]: # the >> in for statement means that i will be rising from the lower end of the given range
	<< i

for i << [10..-1]:   #similarly, here the i will decrease from 10 to 0
	<< i

while x>y:        #works as expected
	<< x
```

Functions
--------------------------------
Must be defined before the rest of the code. When passing arrays we must define theyr dimensions (but we have no guarantee that array of given dimensions and size really arrives in the function), but we can use other (previously) passed values to do this. All functions return integers, if no value is specified the return value is 0.

```
my_function(n,a[n]): {
	for i >> [0..n]:
		<< a[i]
	ret 0
	}
```