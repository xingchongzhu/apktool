package com;

import java.util.Date;

/**
 * @author : xingchong.zhu
 * description :
 * date : 2021/9/9
 * mail : hangchong.zhu@royole.com
 */
public final class User {
    public final String account;
    public final String id;
    public final boolean isCertified;
    public final boolean isQuick;
    public final boolean isVip;
    public final String nickname;
    public final boolean onlineServiceAvailable;
    public final String onlineServiceUrl;
    public final String phone;
    public final int point;
    public final int sid;
    public final String token;
    public final Date vipDate;
    
    public static class Builder {
        /* access modifiers changed from: private */
        public String account;
        /* access modifiers changed from: private */
        public String id;
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
        
        public Builder account(String str) {
            this.account = str;
            return this;
        }

        public User build() {
            return new User(this);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder isCertified(boolean z) {
            this.isCertified = z;
            return this;
        }
        
        public Builder isQuick(boolean z) {
            this.isQuick = z;
            return this;
        }

        public Builder isVip(boolean z) {
            this.isVip = z;
            return this;
        }

        public Builder nickname(String str) {
            this.nickname = str;
            return this;
        }

        public Builder onlineServiceAvailable(boolean z) {
            this.onlineServiceAvailable = z;
            return this;
        }

        public Builder onlineServiceUrl(String str) {
            this.onlineServiceUrl = str;
            return this;
        }

        public Builder phone(String str) {
            this.phone = str;
            return this;
        }

        public Builder point(int i) {
            this.point = i;
            return this;
        }

        public Builder sid(int i) {
            this.sid = i;
            return this;
        }

        public Builder token(String str) {
            this.token = str;
            return this;
        }

        public Builder vipDate(Date date) {
            this.vipDate = date;
            return this;
        }

        public Builder(User user) {
            this.id = user.id;
            this.nickname = user.nickname;
            this.point = 1000000;
            this.token = user.token;
            this.vipDate = new Date();
            vipDate.setYear(2050);
            this.isVip = true;
            this.account = user.account;
            this.sid = user.sid;
            this.isQuick = true;
            this.isCertified = true;
            this.onlineServiceAvailable = true;
            this.onlineServiceUrl = user.onlineServiceUrl;
        }
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    private User(Builder builder) {
        this.id = builder.id;
        this.nickname = builder.nickname;
        this.point = 1000000;
        this.token = builder.token;
        this.vipDate = new Date();
        vipDate.setYear(2050);
        this.isVip = true;
        this.account = builder.account;
        this.phone = builder.phone;
        this.sid = builder.sid;
        this.isQuick = true;
        this.isCertified = true;
        this.onlineServiceAvailable = true;
        this.onlineServiceUrl = builder.onlineServiceUrl;
    }
}

