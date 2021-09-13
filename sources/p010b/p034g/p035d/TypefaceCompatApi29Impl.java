package p010b.p034g.p035d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily.Builder;
import android.graphics.fonts.FontStyle;
import androidx.core.content.p007c.FontResourcesParserCompat.C0253b;
import androidx.core.content.p007c.FontResourcesParserCompat.C0254c;
import java.io.IOException;
import java.io.InputStream;
import p010b.p034g.p040h.FontsContractCompat.C0594b;

/* renamed from: b.g.d.i */
public class TypefaceCompatApi29Impl extends TypefaceCompatBaseImpl {
    /* renamed from: b */
    public Typeface mo4850b(Context context, C0253b bVar, Resources resources, int i) {
        Typeface typeface = null;
        try {
            C0254c[] a = bVar.mo2168a();
            int length = a.length;
            int i2 = 0;
            Builder builder = null;
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (i3 >= length) {
                    break;
                }
                C0254c cVar = a[i3];
                try {
                    Font.Builder weight = new Font.Builder(resources, cVar.mo2170b()).setWeight(cVar.mo2173e());
                    if (!cVar.mo2174f()) {
                        i4 = 0;
                    }
                    Font build = weight.setSlant(i4).setTtcIndex(cVar.mo2171c()).setFontVariationSettings(cVar.mo2172d()).build();
                    if (builder == null) {
                        builder = new Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i3++;
            }
            if (builder == null) {
                return null;
            }
            int i5 = (i & 1) != 0 ? 700 : 400;
            if ((i & 2) != 0) {
                i2 = 1;
            }
            typeface = new CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
            return typeface;
        } catch (Exception unused2) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        if (r4 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        if ((r14 & 1) == 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        r12 = 700;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006b, code lost:
        r12 = 400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006f, code lost:
        if ((r14 & 2) == 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0071, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0086, code lost:
        return new android.graphics.Typeface.CustomFallbackBuilder(r4.build()).setStyle(new android.graphics.fonts.FontStyle(r12, r2)).build();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo4851c(android.content.Context r11, android.os.CancellationSignal r12, p010b.p034g.p040h.FontsContractCompat.C0594b[] r13, int r14) {
        /*
            r10 = this;
            android.content.ContentResolver r11 = r11.getContentResolver()
            r0 = 0
            int r1 = r13.length     // Catch:{ Exception -> 0x0087 }
            r2 = 0
            r4 = r0
            r3 = 0
        L_0x0009:
            r5 = 1
            if (r3 >= r1) goto L_0x005f
            r6 = r13[r3]     // Catch:{ Exception -> 0x0087 }
            android.net.Uri r7 = r6.mo4897d()     // Catch:{ IOException -> 0x005c }
            java.lang.String r8 = "r"
            android.os.ParcelFileDescriptor r7 = r11.openFileDescriptor(r7, r8, r12)     // Catch:{ IOException -> 0x005c }
            if (r7 != 0) goto L_0x0020
            if (r7 == 0) goto L_0x005c
        L_0x001c:
            r7.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x005c
        L_0x0020:
            android.graphics.fonts.Font$Builder r8 = new android.graphics.fonts.Font$Builder     // Catch:{ all -> 0x0052 }
            r8.<init>(r7)     // Catch:{ all -> 0x0052 }
            int r9 = r6.mo4898e()     // Catch:{ all -> 0x0052 }
            android.graphics.fonts.Font$Builder r8 = r8.setWeight(r9)     // Catch:{ all -> 0x0052 }
            boolean r9 = r6.mo4899f()     // Catch:{ all -> 0x0052 }
            if (r9 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            android.graphics.fonts.Font$Builder r5 = r8.setSlant(r5)     // Catch:{ all -> 0x0052 }
            int r6 = r6.mo4896c()     // Catch:{ all -> 0x0052 }
            android.graphics.fonts.Font$Builder r5 = r5.setTtcIndex(r6)     // Catch:{ all -> 0x0052 }
            android.graphics.fonts.Font r5 = r5.build()     // Catch:{ all -> 0x0052 }
            if (r4 != 0) goto L_0x004e
            android.graphics.fonts.FontFamily$Builder r6 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ all -> 0x0052 }
            r6.<init>(r5)     // Catch:{ all -> 0x0052 }
            r4 = r6
            goto L_0x001c
        L_0x004e:
            r4.addFont(r5)     // Catch:{ all -> 0x0052 }
            goto L_0x001c
        L_0x0052:
            r5 = move-exception
            r7.close()     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch:{ IOException -> 0x005c }
        L_0x005b:
            throw r5     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x005f:
            if (r4 != 0) goto L_0x0062
            return r0
        L_0x0062:
            android.graphics.fonts.FontStyle r11 = new android.graphics.fonts.FontStyle     // Catch:{ Exception -> 0x0087 }
            r12 = r14 & 1
            if (r12 == 0) goto L_0x006b
            r12 = 700(0x2bc, float:9.81E-43)
            goto L_0x006d
        L_0x006b:
            r12 = 400(0x190, float:5.6E-43)
        L_0x006d:
            r13 = r14 & 2
            if (r13 == 0) goto L_0x0072
            r2 = 1
        L_0x0072:
            r11.<init>(r12, r2)     // Catch:{ Exception -> 0x0087 }
            android.graphics.Typeface$CustomFallbackBuilder r12 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x0087 }
            android.graphics.fonts.FontFamily r13 = r4.build()     // Catch:{ Exception -> 0x0087 }
            r12.<init>(r13)     // Catch:{ Exception -> 0x0087 }
            android.graphics.Typeface$CustomFallbackBuilder r11 = r12.setStyle(r11)     // Catch:{ Exception -> 0x0087 }
            android.graphics.Typeface r11 = r11.build()     // Catch:{ Exception -> 0x0087 }
            return r11
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p034g.p035d.TypefaceCompatApi29Impl.mo4851c(android.content.Context, android.os.CancellationSignal, b.g.h.f$b[], int):android.graphics.Typeface");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface mo4861d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* renamed from: e */
    public Typeface mo4853e(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new CustomFallbackBuilder(new Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0594b mo4862h(C0594b[] bVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
