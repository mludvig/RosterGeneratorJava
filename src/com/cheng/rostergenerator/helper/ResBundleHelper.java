package com.cheng.rostergenerator.helper;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResBundleHelper {

    private static final ResourceBundle sResource = ResourceBundle.getBundle("string");

    public static String getString(String key) {
        return sResource.getString(key);
    }

    private ResBundleHelper() {
    }

}
