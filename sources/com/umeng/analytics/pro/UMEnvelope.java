package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.umeng.analytics.pro.aj */
public class UMEnvelope implements TBase<UMEnvelope, C3113e>, Serializable, Cloneable {

    /* renamed from: A */
    private static final int f16665A = 2;

    /* renamed from: B */
    private static final int f16666B = 3;

    /* renamed from: k */
    public static final Map<C3113e, FieldMetaData> f16667k;

    /* renamed from: l */
    private static final long f16668l = 420342210744516016L;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final TStruct f16669m = new TStruct("UMEnvelope");
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final TField f16670n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final TField f16671o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final TField f16672p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final TField f16673q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final TField f16674r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final TField f16675s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final TField f16676t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final TField f16677u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final TField f16678v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final TField f16679w;

    /* renamed from: x */
    private static final Map<Class<? extends IScheme>, SchemeFactory> f16680x;

    /* renamed from: y */
    private static final int f16681y = 0;

    /* renamed from: z */
    private static final int f16682z = 1;

    /* renamed from: C */
    private byte f16683C;

    /* renamed from: D */
    private C3113e[] f16684D;

    /* renamed from: a */
    public String f16685a;

    /* renamed from: b */
    public String f16686b;

    /* renamed from: c */
    public String f16687c;

    /* renamed from: d */
    public int f16688d;

    /* renamed from: e */
    public int f16689e;

    /* renamed from: f */
    public int f16690f;

    /* renamed from: g */
    public ByteBuffer f16691g;

    /* renamed from: h */
    public String f16692h;

    /* renamed from: i */
    public String f16693i;

    /* renamed from: j */
    public int f16694j;

    /* renamed from: com.umeng.analytics.pro.aj$a */
    /* compiled from: UMEnvelope */
    private static class C3109a extends StandardScheme<UMEnvelope> {
        private C3109a() {
        }

        /* renamed from: a */
        public void mo18932b(TProtocol bpVar, UMEnvelope ajVar) throws TException {
            bpVar.mo19036j();
            while (true) {
                TField l = bpVar.mo19038l();
                byte b = l.f16825b;
                if (b == 0) {
                    bpVar.mo19037k();
                    if (!ajVar.mo18912m()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Required field 'serial_num' was not found in serialized data! Struct: ");
                        sb.append(toString());
                        throw new TProtocolException(sb.toString());
                    } else if (!ajVar.mo18915p()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Required field 'ts_secs' was not found in serialized data! Struct: ");
                        sb2.append(toString());
                        throw new TProtocolException(sb2.toString());
                    } else if (ajVar.mo18919s()) {
                        ajVar.mo18874G();
                        return;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Required field 'length' was not found in serialized data! Struct: ");
                        sb3.append(toString());
                        throw new TProtocolException(sb3.toString());
                    }
                } else {
                    switch (l.f16826c) {
                        case 1:
                            if (b != 11) {
                                TProtocolUtil.m21871a(bpVar, b);
                                break;
                            } else {
                                ajVar.f16685a = bpVar.mo19052z();
                                ajVar.mo18880a(true);
                                break;
                            }
                        case 2:
                            if (b != 11) {
                                TProtocolUtil.m21871a(bpVar, b);
                                break;
                            } else {
                                ajVar.f16686b = bpVar.mo19052z();
                                ajVar.mo18884b(true);
                                break;
                            }
                        case 3:
                            if (b != 11) {
                                TProtocolUtil.m21871a(bpVar, b);
                                break;
                            } else {
                                ajVar.f16687c = bpVar.mo19052z();
                                ajVar.mo18888c(true);
                                break;
                            }
                        case 4:
                            if (b != 8) {
                                TProtocolUtil.m21871a(bpVar, b);
                                break;
                            } else {
                                ajVar.f16688d = bpVar.mo19049w();
                                ajVar.mo18892d(true);
                                break;
                            }
                        case 5:
                            if (b != 8) {
                                TProtocolUtil.m21871a(bpVar, b);
                                break;
                            } else {
                                ajVar.f16689e = bpVar.mo19049w();
                                ajVar.mo18898e(true);
                                break;
                            }
                        case 6:
                            if (b != 8) {
                                TProtocolUtil.m21871a(bpVar, b);
                                break;
                            } else {
                                ajVar.f16690f = bpVar.mo19049w();
                                ajVar.mo18900f(true);
                                break;
                            }
                        case 7:
                            if (b != 11) {
                                TProtocolUtil.m21871a(bpVar, b);
                                break;
                            } else {
                                ajVar.f16691g = bpVar.mo19009A();
                                ajVar.mo18902g(true);
                                break;
                            }
                        case 8:
                            if (b != 11) {
                                TProtocolUtil.m21871a(bpVar, b);
                                break;
                            } else {
                                ajVar.f16692h = bpVar.mo19052z();
                                ajVar.mo18905h(true);
                                break;
                            }
                        case 9:
                            if (b != 11) {
                                TProtocolUtil.m21871a(bpVar, b);
                                break;
                            } else {
                                ajVar.f16693i = bpVar.mo19052z();
                                ajVar.mo18907i(true);
                                break;
                            }
                        case 10:
                            if (b != 8) {
                                TProtocolUtil.m21871a(bpVar, b);
                                break;
                            } else {
                                ajVar.f16694j = bpVar.mo19049w();
                                ajVar.mo18908j(true);
                                break;
                            }
                        default:
                            TProtocolUtil.m21871a(bpVar, b);
                            break;
                    }
                    bpVar.mo19039m();
                }
            }
        }

