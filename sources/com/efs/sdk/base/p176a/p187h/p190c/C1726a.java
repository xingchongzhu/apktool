package com.efs.sdk.base.p176a.p187h.p190c;

import com.efs.sdk.base.p176a.p187h.C1728d;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.efs.sdk.base.a.h.c.a */
public final class C1726a {

    /* renamed from: a */
    private static final IvParameterSpec f11410a = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: a */
    public static byte[] m14301a(byte[] bArr, String str) {
        try {
            SecretKeySpec a = m14299a(str);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, a, f11410a);
            return instance.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            C1728d.m14309b("efs.base", "aes decrypt error", e);
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m14302b(byte[] bArr, String str) {
        try {
            SecretKeySpec a = m14299a(str);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, a, f11410a);
            return instance.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            C1728d.m14309b("efs.base", "aes encrypt error", e);
            return null;
        }
    }

    /* renamed from: a */
    private static SecretKeySpec m14299a(String str) {
        return new SecretKeySpec(str.getBytes(), "AES");
    }

    /* renamed from: a */
    public static byte[] m14300a(String str, String str2) {
        try {
            return m14302b(str.getBytes("UTF-8"), str2);
        } catch (UnsupportedEncodingException e) {
            C1728d.m14309b("efs.base", "getBytes error", e);
            return null;
        }
    }
}
