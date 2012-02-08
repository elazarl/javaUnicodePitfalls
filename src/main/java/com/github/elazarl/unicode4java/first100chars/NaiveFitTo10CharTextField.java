package com.github.elazarl.unicode4java.first100chars;

public class NaiveFitTo10CharTextField implements FitTo10CharTextField {
    public String invoke(String text) {
        return text.substring(0,Math.min(text.length(), 10));
    }
}
