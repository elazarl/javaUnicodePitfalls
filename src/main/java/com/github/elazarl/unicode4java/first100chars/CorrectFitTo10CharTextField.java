package com.github.elazarl.unicode4java.first100chars;

import java.text.BreakIterator;

public class CorrectFitTo10CharTextField implements FitTo10CharTextField {
    public String fitTo10Char(String text) {
        int graphemeCount = 0;
        BreakIterator it = BreakIterator.getCharacterInstance();
        it.setText(text);
        int end = it.next();
        for (; end != BreakIterator.DONE; end = it.next()) {
            graphemeCount++;
            if (graphemeCount >= 10) break;
        }
        return text.substring(0,end);
    }

}
