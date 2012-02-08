package com.github.elazarl.unicode4java;

import com.github.elazarl.unicode4java.utils.CodePointIterable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Make sure codepoint iterator iterates every codepoint in the string, even if it contains surrogate-pairs.
 */
public class CodePointIterableTest {
    @Test
    public void testIterator() throws Exception {
        final String singleCodePointString = "\ud835\udd3e";

        List<Integer> codePoints = new ArrayList<Integer>();
        for (Integer cp : CodePointIterable.of(singleCodePointString)) {
            codePoints.add(cp);
        }

        assertEquals(1, codePoints.size());
        assertEquals((Integer)0x1d53e, codePoints.get(0));
    }
}
