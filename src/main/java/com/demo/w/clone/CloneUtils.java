package com.demo.w.clone;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 */
public class CloneUtils {

    public static <T extends Serializable> T clone(T obj){

        Collections.sort(new ArrayList<Comparable>());

        return obj;
    }
}
