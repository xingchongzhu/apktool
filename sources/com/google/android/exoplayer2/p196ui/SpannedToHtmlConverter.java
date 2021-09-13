package com.google.android.exoplayer2.p196ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.efs.sdk.base.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p067c.p068a.p069a.p070a.p100k2.p104q.HorizontalTextInVerticalContextSpan;
import p067c.p068a.p069a.p070a.p100k2.p104q.RubySpan;
import p067c.p068a.p069a.p070a.p100k2.p104q.TextEmphasisSpan;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p136b.ImmutableMap;

/* renamed from: com.google.android.exoplayer2.ui.r */
final class SpannedToHtmlConverter {

    /* renamed from: a */
    private static final Pattern f12125a = Pattern.compile("(&#13;)?&#10;");

    /* renamed from: com.google.android.exoplayer2.ui.r$b */
    /* compiled from: SpannedToHtmlConverter */
    public static class C1881b {

        /* renamed from: a */
        public final String f12126a;

        /* renamed from: b */
        public final Map<String, String> f12127b;

        private C1881b(String str, Map<String, String> map) {
            this.f12126a = str;
            this.f12127b = map;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.r$c */
    /* compiled from: SpannedToHtmlConverter */
    private static final class C1882c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final Comparator<C1882c> f12128a = C1867e.f12009a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public static final Comparator<C1882c> f12129b = C1868f.f12010a;

        /* renamed from: c */
        public final int f12130c;

        /* renamed from: d */
        public final int f12131d;

        /* renamed from: e */
        public final String f12132e;

        /* renamed from: f */
        public final String f12133f;

        /* renamed from: c */
        static /* synthetic */ int m14919c(C1882c cVar, C1882c cVar2) {
            int compare = Integer.compare(cVar2.f12131d, cVar.f12131d);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar.f12132e.compareTo(cVar2.f12132e);
            if (compareTo != 0) {
                return compareTo;
            }
            return cVar.f12133f.compareTo(cVar2.f12133f);
        }

        /* renamed from: d */
        static /* synthetic */ int m14920d(C1882c cVar, C1882c cVar2) {
            int compare = Integer.compare(cVar2.f12130c, cVar.f12130c);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar2.f12132e.compareTo(cVar.f12132e);
            if (compareTo != 0) {
                return compareTo;
            }
            return cVar2.f12133f.compareTo(cVar.f12133f);
        }

        private C1882c(int i, int i2, String str, String str2) {
            this.f12130c = i;
            this.f12131d = i2;
            this.f12132e = str;
            this.f12133f = str2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.r$d */
    /* compiled from: SpannedToHtmlConverter */
    private static final class C1883d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<C1882c> f12134a = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final List<C1882c> f12135b = new ArrayList();
    }

    /* renamed from: a */
    public static C1881b m14909a(CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new C1881b("", ImmutableMap.m11963j());
        } else if (!(charSequence instanceof Spanned)) {
            return new C1881b(m14910b(charSequence), ImmutableMap.m11963j());
        } else {
            Spanned spanned = (Spanned) charSequence;
            HashSet<Integer> hashSet = new HashSet<>();
            int i = 0;
            for (BackgroundColorSpan backgroundColor : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
                hashSet.add(Integer.valueOf(backgroundColor.getBackgroundColor()));
            }
            HashMap hashMap = new HashMap();
            for (Integer intValue : hashSet) {
                int intValue2 = intValue.intValue();
                StringBuilder sb = new StringBuilder();
                sb.append("bg_");
                sb.append(intValue2);
                hashMap.put(HtmlUtils.m14831a(sb.toString()), Util.m10237A("background-color:%s;", HtmlUtils.m14832b(intValue2)));
            }
            SparseArray c = m14911c(spanned, f);
            StringBuilder sb2 = new StringBuilder(spanned.length());
            int i2 = 0;
            while (i < c.size()) {
                int keyAt = c.keyAt(i);
                sb2.append(m14910b(spanned.subSequence(i2, keyAt)));
                C1883d dVar = (C1883d) c.get(keyAt);
                Collections.sort(dVar.f12135b, C1882c.f12129b);
                for (C1882c cVar : dVar.f12135b) {
                    sb2.append(cVar.f12133f);
                }
                Collections.sort(dVar.f12134a, C1882c.f12128a);
                for (C1882c cVar2 : dVar.f12134a) {
                    sb2.append(cVar2.f12132e);
                }
                i++;
                i2 = keyAt;
            }
            sb2.append(m14910b(spanned.subSequence(i2, spanned.length())));
            return new C1881b(sb2.toString(), hashMap);
        }
    }

