package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.a */
public class ConstraintAttribute {

    /* renamed from: a */
    String f1411a;

    /* renamed from: b */
    private C0216b f1412b;

    /* renamed from: c */
    private int f1413c;

    /* renamed from: d */
    private float f1414d;

    /* renamed from: e */
    private String f1415e;

    /* renamed from: f */
    boolean f1416f;

    /* renamed from: g */
    private int f1417g;

    /* renamed from: androidx.constraintlayout.widget.a$a */
    /* compiled from: ConstraintAttribute */
    static /* synthetic */ class C0215a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1418a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.a$b[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C0216b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1418a = r0
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.ConstraintAttribute.C0216b.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1418a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.ConstraintAttribute.C0216b.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1418a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.ConstraintAttribute.C0216b.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1418a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.ConstraintAttribute.C0216b.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1418a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.ConstraintAttribute.C0216b.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f1418a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.ConstraintAttribute.C0216b.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f1418a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.ConstraintAttribute.C0216b.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintAttribute.C0215a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$b */
    /* compiled from: ConstraintAttribute */
    public enum C0216b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public ConstraintAttribute(String str, C0216b bVar, Object obj) {
        this.f1411a = str;
        this.f1412b = bVar;
        mo1948d(obj);
    }

    /* renamed from: a */
    public static HashMap<String, ConstraintAttribute> m1527a(HashMap<String, ConstraintAttribute> hashMap, View view) {
        HashMap<String, ConstraintAttribute> hashMap2 = new HashMap<>();
        Class cls = view.getClass();
        for (String str : hashMap.keySet()) {
            ConstraintAttribute aVar = (ConstraintAttribute) hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new ConstraintAttribute(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getMap");
                    sb.append(str);
                    hashMap2.put(str, new ConstraintAttribute(aVar, cls.getMethod(sb.toString(), new Class[0]).invoke(view, new Object[0])));
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: b */
    public static void m1528b(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> hashMap) {
        C0216b bVar;
        Object string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0226i.f1584C2);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        C0216b bVar2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0226i.f1590D2) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Character.toUpperCase(str.charAt(0)));
                    sb.append(str.substring(1));
                    str = sb.toString();
                }
            } else if (index == C0226i.f1596E2) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = C0216b.BOOLEAN_TYPE;
            } else {
                if (index == C0226i.f1608G2) {
                    bVar = C0216b.COLOR_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C0226i.f1602F2) {
                    bVar = C0216b.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C0226i.f1632K2) {
                    bVar = C0216b.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == C0226i.f1614H2) {
                    bVar = C0216b.DIMENSION_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C0226i.f1620I2) {
                    bVar = C0216b.FLOAT_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == C0226i.f1626J2) {
                    bVar = C0216b.INT_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == C0226i.f1638L2) {
                    bVar = C0216b.STRING_TYPE;
                    string = obtainStyledAttributes.getString(index);
                }
                Object obj2 = string;
                bVar2 = bVar;
                obj = obj2;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new ConstraintAttribute(str, bVar2, obj));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public static void m1529c(View view, HashMap<String, ConstraintAttribute> hashMap) {
        String str = "\" not found on ";
        String str2 = " Custom Attribute \"";
        String str3 = "TransitionLayout";
        Class cls = view.getClass();
        for (String str4 : hashMap.keySet()) {
            ConstraintAttribute aVar = (ConstraintAttribute) hashMap.get(str4);
            StringBuilder sb = new StringBuilder();
            sb.append("set");
            sb.append(str4);
            String sb2 = sb.toString();
            try {
                switch (C0215a.f1418a[aVar.f1412b.ordinal()]) {
                    case 1:
                        cls.getMethod(sb2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f1417g)});
                        break;
                    case 2:
                        Method method = cls.getMethod(sb2, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f1417g);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 3:
                        cls.getMethod(sb2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f1413c)});
                        break;
                    case 4:
                        cls.getMethod(sb2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f1414d)});
                        break;
                    case 5:
                        cls.getMethod(sb2, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f1415e});
                        break;
                    case 6:
                        cls.getMethod(sb2, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f1416f)});
                        break;
                    case 7:
                        cls.getMethod(sb2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f1414d)});
                        break;
                }
            } catch (NoSuchMethodException e) {
                Log.e(str3, e.getMessage());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(str4);
                sb3.append(str);
                sb3.append(cls.getName());
                Log.e(str3, sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(cls.getName());
                sb4.append(" must have a method ");
                sb4.append(sb2);
                Log.e(str3, sb4.toString());
            } catch (IllegalAccessException e2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append(str4);
                sb5.append(str);
                sb5.append(cls.getName());
                Log.e(str3, sb5.toString());
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str2);
                sb6.append(str4);
                sb6.append(str);
                sb6.append(cls.getName());
                Log.e(str3, sb6.toString());
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public void mo1948d(Object obj) {
        switch (C0215a.f1418a[this.f1412b.ordinal()]) {
            case 1:
            case 2:
                this.f1417g = ((Integer) obj).intValue();
                return;
            case 3:
                this.f1413c = ((Integer) obj).intValue();
                return;
            case 4:
                this.f1414d = ((Float) obj).floatValue();
                return;
            case 5:
                this.f1415e = (String) obj;
                return;
            case 6:
                this.f1416f = ((Boolean) obj).booleanValue();
                return;
            case 7:
                this.f1414d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public ConstraintAttribute(ConstraintAttribute aVar, Object obj) {
        this.f1411a = aVar.f1411a;
        this.f1412b = aVar.f1412b;
        mo1948d(obj);
    }
}
