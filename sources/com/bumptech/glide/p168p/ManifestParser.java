package com.bumptech.glide.p168p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: com.bumptech.glide.p.d */
public final class ManifestParser {

    /* renamed from: a */
    private final Context f11111a;

    public ManifestParser(Context context) {
        this.f11111a = context;
    }

    /* renamed from: b */
    private static GlideModule m13815b(String str) {
        try {
            Class cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e) {
                m13816c(cls, e);
            } catch (IllegalAccessException e2) {
                m13816c(cls, e2);
            } catch (NoSuchMethodException e3) {
                m13816c(cls, e3);
            } catch (InvocationTargetException e4) {
                m13816c(cls, e4);
            }
            if (obj instanceof GlideModule) {
                return (GlideModule) obj;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected instanceof GlideModule, but found: ");
            sb.append(obj);
            throw new RuntimeException(sb.toString());
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* renamed from: c */
    private static void m13816c(Class<?> cls, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to instantiate GlideModule implementation for ");
        sb.append(cls);
        throw new RuntimeException(sb.toString(), exc);
    }

    /* renamed from: a */
    public List<GlideModule> mo9427a() {
        String str = "ManifestParser";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f11111a.getPackageManager().getApplicationInfo(this.f11111a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Got null app info metadata");
                }
                return arrayList;
            }
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got app info metadata: ");
                sb.append(applicationInfo.metaData);
                Log.v(str, sb.toString());
            }
            for (String str2 : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str2))) {
                    arrayList.add(m13815b(str2));
                    if (Log.isLoggable(str, 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Loaded Glide module: ");
                        sb2.append(str2);
                        Log.d(str, sb2.toString());
                    }
                }
            }
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Finished loading Glide modules");
            }
            return arrayList;
        } catch (NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }
}
