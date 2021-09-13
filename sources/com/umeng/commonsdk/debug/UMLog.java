package com.umeng.commonsdk.debug;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.commonsdk.UMConfigure;
import org.json.JSONArray;
import org.json.JSONObject;

public class UMLog {

    /* renamed from: AQ */
    private static final String f17463AQ = "├───────────────────解决方案─────────────────────────────────────────────────────────────────────────────";
    private static final String BOTTOM_BORDER = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final char BOTTOM_LEFT_CORNER = '└';
    private static final String DOUBLE_DIVIDER = "────────────────────────────────────────────────────────";
    private static final String DOUBLE_DIVIDER_AQ = "───────────────────问题─────────────────────";
    private static final char HORIZONTAL_LINE = '│';
    private static final String INDENT = "     ";
    private static final int JSON_INDENT = 2;
    private static final int KEYLENGTH = 10;
    private static final String MIDDLE_BORDER = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final char MIDDLE_CORNER = '├';
    private static final String SINGLE_DIVIDER = "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final String SINGLE_DIVIDER_AQ = "───────────────────解决方案─────────────────────";
    private static final String TAG = "UMLog";
    private static final String TOP_BORDER = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final String TOP_BORDER_AQ = "┌───────────────────问题─────────────────────────────────────────────────────────────────────────────";
    private static final char TOP_LEFT_CORNER = '┌';

    /* renamed from: aq */
    public static void m22221aq(int i, String str, String str2) {
        String str3 = "│     ";
        String str4 = TAG;
        try {
            if (UMConfigure.isDebugLog()) {
                UInterface logger = getLogger(i);
                logger.log(str4, TOP_BORDER_AQ);
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(str);
                logger.log(str4, sb.toString());
                logger.log(str4, f17463AQ);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(str2);
                logger.log(str4, sb2.toString());
                logger.log(str4, BOTTOM_BORDER);
            }
        } catch (Exception unused) {
        }
    }

    public static void bundle(int i, Bundle bundle) {
        bundle(null, i, bundle);
    }

    public static UInterface getLogger(int i) {
        if (i == 0) {
            return new C3187E();
        }
        if (i == 1) {
            return new C3189W();
        }
        if (i == 2) {
            return new C3188I();
        }
        if (i != 3) {
            return new C3186D();
        }
        return new C3186D();
    }

    public static void jsonArry(JSONArray jSONArray) {
        try {
            if (UMConfigure.isDebugLog()) {
                Log.e(TAG, jSONArray.toString(2));
            }
        } catch (Exception unused) {
        }
    }

    public static void jsonObject(JSONObject jSONObject) {
        try {
            if (UMConfigure.isDebugLog()) {
                Log.e(TAG, jSONObject.toString(2));
            }
        } catch (Exception unused) {
        }
    }

