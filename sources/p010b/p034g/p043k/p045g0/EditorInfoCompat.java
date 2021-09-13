package p010b.p034g.p043k.p045g0;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import p010b.p034g.p042j.Preconditions;

/* renamed from: b.g.k.g0.a */
public final class EditorInfoCompat {

    /* renamed from: a */
    private static final String[] f4717a = new String[0];

    /* renamed from: b.g.k.g0.a$a */
    /* compiled from: EditorInfoCompat */
    private static class C0648a {
        /* renamed from: a */
        static void m5438a(EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    /* renamed from: a */
    public static String[] m5430a(EditorInfo editorInfo) {
        if (VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            if (strArr == null) {
                strArr = f4717a;
            }
            return strArr;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f4717a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        if (stringArray == null) {
            stringArray = f4717a;
        }
        return stringArray;
    }

    /* renamed from: b */
    private static boolean m5431b(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    /* renamed from: c */
    private static boolean m5432c(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    /* renamed from: d */
    public static void m5433d(EditorInfo editorInfo, String[] strArr) {
        if (VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* renamed from: e */
    public static void m5434e(EditorInfo editorInfo, CharSequence charSequence, int i) {
        Preconditions.m5188e(charSequence);
        if (VERSION.SDK_INT >= 30) {
            C0648a.m5438a(editorInfo, charSequence, i);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 - i : i2 - i;
        int i5 = i2 > i3 ? i2 - i : i3 - i;
        int length = charSequence.length();
        if (i < 0 || i4 < 0 || i5 > length) {
            m5436g(editorInfo, null, 0, 0);
        } else if (m5432c(editorInfo.inputType)) {
            m5436g(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            m5436g(editorInfo, charSequence, i4, i5);
        } else {
            m5437h(editorInfo, charSequence, i4, i5);
        }
    }

    /* renamed from: f */
    public static void m5435f(EditorInfo editorInfo, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 30) {
            C0648a.m5438a(editorInfo, charSequence, 0);
        } else {
            m5434e(editorInfo, charSequence, 0);
        }
    }

    /* renamed from: g */
    private static void m5436g(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* renamed from: h */
    private static void m5437h(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        CharSequence charSequence2;
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int length = charSequence.length() - i2;
        int i5 = 2048 - i4;
        double d = (double) i5;
        Double.isNaN(d);
        int min = Math.min(length, i5 - Math.min(i, (int) (d * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        if (m5431b(charSequence, i6, 0)) {
            i6++;
            min2--;
        }
        if (m5431b(charSequence, (i2 + min) - 1, 1)) {
            min--;
        }
        int i7 = min2 + i4 + min;
        if (i4 != i3) {
            charSequence2 = TextUtils.concat(new CharSequence[]{charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2)});
        } else {
            charSequence2 = charSequence.subSequence(i6, i7 + i6);
        }
        int i8 = min2 + 0;
        m5436g(editorInfo, charSequence2, i8, i4 + i8);
    }
}
