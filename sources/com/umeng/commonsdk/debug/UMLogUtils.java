package com.umeng.commonsdk.debug;

public class UMLogUtils {
    public static String makeUrl(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("https://developer.umeng.com/docs/66632/detail/");
        sb.append(str);
        sb.append("?um_channel=sdk");
        return sb.toString();
    }
}
