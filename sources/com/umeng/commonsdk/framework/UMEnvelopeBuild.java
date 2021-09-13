package com.umeng.commonsdk.framework;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.CacheDBHelper;
import com.umeng.analytics.pro.Constants;
import com.umeng.analytics.pro.UMCommonContent;
import com.umeng.analytics.pro.UMStoreManager;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType;
import com.umeng.commonsdk.internal.UMInternalConfig;
import com.umeng.commonsdk.internal.UMInternalData;
import com.umeng.commonsdk.statistics.EnvelopeManager;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class UMEnvelopeBuild {
    public static boolean transmissionSendFlag = false;

    private static JSONObject add2CacheTable(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        String str4 = "share";
        String str5 = UMRTLog.RTLOG_TAG;
        if (jSONObject == null || jSONObject2 == null) {
            UMRTLog.m22228e(str5, "--->>> [有状态]构建信封传入 header 或 body 字段为空，直接返回");
            return null;
        }
        UMStoreManager a = UMStoreManager.m21939a(context);
        long currentTimeMillis = System.currentTimeMillis();
        UUID randomUUID = UUID.randomUUID();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.f16725e, str2);
        contentValues.put(Constants.f16726f, a.mo19101c(jSONObject.toString()));
        contentValues.put(Constants.f16727g, a.mo19101c(jSONObject2.toString()));
        contentValues.put(Constants.f16728h, String.valueOf(currentTimeMillis));
        contentValues.put(Constants.f16729i, randomUUID.toString());
        contentValues.put(Constants.f16730j, str);
        contentValues.put(Constants.f16731k, str3);
        CacheDBHelper.m21592a(context).mo18942a(Constants.f16723c, contentValues);
        if (UMCommonContent.f16577aA.equalsIgnoreCase(str2)) {
            UMRTLog.m22228e(str5, "--->>> [有状态]inner业务，返回空 JSONObject。");
        } else {
            String str6 = "header";
            if (UMCommonContent.f16628az.equalsIgnoreCase(str2)) {
                UMRTLog.m22228e(str5, "--->>> [有状态]分享业务 返回body。");
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put(str6, new JSONObject());
                    jSONObject3.put(str4, jSONObject2.getJSONObject(str4));
                    return jSONObject3;
                } catch (JSONException unused) {
                }
            } else if (!UMCommonContent.f16624av.equalsIgnoreCase(str2)) {
                String str7 = "analytics";
                if ("st".equalsIgnoreCase(str2)) {
                    UMRTLog.m22228e(str5, "--->>> [有状态]统计业务 半开报文，返回body。");
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put(str6, new JSONObject());
                        jSONObject4.put(str7, jSONObject2.getJSONObject(str7));
                        return jSONObject4;
                    } catch (JSONException unused2) {
                        return jSONObject2;
                    }
                } else {
                    UMRTLog.m22228e(str5, "--->>> [有状态]统计业务 闭合报文，返回body。");
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put(str6, new JSONObject());
                    jSONObject5.put(str7, jSONObject2.getJSONObject(str7));
                    return jSONObject5;
                }
            }
        }
        return new JSONObject();
    }

    public static JSONObject buildEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        String str = jSONObject.has("st") ? UMCommonContent.f16582aF : jSONObject2.has(UMCommonContent.f16621as) ? UMCommonContent.f16577aA : UMCommonContent.f16622at;
        return buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2, UMServerURL.PATH_ANALYTICS, str, "9.3.8");
    }

    public static JSONObject buildZeroEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        JSONObject jSONObject3;
        if (UMUtils.isMainProgress(context)) {
            return new EnvelopeManager().mo19294a(context.getApplicationContext(), jSONObject, jSONObject2, str);
        }
        JSONObject jSONObject4 = null;
        try {
            jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("exception", 120);
            } catch (JSONException unused) {
                jSONObject4 = jSONObject3;
            }
        } catch (JSONException unused2) {
            jSONObject3 = jSONObject4;
            return jSONObject3;
        }
        return jSONObject3;
    }

    public static long getLastInstantBuildTime(Context context) {
        if (context == null) {
            return 0;
        }
        return UMFrUtils.getLastInstantBuildTime(context.getApplicationContext());
    }

    public static long getLastSuccessfulBuildTime(Context context) {
        if (context == null) {
            return 0;
        }
        return UMFrUtils.getLastSuccessfulBuildTime(context.getApplicationContext());
    }

    public static synchronized boolean getTransmissionSendFlag() {
        boolean z;
        synchronized (UMEnvelopeBuild.class) {
            z = transmissionSendFlag;
        }
        return z;
    }

    public static String imprintProperty(Context context, String str, String str2) {
        return context == null ? str2 : ImprintHandler.getImprintService(context.getApplicationContext()).mo19348c().mo19353a(str, str2);
    }

    public static boolean isOnline(Context context) {
        boolean z = !UMConfigure.needSendZcfgEnv(context);
        if (!UMFrUtils.isOnline(context) || !z) {
            return false;
        }
        return true;
    }

    public static boolean isReadyBuild(Context context, UMBusinessType uMBusinessType) {
        return isRet(context, uMBusinessType, false);
    }

    public static boolean isReadyBuildNew(Context context, UMBusinessType uMBusinessType) {
        if (!getTransmissionSendFlag()) {
            return false;
        }
        return isRet(context, uMBusinessType, false);
    }

    public static boolean isReadyBuildStateless() {
        return getTransmissionSendFlag();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (com.umeng.commonsdk.UMConfigure.needSendZcfgEnv(r5) == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r0, r6) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isRet(android.content.Context r5, com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType r6, boolean r7) {
        /*
            if (r5 == 0) goto L_0x0043
            android.content.Context r0 = r5.getApplicationContext()
            boolean r1 = com.umeng.commonsdk.framework.UMFrUtils.isOnline(r0)
            int r2 = com.umeng.commonsdk.framework.UMFrUtils.envelopeFileNumber(r0)
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x003c
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r7 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_INTERNAL
            if (r6 != r7) goto L_0x001f
            boolean r5 = com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r0, r6)
            if (r5 == 0) goto L_0x001d
            goto L_0x002d
        L_0x001d:
            r7 = 1
            goto L_0x003c
        L_0x001f:
            boolean r7 = com.umeng.commonsdk.framework.UMNetWorkSender.m22244a()
            if (r7 == 0) goto L_0x002f
            int r5 = com.umeng.commonsdk.framework.UMNetWorkSender.m22246b()
            long r5 = (long) r5
            com.umeng.commonsdk.framework.UMWorkDispatch.sendDelayProcessMsg(r5)
        L_0x002d:
            r7 = 0
            goto L_0x003c
        L_0x002f:
            boolean r6 = com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r0, r6)
            if (r6 != 0) goto L_0x002d
            boolean r5 = com.umeng.commonsdk.UMConfigure.needSendZcfgEnv(r5)
            if (r5 == 0) goto L_0x001d
            goto L_0x002d
        L_0x003c:
            if (r1 == 0) goto L_0x0043
            if (r2 <= 0) goto L_0x0043
            com.umeng.commonsdk.framework.UMNetWorkSender.m22250d()
        L_0x0043:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.UMEnvelopeBuild.isRet(android.content.Context, com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType, boolean):boolean");
    }

    public static long maxDataSpace(Context context) {
        if (context == null) {
            return 0;
        }
        return EnvelopeManager.m22423a(context.getApplicationContext());
    }

    public static synchronized void setTransmissionSendFlag(boolean z) {
        synchronized (UMEnvelopeBuild.class) {
            transmissionSendFlag = z;
        }
    }

    public static JSONObject buildEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        String str4 = UMRTLog.RTLOG_TAG;
        UMRTLog.m22228e(str4, "--->>> [有状态]业务发起构建普通有状态信封请求。");
        String str5 = "exception";
        JSONObject jSONObject5 = null;
        if (TextUtils.isEmpty(str)) {
            try {
                jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put(str5, 121);
                } catch (JSONException unused) {
                    jSONObject5 = jSONObject4;
                }
            } catch (JSONException unused2) {
                jSONObject4 = jSONObject5;
                return jSONObject4;
            }
            return jSONObject4;
        } else if (!UMUtils.isMainProgress(context)) {
            try {
                jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put(str5, 120);
                } catch (JSONException unused3) {
                    jSONObject5 = jSONObject3;
                }
            } catch (JSONException unused4) {
                jSONObject3 = jSONObject5;
                return jSONObject3;
            }
            return jSONObject3;
        } else if (UMConfigure.needSendZcfgEnv(context)) {
            UMRTLog.m22228e(str4, "--->>> [有状态]零号报文应答数据 未获取到，写入二级缓存");
            return add2CacheTable(context, jSONObject, jSONObject2, str, str2, str3);
        } else {
            UMRTLog.m22228e(str4, "--->>> [有状态]零号报文应答数据 已获取到，判断二级缓存是否为空");
            if (CacheDBHelper.m21592a(context).mo18947c()) {
                UMRTLog.m22228e(str4, "--->>> [有状态]二级缓存为空，直接打信封");
                return new EnvelopeManager().mo19295a(context.getApplicationContext(), jSONObject, jSONObject2, str, str2, str3);
            }
            UMRTLog.m22228e(str4, "--->>> [有状态]二级缓存不为空，写入二级缓存");
            JSONObject add2CacheTable = add2CacheTable(context, jSONObject, jSONObject2, str, str2, str3);
            if (!UMWorkDispatch.eventHasExist(UMInternalConfig.f17512t)) {
                UMWorkDispatch.sendEvent(context, UMInternalConfig.f17512t, UMInternalData.m22265a(context).mo19254a(), null);
            }
            return add2CacheTable;
        }
    }
}
