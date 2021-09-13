package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.upstream.i */
public final class ContentDataSource extends BaseDataSource {

    /* renamed from: f */
    private final ContentResolver f12328f;

    /* renamed from: g */
    private Uri f12329g;

    /* renamed from: h */
    private AssetFileDescriptor f12330h;

    /* renamed from: i */
    private FileInputStream f12331i;

    /* renamed from: j */
    private long f12332j;

    /* renamed from: k */
    private boolean f12333k;

    /* renamed from: com.google.android.exoplayer2.upstream.i$a */
    /* compiled from: ContentDataSource */
    public static class C1914a extends IOException {
        public C1914a(IOException iOException) {
            super(iOException);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f12328f = context.getContentResolver();
    }

    /* renamed from: b */
    public int mo6195b(byte[] bArr, int i, int i2) throws C1914a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f12332j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C1914a(e);
            }
        }
        int read = ((FileInputStream) Util.m10293i(this.f12331i)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f12332j;
            if (j2 != -1) {
                this.f12332j = j2 - ((long) read);
            }
            mo14935r(read);
            return read;
        } else if (this.f12332j == -1) {
            return -1;
        } else {
            throw new C1914a(new EOFException());
        }
    }

    public void close() throws C1914a {
        this.f12329g = null;
        try {
            FileInputStream fileInputStream = this.f12331i;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f12331i = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f12330h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f12330h = null;
                if (this.f12333k) {
                    this.f12333k = false;
                    mo14936s();
                }
            } catch (IOException e) {
                throw new C1914a(e);
            } catch (Throwable th) {
                this.f12330h = null;
                if (this.f12333k) {
                    this.f12333k = false;
                    mo14936s();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C1914a(e2);
        } catch (Throwable th2) {
            this.f12331i = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f12330h;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f12330h = null;
                if (this.f12333k) {
                    this.f12333k = false;
                    mo14936s();
                }
                throw th2;
            } catch (IOException e3) {
                throw new C1914a(e3);
            } catch (Throwable th3) {
                this.f12330h = null;
                if (this.f12333k) {
                    this.f12333k = false;
                    mo14936s();
                }
                throw th3;
            }
        }
    }

    /* renamed from: e */
    public long mo7015e(DataSpec pVar) throws C1914a {
        try {
            Uri uri = pVar.f12345a;
            this.f12329g = uri;
            mo14937t(pVar);
            AssetFileDescriptor openAssetFileDescriptor = this.f12328f.openAssetFileDescriptor(uri, "r");
            this.f12330h = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f12331i = fileInputStream;
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(pVar.f12351g + startOffset) - startOffset;
                if (skip == pVar.f12351g) {
                    long j = pVar.f12352h;
                    if (j != -1) {
                        this.f12332j = j;
                    } else {
                        long length = openAssetFileDescriptor.getLength();
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.f12332j = -1;
                            } else {
                                long position = size - channel.position();
                                this.f12332j = position;
                                if (position < 0) {
                                    throw new EOFException();
                                }
                            }
                        } else {
                            long j2 = length - skip;
                            this.f12332j = j2;
                            if (j2 < 0) {
                                throw new EOFException();
                            }
                        }
                    }
                    this.f12333k = true;
                    mo14938u(pVar);
                    return this.f12332j;
                }
                throw new EOFException();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not open file descriptor for: ");
            sb.append(uri);
            throw new FileNotFoundException(sb.toString());
        } catch (IOException e) {
            throw new C1914a(e);
        }
    }

    /* renamed from: l */
    public Uri mo7018l() {
        return this.f12329g;
    }
}
