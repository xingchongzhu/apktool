package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.TintContextWrapper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p010b.p011a.C0511j;
import p010b.p011a.p017n.ContextThemeWrapper;
import p010b.p025d.SimpleArrayMap;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: androidx.appcompat.app.h */
public class AppCompatViewInflater {

    /* renamed from: a */
    private static final Class<?>[] f383a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final int[] f384b = {16843375};

    /* renamed from: c */
    private static final String[] f385c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final SimpleArrayMap<String, Constructor<? extends View>> f386d = new SimpleArrayMap<>();

    /* renamed from: e */
    private final Object[] f387e = new Object[2];

    /* renamed from: androidx.appcompat.app.h$a */
    /* compiled from: AppCompatViewInflater */
    private static class C0088a implements OnClickListener {

        /* renamed from: a */
        private final View f388a;

        /* renamed from: b */
        private final String f389b;

        /* renamed from: c */
        private Method f390c;

        /* renamed from: d */
        private Context f391d;

        public C0088a(View view, String str) {
            this.f388a = view;
            this.f389b = str;
        }

        /* renamed from: a */
        private void m448a(Context context) {
            String str;
            while (context != null) {
                try {
                    if (!context.isRestricted()) {
                        Method method = context.getClass().getMethod(this.f389b, new Class[]{View.class});
                        if (method != null) {
                            this.f390c = method;
                            this.f391d = context;
                            return;
                        }
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f388a.getId();
            if (id == -1) {
                str = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(" with id '");
                sb.append(this.f388a.getContext().getResources().getResourceEntryName(id));
                sb.append("'");
                str = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not find method ");
            sb2.append(this.f389b);
            sb2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            sb2.append(this.f388a.getClass());
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public void onClick(View view) {
            if (this.f390c == null) {
                m448a(this.f388a.getContext());
            }
            try {
                this.f390c.invoke(this.f391d, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private void m427a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (VERSION.SDK_INT < 15 || ViewCompat.m5532O(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f384b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0088a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: r */
    private View m428r(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        SimpleArrayMap<String, Constructor<? extends View>> gVar = f386d;
        Constructor constructor = (Constructor) gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    str3 = sb.toString();
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f383a);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f387e);
    }

    /* renamed from: s */
    private View m429s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f387e;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = f385c;
                    if (i < strArr.length) {
                        View r = m428r(context, str, strArr[i]);
                        if (r != null) {
                            return r;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.f387e;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View r2 = m428r(context, str, null);
                Object[] objArr3 = this.f387e;
                objArr3[0] = null;
                objArr3[1] = null;
                return r2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f387e;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    /* renamed from: t */
    private static Context m430t(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0511j.f3444A3, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0511j.f3449B3, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(C0511j.f3454C3, 0);
            if (resourceId != 0) {
                Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
            }
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof ContextThemeWrapper) || ((ContextThemeWrapper) context).mo4204c() != resourceId) ? new ContextThemeWrapper(context, resourceId) : context;
        }
        return context;
    }

    /* renamed from: u */
    private void m431u(View view, String str) {
        if (view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(" asked to inflate view for <");
            sb.append(str);
            sb.append(">, but returned null");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AppCompatAutoCompleteTextView mo433b(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public AppCompatButton mo434c(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AppCompatCheckBox mo435d(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public AppCompatCheckedTextView mo436e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public AppCompatEditText mo437f(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public AppCompatImageButton mo438g(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public AppCompatImageView mo439h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AppCompatMultiAutoCompleteTextView mo440i(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public AppCompatRadioButton mo441j(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public AppCompatRatingBar mo442k(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public AppCompatSeekBar mo443l(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public AppCompatSpinner mo444m(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public AppCompatTextView mo445n(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public AppCompatToggleButton mo446o(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public View mo447p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final View mo448q(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m430t(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = TintContextWrapper.m1357b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo442k(context2, attributeSet);
                m431u(view2, str);
                break;
            case 1:
                view2 = mo436e(context2, attributeSet);
                m431u(view2, str);
                break;
            case 2:
                view2 = mo440i(context2, attributeSet);
                m431u(view2, str);
                break;
            case 3:
                view2 = mo445n(context2, attributeSet);
                m431u(view2, str);
                break;
            case 4:
                view2 = mo438g(context2, attributeSet);
                m431u(view2, str);
                break;
            case 5:
                view2 = mo443l(context2, attributeSet);
                m431u(view2, str);
                break;
            case 6:
                view2 = mo444m(context2, attributeSet);
                m431u(view2, str);
                break;
            case 7:
                view2 = mo441j(context2, attributeSet);
                m431u(view2, str);
                break;
            case 8:
                view2 = mo446o(context2, attributeSet);
                m431u(view2, str);
                break;
            case 9:
                view2 = mo439h(context2, attributeSet);
                m431u(view2, str);
                break;
            case 10:
                view2 = mo433b(context2, attributeSet);
                m431u(view2, str);
                break;
            case 11:
                view2 = mo435d(context2, attributeSet);
                m431u(view2, str);
                break;
            case 12:
                view2 = mo437f(context2, attributeSet);
                m431u(view2, str);
                break;
            case 13:
                view2 = mo434c(context2, attributeSet);
                m431u(view2, str);
                break;
            default:
                view2 = mo447p(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = m429s(context2, str, attributeSet);
        }
        if (view2 != null) {
            m427a(view2, attributeSet);
        }
        return view2;
    }
}
