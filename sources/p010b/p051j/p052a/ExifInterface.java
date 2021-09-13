package p010b.p051j.p052a;

import android.content.res.AssetManager.AssetInputStream;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.fasterxml.jackson.core.JsonPointer;
import com.p259uc.crashsdk.export.LogType;
import com.umeng.analytics.pro.TType;
import com.umeng.commonsdk.stateless.UMSLNetWorkSender;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* renamed from: b.j.a.a */
public class ExifInterface {

    /* renamed from: A */
    private static SimpleDateFormat f4820A;

    /* renamed from: B */
    static final String[] f4821B = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: C */
    static final int[] f4822C = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: D */
    static final byte[] f4823D = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: E */
    private static final C0685d[] f4824E;

    /* renamed from: F */
    private static final C0685d[] f4825F;

    /* renamed from: G */
    private static final C0685d[] f4826G;

    /* renamed from: H */
    private static final C0685d[] f4827H;

    /* renamed from: I */
    private static final C0685d[] f4828I;

    /* renamed from: J */
    private static final C0685d f4829J = new C0685d("StripOffsets", UMSLNetWorkSender.f17621a, 3);

    /* renamed from: K */
    private static final C0685d[] f4830K;

    /* renamed from: L */
    private static final C0685d[] f4831L;

    /* renamed from: M */
    private static final C0685d[] f4832M;

    /* renamed from: N */
    private static final C0685d[] f4833N;

    /* renamed from: O */
    static final C0685d[][] f4834O;

