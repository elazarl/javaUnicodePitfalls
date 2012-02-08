# Unicode Pitfalls

This small Java project tries to examplify common i18n errors related to
Unicode in Java. The content should be relevant even for backend
programmers who would not actually render the text.

The main theme is, given a few packages, in each package there's an
abstract class with a very simple requirement, the naive implementation, and
the more "correct" one, which is more unicode aware. For each such class
there's a test abstract class with unicode problematic data.

A possible exposition method is, asking the programmer to implement the
simple abstract class, and let him see why the tests fail.

All Java files are UTF-8 encoded, and must be compiled as such, it contains
UTF-8 characters in string literals.

# Summary  of Topics Covered
* Surrogate pairs, which are not handled as single
  codepoint in Java.
* Unicode normalization which be performed before string comparison
* Grapheme/character boundaries, a unicode character is not always what
  visible or stand alone.

TODO: case folding and case mapping examples

Bidi is also an important issue, but it is not presented here.