        /* renamed from: b */
        public void mo18930a(TProtocol bpVar, UMEnvelope ajVar) throws TException {
            ajVar.mo18874G();
            bpVar.mo19020a(UMEnvelope.f16669m);
            if (ajVar.f16685a != null) {
                bpVar.mo19015a(UMEnvelope.f16670n);
                bpVar.mo19021a(ajVar.f16685a);
                bpVar.mo19027c();
            }
            if (ajVar.f16686b != null) {
                bpVar.mo19015a(UMEnvelope.f16671o);
                bpVar.mo19021a(ajVar.f16686b);
                bpVar.mo19027c();
            }
            if (ajVar.f16687c != null) {
                bpVar.mo19015a(UMEnvelope.f16672p);
                bpVar.mo19021a(ajVar.f16687c);
                bpVar.mo19027c();
            }
            bpVar.mo19015a(UMEnvelope.f16673q);
            bpVar.mo19013a(ajVar.f16688d);
            bpVar.mo19027c();
            bpVar.mo19015a(UMEnvelope.f16674r);
            bpVar.mo19013a(ajVar.f16689e);
            bpVar.mo19027c();
            bpVar.mo19015a(UMEnvelope.f16675s);
            bpVar.mo19013a(ajVar.f16690f);
            bpVar.mo19027c();
            if (ajVar.f16691g != null) {
                bpVar.mo19015a(UMEnvelope.f16676t);
                bpVar.mo19022a(ajVar.f16691g);
                bpVar.mo19027c();
            }
            if (ajVar.f16692h != null) {
                bpVar.mo19015a(UMEnvelope.f16677u);
                bpVar.mo19021a(ajVar.f16692h);
                bpVar.mo19027c();
            }
            if (ajVar.f16693i != null) {
                bpVar.mo19015a(UMEnvelope.f16678v);
                bpVar.mo19021a(ajVar.f16693i);
                bpVar.mo19027c();
            }
            if (ajVar.mo18873F()) {
                bpVar.mo19015a(UMEnvelope.f16679w);
                bpVar.mo19013a(ajVar.f16694j);
                bpVar.mo19027c();
            }
            bpVar.mo19029d();
            bpVar.mo19026b();
        }
    }

