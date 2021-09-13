package p010b.p034g.p040h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p010b.p025d.LruCache;
import p010b.p025d.SimpleArrayMap;
import p010b.p034g.p035d.TypefaceCompat;
import p010b.p034g.p040h.FontsContractCompat.C0593a;
import p010b.p034g.p040h.FontsContractCompat.C0594b;
import p010b.p034g.p042j.Consumer;

/* renamed from: b.g.h.e */
class FontRequestWorker {

    /* renamed from: a */
    static final LruCache<String, Typeface> f4510a = new LruCache<>(16);

    /* renamed from: b */
    private static final ExecutorService f4511b = RequestExecutor.m5120a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f4512c = new Object();

    /* renamed from: d */
    static final SimpleArrayMap<String, ArrayList<Consumer<C0592e>>> f4513d = new SimpleArrayMap<>();

    /* renamed from: b.g.h.e$a */
    /* compiled from: FontRequestWorker */
    class C0588a implements Callable<C0592e> {

        /* renamed from: a */
        final /* synthetic */ String f4514a;

        /* renamed from: b */
        final /* synthetic */ Context f4515b;

        /* renamed from: c */
        final /* synthetic */ FontRequest f4516c;

        /* renamed from: d */
        final /* synthetic */ int f4517d;

        C0588a(String str, Context context, FontRequest dVar, int i) {
            this.f4514a = str;
            this.f4515b = context;
            this.f4516c = dVar;
            this.f4517d = i;
        }

        /* renamed from: a */
        public C0592e call() {
            return FontRequestWorker.m5098c(this.f4514a, this.f4515b, this.f4516c, this.f4517d);
        }
    }

    /* renamed from: b.g.h.e$b */
    /* compiled from: FontRequestWorker */
    class C0589b implements Consumer<C0592e> {

        /* renamed from: a */
        final /* synthetic */ CallbackWithHandler f4518a;

        C0589b(CallbackWithHandler aVar) {
            this.f4518a = aVar;
        }

        /* renamed from: b */
        public void mo4887a(C0592e eVar) {
            this.f4518a.mo4873b(eVar);
        }
    }

    /* renamed from: b.g.h.e$c */
    /* compiled from: FontRequestWorker */
    class C0590c implements Callable<C0592e> {

        /* renamed from: a */
        final /* synthetic */ String f4519a;

        /* renamed from: b */
        final /* synthetic */ Context f4520b;

        /* renamed from: c */
        final /* synthetic */ FontRequest f4521c;

        /* renamed from: d */
        final /* synthetic */ int f4522d;

        C0590c(String str, Context context, FontRequest dVar, int i) {
            this.f4519a = str;
            this.f4520b = context;
            this.f4521c = dVar;
            this.f4522d = i;
        }

        /* renamed from: a */
        public C0592e call() {
            return FontRequestWorker.m5098c(this.f4519a, this.f4520b, this.f4521c, this.f4522d);
        }
    }

    /* renamed from: b.g.h.e$d */
    /* compiled from: FontRequestWorker */
    class C0591d implements Consumer<C0592e> {

        /* renamed from: a */
        final /* synthetic */ String f4523a;

        C0591d(String str) {
            this.f4523a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            if (r0 >= r2.size()) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            ((p010b.p034g.p042j.Consumer) r2.get(r0)).mo4887a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0 = 0;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4887a(p010b.p034g.p040h.FontRequestWorker.C0592e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p010b.p034g.p040h.FontRequestWorker.f4512c
                monitor-enter(r0)
                b.d.g<java.lang.String, java.util.ArrayList<b.g.j.a<b.g.h.e$e>>> r1 = p010b.p034g.p040h.FontRequestWorker.f4513d     // Catch:{ all -> 0x002b }
                java.lang.String r2 = r4.f4523a     // Catch:{ all -> 0x002b }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return
            L_0x0011:
                java.lang.String r3 = r4.f4523a     // Catch:{ all -> 0x002b }
                r1.remove(r3)     // Catch:{ all -> 0x002b }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                r0 = 0
            L_0x0018:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002a
                java.lang.Object r1 = r2.get(r0)
                b.g.j.a r1 = (p010b.p034g.p042j.Consumer) r1
                r1.mo4887a(r5)
                int r0 = r0 + 1
                goto L_0x0018
            L_0x002a:
                return
            L_0x002b:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                goto L_0x002f
            L_0x002e:
                throw r5
            L_0x002f:
                goto L_0x002e
            */
            throw new UnsupportedOperationException("Method not decompiled: p010b.p034g.p040h.FontRequestWorker.C0591d.mo4887a(b.g.h.e$e):void");
        }
    }

    /* renamed from: b.g.h.e$e */
    /* compiled from: FontRequestWorker */
    static final class C0592e {

        /* renamed from: a */
        final Typeface f4524a;

        /* renamed from: b */
        final int f4525b;

