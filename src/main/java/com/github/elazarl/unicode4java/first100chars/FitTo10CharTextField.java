package com.github.elazarl.unicode4java.first100chars;

/**
 * Should return a prefix of the string that would roughly fit a text field
 * capable of containing 10 characters.
 */
abstract public class FitTo10CharTextField {
    abstract public String fitTo10Char(String text);
}
