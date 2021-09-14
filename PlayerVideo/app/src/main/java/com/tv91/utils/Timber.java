package com.tv91.utils;

import com.uc.crashsdk.export.LogType;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: h.a.a */
public final class Timber {

    /* renamed from: a */
    private static final C3398b[] f18832a;

    /* renamed from: b */
    private static final List<C3398b> f18833b = new ArrayList();

    /* renamed from: c */
    static volatile C3398b[] f18834c;

    /* renamed from: d */
    private static final C3398b f18835d = new C3397a();

    /* renamed from: h.a.a$a */
    /* compiled from: Timber */
    static class C3397a extends C3398b {
        C3397a() {
        }

        /* renamed from: a */
        public void mo20301a(String str, Object... objArr) {
            for (C3398b a : Timber.f18834c) {
                a.mo20301a(str, objArr);
            }
        }

        /* renamed from: b */
        public void mo20302b(String str, Object... objArr) {
            for (C3398b b : Timber.f18834c) {
                b.mo20302b(str, objArr);
            }
        }

        /* renamed from: c */
        public void mo20303c(Throwable th) {
            for (C3398b c : Timber.f18834c) {
                c.mo20303c(th);
            }
        }

        /* renamed from: d */
        public void mo20304d(Throwable th, String str, Object... objArr) {
            for (C3398b d : Timber.f18834c) {
                d.mo20304d(th, str, objArr);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo18570j(int i, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }

        /* renamed from: l */
        public void mo20305l(String str, Object... objArr) {
            for (C3398b l : Timber.f18834c) {
                l.mo20305l(str, objArr);
            }
        }

        /* renamed from: m */
        public void mo20306m(Throwable th) {
            for (C3398b m : Timber.f18834c) {
                m.mo20306m(th);
            }
        }
    }

    /* renamed from: h.a.a$b */
    /* compiled from: Timber */
    public static abstract class C3398b {

        /* renamed from: a */
        final ThreadLocal<String> f18836a = new ThreadLocal<>();

        /* renamed from: f */
        private String m24053f(Throwable th) {
            StringWriter stringWriter = new StringWriter(LogType.UNEXP);
            PrintWriter printWriter = new PrintWriter(stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        /* renamed from: k */
        private void m24054k(int i, Throwable th, String str, Object... objArr) {
            String g = mo20308g();
            if (mo20310i(g, i)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = mo20307e(str, objArr);
                    }
                    if (th != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("\n");
                        sb.append(m24053f(th));
                        str = sb.toString();
                    }
                } else if (th != null) {
                    str = m24053f(th);
                } else {
                    return;
                }
                mo18570j(i, g, str, th);
            }
        }

        /* renamed from: a */
        public void mo20301a(String str, Object... objArr) {
            m24054k(3, null, str, objArr);
        }

        /* renamed from: b */
        public void mo20302b(String str, Object... objArr) {
            m24054k(6, null, str, objArr);
        }

        /* renamed from: c */
        public void mo20303c(Throwable th) {
            m24054k(6, th, null, new Object[0]);
        }

        /* renamed from: d */
        public void mo20304d(Throwable th, String str, Object... objArr) {
            m24054k(6, th, str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public String mo20307e(String str, Object[] objArr) {
            return String.format(str, objArr);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public String mo20308g() {
            String str = (String) this.f18836a.get();
            if (str != null) {
                this.f18836a.remove();
            }
            return str;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        /* renamed from: h */
        public boolean mo20309h(int i) {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public boolean mo20310i(String str, int i) {
            return mo20309h(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public abstract void mo18570j(int i, String str, String str2, Throwable th);

        /* renamed from: l */
        public void mo20305l(String str, Object... objArr) {
            m24054k(5, null, str, objArr);
        }

        /* renamed from: m */
        public void mo20306m(Throwable th) {
            m24054k(7, th, null, new Object[0]);
        }
    }

    static {
        C3398b[] bVarArr = new C3398b[0];
        f18832a = bVarArr;
        f18834c = bVarArr;
    }

    /* renamed from: a */
    public static void m24039a(String str, Object... objArr) {
        f18835d.mo20301a(str, objArr);
    }

    /* renamed from: b */
    public static void m24040b(String str, Object... objArr) {
        f18835d.mo20302b(str, objArr);
    }

    /* renamed from: c */
    public static void m24041c(Throwable th) {
        f18835d.mo20303c(th);
    }

    /* renamed from: d */
    public static void m24042d(Throwable th, String str, Object... objArr) {
        f18835d.mo20304d(th, str, objArr);
    }

    /* renamed from: e */
    public static void m24043e(C3398b bVar) {
        Objects.requireNonNull(bVar, "tree == null");
        if (bVar != f18835d) {
            List<C3398b> list = f18833b;
            synchronized (list) {
                list.add(bVar);
                f18834c = (C3398b[]) list.toArray(new C3398b[list.size()]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot plant Timber into itself.");
    }

    /* renamed from: f */
    public static void m24044f(String str, Object... objArr) {
        f18835d.mo20305l(str, objArr);
    }

    /* renamed from: g */
    public static void m24045g(Throwable th) {
        f18835d.mo20306m(th);
    }
}