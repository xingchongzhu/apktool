package p010b.p011a.p017n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p010b.p011a.C0511j;
import p010b.p034g.p036e.p037a.SupportMenu;
import p010b.p034g.p043k.ActionProvider;
import p010b.p034g.p043k.MenuItemCompat;

/* renamed from: b.a.n.g */
public class SupportMenuInflater extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f3802a;

    /* renamed from: b */
    static final Class<?>[] f3803b;

    /* renamed from: c */
    final Object[] f3804c;

    /* renamed from: d */
    final Object[] f3805d;

    /* renamed from: e */
    Context f3806e;

    /* renamed from: f */
    private Object f3807f;

    /* renamed from: b.a.n.g$a */
    /* compiled from: SupportMenuInflater */
    private static class C0529a implements OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f3808a = {MenuItem.class};

        /* renamed from: b */
        private Object f3809b;

        /* renamed from: c */
        private Method f3810c;

        public C0529a(Object obj, String str) {
            this.f3809b = obj;
            Class cls = obj.getClass();
            try {
                this.f3810c = cls.getMethod(str, f3808a);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f3810c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f3810c.invoke(this.f3809b, new Object[]{menuItem})).booleanValue();
                }
                this.f3810c.invoke(this.f3809b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: b.a.n.g$b */
    /* compiled from: SupportMenuInflater */
    private class C0530b {

        /* renamed from: A */
        ActionProvider f3811A;

        /* renamed from: B */
        private CharSequence f3812B;

        /* renamed from: C */
        private CharSequence f3813C;

        /* renamed from: D */
        private ColorStateList f3814D = null;

        /* renamed from: E */
        private Mode f3815E = null;

        /* renamed from: a */
        private Menu f3817a;

        /* renamed from: b */
        private int f3818b;

        /* renamed from: c */
        private int f3819c;

        /* renamed from: d */
        private int f3820d;

        /* renamed from: e */
        private int f3821e;

        /* renamed from: f */
        private boolean f3822f;

        /* renamed from: g */
        private boolean f3823g;

        /* renamed from: h */
        private boolean f3824h;

        /* renamed from: i */
        private int f3825i;

        /* renamed from: j */
        private int f3826j;

        /* renamed from: k */
        private CharSequence f3827k;

        /* renamed from: l */
        private CharSequence f3828l;

        /* renamed from: m */
        private int f3829m;

        /* renamed from: n */
        private char f3830n;

        /* renamed from: o */
        private int f3831o;

        /* renamed from: p */
        private char f3832p;

        /* renamed from: q */
        private int f3833q;

        /* renamed from: r */
        private int f3834r;

        /* renamed from: s */
        private boolean f3835s;

        /* renamed from: t */
        private boolean f3836t;

        /* renamed from: u */
        private boolean f3837u;

        /* renamed from: v */
        private int f3838v;

        /* renamed from: w */
        private int f3839w;

        /* renamed from: x */
        private String f3840x;

        /* renamed from: y */
        private String f3841y;

        /* renamed from: z */
        private String f3842z;

        public C0530b(Menu menu) {
            this.f3817a = menu;
            mo4237h();
        }

        /* renamed from: c */
        private char m4292c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m4293e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = Class.forName(str, false, SupportMenuInflater.this.f3806e.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                Log.w("SupportMenuInflater", sb.toString(), e);
                return null;
            }
        }

        /* renamed from: i */
        private void m4294i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f3835s).setVisible(this.f3836t).setEnabled(this.f3837u).setCheckable(this.f3834r >= 1).setTitleCondensed(this.f3828l).setIcon(this.f3829m);
            int i = this.f3838v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f3842z != null) {
                if (!SupportMenuInflater.this.f3806e.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C0529a(SupportMenuInflater.this.mo4229b(), this.f3842z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f3834r >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).mo773t(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).mo803h(true);
                }
            }
            String str = this.f3840x;
            if (str != null) {
                menuItem.setActionView((View) m4293e(str, SupportMenuInflater.f3802a, SupportMenuInflater.this.f3804c));
                z = true;
            }
            int i2 = this.f3839w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            ActionProvider bVar = this.f3811A;
            if (bVar != null) {
                MenuItemCompat.m5467a(menuItem, bVar);
            }
            MenuItemCompat.m5469c(menuItem, this.f3812B);
            MenuItemCompat.m5473g(menuItem, this.f3813C);
            MenuItemCompat.m5468b(menuItem, this.f3830n, this.f3831o);
            MenuItemCompat.m5472f(menuItem, this.f3832p, this.f3833q);
            Mode mode = this.f3815E;
            if (mode != null) {
                MenuItemCompat.m5471e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f3814D;
            if (colorStateList != null) {
                MenuItemCompat.m5470d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo4232a() {
            this.f3824h = true;
            m4294i(this.f3817a.add(this.f3818b, this.f3825i, this.f3826j, this.f3827k));
        }

        /* renamed from: b */
        public SubMenu mo4233b() {
            this.f3824h = true;
            SubMenu addSubMenu = this.f3817a.addSubMenu(this.f3818b, this.f3825i, this.f3826j, this.f3827k);
            m4294i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo4234d() {
            return this.f3824h;
        }

        /* renamed from: f */
        public void mo4235f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = SupportMenuInflater.this.f3806e.obtainStyledAttributes(attributeSet, C0511j.f3642r1);
            this.f3818b = obtainStyledAttributes.getResourceId(C0511j.f3652t1, 0);
            this.f3819c = obtainStyledAttributes.getInt(C0511j.f3662v1, 0);
            this.f3820d = obtainStyledAttributes.getInt(C0511j.f3667w1, 0);
            this.f3821e = obtainStyledAttributes.getInt(C0511j.f3672x1, 0);
            this.f3822f = obtainStyledAttributes.getBoolean(C0511j.f3657u1, true);
            this.f3823g = obtainStyledAttributes.getBoolean(C0511j.f3647s1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void mo4236g(AttributeSet attributeSet) {
            TintTypedArray u = TintTypedArray.m1405u(SupportMenuInflater.this.f3806e, attributeSet, C0511j.f3677y1);
            this.f3825i = u.mo1845n(C0511j.f3447B1, 0);
            this.f3826j = (u.mo1842k(C0511j.f3462E1, this.f3819c) & -65536) | (u.mo1842k(C0511j.f3467F1, this.f3820d) & 65535);
            this.f3827k = u.mo1847p(C0511j.f3472G1);
            this.f3828l = u.mo1847p(C0511j.f3477H1);
            this.f3829m = u.mo1845n(C0511j.f3682z1, 0);
            this.f3830n = m4292c(u.mo1846o(C0511j.f3482I1));
            this.f3831o = u.mo1842k(C0511j.f3513P1, 4096);
            this.f3832p = m4292c(u.mo1846o(C0511j.f3487J1));
            this.f3833q = u.mo1842k(C0511j.f3529T1, 4096);
            int i = C0511j.f3492K1;
            if (u.mo1850s(i)) {
                this.f3834r = u.mo1832a(i, false) ? 1 : 0;
            } else {
                this.f3834r = this.f3821e;
            }
            this.f3835s = u.mo1832a(C0511j.f3452C1, false);
            this.f3836t = u.mo1832a(C0511j.f3457D1, this.f3822f);
            this.f3837u = u.mo1832a(C0511j.f3442A1, this.f3823g);
            this.f3838v = u.mo1842k(C0511j.f3533U1, -1);
            this.f3842z = u.mo1846o(C0511j.f3497L1);
            this.f3839w = u.mo1845n(C0511j.f3501M1, 0);
            this.f3840x = u.mo1846o(C0511j.f3509O1);
            String o = u.mo1846o(C0511j.f3505N1);
            this.f3841y = o;
            boolean z = o != null;
            if (z && this.f3839w == 0 && this.f3840x == null) {
                this.f3811A = (ActionProvider) m4293e(o, SupportMenuInflater.f3803b, SupportMenuInflater.this.f3805d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f3811A = null;
            }
            this.f3812B = u.mo1847p(C0511j.f3517Q1);
            this.f3813C = u.mo1847p(C0511j.f3537V1);
            int i2 = C0511j.f3525S1;
            if (u.mo1850s(i2)) {
                this.f3815E = DrawableUtils.m1123d(u.mo1842k(i2, -1), this.f3815E);
            } else {
                this.f3815E = null;
            }
            int i3 = C0511j.f3521R1;
            if (u.mo1850s(i3)) {
                this.f3814D = u.mo1834c(i3);
            } else {
                this.f3814D = null;
            }
            u.mo1851w();
            this.f3824h = false;
        }

        /* renamed from: h */
        public void mo4237h() {
            this.f3818b = 0;
            this.f3819c = 0;
            this.f3820d = 0;
            this.f3821e = 0;
            this.f3822f = true;
            this.f3823g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f3802a = clsArr;
        f3803b = clsArr;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.f3806e = context;
        Object[] objArr = {context};
        this.f3804c = objArr;
        this.f3805d = objArr;
    }

    /* renamed from: a */
    private Object m4289a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            obj = m4289a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* renamed from: c */
    private void m4290c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        String str;
        C0530b bVar = new C0530b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            str = "menu";
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals(str)) {
                    eventType = xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expecting menu, got ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                String str3 = "item";
                String str4 = "group";
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str2)) {
                            str2 = null;
                            z2 = false;
                        } else if (name2.equals(str4)) {
                            bVar.mo4237h();
                        } else if (name2.equals(str3)) {
                            if (!bVar.mo4234d()) {
                                ActionProvider bVar2 = bVar.f3811A;
                                if (bVar2 == null || !bVar2.mo837a()) {
                                    bVar.mo4232a();
                                } else {
                                    bVar.mo4233b();
                                }
                            }
                        } else if (name2.equals(str)) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals(str4)) {
                        bVar.mo4235f(attributeSet);
                    } else if (name3.equals(str3)) {
                        bVar.mo4236g(attributeSet);
                    } else if (name3.equals(str)) {
                        m4290c(xmlPullParser, attributeSet, bVar.mo4233b());
                    } else {
                        str2 = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Object mo4229b() {
        if (this.f3807f == null) {
            this.f3807f = m4289a(this.f3806e);
        }
        return this.f3807f;
    }

    public void inflate(int i, Menu menu) {
        String str = "Error inflating menu XML";
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f3806e.getResources().getLayout(i);
            m4290c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException(str, e);
        } catch (IOException e2) {
            throw new InflateException(str, e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
