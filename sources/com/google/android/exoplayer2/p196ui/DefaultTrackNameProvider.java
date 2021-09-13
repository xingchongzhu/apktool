package com.google.android.exoplayer2.p196ui;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.ui.h */
public class DefaultTrackNameProvider implements TrackNameProvider {

    /* renamed from: a */
    private final Resources f12017a;

    public DefaultTrackNameProvider(Resources resources) {
        this.f12017a = (Resources) Assertions.m10153e(resources);
    }

    /* renamed from: b */
    private String m14821b(Format u0Var) {
        int i = u0Var.f8827y;
        if (i == -1 || i < 1) {
            return "";
        }
        if (i == 1) {
            return this.f12017a.getString(C1878p.exo_track_mono);
        }
        if (i == 2) {
            return this.f12017a.getString(C1878p.exo_track_stereo);
        }
        if (i == 6 || i == 7) {
            return this.f12017a.getString(C1878p.exo_track_surround_5_point_1);
        }
        if (i != 8) {
            return this.f12017a.getString(C1878p.exo_track_surround);
        }
        return this.f12017a.getString(C1878p.exo_track_surround_7_point_1);
    }

    /* renamed from: c */
    private String m14822c(Format u0Var) {
        int i = u0Var.f8810h;
        if (i == -1) {
            return "";
        }
        return this.f12017a.getString(C1878p.exo_track_bitrate, new Object[]{Float.valueOf(((float) i) / 1000000.0f)});
    }

    /* renamed from: d */
    private String m14823d(Format u0Var) {
        return TextUtils.isEmpty(u0Var.f8804b) ? "" : u0Var.f8804b;
    }

    /* renamed from: e */
    private String m14824e(Format u0Var) {
        String j = m14829j(m14825f(u0Var), m14827h(u0Var));
        return TextUtils.isEmpty(j) ? m14823d(u0Var) : j;
    }

    /* renamed from: f */
    private String m14825f(Format u0Var) {
        String str = u0Var.f8805c;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        return (Util.f8398a >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayName();
    }

    /* renamed from: g */
    private String m14826g(Format u0Var) {
        int i = u0Var.f8819q;
        int i2 = u0Var.f8820r;
        if (i == -1 || i2 == -1) {
            return "";
        }
        return this.f12017a.getString(C1878p.exo_track_resolution, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
    }

    /* renamed from: h */
    private String m14827h(Format u0Var) {
        String string = (u0Var.f8807e & 2) != 0 ? this.f12017a.getString(C1878p.exo_track_role_alternate) : "";
        if ((u0Var.f8807e & 4) != 0) {
            string = m14829j(string, this.f12017a.getString(C1878p.exo_track_role_supplementary));
        }
        if ((u0Var.f8807e & 8) != 0) {
            string = m14829j(string, this.f12017a.getString(C1878p.exo_track_role_commentary));
        }
        if ((u0Var.f8807e & 1088) == 0) {
            return string;
        }
        return m14829j(string, this.f12017a.getString(C1878p.exo_track_role_closed_captions));
    }

    /* renamed from: i */
    private static int m14828i(Format u0Var) {
        int k = MimeTypes.m10405k(u0Var.f8814l);
        if (k != -1) {
            return k;
        }
        if (MimeTypes.m10408n(u0Var.f8811i) != null) {
            return 2;
        }
        if (MimeTypes.m10397c(u0Var.f8811i) != null) {
            return 1;
        }
        if (u0Var.f8819q != -1 || u0Var.f8820r != -1) {
            return 2;
        }
        if (u0Var.f8827y == -1 && u0Var.f8828z == -1) {
            return -1;
        }
        return 1;
    }

    /* renamed from: j */
    private String m14829j(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.f12017a.getString(C1878p.exo_item_list, new Object[]{str, str2});
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public String mo14814a(Format u0Var) {
        String str;
        int i = m14828i(u0Var);
        if (i == 2) {
            str = m14829j(m14827h(u0Var), m14826g(u0Var), m14822c(u0Var));
        } else if (i == 1) {
            str = m14829j(m14824e(u0Var), m14821b(u0Var), m14822c(u0Var));
        } else {
            str = m14824e(u0Var);
        }
        return str.length() == 0 ? this.f12017a.getString(C1878p.exo_track_unknown) : str;
    }
}
