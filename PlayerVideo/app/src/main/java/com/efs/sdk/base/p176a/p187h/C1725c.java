package com.efs.sdk.base.p176a.p187h;

import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.efs.sdk.base.a.h.c */
public final class C1725c {
    /* renamed from: a */
    public static byte[] m14298a(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e) {
            C1728d.m14309b("efs.base", "gzip error", e);
            return null;
        }
    }
}
