package p067c.p068a.p069a.p070a.p088h2.p090j;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: c.a.a.a.h2.j.c */
public final class EventMessageEncoder {

    /* renamed from: a */
    private final ByteArrayOutputStream f7246a;

    /* renamed from: b */
    private final DataOutputStream f7247b;

    public EventMessageEncoder() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f7246a = byteArrayOutputStream;
        this.f7247b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    private static void m8730b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: c */
    private static void m8731c(DataOutputStream dataOutputStream, long j) throws IOException {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }

    /* renamed from: a */
    public byte[] mo6584a(EventMessage aVar) {
        this.f7246a.reset();
        try {
            m8730b(this.f7247b, aVar.f7240c);
            String str = aVar.f7241d;
            if (str == null) {
                str = "";
            }
            m8730b(this.f7247b, str);
            m8731c(this.f7247b, aVar.f7242e);
            m8731c(this.f7247b, aVar.f7243f);
            this.f7247b.write(aVar.f7244g);
            this.f7247b.flush();
            return this.f7246a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
