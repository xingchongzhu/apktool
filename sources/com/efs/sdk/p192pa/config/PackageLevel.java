package com.efs.sdk.p192pa.config;

/* renamed from: com.efs.sdk.pa.config.PackageLevel */
public enum PackageLevel {
    DAILY_DEVELOP(1),
    INTERNAL_TEST(2),
    TRIAL(3),
    RELEASE(4);
    
    private int mLevel;

    private PackageLevel(int i) {
        this.mLevel = i;
    }

    public final int getLevel() {
        return this.mLevel;
    }
}
