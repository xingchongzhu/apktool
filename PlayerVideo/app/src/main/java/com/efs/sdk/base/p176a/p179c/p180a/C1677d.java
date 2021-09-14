package com.efs.sdk.base.p176a.p179c.p180a;

import com.efs.sdk.base.p176a.p187h.C1728d;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.efs.sdk.base.a.c.a.d */
public final class C1677d {

    /* renamed from: a */
    private static final SimpleDateFormat f11331a = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.CHINA);

    /* renamed from: a */
    public static boolean m14202a(String str, C1673b bVar) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("config");
            int i = jSONObject.getInt("cver");
            if (optJSONObject != null && optJSONObject.length() > 0) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("common");
                if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                    Iterator keys = optJSONObject2.keys();
                    while (keys.hasNext()) {
                        String str2 = (String) keys.next();
                        hashMap.put(str2, optJSONObject2.optString(str2, ""));
                    }
                }
                JSONArray optJSONArray = optJSONObject.optJSONArray("app_configs");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONObject jSONObject2 = (JSONObject) optJSONArray.get(i2);
                        if (jSONObject2 != null && jSONObject2.length() == 2) {
                            JSONArray optJSONArray2 = jSONObject2.optJSONArray("conditions");
                            JSONArray optJSONArray3 = jSONObject2.optJSONArray("actions");
                            if (!(optJSONArray2 == null || optJSONArray3 == null || optJSONArray3.length() <= 0)) {
                                m14201a((Map<String, String>) hashMap, optJSONArray2, optJSONArray3);
                            }
                        }
                    }
                }
            }
            bVar.mo9638a(hashMap);
            bVar.f11315a = i;
            return true;
        } catch (Throwable th) {
            C1728d.m14309b("efs.config", "parseConfig error, data is ".concat(String.valueOf(str)), th);
            return false;
        }
    }

    /* renamed from: b */
    private static int m14203b(String str, String str2) {
        String str3 = "1970/01/01 00:00:00";
        if (str == null) {
            str = str3;
        }
        if (str2 == null) {
            str2 = str3;
        }
        String str4 = "[:/\\s]";
        String[] split = str.split(str4);
        String[] split2 = str2.split(str4);
        int max = Math.max(split.length, split2.length);
        int i = 0;
        while (i < max) {
            int parseInt = i < split.length ? Integer.parseInt(split[i]) : 0;
            int parseInt2 = i < split2.length ? Integer.parseInt(split2[i]) : 0;
            if (parseInt < parseInt2) {
                return -1;
            }
            if (parseInt > parseInt2) {
                return 1;
            }
            i++;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01d4, code lost:
        if (r3 == false) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017a, code lost:
        if (r9.compareTo(r8) != 0) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x017c, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x017f, code lost:
        r3 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m14201a(Map<String, String> r13, JSONArray r14, JSONArray r15) {
        /*
            r0 = 1
            r1 = 0
            r2 = 0
            r3 = 1
        L_0x0004:
            int r4 = r14.length()     // Catch:{ all -> 0x0242 }
            r5 = 0
            r6 = 2
            if (r2 >= r4) goto L_0x01da
            java.lang.Object r4 = r14.get(r2)     // Catch:{ all -> 0x0242 }
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x001d
            int r7 = r4.length()     // Catch:{ all -> 0x0242 }
            if (r7 >= r6) goto L_0x001d
        L_0x001a:
            r3 = 0
            goto L_0x01da
        L_0x001d:
            java.lang.String r7 = "fld"
            java.lang.String r7 = r4.optString(r7)     // Catch:{ all -> 0x0242 }
            java.lang.String r8 = "val"
            java.lang.String r8 = r4.optString(r8)     // Catch:{ all -> 0x0242 }
            java.lang.String r9 = "opc"
            java.lang.String r4 = r4.optString(r9)     // Catch:{ all -> 0x0242 }
            if (r7 == 0) goto L_0x001a
            if (r8 == 0) goto L_0x001a
            if (r4 != 0) goto L_0x0036
            goto L_0x001a
        L_0x0036:
            com.efs.sdk.base.a.c.a r9 = com.efs.sdk.base.p176a.p181d.C1682a.m14214a()     // Catch:{ all -> 0x0242 }
            android.content.Context r10 = r9.f11299c     // Catch:{ all -> 0x0242 }
            java.util.Map r9 = r9.mo9636a()     // Catch:{ all -> 0x0242 }
            java.lang.String r11 = "ver"
            boolean r11 = r11.equals(r7)     // Catch:{ all -> 0x0242 }
            if (r11 == 0) goto L_0x004d
            java.lang.String r9 = com.efs.sdk.base.p176a.p187h.C1730f.m14314a(r10)     // Catch:{ all -> 0x0242 }
            goto L_0x0089
        L_0x004d:
            java.lang.String r11 = "datetime"
            boolean r11 = r11.equals(r7)     // Catch:{ all -> 0x0242 }
            if (r11 == 0) goto L_0x0068
            java.text.SimpleDateFormat r9 = f11331a     // Catch:{ all -> 0x0242 }
            java.util.Date r10 = new java.util.Date     // Catch:{ all -> 0x0242 }
            com.efs.sdk.base.p176a.p177a.C1651a.m14131a()     // Catch:{ all -> 0x0242 }
            long r11 = com.efs.sdk.base.p176a.p177a.C1651a.m14134b()     // Catch:{ all -> 0x0242 }
            r10.<init>(r11)     // Catch:{ all -> 0x0242 }
            java.lang.String r9 = r9.format(r10)     // Catch:{ all -> 0x0242 }
            goto L_0x0089
        L_0x0068:
            java.lang.String r11 = "pkg"
            boolean r11 = r11.equals(r7)     // Catch:{ all -> 0x0242 }
            if (r11 == 0) goto L_0x0075
            java.lang.String r9 = r10.getPackageName()     // Catch:{ all -> 0x0242 }
            goto L_0x0089
        L_0x0075:
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0242 }
            if (r10 != 0) goto L_0x0088
            boolean r10 = r9.containsKey(r7)     // Catch:{ all -> 0x0242 }
            if (r10 == 0) goto L_0x0088
            java.lang.Object r9 = r9.get(r7)     // Catch:{ all -> 0x0242 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0242 }
            goto L_0x0089
        L_0x0088:
            r9 = r5
        L_0x0089:
            if (r9 != 0) goto L_0x0094
            java.lang.String r7 = "isNull"
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x0242 }
            if (r4 != 0) goto L_0x01d6
            goto L_0x001a
        L_0x0094:
            r10 = -1
            int r11 = r4.hashCode()     // Catch:{ all -> 0x0242 }
            switch(r11) {
                case -1555538761: goto L_0x0135;
                case -1295482945: goto L_0x012a;
                case -567445985: goto L_0x011f;
                case 33: goto L_0x0115;
                case 60: goto L_0x010b;
                case 62: goto L_0x0101;
                case 1084: goto L_0x00f7;
                case 1921: goto L_0x00ed;
                case 1922: goto L_0x00e3;
                case 1952: goto L_0x00d9;
                case 1983: goto L_0x00ce;
                case 257797441: goto L_0x00c2;
                case 840862003: goto L_0x00b6;
                case 1743158238: goto L_0x00aa;
                case 2058039875: goto L_0x009e;
                default: goto L_0x009c;
            }     // Catch:{ all -> 0x0242 }
        L_0x009c:
            goto L_0x013f
        L_0x009e:
            java.lang.String r11 = "isEmpty"
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x013f
            r10 = 13
            goto L_0x013f
        L_0x00aa:
            java.lang.String r11 = "endsWith"
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x013f
            r10 = 9
            goto L_0x013f
        L_0x00b6:
            java.lang.String r11 = "matches"
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x013f
            r10 = 14
            goto L_0x013f
        L_0x00c2:
            java.lang.String r11 = "equalsIgnoreCase"
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x013f
            r10 = 12
            goto L_0x013f
        L_0x00ce:
            java.lang.String r11 = ">="
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x013f
            r10 = 3
            goto L_0x013f
        L_0x00d9:
            java.lang.String r11 = "=="
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x013f
            r10 = 0
            goto L_0x013f
        L_0x00e3:
            java.lang.String r11 = "<>"
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x013f
            r10 = 7
            goto L_0x013f
        L_0x00ed:
            java.lang.String r11 = "<="
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x013f
            r10 = 4
            goto L_0x013f
        L_0x00f7:
            java.lang.String r11 = "!="
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x013f
            r10 = 6
            goto L_0x013f
        L_0x0101:
            java.lang.String r11 = ">"
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x013f
            r10 = 1
            goto L_0x013f
        L_0x010b:
            java.lang.String r11 = "<"
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x013f
            r10 = 2
            goto L_0x013f
        L_0x0115:
            java.lang.String r11 = "!"
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x013f
            r10 = 5
            goto L_0x013f
        L_0x011f:
            java.lang.String r11 = "contains"
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x013f
            r10 = 10
            goto L_0x013f
        L_0x012a:
            java.lang.String r11 = "equals"
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x013f
            r10 = 11
            goto L_0x013f
        L_0x0135:
            java.lang.String r11 = "startsWith"
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x013f
            r10 = 8
        L_0x013f:
            r4 = -100
            switch(r10) {
                case 0: goto L_0x01c4;
                case 1: goto L_0x01b4;
                case 2: goto L_0x01a4;
                case 3: goto L_0x0194;
                case 4: goto L_0x0184;
                case 5: goto L_0x0170;
                case 6: goto L_0x0170;
                case 7: goto L_0x0170;
                case 8: goto L_0x016a;
                case 9: goto L_0x0164;
                case 10: goto L_0x015e;
                case 11: goto L_0x0158;
                case 12: goto L_0x0152;
                case 13: goto L_0x014c;
                case 14: goto L_0x0146;
                default: goto L_0x0144;
            }     // Catch:{ all -> 0x0242 }
        L_0x0144:
            goto L_0x01d4
        L_0x0146:
            boolean r3 = r9.matches(r8)     // Catch:{ all -> 0x0242 }
            goto L_0x01d4
        L_0x014c:
            boolean r3 = r9.isEmpty()     // Catch:{ all -> 0x0242 }
            goto L_0x01d4
        L_0x0152:
            boolean r3 = r9.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0242 }
            goto L_0x01d4
        L_0x0158:
            boolean r3 = r9.equals(r8)     // Catch:{ all -> 0x0242 }
            goto L_0x01d4
        L_0x015e:
            boolean r3 = r9.contains(r8)     // Catch:{ all -> 0x0242 }
            goto L_0x01d4
        L_0x0164:
            boolean r3 = r9.endsWith(r8)     // Catch:{ all -> 0x0242 }
            goto L_0x01d4
        L_0x016a:
            boolean r3 = r9.startsWith(r8)     // Catch:{ all -> 0x0242 }
            goto L_0x01d4
        L_0x0170:
            int r3 = m14200a(r7, r9, r8)     // Catch:{ all -> 0x0242 }
            if (r3 != r4) goto L_0x0181
            int r3 = r9.compareTo(r8)     // Catch:{ all -> 0x0242 }
            if (r3 == 0) goto L_0x017f
        L_0x017c:
            r3 = 1
            goto L_0x01d4
        L_0x017f:
            r3 = 0
            goto L_0x01d4
        L_0x0181:
            if (r3 == 0) goto L_0x017f
            goto L_0x017c
        L_0x0184:
            int r3 = m14200a(r7, r9, r8)     // Catch:{ all -> 0x0242 }
            if (r3 != r4) goto L_0x0191
            int r3 = r9.compareTo(r8)     // Catch:{ all -> 0x0242 }
            if (r3 > 0) goto L_0x017f
            goto L_0x017c
        L_0x0191:
            if (r3 > 0) goto L_0x017f
            goto L_0x017c
        L_0x0194:
            int r3 = m14200a(r7, r9, r8)     // Catch:{ all -> 0x0242 }
            if (r3 != r4) goto L_0x01a1
            int r3 = r9.compareTo(r8)     // Catch:{ all -> 0x0242 }
            if (r3 < 0) goto L_0x017f
            goto L_0x017c
        L_0x01a1:
            if (r3 < 0) goto L_0x017f
            goto L_0x017c
        L_0x01a4:
            int r3 = m14200a(r7, r9, r8)     // Catch:{ all -> 0x0242 }
            if (r3 != r4) goto L_0x01b1
            int r3 = r9.compareTo(r8)     // Catch:{ all -> 0x0242 }
            if (r3 >= 0) goto L_0x017f
            goto L_0x017c
        L_0x01b1:
            if (r3 >= 0) goto L_0x017f
            goto L_0x017c
        L_0x01b4:
            int r3 = m14200a(r7, r9, r8)     // Catch:{ all -> 0x0242 }
            if (r3 != r4) goto L_0x01c1
            int r3 = r9.compareTo(r8)     // Catch:{ all -> 0x0242 }
            if (r3 <= 0) goto L_0x017f
            goto L_0x017c
        L_0x01c1:
            if (r3 <= 0) goto L_0x017f
            goto L_0x017c
        L_0x01c4:
            int r3 = m14200a(r7, r9, r8)     // Catch:{ all -> 0x0242 }
            if (r3 != r4) goto L_0x01d1
            int r3 = r9.compareTo(r8)     // Catch:{ all -> 0x0242 }
            if (r3 != 0) goto L_0x017f
            goto L_0x017c
        L_0x01d1:
            if (r3 != 0) goto L_0x017f
            goto L_0x017c
        L_0x01d4:
            if (r3 == 0) goto L_0x01da
        L_0x01d6:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x01da:
            if (r3 != 0) goto L_0x01dd
            return
        L_0x01dd:
            int r14 = r15.length()     // Catch:{ all -> 0x0242 }
            if (r1 >= r14) goto L_0x0241
            java.lang.Object r14 = r15.get(r1)     // Catch:{ all -> 0x0242 }
            org.json.JSONObject r14 = (org.json.JSONObject) r14     // Catch:{ all -> 0x0242 }
            if (r14 == 0) goto L_0x023e
            int r0 = r14.length()     // Catch:{ all -> 0x0242 }
            if (r0 < r6) goto L_0x023e
            java.lang.String r0 = "opt"
            java.lang.String r0 = r14.optString(r0)     // Catch:{ all -> 0x0242 }
            java.lang.String r2 = "set"
            java.lang.Object r2 = r14.opt(r2)     // Catch:{ all -> 0x0242 }
            if (r0 == 0) goto L_0x023e
            if (r2 == 0) goto L_0x023e
            java.lang.String r3 = "lt"
            java.lang.String r3 = r14.optString(r3, r5)     // Catch:{ all -> 0x0242 }
            java.lang.String r4 = "net"
            java.lang.String r14 = r14.optString(r4, r5)     // Catch:{ all -> 0x0242 }
            java.lang.String r4 = "_"
            if (r3 == 0) goto L_0x0223
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0242 }
            r7.<init>()     // Catch:{ all -> 0x0242 }
            r7.append(r0)     // Catch:{ all -> 0x0242 }
            r7.append(r4)     // Catch:{ all -> 0x0242 }
            r7.append(r3)     // Catch:{ all -> 0x0242 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0242 }
        L_0x0223:
            if (r14 == 0) goto L_0x0237
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0242 }
            r3.<init>()     // Catch:{ all -> 0x0242 }
            r3.append(r0)     // Catch:{ all -> 0x0242 }
            r3.append(r4)     // Catch:{ all -> 0x0242 }
            r3.append(r14)     // Catch:{ all -> 0x0242 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0242 }
        L_0x0237:
            java.lang.String r14 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0242 }
            r13.put(r0, r14)     // Catch:{ all -> 0x0242 }
        L_0x023e:
            int r1 = r1 + 1
            goto L_0x01dd
        L_0x0241:
            return
        L_0x0242:
            r13 = move-exception
            java.lang.String r14 = "efs.config"
            java.lang.String r15 = "updateConfigCond error"
            com.efs.sdk.base.p176a.p187h.C1728d.m14309b(r14, r15, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.p176a.p179c.p180a.C1677d.m14201a(java.util.Map, org.json.JSONArray, org.json.JSONArray):void");
    }

    /* renamed from: a */
    private static int m14200a(String str, String str2, String str3) {
        if ("ver".equals(str)) {
            return m14199a(str2, str3);
        }
        if ("datetime".equals(str)) {
            return m14203b(str2, str3);
        }
        return -100;
    }

    /* renamed from: a */
    private static int m14199a(String str, String str2) {
        String str3 = "0";
        if (str == null) {
            str = str3;
        }
        if (str2 == null) {
            str2 = str3;
        }
        String str4 = "\\.";
        String[] split = str.split(str4);
        String[] split2 = str2.split(str4);
        int max = Math.max(split.length, split2.length);
        int i = 0;
        while (i < max) {
            int parseInt = i < split.length ? Integer.parseInt(split[i]) : 0;
            int parseInt2 = i < split2.length ? Integer.parseInt(split2[i]) : 0;
            if (parseInt < parseInt2) {
                return -1;
            }
            if (parseInt > parseInt2) {
                return 1;
            }
            i++;
        }
        return 0;
    }
}
