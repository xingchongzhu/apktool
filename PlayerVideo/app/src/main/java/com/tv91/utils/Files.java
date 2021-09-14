package com.tv91.utils;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: com.tv91.utils.c */
public final class Files {
    /* renamed from: a */
    public static void m20561a(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws IOException {
        FileChannel channel = fileInputStream.getChannel();
        FileChannel channel2 = fileOutputStream.getChannel();
        long size = channel.size();
        long j = 0;
        while (j < size) {
            long j2 = size - j;
            j += channel2.transferFrom(channel, j, j2 > 33554432 ? 33554432 : j2);
        }
        fileInputStream.close();
        fileOutputStream.close();
        channel.close();
        channel2.close();
    }

    /* renamed from: b */
    public static File m20562b(Context context) {
        return m20563c(context, Environment.DIRECTORY_DOWNLOADS);
    }

    /* renamed from: c */
    private static File m20563c(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        boolean equals = "cache".equals(str);
        File file = m20565e() ? equals ? applicationContext.getExternalCacheDir() : applicationContext.getExternalFilesDir(str) : null;
        if (file == null) {
            file = equals ? applicationContext.getCacheDir() : new File(applicationContext.getFilesDir(), str);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: d */
    public static File m20564d(Context context) {
        return m20563c(context, Environment.DIRECTORY_MOVIES);
    }

    /* renamed from: e */
    private static boolean m20565e() {
        return "mounted".equals(Environment.getExternalStorageState()) || Environment.isExternalStorageRemovable();
    }
}