    /* renamed from: b */
    private static String m14910b(CharSequence charSequence) {
        return f12125a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    /* renamed from: c */
    private static SparseArray<C1883d> m14911c(Spanned spanned, float f) {
        Object[] spans;
        SparseArray<C1883d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String e = m14913e(obj, f);
            String d = m14912d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (e != null) {
                Assertions.m10153e(d);
                C1882c cVar = new C1882c(spanStart, spanEnd, e, d);
                m14914f(sparseArray, spanStart).f12134a.add(cVar);
                m14914f(sparseArray, spanEnd).f12135b.add(cVar);
            }
        }
        return sparseArray;
    }

    /* renamed from: d */
    private static String m14912d(Object obj) {
        String str = "</span>";
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof HorizontalTextInVerticalContextSpan) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof TextEmphasisSpan)) {
            return str;
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() == null) {
                str = null;
            }
            return str;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else if (obj instanceof RubySpan) {
            RubySpan bVar = (RubySpan) obj;
            StringBuilder sb = new StringBuilder();
            sb.append("<rt>");
            sb.append(m14910b(bVar.f7932a));
            sb.append("</rt></ruby>");
            return sb.toString();
        } else if (obj instanceof UnderlineSpan) {
            return "</u>";
        }
        return null;
    }

    /* renamed from: e */
    private static String m14913e(Object obj, float f) {
        float f2;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return Util.m10237A("<span style='color:%s;'>", HtmlUtils.m14832b(((ForegroundColorSpan) obj).getForegroundColor()));
        } else if (obj instanceof BackgroundColorSpan) {
            return Util.m10237A("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        } else if (obj instanceof HorizontalTextInVerticalContextSpan) {
            return "<span style='text-combine-upright:all;'>";
        } else {
            if (obj instanceof AbsoluteSizeSpan) {
                AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
                if (absoluteSizeSpan.getDip()) {
                    f2 = (float) absoluteSizeSpan.getSize();
                } else {
                    f2 = ((float) absoluteSizeSpan.getSize()) / f;
                }
                return Util.m10237A("<span style='font-size:%.2fpx;'>", Float.valueOf(f2));
            } else if (obj instanceof RelativeSizeSpan) {
                return Util.m10237A("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
            } else {
                String str = null;
                if (obj instanceof TypefaceSpan) {
                    String family = ((TypefaceSpan) obj).getFamily();
                    if (family != null) {
                        str = Util.m10237A("<span style='font-family:\"%s\";'>", family);
                    }
                    return str;
                } else if (obj instanceof StyleSpan) {
                    int style = ((StyleSpan) obj).getStyle();
                    if (style == 1) {
                        return "<b>";
                    }
                    if (style == 2) {
                        return "<i>";
                    }
                    if (style != 3) {
                        return null;
                    }
                    return "<b><i>";
                } else if (obj instanceof RubySpan) {
                    int i = ((RubySpan) obj).f7933b;
                    if (i == -1) {
                        return "<ruby style='ruby-position:unset;'>";
                    }
                    if (i == 1) {
                        return "<ruby style='ruby-position:over;'>";
                    }
                    if (i != 2) {
                        return null;
                    }
                    return "<ruby style='ruby-position:under;'>";
                } else if (obj instanceof UnderlineSpan) {
                    return "<u>";
                } else {
                    if (!(obj instanceof TextEmphasisSpan)) {
                        return null;
                    }
                    TextEmphasisSpan dVar = (TextEmphasisSpan) obj;
                    return Util.m10237A("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", m14916h(dVar.f7934a, dVar.f7935b), m14915g(dVar.f7936c));
                }
            }
        }
    }

    /* renamed from: f */
    private static C1883d m14914f(SparseArray<C1883d> sparseArray, int i) {
        C1883d dVar = (C1883d) sparseArray.get(i);
        if (dVar != null) {
            return dVar;
        }
        C1883d dVar2 = new C1883d();
        sparseArray.put(i, dVar2);
        return dVar2;
    }

    /* renamed from: g */
    private static String m14915g(int i) {
        return i != 2 ? "over right" : "under left";
    }

    /* renamed from: h */
    private static String m14916h(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        if (i2 == 1) {
            sb.append("filled ");
        } else if (i2 == 2) {
            sb.append("open ");
        }
        if (i == 0) {
            sb.append(Constants.CP_NONE);
        } else if (i == 1) {
            sb.append("circle");
        } else if (i == 2) {
            sb.append("dot");
        } else if (i != 3) {
            sb.append("unset");
        } else {
            sb.append("sesame");
        }
        return sb.toString();
    }
}
