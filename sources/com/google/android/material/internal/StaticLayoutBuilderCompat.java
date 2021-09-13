package com.google.android.material.internal;

import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import java.lang.reflect.Constructor;
import p010b.p034g.p042j.Preconditions;

/* renamed from: com.google.android.material.internal.g */
final class StaticLayoutBuilderCompat {

    /* renamed from: a */
    private static boolean f13178a;

    /* renamed from: b */
    private static Constructor<StaticLayout> f13179b;

    /* renamed from: c */
    private static Object f13180c;

    /* renamed from: d */
    private CharSequence f13181d;

    /* renamed from: e */
    private final TextPaint f13182e;

    /* renamed from: f */
    private final int f13183f;

    /* renamed from: g */
    private int f13184g = 0;

    /* renamed from: h */
    private int f13185h;

    /* renamed from: i */
    private Alignment f13186i;

    /* renamed from: j */
    private int f13187j;

    /* renamed from: k */
    private boolean f13188k;

    /* renamed from: l */
    private boolean f13189l;

    /* renamed from: m */
    private TruncateAt f13190m;

    /* renamed from: com.google.android.material.internal.g$a */
    /* compiled from: StaticLayoutBuilderCompat */
    static class C2050a extends Exception {
        C2050a(Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error thrown initializing StaticLayout ");
            sb.append(th.getMessage());
            super(sb.toString(), th);
        }
    }

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f13181d = charSequence;
        this.f13182e = textPaint;
        this.f13183f = i;
        this.f13185h = charSequence.length();
        this.f13186i = Alignment.ALIGN_NORMAL;
        this.f13187j = Integer.MAX_VALUE;
        this.f13188k = true;
        this.f13190m = null;
    }

    /* renamed from: b */
    private void m16200b() throws C2050a {
        Class cls;
        if (!f13178a) {
            try {
                boolean z = this.f13189l && VERSION.SDK_INT >= 23;
                if (VERSION.SDK_INT >= 18) {
                    cls = TextDirectionHeuristic.class;
                    f13180c = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                } else {
                    ClassLoader classLoader = StaticLayoutBuilderCompat.class.getClassLoader();
                    String str = this.f13189l ? "RTL" : "LTR";
                    Class loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                    Class loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                    f13180c = loadClass2.getField(str).get(loadClass2);
                    cls = loadClass;
                }
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Alignment.class, cls, cls3, cls3, Boolean.TYPE, TruncateAt.class, cls2, cls2});
                f13179b = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f13178a = true;
            } catch (Exception e) {
                throw new C2050a(e);
            }
        }
    }

    /* renamed from: c */
    public static StaticLayoutBuilderCompat m16201c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout mo15996a() throws C2050a {
        if (this.f13181d == null) {
            this.f13181d = "";
        }
        int max = Math.max(0, this.f13183f);
        CharSequence charSequence = this.f13181d;
        if (this.f13187j == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f13182e, (float) max, this.f13190m);
        }
        int min = Math.min(charSequence.length(), this.f13185h);
        this.f13185h = min;
        if (VERSION.SDK_INT >= 23) {
            if (this.f13189l) {
                this.f13186i = Alignment.ALIGN_OPPOSITE;
            }
            Builder obtain = Builder.obtain(charSequence, this.f13184g, min, this.f13182e, max);
            obtain.setAlignment(this.f13186i);
            obtain.setIncludePad(this.f13188k);
            obtain.setTextDirection(this.f13189l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TruncateAt truncateAt = this.f13190m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f13187j);
            return obtain.build();
        }
        m16200b();
        try {
            return (StaticLayout) ((Constructor) Preconditions.m5188e(f13179b)).newInstance(new Object[]{charSequence, Integer.valueOf(this.f13184g), Integer.valueOf(this.f13185h), this.f13182e, Integer.valueOf(max), this.f13186i, Preconditions.m5188e(f13180c), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f13188k), null, Integer.valueOf(max), Integer.valueOf(this.f13187j)});
        } catch (Exception e) {
            throw new C2050a(e);
        }
    }

    /* renamed from: d */
    public StaticLayoutBuilderCompat mo15997d(Alignment alignment) {
        this.f13186i = alignment;
        return this;
    }

    /* renamed from: e */
    public StaticLayoutBuilderCompat mo15998e(TruncateAt truncateAt) {
        this.f13190m = truncateAt;
        return this;
    }

    /* renamed from: f */
    public StaticLayoutBuilderCompat mo15999f(boolean z) {
        this.f13188k = z;
        return this;
    }

    /* renamed from: g */
    public StaticLayoutBuilderCompat mo16000g(boolean z) {
        this.f13189l = z;
        return this;
    }

    /* renamed from: h */
    public StaticLayoutBuilderCompat mo16001h(int i) {
        this.f13187j = i;
        return this;
    }
}
