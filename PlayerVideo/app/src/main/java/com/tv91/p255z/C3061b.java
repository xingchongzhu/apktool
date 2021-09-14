package com.tv91.p255z;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.util.List;
import java.util.Map;

/* renamed from: com.tv91.z.b */
/* compiled from: Api */
public interface C3061b {

    /* renamed from: com.tv91.z.b$a */
    /* compiled from: Api */
    public enum C3062a {
        NONE(0, ""),
        LOGIN(1, "Login"),
        LOAD_CHANNELS(2, "GetChannel"),
        LOAD_CATEGORIES(3, "GetClass"),
        GET_SERIES(4, "GetSeries"),
        GET_SUPPLIER(5, "GetSupplier"),
        GET_ACTOR(6, "GetActor"),
        LOAD_MOVIES(7, "GetMovies"),
        LOAD_MOVIES_BY_SOURCE(79, "GetMovieBySource"),
        LOAD_MOVIES_BY_RANK(80, "GetRanks"),
        LOAD_MOVIE(8, "GetMovieInfo"),
        REGISTER(9, "CreateUser"),
        MODIFY_PASSWORD(10, "ModifyPwd"),
        GET_USER_POINT(11, "GetUserPoint"),
        PURCHASE_MOVIE(12, "BuyMovie"),
        PLAY_MOVIE(13, "PlayMovie"),
        BUY_INFO(14, "BuyInfo"),
        LOAD_PURCHASE_HISTORY(15, "MoviesBuyList"),
        LOAD_PURCHASE_HISTORY_EXTERNAL(82, "GetMySourceList"),
        SEND_FORGET_EMAIL(16, "ForgotPwd1"),
        RESET_PASSWORD(17, "ForgotPwd2"),
        GET_PAYMENT_URL(18, "GetPaymentURL"),
        ADD_FAVORITE_MOVIE(19, "SetMyFavorite"),
        REMOVE_FAVORITE_MOVIE(20, "DelMyFavorite"),
        GET_MY_FAVORITE(21, "GetMyFavorite"),
        LOAD_ACTORS(22, "GetActor2"),
        GET_CLASS_PAGING(23, "GetClass2"),
        IMPEACH(24, "Impeach"),
        COOPERATE(25, "Cooperate"),
        GET_BULLETIN_LIST(26, "GetBulletinList"),
        GET_BULLETIN(27, "GetBulletin"),
        GET_FEEDBACK_TYPE(28, "GetServiceType"),
        SEND_FEEDBACK(29, "SetService"),
        LOAD_FEEDBACK(30, "GetServiceList"),
        LOAD_PAYMENT_HISTORY(31, "GetPayList"),
        GET_PLAY_LIST(32, "GetPlayList"),
        GET_APP_EDITION(44, "GetAppEdition"),
        GET_PURCHASE(50, "GetPurchase"),
        CREATE_PAYMENT(51, "CreatePaymentByMobile"),
        LOAD_MOVIE_URL(52, "PlayMovie2"),
        LOAD_USER_POINT(53, "GetUserPoint2"),
        GET_PURCHASE_PACKAGES(54, "GetMovieBuyType"),
        PLAY_MOVIE2_1(55, "PlayMovie2-1"),
        GET_PAYMENT_OPTIONS(56, "GetPurchase2"),
        CREATE_PAYMENT2(57, "CreatePaymentByMobile2"),
        GET_VERSION(59, "91Edition"),
        IS_DOWNLOAD_AVAILABLE(60, "IsDownload"),
        GET_DOWNLOAD_INFO(61, "CreateDownload"),
        DOWNLOAD_COMPLETE(63, "CompleteDownload"),
        GET_DOWNLOAD_STATEMENT(64, "DownloadExplain"),
        LOAD_MOVIE_BY_MEMBER(65, "GetMovieInfoByMember"),
        LOAD_FAVORITE_MOVIES(66, "GetMyFavorite2"),
        QUICK_REGISTER(68, "CreateQuickMember"),
        SEND_SMS_BINDING(69, "SMSBinding"),
        APPLY_CERTIFICATION(70, "Binding"),
        SEND_SMS_LOGIN(71, "SMSLogin"),
        MOBILE_LOGIN(72, "SMSLoginValid"),
        GET_PROMOTIONS(73, "GetPromote"),
        GET_PROMOTION(74, "MyPromote"),
        LOAD_PROMOTION_RESULT(75, "MyPromoteEffect"),
        WITHDRAW(76, "MyConvert"),
        GET_PRODUCT_GROUPS(77, "GetNewPurchase"),
        GET_AD(78, "GetIndexAD");
        

        /* renamed from: o0 */
        public final int f16172o0;

        /* renamed from: p0 */
        public final String f16173p0;

        private C3062a(int i, String str) {
            this.f16172o0 = i;
            this.f16173p0 = str;
        }
    }

    /* renamed from: com.tv91.z.b$b */
    /* compiled from: Api */
    public static final class C3063b {

        /* renamed from: a */
        private static final ObjectMapper f16174a = new ObjectMapper();

        /* renamed from: b */
        public final boolean f16175b;

        /* renamed from: c */
        public final String f16176c;

        /* renamed from: d */
        public final String f16177d;

        public C3063b(boolean z, String str, String str2) {
            this.f16175b = z;
            this.f16176c = str;
            this.f16177d = str2;
        }

