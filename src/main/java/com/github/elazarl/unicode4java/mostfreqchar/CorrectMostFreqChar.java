package com.github.elazarl.unicode4java.mostfreqchar;

import com.github.elazarl.unicode4java.CodePointIterable;

import java.util.HashMap;
import java.util.Map;

/**
 * returns the most frequently used character, takes surrogate pairs into account.
 */
public class CorrectMostFreqChar extends MostFreqChar {
    @Override
    public String mostFreqChar(String str) {
        Map<Integer,Integer> histo = new HashMap<Integer, Integer>();
        for (int c : CodePointIterable.of(str)) {
            inc(histo,c);
        }
        return new String(Character.toChars(highestValueEntry(histo).getKey()));
    }
}
