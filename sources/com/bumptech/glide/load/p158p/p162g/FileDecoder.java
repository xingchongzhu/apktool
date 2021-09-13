package com.bumptech.glide.load.p158p.p162g;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.p152n.Resource;
import java.io.File;

/* renamed from: com.bumptech.glide.load.p.g.a */
public class FileDecoder implements ResourceDecoder<File, File> {
    /* renamed from: c */
    public Resource<File> mo8839a(File file, int i, int i2, Options iVar) {
        return new FileResource(file);
    }

    /* renamed from: d */
    public boolean mo8840b(File file, Options iVar) {
        return true;
    }
}
