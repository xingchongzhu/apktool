package com.google.android.exoplayer2.p196ui;

import android.content.Context;
import android.text.Layout.Alignment;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.p100k2.CaptionStyleCompat;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.ui.w */
final class WebViewSubtitleOutput extends FrameLayout implements C1858a {

    /* renamed from: a */
    private final CanvasSubtitleOutput f12172a;

    /* renamed from: b */
    private final WebView f12173b;

    /* renamed from: c */
    private List<Cue> f12174c;

    /* renamed from: d */
    private CaptionStyleCompat f12175d;

    /* renamed from: e */
    private float f12176e;

    /* renamed from: f */
    private int f12177f;

    /* renamed from: g */
    private float f12178g;

    /* renamed from: com.google.android.exoplayer2.ui.w$a */
    /* compiled from: WebViewSubtitleOutput */
    class C1885a extends WebView {
        C1885a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.w$b */
    /* compiled from: WebViewSubtitleOutput */
    static /* synthetic */ class C1886b {

        /* renamed from: a */
        static final /* synthetic */ int[] f12180a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12180a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12180a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12180a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p196ui.WebViewSubtitleOutput.C1886b.<clinit>():void");
        }
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private static int m14937b(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    /* renamed from: c */
    private static String m14938c(Alignment alignment) {
        String str = "center";
        if (alignment == null) {
            return str;
        }
        int i = C1886b.f12180a[alignment.ordinal()];
        if (i != 1) {
            return i != 2 ? str : "end";
        }
        return "start";
    }

    /* renamed from: d */
    private static String m14939d(CaptionStyleCompat bVar) {
        int i = bVar.f7704e;
        if (i == 1) {
            return Util.m10237A("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", HtmlUtils.m14832b(bVar.f7705f));
        } else if (i == 2) {
            return Util.m10237A("0.1em 0.12em 0.15em %s", HtmlUtils.m14832b(bVar.f7705f));
        } else if (i == 3) {
            return Util.m10237A("0.06em 0.08em 0.15em %s", HtmlUtils.m14832b(bVar.f7705f));
        } else if (i != 4) {
            return "unset";
        } else {
            return Util.m10237A("-0.05em -0.05em 0.15em %s", HtmlUtils.m14832b(bVar.f7705f));
        }
    }

    /* renamed from: e */
    private String m14940e(int i, float f) {
        float a = SubtitleViewUtils.m14930a(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (a == -3.4028235E38f) {
            return "unset";
        }
        return Util.m10237A("%.2fpx", Float.valueOf(a / getContext().getResources().getDisplayMetrics().density));
    }

    /* renamed from: f */
    private static String m14941f(int i) {
        return i != 1 ? i != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    /* renamed from: h */
    private static String m14942h(Cue cVar) {
        float f = cVar.f7723q;
        if (f == 0.0f) {
            return "";
        }
        int i = cVar.f7722p;
        return Util.m10237A("%s(%.2fdeg)", (i == 2 || i == 1) ? "skewY" : "skewX", Float.valueOf(f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0148, code lost:
        if (r13 != false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014b, code lost:
        if (r13 != false) goto L_0x014d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0187  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14943i() {
        /*
            r25 = this;
            r0 = r25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            c.a.a.a.k2.b r4 = r0.f12175d
            int r4 = r4.f7701b
            java.lang.String r4 = com.google.android.exoplayer2.p196ui.HtmlUtils.m14832b(r4)
            r5 = 0
            r3[r5] = r4
            int r4 = r0.f12177f
            float r6 = r0.f12176e
            java.lang.String r4 = r0.m14940e(r4, r6)
            r6 = 1
            r3[r6] = r4
            r4 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r7 = java.lang.Float.valueOf(r4)
            r8 = 2
            r3[r8] = r7
            c.a.a.a.k2.b r7 = r0.f12175d
            java.lang.String r7 = m14939d(r7)
            r9 = 3
            r3[r9] = r7
            java.lang.String r7 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2fem;text-shadow:%s;'>"
            java.lang.String r3 = p067c.p068a.p069a.p070a.p111m2.Util.m10237A(r7, r3)
            r1.append(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r7 = "default_bg"
            java.lang.String r10 = com.google.android.exoplayer2.p196ui.HtmlUtils.m14831a(r7)
            java.lang.Object[] r11 = new java.lang.Object[r6]
            c.a.a.a.k2.b r12 = r0.f12175d
            int r12 = r12.f7702c
            java.lang.String r12 = com.google.android.exoplayer2.p196ui.HtmlUtils.m14832b(r12)
            r11[r5] = r12
            java.lang.String r12 = "background-color:%s;"
            java.lang.String r11 = p067c.p068a.p069a.p070a.p111m2.Util.m10237A(r12, r11)
            r3.put(r10, r11)
            r10 = 0
        L_0x005d:
            java.util.List<c.a.a.a.k2.c> r11 = r0.f12174c
            int r11 = r11.size()
            if (r10 >= r11) goto L_0x022f
            java.util.List<c.a.a.a.k2.c> r11 = r0.f12174c
            java.lang.Object r11 = r11.get(r10)
            c.a.a.a.k2.c r11 = (p067c.p068a.p069a.p070a.p100k2.Cue) r11
            float r12 = r11.f7714h
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r14 = 1120403456(0x42c80000, float:100.0)
            int r15 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x007b
            float r12 = r12 * r14
            goto L_0x007d
        L_0x007b:
            r12 = 1112014848(0x42480000, float:50.0)
        L_0x007d:
            int r15 = r11.f7715i
            int r15 = m14937b(r15)
            float r2 = r11.f7711e
            r16 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r9 = "%.2f%%"
            int r17 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r17 == 0) goto L_0x00dd
            int r8 = r11.f7712f
            if (r8 == r6) goto L_0x00b2
            java.lang.Object[] r8 = new java.lang.Object[r6]
            float r2 = r2 * r14
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r8[r5] = r2
            java.lang.String r2 = p067c.p068a.p069a.p070a.p111m2.Util.m10237A(r9, r8)
            int r8 = r11.f7722p
            if (r8 != r6) goto L_0x00ab
            int r8 = r11.f7713g
            int r8 = m14937b(r8)
            int r8 = -r8
            goto L_0x00f1
        L_0x00ab:
            int r8 = r11.f7713g
            int r8 = m14937b(r8)
            goto L_0x00f1
        L_0x00b2:
            r8 = 0
            java.lang.String r13 = "%.2fem"
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 < 0) goto L_0x00c9
            java.lang.Object[] r8 = new java.lang.Object[r6]
            float r2 = r2 * r4
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r8[r5] = r2
            java.lang.String r2 = p067c.p068a.p069a.p070a.p111m2.Util.m10237A(r13, r8)
            r8 = 0
            goto L_0x00f1
        L_0x00c9:
            java.lang.Object[] r8 = new java.lang.Object[r6]
            float r2 = -r2
            float r2 = r2 - r16
            float r2 = r2 * r4
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r8[r5] = r2
            java.lang.String r2 = p067c.p068a.p069a.p070a.p111m2.Util.m10237A(r13, r8)
            r8 = 0
            r13 = 1
            goto L_0x00f2
        L_0x00dd:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            float r8 = r0.f12178g
            float r16 = r16 - r8
            float r16 = r16 * r14
            java.lang.Float r8 = java.lang.Float.valueOf(r16)
            r2[r5] = r8
            java.lang.String r2 = p067c.p068a.p069a.p070a.p111m2.Util.m10237A(r9, r2)
            r8 = -100
        L_0x00f1:
            r13 = 0
        L_0x00f2:
            float r4 = r11.f7716j
            r18 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r18 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r18 == 0) goto L_0x010b
            java.lang.Object[] r5 = new java.lang.Object[r6]
            float r4 = r4 * r14
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r14 = 0
            r5[r14] = r4
            java.lang.String r4 = p067c.p068a.p069a.p070a.p111m2.Util.m10237A(r9, r5)
            goto L_0x010d
        L_0x010b:
            java.lang.String r4 = "fit-content"
        L_0x010d:
            android.text.Layout$Alignment r5 = r11.f7709c
            java.lang.String r5 = m14938c(r5)
            int r9 = r11.f7722p
            java.lang.String r9 = m14941f(r9)
            int r14 = r11.f7720n
            float r6 = r11.f7721o
            java.lang.String r6 = r0.m14940e(r14, r6)
            boolean r14 = r11.f7718l
            if (r14 == 0) goto L_0x0128
            int r14 = r11.f7719m
            goto L_0x012c
        L_0x0128:
            c.a.a.a.k2.b r14 = r0.f12175d
            int r14 = r14.f7703d
        L_0x012c:
            java.lang.String r14 = com.google.android.exoplayer2.p196ui.HtmlUtils.m14832b(r14)
            r19 = r8
            int r8 = r11.f7722p
            java.lang.String r20 = "right"
            java.lang.String r21 = "left"
            java.lang.String r22 = "top"
            r23 = r15
            r15 = 1
            if (r8 == r15) goto L_0x014b
            r15 = 2
            if (r8 == r15) goto L_0x0148
            if (r13 == 0) goto L_0x0146
            java.lang.String r22 = "bottom"
        L_0x0146:
            r13 = 2
            goto L_0x0154
        L_0x0148:
            if (r13 == 0) goto L_0x014d
            goto L_0x014f
        L_0x014b:
            if (r13 == 0) goto L_0x014f
        L_0x014d:
            r20 = r21
        L_0x014f:
            r21 = r22
            r13 = 2
            r22 = r20
        L_0x0154:
            if (r8 == r13) goto L_0x015f
            r13 = 1
            if (r8 != r13) goto L_0x015a
            goto L_0x015f
        L_0x015a:
            java.lang.String r8 = "width"
            r15 = r23
            goto L_0x0165
        L_0x015f:
            java.lang.String r8 = "height"
            r15 = r19
            r19 = r23
        L_0x0165:
            java.lang.CharSequence r13 = r11.f7708b
            android.content.Context r20 = r25.getContext()
            android.content.res.Resources r20 = r20.getResources()
            android.util.DisplayMetrics r0 = r20.getDisplayMetrics()
            float r0 = r0.density
            com.google.android.exoplayer2.ui.r$b r0 = com.google.android.exoplayer2.p196ui.SpannedToHtmlConverter.m14909a(r13, r0)
            java.util.Set r13 = r3.keySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x0181:
            boolean r20 = r13.hasNext()
            if (r20 == 0) goto L_0x01b9
            java.lang.Object r20 = r13.next()
            r23 = r13
            r13 = r20
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r20 = r3.get(r13)
            r24 = r10
            r10 = r20
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r3.put(r13, r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x01b0
            java.lang.Object r13 = r3.get(r13)
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x01ae
            goto L_0x01b0
        L_0x01ae:
            r10 = 0
            goto L_0x01b1
        L_0x01b0:
            r10 = 1
        L_0x01b1:
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10154f(r10)
            r13 = r23
            r10 = r24
            goto L_0x0181
        L_0x01b9:
            r24 = r10
            r10 = 13
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r13 = 0
            r10[r13] = r21
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r13 = 1
            r10[r13] = r12
            r12 = 2
            r10[r12] = r22
            r13 = 3
            r10[r13] = r2
            r2 = 4
            r10[r2] = r8
            r8 = 5
            r10[r8] = r4
            r4 = 6
            r10[r4] = r5
            r4 = 7
            r10[r4] = r9
            r4 = 8
            r10[r4] = r6
            r4 = 9
            r10[r4] = r14
            r4 = 10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r10[r4] = r5
            r4 = 11
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)
            r10[r4] = r5
            r4 = 12
            java.lang.String r5 = m14942h(r11)
            r10[r4] = r5
            java.lang.String r4 = "<div style='position:absolute;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>"
            java.lang.String r4 = p067c.p068a.p069a.p070a.p111m2.Util.m10237A(r4, r10)
            r1.append(r4)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r4 = 0
            r5[r4] = r7
            java.lang.String r4 = "<span class='%s'>"
            java.lang.String r4 = p067c.p068a.p069a.p070a.p111m2.Util.m10237A(r4, r5)
            r1.append(r4)
            java.lang.String r0 = r0.f12126a
            r1.append(r0)
            java.lang.String r0 = "</span>"
            r1.append(r0)
            java.lang.String r0 = "</div>"
            r1.append(r0)
            int r10 = r24 + 1
            r4 = 1067030938(0x3f99999a, float:1.2)
            r5 = 0
            r8 = 2
            r9 = 3
            r0 = r25
            r6 = 1
            goto L_0x005d
        L_0x022f:
            java.lang.String r0 = "</div></body></html>"
            r1.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "<html><head><style>"
            r0.append(r2)
            java.util.Set r2 = r3.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0246:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0269
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r5 = "{"
            r0.append(r5)
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r4 = "}"
            r0.append(r4)
            goto L_0x0246
        L_0x0269:
            java.lang.String r2 = "</style></head>"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            r1.insert(r2, r0)
            r0 = r25
            android.webkit.WebView r2 = r0.f12173b
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r3 = p067c.p068a.p134b.p135a.Charsets.f9743c
            byte[] r1 = r1.getBytes(r3)
            r3 = 1
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "base64"
            r2.loadData(r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p196ui.WebViewSubtitleOutput.m14943i():void");
    }

    /* renamed from: a */
    public void mo14798a(List<Cue> list, CaptionStyleCompat bVar, float f, int i, float f2) {
        this.f12175d = bVar;
        this.f12176e = f;
        this.f12177f = i;
        this.f12178g = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Cue cVar = (Cue) list.get(i2);
            if (cVar.f7710d != null) {
                arrayList.add(cVar);
            } else {
                arrayList2.add(cVar);
            }
        }
        if (!this.f12174c.isEmpty() || !arrayList2.isEmpty()) {
            this.f12174c = arrayList2;
            m14943i();
        }
        this.f12172a.mo14798a(arrayList, bVar, f, i, f2);
        invalidate();
    }

    /* renamed from: g */
    public void mo14853g() {
        this.f12173b.destroy();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.f12174c.isEmpty()) {
            m14943i();
        }
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12174c = Collections.emptyList();
        this.f12175d = CaptionStyleCompat.f7700a;
        this.f12176e = 0.0533f;
        this.f12177f = 0;
        this.f12178g = 0.08f;
        CanvasSubtitleOutput gVar = new CanvasSubtitleOutput(context, attributeSet);
        this.f12172a = gVar;
        C1885a aVar = new C1885a(context, attributeSet);
        this.f12173b = aVar;
        aVar.setBackgroundColor(0);
        addView(gVar);
        addView(aVar);
    }
}
