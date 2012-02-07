package com.github.elazarl.unicode4java.prefix;

public class NaiveIsPrefix extends IsPrefix {
    @Override
    public boolean isPrefix(String prefix, String text) {
        return text.startsWith(prefix);
    }
}
