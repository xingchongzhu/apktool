package p067c.p068a.p069a.p070a.p100k2.p104q;

import android.text.Spannable;

/* renamed from: c.a.a.a.k2.q.c */
public final class SpanUtil {
    /* renamed from: a */
    public static void m9602a(Spannable spannable, Object obj, int i, int i2, int i3) {
        Object[] spans;
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == i3) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i2, i3);
    }
}
