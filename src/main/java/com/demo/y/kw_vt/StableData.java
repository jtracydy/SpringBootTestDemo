package com.demo.y.kw_vt;

import java.util.ArrayList;
import java.util.List;

public class StableData {

    private final String str;
    private final List<String> list = new ArrayList();

    public StableData(String str) {
        this.str = str;
        if (list.size() != 0)
            list.remove(0);
        list.add(str);
    }

    public String getIntArr() {
        return list.get(0);
    }
}
