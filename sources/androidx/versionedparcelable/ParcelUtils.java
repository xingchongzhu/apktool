package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.Parcelable;
import com.umeng.analytics.pro.UMCommonContent;

/* renamed from: androidx.versionedparcelable.a */
public class ParcelUtils {
    private ParcelUtils() {
    }

    /* renamed from: a */
    public static <T extends VersionedParcelable> T m4005a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl) parcelable).mo3940l();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    /* renamed from: b */
    public static <T extends VersionedParcelable> T m4006b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(ParcelUtils.class.getClassLoader());
            return m4005a(bundle2.getParcelable(UMCommonContent.f16622at));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
