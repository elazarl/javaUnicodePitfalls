package com.github.elazarl.unicode4java.firststring;

public class NaiveFirstStringTest extends FirstStringTest {
    @Override
    protected FirstString getImpl() {
        return new NaiveFirstString();
    }
}
