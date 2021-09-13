package com.umeng.analytics.filter;

import android.util.Base64;
import com.umeng.analytics.pro.TType;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.umeng.analytics.filter.d */
public class SmartDict {

    /* renamed from: b */
    private static final String f16524b = "Ă";

    /* renamed from: a */
    private final String f16525a;

    /* renamed from: c */
    private MessageDigest f16526c;

    /* renamed from: d */
    private Set<Object> f16527d = new HashSet();

    /* renamed from: e */
    private boolean f16528e;

    public SmartDict(boolean z, String str) {
        String str2 = "MD5";
        this.f16525a = str2;
        int i = 0;
        this.f16528e = false;
        this.f16528e = z;
        try {
            this.f16526c = MessageDigest.getInstance(str2);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        if (str == null) {
            return;
        }
        if (z) {
            try {
                byte[] decode = Base64.decode(str.getBytes(), 0);
                while (i < decode.length / 4) {
                    int i2 = i * 4;
                    this.f16527d.add(Integer.valueOf(((decode[i2 + 0] & 255) << 24) + ((decode[i2 + 1] & 255) << TType.f16865n) + ((decode[i2 + 2] & 255) << 8) + (decode[i2 + 3] & 255)));
                    i++;
                }
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            }
        } else {
            String[] split = str.split(f16524b);
            int length = split.length;
            while (i < length) {
                this.f16527d.add(split[i]);
                i++;
            }
        }
    }

    /* renamed from: c */
    private Integer m21473c(String str) {
        try {
            this.f16526c.update(str.getBytes());
            byte[] digest = this.f16526c.digest();
            return Integer.valueOf(((digest[0] & 255) << 24) + ((digest[1] & 255) << TType.f16865n) + ((digest[2] & 255) << 8) + (digest[3] & 255));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo18849a(String str) {
        if (this.f16528e) {
            return this.f16527d.contains(m21473c(str));
        }
        return this.f16527d.contains(str);
    }

    /* renamed from: b */
    public void mo18850b(String str) {
        if (this.f16528e) {
            this.f16527d.add(m21473c(str));
        } else {
            this.f16527d.add(str);
        }
    }

    public String toString() {
        if (this.f16528e) {
            byte[] bArr = new byte[(this.f16527d.size() * 4)];
            Iterator it = this.f16527d.iterator();
            int i = 0;
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                int i2 = i + 1;
                bArr[i] = (byte) ((-16777216 & intValue) >> 24);
                int i3 = i2 + 1;
                bArr[i2] = (byte) ((16711680 & intValue) >> 16);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((65280 & intValue) >> 8);
                i = i4 + 1;
                bArr[i4] = (byte) (intValue & 255);
            }
            return new String(Base64.encode(bArr, 0));
        }
        StringBuilder sb = new StringBuilder();
        for (Object next : this.f16527d) {
            if (sb.length() > 0) {
                sb.append(f16524b);
            }
            sb.append(next.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo18848a() {
        StringBuilder sb = new StringBuilder();
        for (Object append : this.f16527d) {
            sb.append(append);
            if (sb.length() > 0) {
                sb.append(",");
            }
        }
        System.out.println(sb.toString());
    }
}
