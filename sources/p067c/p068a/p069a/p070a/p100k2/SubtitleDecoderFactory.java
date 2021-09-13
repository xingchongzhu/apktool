package p067c.p068a.p069a.p070a.p100k2;

import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p100k2.p101n.Cea608Decoder;
import p067c.p068a.p069a.p070a.p100k2.p101n.Cea708Decoder;
import p067c.p068a.p069a.p070a.p100k2.p102o.DvbDecoder;
import p067c.p068a.p069a.p070a.p100k2.p103p.PgsDecoder;
import p067c.p068a.p069a.p070a.p100k2.p105r.SsaDecoder;
import p067c.p068a.p069a.p070a.p100k2.p106s.SubripDecoder;
import p067c.p068a.p069a.p070a.p100k2.p107t.TtmlDecoder;
import p067c.p068a.p069a.p070a.p100k2.p108u.Tx3gDecoder;
import p067c.p068a.p069a.p070a.p100k2.p109v.Mp4WebvttDecoder;
import p067c.p068a.p069a.p070a.p100k2.p109v.WebvttDecoder;

/* renamed from: c.a.a.a.k2.i */
public interface SubtitleDecoderFactory {

    /* renamed from: a */
    public static final SubtitleDecoderFactory f7742a = new C1120a();

    /* renamed from: c.a.a.a.k2.i$a */
    /* compiled from: SubtitleDecoderFactory */
    class C1120a implements SubtitleDecoderFactory {
        C1120a() {
        }

        /* renamed from: a */
        public boolean mo7064a(Format u0Var) {
            String str = u0Var.f8814l;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
        }

        /* renamed from: b */
        public SubtitleDecoder mo7065b(Format u0Var) {
            String str = u0Var.f8814l;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c = 8;
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c = 10;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new DvbDecoder(u0Var.f8816n);
                    case 1:
                        return new PgsDecoder();
                    case 2:
                        return new Mp4WebvttDecoder();
                    case 3:
                        return new WebvttDecoder();
                    case 4:
                        return new Tx3gDecoder(u0Var.f8816n);
                    case 5:
                        return new SsaDecoder(u0Var.f8816n);
                    case 6:
                    case 7:
                        return new Cea608Decoder(str, u0Var.f8800D, 16000);
                    case 8:
                        return new Cea708Decoder(u0Var.f8800D, u0Var.f8816n);
                    case 9:
                        return new SubripDecoder();
                    case 10:
                        return new TtmlDecoder();
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Attempted to create decoder for unsupported MIME type: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    boolean mo7064a(Format u0Var);

    /* renamed from: b */
    SubtitleDecoder mo7065b(Format u0Var);
}
