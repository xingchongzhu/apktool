package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.common.a */
public class EncryptHelper {

    /* renamed from: a */
    private static String f17310a = null;

    /* renamed from: b */
    private static final String f17311b = "umeng+";

    /* renamed from: c */
    private static final String f17312c = "ek__id";

    /* renamed from: d */
    private static final String f17313d = "ek_key";

    /* renamed from: e */
    private static String f17314e = "";

    /* renamed from: f */
    private static final String f17315f = "umeng_subprocess_info";

    /* renamed from: g */
    private static String f17316g = "";

    /* renamed from: h */
    private static EncryptHelper f17317h;

    private EncryptHelper() {
    }

    /* renamed from: a */
    public static EncryptHelper m22170a() {
        if (f17317h == null) {
            synchronized (EncryptHelper.class) {
                if (f17317h == null) {
                    f17317h = new EncryptHelper();
                }
            }
        }
        return f17317h;
    }

    /* renamed from: c */
    private String m22171c(String str) {
        try {
            String substring = str.substring(1, 9);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < substring.length(); i++) {
                char charAt = substring.charAt(i);
                if (!Character.isDigit(charAt)) {
                    sb.append(charAt);
                } else if (Integer.parseInt(Character.toString(charAt)) == 0) {
                    sb.append(0);
                } else {
                    sb.append(10 - Integer.parseInt(Character.toString(charAt)));
                }
            }
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(new StringBuilder(sb2).reverse().toString());
            return sb3.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public String mo19224b(String str) {
        String str2;
        String str3 = null;
        try {
            if (!TextUtils.isEmpty(f17310a)) {
                str = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f17310a.getBytes()));
            }
            return str;
        } catch (Exception unused) {
            String str4 = UMRTLog.RTLOG_TAG;
            UMRTLog.m22228e(str4, "--->>> 子进程事件数据解密失败!");
            if (TextUtils.isEmpty(f17314e)) {
                return null;
            }
            UMRTLog.m22228e(str4, "--->>> 子进程事件数据解密失败，换老秘钥重试");
            try {
                String str5 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f17314e.getBytes()));
                try {
                    UMRTLog.m22228e(str4, "--->>> 子进程事件数据解密失败，换老秘钥重试成功。");
                    return str5;
                } catch (Exception unused2) {
                    str3 = str5;
                    UMRTLog.m22228e(str4, "--->>> 子进程事件数据解密失败，换老秘钥重试失败。换子进程备份key重试。");
                    try {
                        str2 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f17316g.getBytes()));
                        try {
                            UMRTLog.m22228e(str4, "--->>> 子进程事件数据解密失败，子进程备份key重试成功。");
                            return str2;
                        } catch (Throwable unused3) {
                            str3 = str2;
                            UMRTLog.m22228e(str4, "--->>> 子进程事件数据解密失败，子进程备份key重试失败。");
                            return str3;
                        }
                    } catch (Throwable unused4) {
                        UMRTLog.m22228e(str4, "--->>> 子进程事件数据解密失败，子进程备份key重试失败。");
                        return str3;
                    }
                }
            } catch (Exception unused5) {
                UMRTLog.m22228e(str4, "--->>> 子进程事件数据解密失败，换老秘钥重试失败。换子进程备份key重试。");
                str2 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f17316g.getBytes()));
                UMRTLog.m22228e(str4, "--->>> 子进程事件数据解密失败，子进程备份key重试成功。");
                return str2;
            }
        }
    }

    /* renamed from: a */
    public void mo19223a(Context context) {
        String str = f17312c;
        try {
            if (TextUtils.isEmpty(f17310a)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(context, str);
                boolean isEmpty = TextUtils.isEmpty(multiProcessSP);
                String str2 = UMRTLog.RTLOG_TAG;
                if (!isEmpty) {
                    f17314e = m22171c(multiProcessSP);
                    StringBuilder sb = new StringBuilder();
                    sb.append("--->>>> primaryKey: ");
                    sb.append(f17314e);
                    UMRTLog.m22228e(str2, sb.toString());
                }
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f17315f, 0);
                if (sharedPreferences != null) {
                    f17316g = sharedPreferences.getString(str, null);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("--->>> 子进程备份秘钥：主进程key: ");
                    sb2.append(f17316g);
                    UMRTLog.m22228e(str2, sb2.toString());
                }
                f17310a = m22171c(UMUtils.genId());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("--->>>> 正式秘钥：key: ");
                sb3.append(f17310a);
                UMRTLog.m22228e(str2, sb3.toString());
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public String mo19222a(String str) {
        try {
            return TextUtils.isEmpty(f17310a) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), f17310a.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
