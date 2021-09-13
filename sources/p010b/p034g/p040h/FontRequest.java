package p010b.p034g.p040h;

import android.util.Base64;
import java.util.List;
import p010b.p034g.p042j.Preconditions;

/* renamed from: b.g.h.d */
public final class FontRequest {

    /* renamed from: a */
    private final String f4504a;

    /* renamed from: b */
    private final String f4505b;

    /* renamed from: c */
    private final String f4506c;

    /* renamed from: d */
    private final List<List<byte[]>> f4507d;

    /* renamed from: e */
    private final int f4508e = 0;

    /* renamed from: f */
    private final String f4509f;

    public FontRequest(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f4504a = (String) Preconditions.m5188e(str);
        this.f4505b = (String) Preconditions.m5188e(str2);
        this.f4506c = (String) Preconditions.m5188e(str3);
        this.f4507d = (List) Preconditions.m5188e(list);
        this.f4509f = m5089a(str, str2, str3);
    }

    /* renamed from: a */
    private String m5089a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        String str4 = "-";
        sb.append(str4);
        sb.append(str2);
        sb.append(str4);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: b */
    public List<List<byte[]>> mo4878b() {
        return this.f4507d;
    }

    /* renamed from: c */
    public int mo4879c() {
        return this.f4508e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public String mo4880d() {
        return this.f4509f;
    }

    /* renamed from: e */
    public String mo4881e() {
        return this.f4504a;
    }

    /* renamed from: f */
    public String mo4882f() {
        return this.f4505b;
    }

    /* renamed from: g */
    public String mo4883g() {
        return this.f4506c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: ");
        sb2.append(this.f4504a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.f4505b);
        sb2.append(", mQuery: ");
        sb2.append(this.f4506c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.f4507d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f4507d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("mCertificatesArray: ");
        sb3.append(this.f4508e);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
