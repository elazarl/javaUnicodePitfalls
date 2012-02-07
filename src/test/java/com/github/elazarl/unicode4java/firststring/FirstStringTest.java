package com.github.elazarl.unicode4java.firststring;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Tests if your sort is locale aware
 */
public abstract class FirstStringTest {
    abstract protected FirstString getImpl();
    @Test
    public void testFirstString() throws Exception {
        assertThat(
                getImpl().firstString(Arrays.asList("a","b")),
                equalTo("a")
        );
        assertThat(
                getImpl().firstString(Arrays.asList("é","f","z")),
                equalTo("é")
        );
    }
}
