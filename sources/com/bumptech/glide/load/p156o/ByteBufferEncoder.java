package com.bumptech.glide.load.p156o;

import android.util.Log;
import com.bumptech.glide.load.C1420d;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.p174t.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.o.c */
public class ByteBufferEncoder implements C1420d<ByteBuffer> {
    /* renamed from: c */
    public boolean mo8772a(ByteBuffer byteBuffer, File file, Options iVar) {
        try {
            ByteBufferUtil.m14051e(byteBuffer, file);
            return true;
        } catch (IOException e) {
            String str = "ByteBufferEncoder";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to write data", e);
            }
            return false;
        }
    }
}
