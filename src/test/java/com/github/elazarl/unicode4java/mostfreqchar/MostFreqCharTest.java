package com.github.elazarl.unicode4java.mostfreqchar;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Tests stub for classes implementing {@code MostFreqChar} abstract class
 */
public abstract class MostFreqCharTest {
    abstract MostFreqChar getImpl();
    @Test
    public void testRegularString() {
        assertThat(getImpl().invoke("aaaaaa bc"),equalTo("a"));
    }

    @Test
    public void testSurrogateString() {
        assertThat(getImpl().invoke("𝌈"),equalTo("𝌈"));
        assertThat(getImpl().invoke("🂱🂱🁒🁒🁒🂫🂱🂱🂱🂱"),
                equalTo("🂱"));
    }
}
