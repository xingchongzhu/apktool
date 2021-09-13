package com.efs.sdk.base.http;

import android.text.TextUtils;
import com.efs.sdk.base.p176a.p184f.C1700d;
import java.util.Map;

public class HttpResponse extends C1700d<Map<String, String>> {
    private static final String KEY_BIZ_CODE = "biz_code";
    private static final String KEY_REQUEST_URL = "req_url";
    public static final int REQUEST_ERROR_DEFAULT = -1;
    public static final int REQUEST_ERROR_NETWORK_DISCONNECT = -2;
    public static final int REQUEST_ERROR_SOCKET_TIMEOUT = -3;

    public String getBizCode() {
        Map map = (Map) this.extra;
        String str = KEY_BIZ_CODE;
        if (!map.containsKey(str)) {
            return "";
        }
        return (String) ((Map) this.extra).get(str);
    }

    public int getHttpCode() {
        return this.code;
    }

    public String getReqUrl() {
        Map map = (Map) this.extra;
        String str = KEY_REQUEST_URL;
        if (!map.containsKey(str)) {
            return "";
        }
        return (String) ((Map) this.extra).get(str);
    }

    public void setBizCode(String str) {
        ((Map) this.extra).put(KEY_BIZ_CODE, str);
    }

    public void setHttpCode(int i) {
        this.succ = (i >= 200 && i < 300) || i == 304;
        this.code = i;
    }

    public void setReqUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String str2 = "?";
        if (str.contains(str2)) {
            str = str.substring(0, str.indexOf(str2));
        }
        ((Map) this.extra).put(KEY_REQUEST_URL, str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpResponse {succ=");
        sb.append(this.succ);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", data='");
        sb.append(this.data);
        sb.append('\'');
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append('}');
        return sb.toString();
    }
}
