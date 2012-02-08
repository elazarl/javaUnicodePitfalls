package com.github.elazarl.unicode4java.mostfreqchar;

import com.github.elazarl.unicode4java.utils.CodePointIterable;
import com.github.elazarl.unicode4java.utils.Histogram;

/**
 * returns the most frequently used character, takes surrogate pairs into account.
 */
public class CorrectMostFreqChar implements MostFreqChar {
    public String mostFreqChar(String str) {
        Histogram<Integer> histo = Histogram.build();
        for (int c : CodePointIterable.of(str)) {
            histo.add(c);
        }
        return new String(Character.toChars(histo.mostFreqItem()));
    }
}
