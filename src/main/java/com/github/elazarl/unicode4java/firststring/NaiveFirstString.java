package com.github.elazarl.unicode4java.firststring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NaiveFirstString extends FirstString {
    @Override
    public String firstString(List<String> list) {
        List<String> copy = new ArrayList<String>();
        copy.addAll(list);
        Collections.sort(copy);
        return copy.get(0);
    }
}
