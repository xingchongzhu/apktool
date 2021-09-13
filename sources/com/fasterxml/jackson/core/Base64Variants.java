package com.fasterxml.jackson.core;

public final class Base64Variants {
    public static final Base64Variant MIME;
    public static final Base64Variant MIME_NO_LINEFEEDS;
    public static final Base64Variant MODIFIED_FOR_URL;
    public static final Base64Variant PEM;
    static final String STD_BASE64_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    static {
        Base64Variant base64Variant = new Base64Variant("MIME", STD_BASE64_ALPHABET, true, '=', 76);
        MIME = base64Variant;
        MIME_NO_LINEFEEDS = new Base64Variant(base64Variant, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        Base64Variant base64Variant2 = new Base64Variant(base64Variant, "PEM", true, '=', 64);
        PEM = base64Variant2;
        StringBuilder sb = new StringBuilder(STD_BASE64_ALPHABET);
        sb.setCharAt(sb.indexOf("+"), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        Base64Variant base64Variant3 = new Base64Variant("MODIFIED-FOR-URL", sb.toString(), false, 0, Integer.MAX_VALUE);
        MODIFIED_FOR_URL = base64Variant3;
    }

    public static Base64Variant getDefaultVariant() {
        return MIME_NO_LINEFEEDS;
    }

    public static Base64Variant valueOf(String str) throws IllegalArgumentException {
        String str2;
        Base64Variant base64Variant = MIME;
        if (base64Variant._name.equals(str)) {
            return base64Variant;
        }
        Base64Variant base64Variant2 = MIME_NO_LINEFEEDS;
        if (base64Variant2._name.equals(str)) {
            return base64Variant2;
        }
        Base64Variant base64Variant3 = PEM;
        if (base64Variant3._name.equals(str)) {
            return base64Variant3;
        }
        Base64Variant base64Variant4 = MODIFIED_FOR_URL;
        if (base64Variant4._name.equals(str)) {
            return base64Variant4;
        }
        if (str == null) {
            str2 = "<null>";
        } else {
            StringBuilder sb = new StringBuilder();
            String str3 = "'";
            sb.append(str3);
            sb.append(str);
            sb.append(str3);
            str2 = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("No Base64Variant with name ");
        sb2.append(str2);
        throw new IllegalArgumentException(sb2.toString());
    }
}
