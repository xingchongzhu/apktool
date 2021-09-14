package com.tv91.p255z.p257h;

import android.content.Context;
import android.net.Uri;
import com.tv91.model.DownloadRecord;
import com.tv91.model.User;
import com.tv91.p211s.DownloadException;
import com.tv91.p255z.DownloadApi;
import com.tv91.utils.FragmentUtils;
import com.tv91.utils.Files;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p010b.p034g.p042j.Consumer;
import okhttp3.C3378z.C3379a;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p295h.p296a.Timber;

/* renamed from: com.tv91.z.h.a */
public final class WebDownloadApi implements DownloadApi {

    /* renamed from: a */
    private final Context f16194a;

    /* renamed from: b */
    private final OkHttpClient f16195b;

    /* renamed from: c */
    private final Object f16196c = new Object();

    /* renamed from: d */
    private final Map<String, C3064a> f16197d = new ConcurrentHashMap();

    /* renamed from: com.tv91.z.h.a$a */
    /* compiled from: WebDownloadApi */
    class C3070a implements Callback {

        /* renamed from: a */
        final /* synthetic */ Consumer f16198a;

        /* renamed from: b */
        final /* synthetic */ DownloadRecord f16199b;

        /* renamed from: c */
        final /* synthetic */ String f16200c;

        /* renamed from: d */
        final /* synthetic */ long f16201d;

        /* renamed from: e */
        final /* synthetic */ File f16202e;

        /* renamed from: f */
        final /* synthetic */ long f16203f;

        /* renamed from: g */
        final /* synthetic */ Consumer f16204g;

