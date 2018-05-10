package com.demo.w.clone;

import java.io.*;

/**
 *
 */
public class CloneUtils {

    public static <T extends Serializable> T clone(T obj){

        T cloneObj = null;
        try{
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream obs = new ObjectOutputStream(out);
            obs.writeObject(obj);
            obs.close();
            ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(in);
            cloneObj = (T) ois.readObject();
            ois.close();
        }
        catch (Exception e){

        }

        return cloneObj;
    }
}
