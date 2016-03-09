package org.astegiano.wp.utils;

import java.text.Normalizer;
import java.util.regex.Pattern;

/**
 * Created by Quentin on 09/03/2016.
 */
public class StringUtils {

    private static final Pattern ACCENT_PATTERN = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    private static final Pattern SPACE_PATTERN = Pattern.compile("[^a-zA-Z0-9]+");

    public static String normalize(String s) {
        String ns = Normalizer.normalize(s, Normalizer.Form.NFD);
        ns = ACCENT_PATTERN.matcher(ns).replaceAll("");
        ns = ns.trim();
        ns = SPACE_PATTERN.matcher(ns).replaceAll("_");
        return ns.toLowerCase();
    }
}
