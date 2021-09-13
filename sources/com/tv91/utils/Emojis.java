package com.tv91.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.tv91.utils.b */
public final class Emojis {

    /* renamed from: a */
    private static final Pattern f16071a = Pattern.compile("&#(\\d+);");

    /* renamed from: a */
    public static String m20560a(String str) {
        Matcher matcher = f16071a.matcher(str);
        while (matcher.find()) {
            str = str.replace(matcher.group(0), new String(Character.toChars(Integer.parseInt(matcher.group(1)))));
        }
        return str;
    }
}
