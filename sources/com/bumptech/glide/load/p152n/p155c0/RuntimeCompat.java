package com.bumptech.glide.load.p152n.p155c0;

import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.bumptech.glide.load.n.c0.b */
final class RuntimeCompat {

    /* renamed from: com.bumptech.glide.load.n.c0.b$a */
    /* compiled from: RuntimeCompat */
    class C1474a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f10472a;

        C1474a(Pattern pattern) {
            this.f10472a = pattern;
        }

        public boolean accept(File file, String str) {
            return this.f10472a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    static int m12814a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return VERSION.SDK_INT < 17 ? Math.max(m12815b(), availableProcessors) : availableProcessors;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private static int m12815b() {
        File[] fileArr;
        String str = "GlideRuntimeCompat";
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File("/sys/devices/system/cpu/").listFiles(new C1474a(Pattern.compile("cpu[0-9]+")));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
