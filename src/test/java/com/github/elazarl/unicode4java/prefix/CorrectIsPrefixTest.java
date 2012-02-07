package com.github.elazarl.unicode4java.prefix;

public class CorrectIsPrefixTest extends IsPrefixTest {
    @Override
    protected IsPrefix getImpl() {
        return new CorrectIsPrefix();
    }
}
