package com.github.elazarl.unicode4java.mostfreqchar;

public class CorrectMostFreqCharTest extends MostFreqCharTest {
    @Override
    MostFreqChar getImpl() {
        return new CorrectMostFreqChar();
    }
}