    public static void mutlInfo(int i, String... strArr) {
        try {
            if (UMConfigure.isDebugLog()) {
                int length = strArr.length;
                UInterface logger = getLogger(i);
                String str = TAG;
                if (length == 1) {
                    logger.log(str, strArr[0]);
                } else if (length >= 2) {
                    logger.log(str, TOP_BORDER);
                    for (int i2 = 0; i2 < length; i2++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("│     ");
                        sb.append(strArr[i2]);
                        logger.log(str, sb.toString());
                        if (i2 != length - 1) {
                            logger.log(str, MIDDLE_BORDER);
                        }
                    }
                    logger.log(str, BOTTOM_BORDER);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void bundle(String str, int i, Bundle bundle) {
        String str2;
        String str3 = MIDDLE_BORDER;
        try {
            if (UMConfigure.isDebugLog()) {
                if (TextUtils.isEmpty(str)) {
                    str2 = TAG;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("UMLog_");
                    sb.append(str);
                    str2 = sb.toString();
                }
                if (bundle != null) {
                    UInterface logger = getLogger(i);
                    logger.log(str2, TOP_BORDER);
                    logger.log(str2, "│key│value");
                    logger.log(str2, str3);
                    for (String str4 : bundle.keySet()) {
                        if (!TextUtils.isEmpty(str4) && bundle.get(str4) != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(HORIZONTAL_LINE);
                            sb2.append(str4);
                            sb2.append(HORIZONTAL_LINE);
                            sb2.append(bundle.get(str4).toString());
                            logger.log(str2, sb2.toString());
                            logger.log(str2, str3);
                        }
                    }
                    logger.log(str2, BOTTOM_BORDER);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void jsonArry(String str, JSONArray jSONArray) {
        try {
            if (UMConfigure.isDebugLog()) {
                StringBuilder sb = new StringBuilder();
                sb.append("UMLog_");
                sb.append(str);
                Log.e(sb.toString(), jSONArray.toString(2));
            }
        } catch (Exception unused) {
        }
    }

    public static void jsonObject(String str, JSONObject jSONObject) {
        try {
            if (UMConfigure.isDebugLog()) {
                StringBuilder sb = new StringBuilder();
                sb.append("UMLog_");
                sb.append(str);
                Log.e(sb.toString(), jSONObject.toString(2));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: aq */
    public static void m22223aq(String str, int i, String str2, String str3) {
        String str4 = "│     ";
        try {
            if (UMConfigure.isDebugLog()) {
                UInterface logger = getLogger(i);
                StringBuilder sb = new StringBuilder();
                sb.append("UMLog_");
                sb.append(str);
                String sb2 = sb.toString();
                logger.log(sb2, TOP_BORDER_AQ);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str4);
                sb3.append(str2);
                logger.log(sb2, sb3.toString());
                logger.log(sb2, f17463AQ);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str4);
                sb4.append(str3);
                logger.log(sb2, sb4.toString());
                logger.log(sb2, BOTTOM_BORDER);
            }
        } catch (Exception unused) {
        }
    }

    public static void mutlInfo(String str, int i, String... strArr) {
        try {
            if (UMConfigure.isDebugLog()) {
                int length = strArr.length;
                UInterface logger = getLogger(i);
                StringBuilder sb = new StringBuilder();
                sb.append("UMLog_");
                sb.append(str);
                String sb2 = sb.toString();
                if (length == 1) {
                    logger.log(sb2, strArr[0]);
                } else if (length >= 2) {
                    logger.log(sb2, TOP_BORDER);
                    for (int i2 = 0; i2 < length; i2++) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("│     ");
                        sb3.append(strArr[i2]);
                        logger.log(sb2, sb3.toString());
                        if (i2 != length - 1) {
                            logger.log(sb2, MIDDLE_BORDER);
                        }
                    }
                    logger.log(sb2, BOTTOM_BORDER);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: aq */
    public static void m22222aq(String str, int i, String str2) {
        m22225aq((String) null, str, i, str2);
    }

    /* renamed from: aq */
    public static void m22224aq(String str, int i, String str2, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        m22226aq(null, str, i, str2, strArr, strArr2, strArr3, strArr4);
    }

    /* renamed from: aq */
    public static void m22225aq(String str, String str2, int i, String str3) {
        m22226aq(str, str2, i, str3, null, null, null, null);
    }

    public static void mutlInfo(String str, int i, String str2) {
        mutlInfo(null, str, i, str2);
    }

    /* renamed from: aq */
    public static void m22226aq(String str, String str2, int i, String str3, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        String str4;
        String str5 = "│     ";
        try {
            if (UMConfigure.isDebugLog()) {
                if (TextUtils.isEmpty(str)) {
                    str4 = TAG;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("UMLog_");
                    sb.append(str);
                    str4 = sb.toString();
                }
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    String[] split = str2.split(str3);
                    if (split != null && split.length >= 2) {
                        if (strArr != null && strArr.length > 0 && strArr2 != null && strArr2.length > 0) {
                            int i2 = 0;
                            while (i2 < strArr.length && i2 < strArr2.length) {
                                split[0] = split[0].replace(strArr[i2], strArr2[i2]);
                                i2++;
                            }
                        }
                        if (strArr3 != null && strArr3.length > 0 && strArr4 != null && strArr4.length > 0) {
                            int i3 = 0;
                            while (i3 < strArr3.length && i3 < strArr4.length) {
                                split[1] = split[1].replace(strArr3[i3], strArr4[i3]);
                                i3++;
                            }
                        }
                        UInterface logger = getLogger(i);
                        logger.log(str4, TOP_BORDER_AQ);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str5);
                        sb2.append(split[0]);
                        logger.log(str4, sb2.toString());
                        logger.log(str4, f17463AQ);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str5);
                        sb3.append(split[1]);
                        logger.log(str4, sb3.toString());
                        logger.log(str4, BOTTOM_BORDER);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void mutlInfo(String str, int i, String str2, String[] strArr, String[] strArr2) {
        mutlInfo(null, str, i, str2, strArr, strArr2);
    }

    public static void mutlInfo(String str, String str2, int i, String str3) {
        mutlInfo(str, str2, i, str3, null, null);
    }

    public static void mutlInfo(String str, String str2, int i, String str3, String[] strArr, String[] strArr2) {
        String str4;
        try {
            if (UMConfigure.isDebugLog()) {
                if (TextUtils.isEmpty(str)) {
                    str4 = TAG;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("UMLog_");
                    sb.append(str);
                    str4 = sb.toString();
                }
                if (!TextUtils.isEmpty(str2)) {
                    if (strArr != null && strArr.length > 0 && strArr2 != null && strArr2.length > 0) {
                        int i2 = 0;
                        while (i2 < strArr.length && i2 < strArr2.length) {
                            str2 = str2.replace(strArr[i2], strArr2[i2]);
                            i2++;
                        }
                    }
                    UInterface logger = getLogger(i);
                    if (TextUtils.isEmpty(str3)) {
                        logger.log(str4, str2);
                    } else {
                        String[] split = str2.split(str3);
                        if (split != null) {
                            logger.log(str4, TOP_BORDER);
                            for (int i3 = 0; i3 < split.length; i3++) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("│     ");
                                sb2.append(split[i3]);
                                logger.log(str4, sb2.toString());
                                if (i3 != split.length - 1) {
                                    logger.log(str4, MIDDLE_BORDER);
                                }
                            }
                            logger.log(str4, BOTTOM_BORDER);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
