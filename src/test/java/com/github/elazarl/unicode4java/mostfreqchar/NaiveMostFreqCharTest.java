package com.github.elazarl.unicode4java.mostfreqchar;

public class NaiveMostFreqCharTest extends MostFreqCharTest {
    @Override
    MostFreqChar getImpl() {
        return new NaiveMostFreqChar();
    }
}
