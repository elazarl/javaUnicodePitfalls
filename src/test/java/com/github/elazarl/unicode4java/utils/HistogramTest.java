package com.github.elazarl.unicode4java.utils;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HistogramTest {
    @Test
    public void testMostFreqItem() throws Exception {
        Histogram<String> histo = Histogram.build();
        histo.add("cat");
        histo.add("dog");
        histo.add("cat");
        assertEquals(histo.mostFreqItem(), "cat");
        histo.add("seal",100);
        histo.add("cat");
        assertEquals(histo.mostFreqItem(),"seal");
    }
}
