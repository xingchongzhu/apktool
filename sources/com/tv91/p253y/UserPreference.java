package com.tv91.p253y;

import android.content.SharedPreferences;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tv91.model.User;
import com.tv91.model.User.Builder;
import com.tv91.utils.C3052g;
import com.tv91.utils.Jsons;
import java.io.IOException;
import java.util.Date;
import p295h.p296a.Timber;

/* renamed from: com.tv91.y.f */
public final class UserPreference implements C3060h {

    /* renamed from: a */
    private final SharedPreferences f16090a;

    /* renamed from: b */
    private User f16091b;

    /* renamed from: com.tv91.y.f$a */
    /* compiled from: UserPreference */
    private static final class C3059a {

        /* renamed from: a */
        public String f16092a;

        /* renamed from: b */
        public String f16093b;

        /* renamed from: c */
        public int f16094c;

        /* renamed from: d */
        public String f16095d;

        /* renamed from: e */
        public Date f16096e;

        /* renamed from: f */
        public boolean f16097f;

        /* renamed from: g */
        public String f16098g;

        /* renamed from: h */
        public int f16099h;

        /* renamed from: i */
        public boolean f16100i;

        /* renamed from: j */
        public boolean f16101j;

        /* renamed from: k */
        public boolean f16102k;

        /* renamed from: l */
        public String f16103l;

        /* renamed from: a */
        public User mo18621a() {
            return new Builder().mo17022id(this.f16092a).nickname(this.f16093b).point(this.f16094c).token(this.f16095d).vipDate(this.f16096e).isVip(this.f16097f).account(this.f16098g).sid(this.f16099h).isQuick(this.f16100i).isCertified(this.f16101j).onlineServiceAvailable(this.f16102k).onlineServiceUrl(this.f16103l).build();
        }
    }

    public UserPreference(SharedPreferences sharedPreferences) {
        this.f16090a = sharedPreferences;
    }

    /* renamed from: a */
    public String mo18611a() {
        return this.f16090a.getString("pref_account", "");
    }

    /* renamed from: b */
    public /* synthetic */ void mo18612b() {
        UserRepository.m20695a(this);
    }

    /* renamed from: c */
    public String mo18613c() {
        return this.f16090a.getString("pref_password", "");
    }

    /* renamed from: d */
    public /* synthetic */ String mo18614d() {
        return UserRepository.m20697c(this);
    }

    /* renamed from: e */
    public User mo18615e() {
        User user = this.f16091b;
        if (user != null) {
            return user;
        }
        String string = this.f16090a.getString("pref_user", "");
        try {
            User user2 = (User) Jsons.m20551b(string, User.class);
            if (user2 != null) {
                if (C3052g.m20586g(user2.f14097id) || C3052g.m20586g(user2.token)) {
                    throw new IOException();
                }
            }
            this.f16091b = user2;
            return user2;
        } catch (IOException unused) {
            try {
                User a = ((C3059a) Jsons.m20551b(string, C3059a.class)).mo18621a();
                mo18618h(a);
                return a;
            } catch (IOException e) {
                Timber.m24041c(e);
                this.f16091b = null;
                return null;
            }
        }
    }

    /* renamed from: f */
    public void mo18616f(String str) {
        String str2 = "pref_account";
        if (C3052g.m20586g(str)) {
            this.f16090a.edit().remove(str2).apply();
        } else {
            this.f16090a.edit().putString(str2, str).apply();
        }
    }

    /* renamed from: g */
    public /* synthetic */ String mo18617g() {
        return UserRepository.m20698d(this);
    }

    /* renamed from: h */
    public void mo18618h(User user) {
        this.f16091b = user;
        String str = "pref_user";
        if (user == null) {
            this.f16090a.edit().remove(str).apply();
            return;
        }
        try {
            this.f16090a.edit().putString(str, Jsons.m20554e(user)).apply();
        } catch (JsonProcessingException unused) {
            this.f16091b = null;
            this.f16090a.edit().remove(str).apply();
        }
    }

    /* renamed from: i */
    public /* synthetic */ void mo18619i() {
        UserRepository.m20696b(this);
    }

    /* renamed from: j */
    public void mo18620j(String str) {
        String str2 = "pref_password";
        if (C3052g.m20586g(str)) {
            this.f16090a.edit().remove(str2).apply();
        } else {
            this.f16090a.edit().putString(str2, str).apply();
        }
    }
}
