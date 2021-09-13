package com.bumptech.glide.load.p152n;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.n.q */
public final class GlideException extends Exception {

    /* renamed from: a */
    private static final StackTraceElement[] f10635a = new StackTraceElement[0];

    /* renamed from: b */
    private final List<Throwable> f10636b;

    /* renamed from: c */
    private Key f10637c;

    /* renamed from: d */
    private DataSource f10638d;

    /* renamed from: e */
    private Class<?> f10639e;

    /* renamed from: f */
    private String f10640f;

    /* renamed from: g */
    private Exception f10641g;

    /* renamed from: com.bumptech.glide.load.n.q$a */
    /* compiled from: GlideException */
    private static final class C1502a implements Appendable {

        /* renamed from: a */
        private final Appendable f10642a;

        /* renamed from: b */
        private boolean f10643b = true;

        C1502a(Appendable appendable) {
            this.f10642a = appendable;
        }

        /* renamed from: a */
        private CharSequence m12986a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.f10643b) {
                this.f10643b = false;
                this.f10642a.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f10643b = z;
            this.f10642a.append(c);
            return this;
        }

        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence a = m12986a(charSequence);
            return append(a, 0, a.length());
        }

        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a = m12986a(charSequence);
            boolean z = false;
            if (this.f10643b) {
                this.f10643b = false;
                this.f10642a.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f10643b = z;
            this.f10642a.append(a, i, i2);
            return this;
        }
    }

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    /* renamed from: a */
    private void m12975a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable a : ((GlideException) th).mo9065e()) {
                m12975a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: b */
    private static void m12976b(List<Throwable> list, Appendable appendable) {
        try {
            m12977c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static void m12977c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).m12979h(appendable);
            } else {
                m12978d(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    private static void m12978d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: h */
    private void m12979h(Appendable appendable) {
        m12978d(this, appendable);
        m12976b(mo9065e(), new C1502a(appendable));
    }

    /* renamed from: e */
    public List<Throwable> mo9065e() {
        return this.f10636b;
    }

    /* renamed from: f */
    public List<Throwable> mo9066f() {
        ArrayList arrayList = new ArrayList();
        m12975a(this, arrayList);
        return arrayList;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public void mo9068g(String str) {
        List f = mo9066f();
        int size = f.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), (Throwable) f.get(i));
            i = i2;
        }
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f10640f);
        String str3 = ", ";
        String str4 = "";
        if (this.f10639e != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(this.f10639e);
            str = sb2.toString();
        } else {
            str = str4;
        }
        sb.append(str);
        if (this.f10638d != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(this.f10638d);
            str2 = sb3.toString();
        } else {
            str2 = str4;
        }
        sb.append(str2);
        if (this.f10637c != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(this.f10637c);
            str4 = sb4.toString();
        }
        sb.append(str4);
        List<Throwable> f = mo9066f();
        if (f.isEmpty()) {
            return sb.toString();
        }
        if (f.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(f.size());
            sb.append(" root causes:");
        }
        for (Throwable th : f) {
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo9070i(Key gVar, DataSource aVar) {
        mo9071j(gVar, aVar, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo9071j(Key gVar, DataSource aVar, Class<?> cls) {
        this.f10637c = gVar;
        this.f10638d = aVar;
        this.f10639e = cls;
    }

    /* renamed from: k */
    public void mo9072k(Exception exc) {
        this.f10641g = exc;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    public void printStackTrace(PrintStream printStream) {
        m12979h(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f10640f = str;
        setStackTrace(f10635a);
        this.f10636b = list;
    }

    public void printStackTrace(PrintWriter printWriter) {
        m12979h(printWriter);
    }
}
