package com.github.elazarl.unicode4java.mostfreqchar;

import java.util.HashMap;
import java.util.Map;

public class NaiveMostFreqChar extends MostFreqChar {
    @Override
    public String mostFreqChar(String str) {
        Map<Character,Integer> histo = new HashMap<Character, Integer>();
        for (int i=0;i<str.length();i++) {
            inc(histo, str.charAt(i));
        }

        return Character.toString(highestValueEntry(histo).getKey());
    }

}
