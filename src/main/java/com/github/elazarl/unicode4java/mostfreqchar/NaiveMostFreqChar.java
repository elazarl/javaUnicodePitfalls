package com.github.elazarl.unicode4java.mostfreqchar;

import com.github.elazarl.unicode4java.utils.Histogram;

public class NaiveMostFreqChar implements MostFreqChar {
    public String invoke(String str) {
        Histogram<Character> histo = Histogram.build();
        for (int i=0;i<str.length();i++) {
            histo.add(str.charAt(i));
        }

        return Character.toString(histo.mostFreqItem());
    }

}
