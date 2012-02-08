package com.github.elazarl.unicode4java.prefix;

import java.text.Normalizer;

/**
 * normilizes both strings before any comparison
 */
public class CorrectIsPrefix implements IsPrefix {
    public boolean isPrefix(String prefix, String text) {
        String ntext    = Normalizer.normalize(text, Normalizer.Form.NFD);
        String nprefix = Normalizer.normalize(prefix, Normalizer.Form.NFD);
        return ntext.startsWith(nprefix);
    }
}
