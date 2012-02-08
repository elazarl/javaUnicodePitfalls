package com.github.elazarl.unicode4java.prefix;

public class NaiveIsPrefix implements IsPrefix {
    public boolean isPrefix(String prefix, String text) {
        return text.startsWith(prefix);
    }
}
