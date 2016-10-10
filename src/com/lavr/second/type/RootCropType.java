package com.lavr.second.type;

/**
 * Created by 123 on 02.10.2016.
 */
public enum  RootCropType {
    BEETROOT, CARROT, TURNIP, POTATO;

    public static boolean contains(String name) {
        try {
            valueOf(name.toUpperCase());
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }
}
