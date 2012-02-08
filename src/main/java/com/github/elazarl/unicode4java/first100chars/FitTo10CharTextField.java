package com.github.elazarl.unicode4java.first100chars;

/**
 * Should return a prefix of the string that would roughly fit a text field
 * capable of containing 10 characters.
 */
public interface FitTo10CharTextField {
    String invoke(String text);
}
