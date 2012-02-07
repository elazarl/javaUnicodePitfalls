package com.github.elazarl.unicode4java.mostfreqchar;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

/**
 * An interface, that given a string, returns the most frequently occurring character
 */
public abstract class MostFreqChar {
    abstract String mostFreqChar(String str);

    protected static <K> void inc(Map<K, Integer> histo, K c) {
        if (!histo.containsKey(c)) histo.put(c,0);
        histo.put(c,histo.get(c)+1);
    }

    protected <K,V extends Comparable<V>> Map.Entry<K,V> highestValueEntry(Map<K, V> histo) {
        return Collections.max(histo.entrySet(), new Comparator<Map.Entry<K, V>>() {
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
    }
}
