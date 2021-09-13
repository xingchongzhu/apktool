package p010b.p034g.p040h;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import androidx.core.content.p007c.FontResourcesParserCompat;
import com.umeng.analytics.pro.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p010b.p034g.p040h.FontsContractCompat.C0593a;
import p010b.p034g.p040h.FontsContractCompat.C0594b;

/* renamed from: b.g.h.c */
class FontProvider {

    /* renamed from: a */
    private static final Comparator<byte[]> f4503a = new C0587a();

    /* renamed from: b.g.h.c$a */
    /* compiled from: FontProvider */
    class C0587a implements Comparator<byte[]> {
        C0587a() {
        }

        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length != bArr2.length) {
                i2 = bArr.length;
                i = bArr2.length;
            } else {
                int i3 = 0;
                while (i3 < bArr.length) {
                    if (bArr[i3] != bArr2[i3]) {
                        i2 = bArr[i3];
                        i = bArr2[i3];
                    } else {
                        i3++;
                    }
                }
                return 0;
            }
            return i2 - i;
        }
    }

    /* renamed from: a */
    private static List<byte[]> m5082a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m5083b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static List<List<byte[]>> m5084c(FontRequest dVar, Resources resources) {
        if (dVar.mo4878b() != null) {
            return dVar.mo4878b();
        }
        return FontResourcesParserCompat.m1787c(resources, dVar.mo4879c());
    }

    /* renamed from: d */
    static C0593a m5085d(Context context, FontRequest dVar, CancellationSignal cancellationSignal) throws NameNotFoundException {
        ProviderInfo e = m5086e(context.getPackageManager(), dVar, context.getResources());
        if (e == null) {
            return C0593a.m5109a(1, null);
        }
        return C0593a.m5109a(0, m5087f(context, dVar, e.authority, cancellationSignal));
    }

    /* renamed from: e */
    static ProviderInfo m5086e(PackageManager packageManager, FontRequest dVar, Resources resources) throws NameNotFoundException {
        String e = dVar.mo4881e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No package found for authority: ");
            sb.append(e);
            throw new NameNotFoundException(sb.toString());
        } else if (resolveContentProvider.packageName.equals(dVar.mo4882f())) {
            List a = m5082a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f4503a);
            List c = m5084c(dVar, resources);
            for (int i = 0; i < c.size(); i++) {
                ArrayList arrayList = new ArrayList((Collection) c.get(i));
                Collections.sort(arrayList, f4503a);
                if (m5083b(a, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found content provider ");
            sb2.append(e);
            sb2.append(", but package was not ");
            sb2.append(dVar.mo4882f());
            throw new NameNotFoundException(sb2.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    static C0594b[] m5087f(Context context, FontRequest dVar, String str, CancellationSignal cancellationSignal) {
        Cursor cursor;
        int i;
        Uri uri;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        String str3 = "content";
        Uri build = new Builder().scheme(str3).authority(str2).build();
        Uri build2 = new Builder().scheme(str3).authority(str2).appendPath("file").build();
        Cursor cursor2 = null;
        try {
            String[] strArr = {Constants.f16724d, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            if (VERSION.SDK_INT > 16) {
                cursor = context.getContentResolver().query(build, strArr, "query = ?", new String[]{dVar.mo4883g()}, null, cancellationSignal);
            } else {
                cursor = context.getContentResolver().query(build, strArr, "query = ?", new String[]{dVar.mo4883g()}, null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex(Constants.f16724d);
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i3 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        i = i2;
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i = i2;
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    arrayList2.add(C0594b.m5112a(uri, i3, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            if (cursor != null) {
                cursor.close();
            }
            return (C0594b[]) arrayList.toArray(new C0594b[0]);
        } catch (Throwable th) {
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }
}