        /* renamed from: a */
        public static C3063b m20820a(String str) throws JsonException {
            try {
                JsonNode readTree = f16174a.reader().readTree(str);
                JsonNode jsonNode = readTree.get("Message");
                return new C3063b(readTree.get("Result").asBoolean(), jsonNode.isTextual() ? jsonNode.asText() : jsonNode.toString(), readTree.get("Code").asText());
            } catch (JsonProcessingException e) {
                throw new JsonException(str, e);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ApiResponse{success=");
            sb.append(this.f16175b);
            sb.append(", message='");
            sb.append(this.f16176c);
            sb.append('\'');
            sb.append(", code='");
            sb.append(this.f16177d);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: A */
    User mo18630A(String str, String str2) throws Exception;

    /* renamed from: B */
    void mo18631B(String str) throws Exception;

    /* renamed from: C */
    List<PurchasePackage> mo18632C() throws Exception;

    /* renamed from: D */
    void mo18633D(String str, String str2, String str3) throws Exception;

    /* renamed from: E */
    Paging<Feedback> mo18634E(String str, String str2, int i, int i2) throws Exception;

    /* renamed from: F */
    List<FeedbackType> mo18635F() throws Exception;

    /* renamed from: G */
    String mo18636G(String str) throws Exception;

    /* renamed from: H */
    User mo18637H(String str, String str2) throws Exception;

    /* renamed from: I */
    <T> T mo18638I(String str, Class<T> cls) throws Exception;

    /* renamed from: J */
    User mo18639J(String str, String str2) throws Exception;

    /* renamed from: K */
    void mo18640K(String str, String str2, String str3) throws Exception;

    /* renamed from: L */
    List<PromotionReport> mo18641L(String str, String str2) throws Exception;

    /* renamed from: M */
    List<Category> mo18642M() throws Exception;

    /* renamed from: N */
    String mo18643N(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9) throws Exception;

    /* renamed from: O */
    <T> List<T> mo18644O(String str, Class<T> cls) throws Exception;

    /* renamed from: P */
    List<PaymentHistory> mo18645P(String str, String str2) throws Exception;

    /* renamed from: Q */
    List<ExternalSource> mo18646Q() throws Exception;

    /* renamed from: R */
    void mo18647R(String str, String str2, int i, int i2, int i3) throws Exception;

    /* renamed from: S */
    C3063b mo18648S(String str) throws JsonException, ApiException;

    /* renamed from: T */
    Paging<Movie> mo18649T(String str, String str2, int i, int i2) throws Exception;

    /* renamed from: U */
    Highlight mo18650U() throws Exception;

    /* renamed from: V */
    void mo18651V(String str, String str2, String str3) throws Exception;

    /* renamed from: W */
    DownloadInfo mo18652W(String str, String str2, int i) throws Exception;

    /* renamed from: X */
    Url mo18653X(String str) throws Exception;

    /* renamed from: Y */
    Paging<Movie> mo18654Y(int i, int i2, int i3, int[] iArr, String str) throws Exception;

    /* renamed from: Z */
    void mo18655Z(String str, String str2, String str3, int i) throws Exception;

    /* renamed from: a */
    Paging<PaymentHistory> mo18656a(String str, String str2, int i, int i2) throws Exception;

    /* renamed from: a0 */
    String mo18657a0(C3062a aVar) throws Exception;

    /* renamed from: b */
    Paging<Movie> mo18658b(int i, int i2, int i3, int i4) throws Exception;

    /* renamed from: c */
    <T> Paging<T> mo18659c(String str, Class<T> cls) throws Exception;

    /* renamed from: d */
    String mo18660d(C3062a aVar, Map<String, Object> map) throws Exception;

    /* renamed from: e */
    List<PurchaseHistory> mo18661e(String str, String str2, int i) throws Exception;

    /* renamed from: f */
    Version mo18662f(String str) throws Exception;

    /* renamed from: g */
    User mo18663g(int i) throws Exception;

    /* renamed from: h */
    void mo18664h(String str, String str2, int i) throws Exception;

    /* renamed from: i */
    void mo18665i(String str, String str2, int i) throws Exception;

    /* renamed from: j */
    List<Promotion> mo18666j(int i) throws Exception;

    /* renamed from: k */
    void mo18667k(String str, String str2, int i, int i2, String str3) throws Exception;

    /* renamed from: l */
    Promotion mo18668l(String str, String str2, int i) throws Exception;

    /* renamed from: m */
    List<Movie> mo18669m(int i) throws Exception;

    /* renamed from: n */
    Movie mo18670n(User user, int i, int i2) throws Exception;

    /* renamed from: o */
    String mo18671o(String str, String str2, int i, int i2, int i3) throws Exception;

    /* renamed from: p */
    Paging<PurchaseHistory> mo18672p(String str, String str2, int i, int i2) throws Exception;

    /* renamed from: q */
    String mo18673q() throws Exception;

    /* renamed from: r */
    List<ProductGroup> mo18674r(String str, String str2, String str3) throws Exception;

    /* renamed from: s */
    void mo18675s(String str, String str2, String str3, String str4) throws Exception;

    /* renamed from: t */
    String mo18676t(String str) throws Exception;

    /* renamed from: u */
    void mo18677u(int i, int i2, String str, String str2, String str3) throws Exception;

    /* renamed from: v */
    Paging<Actor> mo18678v(int i, int i2) throws Exception;

    /* renamed from: w */
    void mo18679w(String str, String str2) throws Exception;

    /* renamed from: x */
    List<Channel> mo18680x() throws Exception;

    /* renamed from: y */
    String mo18681y(String str, String str2, int i, String str3) throws Exception;

    /* renamed from: z */
    void mo18682z(String... strArr);
}
