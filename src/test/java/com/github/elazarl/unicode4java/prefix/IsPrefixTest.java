package com.github.elazarl.unicode4java.prefix;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Tests IsPrefix class. Should normalize the unicode strings before comparing
 * them to pass this test.
 */
public abstract class IsPrefixTest {
    protected abstract IsPrefix getImpl();
    @Test
    public void testIsPrefix() throws Exception {
        String[] [] tests = {
                {"abc","abcd"},
                {"def","defg"},
                {"🂡🂱","🂡🂱🃁🃑🂢🂲🃂🃒🂣🂳"},
                {"בְּ","בְּ"},
                // order of combining characters matters when comparing
                // char-to-char, but not when comparing text-to-text
                {"\u05d1\u05bc\u05b0","\u05d1\u05b0\u05bc"},
                {"\u05d1\u05b0\u05bc","\u05d1\u05bc\u05b0"},
                // Two equivalent characters that can be expressed with either
                // one or two codepoints
                {"Á","Áaa"},
        };
        for (String[] test : tests) {
            assertTrue(test[0]+" should be prefix of "+test[1],
                    getImpl().isPrefix(test[0],test[1]));
        }
    }
}
