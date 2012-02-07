package com.github.elazarl.unicode4java.first100chars;

public class NaiveFitTo10CharTextField extends FitTo10CharTextField {
    @Override
    public String fitTo10Char(String text) {
        return text.substring(0,Math.min(text.length(), 10));
    }
}