    /* renamed from: com.umeng.analytics.pro.aj$b */
    /* compiled from: UMEnvelope */
    private static class C3110b implements SchemeFactory {
        private C3110b() {
        }

        /* renamed from: a */
        public C3109a mo18934b() {
            return new C3109a();
        }
    }

    /* renamed from: com.umeng.analytics.pro.aj$c */
    /* compiled from: UMEnvelope */
    private static class C3111c extends TupleScheme<UMEnvelope> {
        private C3111c() {
        }

        /* renamed from: a */
        public void mo18930a(TProtocol bpVar, UMEnvelope ajVar) throws TException {
            TTupleProtocol bvVar = (TTupleProtocol) bpVar;
            bvVar.mo19021a(ajVar.f16685a);
            bvVar.mo19021a(ajVar.f16686b);
            bvVar.mo19021a(ajVar.f16687c);
            bvVar.mo19013a(ajVar.f16688d);
            bvVar.mo19013a(ajVar.f16689e);
            bvVar.mo19013a(ajVar.f16690f);
            bvVar.mo19022a(ajVar.f16691g);
            bvVar.mo19021a(ajVar.f16692h);
            bvVar.mo19021a(ajVar.f16693i);
            BitSet bitSet = new BitSet();
            if (ajVar.mo18873F()) {
                bitSet.set(0);
            }
            bvVar.mo19064a(bitSet, 1);
            if (ajVar.mo18873F()) {
                bvVar.mo19013a(ajVar.f16694j);
            }
        }

        /* renamed from: b */
        public void mo18932b(TProtocol bpVar, UMEnvelope ajVar) throws TException {
            TTupleProtocol bvVar = (TTupleProtocol) bpVar;
            ajVar.f16685a = bvVar.mo19052z();
            ajVar.mo18880a(true);
            ajVar.f16686b = bvVar.mo19052z();
            ajVar.mo18884b(true);
            ajVar.f16687c = bvVar.mo19052z();
            ajVar.mo18888c(true);
            ajVar.f16688d = bvVar.mo19049w();
            ajVar.mo18892d(true);
            ajVar.f16689e = bvVar.mo19049w();
            ajVar.mo18898e(true);
            ajVar.f16690f = bvVar.mo19049w();
            ajVar.mo18900f(true);
            ajVar.f16691g = bvVar.mo19009A();
            ajVar.mo18902g(true);
            ajVar.f16692h = bvVar.mo19052z();
            ajVar.mo18905h(true);
            ajVar.f16693i = bvVar.mo19052z();
            ajVar.mo18907i(true);
            if (bvVar.mo19065b(1).get(0)) {
                ajVar.f16694j = bvVar.mo19049w();
                ajVar.mo18908j(true);
            }
        }
    }

    /* renamed from: com.umeng.analytics.pro.aj$d */
    /* compiled from: UMEnvelope */
    private static class C3112d implements SchemeFactory {
        private C3112d() {
        }

        /* renamed from: a */
        public C3111c mo18934b() {
            return new C3111c();
        }
    }

    /* renamed from: com.umeng.analytics.pro.aj$e */
    /* compiled from: UMEnvelope */
    public enum C3113e implements TFieldIdEnum {
        VERSION(1, "version"),
        ADDRESS(2, "address"),
        SIGNATURE(3, "signature"),
        SERIAL_NUM(4, "serial_num"),
        TS_SECS(5, "ts_secs"),
        LENGTH(6, "length"),
        ENTITY(7, "entity"),
        GUID(8, "guid"),
        CHECKSUM(9, "checksum"),
        CODEX(10, "codex");
        

        /* renamed from: k */
        private static final Map<String, C3113e> f16705k = null;

        /* renamed from: l */
        private final short f16707l;

        /* renamed from: m */
        private final String f16708m;

