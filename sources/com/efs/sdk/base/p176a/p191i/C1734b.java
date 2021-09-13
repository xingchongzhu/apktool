package com.efs.sdk.base.p176a.p191i;

import com.efs.sdk.base.p176a.p177a.C1651a;
import com.efs.sdk.base.p176a.p179c.C1679b;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.protocol.record.AbsRecordLog;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map.Entry;

/* renamed from: com.efs.sdk.base.a.i.b */
public final class C1734b extends AbsRecordLog {

    /* renamed from: a */
    private String f11416a;

    /* renamed from: b */
    private String f11417b;

    /* renamed from: c */
    private String f11418c;

    /* renamed from: d */
    private String f11419d;

    public C1734b(String str, String str2, String str3) {
        super("wa");
        this.f11416a = str;
        this.f11417b = str2;
        this.f11419d = str3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS", Locale.CHINA);
        C1651a.m14131a();
        this.f11418c = simpleDateFormat.format(new Date(C1651a.m14134b()));
    }

    public final byte[] generate() {
        String generateString = generateString();
        if (C1682a.m14214a().f11303g) {
            C1728d.m14307a("efs.base", generateString);
        }
        return generateString.getBytes();
    }

    public final String generateString() {
        StringBuilder sb = new StringBuilder();
        sb.append("lt=event`");
        sb.append("ev_ct=");
        sb.append(this.f11416a);
        String str = "`";
        sb.append(str);
        sb.append("ev_ac=");
        sb.append(this.f11417b);
        sb.append(str);
        sb.append("tm=");
        sb.append(this.f11418c);
        sb.append(str);
        sb.append("dn=");
        sb.append(this.f11419d);
        sb.append(str);
        for (Entry entry : this.dataMap.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append(str);
        }
        return sb.subSequence(0, sb.length() - 1).toString();
    }

    public final String getLinkId() {
        return "";
    }

    public final String getLinkKey() {
        return "";
    }

    public final void insertGlobal(C1679b bVar) {
        this.dataMap.putAll(bVar.mo9650a());
        this.dataMap.putAll(C1682a.m14214a().mo9636a());
    }
}
