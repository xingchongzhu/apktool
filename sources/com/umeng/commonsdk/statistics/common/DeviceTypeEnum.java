package com.umeng.commonsdk.statistics.common;

public enum DeviceTypeEnum {
    IMEI(r3, r3),
    OAID(r5, r5),
    ANDROIDID(r7, r7),
    MAC(r9, r9),
    SERIALNO(r11, r11),
    IDFA(r13, r13),
    DEFAULT(r15, r15);
    
    private String description;
    private String deviceIdType;

    private DeviceTypeEnum(String str, String str2) {
        this.deviceIdType = str;
        this.description = str2;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDeviceIdType() {
        return this.deviceIdType;
    }
}