        C3070a(Consumer aVar, DownloadRecord aVar2, String str, long j, File file, long j2, Consumer aVar3) {
            this.f16198a = aVar;
            this.f16199b = aVar2;
            this.f16200c = str;
            this.f16201d = j;
            this.f16202e = file;
            this.f16203f = j2;
            this.f16204g = aVar3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00be, code lost:
            if (r3 != null) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c4, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            r1.addSuppressed(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c8, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cb, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cc, code lost:
            if (r11 != null) goto L_0x00ce;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
            r11.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d6, code lost:
            throw r2;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo18704a(Call r10, okhttp3.Response r11) {
            /*
                r9 = this;
                boolean r0 = r11.mo19666I()
                if (r0 != 0) goto L_0x003c
                int r10 = r11.mo19661D()
                r0 = 600(0x258, float:8.41E-43)
                if (r10 < r0) goto L_0x0029
                if (r10 != r0) goto L_0x0013
                java.lang.String r10 = "600"
                goto L_0x001c
            L_0x0013:
                r11 = 666(0x29a, float:9.33E-43)
                if (r10 != r11) goto L_0x001a
                java.lang.String r10 = "666"
                goto L_0x001c
            L_0x001a:
                java.lang.String r10 = "601"
            L_0x001c:
                b.g.j.a r11 = r9.f16198a
                com.tv91.s.b r0 = new com.tv91.s.b
                com.tv91.model.a r1 = r9.f16199b
                r0.<init>(r10, r1)
                r11.mo4887a(r0)
                goto L_0x003b
            L_0x0029:
                b.g.j.a r10 = r9.f16198a
                com.tv91.s.g r0 = new com.tv91.s.g
                int r1 = r11.mo19661D()
                java.lang.String r11 = r11.mo19667J()
                r0.<init>(r1, r11)
                r10.mo4887a(r0)
            L_0x003b:
                return
            L_0x003c:
                e.c0 r11 = r11.mo19659B()
                if (r11 != 0) goto L_0x004f
                b.g.j.a r10 = r9.f16198a
                java.io.IOException r11 = new java.io.IOException
                java.lang.String r0 = "response body is null"
                r11.<init>(r0)
                r10.mo4887a(r11)
                return
            L_0x004f:
                com.tv91.z.h.a$b r0 = new com.tv91.z.h.a$b
                com.tv91.z.h.a r1 = com.tv91.p255z.p257h.WebDownloadApi.this
                java.lang.String r2 = r9.f16200c
                com.tv91.z.c$a r1 = r1.m20909j(r2)
                long r2 = r9.f16201d
                r0.<init>(r1, r2)
                r1 = 2000(0x7d0, double:9.88E-321)
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
                r0.mo18707b(r1, r3)
                long r1 = r9.f16201d
                f.e r11 = r11.mo19692H()     // Catch:{ Exception -> 0x00d7 }
                java.io.File r3 = r9.f16202e     // Catch:{ all -> 0x00c9 }
                f.r r3 = p281f.Okio.m23918a(r3)     // Catch:{ all -> 0x00c9 }
                f.d r3 = p281f.Okio.m23919b(r3)     // Catch:{ all -> 0x00c9 }
            L_0x0075:
                f.c r4 = r3.mo20196c()     // Catch:{ all -> 0x00bb }
                r5 = 8192(0x2000, double:4.0474E-320)
                long r4 = r11.mo19739t(r4, r5)     // Catch:{ all -> 0x00bb }
                r6 = -1
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 == 0) goto L_0x00aa
                r3.mo20206h()     // Catch:{ all -> 0x00bb }
                long r1 = r1 + r4
                r0.mo18708c(r1)     // Catch:{ all -> 0x00bb }
                long r4 = r9.f16203f     // Catch:{ all -> 0x00bb }
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x0075
                r0.mo18706a()     // Catch:{ all -> 0x00bb }
                b.g.j.a r1 = r9.f16198a     // Catch:{ all -> 0x00bb }
                com.tv91.s.b r2 = new com.tv91.s.b     // Catch:{ all -> 0x00bb }
                java.lang.String r4 = "Download-Corrupt"
                com.tv91.model.a r5 = r9.f16199b     // Catch:{ all -> 0x00bb }
                r2.<init>(r4, r5)     // Catch:{ all -> 0x00bb }
                r1.mo4887a(r2)     // Catch:{ all -> 0x00bb }
                r3.close()     // Catch:{ all -> 0x00c9 }
                r11.close()     // Catch:{ Exception -> 0x00d7 }
                return
            L_0x00aa:
                r0.mo18706a()     // Catch:{ all -> 0x00bb }
                b.g.j.a r1 = r9.f16204g     // Catch:{ all -> 0x00bb }
                java.io.File r2 = r9.f16202e     // Catch:{ all -> 0x00bb }
                r1.mo4887a(r2)     // Catch:{ all -> 0x00bb }
                r3.close()     // Catch:{ all -> 0x00c9 }
                r11.close()     // Catch:{ Exception -> 0x00d7 }
                goto L_0x00e6
            L_0x00bb:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x00bd }
            L_0x00bd:
                r2 = move-exception
                if (r3 == 0) goto L_0x00c8
                r3.close()     // Catch:{ all -> 0x00c4 }
                goto L_0x00c8
            L_0x00c4:
                r3 = move-exception
                r1.addSuppressed(r3)     // Catch:{ all -> 0x00c9 }
            L_0x00c8:
                throw r2     // Catch:{ all -> 0x00c9 }
            L_0x00c9:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x00cb }
            L_0x00cb:
                r2 = move-exception
                if (r11 == 0) goto L_0x00d6
                r11.close()     // Catch:{ all -> 0x00d2 }
                goto L_0x00d6
            L_0x00d2:
                r11 = move-exception
                r1.addSuppressed(r11)     // Catch:{ Exception -> 0x00d7 }
            L_0x00d6:
                throw r2     // Catch:{ Exception -> 0x00d7 }
            L_0x00d7:
                r11 = move-exception
                r0.mo18706a()
                boolean r10 = r10.mo19719V()
                if (r10 != 0) goto L_0x00e6
                b.g.j.a r10 = r9.f16198a
                r10.mo4887a(r11)
            L_0x00e6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tv91.p255z.p257h.WebDownloadApi.C3070a.mo18704a(e.e, e.b0):void");
        }

        /* renamed from: b */
        public void mo18705b(Call eVar, IOException iOException) {
            if (!eVar.mo19719V()) {
                this.f16198a.mo4887a(iOException);
            }
        }
    }

    /* renamed from: com.tv91.z.h.a$b */
    /* compiled from: WebDownloadApi */
    private static class C3071b implements Runnable {

        /* renamed from: a */
        private final ScheduledExecutorService f16206a = Executors.newSingleThreadScheduledExecutor();

        /* renamed from: b */
        private final C3064a f16207b;

        /* renamed from: c */
        private ScheduledFuture<?> f16208c;

        /* renamed from: d */
        private long f16209d;

        public C3071b(C3064a aVar, long j) {
            this.f16207b = aVar;
            this.f16209d = j;
        }

        /* renamed from: a */
        public void mo18706a() {
            this.f16208c.cancel(false);
        }

        /* renamed from: b */
        public void mo18707b(long j, TimeUnit timeUnit) {
            this.f16208c = this.f16206a.scheduleAtFixedRate(this, 0, j, timeUnit);
        }

        /* renamed from: c */
        public void mo18708c(long j) {
            this.f16209d = j;
        }

        public void run() {
            C3064a aVar = this.f16207b;
            if (aVar != null) {
                aVar.mo17541a(Long.valueOf(this.f16209d));
            }
        }
    }

    public WebDownloadApi(Context context, OkHttpClient wVar) {
        this.f16194a = context;
        this.f16195b = wVar;
    }

    /* renamed from: i */
    private HttpUrl m20908i(HttpUrl tVar, User user) {
        return tVar.mo20077p().mo20082a("MemberId", user.f14097id).mo20082a("Token", user.token).mo20083b();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public C3064a m20909j(String str) {
        C3064a aVar;
        synchronized (this.f16196c) {
            aVar = (C3064a) Collections.unmodifiableMap(this.f16197d).get(str);
        }
        return aVar;
    }

    /* renamed from: k */
    private boolean m20910k(HttpUrl tVar) {
        for (Call S : this.f16195b.mo20109h().mo20017h()) {
            if (m20912m(S.mo19716S().mo20147i()).equals(tVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    private boolean m20911l(HttpUrl tVar) {
        for (Call S : this.f16195b.mo20109h().mo20018i()) {
            if (m20912m(S.mo19716S().mo20147i()).equals(tVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    private HttpUrl m20912m(HttpUrl tVar) {
        return tVar.mo20077p().mo20091r("MemberId").mo20091r("Token").mo20083b();
    }

    /* renamed from: a */
    public void mo18684a(DownloadRecord aVar) {
        synchronized (this.f16196c) {
            this.f16197d.remove(aVar.f14102d.url);
        }
    }

    /* renamed from: b */
    public void mo18685b(DownloadRecord aVar, FileDescriptor fileDescriptor, String str) throws Exception {
        File file = new File(Uri.parse(aVar.f14103e).getPath());
        if (file.exists()) {
            Files.m20561a(new FileInputStream(file), new FileOutputStream(fileDescriptor));
            file.delete();
            return;
        }
        throw new IOException("Source file doesn't exist");
    }

    /* renamed from: c */
    public void mo18686c(DownloadRecord aVar) {
        Iterator it = this.f16195b.mo20109h().mo20018i().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Call eVar = (Call) it.next();
            String str = aVar.f14102d.url;
            Objects.requireNonNull(str);
            if (m20912m(eVar.mo19716S().mo20147i()).equals(HttpUrl.m23636r(str))) {
                eVar.cancel();
                break;
            }
        }
        if (!FragmentUtils.m20586g(aVar.f14103e)) {
            Uri parse = Uri.parse(aVar.f14103e);
            String str2 = "Fail to delete file: %s";
            if (FragmentUtils.m20581b("file", parse.getScheme()) && !new File(parse.getPath()).delete()) {
                Timber.m24040b(str2, aVar.f14103e);
            }
            if (FragmentUtils.m20581b("content", parse.getScheme()) && this.f16194a.getContentResolver().delete(parse, null, null) <= 0) {
                Timber.m24040b(str2, aVar.f14103e);
            }
        }
    }

    /* renamed from: d */
    public void mo18687d(DownloadRecord aVar) {
        for (Call eVar : this.f16195b.mo20109h().mo20018i()) {
            String str = aVar.f14102d.url;
            Objects.requireNonNull(str);
            if (m20912m(eVar.mo19716S().mo20147i()).equals(HttpUrl.m23636r(str))) {
                eVar.cancel();
                return;
            }
        }
    }

    /* renamed from: e */
    public void mo18688e(DownloadRecord aVar, C3064a aVar2) {
        synchronized (this.f16196c) {
            if (aVar2 != null) {
                this.f16197d.put(aVar.f14102d.url, aVar2);
            }
        }
    }

    /* renamed from: f */
    public void mo18689f(DownloadRecord aVar, Consumer<File> aVar2, Consumer<Exception> aVar3) {
        DownloadRecord aVar4 = aVar;
        Consumer<Exception> aVar5 = aVar3;
        if (FragmentUtils.m20586g(aVar4.f14103e)) {
            aVar5.mo4887a(new IllegalArgumentException("file path is empty"));
            return;
        }
        File file = new File(Uri.parse(aVar4.f14103e).getPath());
        long j = aVar4.f14101c.fileSize;
        long length = file.exists() ? file.length() : 0;
        String str = "Download-Corrupt";
        if (length > j) {
            aVar5.mo4887a(new DownloadException(str, aVar));
        } else if (length == j) {
            aVar2.mo4887a(file);
        } else {
            Consumer<File> aVar6 = aVar2;
            String str2 = aVar4.f14102d.url;
            Objects.requireNonNull(str2);
            String str3 = str2;
            HttpUrl i = m20908i(HttpUrl.m23634l(str3), aVar4.f14100b);
            if (m20911l(i) || m20910k(i)) {
                aVar5.mo4887a(new DownloadException(str, aVar));
                return;
            }
            C3379a l = new C3379a().mo20151c().mo20160l(i);
            StringBuilder sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(length);
            sb.append("-");
            Call q = this.f16195b.mo20118q(l.mo20149a("Range", sb.toString()).mo20150b());
            C3070a aVar7 = new C3070a(aVar3, aVar, str3, length, file, j, aVar2);
            q.mo19717T(aVar7);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (r1 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r9.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0073, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0076, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0077, code lost:
        if (r0 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r9.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0081, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x009b, code lost:
        if (r8 != null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a1, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a2, code lost:
        r9.addSuppressed(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a6, code lost:
        throw r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public File mo18690g(String r8, File r9) throws Exception {
        /*
            r7 = this;
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x0015
            boolean r0 = r9.delete()
            if (r0 == 0) goto L_0x000d
            goto L_0x0015
        L_0x000d:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "Fail to delete file. No Access right?"
            r8.<init>(r9)
            throw r8
        L_0x0015:
            e.z$a r0 = new e.z$a
            r0.<init>()
            e.z$a r8 = r0.mo20159k(r8)
            e.z$a r8 = r8.mo20151c()
            e.z r8 = r8.mo20150b()
            e.w r0 = r7.f16195b
            e.e r8 = r0.mo20118q(r8)
            e.b0 r8 = r8.mo19718U()
            boolean r0 = r8.mo19666I()     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x008a
            e.c0 r0 = r8.mo19659B()     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0082
            f.e r0 = r0.mo19692H()     // Catch:{ all -> 0x0098 }
            f.r r1 = p281f.Okio.m23922e(r9)     // Catch:{ all -> 0x0074 }
            f.d r1 = p281f.Okio.m23919b(r1)     // Catch:{ all -> 0x0074 }
        L_0x0048:
            f.c r2 = r1.mo20196c()     // Catch:{ all -> 0x0066 }
            r3 = 8192(0x2000, double:4.0474E-320)
            long r2 = r0.mo19739t(r2, r3)     // Catch:{ all -> 0x0066 }
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x005c
            r1.mo20206h()     // Catch:{ all -> 0x0066 }
            goto L_0x0048
        L_0x005c:
            r1.close()     // Catch:{ all -> 0x0074 }
            r0.close()     // Catch:{ all -> 0x0098 }
            r8.close()
            return r9
        L_0x0066:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r2 = move-exception
            if (r1 == 0) goto L_0x0073
            r1.close()     // Catch:{ all -> 0x006f }
            goto L_0x0073
        L_0x006f:
            r1 = move-exception
            r9.addSuppressed(r1)     // Catch:{ all -> 0x0074 }
        L_0x0073:
            throw r2     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r1 = move-exception
            if (r0 == 0) goto L_0x0081
            r0.close()     // Catch:{ all -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r0 = move-exception
            r9.addSuppressed(r0)     // Catch:{ all -> 0x0098 }
        L_0x0081:
            throw r1     // Catch:{ all -> 0x0098 }
        L_0x0082:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "response body is null"
            r9.<init>(r0)     // Catch:{ all -> 0x0098 }
            throw r9     // Catch:{ all -> 0x0098 }
        L_0x008a:
            com.tv91.s.g r9 = new com.tv91.s.g     // Catch:{ all -> 0x0098 }
            int r0 = r8.mo19661D()     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = r8.mo19667J()     // Catch:{ all -> 0x0098 }
            r9.<init>(r0, r1)     // Catch:{ all -> 0x0098 }
            throw r9     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x009a }
        L_0x009a:
            r0 = move-exception
            if (r8 == 0) goto L_0x00a5
            r8.close()     // Catch:{ all -> 0x00a1 }
            goto L_0x00a5
        L_0x00a1:
            r8 = move-exception
            r9.addSuppressed(r8)
        L_0x00a5:
            goto L_0x00a7
        L_0x00a6:
            throw r0
        L_0x00a7:
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tv91.p255z.p257h.WebDownloadApi.mo18690g(java.lang.String, java.io.File):java.io.File");
    }
}
