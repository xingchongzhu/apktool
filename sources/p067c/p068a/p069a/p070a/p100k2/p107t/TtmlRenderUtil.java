package p067c.p068a.p069a.p070a.p100k2.p107t;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;
import p067c.p068a.p069a.p070a.p100k2.p104q.HorizontalTextInVerticalContextSpan;
import p067c.p068a.p069a.p070a.p100k2.p104q.RubySpan;
import p067c.p068a.p069a.p070a.p100k2.p104q.SpanUtil;
import p067c.p068a.p069a.p070a.p100k2.p104q.TextEmphasisSpan;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.t.f */
final class TtmlRenderUtil {
    /* renamed from: a */
    public static void m9675a(Spannable spannable, int i, int i2, TtmlStyle gVar, TtmlNode dVar, Map<String, TtmlStyle> map, int i3) {
        int i4;
        int i5 = -1;
        if (gVar.mo7138k() != -1) {
            spannable.setSpan(new StyleSpan(gVar.mo7138k()), i, i2, 33);
        }
        if (gVar.mo7144r()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (gVar.mo7145s()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (gVar.mo7143p()) {
            SpanUtil.m9602a(spannable, new ForegroundColorSpan(gVar.mo7130c()), i, i2, 33);
        }
        if (gVar.mo7142o()) {
            SpanUtil.m9602a(spannable, new BackgroundColorSpan(gVar.mo7129b()), i, i2, 33);
        }
        if (gVar.mo7131d() != null) {
            SpanUtil.m9602a(spannable, new TypefaceSpan(gVar.mo7131d()), i, i2, 33);
        }
        if (gVar.mo7141n() != null) {
            TextEmphasis bVar = (TextEmphasis) Assertions.m10153e(gVar.mo7141n());
            int i6 = bVar.f7980f;
            if (i6 == -1) {
                i6 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = bVar.f7981g;
            }
            int i7 = bVar.f7982h;
            if (i7 == -2) {
                i7 = 1;
            }
            SpanUtil.m9602a(spannable, new TextEmphasisSpan(i6, i4, i7), i, i2, 33);
        }
        int i8 = gVar.mo7136i();
        if (i8 == 2) {
            TtmlNode d = m9678d(dVar, map);
            if (d != null) {
                TtmlNode e = m9679e(d, map);
                if (e != null) {
                    if (e.mo7114g() != 1 || e.mo7113f(0).f8001b == null) {
                        Log.m10384f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                    } else {
                        String str = (String) Util.m10293i(e.mo7113f(0).f8001b);
                        TtmlStyle gVar2 = d.f8005f;
                        if (gVar2 != null) {
                            i5 = gVar2.mo7135h();
                        }
                        spannable.setSpan(new RubySpan(str, i5), i, i2, 33);
                    }
                }
            }
        } else if (i8 == 3 || i8 == 4) {
            spannable.setSpan(new DeleteTextSpan(), i, i2, 33);
        }
        if (gVar.mo7140m()) {
            SpanUtil.m9602a(spannable, new HorizontalTextInVerticalContextSpan(), i, i2, 33);
        }
        int f = gVar.mo7133f();
        if (f == 1) {
            SpanUtil.m9602a(spannable, new AbsoluteSizeSpan((int) gVar.mo7132e(), true), i, i2, 33);
        } else if (f == 2) {
            SpanUtil.m9602a(spannable, new RelativeSizeSpan(gVar.mo7132e()), i, i2, 33);
        } else if (f == 3) {
            SpanUtil.m9602a(spannable, new RelativeSizeSpan(gVar.mo7132e() / 100.0f), i, i2, 33);
        }
    }

    /* renamed from: b */
    static String m9676b(String str) {
        String str2 = "\n";
        String str3 = " ";
        return str.replaceAll("\r\n", str2).replaceAll(" *\n *", str2).replaceAll(str2, str3).replaceAll("[ \t\\x0B\f\r]+", str3);
    }

    /* renamed from: c */
    static void m9677c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != 10) {
            spannableStringBuilder.append(10);
        }
    }

    /* renamed from: d */
    private static TtmlNode m9678d(TtmlNode dVar, Map<String, TtmlStyle> map) {
        while (dVar != null) {
            TtmlStyle f = m9680f(dVar.f8005f, dVar.mo7117l(), map);
            if (f != null && f.mo7136i() == 1) {
                return dVar;
            }
            dVar = dVar.f8009j;
        }
        return null;
    }

    /* renamed from: e */
    private static TtmlNode m9679e(TtmlNode dVar, Map<String, TtmlStyle> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            TtmlNode dVar2 = (TtmlNode) arrayDeque.pop();
            TtmlStyle f = m9680f(dVar2.f8005f, dVar2.mo7117l(), map);
            if (f != null && f.mo7136i() == 3) {
                return dVar2;
            }
            for (int g = dVar2.mo7114g() - 1; g >= 0; g--) {
                arrayDeque.push(dVar2.mo7113f(g));
            }
        }
        return null;
    }

    /* renamed from: f */
    public static TtmlStyle m9680f(TtmlStyle gVar, String[] strArr, Map<String, TtmlStyle> map) {
        int i = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (TtmlStyle) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                TtmlStyle gVar2 = new TtmlStyle();
                int length = strArr.length;
                while (i < length) {
                    gVar2.mo7128a((TtmlStyle) map.get(strArr[i]));
                    i++;
                }
                return gVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            return gVar.mo7128a((TtmlStyle) map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    gVar.mo7128a((TtmlStyle) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return gVar;
    }
}
