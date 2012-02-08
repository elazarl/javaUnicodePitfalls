package com.github.elazarl.unicode4java.firststring;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is by no means the only "correct" way to order strings, but it serves
 * its purpose to let programmer know that there's more than English in this
 * world, and one should think about the locale before sorting text..
 */
public class LocaleAwareFirstString implements FirstString {
    public String invoke(List<String> list) {
        List<String> copy = new ArrayList<String>();
        copy.addAll(list);
        Collator collator = Collator.getInstance();
        Collections.sort(copy,collator);
        return copy.get(0);
    }
}
