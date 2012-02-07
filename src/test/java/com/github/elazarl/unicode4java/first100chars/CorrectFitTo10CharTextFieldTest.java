package com.github.elazarl.unicode4java.first100chars;

public class CorrectFitTo10CharTextFieldTest extends FitTo10CharTextFieldTest {
    @Override
    FitTo10CharTextField getImpl() {
        return new CorrectFitTo10CharTextField();
    }
}
