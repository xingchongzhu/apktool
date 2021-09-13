package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.EncodingUtils;
import com.umeng.analytics.pro.FieldMetaData;
import com.umeng.analytics.pro.FieldValueMetaData;
import com.umeng.analytics.pro.IScheme;
import com.umeng.analytics.pro.SchemeFactory;
import com.umeng.analytics.pro.StandardScheme;
import com.umeng.analytics.pro.StructMetaData;
import com.umeng.analytics.pro.TBase;
import com.umeng.analytics.pro.TCompactProtocol;
import com.umeng.analytics.pro.TException;
import com.umeng.analytics.pro.TField;
import com.umeng.analytics.pro.TFieldIdEnum;
import com.umeng.analytics.pro.TIOStreamTransport;
import com.umeng.analytics.pro.TProtocol;
import com.umeng.analytics.pro.TProtocolException;
import com.umeng.analytics.pro.TProtocolUtil;
import com.umeng.analytics.pro.TStruct;
import com.umeng.analytics.pro.TTupleProtocol;
import com.umeng.analytics.pro.TupleScheme;
import com.umeng.analytics.pro.UMCommonContent;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Response implements TBase<Response, C3244e>, Serializable, Cloneable {
    /* access modifiers changed from: private */
    public static final TField IMPRINT_FIELD_DESC;
    /* access modifiers changed from: private */
    public static final TField MSG_FIELD_DESC;
    /* access modifiers changed from: private */
    public static final TField RESP_CODE_FIELD_DESC;
    /* access modifiers changed from: private */
    public static final TStruct STRUCT_DESC = new TStruct("Response");
    private static final int __RESP_CODE_ISSET_ID = 0;
    public static final Map<C3244e, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private static final long serialVersionUID = -4549277923241195391L;
    private byte __isset_bitfield;
    public Imprint imprint;
    public String msg;
    private C3244e[] optionals;
    public int resp_code;

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$a */
    private static class C3240a extends StandardScheme<Response> {
        private C3240a() {
        }

        /* renamed from: a */
        public void mo18932b(TProtocol bpVar, Response response) throws TException {
            bpVar.mo19036j();
            while (true) {
                TField l = bpVar.mo19038l();
                byte b = l.f16825b;
                if (b == 0) {
                    break;
                }
                short s = l.f16826c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            TProtocolUtil.m21871a(bpVar, b);
                        } else if (b == 12) {
                            Imprint dVar = new Imprint();
                            response.imprint = dVar;
                            dVar.read(bpVar);
                            response.setImprintIsSet(true);
                        } else {
                            TProtocolUtil.m21871a(bpVar, b);
                        }
                    } else if (b == 11) {
                        response.msg = bpVar.mo19052z();
                        response.setMsgIsSet(true);
                    } else {
                        TProtocolUtil.m21871a(bpVar, b);
                    }
                } else if (b == 8) {
                    response.resp_code = bpVar.mo19049w();
                    response.setResp_codeIsSet(true);
                } else {
                    TProtocolUtil.m21871a(bpVar, b);
                }
                bpVar.mo19039m();
            }
            bpVar.mo19037k();
            if (response.isSetResp_code()) {
                response.validate();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Required field 'resp_code' was not found in serialized data! Struct: ");
            sb.append(toString());
            throw new TProtocolException(sb.toString());
        }

        /* renamed from: b */
        public void mo18930a(TProtocol bpVar, Response response) throws TException {
            response.validate();
            bpVar.mo19020a(Response.STRUCT_DESC);
            bpVar.mo19015a(Response.RESP_CODE_FIELD_DESC);
            bpVar.mo19013a(response.resp_code);
            bpVar.mo19027c();
            if (response.msg != null && response.isSetMsg()) {
                bpVar.mo19015a(Response.MSG_FIELD_DESC);
                bpVar.mo19021a(response.msg);
                bpVar.mo19027c();
            }
            if (response.imprint != null && response.isSetImprint()) {
                bpVar.mo19015a(Response.IMPRINT_FIELD_DESC);
                response.imprint.write(bpVar);
                bpVar.mo19027c();
            }
            bpVar.mo19029d();
            bpVar.mo19026b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$b */
    private static class C3241b implements SchemeFactory {
        private C3241b() {
        }

        /* renamed from: a */
        public C3240a mo18934b() {
            return new C3240a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$c */
    private static class C3242c extends TupleScheme<Response> {
        private C3242c() {
        }

        /* renamed from: a */
        public void mo18930a(TProtocol bpVar, Response response) throws TException {
            TTupleProtocol bvVar = (TTupleProtocol) bpVar;
            bvVar.mo19013a(response.resp_code);
            BitSet bitSet = new BitSet();
            if (response.isSetMsg()) {
                bitSet.set(0);
            }
            if (response.isSetImprint()) {
                bitSet.set(1);
            }
            bvVar.mo19064a(bitSet, 2);
            if (response.isSetMsg()) {
                bvVar.mo19021a(response.msg);
            }
            if (response.isSetImprint()) {
                response.imprint.write(bvVar);
            }
        }

        /* renamed from: b */
        public void mo18932b(TProtocol bpVar, Response response) throws TException {
            TTupleProtocol bvVar = (TTupleProtocol) bpVar;
            response.resp_code = bvVar.mo19049w();
            response.setResp_codeIsSet(true);
            BitSet b = bvVar.mo19065b(2);
            if (b.get(0)) {
                response.msg = bvVar.mo19052z();
                response.setMsgIsSet(true);
            }
            if (b.get(1)) {
                Imprint dVar = new Imprint();
                response.imprint = dVar;
                dVar.read(bvVar);
                response.setImprintIsSet(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$d */
    private static class C3243d implements SchemeFactory {
        private C3243d() {
        }

        /* renamed from: a */
        public C3242c mo18934b() {
            return new C3242c();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$e */
    public enum C3244e implements TFieldIdEnum {
        RESP_CODE(1, "resp_code"),
        MSG(2, "msg"),
        IMPRINT(3, UMCommonContent.f16573X);
        

        /* renamed from: d */
        private static final Map<String, C3244e> f17770d = null;

        /* renamed from: e */
        private final short f17772e;

        /* renamed from: f */
        private final String f17773f;

        static {
            f17770d = new HashMap();
            Iterator it = EnumSet.allOf(C3244e.class).iterator();
            while (it.hasNext()) {
                C3244e eVar = (C3244e) it.next();
                f17770d.put(eVar.mo18939b(), eVar);
            }
        }

        private C3244e(short s, String str) {
            this.f17772e = s;
            this.f17773f = str;
        }

        /* renamed from: a */
        public static C3244e m22630a(int i) {
            if (i == 1) {
                return RESP_CODE;
            }
            if (i == 2) {
                return MSG;
            }
            if (i != 3) {
                return null;
            }
            return IMPRINT;
        }

        /* renamed from: b */
        public static C3244e m22632b(int i) {
            C3244e a = m22630a(i);
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
            return this.f17773f;
        }

        /* renamed from: a */
        public static C3244e m22631a(String str) {
            return (C3244e) f17770d.get(str);
        }

        /* renamed from: a */
        public short mo18938a() {
            return this.f17772e;
        }
    }

    static {
        String str = "resp_code";
        RESP_CODE_FIELD_DESC = new TField(str, 8, 1);
        String str2 = "msg";
        MSG_FIELD_DESC = new TField(str2, 11, 2);
        String str3 = UMCommonContent.f16573X;
        IMPRINT_FIELD_DESC = new TField(str3, 12, 3);
        HashMap hashMap = new HashMap();
        schemes = hashMap;
        hashMap.put(StandardScheme.class, new C3241b());
        hashMap.put(TupleScheme.class, new C3243d());
        EnumMap enumMap = new EnumMap(C3244e.class);
        enumMap.put(C3244e.RESP_CODE, new FieldMetaData(str, 1, new FieldValueMetaData(8)));
        enumMap.put(C3244e.MSG, new FieldMetaData(str2, 2, new FieldValueMetaData(11)));
        enumMap.put(C3244e.IMPRINT, new FieldMetaData(str3, 2, new StructMetaData(12, Imprint.class)));
        Map<C3244e, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.m21706a(Response.class, unmodifiableMap);
    }

    public Response() {
        this.__isset_bitfield = 0;
        this.optionals = new C3244e[]{C3244e.MSG, C3244e.IMPRINT};
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
            read(new TCompactProtocol(new TIOStreamTransport((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e.getMessage());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new TCompactProtocol(new TIOStreamTransport((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e.getMessage());
        }
    }

    public void clear() {
        setResp_codeIsSet(false);
        this.resp_code = 0;
        this.msg = null;
        this.imprint = null;
    }

    public Imprint getImprint() {
        return this.imprint;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getResp_code() {
        return this.resp_code;
    }

    public boolean isSetImprint() {
        return this.imprint != null;
    }

    public boolean isSetMsg() {
        return this.msg != null;
    }

    public boolean isSetResp_code() {
        return EncodingUtils.m21612a(this.__isset_bitfield, 0);
    }

    public void read(TProtocol bpVar) throws TException {
        ((SchemeFactory) schemes.get(bpVar.mo19062D())).mo18934b().mo18932b(bpVar, this);
    }

    public Response setImprint(Imprint dVar) {
        this.imprint = dVar;
        return this;
    }

    public void setImprintIsSet(boolean z) {
        if (!z) {
            this.imprint = null;
        }
    }

    public Response setMsg(String str) {
        this.msg = str;
        return this;
    }

    public void setMsgIsSet(boolean z) {
        if (!z) {
            this.msg = null;
        }
    }

    public Response setResp_code(int i) {
        this.resp_code = i;
        setResp_codeIsSet(true);
        return this;
    }

    public void setResp_codeIsSet(boolean z) {
        this.__isset_bitfield = EncodingUtils.m21604a(this.__isset_bitfield, 0, z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response(");
        sb.append("resp_code:");
        sb.append(this.resp_code);
        String str = "null";
        String str2 = ", ";
        if (isSetMsg()) {
            sb.append(str2);
            sb.append("msg:");
            String str3 = this.msg;
            if (str3 == null) {
                sb.append(str);
            } else {
                sb.append(str3);
            }
        }
        if (isSetImprint()) {
            sb.append(str2);
            sb.append("imprint:");
            Imprint dVar = this.imprint;
            if (dVar == null) {
                sb.append(str);
            } else {
                sb.append(dVar);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void unsetImprint() {
        this.imprint = null;
    }

    public void unsetMsg() {
        this.msg = null;
    }

    public void unsetResp_code() {
        this.__isset_bitfield = EncodingUtils.m21616b(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        Imprint dVar = this.imprint;
        if (dVar != null) {
            dVar.mo19548l();
        }
    }

    public void write(TProtocol bpVar) throws TException {
        ((SchemeFactory) schemes.get(bpVar.mo19062D())).mo18934b().mo18930a(bpVar, this);
    }

    public Response deepCopy() {
        return new Response(this);
    }

    public C3244e fieldForId(int i) {
        return C3244e.m22630a(i);
    }

    public Response(int i) {
        this();
        this.resp_code = i;
        setResp_codeIsSet(true);
    }

    public Response(Response response) {
        this.__isset_bitfield = 0;
        this.optionals = new C3244e[]{C3244e.MSG, C3244e.IMPRINT};
        this.__isset_bitfield = response.__isset_bitfield;
        this.resp_code = response.resp_code;
        if (response.isSetMsg()) {
            this.msg = response.msg;
        }
        if (response.isSetImprint()) {
            this.imprint = new Imprint(response.imprint);
        }
    }
}
