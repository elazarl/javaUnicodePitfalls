package com.github.elazarl.unicode4java.firststring;

public class LocaleAwareFirstStringTest extends FirstStringTest {
    @Override
    protected FirstString getImpl() {
        return new LocaleAwareFirstString();
    }
}
