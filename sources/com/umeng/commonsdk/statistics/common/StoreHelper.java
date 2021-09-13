package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.umeng.commonsdk.statistics.common.d */
public final class StoreHelper {

    /* renamed from: a */
    private static StoreHelper f17683a = null;

    /* renamed from: b */
    private static Context f17684b = null;

    /* renamed from: c */
    private static String f17685c = null;

    /* renamed from: e */
    private static final String f17686e = "mobclick_agent_user_";

    /* renamed from: f */
    private static final String f17687f = "mobclick_agent_header_";

    /* renamed from: g */
    private static final String f17688g = "mobclick_agent_cached_";

    /* renamed from: d */
    private C3227a f17689d;

    /* renamed from: com.umeng.commonsdk.statistics.common.d$a */
    /* compiled from: StoreHelper */
    public static class C3227a {

        /* renamed from: a */
        private final int f17690a;

        /* renamed from: b */
        private File f17691b;

        /* renamed from: c */
        private FilenameFilter f17692c;

        public C3227a(Context context) {
            this(context, ".um");
        }

        /* renamed from: a */
        public boolean mo19326a() {
            File[] listFiles = this.f17691b.listFiles();
            return listFiles != null && listFiles.length > 0;
        }

        /* renamed from: b */
        public void mo19327b() {
            File[] listFiles = this.f17691b.listFiles(this.f17692c);
            if (listFiles != null && listFiles.length > 0) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }

        /* renamed from: c */
        public int mo19328c() {
            File[] listFiles = this.f17691b.listFiles(this.f17692c);
            if (listFiles == null || listFiles.length <= 0) {
                return 0;
            }
            return listFiles.length;
        }

        public C3227a(Context context, String str) {
            this.f17690a = 10;
            this.f17692c = new FilenameFilter() {
                public boolean accept(File file, String str) {
                    return str.startsWith("um");
                }
            };
            File file = new File(context.getFilesDir(), str);
            this.f17691b = file;
            if (!file.exists() || !this.f17691b.isDirectory()) {
                this.f17691b.mkdir();
            }
        }

        /* renamed from: a */
        public void mo19324a(C3229b bVar) {
            File file;
            File[] listFiles = this.f17691b.listFiles(this.f17692c);
            int i = 0;
            if (listFiles != null && listFiles.length >= 10) {
                Arrays.sort(listFiles);
                int length = listFiles.length - 10;
                for (int i2 = 0; i2 < length; i2++) {
                    listFiles[i2].delete();
                }
            }
            if (listFiles != null && listFiles.length > 0) {
                bVar.mo19330a(this.f17691b);
                int length2 = listFiles.length;
                while (i < length2) {
                    try {
                        if (bVar.mo19331b(listFiles[i])) {
                            file = listFiles[i];
                            file.delete();
                            i++;
                        } else {
                            i++;
                        }
                    } catch (Throwable unused) {
                        file = listFiles[i];
                    }
                }
                bVar.mo19332c(this.f17691b);
            }
        }

        /* renamed from: a */
        public void mo19325a(byte[] bArr) {
            if (bArr != null && bArr.length != 0) {
                try {
                    HelperUtils.writeFile(new File(this.f17691b, String.format(Locale.US, "um_cache_%d.env", new Object[]{Long.valueOf(System.currentTimeMillis())})), bArr);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.common.d$b */
    /* compiled from: StoreHelper */
    public interface C3229b {
        /* renamed from: a */
        void mo19330a(File file);

        /* renamed from: b */
        boolean mo19331b(File file);

        /* renamed from: c */
        void mo19332c(File file);
    }

    public StoreHelper(Context context) {
        this.f17689d = new C3227a(context);
    }

    /* renamed from: a */
    public static synchronized StoreHelper m22512a(Context context) {
        StoreHelper dVar;
        synchronized (StoreHelper.class) {
            f17684b = context.getApplicationContext();
            f17685c = context.getPackageName();
            if (f17683a == null) {
                f17683a = new StoreHelper(context);
            }
            dVar = f17683a;
        }
        return dVar;
    }

    /* renamed from: f */
    private SharedPreferences m22513f() {
        Context context = f17684b;
        StringBuilder sb = new StringBuilder();
        sb.append(f17686e);
        sb.append(f17685c);
        return context.getSharedPreferences(sb.toString(), 0);
    }

    /* renamed from: b */
    public String mo19320b() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f17684b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo19321c() {
        return UMFrUtils.envelopeFileNumber(f17684b) > 0;
    }

    /* renamed from: d */
    public String[] mo19322d() {
        try {
            SharedPreferences f = m22513f();
            String string = f.getString("au_p", null);
            String string2 = f.getString("au_u", null);
            if (!(string == null || string2 == null)) {
                return new String[]{string, string2};
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: e */
    public void mo19323e() {
        m22513f().edit().remove("au_p").remove("au_u").commit();
    }

    /* renamed from: a */
    public void mo19317a(int i) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f17684b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i).commit();
        }
    }

    /* renamed from: a */
    public int mo19316a() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f17684b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    /* renamed from: a */
    public void mo19318a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f17684b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    /* renamed from: a */
    public void mo19319a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Editor edit = m22513f().edit();
            edit.putString("au_p", str);
            edit.putString("au_u", str2);
            edit.commit();
        }
    }
}
