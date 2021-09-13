package p067c.p068a.p138c;

import java.util.Map;
import p067c.p068a.p138c.p139i.AztecWriter;
import p067c.p068a.p138c.p141j.BitMatrix;
import p067c.p068a.p138c.p143k.DataMatrixWriter;
import p067c.p068a.p138c.p145l.CodaBarWriter;
import p067c.p068a.p138c.p145l.Code128Writer;
import p067c.p068a.p138c.p145l.Code39Writer;
import p067c.p068a.p138c.p145l.Code93Writer;
import p067c.p068a.p138c.p145l.EAN13Writer;
import p067c.p068a.p138c.p145l.EAN8Writer;
import p067c.p068a.p138c.p145l.ITFWriter;
import p067c.p068a.p138c.p145l.UPCAWriter;
import p067c.p068a.p138c.p145l.UPCEWriter;
import p067c.p068a.p138c.p146m.PDF417Writer;
import p067c.p068a.p138c.p148n.QRCodeWriter;

/* renamed from: c.a.c.e */
public final class MultiFormatWriter implements Writer {

    /* renamed from: c.a.c.e$a */
    /* compiled from: MultiFormatWriter */
    static /* synthetic */ class C1395a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9956a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                c.a.c.a[] r0 = p067c.p068a.p138c.BarcodeFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9956a = r0
                c.a.c.a r1 = p067c.p068a.p138c.BarcodeFormat.EAN_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9956a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.a.c.a r1 = p067c.p068a.p138c.BarcodeFormat.UPC_E     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9956a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c.a.c.a r1 = p067c.p068a.p138c.BarcodeFormat.EAN_13     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9956a     // Catch:{ NoSuchFieldError -> 0x0033 }
                c.a.c.a r1 = p067c.p068a.p138c.BarcodeFormat.UPC_A     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9956a     // Catch:{ NoSuchFieldError -> 0x003e }
                c.a.c.a r1 = p067c.p068a.p138c.BarcodeFormat.QR_CODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9956a     // Catch:{ NoSuchFieldError -> 0x0049 }
                c.a.c.a r1 = p067c.p068a.p138c.BarcodeFormat.CODE_39     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f9956a     // Catch:{ NoSuchFieldError -> 0x0054 }
                c.a.c.a r1 = p067c.p068a.p138c.BarcodeFormat.CODE_93     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f9956a     // Catch:{ NoSuchFieldError -> 0x0060 }
                c.a.c.a r1 = p067c.p068a.p138c.BarcodeFormat.CODE_128     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f9956a     // Catch:{ NoSuchFieldError -> 0x006c }
                c.a.c.a r1 = p067c.p068a.p138c.BarcodeFormat.ITF     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f9956a     // Catch:{ NoSuchFieldError -> 0x0078 }
                c.a.c.a r1 = p067c.p068a.p138c.BarcodeFormat.PDF_417     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f9956a     // Catch:{ NoSuchFieldError -> 0x0084 }
                c.a.c.a r1 = p067c.p068a.p138c.BarcodeFormat.CODABAR     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f9956a     // Catch:{ NoSuchFieldError -> 0x0090 }
                c.a.c.a r1 = p067c.p068a.p138c.BarcodeFormat.DATA_MATRIX     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f9956a     // Catch:{ NoSuchFieldError -> 0x009c }
                c.a.c.a r1 = p067c.p068a.p138c.BarcodeFormat.AZTEC     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p138c.MultiFormatWriter.C1395a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public BitMatrix mo8526a(String str, BarcodeFormat aVar, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        Writer gVar;
        switch (C1395a.f9956a[aVar.ordinal()]) {
            case 1:
                gVar = new EAN8Writer();
                break;
            case 2:
                gVar = new UPCEWriter();
                break;
            case 3:
                gVar = new EAN13Writer();
                break;
            case 4:
                gVar = new UPCAWriter();
                break;
            case 5:
                gVar = new QRCodeWriter();
                break;
            case 6:
                gVar = new Code39Writer();
                break;
            case 7:
                gVar = new Code93Writer();
                break;
            case 8:
                gVar = new Code128Writer();
                break;
            case 9:
                gVar = new ITFWriter();
                break;
            case 10:
                gVar = new PDF417Writer();
                break;
            case 11:
                gVar = new CodaBarWriter();
                break;
            case 12:
                gVar = new DataMatrixWriter();
                break;
            case 13:
                gVar = new AztecWriter();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return gVar.mo8526a(str, aVar, i, i2, map);
    }
}
