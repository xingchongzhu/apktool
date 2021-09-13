package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.p259uc.crashsdk.export.LogType;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.CoreProtocolImpl.C3149a;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.r */
public class EventTracker {

    /* renamed from: a */
    private static final String f17230a = "fs_lc_tl_uapp";

    /* renamed from: f */
    private static final String f17231f = "-1";

    /* renamed from: g */
    private static Context f17232g;

    /* renamed from: b */
    private final int f17233b;

    /* renamed from: c */
    private final int f17234c;

    /* renamed from: d */
    private final int f17235d;

    /* renamed from: e */
    private final int f17236e;

    /* renamed from: h */
    private JSONObject f17237h;

    /* renamed from: com.umeng.analytics.pro.r$a */
    /* compiled from: EventTracker */
    private static class C3156a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final EventTracker f17238a = new EventTracker();

        private C3156a() {
        }
    }

    /* renamed from: a */
    public static EventTracker m22079a(Context context) {
        if (f17232g == null && context != null) {
            f17232g = context.getApplicationContext();
        }
        return C3156a.f17238a;
    }

    /* renamed from: b */
    private void m22085b(Context context) {
        try {
            String string = PreferenceWrapper.getDefault(context).getString(f17230a, null);
            if (!TextUtils.isEmpty(string)) {
                this.f17237h = new JSONObject(string);
            }
            m22081a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private void m22088c(Context context) {
        try {
            if (this.f17237h != null) {
                PreferenceWrapper.getDefault(f17232g).edit().putString(f17230a, this.f17237h.toString()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    private EventTracker() {
        this.f17233b = 128;
        this.f17234c = LogType.UNEXP;
        this.f17235d = 1024;
        this.f17236e = 10;
        this.f17237h = null;
        if (0 == 0) {
            try {
                m22085b(f17232g);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private boolean m22089c(String str) {
        if (str == null) {
            return true;
        }
        try {
            if (str.trim().getBytes().length <= 1024) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    public void mo19164a(String str, String str2, long j, int i, String str3) {
        String str4;
        try {
            String str5 = "\\|";
            if (m22084a(str)) {
                if (m22086b(str2)) {
                    if (Arrays.asList(UContent.f16899aG).contains(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("key is ");
                        sb.append(str);
                        sb.append(", please check key, illegal");
                        MLog.m22443e(sb.toString());
                        UMLog.m22222aq(UMLogAnalytics.f17115m, 0, str5);
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", str);
                    jSONObject.put("ts", currentTimeMillis);
                    if (j > 0) {
                        jSONObject.put(UContent.f16888W, j);
                    }
                    jSONObject.put("__t", UMStoreManager.f17039a);
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put(str, str2);
                    }
                    if (UMUtils.isMainProgress(f17232g)) {
                        str4 = SessionIdManager.m22133a().mo19196d(UMGlobalContext.getAppContext(f17232g));
                    } else {
                        str4 = SessionIdManager.m22133a().mo19189a(UMGlobalContext.getAppContext(f17232g), currentTimeMillis);
                    }
                    String str6 = "__i";
                    if (TextUtils.isEmpty(str4)) {
                        str4 = f17231f;
                    }
                    jSONObject.put(str6, str4);
                    if (!TextUtils.isEmpty(str3)) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(str3);
                            if (jSONObject2.length() > 0) {
                                jSONObject.put(UContent.f16921au, jSONObject2);
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    jSONObject.put("ds", 0);
                    jSONObject.put("pn", UMGlobalContext.getInstance(f17232g).getProcessName(f17232g));
                    m22081a();
                    JSONObject jSONObject3 = this.f17237h;
                    if (jSONObject3 != null && jSONObject3.has(str) && !((Boolean) this.f17237h.get(str)).booleanValue()) {
                        jSONObject.put(UContent.f16890Y, 1);
                        this.f17237h.put(str, true);
                        m22088c(f17232g);
                    }
                    Context context = f17232g;
                    UMWorkDispatch.sendEvent(context, C3149a.f17185a, CoreProtocol.getInstance(context), jSONObject);
                }
            }
            UMLog.m22222aq(UMLogAnalytics.f17114l, 0, str5);
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    private boolean m22086b(String str) {
        if (str == null) {
            return true;
        }
        try {
            if (str.trim().getBytes().length <= 256) {
                return true;
            }
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("value is ");
        sb.append(str);
        sb.append(", please check value, illegal");
        MLog.m22443e(sb.toString());
        return false;
    }

    /* renamed from: b */
    private boolean m22087b(Map<String, Object> map) {
        String str = "\\|";
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Entry entry : map.entrySet()) {
                        if (!m22084a((String) entry.getKey())) {
                            UMLog.m22222aq(UMLogAnalytics.f17110h, 0, str);
                            return false;
                        } else if (entry.getValue() == null) {
                            UMLog.m22222aq(UMLogAnalytics.f17111i, 0, str);
                            return false;
                        } else if (entry.getValue() instanceof String) {
                            if (UContent.f16897aE.equals(entry.getKey())) {
                                if (!m22089c(entry.getValue().toString())) {
                                    UMLog.m22222aq(UMLogAnalytics.f17074P, 0, str);
                                    return false;
                                }
                            } else if ("_$!url".equals(entry.getKey())) {
                                if (!m22089c(entry.getValue().toString())) {
                                    UMLog.m22222aq("url参数长度超过限制。|参数url长度不能超过1024字符。", 0, str);
                                    return false;
                                }
                            } else if (!m22086b(entry.getValue().toString())) {
                                UMLog.m22222aq(UMLogAnalytics.f17112j, 0, str);
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        UMLog.m22222aq(UMLogAnalytics.f17109g, 0, str);
        return false;
    }

    /* renamed from: a */
    public void mo19165a(String str, Map<String, Object> map, long j, String str2, boolean z) {
        String str3;
        String str4 = "ts";
        try {
            String str5 = "\\|";
            if (!m22084a(str)) {
                UMLog.m22222aq(UMLogAnalytics.f17108f, 0, str5);
            } else if (m22087b(map)) {
                if (map.size() > 100) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("map size is ");
                    sb.append(map.size());
                    sb.append(", please check");
                    MLog.m22443e(sb.toString());
                } else if (Arrays.asList(UContent.f16899aG).contains(str)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("key is ");
                    sb2.append(str);
                    sb2.append(", please check key, illegal");
                    MLog.m22443e(sb2.toString());
                    UMLog.m22222aq(UMLogAnalytics.f17104b, 0, str5);
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", str);
                    jSONObject.put(str4, System.currentTimeMillis());
                    if (j > 0) {
                        jSONObject.put(UContent.f16888W, j);
                    }
                    jSONObject.put("__t", UMStoreManager.f17039a);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("befort ekv map, event is ");
                    sb3.append(jSONObject.toString());
                    ULog.m22479i(sb3.toString());
                    for (Entry entry : map.entrySet()) {
                        if (!Arrays.asList(UContent.f16899aG).contains(entry.getKey())) {
                            Object value = entry.getValue();
                            if (!(value instanceof String) && !(value instanceof Integer) && !(value instanceof Long) && !(value instanceof Short) && !(value instanceof Float)) {
                                if (!(value instanceof Double)) {
                                    String str6 = "please check key or value, illegal type!";
                                    if (value.getClass().isArray()) {
                                        String str7 = "please check key or value, size overlength!";
                                        if (value instanceof int[]) {
                                            int[] iArr = (int[]) value;
                                            if (iArr.length > 10) {
                                                MLog.m22443e(str7);
                                                return;
                                            }
                                            JSONArray jSONArray = new JSONArray();
                                            for (int put : iArr) {
                                                jSONArray.put(put);
                                            }
                                            jSONObject.put((String) entry.getKey(), jSONArray);
                                        } else if (value instanceof double[]) {
                                            double[] dArr = (double[]) value;
                                            if (dArr.length > 10) {
                                                MLog.m22443e(str7);
                                                return;
                                            }
                                            JSONArray jSONArray2 = new JSONArray();
                                            for (double put2 : dArr) {
                                                jSONArray2.put(put2);
                                            }
                                            jSONObject.put((String) entry.getKey(), jSONArray2);
                                        } else if (value instanceof long[]) {
                                            long[] jArr = (long[]) value;
                                            if (jArr.length > 10) {
                                                MLog.m22443e(str7);
                                                return;
                                            }
                                            JSONArray jSONArray3 = new JSONArray();
                                            for (long put3 : jArr) {
                                                jSONArray3.put(put3);
                                            }
                                            jSONObject.put((String) entry.getKey(), jSONArray3);
                                        } else if (value instanceof float[]) {
                                            float[] fArr = (float[]) value;
                                            if (fArr.length > 10) {
                                                MLog.m22443e(str7);
                                                return;
                                            }
                                            JSONArray jSONArray4 = new JSONArray();
                                            for (float f : fArr) {
                                                jSONArray4.put((double) f);
                                            }
                                            jSONObject.put((String) entry.getKey(), jSONArray4);
                                        } else if (value instanceof short[]) {
                                            short[] sArr = (short[]) value;
                                            if (sArr.length > 10) {
                                                MLog.m22443e(str7);
                                                return;
                                            }
                                            JSONArray jSONArray5 = new JSONArray();
                                            for (short put4 : sArr) {
                                                jSONArray5.put(put4);
                                            }
                                            jSONObject.put((String) entry.getKey(), jSONArray5);
                                        } else if (value instanceof String[]) {
                                            String[] strArr = (String[]) value;
                                            if (strArr.length > 10) {
                                                MLog.m22443e(str7);
                                                return;
                                            }
                                            JSONArray jSONArray6 = new JSONArray();
                                            int i = 0;
                                            while (i < strArr.length) {
                                                if (strArr[i] == null) {
                                                    MLog.m22443e("please check array, null item!");
                                                    return;
                                                } else if (m22086b(strArr[i])) {
                                                    jSONArray6.put(strArr[i]);
                                                    i++;
                                                } else {
                                                    return;
                                                }
                                            }
                                            jSONObject.put((String) entry.getKey(), jSONArray6);
                                        } else {
                                            MLog.m22443e(str6);
                                            return;
                                        }
                                    } else {
                                        MLog.m22443e(str6);
                                        return;
                                    }
                                }
                            }
                            jSONObject.put((String) entry.getKey(), value);
                        } else {
                            UMLog.m22222aq(UMLogAnalytics.f17107e, 0, str5);
                            return;
                        }
                    }
                    if (UMUtils.isMainProgress(f17232g)) {
                        str3 = SessionIdManager.m22133a().mo19196d(UMGlobalContext.getAppContext(f17232g));
                    } else {
                        str3 = SessionIdManager.m22133a().mo19189a(UMGlobalContext.getAppContext(f17232g), jSONObject.getLong(str4));
                    }
                    String str8 = "__i";
                    if (TextUtils.isEmpty(str3)) {
                        str3 = f17231f;
                    }
                    jSONObject.put(str8, str3);
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(str2);
                            if (jSONObject2.length() > 0) {
                                jSONObject.put(UContent.f16921au, jSONObject2);
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    jSONObject.put("ds", 0);
                    jSONObject.put("pn", UMGlobalContext.getInstance(f17232g).getProcessName(f17232g));
                    m22081a();
                    JSONObject jSONObject3 = this.f17237h;
                    if (jSONObject3 != null && jSONObject3.has(str) && !((Boolean) this.f17237h.get(str)).booleanValue()) {
                        jSONObject.put(UContent.f16890Y, 1);
                        this.f17237h.put(str, true);
                        m22088c(f17232g);
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("----->>>>>ekv event json is ");
                    sb4.append(jSONObject.toString());
                    ULog.m22479i(sb4.toString());
                    if (!z) {
                        Context context = f17232g;
                        UMWorkDispatch.sendEvent(context, C3149a.f17185a, CoreProtocol.getInstance(context), jSONObject);
                    } else {
                        Context context2 = f17232g;
                        UMWorkDispatch.sendEvent(context2, C3149a.f17198n, CoreProtocol.getInstance(context2), jSONObject);
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public void mo19166a(String str, Map<String, Object> map, String str2) {
        String str3 = UContent.f16888W;
        String str4 = "ts";
        String str5 = "id";
        try {
            if (m22084a(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str5, str);
                jSONObject.put(str4, System.currentTimeMillis());
                jSONObject.put(str3, 0);
                jSONObject.put("__t", UMStoreManager.f17040b);
                StringBuilder sb = new StringBuilder();
                sb.append("befort gkv map, event is ");
                sb.append(jSONObject.toString());
                ULog.m22479i(sb.toString());
                Iterator it = map.entrySet().iterator();
                for (int i = 0; i < 10 && it.hasNext(); i++) {
                    Entry entry = (Entry) it.next();
                    if (!UContent.f16890Y.equals(entry.getKey()) && !str3.equals(entry.getKey()) && !str5.equals(entry.getKey()) && !str4.equals(entry.getKey())) {
                        Object value = entry.getValue();
                        if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long)) {
                            jSONObject.put((String) entry.getKey(), value);
                        }
                    }
                }
                String d = SessionIdManager.m22133a().mo19196d(UMGlobalContext.getAppContext(f17232g));
                String str6 = "__i";
                if (TextUtils.isEmpty(d)) {
                    d = f17231f;
                }
                jSONObject.put(str6, d);
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(UContent.f16921au, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f17232g).getProcessName(f17232g));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("----->>>>>gkv event json is ");
                sb2.append(jSONObject.toString());
                ULog.m22479i(sb2.toString());
                Context context = f17232g;
                UMWorkDispatch.sendEvent(context, C3149a.f17186b, CoreProtocol.getInstance(context), jSONObject);
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    private void m22081a() {
        try {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(f17232g, "track_list", "");
            if (!TextUtils.isEmpty(imprintProperty)) {
                String[] split = imprintProperty.split("!");
                JSONObject jSONObject = new JSONObject();
                int i = 0;
                if (this.f17237h != null) {
                    for (String subStr : split) {
                        String subStr2 = HelperUtils.subStr(subStr, 128);
                        if (this.f17237h.has(subStr2)) {
                            jSONObject.put(subStr2, this.f17237h.get(subStr2));
                        }
                    }
                }
                this.f17237h = new JSONObject();
                if (split.length >= 10) {
                    while (i < 10) {
                        m22082a(split[i], jSONObject);
                        i++;
                    }
                } else {
                    while (i < split.length) {
                        m22082a(split[i], jSONObject);
                        i++;
                    }
                }
                m22088c(f17232g);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m22082a(String str, JSONObject jSONObject) throws JSONException {
        String subStr = HelperUtils.subStr(str, 128);
        if (jSONObject.has(subStr)) {
            m22083a(subStr, ((Boolean) jSONObject.get(subStr)).booleanValue());
        } else {
            m22083a(subStr, false);
        }
    }

    /* renamed from: a */
    private void m22083a(String str, boolean z) {
        try {
            if (!UContent.f16890Y.equals(str) && !UContent.f16888W.equals(str) && !"id".equals(str) && !"ts".equals(str) && !this.f17237h.has(str)) {
                this.f17237h.put(str, z);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo19167a(List<String> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    m22081a();
                    JSONObject jSONObject = this.f17237h;
                    if (jSONObject == null) {
                        this.f17237h = new JSONObject();
                        int size = list.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            JSONObject jSONObject2 = this.f17237h;
                            if (jSONObject2 != null) {
                                if (jSONObject2.length() >= 5) {
                                    break;
                                }
                            } else {
                                this.f17237h = new JSONObject();
                            }
                            String str = (String) list.get(i);
                            if (!TextUtils.isEmpty(str)) {
                                m22083a(HelperUtils.subStr(str, 128), false);
                            }
                            i++;
                        }
                        m22088c(f17232g);
                    } else if (jSONObject.length() >= 5) {
                        MLog.m22437d("already setFistLaunchEvent, igone.");
                        return;
                    } else {
                        int i2 = 0;
                        while (i2 < list.size()) {
                            if (this.f17237h.length() >= 5) {
                                MLog.m22437d(" add setFistLaunchEvent over.");
                                return;
                            } else {
                                m22083a(HelperUtils.subStr((String) list.get(i2), 128), false);
                                i2++;
                            }
                        }
                        m22088c(f17232g);
                    }
                }
            } catch (Exception unused) {
            }
        }
        UMLog.m22222aq(UMLogAnalytics.f17096ak, 0, "\\|");
    }

    /* renamed from: a */
    private JSONObject m22080a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Entry entry : map.entrySet()) {
                try {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        String subStr = HelperUtils.subStr(str, 128);
                        Object value = entry.getValue();
                        if (value != null) {
                            int i = 0;
                            if (value.getClass().isArray()) {
                                if (value instanceof int[]) {
                                    int[] iArr = (int[]) value;
                                    JSONArray jSONArray = new JSONArray();
                                    while (i < iArr.length) {
                                        jSONArray.put(iArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(subStr, jSONArray);
                                } else if (value instanceof double[]) {
                                    double[] dArr = (double[]) value;
                                    JSONArray jSONArray2 = new JSONArray();
                                    while (i < dArr.length) {
                                        jSONArray2.put(dArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(subStr, jSONArray2);
                                } else if (value instanceof long[]) {
                                    long[] jArr = (long[]) value;
                                    JSONArray jSONArray3 = new JSONArray();
                                    while (i < jArr.length) {
                                        jSONArray3.put(jArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(subStr, jSONArray3);
                                } else if (value instanceof float[]) {
                                    float[] fArr = (float[]) value;
                                    JSONArray jSONArray4 = new JSONArray();
                                    while (i < fArr.length) {
                                        jSONArray4.put((double) fArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(subStr, jSONArray4);
                                } else if (value instanceof short[]) {
                                    short[] sArr = (short[]) value;
                                    JSONArray jSONArray5 = new JSONArray();
                                    while (i < sArr.length) {
                                        jSONArray5.put(sArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(subStr, jSONArray5);
                                }
                            } else if (value instanceof List) {
                                List list = (List) value;
                                JSONArray jSONArray6 = new JSONArray();
                                while (i < list.size()) {
                                    Object obj = list.get(i);
                                    if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                                        jSONArray6.put(list.get(i));
                                    }
                                    i++;
                                }
                                if (jSONArray6.length() > 0) {
                                    jSONObject.put(subStr, jSONArray6);
                                }
                            } else if (value instanceof String) {
                                jSONObject.put(subStr, HelperUtils.subStr(value.toString(), LogType.UNEXP));
                            } else {
                                if (!(value instanceof Long) && !(value instanceof Integer) && !(value instanceof Float) && !(value instanceof Double)) {
                                    if (!(value instanceof Short)) {
                                        MLog.m22443e("The param has not support type. please check !");
                                    }
                                }
                                jSONObject.put(subStr, value);
                            }
                        }
                    }
                } catch (Exception e) {
                    MLog.m22447e((Throwable) e);
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private boolean m22084a(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length > 0 && length <= 128) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("key is ");
        sb.append(str);
        sb.append(", please check key, illegal");
        MLog.m22443e(sb.toString());
        return false;
    }
}
