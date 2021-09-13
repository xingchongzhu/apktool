package com.umeng.commonsdk.config;

import com.umeng.commonsdk.debug.UMRTLog;

/* renamed from: com.umeng.commonsdk.config.g */
public class SensitiveFieldHandler implements IConfigHandler {
    /* renamed from: a */
    public void mo19244a(String str, Object obj, String[] strArr) {
        String str2 = "Config";
        if (str != null && str.length() > 0) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong == -1) {
                    UMRTLog.m22228e(str2, "--->>> SensitiveFieldHandler: handleConfigItem: invalid config value.");
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("--->>> CollectFieldJudgment: handleConfigItem: item : ");
                sb.append(str);
                UMRTLog.m22229i(str2, sb.toString());
                if (obj != null && (obj instanceof CollectController)) {
                    int i = 0;
                    while (i < strArr.length) {
                        try {
                            String str3 = strArr[i];
                            if (FieldTable.m22216a(str3)) {
                                ((CollectController) obj).mo19243a(str3, Boolean.valueOf(BitUtils.m22205a(parseLong, i)));
                            }
                            i++;
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
                UMRTLog.m22228e(str2, "--->>> SensitiveFieldHandler: handleConfigItem: parseLong exception.");
            }
        }
    }
}
