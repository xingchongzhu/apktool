package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.util.StdConverter;
import com.tv91.utils.FragmentUtils;
import com.umeng.commonsdk.statistics.SdkVersion;
import java.util.Date;

@JsonDeserialize(builder = Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class User {
    @JsonProperty("Account")
    public final String account;
    @JsonProperty("MemberID")

    /* renamed from: id */
    public final String f14097id;
    @JsonProperty("IsValidMobile")
    @JsonSerialize(converter = BooleanConverter.class)
    public final boolean isCertified;
    @JsonProperty("IsQuick")
    @JsonSerialize(converter = BooleanConverter.class)
    public final boolean isQuick;
    @JsonProperty("IsVIP")
    @JsonSerialize(converter = BooleanConverter.class)
    public final boolean isVip;
    @JsonProperty("NickName")
    public final String nickname;
    @JsonProperty("OnlineService")
    public final boolean onlineServiceAvailable;
    @JsonProperty("OnlineUrl")
    public final String onlineServiceUrl;
    @JsonProperty("Tel")
    public final String phone;
    @JsonProperty("Point")
    public final int point;
    @JsonProperty("SID")
    public final int sid;
    @JsonProperty("Token")
    public final String token;
    @JsonProperty("EndTime")
    public final Date vipDate;

    private static final class BooleanConverter extends StdConverter<Boolean, String> {
        private BooleanConverter() {
        }

        /* renamed from: a */
        public String convert(Boolean bool) {
            return bool.booleanValue() ? SdkVersion.MINI_VERSION : "0";
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {
        /* access modifiers changed from: private */
        public String account;
        /* access modifiers changed from: private */

        /* renamed from: id */
        public String f14098id;
        /* access modifiers changed from: private */
        public boolean isCertified;
        /* access modifiers changed from: private */
        public boolean isQuick;
        /* access modifiers changed from: private */
        public boolean isVip;
        /* access modifiers changed from: private */
        public String nickname;
        /* access modifiers changed from: private */
        public boolean onlineServiceAvailable;
        /* access modifiers changed from: private */
        public String onlineServiceUrl;
        /* access modifiers changed from: private */
        public String phone;
        /* access modifiers changed from: private */
        public int point;
        /* access modifiers changed from: private */
        public int sid;
        /* access modifiers changed from: private */
        public String token;
        /* access modifiers changed from: private */
        public Date vipDate;

        public Builder() {
        }

        @JsonProperty("Account")
        public Builder account(String str) {
            this.account = str;
            return this;
        }

        public User build() {
            return new User(this);
        }

        @JsonProperty("MemberID")
        /* renamed from: id */
        public Builder mo17022id(String str) {
            this.f14098id = str;
            return this;
        }

        @JsonProperty("IsValidMobile")
        @JsonDeserialize(converter = StringConverter.class)
        public Builder isCertified(boolean z) {
            this.isCertified = z;
            return this;
        }

        @JsonProperty("IsQuick")
        @JsonDeserialize(converter = StringConverter.class)
        public Builder isQuick(boolean z) {
            this.isQuick = z;
            return this;
        }

        @JsonProperty("IsVIP")
        @JsonDeserialize(converter = StringConverter.class)
        public Builder isVip(boolean z) {
            this.isVip = z;
            return this;
        }

        @JsonProperty("NickName")
        public Builder nickname(String str) {
            this.nickname = str;
            return this;
        }

        @JsonProperty("OnlineService")
        public Builder onlineServiceAvailable(boolean z) {
            this.onlineServiceAvailable = z;
            return this;
        }

        @JsonProperty("OnlineUrl")
        public Builder onlineServiceUrl(String str) {
            this.onlineServiceUrl = str;
            return this;
        }

        @JsonProperty("Tel")
        public Builder phone(String str) {
            this.phone = str;
            return this;
        }

        @JsonProperty("Point")
        public Builder point(int i) {
            this.point = i;
            return this;
        }

        @JsonProperty("SID")
        public Builder sid(int i) {
            this.sid = i;
            return this;
        }

        @JsonProperty("Token")
        public Builder token(String str) {
            this.token = str;
            return this;
        }

        @JsonProperty("EndTime")
        public Builder vipDate(Date date) {
            this.vipDate = date;
            return this;
        }

        public Builder(User user) {
            this.f14098id = user.f14097id;
            this.nickname = user.nickname;
            this.point = user.point;
            this.token = user.token;
            this.vipDate = user.vipDate;
            this.isVip = user.isVip;
            this.account = user.account;
            this.sid = user.sid;
            this.isQuick = user.isQuick;
            this.isCertified = user.isCertified;
            this.onlineServiceAvailable = user.onlineServiceAvailable;
            this.onlineServiceUrl = user.onlineServiceUrl;
        }
    }

    private static final class StringConverter extends StdConverter<String, Boolean> {
        private StringConverter() {
        }

        /* renamed from: a */
        public Boolean convert(String str) {
            return Boolean.valueOf(!FragmentUtils.m20586g(str) && !"0".equals(str));
        }
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User{id='");
        sb.append(this.f14097id);
        sb.append('\'');
        sb.append(", nickname='");
        sb.append(this.nickname);
        sb.append('\'');
        sb.append(", point=");
        sb.append(this.point);
        sb.append(", token='");
        sb.append(this.token);
        sb.append('\'');
        sb.append(", vipDate=");
        sb.append(this.vipDate);
        sb.append(", isVip=");
        sb.append(this.isVip);
        sb.append(", account='");
        sb.append(this.account);
        sb.append('\'');
        sb.append(", phone='");
        sb.append(this.phone);
        sb.append('\'');
        sb.append(", sid=");
        sb.append(this.sid);
        sb.append(", isQuick=");
        sb.append(this.isQuick);
        sb.append(", isCertified=");
        sb.append(this.isCertified);
        sb.append(", onlineServiceAvailable=");
        sb.append(this.onlineServiceAvailable);
        sb.append(", onlineServiceUrl='");
        sb.append(this.onlineServiceUrl);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    private User(Builder builder) {
        this.f14097id = builder.f14098id;
        this.nickname = builder.nickname;
        this.point = builder.point;
        this.token = builder.token;
        this.vipDate = builder.vipDate;
        this.isVip = builder.isVip;
        this.account = builder.account;
        this.phone = builder.phone;
        this.sid = builder.sid;
        this.isQuick = builder.isQuick;
        this.isCertified = builder.isCertified;
        this.onlineServiceAvailable = builder.onlineServiceAvailable;
        this.onlineServiceUrl = builder.onlineServiceUrl;
    }
}