    /* renamed from: P */
    private static final C0685d[] f4835P = {new C0685d("SubIFDPointer", 330, 4), new C0685d("ExifIFDPointer", 34665, 4), new C0685d("GPSInfoIFDPointer", 34853, 4), new C0685d("InteroperabilityIFDPointer", 40965, 4), new C0685d("CameraSettingsIFDPointer", 8224, 1), new C0685d("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: Q */
    private static final C0685d f4836Q = new C0685d("JPEGInterchangeFormat", 513, 4);

    /* renamed from: R */
    private static final C0685d f4837R = new C0685d("JPEGInterchangeFormatLength", 514, 4);

    /* renamed from: S */
    private static final HashMap<Integer, C0685d>[] f4838S;

    /* renamed from: T */
    private static final HashMap<String, C0685d>[] f4839T;

    /* renamed from: U */
    private static final HashSet<String> f4840U = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: V */
    private static final HashMap<Integer, Integer> f4841V = new HashMap<>();

    /* renamed from: W */
    static final Charset f4842W;

    /* renamed from: X */
    static final byte[] f4843X;

    /* renamed from: Y */
    private static final byte[] f4844Y;

    /* renamed from: Z */
    private static final Pattern f4845Z = Pattern.compile(".*[1-9].*");

    /* renamed from: a */
    private static final boolean f4846a = Log.isLoggable("ExifInterface", 3);

    /* renamed from: a0 */
    private static final Pattern f4847a0 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");

    /* renamed from: b */
    private static final List<Integer> f4848b;

    /* renamed from: c */
    private static final List<Integer> f4849c;

    /* renamed from: d */
    public static final int[] f4850d = {8, 8, 8};

    /* renamed from: e */
    public static final int[] f4851e = {4};

    /* renamed from: f */
    public static final int[] f4852f = {8};

    /* renamed from: g */
    static final byte[] f4853g = {-1, -40, -1};

    /* renamed from: h */
    private static final byte[] f4854h = {102, 116, 121, 112};

    /* renamed from: i */
    private static final byte[] f4855i = {109, 105, 102, 49};

    /* renamed from: j */
    private static final byte[] f4856j = {104, 101, 105, 99};

    /* renamed from: k */
    private static final byte[] f4857k = {79, 76, 89, 77, 80, 0};

    /* renamed from: l */
    private static final byte[] f4858l = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: m */
    private static final byte[] f4859m = {-119, 80, 78, 71, TType.f16862k, 10, 26, 10};

    /* renamed from: n */
    private static final byte[] f4860n = {101, 88, 73, 102};

    /* renamed from: o */
    private static final byte[] f4861o = {73, 72, 68, 82};

    /* renamed from: p */
    private static final byte[] f4862p = {73, 69, 78, 68};

    /* renamed from: q */
    private static final byte[] f4863q = {82, 73, 70, 70};

    /* renamed from: r */
    private static final byte[] f4864r = {87, 69, 66, 80};

    /* renamed from: s */
    private static final byte[] f4865s = {69, 88, 73, 70};

    /* renamed from: t */
    private static final byte[] f4866t = {-99, 1, 42};

    /* renamed from: u */
    private static final byte[] f4867u = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: v */
    private static final byte[] f4868v = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: w */
    private static final byte[] f4869w = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: x */
    private static final byte[] f4870x = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: y */
    private static final byte[] f4871y = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: z */
    private static final byte[] f4872z = "XMP ".getBytes(Charset.defaultCharset());

    /* renamed from: b0 */
    private String f4873b0;

    /* renamed from: c0 */
    private FileDescriptor f4874c0;

    /* renamed from: d0 */
    private AssetInputStream f4875d0;

    /* renamed from: e0 */
    private int f4876e0;

    /* renamed from: f0 */
    private boolean f4877f0;

    /* renamed from: g0 */
    private final HashMap<String, C0684c>[] f4878g0;

    /* renamed from: h0 */
    private Set<Integer> f4879h0;

    /* renamed from: i0 */
    private ByteOrder f4880i0;

    /* renamed from: j0 */
    private boolean f4881j0;

    /* renamed from: k0 */
    private boolean f4882k0;

    /* renamed from: l0 */
    private boolean f4883l0;

    /* renamed from: m0 */
    private int f4884m0;

    /* renamed from: n0 */
    private int f4885n0;

    /* renamed from: o0 */
    private byte[] f4886o0;

    /* renamed from: p0 */
    private int f4887p0;

    /* renamed from: q0 */
    private int f4888q0;

    /* renamed from: r0 */
    private int f4889r0;

    /* renamed from: s0 */
    private int f4890s0;

    /* renamed from: t0 */
    private int f4891t0;

    /* renamed from: u0 */
    private int f4892u0;

    /* renamed from: v0 */
    private boolean f4893v0;

    /* renamed from: w0 */
    private boolean f4894w0;

    /* renamed from: b.j.a.a$a */
    /* compiled from: ExifInterface */
    class C0682a extends MediaDataSource {

        /* renamed from: a */
        long f4895a;

        /* renamed from: b */
        final /* synthetic */ C0683b f4896b;

        C0682a(C0683b bVar) {
            this.f4896b = bVar;
        }

        public void close() throws IOException {
        }

        public long getSize() throws IOException {
            return -1;
        }

        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f4895a;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.f4896b.available())) {
                        return -1;
                    }
                    this.f4896b.mo5262E(j);
                    this.f4895a = j;
                }
                if (i2 > this.f4896b.available()) {
                    i2 = this.f4896b.available();
                }
                int read = this.f4896b.read(bArr, i, i2);
                if (read >= 0) {
                    this.f4895a += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f4895a = -1;
            return -1;
        }
    }

    /* renamed from: b.j.a.a$b */
    /* compiled from: ExifInterface */
    private static class C0683b extends InputStream implements DataInput {

        /* renamed from: a */
        private static final ByteOrder f4898a = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: b */
        private static final ByteOrder f4899b = ByteOrder.BIG_ENDIAN;

        /* renamed from: c */
        private DataInputStream f4900c;

        /* renamed from: d */
        private ByteOrder f4901d;

        /* renamed from: e */
        final int f4902e;

        /* renamed from: f */
        int f4903f;

        public C0683b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: B */
        public int mo5259B() {
            return this.f4902e;
        }

        /* renamed from: C */
        public int mo5260C() {
            return this.f4903f;
        }

        /* renamed from: D */
        public long mo5261D() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        /* renamed from: E */
        public void mo5262E(long j) throws IOException {
            int i = this.f4903f;
            if (((long) i) > j) {
                this.f4903f = 0;
                this.f4900c.reset();
                this.f4900c.mark(this.f4902e);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        /* renamed from: F */
        public void mo5263F(ByteOrder byteOrder) {
            this.f4901d = byteOrder;
        }

        public int available() throws IOException {
            return this.f4900c.available();
        }

        public int read() throws IOException {
            this.f4903f++;
            return this.f4900c.read();
        }

        public boolean readBoolean() throws IOException {
            this.f4903f++;
            return this.f4900c.readBoolean();
        }

        public byte readByte() throws IOException {
            int i = this.f4903f + 1;
            this.f4903f = i;
            if (i <= this.f4902e) {
                int read = this.f4900c.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() throws IOException {
            this.f4903f += 2;
            return this.f4900c.readChar();
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f4903f + i2;
            this.f4903f = i3;
            if (i3 > this.f4902e) {
                throw new EOFException();
            } else if (this.f4900c.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() throws IOException {
            int i = this.f4903f + 4;
            this.f4903f = i;
            if (i <= this.f4902e) {
                int read = this.f4900c.read();
                int read2 = this.f4900c.read();
                int read3 = this.f4900c.read();
                int read4 = this.f4900c.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f4901d;
                    if (byteOrder == f4898a) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f4899b) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.f4901d);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() throws IOException {
            int i = this.f4903f + 8;
            this.f4903f = i;
            if (i <= this.f4902e) {
                int read = this.f4900c.read();
                int read2 = this.f4900c.read();
                int read3 = this.f4900c.read();
                int read4 = this.f4900c.read();
                int read5 = this.f4900c.read();
                int read6 = this.f4900c.read();
                int read7 = this.f4900c.read();
                int read8 = this.f4900c.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f4901d;
                    if (byteOrder == f4898a) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i2 = read2;
                    if (byteOrder == f4899b) {
                        return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.f4901d);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() throws IOException {
            int i = this.f4903f + 2;
            this.f4903f = i;
            if (i <= this.f4902e) {
                int read = this.f4900c.read();
                int read2 = this.f4900c.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f4901d;
                    if (byteOrder == f4898a) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f4899b) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.f4901d);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() throws IOException {
            this.f4903f += 2;
            return this.f4900c.readUTF();
        }

        public int readUnsignedByte() throws IOException {
            this.f4903f++;
            return this.f4900c.readUnsignedByte();
        }

        public int readUnsignedShort() throws IOException {
            int i = this.f4903f + 2;
            this.f4903f = i;
            if (i <= this.f4902e) {
                int read = this.f4900c.read();
                int read2 = this.f4900c.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f4901d;
                    if (byteOrder == f4898a) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f4899b) {
                        return (read << 8) + read2;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.f4901d);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.f4902e - this.f4903f);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f4900c.skipBytes(min - i2);
            }
            this.f4903f += i2;
            return i2;
        }

        C0683b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f4901d = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f4900c = dataInputStream;
            int available = dataInputStream.available();
            this.f4902e = available;
            this.f4903f = 0;
            this.f4900c.mark(available);
            this.f4901d = byteOrder;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f4900c.read(bArr, i, i2);
            this.f4903f += read;
            return read;
        }

        public void readFully(byte[] bArr) throws IOException {
            int length = this.f4903f + bArr.length;
            this.f4903f = length;
            if (length > this.f4902e) {
                throw new EOFException();
            } else if (this.f4900c.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public C0683b(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }
    }

    /* renamed from: b.j.a.a$c */
    /* compiled from: ExifInterface */
    private static class C0684c {

        /* renamed from: a */
        public final int f4904a;

        /* renamed from: b */
        public final int f4905b;

        /* renamed from: c */
        public final long f4906c;

        /* renamed from: d */
        public final byte[] f4907d;

        C0684c(int i, int i2, byte[] bArr) {
            this(i, i2, -1, bArr);
        }

        /* renamed from: a */
        public static C0684c m5837a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(0);
            byte[] bytes = sb.toString().getBytes(ExifInterface.f4842W);
            return new C0684c(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C0684c m5838b(long j, ByteOrder byteOrder) {
            return m5839c(new long[]{j}, byteOrder);
        }

        /* renamed from: c */
        public static C0684c m5839c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.f4822C[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C0684c(4, jArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C0684c m5840d(C0686e eVar, ByteOrder byteOrder) {
            return m5841e(new C0686e[]{eVar}, byteOrder);
        }

        /* renamed from: e */
        public static C0684c m5841e(C0686e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.f4822C[5] * eVarArr.length)]);
            wrap.order(byteOrder);
            for (C0686e eVar : eVarArr) {
                wrap.putInt((int) eVar.f4912a);
                wrap.putInt((int) eVar.f4913b);
            }
            return new C0684c(5, eVarArr.length, wrap.array());
        }

        /* renamed from: f */
        public static C0684c m5842f(int i, ByteOrder byteOrder) {
            return m5843g(new int[]{i}, byteOrder);
        }

        /* renamed from: g */
        public static C0684c m5843g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.f4822C[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C0684c(3, iArr.length, wrap.array());
        }

        /* renamed from: h */
        public double mo5282h(ByteOrder byteOrder) {
            Object k = mo5285k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (k instanceof String) {
                return Double.parseDouble((String) k);
            } else {
                String str = "There are more than one component";
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (k instanceof double[]) {
                    double[] dArr = (double[]) k;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (k instanceof C0686e[]) {
                    C0686e[] eVarArr = (C0686e[]) k;
                    if (eVarArr.length == 1) {
                        return eVarArr[0].mo5288a();
                    }
                    throw new NumberFormatException(str);
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: i */
        public int mo5283i(ByteOrder byteOrder) {
            Object k = mo5285k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (k instanceof String) {
                return Integer.parseInt((String) k);
            } else {
                String str = "There are more than one component";
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException(str);
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: j */
        public String mo5284j(ByteOrder byteOrder) {
            Object k = mo5285k(byteOrder);
            if (k == null) {
                return null;
            }
            if (k instanceof String) {
                return (String) k;
            }
            StringBuilder sb = new StringBuilder();
            String str = ",";
            int i = 0;
            if (k instanceof long[]) {
                long[] jArr = (long[]) k;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            } else if (k instanceof int[]) {
                int[] iArr = (int[]) k;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            } else if (k instanceof double[]) {
                double[] dArr = (double[]) k;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            } else if (!(k instanceof C0686e[])) {
                return null;
            } else {
                C0686e[] eVarArr = (C0686e[]) k;
                while (i < eVarArr.length) {
                    sb.append(eVarArr[i].f4912a);
                    sb.append(JsonPointer.SEPARATOR);
                    sb.append(eVarArr[i].f4913b);
                    i++;
                    if (i != eVarArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x01a3 A[SYNTHETIC, Splitter:B:164:0x01a3] */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo5285k(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                b.j.a.a$b r3 = new b.j.a.a$b     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                byte[] r4 = r10.f4907d     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                r3.<init>(r4)     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                r3.mo5263F(r11)     // Catch:{ IOException -> 0x0189 }
                int r11 = r10.f4904a     // Catch:{ IOException -> 0x0189 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x0148;
                    case 2: goto L_0x00fd;
                    case 3: goto L_0x00e3;
                    case 4: goto L_0x00c9;
                    case 5: goto L_0x00a6;
                    case 6: goto L_0x0148;
                    case 7: goto L_0x00fd;
                    case 8: goto L_0x008c;
                    case 9: goto L_0x0072;
                    case 10: goto L_0x004d;
                    case 11: goto L_0x0032;
                    case 12: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ IOException -> 0x0189 }
            L_0x0016:
                goto L_0x0180
            L_0x0018:
                int r11 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x001c:
                int r4 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0029
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x001c
            L_0x0029:
                r3.close()     // Catch:{ IOException -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0031:
                return r11
            L_0x0032:
                int r11 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0036:
                int r4 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0044
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0189 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0036
            L_0x0044:
                r3.close()     // Catch:{ IOException -> 0x0048 }
                goto L_0x004c
            L_0x0048:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004c:
                return r11
            L_0x004d:
                int r11 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                b.j.a.a$e[] r11 = new p010b.p051j.p052a.ExifInterface.C0686e[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0051:
                int r4 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0069
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0189 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0189 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0189 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0189 }
                b.j.a.a$e r4 = new b.j.a.a$e     // Catch:{ IOException -> 0x0189 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0051
            L_0x0069:
                r3.close()     // Catch:{ IOException -> 0x006d }
                goto L_0x0071
            L_0x006d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0071:
                return r11
            L_0x0072:
                int r11 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0076:
                int r4 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0083
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0076
            L_0x0083:
                r3.close()     // Catch:{ IOException -> 0x0087 }
                goto L_0x008b
            L_0x0087:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008b:
                return r11
            L_0x008c:
                int r11 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0090:
                int r4 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x009d
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0090
            L_0x009d:
                r3.close()     // Catch:{ IOException -> 0x00a1 }
                goto L_0x00a5
            L_0x00a1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a5:
                return r11
            L_0x00a6:
                int r11 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                b.j.a.a$e[] r11 = new p010b.p051j.p052a.ExifInterface.C0686e[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x00aa:
                int r4 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x00c0
                long r6 = r3.mo5261D()     // Catch:{ IOException -> 0x0189 }
                long r8 = r3.mo5261D()     // Catch:{ IOException -> 0x0189 }
                b.j.a.a$e r4 = new b.j.a.a$e     // Catch:{ IOException -> 0x0189 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x00aa
            L_0x00c0:
                r3.close()     // Catch:{ IOException -> 0x00c4 }
                goto L_0x00c8
            L_0x00c4:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c8:
                return r11
            L_0x00c9:
                int r11 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x00cd:
                int r4 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x00da
                long r6 = r3.mo5261D()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x00cd
            L_0x00da:
                r3.close()     // Catch:{ IOException -> 0x00de }
                goto L_0x00e2
            L_0x00de:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e2:
                return r11
            L_0x00e3:
                int r11 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x00e7:
                int r4 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x00f4
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x00e7
            L_0x00f4:
                r3.close()     // Catch:{ IOException -> 0x00f8 }
                goto L_0x00fc
            L_0x00f8:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fc:
                return r11
            L_0x00fd:
                int r11 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                byte[] r6 = p010b.p051j.p052a.ExifInterface.f4823D     // Catch:{ IOException -> 0x0189 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0189 }
                if (r11 < r6) goto L_0x011a
                r11 = 0
            L_0x0105:
                byte[] r6 = p010b.p051j.p052a.ExifInterface.f4823D     // Catch:{ IOException -> 0x0189 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0189 }
                if (r11 >= r7) goto L_0x0117
                byte[] r7 = r10.f4907d     // Catch:{ IOException -> 0x0189 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0189 }
                byte r8 = r6[r11]     // Catch:{ IOException -> 0x0189 }
                if (r7 == r8) goto L_0x0114
                r4 = 0
                goto L_0x0117
            L_0x0114:
                int r11 = r11 + 1
                goto L_0x0105
            L_0x0117:
                if (r4 == 0) goto L_0x011a
                int r5 = r6.length     // Catch:{ IOException -> 0x0189 }
            L_0x011a:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0189 }
                r11.<init>()     // Catch:{ IOException -> 0x0189 }
            L_0x011f:
                int r4 = r10.f4905b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x013b
                byte[] r4 = r10.f4907d     // Catch:{ IOException -> 0x0189 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0189 }
                if (r4 != 0) goto L_0x012a
                goto L_0x013b
            L_0x012a:
                r6 = 32
                if (r4 < r6) goto L_0x0133
                char r4 = (char) r4     // Catch:{ IOException -> 0x0189 }
                r11.append(r4)     // Catch:{ IOException -> 0x0189 }
                goto L_0x0138
            L_0x0133:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0189 }
            L_0x0138:
                int r5 = r5 + 1
                goto L_0x011f
            L_0x013b:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0189 }
                r3.close()     // Catch:{ IOException -> 0x0143 }
                goto L_0x0147
            L_0x0143:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0147:
                return r11
            L_0x0148:
                byte[] r11 = r10.f4907d     // Catch:{ IOException -> 0x0189 }
                int r6 = r11.length     // Catch:{ IOException -> 0x0189 }
                if (r6 != r4) goto L_0x016e
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0189 }
                if (r6 < 0) goto L_0x016e
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0189 }
                if (r11 > r4) goto L_0x016e
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0189 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0189 }
                byte[] r6 = r10.f4907d     // Catch:{ IOException -> 0x0189 }
                byte r6 = r6[r5]     // Catch:{ IOException -> 0x0189 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0189 }
                r4[r5] = r6     // Catch:{ IOException -> 0x0189 }
                r11.<init>(r4)     // Catch:{ IOException -> 0x0189 }
                r3.close()     // Catch:{ IOException -> 0x0169 }
                goto L_0x016d
            L_0x0169:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x016d:
                return r11
            L_0x016e:
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0189 }
                byte[] r4 = r10.f4907d     // Catch:{ IOException -> 0x0189 }
                java.nio.charset.Charset r5 = p010b.p051j.p052a.ExifInterface.f4842W     // Catch:{ IOException -> 0x0189 }
                r11.<init>(r4, r5)     // Catch:{ IOException -> 0x0189 }
                r3.close()     // Catch:{ IOException -> 0x017b }
                goto L_0x017f
            L_0x017b:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x017f:
                return r11
            L_0x0180:
                r3.close()     // Catch:{ IOException -> 0x0184 }
                goto L_0x0188
            L_0x0184:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0188:
                return r2
            L_0x0189:
                r11 = move-exception
                goto L_0x018f
            L_0x018b:
                r11 = move-exception
                goto L_0x01a1
            L_0x018d:
                r11 = move-exception
                r3 = r2
            L_0x018f:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x019f }
                if (r3 == 0) goto L_0x019e
                r3.close()     // Catch:{ IOException -> 0x019a }
                goto L_0x019e
            L_0x019a:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x019e:
                return r2
            L_0x019f:
                r11 = move-exception
                r2 = r3
            L_0x01a1:
                if (r2 == 0) goto L_0x01ab
                r2.close()     // Catch:{ IOException -> 0x01a7 }
                goto L_0x01ab
            L_0x01a7:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01ab:
                goto L_0x01ad
            L_0x01ac:
                throw r11
            L_0x01ad:
                goto L_0x01ac
            */
            throw new UnsupportedOperationException("Method not decompiled: p010b.p051j.p052a.ExifInterface.C0684c.mo5285k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(ExifInterface.f4821B[this.f4904a]);
            sb.append(", data length:");
            sb.append(this.f4907d.length);
            sb.append(")");
            return sb.toString();
        }

        C0684c(int i, int i2, long j, byte[] bArr) {
            this.f4904a = i;
            this.f4905b = i2;
            this.f4906c = j;
            this.f4907d = bArr;
        }
    }

    /* renamed from: b.j.a.a$d */
    /* compiled from: ExifInterface */
    static class C0685d {

        /* renamed from: a */
        public final int f4908a;

        /* renamed from: b */
        public final String f4909b;

        /* renamed from: c */
        public final int f4910c;

        /* renamed from: d */
        public final int f4911d;

        C0685d(String str, int i, int i2) {
            this.f4909b = str;
            this.f4908a = i;
            this.f4910c = i2;
            this.f4911d = -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5287a(int i) {
            int i2 = this.f4910c;
            if (!(i2 == 7 || i == 7 || i2 == i)) {
                int i3 = this.f4911d;
                if (i3 != i) {
                    if ((i2 == 4 || i3 == 4) && i == 3) {
                        return true;
                    }
                    if ((i2 == 9 || i3 == 9) && i == 8) {
                        return true;
                    }
                    if ((i2 == 12 || i3 == 12) && i == 11) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }

        C0685d(String str, int i, int i2, int i3) {
            this.f4909b = str;
            this.f4908a = i;
            this.f4910c = i2;
            this.f4911d = i3;
        }
    }

    /* renamed from: b.j.a.a$e */
    /* compiled from: ExifInterface */
    private static class C0686e {

        /* renamed from: a */
        public final long f4912a;

        /* renamed from: b */
        public final long f4913b;

        C0686e(long j, long j2) {
            if (j2 == 0) {
                this.f4912a = 0;
                this.f4913b = 1;
                return;
            }
            this.f4912a = j;
            this.f4913b = j2;
        }

        /* renamed from: a */
        public double mo5288a() {
            double d = (double) this.f4912a;
            double d2 = (double) this.f4913b;
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4912a);
            sb.append("/");
            sb.append(this.f4913b);
            return sb.toString();
        }
    }

    static {
        C0685d[] dVarArr;
        Integer valueOf = Integer.valueOf(3);
        Integer valueOf2 = Integer.valueOf(1);
        Integer valueOf3 = Integer.valueOf(2);
        Integer valueOf4 = Integer.valueOf(8);
        f4848b = Arrays.asList(new Integer[]{valueOf2, Integer.valueOf(6), valueOf, valueOf4});
        Integer valueOf5 = Integer.valueOf(7);
        Integer valueOf6 = Integer.valueOf(5);
        f4849c = Arrays.asList(new Integer[]{valueOf3, valueOf5, Integer.valueOf(4), valueOf6});
        C0685d[] dVarArr2 = {new C0685d("NewSubfileType", 254, 4), new C0685d("SubfileType", 255, 4), new C0685d("ImageWidth", LogType.UNEXP, 3, 4), new C0685d("ImageLength", 257, 3, 4), new C0685d("BitsPerSample", 258, 3), new C0685d("Compression", 259, 3), new C0685d("PhotometricInterpretation", 262, 3), new C0685d("ImageDescription", 270, 2), new C0685d("Make", 271, 2), new C0685d("Model", 272, 2), new C0685d("StripOffsets", UMSLNetWorkSender.f17621a, 3, 4), new C0685d("Orientation", 274, 3), new C0685d("SamplesPerPixel", 277, 3), new C0685d("RowsPerStrip", 278, 3, 4), new C0685d("StripByteCounts", 279, 3, 4), new C0685d("XResolution", 282, 5), new C0685d("YResolution", 283, 5), new C0685d("PlanarConfiguration", 284, 3), new C0685d("ResolutionUnit", 296, 3), new C0685d("TransferFunction", 301, 3), new C0685d("Software", 305, 2), new C0685d("DateTime", 306, 2), new C0685d("Artist", 315, 2), new C0685d("WhitePoint", 318, 5), new C0685d("PrimaryChromaticities", 319, 5), new C0685d("SubIFDPointer", 330, 4), new C0685d("JPEGInterchangeFormat", 513, 4), new C0685d("JPEGInterchangeFormatLength", 514, 4), new C0685d("YCbCrCoefficients", 529, 5), new C0685d("YCbCrSubSampling", 530, 3), new C0685d("YCbCrPositioning", 531, 3), new C0685d("ReferenceBlackWhite", 532, 5), new C0685d("Copyright", 33432, 2), new C0685d("ExifIFDPointer", 34665, 4), new C0685d("GPSInfoIFDPointer", 34853, 4), new C0685d("SensorTopBorder", 4, 4), new C0685d("SensorLeftBorder", 5, 4), new C0685d("SensorBottomBorder", 6, 4), new C0685d("SensorRightBorder", 7, 4), new C0685d("ISO", 23, 3), new C0685d("JpgFromRaw", 46, 7), new C0685d("Xmp", 700, 1)};
        f4824E = dVarArr2;
        C0685d[] dVarArr3 = {new C0685d("ExposureTime", 33434, 5), new C0685d("FNumber", 33437, 5), new C0685d("ExposureProgram", 34850, 3), new C0685d("SpectralSensitivity", 34852, 2), new C0685d("PhotographicSensitivity", 34855, 3), new C0685d("OECF", 34856, 7), new C0685d("SensitivityType", 34864, 3), new C0685d("StandardOutputSensitivity", 34865, 4), new C0685d("RecommendedExposureIndex", 34866, 4), new C0685d("ISOSpeed", 34867, 4), new C0685d("ISOSpeedLatitudeyyy", 34868, 4), new C0685d("ISOSpeedLatitudezzz", 34869, 4), new C0685d("ExifVersion", 36864, 2), new C0685d("DateTimeOriginal", 36867, 2), new C0685d("DateTimeDigitized", 36868, 2), new C0685d("OffsetTime", 36880, 2), new C0685d("OffsetTimeOriginal", 36881, 2), new C0685d("OffsetTimeDigitized", 36882, 2), new C0685d("ComponentsConfiguration", 37121, 7), new C0685d("CompressedBitsPerPixel", 37122, 5), new C0685d("ShutterSpeedValue", 37377, 10), new C0685d("ApertureValue", 37378, 5), new C0685d("BrightnessValue", 37379, 10), new C0685d("ExposureBiasValue", 37380, 10), new C0685d("MaxApertureValue", 37381, 5), new C0685d("SubjectDistance", 37382, 5), new C0685d("MeteringMode", 37383, 3), new C0685d("LightSource", 37384, 3), new C0685d("Flash", 37385, 3), new C0685d("FocalLength", 37386, 5), new C0685d("SubjectArea", 37396, 3), new C0685d("MakerNote", 37500, 7), new C0685d("UserComment", 37510, 7), new C0685d("SubSecTime", 37520, 2), new C0685d("SubSecTimeOriginal", 37521, 2), new C0685d("SubSecTimeDigitized", 37522, 2), new C0685d("FlashpixVersion", 40960, 7), new C0685d("ColorSpace", 40961, 3), new C0685d("PixelXDimension", 40962, 3, 4), new C0685d("PixelYDimension", 40963, 3, 4), new C0685d("RelatedSoundFile", 40964, 2), new C0685d("InteroperabilityIFDPointer", 40965, 4), new C0685d("FlashEnergy", 41483, 5), new C0685d("SpatialFrequencyResponse", 41484, 7), new C0685d("FocalPlaneXResolution", 41486, 5), new C0685d("FocalPlaneYResolution", 41487, 5), new C0685d("FocalPlaneResolutionUnit", 41488, 3), new C0685d("SubjectLocation", 41492, 3), new C0685d("ExposureIndex", 41493, 5), new C0685d("SensingMethod", 41495, 3), new C0685d("FileSource", 41728, 7), new C0685d("SceneType", 41729, 7), new C0685d("CFAPattern", 41730, 7), new C0685d("CustomRendered", 41985, 3), new C0685d("ExposureMode", 41986, 3), new C0685d("WhiteBalance", 41987, 3), new C0685d("DigitalZoomRatio", 41988, 5), new C0685d("FocalLengthIn35mmFilm", 41989, 3), new C0685d("SceneCaptureType", 41990, 3), new C0685d("GainControl", 41991, 3), new C0685d("Contrast", 41992, 3), new C0685d("Saturation", 41993, 3), new C0685d("Sharpness", 41994, 3), new C0685d("DeviceSettingDescription", 41995, 7), new C0685d("SubjectDistanceRange", 41996, 3), new C0685d("ImageUniqueID", 42016, 2), new C0685d("CameraOwnerName", 42032, 2), new C0685d("BodySerialNumber", 42033, 2), new C0685d("LensSpecification", 42034, 5), new C0685d("LensMake", 42035, 2), new C0685d("LensModel", 42036, 2), new C0685d("Gamma", 42240, 5), new C0685d("DNGVersion", 50706, 1), new C0685d("DefaultCropSize", 50720, 3, 4)};
        f4825F = dVarArr3;
        C0685d[] dVarArr4 = {new C0685d("GPSVersionID", 0, 1), new C0685d("GPSLatitudeRef", 1, 2), new C0685d("GPSLatitude", 2, 5), new C0685d("GPSLongitudeRef", 3, 2), new C0685d("GPSLongitude", 4, 5), new C0685d("GPSAltitudeRef", 5, 1), new C0685d("GPSAltitude", 6, 5), new C0685d("GPSTimeStamp", 7, 5), new C0685d("GPSSatellites", 8, 2), new C0685d("GPSStatus", 9, 2), new C0685d("GPSMeasureMode", 10, 2), new C0685d("GPSDOP", 11, 5), new C0685d("GPSSpeedRef", 12, 2), new C0685d("GPSSpeed", 13, 5), new C0685d("GPSTrackRef", 14, 2), new C0685d("GPSTrack", 15, 5), new C0685d("GPSImgDirectionRef", 16, 2), new C0685d("GPSImgDirection", 17, 5), new C0685d("GPSMapDatum", 18, 2), new C0685d("GPSDestLatitudeRef", 19, 2), new C0685d("GPSDestLatitude", 20, 5), new C0685d("GPSDestLongitudeRef", 21, 2), new C0685d("GPSDestLongitude", 22, 5), new C0685d("GPSDestBearingRef", 23, 2), new C0685d("GPSDestBearing", 24, 5), new C0685d("GPSDestDistanceRef", 25, 2), new C0685d("GPSDestDistance", 26, 5), new C0685d("GPSProcessingMethod", 27, 7), new C0685d("GPSAreaInformation", 28, 7), new C0685d("GPSDateStamp", 29, 2), new C0685d("GPSDifferential", 30, 3), new C0685d("GPSHPositioningError", 31, 5)};
        f4826G = dVarArr4;
        C0685d[] dVarArr5 = {new C0685d("InteroperabilityIndex", 1, 2)};
        f4827H = dVarArr5;
        C0685d[] dVarArr6 = {new C0685d("NewSubfileType", 254, 4), new C0685d("SubfileType", 255, 4), new C0685d("ThumbnailImageWidth", LogType.UNEXP, 3, 4), new C0685d("ThumbnailImageLength", 257, 3, 4), new C0685d("BitsPerSample", 258, 3), new C0685d("Compression", 259, 3), new C0685d("PhotometricInterpretation", 262, 3), new C0685d("ImageDescription", 270, 2), new C0685d("Make", 271, 2), new C0685d("Model", 272, 2), new C0685d("StripOffsets", UMSLNetWorkSender.f17621a, 3, 4), new C0685d("ThumbnailOrientation", 274, 3), new C0685d("SamplesPerPixel", 277, 3), new C0685d("RowsPerStrip", 278, 3, 4), new C0685d("StripByteCounts", 279, 3, 4), new C0685d("XResolution", 282, 5), new C0685d("YResolution", 283, 5), new C0685d("PlanarConfiguration", 284, 3), new C0685d("ResolutionUnit", 296, 3), new C0685d("TransferFunction", 301, 3), new C0685d("Software", 305, 2), new C0685d("DateTime", 306, 2), new C0685d("Artist", 315, 2), new C0685d("WhitePoint", 318, 5), new C0685d("PrimaryChromaticities", 319, 5), new C0685d("SubIFDPointer", 330, 4), new C0685d("JPEGInterchangeFormat", 513, 4), new C0685d("JPEGInterchangeFormatLength", 514, 4), new C0685d("YCbCrCoefficients", 529, 5), new C0685d("YCbCrSubSampling", 530, 3), new C0685d("YCbCrPositioning", 531, 3), new C0685d("ReferenceBlackWhite", 532, 5), new C0685d("Copyright", 33432, 2), new C0685d("ExifIFDPointer", 34665, 4), new C0685d("GPSInfoIFDPointer", 34853, 4), new C0685d("DNGVersion", 50706, 1), new C0685d("DefaultCropSize", 50720, 3, 4)};
        f4828I = dVarArr6;
        C0685d[] dVarArr7 = {new C0685d("ThumbnailImage", LogType.UNEXP, 7), new C0685d("CameraSettingsIFDPointer", 8224, 4), new C0685d("ImageProcessingIFDPointer", 8256, 4)};
        f4830K = dVarArr7;
        Integer num = valueOf4;
        C0685d[] dVarArr8 = {new C0685d("PreviewImageStart", 257, 4), new C0685d("PreviewImageLength", 258, 4)};
        f4831L = dVarArr8;
        Integer num2 = valueOf5;
        C0685d[] dVarArr9 = {new C0685d("AspectFrame", 4371, 3)};
        f4832M = dVarArr9;
        Integer num3 = valueOf;
        C0685d[] dVarArr10 = {new C0685d("ColorSpace", 55, 3)};
        f4833N = dVarArr10;
        C0685d[][] dVarArr11 = {dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr6, dVarArr2, dVarArr7, dVarArr8, dVarArr9, dVarArr10};
        f4834O = dVarArr11;
        f4838S = new HashMap[dVarArr11.length];
        f4839T = new HashMap[dVarArr11.length];
        Charset forName = Charset.forName("US-ASCII");
        f4842W = forName;
        f4843X = "Exif\u0000\u0000".getBytes(forName);
        f4844Y = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f4820A = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C0685d[][] dVarArr12 = f4834O;
            if (i < dVarArr12.length) {
                f4838S[i] = new HashMap<>();
                f4839T[i] = new HashMap<>();
                for (C0685d dVar : dVarArr12[i]) {
                    f4838S[i].put(Integer.valueOf(dVar.f4908a), dVar);
                    f4839T[i].put(dVar.f4909b, dVar);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f4841V;
                C0685d[] dVarArr13 = f4835P;
                hashMap.put(Integer.valueOf(dVarArr13[0].f4908a), valueOf6);
                hashMap.put(Integer.valueOf(dVarArr13[1].f4908a), valueOf2);
                hashMap.put(Integer.valueOf(dVarArr13[2].f4908a), valueOf3);
                hashMap.put(Integer.valueOf(dVarArr13[3].f4908a), num3);
                hashMap.put(Integer.valueOf(dVarArr13[4].f4908a), num2);
                hashMap.put(Integer.valueOf(dVarArr13[5].f4908a), num);
                return;
            }
        }
    }

    public ExifInterface(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    /* renamed from: A */
    private boolean m5791A(HashMap hashMap) throws IOException {
        C0684c cVar = (C0684c) hashMap.get("BitsPerSample");
        if (cVar != null) {
            int[] iArr = (int[]) cVar.mo5285k(this.f4880i0);
            int[] iArr2 = f4850d;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f4876e0 == 3) {
                C0684c cVar2 = (C0684c) hashMap.get("PhotometricInterpretation");
                if (cVar2 != null) {
                    int i = cVar2.mo5283i(this.f4880i0);
                    if ((i == 1 && Arrays.equals(iArr, f4852f)) || (i == 6 && Arrays.equals(iArr, iArr2))) {
                        return true;
                    }
                }
            }
        }
        if (f4846a) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
        return false;
    }

    /* renamed from: B */
    private boolean m5792B(HashMap hashMap) throws IOException {
        C0684c cVar = (C0684c) hashMap.get("ImageLength");
        C0684c cVar2 = (C0684c) hashMap.get("ImageWidth");
        if (!(cVar == null || cVar2 == null)) {
            int i = cVar.mo5283i(this.f4880i0);
            int i2 = cVar2.mo5283i(this.f4880i0);
            if (i <= 512 && i2 <= 512) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    private boolean m5793C(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f4863q;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f4864r;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f4863q.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else if (bArr[i] != bArr2[i]) {
                return false;
            } else {
                i++;
            }
        }
    }

    /* renamed from: D */
    private void m5794D(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        int i = 0;
        while (i < f4834O.length) {
            try {
                this.f4878g0[i] = new HashMap<>();
                i++;
            } catch (IOException e) {
                this.f4893v0 = false;
                boolean z = f4846a;
                if (z) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m5806a();
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                m5806a();
                if (f4846a) {
                    m5796F();
                }
                throw th;
            }
        }
        if (!this.f4877f0) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f4876e0 = m5812i(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        C0683b bVar = new C0683b(inputStream);
        if (!this.f4877f0) {
            switch (this.f4876e0) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    m5816m(bVar);
                    break;
                case 4:
                    m5811h(bVar, 0, 0);
                    break;
                case 7:
                    m5813j(bVar);
                    break;
                case 9:
                    m5815l(bVar);
                    break;
                case 10:
                    m5817n(bVar);
                    break;
                case 12:
                    m5810g(bVar);
                    break;
                case 13:
                    m5814k(bVar);
                    break;
                case 14:
                    m5819p(bVar);
                    break;
            }
        } else {
            m5818o(bVar);
        }
        m5801K(bVar);
        this.f4893v0 = true;
        m5806a();
        if (!f4846a) {
            return;
        }
        m5796F();
    }

    /* renamed from: E */
    private void m5795E(C0683b bVar, int i) throws IOException {
        ByteOrder G = m5797G(bVar);
        this.f4880i0 = G;
        bVar.mo5263F(G);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i2 = this.f4876e0;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt < 8 || readInt >= i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid first Ifd offset: ");
                sb.append(readInt);
                throw new IOException(sb.toString());
            }
            int i3 = readInt - 8;
            if (i3 > 0 && bVar.skipBytes(i3) != i3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Couldn't jump to first Ifd: ");
                sb2.append(i3);
                throw new IOException(sb2.toString());
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid start code: ");
        sb3.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(sb3.toString());
    }

    /* renamed from: F */
    private void m5796F() {
        for (int i = 0; i < this.f4878g0.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The size of tag group[");
            sb.append(i);
            sb.append("]: ");
            sb.append(this.f4878g0[i].size());
            String str = "ExifInterface";
            Log.d(str, sb.toString());
            for (Entry entry : this.f4878g0[i].entrySet()) {
                C0684c cVar = (C0684c) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("tagName: ");
                sb2.append((String) entry.getKey());
                sb2.append(", tagType: ");
                sb2.append(cVar.toString());
                sb2.append(", tagValue: '");
                sb2.append(cVar.mo5284j(this.f4880i0));
                sb2.append("'");
                Log.d(str, sb2.toString());
            }
        }
    }

    /* renamed from: G */
    private ByteOrder m5797G(C0683b bVar) throws IOException {
        short readShort = bVar.readShort();
        String str = "ExifInterface";
        if (readShort == 18761) {
            if (f4846a) {
                Log.d(str, "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f4846a) {
                Log.d(str, "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid byte order: ");
            sb.append(Integer.toHexString(readShort));
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: H */
    private void m5798H(byte[] bArr, int i) throws IOException {
        C0683b bVar = new C0683b(bArr);
        m5795E(bVar, bArr.length);
        m5799I(bVar, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x034a, code lost:
        if ("Model".equals(r8.f4909b) != false) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0358, code lost:
        if (r15.mo5284j(r0.f4880i0).contains("PENTAX") == false) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0360, code lost:
        if (r7.equals(r8.f4909b) == false) goto L_0x0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x036b, code lost:
        if (r15.mo5283i(r0.f4880i0) != 65535) goto L_0x0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x036d, code lost:
        r0.f4876e0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0378, code lost:
        if (((long) r31.mo5260C()) == r9) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x037a, code lost:
        r1.mo5262E(r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0281  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5799I(p010b.p051j.p052a.ExifInterface.C0683b r31, int r32) throws java.io.IOException {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            java.util.Set<java.lang.Integer> r3 = r0.f4879h0
            int r4 = r1.f4903f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f4903f
            r4 = 2
            int r3 = r3 + r4
            int r5 = r1.f4902e
            if (r3 <= r5) goto L_0x001a
            return
        L_0x001a:
            short r3 = r31.readShort()
            boolean r5 = f4846a
            java.lang.String r6 = "ExifInterface"
            if (r5 == 0) goto L_0x0038
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "numberOfDirectoryEntry: "
            r5.append(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r6, r5)
        L_0x0038:
            int r5 = r1.f4903f
            int r7 = r3 * 12
            int r5 = r5 + r7
            int r7 = r1.f4902e
            if (r5 > r7) goto L_0x0413
            if (r3 > 0) goto L_0x0045
            goto L_0x0413
        L_0x0045:
            r5 = 0
            r7 = 0
        L_0x0047:
            r8 = 5
            if (r7 >= r3) goto L_0x0389
            int r13 = r31.readUnsignedShort()
            int r14 = r31.readUnsignedShort()
            int r15 = r31.readInt()
            int r9 = r31.mo5260C()
            long r9 = (long) r9
            r18 = 4
            long r9 = r9 + r18
            java.util.HashMap<java.lang.Integer, b.j.a.a$d>[] r20 = f4838S
            r12 = r20[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            java.lang.Object r4 = r12.get(r4)
            b.j.a.a$d r4 = (p010b.p051j.p052a.ExifInterface.C0685d) r4
            boolean r12 = f4846a
            r11 = 3
            if (r12 == 0) goto L_0x00a3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r23 = java.lang.Integer.valueOf(r32)
            r8[r5] = r23
            java.lang.Integer r23 = java.lang.Integer.valueOf(r13)
            r20 = 1
            r8[r20] = r23
            if (r4 == 0) goto L_0x0087
            java.lang.String r5 = r4.f4909b
            goto L_0x0088
        L_0x0087:
            r5 = 0
        L_0x0088:
            r22 = 2
            r8[r22] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            r8[r11] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r21 = 4
            r8[r21] = r5
            java.lang.String r5 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r5 = java.lang.String.format(r5, r8)
            android.util.Log.d(r6, r5)
        L_0x00a3:
            r5 = 7
            if (r4 != 0) goto L_0x00c1
            if (r12 == 0) goto L_0x00bc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "Skip the tag entry since tag number is not defined: "
            r8.append(r11)
            r8.append(r13)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r6, r8)
        L_0x00bc:
            r11 = r6
            r25 = r7
            goto L_0x0141
        L_0x00c1:
            if (r14 <= 0) goto L_0x0128
            int[] r8 = f4822C
            int r11 = r8.length
            if (r14 < r11) goto L_0x00c9
            goto L_0x0128
        L_0x00c9:
            boolean r11 = r4.mo5287a(r14)
            if (r11 != 0) goto L_0x00f4
            if (r12 == 0) goto L_0x00bc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "Skip the tag entry since data format ("
            r8.append(r11)
            java.lang.String[] r11 = f4821B
            r11 = r11[r14]
            r8.append(r11)
            java.lang.String r11 = ") is unexpected for tag: "
            r8.append(r11)
            java.lang.String r11 = r4.f4909b
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r6, r8)
            goto L_0x00bc
        L_0x00f4:
            if (r14 != r5) goto L_0x00f8
            int r14 = r4.f4910c
        L_0x00f8:
            r11 = r6
            long r5 = (long) r15
            r8 = r8[r14]
            r25 = r7
            long r7 = (long) r8
            long r5 = r5 * r7
            r7 = 0
            int r26 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r26 < 0) goto L_0x0111
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r26 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r26 <= 0) goto L_0x010f
            goto L_0x0111
        L_0x010f:
            r7 = 1
            goto L_0x0144
        L_0x0111:
            if (r12 == 0) goto L_0x0143
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Skip the tag entry since the number of components is invalid: "
            r7.append(r8)
            r7.append(r15)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r11, r7)
            goto L_0x0143
        L_0x0128:
            r11 = r6
            r25 = r7
            if (r12 == 0) goto L_0x0141
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Skip the tag entry since data format is invalid: "
            r5.append(r6)
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r11, r5)
        L_0x0141:
            r5 = 0
        L_0x0143:
            r7 = 0
        L_0x0144:
            if (r7 != 0) goto L_0x014e
            r1.mo5262E(r9)
            r26 = r3
        L_0x014b:
            r13 = 2
            goto L_0x037d
        L_0x014e:
            java.lang.String r7 = "Compression"
            int r8 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x0216
            int r8 = r31.readInt()
            r26 = r3
            if (r12 == 0) goto L_0x0173
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r18 = r14
            java.lang.String r14 = "seek to data offset: "
            r3.append(r14)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r11, r3)
            goto L_0x0175
        L_0x0173:
            r18 = r14
        L_0x0175:
            int r3 = r0.f4876e0
            r14 = 7
            if (r3 != r14) goto L_0x01d5
            java.lang.String r3 = r4.f4909b
            java.lang.String r14 = "MakerNote"
            boolean r3 = r14.equals(r3)
            if (r3 == 0) goto L_0x0187
            r0.f4889r0 = r8
            goto L_0x01d0
        L_0x0187:
            r3 = 6
            if (r2 != r3) goto L_0x01d0
            java.lang.String r14 = r4.f4909b
            java.lang.String r3 = "ThumbnailImage"
            boolean r3 = r3.equals(r14)
            if (r3 == 0) goto L_0x01d0
            r0.f4890s0 = r8
            r0.f4891t0 = r15
            java.nio.ByteOrder r3 = r0.f4880i0
            r14 = 6
            b.j.a.a$c r3 = p010b.p051j.p052a.ExifInterface.C0684c.m5842f(r14, r3)
            int r14 = r0.f4890s0
            r19 = r15
            long r14 = (long) r14
            java.nio.ByteOrder r2 = r0.f4880i0
            b.j.a.a$c r2 = p010b.p051j.p052a.ExifInterface.C0684c.m5838b(r14, r2)
            int r14 = r0.f4891t0
            long r14 = (long) r14
            r24 = r13
            java.nio.ByteOrder r13 = r0.f4880i0
            b.j.a.a$c r13 = p010b.p051j.p052a.ExifInterface.C0684c.m5838b(r14, r13)
            java.util.HashMap<java.lang.String, b.j.a.a$c>[] r14 = r0.f4878g0
            r15 = 4
            r14 = r14[r15]
            r14.put(r7, r3)
            java.util.HashMap<java.lang.String, b.j.a.a$c>[] r3 = r0.f4878g0
            r3 = r3[r15]
            java.lang.String r14 = "JPEGInterchangeFormat"
            r3.put(r14, r2)
            java.util.HashMap<java.lang.String, b.j.a.a$c>[] r2 = r0.f4878g0
            r2 = r2[r15]
            java.lang.String r3 = "JPEGInterchangeFormatLength"
            r2.put(r3, r13)
            goto L_0x01e9
        L_0x01d0:
            r24 = r13
            r19 = r15
            goto L_0x01e9
        L_0x01d5:
            r24 = r13
            r19 = r15
            r2 = 10
            if (r3 != r2) goto L_0x01e9
            java.lang.String r2 = r4.f4909b
            java.lang.String r3 = "JpgFromRaw"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x01e9
            r0.f4892u0 = r8
        L_0x01e9:
            long r2 = (long) r8
            long r13 = r2 + r5
            int r15 = r1.f4902e
            r27 = r4
            r28 = r5
            long r4 = (long) r15
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x01fb
            r1.mo5262E(r2)
            goto L_0x0222
        L_0x01fb:
            if (r12 == 0) goto L_0x0211
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r11, r2)
        L_0x0211:
            r1.mo5262E(r9)
            goto L_0x014b
        L_0x0216:
            r26 = r3
            r27 = r4
            r28 = r5
            r24 = r13
            r18 = r14
            r19 = r15
        L_0x0222:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = f4841V
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r12 == 0) goto L_0x024f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "nextIfdType: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " byteCount: "
            r3.append(r4)
            r5 = r28
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r11, r3)
            goto L_0x0251
        L_0x024f:
            r5 = r28
        L_0x0251:
            r3 = 8
            if (r2 == 0) goto L_0x02fe
            r4 = -1
            r14 = r18
            r6 = 3
            if (r14 == r6) goto L_0x0279
            r6 = 4
            if (r14 == r6) goto L_0x0274
            if (r14 == r3) goto L_0x026f
            r3 = 9
            if (r14 == r3) goto L_0x026a
            r3 = 13
            if (r14 == r3) goto L_0x026a
            goto L_0x027e
        L_0x026a:
            int r3 = r31.readInt()
            goto L_0x027d
        L_0x026f:
            short r3 = r31.readShort()
            goto L_0x027d
        L_0x0274:
            long r4 = r31.mo5261D()
            goto L_0x027e
        L_0x0279:
            int r3 = r31.readUnsignedShort()
        L_0x027d:
            long r4 = (long) r3
        L_0x027e:
            r13 = 2
            if (r12 == 0) goto L_0x029a
            java.lang.Object[] r3 = new java.lang.Object[r13]
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            r7 = 0
            r3[r7] = r6
            r8 = r27
            java.lang.String r6 = r8.f4909b
            r7 = 1
            r3[r7] = r6
            java.lang.String r6 = "Offset: %d, tagName: %s"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            android.util.Log.d(r11, r3)
        L_0x029a:
            r6 = 0
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x02e3
            int r3 = r1.f4902e
            long r6 = (long) r3
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x02e3
            java.util.Set<java.lang.Integer> r3 = r0.f4879h0
            int r6 = (int) r4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r3 = r3.contains(r6)
            if (r3 != 0) goto L_0x02bf
            r1.mo5262E(r4)
            int r2 = r2.intValue()
            r0.m5799I(r1, r2)
            goto L_0x02f9
        L_0x02bf:
            if (r12 == 0) goto L_0x02f9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Skip jump into the IFD since it has already been read: IfdType "
            r3.append(r6)
            r3.append(r2)
            java.lang.String r2 = " (at "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.d(r11, r2)
            goto L_0x02f9
        L_0x02e3:
            if (r12 == 0) goto L_0x02f9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r11, r2)
        L_0x02f9:
            r1.mo5262E(r9)
            goto L_0x037d
        L_0x02fe:
            r14 = r18
            r8 = r27
            r13 = 2
            int r2 = r31.mo5260C()
            int r4 = r0.f4888q0
            int r2 = r2 + r4
            int r4 = (int) r5
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            b.j.a.a$c r5 = new b.j.a.a$c
            r12 = r4
            long r3 = (long) r2
            r2 = r19
            r15 = r5
            r16 = r14
            r17 = r2
            r18 = r3
            r20 = r12
            r15.<init>(r16, r17, r18, r20)
            java.util.HashMap<java.lang.String, b.j.a.a$c>[] r2 = r0.f4878g0
            r2 = r2[r32]
            java.lang.String r3 = r8.f4909b
            r2.put(r3, r5)
            java.lang.String r2 = r8.f4909b
            java.lang.String r3 = "DNGVersion"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0338
            r2 = 3
            r0.f4876e0 = r2
        L_0x0338:
            java.lang.String r2 = r8.f4909b
            java.lang.String r3 = "Make"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x034c
            java.lang.String r2 = r8.f4909b
            java.lang.String r3 = "Model"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x035a
        L_0x034c:
            java.nio.ByteOrder r2 = r0.f4880i0
            java.lang.String r2 = r5.mo5284j(r2)
            java.lang.String r3 = "PENTAX"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x036d
        L_0x035a:
            java.lang.String r2 = r8.f4909b
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0371
            java.nio.ByteOrder r2 = r0.f4880i0
            int r2 = r5.mo5283i(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x0371
        L_0x036d:
            r2 = 8
            r0.f4876e0 = r2
        L_0x0371:
            int r2 = r31.mo5260C()
            long r2 = (long) r2
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x037d
            r1.mo5262E(r9)
        L_0x037d:
            int r7 = r25 + 1
            short r7 = (short) r7
            r2 = r32
            r6 = r11
            r3 = r26
            r4 = 2
            r5 = 0
            goto L_0x0047
        L_0x0389:
            r11 = r6
            int r2 = r31.mo5260C()
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.f4902e
            if (r2 > r3) goto L_0x0413
            int r2 = r31.readInt()
            boolean r3 = f4846a
            if (r3 == 0) goto L_0x03af
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            android.util.Log.d(r11, r4)
        L_0x03af:
            long r4 = (long) r2
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x03fd
            int r6 = r1.f4902e
            if (r2 >= r6) goto L_0x03fd
            java.util.Set<java.lang.Integer> r6 = r0.f4879h0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x03e6
            r1.mo5262E(r4)
            java.util.HashMap<java.lang.String, b.j.a.a$c>[] r2 = r0.f4878g0
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03d8
            r0.m5799I(r1, r3)
            goto L_0x0413
        L_0x03d8:
            java.util.HashMap<java.lang.String, b.j.a.a$c>[] r2 = r0.f4878g0
            r2 = r2[r8]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0413
            r0.m5799I(r1, r8)
            goto L_0x0413
        L_0x03e6:
            if (r3 == 0) goto L_0x0413
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r11, r1)
            goto L_0x0413
        L_0x03fd:
            if (r3 == 0) goto L_0x0413
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r11, r1)
        L_0x0413:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p051j.p052a.ExifInterface.m5799I(b.j.a.a$b, int):void");
    }

    /* renamed from: J */
    private void m5800J(C0683b bVar, int i) throws IOException {
        C0684c cVar = (C0684c) this.f4878g0[i].get("ImageWidth");
        if (((C0684c) this.f4878g0[i].get("ImageLength")) == null || cVar == null) {
            C0684c cVar2 = (C0684c) this.f4878g0[i].get("JPEGInterchangeFormat");
            if (cVar2 != null) {
                m5811h(bVar, cVar2.mo5283i(this.f4880i0), i);
            }
        }
    }

    /* renamed from: K */
    private void m5801K(C0683b bVar) throws IOException {
        HashMap<String, C0684c> hashMap = this.f4878g0[4];
        C0684c cVar = (C0684c) hashMap.get("Compression");
        if (cVar != null) {
            int i = cVar.mo5283i(this.f4880i0);
            this.f4887p0 = i;
            if (i != 1) {
                if (i == 6) {
                    m5820q(bVar, hashMap);
                    return;
                } else if (i != 7) {
                    return;
                }
            }
            if (m5791A(hashMap)) {
                m5821r(bVar, hashMap);
                return;
            }
            return;
        }
        this.f4887p0 = 6;
        m5820q(bVar, hashMap);
    }

    /* renamed from: L */
    private static boolean m5802L(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: M */
    private void m5803M(int i, int i2) throws IOException {
        String str = "ExifInterface";
        if (this.f4878g0[i].isEmpty() || this.f4878g0[i2].isEmpty()) {
            if (f4846a) {
                Log.d(str, "Cannot perform swap since only one image data exists");
            }
            return;
        }
        String str2 = "ImageLength";
        C0684c cVar = (C0684c) this.f4878g0[i].get(str2);
        String str3 = "ImageWidth";
        C0684c cVar2 = (C0684c) this.f4878g0[i].get(str3);
        C0684c cVar3 = (C0684c) this.f4878g0[i2].get(str2);
        C0684c cVar4 = (C0684c) this.f4878g0[i2].get(str3);
        if (cVar == null || cVar2 == null) {
            if (f4846a) {
                Log.d(str, "First image does not contain valid size information");
            }
        } else if (cVar3 != null && cVar4 != null) {
            int i3 = cVar.mo5283i(this.f4880i0);
            int i4 = cVar2.mo5283i(this.f4880i0);
            int i5 = cVar3.mo5283i(this.f4880i0);
            int i6 = cVar4.mo5283i(this.f4880i0);
            if (i3 < i5 && i4 < i6) {
                HashMap<String, C0684c>[] hashMapArr = this.f4878g0;
                HashMap<String, C0684c> hashMap = hashMapArr[i];
                hashMapArr[i] = hashMapArr[i2];
                hashMapArr[i2] = hashMap;
            }
        } else if (f4846a) {
            Log.d(str, "Second image does not contain valid size information");
        }
    }

    /* renamed from: N */
    private void m5804N(C0683b bVar, int i) throws IOException {
        C0684c cVar;
        C0684c cVar2;
        C0684c cVar3 = (C0684c) this.f4878g0[i].get("DefaultCropSize");
        C0684c cVar4 = (C0684c) this.f4878g0[i].get("SensorTopBorder");
        C0684c cVar5 = (C0684c) this.f4878g0[i].get("SensorLeftBorder");
        C0684c cVar6 = (C0684c) this.f4878g0[i].get("SensorBottomBorder");
        C0684c cVar7 = (C0684c) this.f4878g0[i].get("SensorRightBorder");
        String str = "ImageLength";
        String str2 = "ImageWidth";
        if (cVar3 != null) {
            String str3 = "Invalid crop size values. cropSize=";
            String str4 = "ExifInterface";
            if (cVar3.f4904a == 5) {
                C0686e[] eVarArr = (C0686e[]) cVar3.mo5285k(this.f4880i0);
                if (eVarArr == null || eVarArr.length != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(Arrays.toString(eVarArr));
                    Log.w(str4, sb.toString());
                    return;
                }
                cVar2 = C0684c.m5840d(eVarArr[0], this.f4880i0);
                cVar = C0684c.m5840d(eVarArr[1], this.f4880i0);
            } else {
                int[] iArr = (int[]) cVar3.mo5285k(this.f4880i0);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(Arrays.toString(iArr));
                    Log.w(str4, sb2.toString());
                    return;
                }
                cVar2 = C0684c.m5842f(iArr[0], this.f4880i0);
                cVar = C0684c.m5842f(iArr[1], this.f4880i0);
            }
            this.f4878g0[i].put(str2, cVar2);
            this.f4878g0[i].put(str, cVar);
        } else if (cVar4 == null || cVar5 == null || cVar6 == null || cVar7 == null) {
            m5800J(bVar, i);
        } else {
            int i2 = cVar4.mo5283i(this.f4880i0);
            int i3 = cVar6.mo5283i(this.f4880i0);
            int i4 = cVar7.mo5283i(this.f4880i0);
            int i5 = cVar5.mo5283i(this.f4880i0);
            if (i3 > i2 && i4 > i5) {
                int i6 = i4 - i5;
                C0684c f = C0684c.m5842f(i3 - i2, this.f4880i0);
                C0684c f2 = C0684c.m5842f(i6, this.f4880i0);
                this.f4878g0[i].put(str, f);
                this.f4878g0[i].put(str2, f2);
            }
        }
    }

    /* renamed from: O */
    private void m5805O() throws IOException {
        m5803M(0, 5);
        m5803M(0, 4);
        m5803M(5, 4);
        C0684c cVar = (C0684c) this.f4878g0[1].get("PixelXDimension");
        C0684c cVar2 = (C0684c) this.f4878g0[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            this.f4878g0[0].put("ImageWidth", cVar);
            this.f4878g0[0].put("ImageLength", cVar2);
        }
        if (this.f4878g0[4].isEmpty() && m5792B(this.f4878g0[5])) {
            HashMap<String, C0684c>[] hashMapArr = this.f4878g0;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m5792B(this.f4878g0[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    /* renamed from: a */
    private void m5806a() {
        String d = mo5254d("DateTimeOriginal");
        if (d != null) {
            String str = "DateTime";
            if (mo5254d(str) == null) {
                this.f4878g0[0].put(str, C0684c.m5837a(d));
            }
        }
        String str2 = "ImageWidth";
        if (mo5254d(str2) == null) {
            this.f4878g0[0].put(str2, C0684c.m5838b(0, this.f4880i0));
        }
        String str3 = "ImageLength";
        if (mo5254d(str3) == null) {
            this.f4878g0[0].put(str3, C0684c.m5838b(0, this.f4880i0));
        }
        String str4 = "Orientation";
        if (mo5254d(str4) == null) {
            this.f4878g0[0].put(str4, C0684c.m5838b(0, this.f4880i0));
        }
        String str5 = "LightSource";
        if (mo5254d(str5) == null) {
            this.f4878g0[1].put(str5, C0684c.m5838b(0, this.f4880i0));
        }
    }

    /* renamed from: b */
    private static String m5807b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte valueOf : bArr) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
        }
        return sb.toString();
    }

    /* renamed from: c */
    private static long[] m5808c(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* renamed from: f */
    private C0684c m5809f(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (f4846a) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f4834O.length; i++) {
            C0684c cVar = (C0684c) this.f4878g0[i].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    private void m5810g(C0683b bVar) throws IOException {
        String str;
        String str2;
        String str3 = "yes";
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (VERSION.SDK_INT >= 23) {
                mediaMetadataRetriever.setDataSource(new C0682a(bVar));
            } else {
                FileDescriptor fileDescriptor = this.f4874c0;
                if (fileDescriptor != null) {
                    mediaMetadataRetriever.setDataSource(fileDescriptor);
                } else {
                    String str4 = this.f4873b0;
                    if (str4 != null) {
                        mediaMetadataRetriever.setDataSource(str4);
                    } else {
                        mediaMetadataRetriever.release();
                        return;
                    }
                }
            }
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            String str5 = null;
            if (str3.equals(extractMetadata3)) {
                str5 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if (str3.equals(extractMetadata4)) {
                str5 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str2 = null;
                str = null;
            }
            if (str5 != null) {
                this.f4878g0[0].put("ImageWidth", C0684c.m5842f(Integer.parseInt(str5), this.f4880i0));
            }
            if (str2 != null) {
                this.f4878g0[0].put("ImageLength", C0684c.m5842f(Integer.parseInt(str2), this.f4880i0));
            }
            if (str != null) {
                int i = 1;
                int parseInt = Integer.parseInt(str);
                if (parseInt == 90) {
                    i = 6;
                } else if (parseInt == 180) {
                    i = 3;
                } else if (parseInt == 270) {
                    i = 8;
                }
                this.f4878g0[0].put("Orientation", C0684c.m5842f(i, this.f4880i0));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.mo5262E((long) parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i2 = parseInt2 + 6;
                        int i3 = parseInt3 - 6;
                        if (Arrays.equals(bArr, f4843X)) {
                            byte[] bArr2 = new byte[i3];
                            if (bVar.read(bArr2) == i3) {
                                this.f4888q0 = i2;
                                m5798H(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (f4846a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Heif meta: ");
                sb.append(str5);
                sb.append("x");
                sb.append(str2);
                sb.append(", rotation ");
                sb.append(str);
                Log.d("ExifInterface", sb.toString());
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018d A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5811h(p010b.p051j.p052a.ExifInterface.C0683b r20, int r21, int r22) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            boolean r4 = f4846a
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x0022
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "getJpegAttributes starting with: "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x0022:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.mo5263F(r4)
            long r6 = (long) r2
            r1.mo5262E(r6)
            byte r4 = r20.readByte()
            java.lang.String r6 = "Invalid marker: "
            r7 = -1
            if (r4 != r7) goto L_0x01d7
            r8 = 1
            int r2 = r2 + r8
            byte r9 = r20.readByte()
            r10 = -40
            if (r9 != r10) goto L_0x01bc
            int r2 = r2 + r8
        L_0x003f:
            byte r4 = r20.readByte()
            if (r4 != r7) goto L_0x019f
            int r2 = r2 + r8
            byte r4 = r20.readByte()
            boolean r6 = f4846a
            if (r6 == 0) goto L_0x0068
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Found JPEG segment indicator: "
            r9.append(r10)
            r10 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r5, r9)
        L_0x0068:
            int r2 = r2 + r8
            r9 = -39
            if (r4 == r9) goto L_0x0199
            r9 = -38
            if (r4 != r9) goto L_0x0073
            goto L_0x0199
        L_0x0073:
            int r9 = r20.readUnsignedShort()
            int r9 = r9 + -2
            int r2 = r2 + 2
            if (r6 == 0) goto L_0x00a6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "JPEG segment: "
            r6.append(r10)
            r10 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r6.append(r10)
            java.lang.String r10 = " (length: "
            r6.append(r10)
            int r10 = r9 + 2
            r6.append(r10)
            java.lang.String r10 = ")"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x00a6:
            java.lang.String r6 = "Invalid length"
            if (r9 < 0) goto L_0x0193
            r10 = -31
            r11 = 0
            if (r4 == r10) goto L_0x0128
            r10 = -2
            if (r4 == r10) goto L_0x00fb
            switch(r4) {
                case -64: goto L_0x00c2;
                case -63: goto L_0x00c2;
                case -62: goto L_0x00c2;
                case -61: goto L_0x00c2;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            switch(r4) {
                case -59: goto L_0x00c2;
                case -58: goto L_0x00c2;
                case -57: goto L_0x00c2;
                default: goto L_0x00b8;
            }
        L_0x00b8:
            switch(r4) {
                case -55: goto L_0x00c2;
                case -54: goto L_0x00c2;
                case -53: goto L_0x00c2;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            switch(r4) {
                case -51: goto L_0x00c2;
                case -50: goto L_0x00c2;
                case -49: goto L_0x00c2;
                default: goto L_0x00be;
            }
        L_0x00be:
            r10 = r2
            r2 = 1
            goto L_0x0176
        L_0x00c2:
            int r4 = r1.skipBytes(r8)
            if (r4 != r8) goto L_0x00f3
            java.util.HashMap<java.lang.String, b.j.a.a$c>[] r4 = r0.f4878g0
            r4 = r4[r3]
            int r10 = r20.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.f4880i0
            b.j.a.a$c r10 = p010b.p051j.p052a.ExifInterface.C0684c.m5838b(r10, r12)
            java.lang.String r11 = "ImageLength"
            r4.put(r11, r10)
            java.util.HashMap<java.lang.String, b.j.a.a$c>[] r4 = r0.f4878g0
            r4 = r4[r3]
            int r10 = r20.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.f4880i0
            b.j.a.a$c r10 = p010b.p051j.p052a.ExifInterface.C0684c.m5838b(r10, r12)
            java.lang.String r11 = "ImageWidth"
            r4.put(r11, r10)
            int r9 = r9 + -5
            goto L_0x00be
        L_0x00f3:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid SOFx"
            r1.<init>(r2)
            throw r1
        L_0x00fb:
            byte[] r4 = new byte[r9]
            int r10 = r1.read(r4)
            if (r10 != r9) goto L_0x0120
            java.lang.String r9 = "UserComment"
            java.lang.String r10 = r0.mo5254d(r9)
            if (r10 != 0) goto L_0x011d
            java.util.HashMap<java.lang.String, b.j.a.a$c>[] r10 = r0.f4878g0
            r10 = r10[r8]
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r13 = f4842W
            r12.<init>(r4, r13)
            b.j.a.a$c r4 = p010b.p051j.p052a.ExifInterface.C0684c.m5837a(r12)
            r10.put(r9, r4)
        L_0x011d:
            r10 = r2
        L_0x011e:
            r2 = 1
            goto L_0x0175
        L_0x0120:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x0128:
            byte[] r4 = new byte[r9]
            r1.readFully(r4)
            int r10 = r2 + r9
            byte[] r12 = f4843X
            boolean r13 = m5802L(r4, r12)
            if (r13 == 0) goto L_0x0144
            int r13 = r12.length
            int r2 = r2 + r13
            int r12 = r12.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r12, r9)
            r0.f4888q0 = r2
            r0.m5798H(r4, r3)
            goto L_0x011e
        L_0x0144:
            byte[] r12 = f4844Y
            boolean r13 = m5802L(r4, r12)
            if (r13 == 0) goto L_0x011e
            int r13 = r12.length
            int r2 = r2 + r13
            int r12 = r12.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r12, r9)
            java.lang.String r9 = "Xmp"
            java.lang.String r12 = r0.mo5254d(r9)
            if (r12 != 0) goto L_0x011e
            java.util.HashMap<java.lang.String, b.j.a.a$c>[] r12 = r0.f4878g0
            r12 = r12[r11]
            b.j.a.a$c r15 = new b.j.a.a$c
            r14 = 1
            int r13 = r4.length
            long r7 = (long) r2
            r2 = r13
            r13 = r15
            r11 = r15
            r15 = r2
            r16 = r7
            r18 = r4
            r13.<init>(r14, r15, r16, r18)
            r12.put(r9, r11)
            r2 = 1
            r0.f4894w0 = r2
        L_0x0175:
            r9 = 0
        L_0x0176:
            if (r9 < 0) goto L_0x018d
            int r4 = r1.skipBytes(r9)
            if (r4 != r9) goto L_0x0185
            int r4 = r10 + r9
            r2 = r4
            r7 = -1
            r8 = 1
            goto L_0x003f
        L_0x0185:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid JPEG segment"
            r1.<init>(r2)
            throw r1
        L_0x018d:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L_0x0193:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L_0x0199:
            java.nio.ByteOrder r2 = r0.f4880i0
            r1.mo5263F(r2)
            return
        L_0x019f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01bc:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01d7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            goto L_0x01f3
        L_0x01f2:
            throw r1
        L_0x01f3:
            goto L_0x01f2
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p051j.p052a.ExifInterface.m5811h(b.j.a.a$b, int, int):void");
    }

    /* renamed from: i */
    private int m5812i(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m5824u(bArr)) {
            return 4;
        }
        if (m5827x(bArr)) {
            return 9;
        }
        if (m5823t(bArr)) {
            return 12;
        }
        if (m5825v(bArr)) {
            return 7;
        }
        if (m5828y(bArr)) {
            return 10;
        }
        if (m5826w(bArr)) {
            return 13;
        }
        return m5793C(bArr) ? 14 : 0;
    }

    /* renamed from: j */
    private void m5813j(C0683b bVar) throws IOException {
        m5816m(bVar);
        C0684c cVar = (C0684c) this.f4878g0[1].get("MakerNote");
        if (cVar != null) {
            C0683b bVar2 = new C0683b(cVar.f4907d);
            bVar2.mo5263F(this.f4880i0);
            byte[] bArr = f4857k;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.mo5262E(0);
            byte[] bArr3 = f4858l;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.mo5262E(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.mo5262E(12);
            }
            m5799I(bVar2, 6);
            C0684c cVar2 = (C0684c) this.f4878g0[7].get("PreviewImageStart");
            C0684c cVar3 = (C0684c) this.f4878g0[7].get("PreviewImageLength");
            if (!(cVar2 == null || cVar3 == null)) {
                this.f4878g0[5].put("JPEGInterchangeFormat", cVar2);
                this.f4878g0[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            C0684c cVar4 = (C0684c) this.f4878g0[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.mo5285k(this.f4880i0);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid aspect frame values. frame=");
                    sb.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", sb.toString());
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i = (iArr[2] - iArr[0]) + 1;
                    int i2 = (iArr[3] - iArr[1]) + 1;
                    if (i < i2) {
                        int i3 = i + i2;
                        i2 = i3 - i2;
                        i = i3 - i2;
                    }
                    C0684c f = C0684c.m5842f(i, this.f4880i0);
                    C0684c f2 = C0684c.m5842f(i2, this.f4880i0);
                    this.f4878g0[0].put("ImageWidth", f);
                    this.f4878g0[0].put("ImageLength", f2);
                }
            }
        }
    }

    /* renamed from: k */
    private void m5814k(C0683b bVar) throws IOException {
        if (f4846a) {
            StringBuilder sb = new StringBuilder();
            sb.append("getPngAttributes starting with: ");
            sb.append(bVar);
            Log.d("ExifInterface", sb.toString());
        }
        bVar.mo5263F(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f4859m;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 == 16) {
                        if (!Arrays.equals(bArr2, f4861o)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, f4862p)) {
                        if (Arrays.equals(bArr2, f4860n)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f4888q0 = i2;
                                    m5798H(bArr3, 0);
                                    m5805O();
                                    return;
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                                sb2.append(readInt2);
                                sb2.append(", calculated CRC value: ");
                                sb2.append(crc32.getValue());
                                throw new IOException(sb2.toString());
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Failed to read given length for given PNG chunk type: ");
                            sb3.append(m5807b(bArr2));
                            throw new IOException(sb3.toString());
                        }
                        int i3 = readInt + 4;
                        bVar.skipBytes(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: l */
    private void m5815l(C0683b bVar) throws IOException {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m5811h(bVar, i, 5);
        bVar.mo5262E((long) i2);
        bVar.mo5263F(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        String str = "ExifInterface";
        if (f4846a) {
            StringBuilder sb = new StringBuilder();
            sb.append("numberOfDirectoryEntry: ");
            sb.append(readInt);
            Log.d(str, sb.toString());
        }
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f4829J.f4908a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                C0684c f = C0684c.m5842f(readShort, this.f4880i0);
                C0684c f2 = C0684c.m5842f(readShort2, this.f4880i0);
                this.f4878g0[0].put("ImageLength", f);
                this.f4878g0[0].put("ImageWidth", f2);
                if (f4846a) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Updated to length: ");
                    sb2.append(readShort);
                    sb2.append(", width: ");
                    sb2.append(readShort2);
                    Log.d(str, sb2.toString());
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: m */
    private void m5816m(C0683b bVar) throws IOException {
        m5795E(bVar, bVar.available());
        m5799I(bVar, 0);
        m5804N(bVar, 0);
        m5804N(bVar, 5);
        m5804N(bVar, 4);
        m5805O();
        if (this.f4876e0 == 8) {
            C0684c cVar = (C0684c) this.f4878g0[1].get("MakerNote");
            if (cVar != null) {
                C0683b bVar2 = new C0683b(cVar.f4907d);
                bVar2.mo5263F(this.f4880i0);
                bVar2.mo5262E(6);
                m5799I(bVar2, 9);
                String str = "ColorSpace";
                C0684c cVar2 = (C0684c) this.f4878g0[9].get(str);
                if (cVar2 != null) {
                    this.f4878g0[1].put(str, cVar2);
                }
            }
        }
    }

    /* renamed from: n */
    private void m5817n(C0683b bVar) throws IOException {
        m5816m(bVar);
        if (((C0684c) this.f4878g0[0].get("JpgFromRaw")) != null) {
            m5811h(bVar, this.f4892u0, 5);
        }
        C0684c cVar = (C0684c) this.f4878g0[0].get("ISO");
        String str = "PhotographicSensitivity";
        C0684c cVar2 = (C0684c) this.f4878g0[1].get(str);
        if (cVar != null && cVar2 == null) {
            this.f4878g0[1].put(str, cVar);
        }
    }

    /* renamed from: o */
    private void m5818o(C0683b bVar) throws IOException {
        byte[] bArr = f4843X;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.f4888q0 = bArr.length;
        m5798H(bArr2, 0);
    }

    /* renamed from: p */
    private void m5819p(C0683b bVar) throws IOException {
        if (f4846a) {
            StringBuilder sb = new StringBuilder();
            sb.append("getWebpAttributes starting with: ");
            sb.append(bVar);
            Log.d("ExifInterface", sb.toString());
        }
        bVar.mo5263F(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(f4863q.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(f4864r.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int i = skipBytes + 4;
                    int readInt2 = bVar.readInt();
                    int i2 = i + 4;
                    if (Arrays.equals(f4865s, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f4888q0 = i2;
                            m5798H(bArr2, 0);
                            this.f4888q0 = i2;
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed to read given length for given PNG chunk type: ");
                        sb2.append(m5807b(bArr));
                        throw new IOException(sb2.toString());
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i3 = i2 + readInt2;
                    if (i3 != readInt) {
                        String str = "Encountered WebP file with invalid chunk size";
                        if (i3 <= readInt) {
                            int skipBytes2 = bVar.skipBytes(readInt2);
                            if (skipBytes2 == readInt2) {
                                skipBytes = i2 + skipBytes2;
                            } else {
                                throw new IOException(str);
                            }
                        } else {
                            throw new IOException(str);
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: q */
    private void m5820q(C0683b bVar, HashMap hashMap) throws IOException {
        C0684c cVar = (C0684c) hashMap.get("JPEGInterchangeFormat");
        C0684c cVar2 = (C0684c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int i = cVar.mo5283i(this.f4880i0);
            int i2 = cVar2.mo5283i(this.f4880i0);
            if (this.f4876e0 == 7) {
                i += this.f4889r0;
            }
            int min = Math.min(i2, bVar.mo5259B() - i);
            if (i > 0 && min > 0) {
                this.f4881j0 = true;
                int i3 = this.f4888q0 + i;
                this.f4884m0 = i3;
                this.f4885n0 = min;
                if (this.f4873b0 == null && this.f4875d0 == null && this.f4874c0 == null) {
                    byte[] bArr = new byte[min];
                    bVar.mo5262E((long) i3);
                    bVar.readFully(bArr);
                    this.f4886o0 = bArr;
                }
            }
            if (f4846a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Setting thumbnail attributes with offset: ");
                sb.append(i);
                sb.append(", length: ");
                sb.append(min);
                Log.d("ExifInterface", sb.toString());
            }
        }
    }

    /* renamed from: r */
    private void m5821r(C0683b bVar, HashMap hashMap) throws IOException {
        C0683b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        C0684c cVar = (C0684c) hashMap2.get("StripOffsets");
        C0684c cVar2 = (C0684c) hashMap2.get("StripByteCounts");
        if (!(cVar == null || cVar2 == null)) {
            long[] c = m5808c(cVar.mo5285k(this.f4880i0));
            long[] c2 = m5808c(cVar2.mo5285k(this.f4880i0));
            String str = "ExifInterface";
            if (c == null || c.length == 0) {
                Log.w(str, "stripOffsets should not be null or have zero length.");
            } else if (c2 == null || c2.length == 0) {
                Log.w(str, "stripByteCounts should not be null or have zero length.");
            } else if (c.length != c2.length) {
                Log.w(str, "stripOffsets and stripByteCounts should have same length.");
            } else {
                long j = 0;
                for (long j2 : c2) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                this.f4883l0 = true;
                this.f4882k0 = true;
                this.f4881j0 = true;
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < c.length; i4++) {
                    int i5 = (int) c[i4];
                    int i6 = (int) c2[i4];
                    if (i4 < c.length - 1 && ((long) (i5 + i6)) != c[i4 + 1]) {
                        this.f4883l0 = false;
                    }
                    int i7 = i5 - i2;
                    if (i7 < 0) {
                        Log.d(str, "Invalid strip offset value");
                    }
                    bVar2.mo5262E((long) i7);
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    bVar2.read(bArr2);
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, i6);
                    i3 += i6;
                }
                this.f4886o0 = bArr;
                if (this.f4883l0) {
                    this.f4884m0 = ((int) c[0]) + this.f4888q0;
                    this.f4885n0 = i;
                }
            }
        }
    }

    /* renamed from: s */
    private static boolean m5822s(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f4843X;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f4843X;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0092 A[Catch:{ all -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a1  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m5823t(byte[] r15) throws java.io.IOException {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            b.j.a.a$b r2 = new b.j.a.a$b     // Catch:{ Exception -> 0x008d }
            r2.<init>(r15)     // Catch:{ Exception -> 0x008d }
            int r1 = r2.readInt()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r1     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r2.read(r5)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            byte[] r6 = f4854h     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r5 != 0) goto L_0x001e
            r2.close()
            return r0
        L_0x001e:
            r5 = 16
            r7 = 8
            r9 = 1
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0034
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x0035
            r2.close()
            return r0
        L_0x0034:
            r5 = r7
        L_0x0035:
            int r11 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r11 = (long) r11     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            int r13 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x003d
            int r15 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r15
        L_0x003d:
            long r3 = r3 - r5
            int r15 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r15 >= 0) goto L_0x0046
            r2.close()
            return r0
        L_0x0046:
            byte[] r15 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r5 = 0
            r7 = 0
            r8 = 0
        L_0x004c:
            r11 = 4
            long r11 = r3 / r11
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0081
            int r11 = r2.read(r15)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == r1) goto L_0x005e
            r2.close()
            return r0
        L_0x005e:
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0063
            goto L_0x007f
        L_0x0063:
            byte[] r11 = f4855i     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r12 = 1
            if (r11 == 0) goto L_0x006e
            r7 = 1
            goto L_0x0077
        L_0x006e:
            byte[] r11 = f4856j     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == 0) goto L_0x0077
            r8 = 1
        L_0x0077:
            if (r7 == 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            r2.close()
            return r12
        L_0x007f:
            long r5 = r5 + r9
            goto L_0x004c
        L_0x0081:
            r2.close()
            goto L_0x009e
        L_0x0085:
            r15 = move-exception
            r1 = r2
            goto L_0x009f
        L_0x0088:
            r15 = move-exception
            r1 = r2
            goto L_0x008e
        L_0x008b:
            r15 = move-exception
            goto L_0x009f
        L_0x008d:
            r15 = move-exception
        L_0x008e:
            boolean r2 = f4846a     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = "ExifInterface"
            java.lang.String r3 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r3, r15)     // Catch:{ all -> 0x008b }
        L_0x0099:
            if (r1 == 0) goto L_0x009e
            r1.close()
        L_0x009e:
            return r0
        L_0x009f:
            if (r1 == 0) goto L_0x00a4
            r1.close()
        L_0x00a4:
            goto L_0x00a6
        L_0x00a5:
            throw r15
        L_0x00a6:
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p051j.p052a.ExifInterface.m5823t(byte[]):boolean");
    }

    /* renamed from: u */
    private static boolean m5824u(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f4853g;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0030  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m5825v(byte[] r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            b.j.a.a$b r2 = new b.j.a.a$b     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            java.nio.ByteOrder r4 = r3.m5797G(r2)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r3.f4880i0 = r4     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r2.mo5263F(r4)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L_0x001c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r2.close()
            return r0
        L_0x0021:
            r4 = move-exception
            r1 = r2
            goto L_0x0027
        L_0x0024:
            r1 = r2
            goto L_0x002e
        L_0x0026:
            r4 = move-exception
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            throw r4
        L_0x002d:
        L_0x002e:
            if (r1 == 0) goto L_0x0033
            r1.close()
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p051j.p052a.ExifInterface.m5825v(byte[]):boolean");
    }

    /* renamed from: w */
    private boolean m5826w(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f4859m;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: x */
    private boolean m5827x(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m5828y(byte[] r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            b.j.a.a$b r2 = new b.j.a.a$b     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            java.nio.ByteOrder r4 = r3.m5797G(r2)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r3.f4880i0 = r4     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r2.mo5263F(r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r1 = 85
            if (r4 != r1) goto L_0x0019
            r0 = 1
        L_0x0019:
            r2.close()
            return r0
        L_0x001d:
            r4 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x002a
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            throw r4
        L_0x0029:
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p051j.p052a.ExifInterface.m5828y(byte[]):boolean");
    }

    /* renamed from: z */
    private static boolean m5829z(FileDescriptor fileDescriptor) {
        if (VERSION.SDK_INT >= 21) {
            try {
                Os.lseek(fileDescriptor, 0, OsConstants.SEEK_CUR);
                return true;
            } catch (Exception unused) {
                if (f4846a) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public String mo5254d(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        C0684c f = m5809f(str);
        if (f != null) {
            if (!f4840U.contains(str)) {
                return f.mo5284j(this.f4880i0);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = f.f4904a;
                String str2 = "ExifInterface";
                if (i == 5 || i == 10) {
                    C0686e[] eVarArr = (C0686e[]) f.mo5285k(this.f4880i0);
                    if (eVarArr == null || eVarArr.length != 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid GPS Timestamp array. array=");
                        sb.append(Arrays.toString(eVarArr));
                        Log.w(str2, sb.toString());
                        return null;
                    }
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) eVarArr[0].f4912a) / ((float) eVarArr[0].f4913b))), Integer.valueOf((int) (((float) eVarArr[1].f4912a) / ((float) eVarArr[1].f4913b))), Integer.valueOf((int) (((float) eVarArr[2].f4912a) / ((float) eVarArr[2].f4913b)))});
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("GPS Timestamp format is not rational. format=");
                sb2.append(f.f4904a);
                Log.w(str2, sb2.toString());
                return null;
            }
            try {
                return Double.toString(f.mo5282h(this.f4880i0));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public int mo5255e(String str, int i) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        C0684c f = m5809f(str);
        if (f == null) {
            return i;
        }
        try {
            return f.mo5283i(this.f4880i0);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    private ExifInterface(InputStream inputStream, boolean z) throws IOException {
        C0685d[][] dVarArr = f4834O;
        this.f4878g0 = new HashMap[dVarArr.length];
        this.f4879h0 = new HashSet(dVarArr.length);
        this.f4880i0 = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.f4873b0 = null;
        if (z) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            if (!m5822s(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f4877f0 = true;
            this.f4875d0 = null;
            this.f4874c0 = null;
            r3 = bufferedInputStream;
        } else if (inputStream instanceof AssetInputStream) {
            this.f4875d0 = (AssetInputStream) inputStream;
            this.f4874c0 = null;
            r3 = inputStream;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (m5829z(fileInputStream.getFD())) {
                    this.f4875d0 = null;
                    this.f4874c0 = fileInputStream.getFD();
                    r3 = inputStream;
                }
            }
            this.f4875d0 = null;
            this.f4874c0 = null;
            r3 = inputStream;
        }
        m5794D(r3);
    }
}
