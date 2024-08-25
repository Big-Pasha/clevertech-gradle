package org.clevertech.gradle.pz.utils.utils;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        return str != null && !str.isEmpty() ? Double.parseDouble(str) > 0 : false;
    }
}
