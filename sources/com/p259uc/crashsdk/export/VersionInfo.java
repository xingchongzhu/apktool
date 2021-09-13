package com.p259uc.crashsdk.export;

/* renamed from: com.uc.crashsdk.export.VersionInfo */
/* compiled from: ProGuard */
public class VersionInfo {
    public String mBuildId = null;
    public String mSubVersion = null;
    public String mVersion = null;

    public VersionInfo() {
    }

    public VersionInfo(VersionInfo versionInfo) {
        this.mVersion = versionInfo.mVersion;
        this.mSubVersion = versionInfo.mSubVersion;
        this.mBuildId = versionInfo.mBuildId;
    }
}
