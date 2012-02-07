package com.github.elazarl.unicode4java.first100chars;

public class NaiveFitTo10CharTextFieldTest extends FitTo10CharTextFieldTest {
    @Override
    FitTo10CharTextField getImpl() {
        return new NaiveFitTo10CharTextField();
    }
}
