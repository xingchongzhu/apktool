package com.bumptech.glide.load.data.p151o;

import android.net.Uri;

/* renamed from: com.bumptech.glide.load.data.o.b */
public final class MediaStoreUtil {
    /* renamed from: a */
    public static boolean m12568a(Uri uri) {
        return m12569b(uri) && !m12572e(uri);
    }

    /* renamed from: b */
    public static boolean m12569b(Uri uri) {
        if (uri != null) {
            if ("content".equals(uri.getScheme())) {
                if ("media".equals(uri.getAuthority())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m12570c(Uri uri) {
        return m12569b(uri) && m12572e(uri);
    }

    /* renamed from: d */
    public static boolean m12571d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: e */
    private static boolean m12572e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
