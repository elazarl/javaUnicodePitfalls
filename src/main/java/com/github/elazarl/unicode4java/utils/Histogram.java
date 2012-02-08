package com.github.elazarl.unicode4java.utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple implementation of a histogram. You add items to the histogram
 * and it reports how many items are there for every kind of item inserted.
 * It is a toy class for demonstration purposes only. Ineffecient and single
 * purpose interface.
 *
 * Usage Example:
 * <pre>
 * {@code
 *  Histogram<String> histo = Histogram.build();
 *     histo.add("cat");
 *     histo.add("dog");
 *     histo.add("cat");
 *     assertEquals(histo.mostFreqItem(),"cat");
 *     histo.add("seal",100);
 *     assertEquals(histo.mostFreqItem(),"seal");
 * }
 * </pre>
 */
//@NotThreadSafe
public class Histogram<T> {
    private Map<T,Integer> histo = new HashMap<T, Integer>();

    public static <U> Histogram<U> build() {
        return new Histogram<U>();
    }

    public int add(T item, int amount) {
        Integer prev = histo.get(item);
        if (prev == null) {
            prev = 0;
            histo.put(item,prev);
        }
        histo.put(item,prev+amount);
        return prev;
    }

    public int add(T item) {
        return add(item,1);
    }

    private <K,V extends Comparable<V>> Map.Entry<K,V> highestValueEntry(Map<K, V> histo) {
        return Collections.max(histo.entrySet(), new Comparator<Map.Entry<K, V>>() {
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
    }

    public T mostFreqItem() {
        return highestValueEntry(histo).getKey();
    }
}
