package com.efs.sdk.base.protocol.record;

import com.efs.sdk.base.Constants;
import com.efs.sdk.base.p176a.p179c.C1679b;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p187h.C1728d;
import java.util.HashMap;
import org.json.JSONObject;

public class EfsJSONLog extends AbsRecordLog {
    public EfsJSONLog(String str) {
        super(str);
        put("type", str);
    }

    public byte[] generate() {
        String generateString = generateString();
        if (C1682a.m14214a().f11303g) {
            C1728d.m14307a("efs.base", generateString);
        }
        return generateString.getBytes();
    }

    public String generateString() {
        return new JSONObject(this.dataMap).toString();
    }

    public String getLinkId() {
        HashMap<String, Object> hashMap = this.dataMap;
        String str = Constants.LOG_KEY_LINK_ID;
        if (hashMap.containsKey(str)) {
            return String.valueOf(this.dataMap.get(str));
        }
        return null;
    }

    public String getLinkKey() {
        HashMap<String, Object> hashMap = this.dataMap;
        String str = Constants.LOG_KEY_LINK_KEY;
        if (hashMap.containsKey(str)) {
            return String.valueOf(this.dataMap.get(str));
        }
        return null;
    }

    public void insertGlobal(C1679b bVar) {
        this.dataMap.putAll(bVar.mo9650a());
        this.dataMap.putAll(C1682a.m14214a().mo9636a());
    }
}
