package com.github.elazarl.unicode4java.prefix;

public class NaiveIsPrefixTest extends IsPrefixTest {
    @Override
    protected IsPrefix getImpl() {
        return new NaiveIsPrefix();
    }
}
