package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.p259uc.crashsdk.export.LogType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p010b.p011a.C0511j;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: androidx.appcompat.widget.b0 */
class AppCompatTextViewAutoSizeHelper {

    /* renamed from: a */
    private static final RectF f942a = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: b */
    private static ConcurrentHashMap<String, Method> f943b = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: c */
    private static ConcurrentHashMap<String, Field> f944c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private int f945d = 0;

    /* renamed from: e */
    private boolean f946e = false;

    /* renamed from: f */
    private float f947f = -1.0f;

    /* renamed from: g */
    private float f948g = -1.0f;

    /* renamed from: h */
    private float f949h = -1.0f;

    /* renamed from: i */
    private int[] f950i = new int[0];

    /* renamed from: j */
    private boolean f951j = false;

    /* renamed from: k */
    private TextPaint f952k;

    /* renamed from: l */
    private final TextView f953l;

    /* renamed from: m */
    private final Context f954m;

    /* renamed from: n */
    private final C0159c f955n;

    /* renamed from: androidx.appcompat.widget.b0$a */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class C0157a extends C0159c {
        C0157a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1356a(Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) AppCompatTextViewAutoSizeHelper.m1004r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.b0$b */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class C0158b extends C0157a {
        C0158b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1356a(Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo1357b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: androidx.appcompat.widget.b0$c */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class C0159c {
        C0159c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1356a(Builder builder, TextView textView) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo1357b(TextView textView) {
            return ((Boolean) AppCompatTextViewAutoSizeHelper.m1004r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    AppCompatTextViewAutoSizeHelper(TextView textView) {
        this.f953l = textView;
        this.f954m = textView.getContext();
        int i = VERSION.SDK_INT;
        if (i >= 29) {
            this.f955n = new C0158b();
        } else if (i >= 23) {
            this.f955n = new C0157a();
        } else {
            this.f955n = new C0159c();
        }
    }

    /* renamed from: A */
    private void m990A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f950i = m996c(iArr);
            m991B();
        }
    }

    /* renamed from: B */
    private boolean m991B() {
        int[] iArr = this.f950i;
        int length = iArr.length;
        boolean z = length > 0;
        this.f951j = z;
        if (z) {
            this.f945d = 1;
            this.f948g = (float) iArr[0];
            this.f949h = (float) iArr[length - 1];
            this.f947f = -1.0f;
        }
        return z;
    }

    /* renamed from: C */
    private boolean m992C(int i, RectF rectF) {
        CharSequence text = this.f953l.getText();
        TransformationMethod transformationMethod = this.f953l.getTransformationMethod();
        if (transformationMethod != null) {
            CharSequence transformation = transformationMethod.getTransformation(text, this.f953l);
            if (transformation != null) {
                text = transformation;
            }
        }
        int maxLines = VERSION.SDK_INT >= 16 ? this.f953l.getMaxLines() : -1;
        mo1349q(i);
        StaticLayout e = mo1343e(text, (Alignment) m1004r(this.f953l, "getLayoutAlignment", Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e.getLineCount() <= maxLines && e.getLineEnd(e.getLineCount() - 1) == text.length())) && ((float) e.getHeight()) <= rectF.bottom;
    }

    /* renamed from: D */
    private boolean m993D() {
        return !(this.f953l instanceof AppCompatEditText);
    }

    /* renamed from: E */
    private void m994E(float f, float f2, float f3) throws IllegalArgumentException {
        String str = "px) is less or equal to (0px)";
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum auto-size text size (");
            sb.append(f);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > 0.0f) {
            this.f945d = 1;
            this.f948g = f;
            this.f949h = f2;
            this.f947f = f3;
            this.f951j = false;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append(str);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: a */
    private static <T> T m995a(Object obj, String str, T t) {
        try {
            Field o = m1002o(str);
            if (o == null) {
                return t;
            }
            return o.get(obj);
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return t;
        }
    }

    /* renamed from: c */
    private int[] m996c(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    private void m997d() {
        this.f945d = 0;
        this.f948g = -1.0f;
        this.f949h = -1.0f;
        this.f947f = -1.0f;
        this.f950i = new int[0];
        this.f946e = false;
    }

    /* renamed from: f */
    private StaticLayout m998f(CharSequence charSequence, Alignment alignment, int i, int i2) {
        Builder obtain = Builder.obtain(charSequence, 0, charSequence.length(), this.f952k, i);
        Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f953l.getLineSpacingExtra(), this.f953l.getLineSpacingMultiplier()).setIncludePad(this.f953l.getIncludeFontPadding()).setBreakStrategy(this.f953l.getBreakStrategy()).setHyphenationFrequency(this.f953l.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            this.f955n.mo1356a(obtain, this.f953l);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: g */
    private StaticLayout m999g(CharSequence charSequence, Alignment alignment, int i) {
        float floatValue = ((Float) m995a(this.f953l, "mSpacingMult", Float.valueOf(1.0f))).floatValue();
        float floatValue2 = ((Float) m995a(this.f953l, "mSpacingAdd", Float.valueOf(0.0f))).floatValue();
        boolean booleanValue = ((Boolean) m995a(this.f953l, "mIncludePad", Boolean.TRUE)).booleanValue();
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f952k, i, alignment, floatValue, floatValue2, booleanValue);
        return staticLayout;
    }

    /* renamed from: h */
    private StaticLayout m1000h(CharSequence charSequence, Alignment alignment, int i) {
        CharSequence charSequence2 = charSequence;
        StaticLayout staticLayout = new StaticLayout(charSequence2, this.f952k, i, alignment, this.f953l.getLineSpacingMultiplier(), this.f953l.getLineSpacingExtra(), this.f953l.getIncludeFontPadding());
        return staticLayout;
    }

    /* renamed from: i */
    private int m1001i(RectF rectF) {
        int length = this.f950i.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m992C(this.f950i[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f950i[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: o */
    private static Field m1002o(String str) {
        try {
            Field field = (Field) f944c.get(str);
            if (field == null) {
                field = TextView.class.getDeclaredField(str);
                if (field != null) {
                    field.setAccessible(true);
                    f944c.put(str, field);
                }
            }
            return field;
        } catch (NoSuchFieldException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: p */
    private static Method m1003p(String str) {
        try {
            Method method = (Method) f943b.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    f943b.put(str, method);
                }
            }
            return method;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: r */
    static <T> T m1004r(Object obj, String str, T t) {
        try {
            return m1003p(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            String str2 = "ACTVAutoSizeHelper";
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w(str2, sb.toString(), e);
            return t;
        }
    }

    /* renamed from: x */
    private void m1005x(float f) {
        if (f != this.f953l.getPaint().getTextSize()) {
            this.f953l.getPaint().setTextSize(f);
            boolean isInLayout = VERSION.SDK_INT >= 18 ? this.f953l.isInLayout() : false;
            if (this.f953l.getLayout() != null) {
                this.f946e = false;
                try {
                    Method p = m1003p("nullLayouts");
                    if (p != null) {
                        p.invoke(this.f953l, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f953l.requestLayout();
                } else {
                    this.f953l.forceLayout();
                }
                this.f953l.invalidate();
            }
        }
    }

    /* renamed from: z */
    private boolean m1006z() {
        if (!m993D() || this.f945d != 1) {
            this.f946e = false;
        } else {
            if (!this.f951j || this.f950i.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f949h - this.f948g) / this.f947f))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f948g + (((float) i) * this.f947f));
                }
                this.f950i = m996c(iArr);
            }
            this.f946e = true;
        }
        return this.f946e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1342b() {
        int i;
        if (mo1350s()) {
            if (this.f946e) {
                if (this.f953l.getMeasuredHeight() > 0 && this.f953l.getMeasuredWidth() > 0) {
                    if (this.f955n.mo1357b(this.f953l)) {
                        i = LogType.ANR;
                    } else {
                        i = (this.f953l.getMeasuredWidth() - this.f953l.getTotalPaddingLeft()) - this.f953l.getTotalPaddingRight();
                    }
                    int height = (this.f953l.getHeight() - this.f953l.getCompoundPaddingBottom()) - this.f953l.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        RectF rectF = f942a;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i;
                            rectF.bottom = (float) height;
                            float i2 = (float) m1001i(rectF);
                            if (i2 != this.f953l.getTextSize()) {
                                mo1355y(0, i2);
                            }
                        }
                    }
                }
                return;
            }
            this.f946e = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public StaticLayout mo1343e(CharSequence charSequence, Alignment alignment, int i, int i2) {
        int i3 = VERSION.SDK_INT;
        if (i3 >= 23) {
            return m998f(charSequence, alignment, i, i2);
        }
        if (i3 >= 16) {
            return m1000h(charSequence, alignment, i);
        }
        return m999g(charSequence, alignment, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo1344j() {
        return Math.round(this.f949h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public int mo1345k() {
        return Math.round(this.f948g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public int mo1346l() {
        return Math.round(this.f947f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public int[] mo1347m() {
        return this.f950i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public int mo1348n() {
        return this.f945d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo1349q(int i) {
        TextPaint textPaint = this.f952k;
        if (textPaint == null) {
            this.f952k = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f952k.set(this.f953l.getPaint());
        this.f952k.setTextSize((float) i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public boolean mo1350s() {
        return m993D() && this.f945d != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo1351t(AttributeSet attributeSet, int i) {
        Context context = this.f954m;
        int[] iArr = C0511j.f3596i0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f953l;
        ViewCompat.m5569m0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = C0511j.f3621n0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f945d = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = C0511j.f3616m0;
        float dimension = obtainStyledAttributes.hasValue(i3) ? obtainStyledAttributes.getDimension(i3, -1.0f) : -1.0f;
        int i4 = C0511j.f3606k0;
        float dimension2 = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = C0511j.f3601j0;
        float dimension3 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = C0511j.f3611l0;
        if (obtainStyledAttributes.hasValue(i6)) {
            int resourceId = obtainStyledAttributes.getResourceId(i6, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                m990A(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!m993D()) {
            this.f945d = 0;
        } else if (this.f945d == 1) {
            if (!this.f951j) {
                DisplayMetrics displayMetrics = this.f954m.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m994E(dimension2, dimension3, dimension);
            }
            m1006z();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo1352u(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m993D()) {
            DisplayMetrics displayMetrics = this.f954m.getResources().getDisplayMetrics();
            m994E(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m1006z()) {
                mo1342b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo1353v(int[] iArr, int i) throws IllegalArgumentException {
        if (m993D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f954m.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f950i = m996c(iArr2);
                if (!m991B()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.f951j = false;
            }
            if (m1006z()) {
                mo1342b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo1354w(int i) {
        if (!m993D()) {
            return;
        }
        if (i == 0) {
            m997d();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f954m.getResources().getDisplayMetrics();
            m994E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1006z()) {
                mo1342b();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown auto-size text type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public void mo1355y(int i, float f) {
        Resources resources;
        Context context = this.f954m;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m1005x(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }
}