        static {
            f16705k = new HashMap();
            Iterator it = EnumSet.allOf(C3113e.class).iterator();
            while (it.hasNext()) {
                C3113e eVar = (C3113e) it.next();
                f16705k.put(eVar.mo18939b(), eVar);
            }
        }

        private C3113e(short s, String str) {
            this.f16707l = s;
            this.f16708m = str;
        }

        /* renamed from: a */
        public static C3113e m21586a(int i) {
            switch (i) {
                case 1:
                    return VERSION;
                case 2:
                    return ADDRESS;
                case 3:
                    return SIGNATURE;
                case 4:
                    return SERIAL_NUM;
                case 5:
                    return TS_SECS;
                case 6:
                    return LENGTH;
                case 7:
                    return ENTITY;
                case 8:
                    return GUID;
                case 9:
                    return CHECKSUM;
                case 10:
                    return CODEX;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public static C3113e m21588b(int i) {
            C3113e a = m21586a(i);
            if (a != null) {
                return a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Field ");
            sb.append(i);
            sb.append(" doesn't exist!");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: b */
        public String mo18939b() {
            return this.f16708m;
        }

        /* renamed from: a */
        public static C3113e m21587a(String str) {
            return (C3113e) f16705k.get(str);
        }

        /* renamed from: a */
        public short mo18938a() {
            return this.f16707l;
        }
    }

    static {
        String str = "version";
        f16670n = new TField(str, 11, 1);
        String str2 = "address";
        f16671o = new TField(str2, 11, 2);
        String str3 = "signature";
        f16672p = new TField(str3, 11, 3);
        String str4 = "serial_num";
        f16673q = new TField(str4, 8, 4);
        String str5 = "ts_secs";
        f16674r = new TField(str5, 8, 5);
        String str6 = "length";
        f16675s = new TField(str6, 8, 6);
        String str7 = "entity";
        f16676t = new TField(str7, 11, 7);
        String str8 = "guid";
        f16677u = new TField(str8, 11, 8);
        String str9 = "checksum";
        f16678v = new TField(str9, 11, 9);
        String str10 = "codex";
        f16679w = new TField(str10, 8, 10);
        HashMap hashMap = new HashMap();
        f16680x = hashMap;
        hashMap.put(StandardScheme.class, new C3110b());
        hashMap.put(TupleScheme.class, new C3112d());
        EnumMap enumMap = new EnumMap(C3113e.class);
        enumMap.put(C3113e.VERSION, new FieldMetaData(str, 1, new FieldValueMetaData(11)));
        enumMap.put(C3113e.ADDRESS, new FieldMetaData(str2, 1, new FieldValueMetaData(11)));
        enumMap.put(C3113e.SIGNATURE, new FieldMetaData(str3, 1, new FieldValueMetaData(11)));
        enumMap.put(C3113e.SERIAL_NUM, new FieldMetaData(str4, 1, new FieldValueMetaData(8)));
        enumMap.put(C3113e.TS_SECS, new FieldMetaData(str5, 1, new FieldValueMetaData(8)));
        enumMap.put(C3113e.LENGTH, new FieldMetaData(str6, 1, new FieldValueMetaData(8)));
        enumMap.put(C3113e.ENTITY, new FieldMetaData(str7, 1, new FieldValueMetaData(11, true)));
        enumMap.put(C3113e.GUID, new FieldMetaData(str8, 1, new FieldValueMetaData(11)));
        enumMap.put(C3113e.CHECKSUM, new FieldMetaData(str9, 1, new FieldValueMetaData(11)));
        enumMap.put(C3113e.CODEX, new FieldMetaData(str10, 2, new FieldValueMetaData(8)));
        Map<C3113e, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f16667k = unmodifiableMap;
        FieldMetaData.m21706a(UMEnvelope.class, unmodifiableMap);
    }

    public UMEnvelope() {
        this.f16683C = 0;
        this.f16684D = new C3113e[]{C3113e.CODEX};
    }

    /* renamed from: A */
    public String mo18868A() {
        return this.f16693i;
    }

    /* renamed from: B */
    public void mo18869B() {
        this.f16693i = null;
    }

    /* renamed from: C */
    public boolean mo18870C() {
        return this.f16693i != null;
    }

    /* renamed from: D */
    public int mo18871D() {
        return this.f16694j;
    }

    /* renamed from: E */
    public void mo18872E() {
        this.f16683C = EncodingUtils.m21616b(this.f16683C, 3);
    }

    /* renamed from: F */
    public boolean mo18873F() {
        return EncodingUtils.m21612a(this.f16683C, 3);
    }

    /* renamed from: G */
    public void mo18874G() throws TException {
        if (this.f16685a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Required field 'version' was not present! Struct: ");
            sb.append(toString());
            throw new TProtocolException(sb.toString());
        } else if (this.f16686b == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Required field 'address' was not present! Struct: ");
            sb2.append(toString());
            throw new TProtocolException(sb2.toString());
        } else if (this.f16687c == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Required field 'signature' was not present! Struct: ");
            sb3.append(toString());
            throw new TProtocolException(sb3.toString());
        } else if (this.f16691g == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required field 'entity' was not present! Struct: ");
            sb4.append(toString());
            throw new TProtocolException(sb4.toString());
        } else if (this.f16692h == null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Required field 'guid' was not present! Struct: ");
            sb5.append(toString());
            throw new TProtocolException(sb5.toString());
        } else if (this.f16693i == null) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Required field 'checksum' was not present! Struct: ");
            sb6.append(toString());
            throw new TProtocolException(sb6.toString());
        }
    }

    /* renamed from: a */
    public UMEnvelope deepCopy() {
        return new UMEnvelope(this);
    }

    /* renamed from: b */
    public String mo18883b() {
        return this.f16685a;
    }

    /* renamed from: c */
    public void mo18887c() {
        this.f16685a = null;
    }

    public void clear() {
        this.f16685a = null;
        this.f16686b = null;
        this.f16687c = null;
        mo18892d(false);
        this.f16688d = 0;
        mo18898e(false);
        this.f16689e = 0;
        mo18900f(false);
        this.f16690f = 0;
        this.f16691g = null;
        this.f16692h = null;
        this.f16693i = null;
        mo18908j(false);
        this.f16694j = 0;
    }

    /* renamed from: d */
    public boolean mo18893d() {
        return this.f16685a != null;
    }

    /* renamed from: e */
    public String mo18897e() {
        return this.f16686b;
    }

    /* renamed from: f */
    public void mo18899f() {
        this.f16686b = null;
    }

    /* renamed from: g */
    public boolean mo18903g() {
        return this.f16686b != null;
    }

    /* renamed from: h */
    public String mo18904h() {
        return this.f16687c;
    }

    /* renamed from: i */
    public void mo18906i() {
        this.f16687c = null;
    }

    /* renamed from: j */
    public boolean mo18909j() {
        return this.f16687c != null;
    }

    /* renamed from: k */
    public int mo18910k() {
        return this.f16688d;
    }

    /* renamed from: l */
    public void mo18911l() {
        this.f16683C = EncodingUtils.m21616b(this.f16683C, 0);
    }

    /* renamed from: m */
    public boolean mo18912m() {
        return EncodingUtils.m21612a(this.f16683C, 0);
    }

    /* renamed from: n */
    public int mo18913n() {
        return this.f16689e;
    }

    /* renamed from: o */
    public void mo18914o() {
        this.f16683C = EncodingUtils.m21616b(this.f16683C, 1);
    }

    /* renamed from: p */
    public boolean mo18915p() {
        return EncodingUtils.m21612a(this.f16683C, 1);
    }

    /* renamed from: q */
    public int mo18916q() {
        return this.f16690f;
    }

    /* renamed from: r */
    public void mo18917r() {
        this.f16683C = EncodingUtils.m21616b(this.f16683C, 2);
    }

    public void read(TProtocol bpVar) throws TException {
        ((SchemeFactory) f16680x.get(bpVar.mo19062D())).mo18934b().mo18932b(bpVar, this);
    }

    /* renamed from: s */
    public boolean mo18919s() {
        return EncodingUtils.m21612a(this.f16683C, 2);
    }

    /* renamed from: t */
    public byte[] mo18920t() {
        mo18878a(TBaseHelper.m21647c(this.f16691g));
        ByteBuffer byteBuffer = this.f16691g;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMEnvelope(");
        sb.append("version:");
        String str = this.f16685a;
        String str2 = "null";
        if (str == null) {
            sb.append(str2);
        } else {
            sb.append(str);
        }
        String str3 = ", ";
        sb.append(str3);
        sb.append("address:");
        String str4 = this.f16686b;
        if (str4 == null) {
            sb.append(str2);
        } else {
            sb.append(str4);
        }
        sb.append(str3);
        sb.append("signature:");
        String str5 = this.f16687c;
        if (str5 == null) {
            sb.append(str2);
        } else {
            sb.append(str5);
        }
        sb.append(str3);
        sb.append("serial_num:");
        sb.append(this.f16688d);
        sb.append(str3);
        sb.append("ts_secs:");
        sb.append(this.f16689e);
        sb.append(str3);
        sb.append("length:");
        sb.append(this.f16690f);
        sb.append(str3);
        sb.append("entity:");
        ByteBuffer byteBuffer = this.f16691g;
        if (byteBuffer == null) {
            sb.append(str2);
        } else {
            TBaseHelper.m21643a(byteBuffer, sb);
        }
        sb.append(str3);
        sb.append("guid:");
        String str6 = this.f16692h;
        if (str6 == null) {
            sb.append(str2);
        } else {
            sb.append(str6);
        }
        sb.append(str3);
        sb.append("checksum:");
        String str7 = this.f16693i;
        if (str7 == null) {
            sb.append(str2);
        } else {
            sb.append(str7);
        }
        if (mo18873F()) {
            sb.append(str3);
            sb.append("codex:");
            sb.append(this.f16694j);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public ByteBuffer mo18922u() {
        return this.f16691g;
    }

    /* renamed from: v */
    public void mo18923v() {
        this.f16691g = null;
    }

    /* renamed from: w */
    public boolean mo18924w() {
        return this.f16691g != null;
    }

    public void write(TProtocol bpVar) throws TException {
        ((SchemeFactory) f16680x.get(bpVar.mo19062D())).mo18934b().mo18930a(bpVar, this);
    }

    /* renamed from: x */
    public String mo18926x() {
        return this.f16692h;
    }

    /* renamed from: y */
    public void mo18927y() {
        this.f16692h = null;
    }

    /* renamed from: z */
    public boolean mo18928z() {
        return this.f16692h != null;
    }

    /* renamed from: a */
    public UMEnvelope mo18877a(String str) {
        this.f16685a = str;
        return this;
    }

    /* renamed from: b */
    public UMEnvelope mo18882b(String str) {
        this.f16686b = str;
        return this;
    }

    /* renamed from: c */
    public UMEnvelope mo18886c(String str) {
        this.f16687c = str;
        return this;
    }

    /* renamed from: d */
    public void mo18892d(boolean z) {
        this.f16683C = EncodingUtils.m21604a(this.f16683C, 0, z);
    }

    /* renamed from: e */
    public void mo18898e(boolean z) {
        this.f16683C = EncodingUtils.m21604a(this.f16683C, 1, z);
    }

    /* renamed from: f */
    public void mo18900f(boolean z) {
        this.f16683C = EncodingUtils.m21604a(this.f16683C, 2, z);
    }

    /* renamed from: g */
    public void mo18902g(boolean z) {
        if (!z) {
            this.f16691g = null;
        }
    }

    /* renamed from: h */
    public void mo18905h(boolean z) {
        if (!z) {
            this.f16692h = null;
        }
    }

    /* renamed from: i */
    public void mo18907i(boolean z) {
        if (!z) {
            this.f16693i = null;
        }
    }

    /* renamed from: j */
    public void mo18908j(boolean z) {
        this.f16683C = EncodingUtils.m21604a(this.f16683C, 3, z);
    }

    /* renamed from: a */
    public void mo18880a(boolean z) {
        if (!z) {
            this.f16685a = null;
        }
    }

    /* renamed from: b */
    public void mo18884b(boolean z) {
        if (!z) {
            this.f16686b = null;
        }
    }

    /* renamed from: c */
    public void mo18888c(boolean z) {
        if (!z) {
            this.f16687c = null;
        }
    }

    /* renamed from: d */
    public UMEnvelope mo18891d(String str) {
        this.f16692h = str;
        return this;
    }

    /* renamed from: e */
    public UMEnvelope mo18896e(String str) {
        this.f16693i = str;
        return this;
    }

    public UMEnvelope(String str, String str2, String str3, int i, int i2, int i3, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f16685a = str;
        this.f16686b = str2;
        this.f16687c = str3;
        this.f16688d = i;
        mo18892d(true);
        this.f16689e = i2;
        mo18898e(true);
        this.f16690f = i3;
        mo18900f(true);
        this.f16691g = byteBuffer;
        this.f16692h = str4;
        this.f16693i = str5;
    }

    /* renamed from: a */
    public UMEnvelope mo18876a(int i) {
        this.f16688d = i;
        mo18892d(true);
        return this;
    }

    /* renamed from: b */
    public UMEnvelope mo18881b(int i) {
        this.f16689e = i;
        mo18898e(true);
        return this;
    }

    /* renamed from: c */
    public UMEnvelope mo18885c(int i) {
        this.f16690f = i;
        mo18900f(true);
        return this;
    }

    /* renamed from: d */
    public UMEnvelope mo18890d(int i) {
        this.f16694j = i;
        mo18908j(true);
        return this;
    }

    /* renamed from: e */
    public C3113e fieldForId(int i) {
        return C3113e.m21586a(i);
    }

    /* renamed from: a */
    public UMEnvelope mo18879a(byte[] bArr) {
        mo18878a(bArr == null ? null : ByteBuffer.wrap(bArr));
        return this;
    }

    /* renamed from: a */
    public UMEnvelope mo18878a(ByteBuffer byteBuffer) {
        this.f16691g = byteBuffer;
        return this;
    }

    /* renamed from: a */
    private void m21518a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new TCompactProtocol(new TIOStreamTransport((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: a */
    private void m21517a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f16683C = 0;
            read(new TCompactProtocol(new TIOStreamTransport((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e.getMessage());
        }
    }

    public UMEnvelope(UMEnvelope ajVar) {
        this.f16683C = 0;
        this.f16684D = new C3113e[]{C3113e.CODEX};
        this.f16683C = ajVar.f16683C;
        if (ajVar.mo18893d()) {
            this.f16685a = ajVar.f16685a;
        }
        if (ajVar.mo18903g()) {
            this.f16686b = ajVar.f16686b;
        }
        if (ajVar.mo18909j()) {
            this.f16687c = ajVar.f16687c;
        }
        this.f16688d = ajVar.f16688d;
        this.f16689e = ajVar.f16689e;
        this.f16690f = ajVar.f16690f;
        if (ajVar.mo18924w()) {
            this.f16691g = TBaseHelper.m21648d(ajVar.f16691g);
        }
        if (ajVar.mo18928z()) {
            this.f16692h = ajVar.f16692h;
        }
        if (ajVar.mo18870C()) {
            this.f16693i = ajVar.f16693i;
        }
        this.f16694j = ajVar.f16694j;
    }
}
