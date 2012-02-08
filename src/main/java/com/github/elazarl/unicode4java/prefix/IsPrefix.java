package com.github.elazarl.unicode4java.prefix;

/**
 * Should return true if a is a prefix of be
 */
public interface IsPrefix {
    public boolean invoke(String prefix, String text);
}
