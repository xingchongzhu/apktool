package com.google.android.exoplayer2.p196ui;

/* renamed from: com.google.android.exoplayer2.ui.t */
final class SubtitleViewUtils {
    /* renamed from: a */
    public static float m14930a(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = (float) i3;
        } else if (i == 1) {
            f2 = (float) i2;
        } else if (i != 2) {
            return -3.4028235E38f;
        } else {
            return f;
        }
        return f * f2;
    }
}
