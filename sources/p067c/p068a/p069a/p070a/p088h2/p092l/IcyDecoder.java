package p067c.p068a.p069a.p070a.p088h2.p092l;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.MetadataInputBuffer;
import p067c.p068a.p069a.p070a.p088h2.SimpleMetadataDecoder;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p135a.Charsets;

/* renamed from: c.a.a.a.h2.l.a */
public final class IcyDecoder extends SimpleMetadataDecoder {

    /* renamed from: a */
    private static final Pattern f7258a = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: b */
    private final CharsetDecoder f7259b = Charsets.f9743c.newDecoder();

    /* renamed from: c */
    private final CharsetDecoder f7260c = Charsets.f9742b.newDecoder();

    /* renamed from: c */
    private String m8741c(ByteBuffer byteBuffer) {
        try {
            return this.f7259b.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                return this.f7260c.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f7260c.reset();
                byteBuffer.rewind();
            }
        } finally {
            this.f7259b.reset();
            byteBuffer.rewind();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Metadata mo6566b(MetadataInputBuffer eVar, ByteBuffer byteBuffer) {
        String c = m8741c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f7258a.matcher(c);
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String J0 = Util.m10256J0(matcher.group(1));
            String group = matcher.group(2);
            if (J0 != null) {
                if (J0.equals("streamurl")) {
                    str2 = group;
                } else if (J0.equals("streamtitle")) {
                    str = group;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
