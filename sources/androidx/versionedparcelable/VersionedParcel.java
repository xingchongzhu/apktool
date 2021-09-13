package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p010b.p025d.ArrayMap;

/* renamed from: androidx.versionedparcelable.b */
public abstract class VersionedParcel {

    /* renamed from: a */
    protected final ArrayMap<String, Method> f3171a;

    /* renamed from: b */
    protected final ArrayMap<String, Method> f3172b;

    /* renamed from: c */
    protected final ArrayMap<String, Class> f3173c;

    public VersionedParcel(ArrayMap<String, Method> aVar, ArrayMap<String, Method> aVar2, ArrayMap<String, Class> aVar3) {
        this.f3171a = aVar;
        this.f3172b = aVar2;
        this.f3173c = aVar3;
    }

    /* renamed from: N */
    private void m4007N(VersionedParcelable dVar) {
        try {
            mo3954I(m4008c(dVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(dVar.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: c */
    private Class m4008c(Class<? extends VersionedParcelable> cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f3173c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f3173c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    private Method m4009d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<VersionedParcel> cls = VersionedParcel.class;
        Method method = (Method) this.f3171a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f3171a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    private Method m4010e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.f3172b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c = m4008c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", new Class[]{cls, VersionedParcel.class});
        this.f3172b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo3946A(byte[] bArr);

    /* renamed from: B */
    public void mo3947B(byte[] bArr, int i) {
        mo3978w(i);
        mo3946A(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo3948C(CharSequence charSequence);

    /* renamed from: D */
    public void mo3949D(CharSequence charSequence, int i) {
        mo3978w(i);
        mo3948C(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo3950E(int i);

    /* renamed from: F */
    public void mo3951F(int i, int i2) {
        mo3978w(i2);
        mo3950E(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo3952G(Parcelable parcelable);

    /* renamed from: H */
    public void mo3953H(Parcelable parcelable, int i) {
        mo3978w(i);
        mo3952G(parcelable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void mo3954I(String str);

    /* renamed from: J */
    public void mo3955J(String str, int i) {
        mo3978w(i);
        mo3954I(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public <T extends VersionedParcelable> void mo3956K(T t, VersionedParcel bVar) {
        try {
            m4010e(t.getClass()).invoke(null, new Object[]{t, bVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo3957L(VersionedParcelable dVar) {
        if (dVar == null) {
            mo3954I(null);
            return;
        }
        m4007N(dVar);
        VersionedParcel b = mo3960b();
        mo3956K(dVar, b);
        b.mo3959a();
    }

    /* renamed from: M */
    public void mo3958M(VersionedParcelable dVar, int i) {
        mo3978w(i);
        mo3957L(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3959a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract VersionedParcel mo3960b();

    /* renamed from: f */
    public boolean mo3961f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo3962g();

    /* renamed from: h */
    public boolean mo3963h(boolean z, int i) {
        if (!mo3968m(i)) {
            return z;
        }
        return mo3962g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract byte[] mo3964i();

    /* renamed from: j */
    public byte[] mo3965j(byte[] bArr, int i) {
        if (!mo3968m(i)) {
            return bArr;
        }
        return mo3964i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract CharSequence mo3966k();

    /* renamed from: l */
    public CharSequence mo3967l(CharSequence charSequence, int i) {
        if (!mo3968m(i)) {
            return charSequence;
        }
        return mo3966k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo3968m(int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public <T extends VersionedParcelable> T mo3969n(String str, VersionedParcel bVar) {
        try {
            return (VersionedParcelable) m4009d(str).invoke(null, new Object[]{bVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo3970o();

    /* renamed from: p */
    public int mo3971p(int i, int i2) {
        if (!mo3968m(i2)) {
            return i;
        }
        return mo3970o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract <T extends Parcelable> T mo3972q();

    /* renamed from: r */
    public <T extends Parcelable> T mo3973r(T t, int i) {
        if (!mo3968m(i)) {
            return t;
        }
        return mo3972q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract String mo3974s();

    /* renamed from: t */
    public String mo3975t(String str, int i) {
        if (!mo3968m(i)) {
            return str;
        }
        return mo3974s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public <T extends VersionedParcelable> T mo3976u() {
        String s = mo3974s();
        if (s == null) {
            return null;
        }
        return mo3969n(s, mo3960b());
    }

    /* renamed from: v */
    public <T extends VersionedParcelable> T mo3977v(T t, int i) {
        if (!mo3968m(i)) {
            return t;
        }
        return mo3976u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo3978w(int i);

    /* renamed from: x */
    public void mo3979x(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo3980y(boolean z);

    /* renamed from: z */
    public void mo3981z(boolean z, int i) {
        mo3978w(i);
        mo3980y(z);
    }
}
