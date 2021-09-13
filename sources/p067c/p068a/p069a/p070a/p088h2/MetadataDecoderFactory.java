package p067c.p068a.p069a.p070a.p088h2;

import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p088h2.p089i.AppInfoTableDecoder;
import p067c.p068a.p069a.p070a.p088h2.p090j.EventMessageDecoder;
import p067c.p068a.p069a.p070a.p088h2.p092l.IcyDecoder;
import p067c.p068a.p069a.p070a.p088h2.p093m.Id3Decoder;
import p067c.p068a.p069a.p070a.p088h2.p095o.SpliceInfoDecoder;

/* renamed from: c.a.a.a.h2.d */
public interface MetadataDecoderFactory {

    /* renamed from: a */
    public static final MetadataDecoderFactory f7222a = new C1036a();

    /* renamed from: c.a.a.a.h2.d$a */
    /* compiled from: MetadataDecoderFactory */
    class C1036a implements MetadataDecoderFactory {
        C1036a() {
        }

        /* renamed from: a */
        public boolean mo6562a(Format u0Var) {
            String str = u0Var.f8814l;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        /* renamed from: b */
        public MetadataDecoder mo6563b(Format u0Var) {
            String str = u0Var.f8814l;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new AppInfoTableDecoder();
                    case 1:
                        return new IcyDecoder();
                    case 2:
                        return new Id3Decoder();
                    case 3:
                        return new EventMessageDecoder();
                    case 4:
                        return new SpliceInfoDecoder();
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Attempted to create decoder for unsupported MIME type: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    boolean mo6562a(Format u0Var);

    /* renamed from: b */
    MetadataDecoder mo6563b(Format u0Var);
}
