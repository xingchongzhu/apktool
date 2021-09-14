package com.efs.sdk.base.p176a.p187h.p190c;

import android.util.Base64;
import com.efs.sdk.base.p176a.p187h.C1728d;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: com.efs.sdk.base.a.h.c.b */
public final class C1727b {
    /* renamed from: a */
    public static String m14304a(byte[] bArr) {
        return new String(Base64.encode(bArr, 11));
    }

    /* renamed from: b */
    public static String m14306b(byte[] bArr) {
        try {
            return new String(Base64.decode(bArr, 11));
        } catch (Throwable th) {
            C1728d.m14309b("efs.base", "decode error", th);
            return "";
        }
    }

    /* renamed from: a */
    public static String m14303a(String str) {
        String str2 = "";
        if (str == null || str.length() <= 0) {
            return str2;
        }
        try {
            return String.format(Locale.CHINA, "%032x", new Object[]{new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes()))});
        } catch (NoSuchAlgorithmException e) {
            C1728d.m14309b("efs.base", "md5 error", e);
            return str2;
        }
    }

    /* renamed from: b */
    public static String m14305b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C1728d.m14309b("efs.base", "urlEncode error", e);
            return "";
        }
    }
}
