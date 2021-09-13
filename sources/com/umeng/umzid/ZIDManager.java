package com.umeng.umzid;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

public class ZIDManager {

    /* renamed from: c */
    public static ZIDManager f17966c;

    /* renamed from: a */
    public boolean f17967a = false;

    /* renamed from: b */
    public boolean f17968b = false;

    /* renamed from: com.umeng.umzid.ZIDManager$a */
    public class C3282a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f17969a;

        /* renamed from: b */
        public final /* synthetic */ IZIDCompletionCallback f17970b;

        public C3282a(Context context, IZIDCompletionCallback iZIDCompletionCallback) {
            this.f17969a = context;
            this.f17970b = iZIDCompletionCallback;
        }

        public void run() {
            String a = ZIDManager.m22870a(ZIDManager.this, this.f17969a);
            if (TextUtils.isEmpty(a)) {
                IZIDCompletionCallback iZIDCompletionCallback = this.f17970b;
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onFailure("1002", "获取zid失败");
                    return;
                }
                return;
            }
            IZIDCompletionCallback iZIDCompletionCallback2 = this.f17970b;
            if (iZIDCompletionCallback2 != null) {
                iZIDCompletionCallback2.onSuccess(a);
            }
        }
    }

    /* renamed from: com.umeng.umzid.ZIDManager$b */
    public class C3283b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f17972a;

        public C3283b(Context context) {
            this.f17972a = context;
        }

        public void run() {
            ZIDManager.m22871b(ZIDManager.this, this.f17972a);
        }
    }

    /* renamed from: com.umeng.umzid.ZIDManager$c */
    public class C3284c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f17974a;

        public C3284c(Context context) {
            this.f17974a = context;
        }

        public void run() {
            ZIDManager.m22870a(ZIDManager.this, this.f17974a);
        }
    }

    /* renamed from: com.umeng.umzid.ZIDManager$d */
    public class C3285d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f17976a;

        public C3285d(Context context) {
            this.f17976a = context;
        }

        public void run() {
            ZIDManager.m22871b(ZIDManager.this, this.f17976a);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m22870a(ZIDManager zIDManager, Context context) {
        String str = null;
        if (!zIDManager.f17967a) {
            zIDManager.f17967a = true;
            JSONObject jSONObject = new JSONObject();
            try {
                String id = Spy.getID();
                jSONObject.put("zdata", id);
                String c = C3290c.m22881c(context);
                jSONObject.put("mac", c);
                String d = C3290c.m22883d(context);
                jSONObject.put("oaid", d);
                zIDManager.mo19620a(context, jSONObject);
                String a = C3286a.m22874a("https://aaid.umeng.com/api/postZdata", jSONObject.toString());
                if (!TextUtils.isEmpty(a)) {
                    JSONObject jSONObject2 = new JSONObject(a);
                    if (Boolean.valueOf(jSONObject2.optBoolean("suc")).booleanValue()) {
                        C3290c.m22886f(context, id);
                        C3290c.m22878a(context, c);
                        C3290c.m22880b(context, d);
                        str = jSONObject2.optString("aaid");
                        if (!TextUtils.isEmpty(str)) {
                            C3290c.m22885e(context, str);
                        }
                        String string = jSONObject2.getString("uabc");
                        if (!TextUtils.isEmpty(string)) {
                            C3290c.m22884d(context, string);
                        }
                        String string2 = jSONObject2.getString("resetToken");
                        if (!TextUtils.isEmpty(string2)) {
                            C3290c.m22882c(context, string2);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            zIDManager.f17967a = false;
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045 A[SYNTHETIC, Splitter:B:15:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[SYNTHETIC, Splitter:B:23:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e A[SYNTHETIC, Splitter:B:31:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e A[Catch:{ all -> 0x00e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a1 A[Catch:{ all -> 0x00e6 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.String m22871b(com.umeng.umzid.ZIDManager r11, android.content.Context r12) {
        /*
            java.lang.String r0 = "aaid"
            boolean r1 = r11.f17968b
            r2 = 0
            if (r1 == 0) goto L_0x0009
            goto L_0x00e9
        L_0x0009:
            r1 = 1
            r11.f17968b = r1
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = com.umeng.umzid.C3290c.m22879b(r12)     // Catch:{ all -> 0x00e6 }
            java.lang.String r5 = com.umeng.umzid.Spy.getID()     // Catch:{ all -> 0x00e6 }
            java.lang.String r6 = "zdata"
            r3.put(r6, r5)     // Catch:{ all -> 0x00e6 }
            java.lang.String r6 = "old_zdata"
            r3.put(r6, r4)     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = "oaid"
            java.lang.String r6 = ""
            if (r12 == 0) goto L_0x0034
            android.content.SharedPreferences r7 = com.umeng.umzid.C3286a.m22873a(r12)     // Catch:{ all -> 0x00e6 }
            if (r7 == 0) goto L_0x0034
            java.lang.String r7 = r7.getString(r4, r6)     // Catch:{ all -> 0x00e6 }
            goto L_0x0035
        L_0x0034:
            r7 = r6
        L_0x0035:
            java.lang.String r8 = com.umeng.umzid.C3290c.m22883d(r12)     // Catch:{ all -> 0x00e6 }
            java.lang.String r9 = "old_oaid"
            r3.put(r9, r7)     // Catch:{ all -> 0x00e6 }
            r3.put(r4, r8)     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = "mac"
            if (r12 == 0) goto L_0x0050
            android.content.SharedPreferences r7 = com.umeng.umzid.C3286a.m22873a(r12)     // Catch:{ all -> 0x00e6 }
            if (r7 == 0) goto L_0x0050
            java.lang.String r7 = r7.getString(r4, r6)     // Catch:{ all -> 0x00e6 }
            goto L_0x0051
        L_0x0050:
            r7 = r6
        L_0x0051:
            java.lang.String r9 = com.umeng.umzid.C3290c.m22881c(r12)     // Catch:{ all -> 0x00e6 }
            r3.put(r4, r9)     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = "old_mac"
            r3.put(r4, r7)     // Catch:{ all -> 0x00e6 }
            r11.mo19620a(r12, r3)     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = com.umeng.umzid.C3290c.m22877a(r12)     // Catch:{ all -> 0x00e6 }
            r3.put(r0, r4)     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = "uabc"
            if (r12 == 0) goto L_0x0076
            android.content.SharedPreferences r7 = com.umeng.umzid.C3286a.m22873a(r12)     // Catch:{ all -> 0x00e6 }
            if (r7 == 0) goto L_0x0076
            java.lang.String r7 = r7.getString(r4, r6)     // Catch:{ all -> 0x00e6 }
            goto L_0x0077
        L_0x0076:
            r7 = r6
        L_0x0077:
            r3.put(r4, r7)     // Catch:{ all -> 0x00e6 }
            java.lang.String r7 = "resetToken"
            if (r12 == 0) goto L_0x0088
            android.content.SharedPreferences r10 = com.umeng.umzid.C3286a.m22873a(r12)     // Catch:{ all -> 0x00e6 }
            if (r10 == 0) goto L_0x0088
            java.lang.String r6 = r10.getString(r7, r6)     // Catch:{ all -> 0x00e6 }
        L_0x0088:
            boolean r10 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00e6 }
            if (r10 != 0) goto L_0x0091
            r3.put(r7, r6)     // Catch:{ all -> 0x00e6 }
        L_0x0091:
            java.lang.String r6 = "https://aaid.umeng.com/api/updateZdata"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00e6 }
            java.lang.String r3 = com.umeng.umzid.C3286a.m22874a(r6, r3)     // Catch:{ all -> 0x00e6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00e6 }
            if (r6 != 0) goto L_0x00e6
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x00e6 }
            r6.<init>(r3)     // Catch:{ all -> 0x00e6 }
            java.lang.String r3 = "suc"
            boolean r3 = r6.optBoolean(r3)     // Catch:{ all -> 0x00e6 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00e6 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x00e6 }
            if (r3 != r1) goto L_0x00e6
            com.umeng.umzid.C3290c.m22886f(r12, r5)     // Catch:{ all -> 0x00e6 }
            com.umeng.umzid.C3290c.m22878a(r12, r9)     // Catch:{ all -> 0x00e6 }
            com.umeng.umzid.C3290c.m22880b(r12, r8)     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = r6.optString(r0)     // Catch:{ all -> 0x00e6 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00e6 }
            if (r0 != 0) goto L_0x00cc
            com.umeng.umzid.C3290c.m22885e(r12, r2)     // Catch:{ all -> 0x00e6 }
        L_0x00cc:
            java.lang.String r0 = r6.getString(r4)     // Catch:{ all -> 0x00e6 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00e6 }
            if (r1 != 0) goto L_0x00d9
            com.umeng.umzid.C3290c.m22884d(r12, r0)     // Catch:{ all -> 0x00e6 }
        L_0x00d9:
            java.lang.String r0 = r6.getString(r7)     // Catch:{ all -> 0x00e6 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00e6 }
            if (r1 != 0) goto L_0x00e6
            com.umeng.umzid.C3290c.m22882c(r12, r0)     // Catch:{ all -> 0x00e6 }
        L_0x00e6:
            r12 = 0
            r11.f17968b = r12
        L_0x00e9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umzid.ZIDManager.m22871b(com.umeng.umzid.ZIDManager, android.content.Context):java.lang.String");
    }

    public static synchronized ZIDManager getInstance() {
        ZIDManager zIDManager;
        synchronized (ZIDManager.class) {
            if (f17966c == null) {
                f17966c = new ZIDManager();
            }
            zIDManager = f17966c;
        }
        return zIDManager;
    }

    public static String getSDKVersion() {
        return "1.2.2";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String getZID(android.content.Context r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 != 0) goto L_0x0007
            java.lang.String r5 = ""
            monitor-exit(r4)
            return r5
        L_0x0007:
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = com.umeng.umzid.C3290c.m22877a(r5)     // Catch:{ all -> 0x0047 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0021
            com.umeng.umzid.ZIDManager$c r0 = new com.umeng.umzid.ZIDManager$c     // Catch:{ all -> 0x0047 }
            r0.<init>(r5)     // Catch:{ all -> 0x0047 }
            com.umeng.umzid.C3288b.m22876a(r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = ""
            monitor-exit(r4)
            return r5
        L_0x0021:
            if (r5 == 0) goto L_0x0031
            android.content.SharedPreferences r1 = com.umeng.umzid.C3286a.m22873a(r5)     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0031
            java.lang.String r2 = "zdata"
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ all -> 0x0047 }
            goto L_0x0033
        L_0x0031:
            java.lang.String r1 = ""
        L_0x0033:
            java.lang.String r2 = com.umeng.umzid.Spy.getID()     // Catch:{ all -> 0x0047 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x0045
            com.umeng.umzid.ZIDManager$d r1 = new com.umeng.umzid.ZIDManager$d     // Catch:{ all -> 0x0047 }
            r1.<init>(r5)     // Catch:{ all -> 0x0047 }
            com.umeng.umzid.C3288b.m22876a(r1)     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r4)
            return r0
        L_0x0047:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umzid.ZIDManager.getZID(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void init(android.content.Context r4, java.lang.String r5, com.umeng.umzid.IZIDCompletionCallback r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto L_0x000e
            if (r6 == 0) goto L_0x000c
            java.lang.String r4 = "1001"
            java.lang.String r5 = "传入参数Context为null"
            r6.onFailure(r4, r5)     // Catch:{ all -> 0x009c }
        L_0x000c:
            monitor-exit(r3)
            return
        L_0x000e:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x001f
            if (r6 == 0) goto L_0x001d
            java.lang.String r4 = "1003"
            java.lang.String r5 = "传入参数appkey为空"
            r6.onFailure(r4, r5)     // Catch:{ all -> 0x009c }
        L_0x001d:
            monitor-exit(r3)
            return
        L_0x001f:
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x0042
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x009c }
            if (r1 != 0) goto L_0x0042
            android.content.SharedPreferences r1 = com.umeng.umzid.C3286a.m22873a(r0)     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x0042
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x0042
            java.lang.String r2 = "appkey"
            android.content.SharedPreferences$Editor r5 = r1.putString(r2, r5)     // Catch:{ all -> 0x009c }
            r5.commit()     // Catch:{ all -> 0x009c }
        L_0x0042:
            java.lang.String r5 = com.umeng.umzid.C3290c.m22877a(r0)     // Catch:{ all -> 0x009c }
            if (r5 == 0) goto L_0x005d
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x004f
            goto L_0x005d
        L_0x004f:
            com.umeng.umzid.ZIDManager$b r1 = new com.umeng.umzid.ZIDManager$b     // Catch:{ all -> 0x009c }
            r1.<init>(r0)     // Catch:{ all -> 0x009c }
            com.umeng.umzid.C3288b.m22876a(r1)     // Catch:{ all -> 0x009c }
            if (r6 == 0) goto L_0x0065
            r6.onSuccess(r5)     // Catch:{ all -> 0x009c }
            goto L_0x0065
        L_0x005d:
            com.umeng.umzid.ZIDManager$a r5 = new com.umeng.umzid.ZIDManager$a     // Catch:{ all -> 0x009c }
            r5.<init>(r0, r6)     // Catch:{ all -> 0x009c }
            com.umeng.umzid.C3288b.m22876a(r5)     // Catch:{ all -> 0x009c }
        L_0x0065:
            java.lang.String r5 = ""
            android.content.SharedPreferences r6 = com.umeng.umzid.C3286a.m22873a(r4)     // Catch:{ all -> 0x009c }
            if (r6 == 0) goto L_0x0075
            java.lang.String r5 = "uuid"
            java.lang.String r0 = ""
            java.lang.String r5 = r6.getString(r5, r0)     // Catch:{ all -> 0x009c }
        L_0x0075:
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x009c }
            if (r5 == 0) goto L_0x009a
            java.lang.String r5 = ""
            android.content.SharedPreferences r4 = com.umeng.umzid.C3286a.m22873a(r4)     // Catch:{ all -> 0x009c }
            java.util.UUID r6 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x009c }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x008a }
            goto L_0x008b
        L_0x008a:
        L_0x008b:
            if (r4 == 0) goto L_0x009a
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x009c }
            java.lang.String r6 = "uuid"
            android.content.SharedPreferences$Editor r4 = r4.putString(r6, r5)     // Catch:{ all -> 0x009c }
            r4.commit()     // Catch:{ all -> 0x009c }
        L_0x009a:
            monitor-exit(r3)
            return
        L_0x009c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umzid.ZIDManager.init(android.content.Context, java.lang.String, com.umeng.umzid.IZIDCompletionCallback):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079 A[SYNTHETIC, Splitter:B:26:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c9 A[Catch:{ all -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0104 A[SYNTHETIC, Splitter:B:56:0x0104] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01cb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo19620a(android.content.Context r9, org.json.JSONObject r10) {
        /*
            r8 = this;
            java.lang.String r0 = "com.umeng.commonsdk.statistics.common.DeviceConfig"
            java.lang.String r1 = ""
            java.lang.String r2 = com.umeng.umzid.Spy.getVersion()
            java.lang.String r3 = "zdata_ver"
            r10.putOpt(r3, r2)
            r2 = 0
            r3 = 1
            java.lang.Class r4 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0035 }
            java.lang.String r5 = "getAndroidId"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x0035 }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r2] = r7     // Catch:{ all -> 0x0035 }
            java.lang.reflect.Method r5 = r4.getDeclaredMethod(r5, r6)     // Catch:{ all -> 0x0035 }
            if (r5 == 0) goto L_0x0035
            r5.setAccessible(r3)     // Catch:{ all -> 0x0035 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0035 }
            r6[r2] = r9     // Catch:{ all -> 0x0035 }
            java.lang.Object r4 = r5.invoke(r4, r6)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0035
            boolean r5 = r4 instanceof java.lang.String     // Catch:{ all -> 0x0035 }
            if (r5 == 0) goto L_0x0035
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0035 }
            goto L_0x0036
        L_0x0035:
            r4 = r1
        L_0x0036:
            java.lang.String r5 = "android_id"
            r10.putOpt(r5, r4)
            r4 = 0
            java.lang.String r6 = android.os.Environment.getExternalStorageState()
            java.lang.String r7 = "mounted"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x0054
            java.lang.String r7 = "mounted_ro"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r6 = 0
            goto L_0x0055
        L_0x0054:
            r6 = 1
        L_0x0055:
            if (r6 == 0) goto L_0x0065
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 9
            if (r6 < r7) goto L_0x0065
            java.io.File r4 = android.os.Environment.getExternalStorageDirectory()
            long r4 = r4.getFreeSpace()
        L_0x0065:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "storage"
            r10.putOpt(r5, r4)
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            java.lang.String r5 = "os_version"
            r10.putOpt(r5, r4)
            r4 = 0
            if (r9 != 0) goto L_0x0079
            goto L_0x00a5
        L_0x0079:
            android.content.res.Configuration r5 = new android.content.res.Configuration     // Catch:{ all -> 0x008b }
            r5.<init>()     // Catch:{ all -> 0x008b }
            r5.setToDefaults()     // Catch:{ all -> 0x008b }
            android.content.ContentResolver r6 = r9.getContentResolver()     // Catch:{ all -> 0x008b }
            android.provider.Settings.System.getConfiguration(r6, r5)     // Catch:{ all -> 0x008b }
            java.util.Locale r5 = r5.locale     // Catch:{ all -> 0x008b }
            goto L_0x008c
        L_0x008b:
            r5 = r4
        L_0x008c:
            if (r5 != 0) goto L_0x0092
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ all -> 0x00a5 }
        L_0x0092:
            java.util.Calendar r5 = java.util.Calendar.getInstance(r5)     // Catch:{ all -> 0x00a5 }
            if (r5 == 0) goto L_0x00a5
            java.util.TimeZone r5 = r5.getTimeZone()     // Catch:{ all -> 0x00a5 }
            int r5 = r5.getRawOffset()     // Catch:{ all -> 0x00a5 }
            r6 = 3600000(0x36ee80, float:5.044674E-39)
            int r5 = r5 / r6
            goto L_0x00a7
        L_0x00a5:
            r5 = 8
        L_0x00a7:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "timezone"
            r10.putOpt(r6, r5)
            java.lang.String r5 = android.os.Build.MODEL
            java.lang.String r6 = "model"
            r10.putOpt(r6, r5)
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x00dd }
            java.lang.String r5 = "getImeiNew"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x00dd }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r2] = r7     // Catch:{ all -> 0x00dd }
            java.lang.reflect.Method r5 = r0.getDeclaredMethod(r5, r6)     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x00dd
            r5.setAccessible(r3)     // Catch:{ all -> 0x00dd }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x00dd }
            r6[r2] = r9     // Catch:{ all -> 0x00dd }
            java.lang.Object r0 = r5.invoke(r0, r6)     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00dd
            boolean r5 = r0 instanceof java.lang.String     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x00dd
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00dd }
            goto L_0x00de
        L_0x00dd:
            r0 = r1
        L_0x00de:
            java.lang.String r5 = "imei"
            r10.putOpt(r5, r0)
            java.lang.Class<android.os.Build> r0 = android.os.Build.class
            java.lang.String r5 = "getString"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x013b }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r2] = r7     // Catch:{ Exception -> 0x013b }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x013b }
            r0.setAccessible(r3)     // Catch:{ Exception -> 0x013b }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x013b }
            java.lang.String r5 = "net.hostname"
            r3[r2] = r5     // Catch:{ Exception -> 0x013b }
            java.lang.Object r0 = r0.invoke(r4, r3)     // Catch:{ Exception -> 0x013b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x013b }
            if (r0 == 0) goto L_0x013c
            boolean r3 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0139 }
            if (r3 != 0) goto L_0x013c
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ all -> 0x0137 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0137 }
            r3.update(r0)     // Catch:{ all -> 0x0137 }
            byte[] r0 = r3.digest()     // Catch:{ all -> 0x0137 }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ all -> 0x0137 }
            r3.<init>()     // Catch:{ all -> 0x0137 }
            r5 = 0
        L_0x0121:
            int r6 = r0.length     // Catch:{ all -> 0x0137 }
            if (r5 >= r6) goto L_0x0132
            byte r6 = r0[r5]     // Catch:{ all -> 0x0137 }
            r6 = r6 & 255(0xff, float:3.57E-43)
            java.lang.String r6 = java.lang.Integer.toHexString(r6)     // Catch:{ all -> 0x0137 }
            r3.append(r6)     // Catch:{ all -> 0x0137 }
            int r5 = r5 + 1
            goto L_0x0121
        L_0x0132:
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0137 }
            goto L_0x013c
        L_0x0137:
            r0 = r1
            goto L_0x013c
        L_0x0139:
            goto L_0x013c
        L_0x013b:
            r0 = r4
        L_0x013c:
            java.lang.String r3 = "hostname"
            r10.putOpt(r3, r0)
            java.lang.String r0 = "sdk_version"
            java.lang.String r3 = "1.2.2"
            r10.putOpt(r0, r3)
            if (r9 != 0) goto L_0x014c
            r0 = r4
            goto L_0x0150
        L_0x014c:
            java.lang.String r0 = r9.getPackageName()
        L_0x0150:
            java.lang.String r3 = "package_name"
            r10.putOpt(r3, r0)
            java.lang.String r0 = "sdk_type"
            java.lang.String r3 = "Android"
            r10.putOpt(r0, r3)
            android.content.SharedPreferences r0 = com.umeng.umzid.C3286a.m22873a(r9)
            java.lang.String r3 = "uuid"
            if (r0 == 0) goto L_0x0168
            java.lang.String r1 = r0.getString(r3, r1)
        L_0x0168:
            r10.putOpt(r3, r1)
            java.lang.String r0 = "source_id"
            java.lang.String r1 = "umeng"
            r10.putOpt(r0, r1)
            android.content.pm.PackageManager r0 = r9.getPackageManager()     // Catch:{ Exception -> 0x0181 }
            java.lang.String r1 = r9.getPackageName()     // Catch:{ Exception -> 0x0181 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch:{ Exception -> 0x0181 }
            java.lang.String r0 = r0.versionName     // Catch:{ Exception -> 0x0181 }
            goto L_0x0186
        L_0x0181:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r4
        L_0x0186:
            java.lang.String r1 = "app_version"
            r10.putOpt(r1, r0)
            android.content.pm.PackageManager r0 = r9.getPackageManager()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r1 = r9.getPackageName()     // Catch:{ Exception -> 0x01a4 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch:{ Exception -> 0x01a4 }
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ Exception -> 0x01a4 }
            int r0 = r0.labelRes     // Catch:{ Exception -> 0x01a4 }
            android.content.res.Resources r1 = r9.getResources()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x01a4 }
            goto L_0x01a9
        L_0x01a4:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r4
        L_0x01a9:
            java.lang.String r1 = "app_name"
            r10.putOpt(r1, r0)
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ Exception -> 0x01bd }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ Exception -> 0x01bd }
            java.util.Locale r0 = r0.locale     // Catch:{ Exception -> 0x01bd }
            java.lang.String r0 = r0.getCountry()     // Catch:{ Exception -> 0x01bd }
            goto L_0x01c2
        L_0x01bd:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r4
        L_0x01c2:
            java.lang.String r1 = "country"
            r10.putOpt(r1, r0)
            java.lang.String r0 = "appkey"
            if (r9 == 0) goto L_0x01d5
            android.content.SharedPreferences r9 = com.umeng.umzid.C3286a.m22873a(r9)
            if (r9 == 0) goto L_0x01d5
            java.lang.String r4 = r9.getString(r0, r4)
        L_0x01d5:
            r10.putOpt(r0, r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umzid.ZIDManager.mo19620a(android.content.Context, org.json.JSONObject):org.json.JSONObject");
    }
}
