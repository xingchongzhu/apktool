package com.bumptech.glide.load.data;

import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.DataRewinder.C1423a;
import java.io.IOException;

public final class ParcelFileDescriptorRewinder implements DataRewinder<ParcelFileDescriptor> {

    /* renamed from: a */
    private final InternalRewinder f10291a;

    private static final class InternalRewinder {

        /* renamed from: a */
        private final ParcelFileDescriptor f10292a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f10292a = parcelFileDescriptor;
        }

        /* access modifiers changed from: 0000 */
        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f10292a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f10292a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C1421a implements C1423a<ParcelFileDescriptor> {
        /* renamed from: a */
        public Class<ParcelFileDescriptor> mo8777a() {
            return ParcelFileDescriptor.class;
        }

        /* renamed from: c */
        public DataRewinder<ParcelFileDescriptor> mo8778b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f10291a = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m12483c() {
        return VERSION.SDK_INT >= 21;
    }

    /* renamed from: b */
    public void mo8774b() {
    }

    /* renamed from: d */
    public ParcelFileDescriptor mo8773a() throws IOException {
        return this.f10291a.rewind();
    }
}
