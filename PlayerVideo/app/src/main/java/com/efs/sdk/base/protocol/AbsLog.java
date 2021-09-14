package com.efs.sdk.base.protocol;

import com.efs.sdk.base.Constants;

public abstract class AbsLog implements ILogProtocol {

    /* renamed from: cp */
    private String f11438cp = Constants.CP_NONE;

    /* renamed from: de */
    private byte f11439de = 1;
    private String logType;

    public AbsLog(String str) {
        this.logType = str;
    }

    public String getLogType() {
        return this.logType;
    }

    public boolean isCp() {
        return !this.f11438cp.equals(Constants.CP_NONE);
    }

    public boolean isDe() {
        return this.f11439de != 1;
    }

    public void setCp(String str) {
        this.f11438cp = str;
    }

    public void setDe(byte b) {
        this.f11439de = b;
    }
}
