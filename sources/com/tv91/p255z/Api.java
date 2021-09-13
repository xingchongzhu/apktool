package com.tv91.p255z;

import com.fasterxml.jackson.core.JsonLocation;
import com.tv91.model.Actor;
import com.tv91.model.Category;
import com.tv91.model.Channel;
import com.tv91.model.DownloadInfo;
import com.tv91.model.ExternalSource;
import com.tv91.model.Feedback;
import com.tv91.model.FeedbackType;
import com.tv91.model.Highlight;
import com.tv91.model.Movie;
import com.tv91.model.Paging;
import com.tv91.model.PaymentHistory;
import com.tv91.model.ProductGroup;
import com.tv91.model.Promotion;
import com.tv91.model.PromotionReport;
import com.tv91.model.PurchaseHistory;
import com.tv91.model.PurchasePackage;
import com.tv91.model.Url;
import com.tv91.model.User;
import com.tv91.model.Version;
import com.tv91.p211s.ApiException;
import com.tv91.p211s.JsonException;
import com.tv91.p255z.C3061b.C3062a;
import com.tv91.p255z.C3061b.C3063b;
import com.tv91.utils.C3049d;
import com.tv91.utils.C3052g;
import com.tv91.utils.Jsons;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.tv91.z.a */
public final /* synthetic */ class Api {
    /* renamed from: A */
    public static Paging m20717A(C3061b _this, int i, int i2, int i3, int i4) throws Exception {
        return _this.mo18659c(_this.mo18660d(C3062a.LOAD_MOVIES_BY_SOURCE, C3049d.m20568c(C3049d.m20566a("PageIndex", Integer.valueOf(i)), C3049d.m20566a("PageSize", Integer.valueOf(i2)), C3049d.m20566a("TypeId", Integer.valueOf(i3)), C3049d.m20566a("SourceId", Integer.valueOf(i4)))), Movie.class);
    }

    /* renamed from: B */
    public static Paging m20718B(C3061b _this, int i, int i2, int i3, int[] iArr, String str) throws Exception {
        C3062a aVar = C3062a.LOAD_MOVIES;
        Entry[] entryArr = new Entry[5];
        entryArr[0] = C3049d.m20566a("PageIndex", Integer.valueOf(i));
        entryArr[1] = C3049d.m20566a("PageSize", Integer.valueOf(i2));
        entryArr[2] = C3049d.m20566a("Type", Integer.valueOf(i3));
        entryArr[3] = C3049d.m20566a("ID", iArr);
        if (C3052g.m20586g(str)) {
            str = "";
        }
        entryArr[4] = C3049d.m20566a("Data", str);
        return _this.mo18659c(_this.mo18660d(aVar, C3049d.m20568c(entryArr)), Movie.class);
    }

    /* renamed from: C */
    public static List m20719C(C3061b _this, int i) throws Exception {
        return _this.mo18644O(_this.mo18660d(C3062a.LOAD_MOVIES_BY_RANK, C3049d.m20568c(C3049d.m20566a("Type", Integer.valueOf(i)))), Movie.class);
    }

    /* renamed from: D */
    public static List m20720D(C3061b _this, String str, String str2) throws Exception {
        return _this.mo18644O(_this.mo18660d(C3062a.LOAD_PROMOTION_RESULT, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2))), PromotionReport.class);
    }

    /* renamed from: E */
    public static User m20721E(C3061b _this, String str, String str2) throws Exception {
        return (User) _this.mo18638I(_this.mo18660d(C3062a.LOAD_USER_POINT, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2))), User.class);
    }

    /* renamed from: F */
    public static User m20722F(C3061b _this, String str, String str2) throws Exception {
        return (User) _this.mo18638I(_this.mo18660d(C3062a.LOGIN, C3049d.m20568c(C3049d.m20566a("Account", str), C3049d.m20566a("Password", str2))), User.class);
    }

    /* renamed from: G */
    public static User m20723G(C3061b _this, String str, String str2) throws Exception {
        return (User) _this.mo18638I(_this.mo18660d(C3062a.MOBILE_LOGIN, C3049d.m20568c(C3049d.m20566a("Phone", str), C3049d.m20566a("SMSCode", str2))), User.class);
    }

    /* renamed from: H */
    public static void m20724H(C3061b _this, String str, String str2, String str3) throws Exception {
        _this.mo18648S(_this.mo18660d(C3062a.MODIFY_PASSWORD, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("Password", str3))));
    }

    /* renamed from: I */
    public static C3063b m20725I(C3061b _this, String str) throws JsonException, ApiException {
        C3063b a = C3063b.m20820a(str);
        if (a.f16175b) {
            return a;
        }
        throw new ApiException(a.f16177d, a.f16176c);
    }

    /* renamed from: J */
    public static <T> Object m20726J(C3061b _this, String str, Class cls) throws Exception {
        return Jsons.m20551b(_this.mo18648S(str).f16176c, cls);
    }

    /* renamed from: K */
    public static <T> List m20727K(C3061b _this, String str, Class cls) throws Exception {
        return (List) Jsons.m20550a(_this.mo18648S(str).f16176c, Jsons.m20552c(cls));
    }

    /* renamed from: L */
    public static <T> Paging m20728L(C3061b _this, String str, Class cls) throws Exception {
        return (Paging) Jsons.m20550a(_this.mo18648S(str).f16176c, Jsons.m20553d(cls));
    }

    /* renamed from: M */
    public static void m20729M(C3061b _this, String str, String str2, int i, int i2, int i3) throws Exception {
        String str3;
        C3062a aVar = C3062a.PURCHASE_MOVIE;
        Entry[] entryArr = new Entry[5];
        entryArr[0] = C3049d.m20566a("MemberID", str);
        entryArr[1] = C3049d.m20566a("Token", str2);
        entryArr[2] = C3049d.m20566a("MovieID", Integer.valueOf(i));
        entryArr[3] = C3049d.m20566a("BuyTypeID", Integer.valueOf(i2));
        if (i3 <= 0) {
            str3 = "";
        } else {
            str3 = String.valueOf(i3);
        }
        entryArr[4] = C3049d.m20566a("SourceId", str3);
        _this.mo18648S(_this.mo18660d(aVar, C3049d.m20568c(entryArr)));
    }

    /* renamed from: N */
    public static User m20730N(C3061b _this, int i) throws Exception {
        return (User) _this.mo18638I(_this.mo18660d(C3062a.QUICK_REGISTER, C3049d.m20568c(C3049d.m20566a("OS", Integer.valueOf(1)), C3049d.m20566a("SID", Integer.valueOf(i)))), User.class);
    }

    /* renamed from: O */
    public static void m20731O(C3061b _this, int i, int i2, String str, String str2, String str3) throws Exception {
        _this.mo18648S(_this.mo18660d(C3062a.REGISTER, C3049d.m20568c(C3049d.m20566a("SID", Integer.valueOf(i)), C3049d.m20566a("PID", Integer.valueOf(i2)), C3049d.m20566a("Account", str), C3049d.m20566a("Password", str2), C3049d.m20566a("NickName", str3))));
    }

    /* renamed from: P */
    public static void m20732P(C3061b _this, String str, String str2, int i) throws Exception {
        _this.mo18648S(_this.mo18660d(C3062a.REMOVE_FAVORITE_MOVIE, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("MovieID", Integer.valueOf(i)))));
    }

    /* renamed from: Q */
    public static void m20733Q(C3061b _this, String str, String str2) throws Exception {
        _this.mo18636G(C3052g.m20582c("%s?data=%s", str, C3052g.m20589j(str2)));
    }

    /* renamed from: R */
    public static void m20734R(C3061b _this, String str, String str2, String str3) throws Exception {
        _this.mo18648S(_this.mo18660d(C3062a.RESET_PASSWORD, C3049d.m20568c(C3049d.m20566a("ValidID", str), C3049d.m20566a("ValidCode", str2), C3049d.m20566a("Password", str3))));
    }

    /* renamed from: S */
    public static void m20735S(C3061b _this, String str, String str2, String str3) throws Exception {
        _this.mo18648S(_this.mo18660d(C3062a.SEND_SMS_BINDING, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("Phone", str3))));
    }

    /* renamed from: T */
    public static void m20736T(C3061b _this, String str, String str2, String str3, int i) throws Exception {
        _this.mo18648S(_this.mo18660d(C3062a.SEND_FEEDBACK, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("Message", str3), C3049d.m20566a("Type", Integer.valueOf(i)))));
    }

    /* renamed from: U */
    public static String m20737U(C3061b _this, String str) throws Exception {
        return _this.mo18648S(_this.mo18660d(C3062a.SEND_FORGET_EMAIL, C3049d.m20568c(C3049d.m20566a("Account", str)))).f16176c;
    }

    /* renamed from: V */
    public static void m20738V(C3061b _this, String str) throws Exception {
        _this.mo18648S(_this.mo18660d(C3062a.SEND_SMS_LOGIN, C3049d.m20568c(C3049d.m20566a("Phone", str))));
    }

    /* renamed from: W */
    public static String m20739W(C3061b _this, C3062a aVar) throws Exception {
        return _this.mo18660d(aVar, Collections.emptyMap());
    }

    /* renamed from: X */
    public static String m20740X(C3061b _this, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9) throws Exception {
        return _this.mo18648S(_this.mo18660d(C3062a.WITHDRAW, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("Type", Integer.valueOf(i)), C3049d.m20566a("QQ", str3), C3049d.m20566a("BankName", str4), C3049d.m20566a("Branch", str5), C3049d.m20566a("Name", str6), C3049d.m20566a("Account", str7), C3049d.m20566a("Province", str8), C3049d.m20566a("City", str9)))).f16176c;
    }

    /* renamed from: a */
    public static void m20741a(C3061b _this, String str, String str2, int i) throws Exception {
        _this.mo18648S(_this.mo18660d(C3062a.ADD_FAVORITE_MOVIE, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("MovieID", Integer.valueOf(i)))));
    }

    /* renamed from: b */
    public static void m20742b(C3061b _this, String str, String str2, String str3, String str4) throws Exception {
        _this.mo18648S(_this.mo18660d(C3062a.APPLY_CERTIFICATION, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("Phone", str3), C3049d.m20566a("SMSCode", str4))));
    }

    /* renamed from: c */
    public static void m20743c(C3061b _this, String str, String str2, int i, int i2, String str3) throws Exception {
        _this.mo18648S(_this.mo18660d(C3062a.DOWNLOAD_COMPLETE, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("MovieID", Integer.valueOf(i)), C3049d.m20566a("CID", Integer.valueOf(i2)), C3049d.m20566a("GID", str3))));
    }

    /* renamed from: d */
    public static String m20744d(C3061b _this, String str, String str2, int i, String str3) throws Exception {
        return _this.mo18648S(_this.mo18660d(C3062a.CREATE_PAYMENT2, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("RefID", Integer.valueOf(i)), C3049d.m20566a("UID", str3)))).f16176c;
    }

    /* renamed from: e */
    public static List m20745e(C3061b _this) throws Exception {
        return _this.mo18644O(_this.mo18657a0(C3062a.GET_AD), ExternalSource.class);
    }

    /* renamed from: f */
    public static DownloadInfo m20746f(C3061b _this, String str, String str2, int i) throws Exception {
        return (DownloadInfo) _this.mo18638I(_this.mo18660d(C3062a.GET_DOWNLOAD_INFO, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("MovieID", Integer.valueOf(i)))), DownloadInfo.class);
    }

    /* renamed from: g */
    public static String m20747g(C3061b _this) throws Exception {
        return _this.mo18648S(_this.mo18657a0(C3062a.GET_DOWNLOAD_STATEMENT)).f16176c;
    }

    /* renamed from: h */
    public static List m20748h(C3061b _this) throws Exception {
        return _this.mo18644O(_this.mo18657a0(C3062a.GET_FEEDBACK_TYPE), FeedbackType.class);
    }

    /* renamed from: i */
    public static Paging m20749i(C3061b _this, String str, String str2, int i, int i2) throws Exception {
        return _this.mo18659c(_this.mo18660d(C3062a.LOAD_PAYMENT_HISTORY, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("PageIndex", Integer.valueOf(i)), C3049d.m20566a("PageSize", Integer.valueOf(i2)))), PaymentHistory.class);
    }

    /* renamed from: j */
    public static List m20750j(C3061b _this, String str, String str2) throws Exception {
        return _this.mo18656a(str, str2, 1, JsonLocation.MAX_CONTENT_SNIPPET).getData();
    }

    /* renamed from: k */
    public static List m20751k(C3061b _this, String str, String str2, String str3) throws Exception {
        return _this.mo18644O(_this.mo18660d(C3062a.GET_PRODUCT_GROUPS, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("UID", str3))), ProductGroup.class);
    }

    /* renamed from: l */
    public static Promotion m20752l(C3061b _this, String str, String str2, int i) throws Exception {
        return (Promotion) _this.mo18638I(_this.mo18660d(C3062a.GET_PROMOTION, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("SID", Integer.valueOf(i)))), Promotion.class);
    }

    /* renamed from: m */
    public static List m20753m(C3061b _this, int i) throws Exception {
        return _this.mo18644O(_this.mo18660d(C3062a.GET_PROMOTIONS, C3049d.m20568c(C3049d.m20566a("SID", Integer.valueOf(i)))), Promotion.class);
    }

    /* renamed from: n */
    public static Paging m20754n(C3061b _this, String str, String str2, int i, int i2) throws Exception {
        return _this.mo18659c(_this.mo18660d(C3062a.LOAD_PURCHASE_HISTORY_EXTERNAL, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("PageIndex", Integer.valueOf(i)), C3049d.m20566a("PageSize", Integer.valueOf(i2)))), PurchaseHistory.class);
    }

    /* renamed from: o */
    public static List m20755o(C3061b _this, String str, String str2, int i) throws Exception {
        String str3;
        C3062a aVar = C3062a.LOAD_PURCHASE_HISTORY;
        Entry[] entryArr = new Entry[3];
        entryArr[0] = C3049d.m20566a("MemberID", str);
        entryArr[1] = C3049d.m20566a("Token", str2);
        if (i <= 0) {
            str3 = "";
        } else {
            str3 = String.valueOf(i);
        }
        entryArr[2] = C3049d.m20566a("SourceId", str3);
        return _this.mo18644O(_this.mo18660d(aVar, C3049d.m20568c(entryArr)), PurchaseHistory.class);
    }

    /* renamed from: p */
    public static List m20756p(C3061b _this) throws Exception {
        return _this.mo18644O(_this.mo18657a0(C3062a.GET_PURCHASE_PACKAGES), PurchasePackage.class);
    }

    /* renamed from: q */
    public static Url m20757q(C3061b _this, String str) throws Exception {
        return (Url) Jsons.m20551b(_this.mo18636G(str), Url.class);
    }

    /* renamed from: r */
    public static Version m20758r(C3061b _this, String str) throws Exception {
        return (Version) _this.mo18638I(_this.mo18660d(C3062a.GET_VERSION, C3049d.m20568c(C3049d.m20566a("PackageName", str))), Version.class);
    }

    /* renamed from: s */
    public static Paging m20759s(C3061b _this, int i, int i2) throws Exception {
        return _this.mo18659c(_this.mo18660d(C3062a.LOAD_ACTORS, C3049d.m20568c(C3049d.m20566a("PageIndex", Integer.valueOf(i)), C3049d.m20566a("PageSize", Integer.valueOf(i2)))), Actor.class);
    }

    /* renamed from: t */
    public static List m20760t(C3061b _this) throws Exception {
        return _this.mo18644O(_this.mo18657a0(C3062a.LOAD_CATEGORIES), Category.class);
    }

    /* renamed from: u */
    public static List m20761u(C3061b _this) throws Exception {
        return _this.mo18644O(_this.mo18657a0(C3062a.LOAD_CHANNELS), Channel.class);
    }

    /* renamed from: v */
    public static Paging m20762v(C3061b _this, String str, String str2, int i, int i2) throws Exception {
        return _this.mo18659c(_this.mo18660d(C3062a.LOAD_FAVORITE_MOVIES, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("PageIndex", Integer.valueOf(i)), C3049d.m20566a("PageSize", Integer.valueOf(i2)))), Movie.class);
    }

    /* renamed from: w */
    public static Paging m20763w(C3061b _this, String str, String str2, int i, int i2) throws Exception {
        return _this.mo18659c(_this.mo18660d(C3062a.LOAD_FEEDBACK, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("PageIndex", Integer.valueOf(i)), C3049d.m20566a("PageSize", Integer.valueOf(i2)))), Feedback.class);
    }

    /* renamed from: x */
    public static Highlight m20764x(C3061b _this) throws Exception {
        C3062a aVar = C3062a.LOAD_MOVIES;
        Integer valueOf = Integer.valueOf(0);
        return (Highlight) _this.mo18638I(_this.mo18660d(aVar, C3049d.m20568c(C3049d.m20566a("PageIndex", valueOf), C3049d.m20566a("PageSize", valueOf), C3049d.m20566a("Type", valueOf), C3049d.m20566a("ID", new int[]{200}), C3049d.m20566a("Data", ""))), Highlight.class);
    }

    /* renamed from: y */
    public static Movie m20765y(C3061b _this, User user, int i, int i2) throws Exception {
        Class<Movie> cls = Movie.class;
        String str = "SourceId";
        String str2 = "MovieID";
        if (user == null) {
            return (Movie) _this.mo18638I(_this.mo18660d(C3062a.LOAD_MOVIE, C3049d.m20568c(C3049d.m20566a(str2, Integer.valueOf(i)), C3049d.m20566a(str, Integer.valueOf(i2)))), cls);
        }
        return (Movie) _this.mo18638I(_this.mo18660d(C3062a.LOAD_MOVIE_BY_MEMBER, C3049d.m20568c(C3049d.m20566a("MemberID", user.f14097id), C3049d.m20566a("Token", user.token), C3049d.m20566a(str2, Integer.valueOf(i)), C3049d.m20566a(str, Integer.valueOf(i2)))), cls);
    }

    /* renamed from: z */
    public static String m20766z(C3061b _this, String str, String str2, int i, int i2, int i3) throws Exception {
        return _this.mo18648S(_this.mo18660d(C3062a.LOAD_MOVIE_URL, C3049d.m20568c(C3049d.m20566a("MemberID", str), C3049d.m20566a("Token", str2), C3049d.m20566a("MovieID", Integer.valueOf(i)), C3049d.m20566a("Type", Integer.valueOf(i2)), C3049d.m20566a("SourceId", Integer.valueOf(i3))))).f16176c;
    }
}
