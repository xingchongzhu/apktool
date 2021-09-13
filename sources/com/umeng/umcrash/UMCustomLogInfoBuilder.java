package com.umeng.umcrash;

import android.text.TextUtils;
import android.util.Log;
import com.p259uc.crashsdk.export.CustomLogInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UMCustomLogInfoBuilder {
    public static final String LINE_SEP = "\n";
    public static final String LOG_KEY_AC = "k_ac";
    public static final String LOG_KEY_CT = "k_ct";
    private static final String LOG_KEY_STACK_FUNC = "stackFunc";
    private static final String LOG_KEY_STACK_HASH = "stackHash";
    private static final String LOG_SECTION_SEP = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---";
    public static final String LOG_TYPE = "exception";
    private Map<String, String> kvInfoMap = new HashMap(20);
    private CustomLogInfo mCustomLogInfo;
    private List<String> sectionList = new ArrayList(5);
    private String stack;

    public UMCustomLogInfoBuilder(String str) {
        String str2 = "exception";
        this.mCustomLogInfo = new CustomLogInfo(new StringBuffer(), str2);
        this.kvInfoMap.put(LOG_KEY_CT, str2);
        this.kvInfoMap.put(LOG_KEY_AC, str);
    }

    public UMCustomLogInfoBuilder addLogCat(boolean z) {
        this.mCustomLogInfo.mAddLogcat = z;
        return this;
    }

    public UMCustomLogInfoBuilder addSection(String str) {
        this.sectionList.add(str);
        return this;
    }

    public CustomLogInfo build() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.kvInfoMap.entrySet().iterator();
        while (true) {
            str = "\n";
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            stringBuffer.append((String) entry.getKey());
            stringBuffer.append(":");
            stringBuffer.append((String) entry.getValue());
            stringBuffer.append(str);
        }
        if (!TextUtils.isEmpty(this.stack)) {
            stringBuffer.append(this.stack);
            stringBuffer.append(str);
        }
        for (String str2 : this.sectionList) {
            stringBuffer.append(LOG_SECTION_SEP);
            stringBuffer.append(str);
            stringBuffer.append(str2);
            stringBuffer.append(str);
        }
        CustomLogInfo customLogInfo = this.mCustomLogInfo;
        customLogInfo.mData = stringBuffer;
        return customLogInfo;
    }

    public UMCustomLogInfoBuilder put(String str, String str2) {
        if (LOG_KEY_AC.equals(str) || LOG_KEY_CT.equals(str)) {
            Log.w("crashsdk", "key can not be 'k_ac' and 'k_ct'");
            return this;
        }
        this.kvInfoMap.put(str, str2);
        return this;
    }

    public UMCustomLogInfoBuilder stack(Throwable th) {
        return stack(Log.getStackTraceString(th));
    }

    public UMCustomLogInfoBuilder stackFunc(String str) {
        this.kvInfoMap.put(LOG_KEY_STACK_FUNC, str);
        return this;
    }

    public UMCustomLogInfoBuilder stackHash(String str) {
        this.kvInfoMap.put(LOG_KEY_STACK_HASH, str);
        return this;
    }

    public UMCustomLogInfoBuilder uploadNow(boolean z) {
        this.mCustomLogInfo.mUploadNow = z;
        return this;
    }

    public UMCustomLogInfoBuilder stack(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Exception message:\nBack traces starts.\n");
        sb.append(str);
        sb.append("Back traces ends.");
        this.stack = sb.toString();
        return this;
    }
}
