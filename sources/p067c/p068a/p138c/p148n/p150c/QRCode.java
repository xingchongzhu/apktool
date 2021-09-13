package p067c.p068a.p138c.p148n.p150c;

import com.p259uc.crashsdk.export.CrashStatKey;
import p067c.p068a.p138c.p148n.p149b.ErrorCorrectionLevel;
import p067c.p068a.p138c.p148n.p149b.Mode;
import p067c.p068a.p138c.p148n.p149b.Version;

/* renamed from: c.a.c.n.c.f */
public final class QRCode {

    /* renamed from: a */
    private Mode f10172a;

    /* renamed from: b */
    private ErrorCorrectionLevel f10173b;

    /* renamed from: c */
    private Version f10174c;

    /* renamed from: d */
    private int f10175d = -1;

    /* renamed from: e */
    private ByteMatrix f10176e;

    /* renamed from: b */
    public static boolean m12374b(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: a */
    public ByteMatrix mo8675a() {
        return this.f10176e;
    }

    /* renamed from: c */
    public void mo8676c(ErrorCorrectionLevel aVar) {
        this.f10173b = aVar;
    }

    /* renamed from: d */
    public void mo8677d(int i) {
        this.f10175d = i;
    }

    /* renamed from: e */
    public void mo8678e(ByteMatrix bVar) {
        this.f10176e = bVar;
    }

    /* renamed from: f */
    public void mo8679f(Mode bVar) {
        this.f10172a = bVar;
    }

    /* renamed from: g */
    public void mo8680g(Version cVar) {
        this.f10174c = cVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(CrashStatKey.LOG_LEGACY_TMP_FILE);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f10172a);
        sb.append("\n ecLevel: ");
        sb.append(this.f10173b);
        sb.append("\n version: ");
        sb.append(this.f10174c);
        sb.append("\n maskPattern: ");
        sb.append(this.f10175d);
        if (this.f10176e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f10176e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
