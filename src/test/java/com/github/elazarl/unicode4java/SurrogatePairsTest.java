package com.github.elazarl.unicode4java;

import org.junit.Before;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Examplify the use of Unicode surrogate-pairs.
 */
public class SurrogatePairsTest {
    String text;

    @Before
    public void setUp() throws UnsupportedEncodingException {
        byte[] data =
        {
            (byte) 0xFE, (byte) 0xFF, // BOM
            0, 0x41, // A
            (byte) 0xD8, 1, // High surrogate
            (byte) 0xDC, 2, // Low surrogate
            // Both surrogates encode http://www.fileformat.info/info/unicode/char/10402/index.htm
            // DESERET CAPITAL LETTER LONG A
            0, 0x42, // B
        };

        text = new String(data, "UTF-16");
    }

    @Test
    public void utf32Equiv() throws UnsupportedEncodingException {
        final String s = new String(new byte[]{0, 1, (byte) 0xd5, 0x3e}, "UTF-32BE");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(Integer.toHexString(s.charAt(i)));
        }
        byte[] data =
        {
            0,0,(byte) 0xFE, (byte) 0xFF, // BOM
            0,0,0, 0x41, // A
            0,0x1,0x04,0x02, // DESERET CAPITAL LETTER LONG A
            0,0,0, 0x42, // B
        };
        final String fromUtf32 = new String(data, "UTF-32");
        assertEquals(text, fromUtf32);
        assertTrue(Arrays.equals(text.getBytes(),fromUtf32.getBytes()));
        assertEquals(2,Character.charCount(fromUtf32.codePointAt(1)));
    }

    @Test
    public void testSurrogateUTF16() {

        assertEquals(4, text.length());
        assertEquals(3, text.codePointCount(0, text.length()));

        assertEquals('A', text.codePointAt(0));
        assertEquals(0x10402, text.codePointAt(1));
//        assertEquals(0x10402, text.codePointAt(2));  No valid codepoint at char 2!
        assertEquals(0x42, text.codePointAt(3));

        assertTrue(Character.isDefined(text.charAt(1)));
        assertFalse("0xD801,0xDC02 should be surrogate pair",
                Character.isSurrogatePair(text.charAt(2), text.charAt(1)));

        assertEquals('A', text.charAt(0));
        assertEquals(0xD801,text.charAt(1));
        assertEquals(0xDC02,text.charAt(2));
        assertEquals(0x42,text.charAt(3));
    }

}
