package com.github.elazarl.unicode4java.first100chars;

import org.junit.Test;

import java.awt.*;
import java.awt.font.FontRenderContext;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

public abstract class FitTo10CharTextFieldTest {
    FontRenderContext frc = new FontRenderContext(null, false, false);
    Font font = new Font("Monospaced", Font.PLAIN, 36);

    abstract FitTo10CharTextField getImpl();

    private double em10 = ems(10);

    @Test
    public void sanityCheck() throws Exception {
        assertThat(stringWidthInPixels("aa"),
                greaterThan(stringWidthInPixels("a")));
    }

    @Test
    public void testSurrogates() throws Exception {
        String[] inputs = {
                "abcdefghijklmnopqrstuvwxyz123456789",
                "ëëëëëëëëëëëëëëëëëëëëëëëëëëëë",
                "🂡🂱🃁🃑🂢🂲🃂🃒🂣🂳🃃🃓🂮🂾🃎🃞",
        };
        for (String input : inputs) {
            final String trimmed = getImpl().fitTo10Char(input);
            assertThat("String: '"+trimmed+"' not within 20% of 10ems",
                    stringWidthInPixels(trimmed),
                    closeTo(em10,em10*.2d));
        }
    }

    protected double ems(int n) {
        char[] ems = new char[n];
        for (int i=0;i<ems.length;i++) {
            ems[i] = 'i';
        }
        return stringWidthInPixels(new String(ems));
    }

    protected double stringWidthInPixels(String str) {
        return font.getStringBounds(str, frc).getBounds2D().getWidth();
    }
}
