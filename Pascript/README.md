Pascript
========

a strictly typed, high-level, turing-complete programming language developed as a school project.

Programs are compiled into llvm byte code, which can be interpreted directly or compiled into executable machine code.

The language's features include:
- support for boolean, integer, float and string primitive datatypes
- dynamic multi-dimensional arrays of any of the mentioned primitive datatype
- full management of allocated memory, which is automatically deallocated as soon as it isn't needed
- ability to incorporate external functions by linking a library during compilation, provided they support the same data types
- native support for various methods and operations on strings and arrays including concatenation, substring, searching and lexicographic comparison for the former and merging, content equality testing and resizing for the latter
- error messages during compilation point to the exact line and character position, that needs to be rewritten
- support for recursive function calling

The language does not directly support advanced data types, some operations can however be easily implemented using the available arrays, these are a few examples:

- **a.push(x)** : `a.insert(0, x);`
- **x = a.pop()** : `x = a.get(0); a.remove(0);`
- **a.addLast(x)** : `a.insert(a.size() - 1, x);`
- **x = a.removeLast()** : `x = a.get(a.size() - 1); a.remove(a.size() - 1);`

Changelog
========

The language's specification has been changed since the initial announcment. Here is a quick summary of changes:

Changes:

- changed syntax for reading from and printing to the standard I/O
- replaced access of elements in an array using square brackets with special methods `a = b.get(i)` instead of `a = b[i]` `b.set(i, a)` and instead of `b[i] = a`

Added:

- automatic memory managment for dynamic data types
- global variables
- external functions
- module sections
- direct support for printing and reading any primitive data type directly without needing to convert from or to strings
- variable scope
- implicit return values for all functions if no return statement is reached

Removed:

- user-defined classes and objects
- utf-8 support for strings
- the tupple (or composite) data type
- sets and maps
- array literals
- the for-each loop control flow statement

To learn more please read the [specification](https://github.com/Player1os/Pascript/wiki/Specification)