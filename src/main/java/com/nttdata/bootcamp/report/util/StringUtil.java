package com.nttdata.bootcamp.report.util;

public class StringUtil {

    private StringUtil(){
    }

    public static String toString(Object object) {
        try {
            if (object != null) {
                return String.valueOf(object);
            }
        } catch (Exception e) {
            return "";
        }
        return "";
    }

}
