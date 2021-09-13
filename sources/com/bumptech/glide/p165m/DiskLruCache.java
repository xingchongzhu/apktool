package com.bumptech.glide.p165m;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import com.umeng.commonsdk.statistics.SdkVersion;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.m.a */
public final class DiskLruCache implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final File f10985a;

    /* renamed from: b */
    private final File f10986b;

    /* renamed from: c */
    private final File f10987c;

    /* renamed from: d */
    private final File f10988d;

    /* renamed from: e */
    private final int f10989e;

    /* renamed from: f */
    private long f10990f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final int f10991g;

    /* renamed from: h */
    private long f10992h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Writer f10993i;

    /* renamed from: j */
    private final LinkedHashMap<String, C1610d> f10994j = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f10995k;

    /* renamed from: l */
    private long f10996l = 0;

    /* renamed from: m */
    final ThreadPoolExecutor f10997m;

    /* renamed from: n */
    private final Callable<Void> f10998n;

    /* renamed from: com.bumptech.glide.m.a$a */
    /* compiled from: DiskLruCache */
    class C1607a implements Callable<Void> {
        C1607a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                com.bumptech.glide.m.a r0 = com.bumptech.glide.p165m.DiskLruCache.this
                monitor-enter(r0)
                com.bumptech.glide.m.a r1 = com.bumptech.glide.p165m.DiskLruCache.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f10993i     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                com.bumptech.glide.m.a r1 = com.bumptech.glide.p165m.DiskLruCache.this     // Catch:{ all -> 0x0028 }
                r1.m13621a0()     // Catch:{ all -> 0x0028 }
                com.bumptech.glide.m.a r1 = com.bumptech.glide.p165m.DiskLruCache.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m13614S()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                com.bumptech.glide.m.a r1 = com.bumptech.glide.p165m.DiskLruCache.this     // Catch:{ all -> 0x0028 }
                r1.m13619X()     // Catch:{ all -> 0x0028 }
                com.bumptech.glide.m.a r1 = com.bumptech.glide.p165m.DiskLruCache.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                r1.f10995k = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p165m.DiskLruCache.C1607a.call():java.lang.Void");
        }
    }

    /* renamed from: com.bumptech.glide.m.a$b */
    /* compiled from: DiskLruCache */
    private static final class C1608b implements ThreadFactory {
        private C1608b() {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ C1608b(C1607a aVar) {
            this();
        }
    }

    /* renamed from: com.bumptech.glide.m.a$c */
    /* compiled from: DiskLruCache */
    public final class C1609c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1610d f11000a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f11001b;

        /* renamed from: c */
        private boolean f11002c;

        /* synthetic */ C1609c(DiskLruCache aVar, C1610d dVar, C1607a aVar2) {
            this(dVar);
        }

        /* renamed from: a */
        public void mo9336a() throws IOException {
            DiskLruCache.this.m13610L(this, false);
        }

        /* renamed from: b */
        public void mo9337b() {
            if (!this.f11002c) {
                try {
                    mo9336a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: e */
        public void mo9338e() throws IOException {
            DiskLruCache.this.m13610L(this, true);
            this.f11002c = true;
        }

        /* renamed from: f */
        public File mo9339f(int i) throws IOException {
            File k;
            synchronized (DiskLruCache.this) {
                if (this.f11000a.f11009f == this) {
                    if (!this.f11000a.f11008e) {
                        this.f11001b[i] = true;
                    }
                    k = this.f11000a.mo9341k(i);
                    DiskLruCache.this.f10985a.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return k;
        }

        private C1609c(C1610d dVar) {
            this.f11000a = dVar;
            this.f11001b = dVar.f11008e ? null : new boolean[DiskLruCache.this.f10991g];
        }
    }

    /* renamed from: com.bumptech.glide.m.a$d */
    /* compiled from: DiskLruCache */
    private final class C1610d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f11004a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long[] f11005b;

        /* renamed from: c */
        File[] f11006c;

        /* renamed from: d */
        File[] f11007d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f11008e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C1609c f11009f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f11010g;

        /* synthetic */ C1610d(DiskLruCache aVar, String str, C1607a aVar2) {
            this(str);
        }

        /* renamed from: m */
        private IOException m13642m(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public void m13643n(String[] strArr) throws IOException {
            if (strArr.length == DiskLruCache.this.f10991g) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f11005b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m13642m(strArr);
                    }
                }
                return;
            }
            throw m13642m(strArr);
        }

        /* renamed from: j */
        public File mo9340j(int i) {
            return this.f11006c[i];
        }

        /* renamed from: k */
        public File mo9341k(int i) {
            return this.f11007d[i];
        }

        /* renamed from: l */
        public String mo9342l() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f11005b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        private C1610d(String str) {
            this.f11004a = str;
            this.f11005b = new long[DiskLruCache.this.f10991g];
            this.f11006c = new File[DiskLruCache.this.f10991g];
            this.f11007d = new File[DiskLruCache.this.f10991g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < DiskLruCache.this.f10991g; i++) {
                sb.append(i);
                this.f11006c[i] = new File(DiskLruCache.this.f10985a, sb.toString());
                sb.append(".tmp");
                this.f11007d[i] = new File(DiskLruCache.this.f10985a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: com.bumptech.glide.m.a$e */
    /* compiled from: DiskLruCache */
    public final class C1611e {

        /* renamed from: a */
        private final String f11012a;

        /* renamed from: b */
        private final long f11013b;

        /* renamed from: c */
        private final long[] f11014c;

        /* renamed from: d */
        private final File[] f11015d;

        /* synthetic */ C1611e(DiskLruCache aVar, String str, long j, File[] fileArr, long[] jArr, C1607a aVar2) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File mo9343a(int i) {
            return this.f11015d[i];
        }

        private C1611e(String str, long j, File[] fileArr, long[] jArr) {
            this.f11012a = str;
            this.f11013b = j;
            this.f11015d = fileArr;
            this.f11014c = jArr;
        }
    }

    private DiskLruCache(File file, int i, int i2, long j) {
        File file2 = file;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C1608b(null));
        this.f10997m = threadPoolExecutor;
        this.f10998n = new C1607a();
        this.f10985a = file2;
        this.f10989e = i;
        this.f10986b = new File(file2, "journal");
        this.f10987c = new File(file2, "journal.tmp");
        this.f10988d = new File(file2, "journal.bkp");
        this.f10991g = i2;
        this.f10990f = j;
    }

    /* renamed from: J */
    private void m13608J() {
        if (this.f10993i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    /* renamed from: K */
    private static void m13609K(Writer writer) throws IOException {
        if (VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m13610L(com.bumptech.glide.p165m.DiskLruCache.C1609c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.bumptech.glide.m.a$d r0 = r10.f11000a     // Catch:{ all -> 0x010e }
            com.bumptech.glide.m.a$c r1 = r0.f11009f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f11008e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.f10991g     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f11001b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo9341k(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.mo9336a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo9336a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f10991g     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo9341k(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo9340j(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f11005b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f11005b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f10992h     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f10992h = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            m13611N(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f10995k     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f10995k = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            r0.f11009f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f11008e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            r0.f11008e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10993i     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10993i     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10993i     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f11004a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10993i     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.mo9342l()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10993i     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f10996l     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f10996l = r1     // Catch:{ all -> 0x010e }
            r0.f11010g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r10 = r9.f10994j     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f11004a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10993i     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10993i     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10993i     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f11004a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10993i     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f10993i     // Catch:{ all -> 0x010e }
            m13613Q(r10)     // Catch:{ all -> 0x010e }
            long r10 = r9.f10992h     // Catch:{ all -> 0x010e }
            long r0 = r9.f10990f     // Catch:{ all -> 0x010e }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ff
            boolean r10 = r9.m13614S()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f10997m     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f10998n     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x0112
        L_0x0111:
            throw r10
        L_0x0112:
            goto L_0x0111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p165m.DiskLruCache.m13610L(com.bumptech.glide.m.a$c, boolean):void");
    }

    /* renamed from: N */
    private static void m13611N(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.bumptech.glide.p165m.DiskLruCache.C1609c m13612P(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m13608J()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r0 = r5.f10994j     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            com.bumptech.glide.m.a$d r0 = (com.bumptech.glide.p165m.DiskLruCache.C1610d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r1 = r0.f11010g     // Catch:{ all -> 0x005d }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r3
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            com.bumptech.glide.m.a$d r0 = new com.bumptech.glide.m.a$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r7 = r5.f10994j     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            com.bumptech.glide.m.a$c r7 = r0.f11009f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r3
        L_0x0034:
            com.bumptech.glide.m.a$c r7 = new com.bumptech.glide.m.a$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x005d }
            r0.f11009f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f10993i     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f10993i     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f10993i     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f10993i     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f10993i     // Catch:{ all -> 0x005d }
            m13613Q(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p165m.DiskLruCache.m13612P(java.lang.String, long):com.bumptech.glide.m.a$c");
    }

    @TargetApi(26)
    /* renamed from: Q */
    private static void m13613Q(Writer writer) throws IOException {
        if (VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public boolean m13614S() {
        int i = this.f10995k;
        return i >= 2000 && i >= this.f10994j.size();
    }

    /* renamed from: T */
    public static DiskLruCache m13615T(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m13620Z(file2, file3, false);
                }
            }
            DiskLruCache aVar = new DiskLruCache(file, i, i2, j);
            if (aVar.f10986b.exists()) {
                try {
                    aVar.m13617V();
                    aVar.m13616U();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(file);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    aVar.mo9328M();
                }
            }
            file.mkdirs();
            DiskLruCache aVar2 = new DiskLruCache(file, i, i2, j);
            aVar2.m13619X();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: U */
    private void m13616U() throws IOException {
        m13611N(this.f10987c);
        Iterator it = this.f10994j.values().iterator();
        while (it.hasNext()) {
            C1610d dVar = (C1610d) it.next();
            int i = 0;
            if (dVar.f11009f == null) {
                while (i < this.f10991g) {
                    this.f10992h += dVar.f11005b[i];
                    i++;
                }
            } else {
                dVar.f11009f = null;
                while (i < this.f10991g) {
                    m13611N(dVar.mo9340j(i));
                    m13611N(dVar.mo9341k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f10995k = r0 - r9.f10994j.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo9344D() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m13619X();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f10993i = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f10986b, true), com.bumptech.glide.p165m.C1613c.f11023a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13617V() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            com.bumptech.glide.m.b r1 = new com.bumptech.glide.m.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f10986b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.bumptech.glide.p165m.C1613c.f11023a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo9345E()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo9345E()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo9345E()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo9345E()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo9345E()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f10989e     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f10991g     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo9345E()     // Catch:{ EOFException -> 0x005f }
            r9.m13618W(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r2 = r9.f10994j     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f10995k = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo9344D()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m13619X()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f10986b     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = com.bumptech.glide.p165m.C1613c.f11023a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f10993i = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            com.bumptech.glide.p165m.C1613c.m13652a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            com.bumptech.glide.p165m.C1613c.m13652a(r1)
            goto L_0x00c0
        L_0x00bf:
            throw r0
        L_0x00c0:
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p165m.DiskLruCache.m13617V():void");
    }

    /* renamed from: W */
    private void m13618W(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        String str3 = "unexpected journal line: ";
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f10994j.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C1610d dVar = (C1610d) this.f10994j.get(str2);
            if (dVar == null) {
                dVar = new C1610d(this, str2, null);
                this.f10994j.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f11008e = true;
                dVar.f11009f = null;
                dVar.m13643n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f11009f = new C1609c(this, dVar, null);
            } else if (!(indexOf2 == -1 && indexOf == 4 && str.startsWith("READ"))) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(str);
                throw new IOException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(str);
        throw new IOException(sb2.toString());
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: X */
    public synchronized void m13619X() throws IOException {
        Writer writer = this.f10993i;
        if (writer != null) {
            m13609K(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10987c), C1613c.f11023a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write(SdkVersion.MINI_VERSION);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f10989e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f10991g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C1610d dVar : this.f10994j.values()) {
                if (dVar.f11009f != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(dVar.f11004a);
                    sb.append(10);
                    bufferedWriter.write(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(dVar.f11004a);
                    sb2.append(dVar.mo9342l());
                    sb2.append(10);
                    bufferedWriter.write(sb2.toString());
                }
            }
            m13609K(bufferedWriter);
            if (this.f10986b.exists()) {
                m13620Z(this.f10986b, this.f10988d, true);
            }
            m13620Z(this.f10987c, this.f10986b, false);
            this.f10988d.delete();
            this.f10993i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10986b, true), C1613c.f11023a));
        } catch (Throwable th) {
            m13609K(bufferedWriter);
            throw th;
        }
    }

    /* renamed from: Z */
    private static void m13620Z(File file, File file2, boolean z) throws IOException {
        if (z) {
            m13611N(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m13621a0() throws IOException {
        while (this.f10992h > this.f10990f) {
            mo9331Y((String) ((Entry) this.f10994j.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: M */
    public void mo9328M() throws IOException {
        close();
        C1613c.m13653b(this.f10985a);
    }

    /* renamed from: O */
    public C1609c mo9329O(String str) throws IOException {
        return m13612P(str, -1);
    }

    /* renamed from: R */
    public synchronized C1611e mo9330R(String str) throws IOException {
        m13608J();
        C1610d dVar = (C1610d) this.f10994j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f11008e) {
            return null;
        }
        for (File exists : dVar.f11006c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f10995k++;
        this.f10993i.append("READ");
        this.f10993i.append(' ');
        this.f10993i.append(str);
        this.f10993i.append(10);
        if (m13614S()) {
            this.f10997m.submit(this.f10998n);
        }
        C1611e eVar = new C1611e(this, str, dVar.f11010g, dVar.f11006c, dVar.f11005b, null);
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo9331Y(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m13608J()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r0 = r7.f10994j     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            com.bumptech.glide.m.a$d r0 = (com.bumptech.glide.p165m.DiskLruCache.C1610d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            com.bumptech.glide.m.a$c r2 = r0.f11009f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f10991g     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.mo9340j(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f10992h     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f11005b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f10992h = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f11005b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f10995k     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f10995k = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f10993i     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f10993i     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f10993i     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f10993i     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r0 = r7.f10994j     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.m13614S()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f10997m     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f10998n     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0093
        L_0x0092:
            throw r8
        L_0x0093:
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p165m.DiskLruCache.mo9331Y(java.lang.String):boolean");
    }

    public synchronized void close() throws IOException {
        if (this.f10993i != null) {
            Iterator it = new ArrayList(this.f10994j.values()).iterator();
            while (it.hasNext()) {
                C1610d dVar = (C1610d) it.next();
                if (dVar.f11009f != null) {
                    dVar.f11009f.mo9336a();
                }
            }
            m13621a0();
            m13609K(this.f10993i);
            this.f10993i = null;
        }
    }
}
