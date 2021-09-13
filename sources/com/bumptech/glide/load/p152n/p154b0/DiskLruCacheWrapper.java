package com.bumptech.glide.load.p152n.p154b0;

import android.util.Log;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.p152n.p154b0.DiskCache.C1456b;
import com.bumptech.glide.p165m.DiskLruCache;
import com.bumptech.glide.p165m.DiskLruCache.C1609c;
import com.bumptech.glide.p165m.DiskLruCache.C1611e;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.n.b0.e */
public class DiskLruCacheWrapper implements DiskCache {

    /* renamed from: a */
    private final SafeKeyGenerator f10418a;

    /* renamed from: b */
    private final File f10419b;

    /* renamed from: c */
    private final long f10420c;

    /* renamed from: d */
    private final DiskCacheWriteLocker f10421d = new DiskCacheWriteLocker();

    /* renamed from: e */
    private DiskLruCache f10422e;

    @Deprecated
    protected DiskLruCacheWrapper(File file, long j) {
        this.f10419b = file;
        this.f10420c = j;
        this.f10418a = new SafeKeyGenerator();
    }

    /* renamed from: c */
    public static DiskCache m12760c(File file, long j) {
        return new DiskLruCacheWrapper(file, j);
    }

    /* renamed from: d */
    private synchronized DiskLruCache m12761d() throws IOException {
        if (this.f10422e == null) {
            this.f10422e = DiskLruCache.m13615T(this.f10419b, 1, 1, this.f10420c);
        }
        return this.f10422e;
    }

    /* renamed from: a */
    public void mo8912a(Key gVar, C1456b bVar) {
        C1609c O;
        String str = "DiskLruCacheWrapper";
        String b = this.f10418a.mo8937b(gVar);
        this.f10421d.mo8916a(b);
        try {
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Put: Obtained: ");
                sb.append(b);
                sb.append(" for for Key: ");
                sb.append(gVar);
                Log.v(str, sb.toString());
            }
            try {
                DiskLruCache d = m12761d();
                if (d.mo9330R(b) == null) {
                    O = d.mo9329O(b);
                    if (O != null) {
                        if (bVar.mo8915a(O.mo9339f(0))) {
                            O.mo9338e();
                        }
                        O.mo9337b();
                        this.f10421d.mo8917b(b);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Had two simultaneous puts for: ");
                    sb2.append(b);
                    throw new IllegalStateException(sb2.toString());
                }
            } catch (IOException e) {
                if (Log.isLoggable(str, 5)) {
                    Log.w(str, "Unable to put to disk cache", e);
                }
            } catch (Throwable th) {
                O.mo9337b();
                throw th;
            }
        } finally {
            this.f10421d.mo8917b(b);
        }
    }

    /* renamed from: b */
    public File mo8913b(Key gVar) {
        String b = this.f10418a.mo8937b(gVar);
        String str = "DiskLruCacheWrapper";
        if (Log.isLoggable(str, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(b);
            sb.append(" for for Key: ");
            sb.append(gVar);
            Log.v(str, sb.toString());
        }
        try {
            C1611e R = m12761d().mo9330R(b);
            if (R != null) {
                return R.mo9343a(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable(str, 5)) {
                return null;
            }
            Log.w(str, "Unable to get from disk cache", e);
            return null;
        }
    }
}
