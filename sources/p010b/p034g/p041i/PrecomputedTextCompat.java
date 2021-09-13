package p010b.p034g.p041i;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.text.PrecomputedText;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText.Params.Builder;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p010b.p034g.p042j.ObjectsCompat;

/* renamed from: b.g.i.c */
public class PrecomputedTextCompat implements Spannable {

    /* renamed from: a */
    private static final Object f4561a = new Object();

    /* renamed from: b */
    private final Spannable f4562b;

    /* renamed from: c */
    private final C0602a f4563c;

    /* renamed from: d */
    private final PrecomputedText f4564d;

    /* renamed from: b.g.i.c$a */
    /* compiled from: PrecomputedTextCompat */
    public static final class C0602a {

        /* renamed from: a */
        private final TextPaint f4565a;

        /* renamed from: b */
        private final TextDirectionHeuristic f4566b;

        /* renamed from: c */
        private final int f4567c;

        /* renamed from: d */
        private final int f4568d;

        /* renamed from: e */
        final Params f4569e;

        /* renamed from: b.g.i.c$a$a */
        /* compiled from: PrecomputedTextCompat */
        public static class C0603a {

            /* renamed from: a */
            private final TextPaint f4570a;

            /* renamed from: b */
            private TextDirectionHeuristic f4571b;

            /* renamed from: c */
            private int f4572c;

            /* renamed from: d */
            private int f4573d;

            public C0603a(TextPaint textPaint) {
                this.f4570a = textPaint;
                int i = VERSION.SDK_INT;
                if (i >= 23) {
                    this.f4572c = 1;
                    this.f4573d = 1;
                } else {
                    this.f4573d = 0;
                    this.f4572c = 0;
                }
                if (i >= 18) {
                    this.f4571b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f4571b = null;
                }
            }

            /* renamed from: a */
            public C0602a mo4935a() {
                return new C0602a(this.f4570a, this.f4571b, this.f4572c, this.f4573d);
            }

            /* renamed from: b */
            public C0603a mo4936b(int i) {
                this.f4572c = i;
                return this;
            }

            /* renamed from: c */
            public C0603a mo4937c(int i) {
                this.f4573d = i;
                return this;
            }

            /* renamed from: d */
            public C0603a mo4938d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f4571b = textDirectionHeuristic;
                return this;
            }
        }

