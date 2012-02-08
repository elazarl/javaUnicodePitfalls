package com.github.elazarl.unicode4java.utils;

import java.util.Iterator;

/**
 * Iterates over all codepoints in a string.
 */
public class CodePointIterable implements Iterable<Integer> {
    final private String str;

    private CodePointIterable(String str) {this.str = str;}

    static public CodePointIterable of(String str) {
        return new CodePointIterable(str);
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int pos = 0;

            public boolean hasNext() {
                return pos < str.length();
            }

            public Integer next() {
                int codePoint = str.codePointAt(pos);
                pos += Character.charCount(codePoint);
                return codePoint;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