        C0592e(int i) {
            this.f4524a = null;
            this.f4525b = i;
        }

        /* access modifiers changed from: 0000 */
        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean mo4892a() {
            return this.f4525b == 0;
        }

        @SuppressLint({"WrongConstant"})
        C0592e(Typeface typeface) {
            this.f4524a = typeface;
            this.f4525b = 0;
        }
    }

    /* renamed from: a */
    private static String m5096a(FontRequest dVar, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.mo4880d());
        sb.append("-");
        sb.append(i);
        return sb.toString();
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    private static int m5097b(C0593a aVar) {
        int i = -3;
        int i2 = 1;
        if (aVar.mo4894c() == 0) {
            C0594b[] b = aVar.mo4893b();
            if (!(b == null || b.length == 0)) {
                i2 = 0;
                for (C0594b b2 : b) {
                    int b3 = b2.mo4895b();
                    if (b3 != 0) {
                        if (b3 >= 0) {
                            i = b3;
                        }
                        return i;
                    }
                }
            }
            return i2;
        } else if (aVar.mo4894c() != 1) {
            return -3;
        } else {
            return -2;
        }
    }

    /* renamed from: c */
    static C0592e m5098c(String str, Context context, FontRequest dVar, int i) {
        LruCache<String, Typeface> eVar = f4510a;
        Typeface typeface = (Typeface) eVar.mo4429c(str);
        if (typeface != null) {
            return new C0592e(typeface);
        }
        try {
            C0593a d = FontProvider.m5085d(context, dVar, null);
            int b = m5097b(d);
            if (b != 0) {
                return new C0592e(b);
            }
            Typeface b2 = TypefaceCompat.m4992b(context, null, d.mo4893b(), i);
            if (b2 == null) {
                return new C0592e(-3);
            }
            eVar.mo4430d(str, b2);
            return new C0592e(b2);
        } catch (NameNotFoundException unused) {
            return new C0592e(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r9 = new p010b.p034g.p040h.FontRequestWorker.C0590c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r8 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r8 = f4511b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        p010b.p034g.p040h.RequestExecutor.m5121b(r8, r9, new p010b.p034g.p040h.FontRequestWorker.C0591d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Typeface m5099d(android.content.Context r5, p010b.p034g.p040h.FontRequest r6, int r7, java.util.concurrent.Executor r8, p010b.p034g.p040h.CallbackWithHandler r9) {
        /*
            java.lang.String r0 = m5096a(r6, r7)
            b.d.e<java.lang.String, android.graphics.Typeface> r1 = f4510a
            java.lang.Object r1 = r1.mo4429c(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            b.g.h.e$e r5 = new b.g.h.e$e
            r5.<init>(r1)
            r9.mo4873b(r5)
            return r1
        L_0x0017:
            b.g.h.e$b r1 = new b.g.h.e$b
            r1.<init>(r9)
            java.lang.Object r9 = f4512c
            monitor-enter(r9)
            b.d.g<java.lang.String, java.util.ArrayList<b.g.j.a<b.g.h.e$e>>> r2 = f4513d     // Catch:{ all -> 0x004d }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x004d }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x004d }
            r4 = 0
            if (r3 == 0) goto L_0x002f
            r3.add(r1)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            return r4
        L_0x002f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x004d }
            r3.<init>()     // Catch:{ all -> 0x004d }
            r3.add(r1)     // Catch:{ all -> 0x004d }
            r2.put(r0, r3)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            b.g.h.e$c r9 = new b.g.h.e$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0044
            java.util.concurrent.ExecutorService r8 = f4511b
        L_0x0044:
            b.g.h.e$d r5 = new b.g.h.e$d
            r5.<init>(r0)
            p010b.p034g.p040h.RequestExecutor.m5121b(r8, r9, r5)
            return r4
        L_0x004d:
            r5 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p034g.p040h.FontRequestWorker.m5099d(android.content.Context, b.g.h.d, int, java.util.concurrent.Executor, b.g.h.a):android.graphics.Typeface");
    }

    /* renamed from: e */
    static Typeface m5100e(Context context, FontRequest dVar, CallbackWithHandler aVar, int i, int i2) {
        String a = m5096a(dVar, i);
        Typeface typeface = (Typeface) f4510a.mo4429c(a);
        if (typeface != null) {
            aVar.mo4873b(new C0592e(typeface));
            return typeface;
        } else if (i2 == -1) {
            C0592e c = m5098c(a, context, dVar, i);
            aVar.mo4873b(c);
            return c.f4524a;
        } else {
            try {
                C0592e eVar = (C0592e) RequestExecutor.m5122c(f4511b, new C0588a(a, context, dVar, i), i2);
                aVar.mo4873b(eVar);
                return eVar.f4524a;
            } catch (InterruptedException unused) {
                aVar.mo4873b(new C0592e(-3));
                return null;
            }
        }
    }
}