        @SuppressLint({"NewApi"})
        C0602a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (VERSION.SDK_INT >= 29) {
                this.f4569e = new Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f4569e = null;
            }
            this.f4565a = textPaint;
            this.f4566b = textDirectionHeuristic;
            this.f4567c = i;
            this.f4568d = i2;
        }

        /* renamed from: a */
        public boolean mo4927a(C0602a aVar) {
            int i = VERSION.SDK_INT;
            if ((i >= 23 && (this.f4567c != aVar.mo4928b() || this.f4568d != aVar.mo4929c())) || this.f4565a.getTextSize() != aVar.mo4931e().getTextSize() || this.f4565a.getTextScaleX() != aVar.mo4931e().getTextScaleX() || this.f4565a.getTextSkewX() != aVar.mo4931e().getTextSkewX()) {
                return false;
            }
            if ((i >= 21 && (this.f4565a.getLetterSpacing() != aVar.mo4931e().getLetterSpacing() || !TextUtils.equals(this.f4565a.getFontFeatureSettings(), aVar.mo4931e().getFontFeatureSettings()))) || this.f4565a.getFlags() != aVar.mo4931e().getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f4565a.getTextLocales().equals(aVar.mo4931e().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f4565a.getTextLocale().equals(aVar.mo4931e().getTextLocale())) {
                return false;
            }
            if (this.f4565a.getTypeface() == null) {
                if (aVar.mo4931e().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f4565a.getTypeface().equals(aVar.mo4931e().getTypeface())) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public int mo4928b() {
            return this.f4567c;
        }

        /* renamed from: c */
        public int mo4929c() {
            return this.f4568d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic mo4930d() {
            return this.f4566b;
        }

        /* renamed from: e */
        public TextPaint mo4931e() {
            return this.f4565a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0602a)) {
                return false;
            }
            C0602a aVar = (C0602a) obj;
            if (!mo4927a(aVar)) {
                return false;
            }
            return VERSION.SDK_INT < 18 || this.f4566b == aVar.mo4930d();
        }

        public int hashCode() {
            int i = VERSION.SDK_INT;
            if (i >= 24) {
                return ObjectsCompat.m5176b(Float.valueOf(this.f4565a.getTextSize()), Float.valueOf(this.f4565a.getTextScaleX()), Float.valueOf(this.f4565a.getTextSkewX()), Float.valueOf(this.f4565a.getLetterSpacing()), Integer.valueOf(this.f4565a.getFlags()), this.f4565a.getTextLocales(), this.f4565a.getTypeface(), Boolean.valueOf(this.f4565a.isElegantTextHeight()), this.f4566b, Integer.valueOf(this.f4567c), Integer.valueOf(this.f4568d));
            } else if (i >= 21) {
                return ObjectsCompat.m5176b(Float.valueOf(this.f4565a.getTextSize()), Float.valueOf(this.f4565a.getTextScaleX()), Float.valueOf(this.f4565a.getTextSkewX()), Float.valueOf(this.f4565a.getLetterSpacing()), Integer.valueOf(this.f4565a.getFlags()), this.f4565a.getTextLocale(), this.f4565a.getTypeface(), Boolean.valueOf(this.f4565a.isElegantTextHeight()), this.f4566b, Integer.valueOf(this.f4567c), Integer.valueOf(this.f4568d));
            } else if (i >= 18) {
                return ObjectsCompat.m5176b(Float.valueOf(this.f4565a.getTextSize()), Float.valueOf(this.f4565a.getTextScaleX()), Float.valueOf(this.f4565a.getTextSkewX()), Integer.valueOf(this.f4565a.getFlags()), this.f4565a.getTextLocale(), this.f4565a.getTypeface(), this.f4566b, Integer.valueOf(this.f4567c), Integer.valueOf(this.f4568d));
            } else if (i >= 17) {
                return ObjectsCompat.m5176b(Float.valueOf(this.f4565a.getTextSize()), Float.valueOf(this.f4565a.getTextScaleX()), Float.valueOf(this.f4565a.getTextSkewX()), Integer.valueOf(this.f4565a.getFlags()), this.f4565a.getTextLocale(), this.f4565a.getTypeface(), this.f4566b, Integer.valueOf(this.f4567c), Integer.valueOf(this.f4568d));
            } else {
                return ObjectsCompat.m5176b(Float.valueOf(this.f4565a.getTextSize()), Float.valueOf(this.f4565a.getTextScaleX()), Float.valueOf(this.f4565a.getTextSkewX()), Integer.valueOf(this.f4565a.getFlags()), this.f4565a.getTypeface(), this.f4566b, Integer.valueOf(this.f4567c), Integer.valueOf(this.f4568d));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("textSize=");
            sb2.append(this.f4565a.getTextSize());
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(", textScaleX=");
            sb3.append(this.f4565a.getTextScaleX());
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(", textSkewX=");
            sb4.append(this.f4565a.getTextSkewX());
            sb.append(sb4.toString());
            int i = VERSION.SDK_INT;
            if (i >= 21) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(", letterSpacing=");
                sb5.append(this.f4565a.getLetterSpacing());
                sb.append(sb5.toString());
                StringBuilder sb6 = new StringBuilder();
                sb6.append(", elegantTextHeight=");
                sb6.append(this.f4565a.isElegantTextHeight());
                sb.append(sb6.toString());
            }
            String str = ", textLocale=";
            if (i >= 24) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(this.f4565a.getTextLocales());
                sb.append(sb7.toString());
            } else if (i >= 17) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(this.f4565a.getTextLocale());
                sb.append(sb8.toString());
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append(", typeface=");
            sb9.append(this.f4565a.getTypeface());
            sb.append(sb9.toString());
            if (i >= 26) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(", variationSettings=");
                sb10.append(this.f4565a.getFontVariationSettings());
                sb.append(sb10.toString());
            }
            StringBuilder sb11 = new StringBuilder();
            sb11.append(", textDir=");
            sb11.append(this.f4566b);
            sb.append(sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append(", breakStrategy=");
            sb12.append(this.f4567c);
            sb.append(sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(", hyphenationFrequency=");
            sb13.append(this.f4568d);
            sb.append(sb13.toString());
            sb.append("}");
            return sb.toString();
        }

        public C0602a(Params params) {
            this.f4565a = params.getTextPaint();
            this.f4566b = params.getTextDirection();
            this.f4567c = params.getBreakStrategy();
            this.f4568d = params.getHyphenationFrequency();
            if (VERSION.SDK_INT < 29) {
                params = null;
            }
            this.f4569e = params;
        }
    }

    /* renamed from: a */
    public C0602a mo4914a() {
        return this.f4563c;
    }

    /* renamed from: b */
    public PrecomputedText mo4915b() {
        Spannable spannable = this.f4562b;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f4562b.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f4562b.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f4562b.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f4562b.getSpanStart(obj);
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (VERSION.SDK_INT >= 29) {
            return this.f4564d.getSpans(i, i2, cls);
        }
        return this.f4562b.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f4562b.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f4562b.nextSpanTransition(i, i2, cls);
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (VERSION.SDK_INT >= 29) {
            this.f4564d.removeSpan(obj);
        } else {
            this.f4562b.removeSpan(obj);
        }
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (VERSION.SDK_INT >= 29) {
            this.f4564d.setSpan(obj, i, i2, i3);
        } else {
            this.f4562b.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f4562b.subSequence(i, i2);
    }

    public String toString() {
        return this.f4562b.toString();
    }
}
