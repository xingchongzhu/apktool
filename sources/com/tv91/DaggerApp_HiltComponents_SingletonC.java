package com.tv91;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import com.tv91.features.authentication.AuthActivity;
import com.tv91.features.authentication.p199m.ChangePasswordFragment;
import com.tv91.features.authentication.p199m.ChangePasswordFragment_MembersInjector;
import com.tv91.features.authentication.p200n.LoginFragment;
import com.tv91.features.authentication.p200n.LoginFragment_MembersInjector;
import com.tv91.features.authentication.p201o.RegisterFragment;
import com.tv91.features.authentication.p201o.RegisterFragment_MembersInjector;
import com.tv91.features.authentication.p202p.ForgetPasswordFragment;
import com.tv91.features.authentication.p202p.ForgetPasswordFragment_MembersInjector;
import com.tv91.features.authentication.p203q.LoadUserInfoUseCase;
import com.tv91.features.authentication.p203q.LoginUseCase;
import com.tv91.features.authentication.p203q.LogoutUseCase;
import com.tv91.features.authentication.p203q.MobileLoginUseCase;
import com.tv91.features.authentication.p203q.ModifyPasswordUseCase;
import com.tv91.features.authentication.p203q.QuickRegisterUseCase;
import com.tv91.features.authentication.p203q.RegisterUseCase;
import com.tv91.features.authentication.p203q.ResetPasswordUseCase;
import com.tv91.features.authentication.p203q.SendForgetPasswordEmailUseCase;
import com.tv91.features.authentication.p203q.SendSMSUseCase;
import com.tv91.features.authentication.p203q.VerifyMobileUseCase;
import com.tv91.features.authentication.p204r.VerifyFragment;
import com.tv91.features.authentication.p204r.VerifyFragment_MembersInjector;
import com.tv91.p212t.DefaultSchedulers;
import com.tv91.p213u.p214a.p215m.ActorFragment;
import com.tv91.p213u.p214a.p215m.ActorFragment_MembersInjector;
import com.tv91.p213u.p214a.p216n.CategoryFragment;
import com.tv91.p213u.p214a.p216n.CategoryFragment_MembersInjector;
import com.tv91.p213u.p214a.p217o.ChannelFragment;
import com.tv91.p213u.p214a.p217o.ChannelFragment_MembersInjector;
import com.tv91.p213u.p214a.p218p.ProfileFragment;
import com.tv91.p213u.p214a.p218p.ProfileFragment_MembersInjector;
import com.tv91.p213u.p214a.p219q.PromotionFragment;
import com.tv91.p213u.p214a.p219q.PromotionFragment_MembersInjector;
import com.tv91.p213u.p214a.p220r.LoadActorsUseCase;
import com.tv91.p213u.p214a.p220r.LoadAdvertiseUseCase;
import com.tv91.p213u.p214a.p220r.LoadCategoriesUseCase;
import com.tv91.p213u.p214a.p220r.LoadChannelsUseCase;
import com.tv91.p213u.p221b.DownloadFragment;
import com.tv91.p213u.p221b.DownloadFragment_MembersInjector;
import com.tv91.p213u.p221b.p222x0.C2514f1;
import com.tv91.p213u.p221b.p222x0.C2568r1;
import com.tv91.p213u.p221b.p222x0.C2574t1;
import com.tv91.p213u.p221b.p222x0.C2580v1;
import com.tv91.p213u.p221b.p222x0.GetDownloadInfoUseCase;
import com.tv91.p213u.p221b.p222x0.GetDownloadStatementUseCase;
import com.tv91.p213u.p221b.p222x0.LoadDownloadRecordUseCase;
import com.tv91.p213u.p221b.p222x0.LoadDownloadRecordsUseCase;
import com.tv91.p213u.p221b.p222x0.MoveDownloadUseCase;
import com.tv91.p213u.p221b.p222x0.UpdateDownloadUseCase;
import com.tv91.p213u.p223c.p224f.MovieFragment;
import com.tv91.p213u.p223c.p224f.MovieFragment_MembersInjector;
import com.tv91.p213u.p223c.p225g.FavoriteFragment;
import com.tv91.p213u.p223c.p225g.FavoriteFragment_MembersInjector;
import com.tv91.p213u.p223c.p226h.HighlightFragment;
import com.tv91.p213u.p223c.p226h.HighlightFragment_MembersInjector;
import com.tv91.p213u.p223c.p227i.BaseMoviesFragment;
import com.tv91.p213u.p223c.p227i.BaseMoviesFragment_MembersInjector;
import com.tv91.p213u.p223c.p228j.MovieSearchFragment;
import com.tv91.p213u.p223c.p228j.MovieSearchFragment_MembersInjector;
import com.tv91.p213u.p223c.p229k.AddFavoriteUseCase;
import com.tv91.p213u.p223c.p229k.LoadFavoriteUseCase;
import com.tv91.p213u.p223c.p229k.LoadHighlightUseCase;
import com.tv91.p213u.p223c.p229k.LoadMovieUrlUseCase;
import com.tv91.p213u.p223c.p229k.LoadMovieUseCase;
import com.tv91.p213u.p223c.p229k.LoadMoviesUseCase;
import com.tv91.p213u.p223c.p229k.RemoveFavoriteUseCase;
import com.tv91.p213u.p230d.NewsFragment;
import com.tv91.p213u.p230d.NewsFragment_MembersInjector;
import com.tv91.p213u.p231e.p232g.MemberPromotionFragment;
import com.tv91.p213u.p231e.p232g.MemberPromotionFragment_MembersInjector;
import com.tv91.p213u.p231e.p234i.PromotionStatementFragment;
import com.tv91.p213u.p231e.p234i.PromotionStatementFragment_MembersInjector;
import com.tv91.p213u.p231e.p235j.GenerateQRCodeUseCase;
import com.tv91.p213u.p231e.p235j.LoadPromotionReportUseCase;
import com.tv91.p213u.p231e.p235j.LoadPromotionUseCase;
import com.tv91.p213u.p231e.p235j.LoadPromotionsUseCase;
import com.tv91.p213u.p231e.p235j.WithdrawUseCase;
import com.tv91.p213u.p231e.p236k.PromotionWithdrawFragment;
import com.tv91.p213u.p231e.p236k.PromotionWithdrawFragment_MembersInjector;
import com.tv91.p213u.p237f.p238c.FeedbackListFragment;
import com.tv91.p213u.p237f.p238c.FeedbackListFragment_MembersInjector;
import com.tv91.p213u.p237f.p240e.SendFeedbackFragment;
import com.tv91.p213u.p237f.p240e.SendFeedbackFragment_MembersInjector;
import com.tv91.p213u.p237f.p241f.GetFeedbackTypeUseCase;
import com.tv91.p213u.p237f.p241f.LoadFeedbackUseCase;
import com.tv91.p213u.p237f.p241f.SendFeedbackUseCase;
import com.tv91.p213u.p242g.SplashFragment;
import com.tv91.p213u.p242g.SplashFragment_MembersInjector;
import com.tv91.p213u.p242g.p243f0.CheckUpdateUseCase;
import com.tv91.p213u.p242g.p243f0.DownloadApkUseCase;
import com.tv91.p213u.p242g.p243f0.GetUrlUseCase;
import com.tv91.p213u.p242g.p243f0.ReportServerDownUseCase;
import com.tv91.p213u.p244h.p245h.HistoryFragment;
import com.tv91.p213u.p244h.p245h.HistoryFragment_MembersInjector;
import com.tv91.p213u.p244h.p246i.PaymentFragment;
import com.tv91.p213u.p244h.p246i.PaymentFragment_MembersInjector;
import com.tv91.p213u.p244h.p247j.PurchaseFragment;
import com.tv91.p213u.p244h.p247j.PurchaseFragment_MembersInjector;
import com.tv91.p213u.p244h.p248k.CreateOrderUseCase;
import com.tv91.p213u.p244h.p248k.GetPaymentHistoryUseCase;
import com.tv91.p213u.p244h.p248k.GetProductGroupsUseCase;
import com.tv91.p213u.p244h.p248k.GetPurchaseHistoryUseCase;
import com.tv91.p213u.p244h.p248k.GetPurchasePackageUseCase;
import com.tv91.p213u.p244h.p248k.PurchaseMovieUseCase;
import com.tv91.p250v.AppModule;
import com.tv91.p250v.AppModule_ProvideOkHttpClientFactory;
import com.tv91.p250v.AppModule_ProvideSharedPreferencesFactory;
import com.tv91.p250v.ResourceModule_ApiUrlFactory;
import com.tv91.p250v.ResourceModule_BackupApiUrlFactory;
import com.tv91.p250v.ResourceModule_DomainNameFactory;
import com.tv91.p250v.ResourceModule_ProvideShakeAnimationFactory;
import com.tv91.p252x.NavigatorProvider;
import com.tv91.p253y.MovieDatabase;
import com.tv91.p253y.SystemPreference;
import com.tv91.p253y.UserPreference;
import com.tv91.p253y.p254i.DBHelper;
import com.tv91.p255z.C3066f;
import com.tv91.p255z.p256g.WebApi;
import com.tv91.p255z.p257h.WebDownloadApi;
import com.tv91.p255z.p258i.GlideImageLoader;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import p262d.p263a.p264b.ActivityRetainedLifecycle;
import p262d.p263a.p264b.p266d.p267b.ActivityComponentBuilder;
import p262d.p263a.p264b.p266d.p267b.ActivityRetainedComponentBuilder;
import p262d.p263a.p264b.p266d.p267b.FragmentComponentBuilder;
import p262d.p263a.p264b.p266d.p268c.ApplicationContextModule;
import p262d.p263a.p264b.p266d.p268c.ApplicationContextModule_ProvideContextFactory;
import p262d.p270b.C3295c;
import p262d.p270b.DoubleCheck;
import p262d.p270b.MemoizedSentinel;
import p271e.OkHttpClient;

/* renamed from: com.tv91.k */
public final class DaggerApp_HiltComponents_SingletonC extends C2322i {

    /* renamed from: a */
    private final ApplicationContextModule f14049a;

    /* renamed from: b */
    private volatile Object f14050b;

    /* renamed from: c */
    private volatile Object f14051c;

    /* renamed from: d */
    private volatile Object f14052d;

    /* renamed from: e */
    private volatile Object f14053e;

    /* renamed from: f */
    private volatile Object f14054f;

    /* renamed from: g */
    private volatile Object f14055g;

    /* renamed from: h */
    private volatile Object f14056h;

    /* renamed from: i */
    private volatile Object f14057i;

    /* renamed from: j */
    private volatile Object f14058j;

    /* renamed from: k */
    private volatile Object f14059k;

    /* renamed from: l */
    private volatile Object f14060l;

    /* renamed from: m */
    private volatile Object f14061m;

    /* renamed from: n */
    private volatile Object f14062n;

    /* renamed from: com.tv91.k$b */
    /* compiled from: DaggerApp_HiltComponents_SingletonC */
    private final class C2324b implements ActivityRetainedComponentBuilder {
        private C2324b() {
        }

        /* renamed from: b */
        public C2320g mo16918a() {
            return new C2325c();
        }
    }

    /* renamed from: com.tv91.k$c */
    /* compiled from: DaggerApp_HiltComponents_SingletonC */
    private final class C2325c extends C2320g {

        /* renamed from: a */
        private volatile Object f14064a;

        /* renamed from: com.tv91.k$c$a */
        /* compiled from: DaggerApp_HiltComponents_SingletonC */
        private final class C2326a implements ActivityComponentBuilder {

            /* renamed from: a */
            private Activity f14066a;

            private C2326a() {
            }

            /* renamed from: c */
            public C2326a mo16923b(Activity activity) {
                this.f14066a = (Activity) C3295c.m22906b(activity);
                return this;
            }

            /* renamed from: d */
            public App_HiltComponents mo16922a() {
                C3295c.m22905a(this.f14066a, Activity.class);
                return new C2327b(this.f14066a);
            }
        }

        /* renamed from: com.tv91.k$c$b */
        /* compiled from: DaggerApp_HiltComponents_SingletonC */
        private final class C2327b extends App_HiltComponents {

            /* renamed from: com.tv91.k$c$b$a */
            /* compiled from: DaggerApp_HiltComponents_SingletonC */
            private final class C2328a implements FragmentComponentBuilder {

                /* renamed from: a */
                private Fragment f14069a;

                private C2328a() {
                }

                /* renamed from: c */
                public C2321h mo16928a() {
                    C3295c.m22905a(this.f14069a, Fragment.class);
                    return new C2329b(this.f14069a);
                }

                /* renamed from: d */
                public C2328a mo16929b(Fragment fragment) {
                    this.f14069a = (Fragment) C3295c.m22906b(fragment);
                    return this;
                }
            }

            /* renamed from: com.tv91.k$c$b$b */
            /* compiled from: DaggerApp_HiltComponents_SingletonC */
            private final class C2329b extends C2321h {
                /* renamed from: A */
                private AddFavoriteUseCase m17512A() {
                    return new AddFavoriteUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: A0 */
                private LoadPromotionsUseCase m17513A0() {
                    return new LoadPromotionsUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17464I());
                }

                /* renamed from: B */
                private CheckUpdateUseCase m17514B() {
                    return new CheckUpdateUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L());
                }

                /* renamed from: B0 */
                private LoadUserInfoUseCase m17515B0() {
                    return new LoadUserInfoUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: C */
                private CreateOrderUseCase m17516C() {
                    return new CreateOrderUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K(), DaggerApp_HiltComponents_SingletonC.this.m17464I());
                }

                /* renamed from: C0 */
                private LoginUseCase m17517C0() {
                    return new LoginUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K(), DaggerApp_HiltComponents_SingletonC.this.m17464I());
                }

                /* renamed from: D */
                private DownloadApkUseCase m17518D() {
                    return new DownloadApkUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17468M());
                }

                /* renamed from: D0 */
                private LogoutUseCase m17519D0() {
                    return new LogoutUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: E */
                private GenerateQRCodeUseCase m17520E() {
                    return new GenerateQRCodeUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t());
                }

                /* renamed from: E0 */
                private MobileLoginUseCase m17521E0() {
                    return new MobileLoginUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K(), DaggerApp_HiltComponents_SingletonC.this.m17464I());
                }

                /* renamed from: F */
                private GetDownloadInfoUseCase m17522F() {
                    return new GetDownloadInfoUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: F0 */
                private ModifyPasswordUseCase m17523F0() {
                    return new ModifyPasswordUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: G */
                private GetDownloadStatementUseCase m17524G() {
                    return new GetDownloadStatementUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L());
                }

                /* renamed from: G0 */
                private MoveDownloadUseCase m17525G0() {
                    return new MoveDownloadUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17468M(), DaggerApp_HiltComponents_SingletonC.this.m17488y());
                }

                /* renamed from: H */
                private GetFeedbackTypeUseCase m17526H() {
                    return new GetFeedbackTypeUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L());
                }

                /* renamed from: H0 */
                private PurchaseMovieUseCase m17527H0() {
                    return new PurchaseMovieUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: I */
                private GetPaymentHistoryUseCase m17528I() {
                    return new GetPaymentHistoryUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: I0 */
                private QuickRegisterUseCase m17529I0() {
                    return new QuickRegisterUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K(), DaggerApp_HiltComponents_SingletonC.this.m17464I());
                }

                /* renamed from: J */
                private GetProductGroupsUseCase m17530J() {
                    return new GetProductGroupsUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K(), DaggerApp_HiltComponents_SingletonC.this.m17464I());
                }

                /* renamed from: J0 */
                private RegisterUseCase m17531J0() {
                    return new RegisterUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17464I());
                }

                /* renamed from: K */
                private GetPurchaseHistoryUseCase m17532K() {
                    return new GetPurchaseHistoryUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: K0 */
                private RemoveFavoriteUseCase m17533K0() {
                    return new RemoveFavoriteUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: L */
                private GetPurchasePackageUseCase m17534L() {
                    return new GetPurchasePackageUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L());
                }

                /* renamed from: L0 */
                private ReportServerDownUseCase m17535L0() {
                    return new ReportServerDownUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L());
                }

                /* renamed from: M */
                private GetUrlUseCase m17536M() {
                    return new GetUrlUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17464I());
                }

                /* renamed from: M0 */
                private ResetPasswordUseCase m17537M0() {
                    return new ResetPasswordUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L());
                }

                /* renamed from: N */
                private ActorFragment m17538N(ActorFragment iVar) {
                    ActorFragment_MembersInjector.m17926a(iVar, m17569n0());
                    return iVar;
                }

                /* renamed from: N0 */
                private SendFeedbackUseCase m17539N0() {
                    return new SendFeedbackUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: O */
                private BaseMoviesFragment m17540O(BaseMoviesFragment vVar) {
                    BaseMoviesFragment_MembersInjector.m19382a(vVar, m17579x0());
                    return vVar;
                }

                /* renamed from: O0 */
                private SendForgetPasswordEmailUseCase m17541O0() {
                    return new SendForgetPasswordEmailUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L());
                }

                /* renamed from: P */
                private CategoryFragment m17542P(CategoryFragment oVar) {
                    CategoryFragment_MembersInjector.m17984a(oVar, m17571p0());
                    return oVar;
                }

                /* renamed from: P0 */
                private SendSMSUseCase m17543P0() {
                    return new SendSMSUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: Q */
                private ChangePasswordFragment m17544Q(ChangePasswordFragment nVar) {
                    ChangePasswordFragment_MembersInjector.m16782b(nVar, m17523F0());
                    ChangePasswordFragment_MembersInjector.m16781a(nVar, m17519D0());
                    return nVar;
                }

                /* renamed from: Q0 */
                private VerifyMobileUseCase m17545Q0() {
                    return new VerifyMobileUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: R */
                private ChannelFragment m17546R(ChannelFragment lVar) {
                    ChannelFragment_MembersInjector.m18048c(lVar, DaggerApp_HiltComponents_SingletonC.this.m17464I());
                    ChannelFragment_MembersInjector.m18049d(lVar, DaggerApp_HiltComponents_SingletonC.this.m17466K());
                    ChannelFragment_MembersInjector.m18046a(lVar, m17570o0());
                    ChannelFragment_MembersInjector.m18047b(lVar, m17572q0());
                    return lVar;
                }

                /* renamed from: R0 */
                private WithdrawUseCase m17547R0() {
                    return new WithdrawUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: S */
                private DownloadFragment m17548S(DownloadFragment q0Var) {
                    DownloadFragment_MembersInjector.m18385a(q0Var, DaggerApp_HiltComponents_SingletonC.this.m17484u());
                    DownloadFragment_MembersInjector.m18386b(q0Var, DaggerApp_HiltComponents_SingletonC.this.m17487x());
                    DownloadFragment_MembersInjector.m18388d(q0Var, m17525G0());
                    DownloadFragment_MembersInjector.m18387c(q0Var, m17578w0());
                    return q0Var;
                }

                /* renamed from: T */
                private FavoriteFragment m17549T(FavoriteFragment sVar) {
                    FavoriteFragment_MembersInjector.m19163a(sVar, m17574s0());
                    FavoriteFragment_MembersInjector.m19164b(sVar, m17533K0());
                    return sVar;
                }

                /* renamed from: U */
                private FeedbackListFragment m17550U(FeedbackListFragment qVar) {
                    FeedbackListFragment_MembersInjector.m19919b(qVar, DaggerApp_HiltComponents_SingletonC.this.m17466K());
                    FeedbackListFragment_MembersInjector.m19918a(qVar, m17575t0());
                    return qVar;
                }

                /* renamed from: V */
                private ForgetPasswordFragment m17551V(ForgetPasswordFragment vVar) {
                    ForgetPasswordFragment_MembersInjector.m17016b(vVar, m17541O0());
                    ForgetPasswordFragment_MembersInjector.m17015a(vVar, m17537M0());
                    return vVar;
                }

                /* renamed from: W */
                private HighlightFragment m17552W(HighlightFragment rVar) {
                    HighlightFragment_MembersInjector.m19231a(rVar, m17576u0());
                    return rVar;
                }

                /* renamed from: X */
                private HistoryFragment m17553X(HistoryFragment rVar) {
                    HistoryFragment_MembersInjector.m20275b(rVar, m17532K());
                    HistoryFragment_MembersInjector.m20274a(rVar, m17528I());
                    return rVar;
                }

                /* renamed from: Y */
                private LoginFragment m17554Y(LoginFragment i0Var) {
                    LoginFragment_MembersInjector.m16872e(i0Var, DaggerApp_HiltComponents_SingletonC.this.m17466K());
                    LoginFragment_MembersInjector.m16868a(i0Var, m17517C0());
                    LoginFragment_MembersInjector.m16871d(i0Var, m17543P0());
                    LoginFragment_MembersInjector.m16869b(i0Var, m17521E0());
                    LoginFragment_MembersInjector.m16870c(i0Var, m17529I0());
                    return i0Var;
                }

                /* renamed from: Z */
                private MemberPromotionFragment m17555Z(MemberPromotionFragment xVar) {
                    MemberPromotionFragment_MembersInjector.m19679b(xVar, m17581z0());
                    MemberPromotionFragment_MembersInjector.m19678a(xVar, m17520E());
                    return xVar;
                }

                /* renamed from: a0 */
                private MovieFragment m17556a0(MovieFragment y1Var) {
                    MovieFragment_MembersInjector.m18858b(y1Var, DaggerApp_HiltComponents_SingletonC.this.m17484u());
                    MovieFragment_MembersInjector.m18868l(y1Var, DaggerApp_HiltComponents_SingletonC.this.m17466K());
                    MovieFragment_MembersInjector.m18863g(y1Var, m17578w0());
                    MovieFragment_MembersInjector.m18865i(y1Var, m17579x0());
                    MovieFragment_MembersInjector.m18861e(y1Var, m17573r0());
                    MovieFragment_MembersInjector.m18862f(y1Var, DaggerApp_HiltComponents_SingletonC.this.m17487x());
                    MovieFragment_MembersInjector.m18864h(y1Var, m17577v0());
                    MovieFragment_MembersInjector.m18857a(y1Var, m17512A());
                    MovieFragment_MembersInjector.m18867k(y1Var, m17533K0());
                    MovieFragment_MembersInjector.m18859c(y1Var, m17522F());
                    MovieFragment_MembersInjector.m18860d(y1Var, m17524G());
                    MovieFragment_MembersInjector.m18866j(y1Var, m17527H0());
                    return y1Var;
                }

                /* renamed from: b0 */
                private MovieSearchFragment m17557b0(MovieSearchFragment nVar) {
                    MovieSearchFragment_MembersInjector.m19447a(nVar, m17579x0());
                    return nVar;
                }

                /* renamed from: c0 */
                private NewsFragment m17558c0(NewsFragment dVar) {
                    NewsFragment_MembersInjector.m19573b(dVar, DaggerApp_HiltComponents_SingletonC.this.m17464I());
                    NewsFragment_MembersInjector.m19572a(dVar, DaggerApp_HiltComponents_SingletonC.this.m17457B());
                    return dVar;
                }

                /* renamed from: d0 */
                private PaymentFragment m17559d0(PaymentFragment yVar) {
                    PaymentFragment_MembersInjector.m20307c(yVar, DaggerApp_HiltComponents_SingletonC.this.m17466K());
                    PaymentFragment_MembersInjector.m20306b(yVar, m17530J());
                    PaymentFragment_MembersInjector.m20305a(yVar, m17516C());
                    return yVar;
                }

                /* renamed from: e0 */
                private ProfileFragment m17560e0(ProfileFragment vVar) {
                    ProfileFragment_MembersInjector.m18149a(vVar, m17515B0());
                    ProfileFragment_MembersInjector.m18150b(vVar, m17519D0());
                    return vVar;
                }

                /* renamed from: f0 */
                private PromotionFragment m17561f0(PromotionFragment hVar) {
                    PromotionFragment_MembersInjector.m18200b(hVar, DaggerApp_HiltComponents_SingletonC.this.m17466K());
                    PromotionFragment_MembersInjector.m18199a(hVar, m17513A0());
                    return hVar;
                }

                /* renamed from: g0 */
                private PromotionStatementFragment m17562g0(PromotionStatementFragment pVar) {
                    PromotionStatementFragment_MembersInjector.m19735a(pVar, m17580y0());
                    return pVar;
                }

                /* renamed from: h0 */
                private PromotionWithdrawFragment m17563h0(PromotionWithdrawFragment oVar) {
                    PromotionWithdrawFragment_MembersInjector.m19847a(oVar, m17547R0());
                    return oVar;
                }

                /* renamed from: i0 */
                private PurchaseFragment m17564i0(PurchaseFragment rVar) {
                    PurchaseFragment_MembersInjector.m20466c(rVar, DaggerApp_HiltComponents_SingletonC.this.m17466K());
                    PurchaseFragment_MembersInjector.m20464a(rVar, m17534L());
                    PurchaseFragment_MembersInjector.m20465b(rVar, m17527H0());
                    return rVar;
                }

                /* renamed from: j0 */
                private RegisterFragment m17565j0(RegisterFragment nVar) {
                    RegisterFragment_MembersInjector.m16951b(nVar, m17531J0());
                    RegisterFragment_MembersInjector.m16950a(nVar, m17517C0());
                    return nVar;
                }

                /* renamed from: k0 */
                private SendFeedbackFragment m17566k0(SendFeedbackFragment oVar) {
                    SendFeedbackFragment_MembersInjector.m19996a(oVar, m17526H());
                    SendFeedbackFragment_MembersInjector.m19997b(oVar, m17539N0());
                    return oVar;
                }

                /* renamed from: l0 */
                private SplashFragment m17567l0(SplashFragment a0Var) {
                    SplashFragment_MembersInjector.m20094a(a0Var, DaggerApp_HiltComponents_SingletonC.this.m17467L());
                    SplashFragment_MembersInjector.m20103j(a0Var, DaggerApp_HiltComponents_SingletonC.this.m17466K());
                    SplashFragment_MembersInjector.m20102i(a0Var, DaggerApp_HiltComponents_SingletonC.this.m17464I());
                    SplashFragment_MembersInjector.m20095b(a0Var, DaggerApp_HiltComponents_SingletonC.this.m17458C());
                    SplashFragment_MembersInjector.m20096c(a0Var, DaggerApp_HiltComponents_SingletonC.this.m17456A());
                    SplashFragment_MembersInjector.m20098e(a0Var, DaggerApp_HiltComponents_SingletonC.this.m17457B());
                    SplashFragment_MembersInjector.m20100g(a0Var, m17536M());
                    SplashFragment_MembersInjector.m20097d(a0Var, m17514B());
                    SplashFragment_MembersInjector.m20099f(a0Var, m17518D());
                    SplashFragment_MembersInjector.m20101h(a0Var, m17535L0());
                    return a0Var;
                }

                /* renamed from: m0 */
                private VerifyFragment m17568m0(VerifyFragment wVar) {
                    VerifyFragment_MembersInjector.m17216a(wVar, m17543P0());
                    VerifyFragment_MembersInjector.m17217b(wVar, m17545Q0());
                    return wVar;
                }

                /* renamed from: n0 */
                private LoadActorsUseCase m17569n0() {
                    return new LoadActorsUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L());
                }

                /* renamed from: o0 */
                private LoadAdvertiseUseCase m17570o0() {
                    return new LoadAdvertiseUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L());
                }

                /* renamed from: p0 */
                private LoadCategoriesUseCase m17571p0() {
                    return new LoadCategoriesUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L());
                }

                /* renamed from: q0 */
                private LoadChannelsUseCase m17572q0() {
                    return new LoadChannelsUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L());
                }

                /* renamed from: r0 */
                private LoadDownloadRecordUseCase m17573r0() {
                    return new LoadDownloadRecordUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17466K(), DaggerApp_HiltComponents_SingletonC.this.m17488y());
                }

                /* renamed from: s0 */
                private LoadFavoriteUseCase m17574s0() {
                    return new LoadFavoriteUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: t0 */
                private LoadFeedbackUseCase m17575t0() {
                    return new LoadFeedbackUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: u0 */
                private LoadHighlightUseCase m17576u0() {
                    return new LoadHighlightUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L());
                }

                /* renamed from: v0 */
                private LoadMovieUrlUseCase m17577v0() {
                    return new LoadMovieUrlUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: w0 */
                private LoadMovieUseCase m17578w0() {
                    return new LoadMovieUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K(), DaggerApp_HiltComponents_SingletonC.this.m17488y());
                }

                /* renamed from: x0 */
                private LoadMoviesUseCase m17579x0() {
                    return new LoadMoviesUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L());
                }

                /* renamed from: y0 */
                private LoadPromotionReportUseCase m17580y0() {
                    return new LoadPromotionReportUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K());
                }

                /* renamed from: z0 */
                private LoadPromotionUseCase m17581z0() {
                    return new LoadPromotionUseCase(DaggerApp_HiltComponents_SingletonC.this.m17483t(), DaggerApp_HiltComponents_SingletonC.this.m17467L(), DaggerApp_HiltComponents_SingletonC.this.m17466K(), DaggerApp_HiltComponents_SingletonC.this.m17464I());
                }

                /* renamed from: a */
                public void mo16932a(ActorFragment iVar) {
                    m17538N(iVar);
                }

                /* renamed from: b */
                public void mo16933b(MovieSearchFragment nVar) {
                    m17557b0(nVar);
                }

                /* renamed from: c */
                public void mo16934c(PromotionFragment hVar) {
                    m17561f0(hVar);
                }

                /* renamed from: d */
                public void mo16935d(BaseMoviesFragment vVar) {
                    m17540O(vVar);
                }

                /* renamed from: e */
                public void mo16936e(ChannelFragment lVar) {
                    m17546R(lVar);
                }

                /* renamed from: f */
                public void mo16937f(PaymentFragment yVar) {
                    m17559d0(yVar);
                }

                /* renamed from: g */
                public void mo16938g(SplashFragment a0Var) {
                    m17567l0(a0Var);
                }

                /* renamed from: h */
                public void mo16939h(PurchaseFragment rVar) {
                    m17564i0(rVar);
                }

                /* renamed from: i */
                public void mo16940i(NewsFragment dVar) {
                    m17558c0(dVar);
                }

                /* renamed from: j */
                public void mo16941j(ProfileFragment vVar) {
                    m17560e0(vVar);
                }

                /* renamed from: k */
                public void mo16634k(RegisterFragment nVar) {
                    m17565j0(nVar);
                }

                /* renamed from: l */
                public void mo16942l(PromotionStatementFragment pVar) {
                    m17562g0(pVar);
                }

                /* renamed from: m */
                public void mo16943m(CategoryFragment oVar) {
                    m17542P(oVar);
                }

                /* renamed from: n */
                public void mo16667n(ForgetPasswordFragment vVar) {
                    m17551V(vVar);
                }

                /* renamed from: o */
                public void mo16551o(ChangePasswordFragment nVar) {
                    m17544Q(nVar);
                }

                /* renamed from: p */
                public void mo16944p(MovieFragment y1Var) {
                    m17556a0(y1Var);
                }

                /* renamed from: q */
                public void mo16945q(HighlightFragment rVar) {
                    m17552W(rVar);
                }

                /* renamed from: r */
                public void mo16792r(VerifyFragment wVar) {
                    m17568m0(wVar);
                }

                /* renamed from: s */
                public void mo16946s(PromotionWithdrawFragment oVar) {
                    m17563h0(oVar);
                }

                /* renamed from: t */
                public void mo16947t(HistoryFragment rVar) {
                    m17553X(rVar);
                }

                /* renamed from: u */
                public void mo16948u(FeedbackListFragment qVar) {
                    m17550U(qVar);
                }

                /* renamed from: v */
                public void mo16949v(SendFeedbackFragment oVar) {
                    m17566k0(oVar);
                }

                /* renamed from: w */
                public void mo16950w(DownloadFragment q0Var) {
                    m17548S(q0Var);
                }

                /* renamed from: x */
                public void mo16951x(MemberPromotionFragment xVar) {
                    m17555Z(xVar);
                }

                /* renamed from: y */
                public void mo16600y(LoginFragment i0Var) {
                    m17554Y(i0Var);
                }

                /* renamed from: z */
                public void mo16952z(FavoriteFragment sVar) {
                    m17549T(sVar);
                }

                private C2329b(Fragment fragment) {
                }
            }

            /* renamed from: d */
            private MainActivity m17504d(MainActivity mainActivity) {
                MainActivity_MembersInjector.m17636a(mainActivity, DaggerApp_HiltComponents_SingletonC.this.m17464I());
                return mainActivity;
            }

            /* renamed from: a */
            public void mo16479a(AuthActivity authActivity) {
            }

            /* renamed from: b */
            public FragmentComponentBuilder mo16926b() {
                return new C2328a();
            }

            /* renamed from: c */
            public void mo16927c(MainActivity mainActivity) {
                m17504d(mainActivity);
            }

            private C2327b(Activity activity) {
            }
        }

        /* renamed from: c */
        private Object m17497c() {
            Object obj;
            Object obj2 = this.f14064a;
            if (!(obj2 instanceof MemoizedSentinel)) {
                return obj2;
            }
            synchronized (obj2) {
                obj = this.f14064a;
                if (obj instanceof MemoizedSentinel) {
                    obj = ActivityRetainedComponentManager_Lifecycle_Factory.m22925a();
                    this.f14064a = DoubleCheck.m22904a(this.f14064a, obj);
                }
            }
            return obj;
        }

        /* renamed from: a */
        public ActivityComponentBuilder mo16920a() {
            return new C2326a();
        }

        /* renamed from: b */
        public ActivityRetainedLifecycle mo16921b() {
            return (ActivityRetainedLifecycle) m17497c();
        }

        private C2325c() {
            this.f14064a = new MemoizedSentinel();
        }
    }

    /* renamed from: com.tv91.k$d */
    /* compiled from: DaggerApp_HiltComponents_SingletonC */
    public static final class C2330d {

        /* renamed from: a */
        private ApplicationContextModule f14072a;

        /* renamed from: a */
        public C2330d mo16953a(ApplicationContextModule aVar) {
            this.f14072a = (ApplicationContextModule) C3295c.m22906b(aVar);
            return this;
        }

        /* renamed from: b */
        public C2322i mo16954b() {
            C3295c.m22905a(this.f14072a, ApplicationContextModule.class);
            return new DaggerApp_HiltComponents_SingletonC(this.f14072a);
        }

        private C2330d() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public String m17456A() {
        return ResourceModule_BackupApiUrlFactory.m20611a(ApplicationContextModule_ProvideContextFactory.m22898a(this.f14049a));
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public String m17457B() {
        return ResourceModule_DomainNameFactory.m20612a(ApplicationContextModule_ProvideContextFactory.m22898a(this.f14049a));
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public String m17458C() {
        return ResourceModule_ApiUrlFactory.m20610a(ApplicationContextModule_ProvideContextFactory.m22898a(this.f14049a));
    }

    /* renamed from: D */
    private OkHttpClient m17459D() {
        Object obj;
        Object obj2 = this.f14050b;
        if (obj2 instanceof MemoizedSentinel) {
            synchronized (obj2) {
                obj = this.f14050b;
                if (obj instanceof MemoizedSentinel) {
                    obj = AppModule_ProvideOkHttpClientFactory.m20602a();
                    this.f14050b = DoubleCheck.m22904a(this.f14050b, obj);
                }
            }
            obj2 = obj;
        }
        return (OkHttpClient) obj2;
    }

    /* renamed from: E */
    private C2568r1 m17460E() {
        return new C2568r1(m17483t(), m17468M(), m17488y());
    }

    /* renamed from: F */
    private C2574t1 m17461F() {
        return new C2574t1(m17483t(), m17468M(), m17488y());
    }

    /* renamed from: G */
    private SharedPreferences m17462G() {
        Object obj;
        Object obj2 = this.f14052d;
        if (obj2 instanceof MemoizedSentinel) {
            synchronized (obj2) {
                obj = this.f14052d;
                if (obj instanceof MemoizedSentinel) {
                    obj = AppModule_ProvideSharedPreferencesFactory.m20603a(ApplicationContextModule_ProvideContextFactory.m22898a(this.f14049a));
                    this.f14052d = DoubleCheck.m22904a(this.f14052d, obj);
                }
            }
            obj2 = obj;
        }
        return (SharedPreferences) obj2;
    }

    /* renamed from: H */
    private C2580v1 m17463H() {
        C2580v1 v1Var = new C2580v1(m17483t(), m17467L(), m17468M(), m17466K(), m17488y());
        return v1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public SystemPreference m17464I() {
        Object obj;
        Object obj2 = this.f14053e;
        if (obj2 instanceof MemoizedSentinel) {
            synchronized (obj2) {
                obj = this.f14053e;
                if (obj instanceof MemoizedSentinel) {
                    obj = new SystemPreference(m17462G());
                    this.f14053e = DoubleCheck.m22904a(this.f14053e, obj);
                }
            }
            obj2 = obj;
        }
        return (SystemPreference) obj2;
    }

    /* renamed from: J */
    private UpdateDownloadUseCase m17465J() {
        return new UpdateDownloadUseCase(m17483t(), m17488y());
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public UserPreference m17466K() {
        Object obj;
        Object obj2 = this.f14055g;
        if (obj2 instanceof MemoizedSentinel) {
            synchronized (obj2) {
                obj = this.f14055g;
                if (obj instanceof MemoizedSentinel) {
                    obj = new UserPreference(m17462G());
                    this.f14055g = DoubleCheck.m22904a(this.f14055g, obj);
                }
            }
            obj2 = obj;
        }
        return (UserPreference) obj2;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public WebApi m17467L() {
        Object obj;
        Object obj2 = this.f14051c;
        if (obj2 instanceof MemoizedSentinel) {
            synchronized (obj2) {
                obj = this.f14051c;
                if (obj instanceof MemoizedSentinel) {
                    obj = new WebApi(m17459D(), m17456A());
                    this.f14051c = DoubleCheck.m22904a(this.f14051c, obj);
                }
            }
            obj2 = obj;
        }
        return (WebApi) obj2;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public WebDownloadApi m17468M() {
        Object obj;
        Object obj2 = this.f14059k;
        if (obj2 instanceof MemoizedSentinel) {
            synchronized (obj2) {
                obj = this.f14059k;
                if (obj instanceof MemoizedSentinel) {
                    obj = new WebDownloadApi(ApplicationContextModule_ProvideContextFactory.m22898a(this.f14049a), m17459D());
                    this.f14059k = DoubleCheck.m22904a(this.f14059k, obj);
                }
            }
            obj2 = obj;
        }
        return (WebDownloadApi) obj2;
    }

    /* renamed from: q */
    private C2514f1 m17480q() {
        return new C2514f1(m17483t(), m17466K(), m17488y());
    }

    /* renamed from: r */
    public static C2330d m17481r() {
        return new C2330d();
    }

    /* renamed from: s */
    private DBHelper m17482s() {
        Object obj;
        Object obj2 = this.f14057i;
        if (obj2 instanceof MemoizedSentinel) {
            synchronized (obj2) {
                obj = this.f14057i;
                if (obj instanceof MemoizedSentinel) {
                    obj = new DBHelper(ApplicationContextModule_ProvideContextFactory.m22898a(this.f14049a), m17489z());
                    this.f14057i = DoubleCheck.m22904a(this.f14057i, obj);
                }
            }
            obj2 = obj;
        }
        return (DBHelper) obj2;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public DefaultSchedulers m17483t() {
        Object obj;
        Object obj2 = this.f14054f;
        if (obj2 instanceof MemoizedSentinel) {
            synchronized (obj2) {
                obj = this.f14054f;
                if (obj instanceof MemoizedSentinel) {
                    obj = new DefaultSchedulers();
                    this.f14054f = DoubleCheck.m22904a(this.f14054f, obj);
                }
            }
            obj2 = obj;
        }
        return (DefaultSchedulers) obj2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.tv91.u.b.v0] */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.tv91.u.b.v0] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v2, types: [java.lang.Object]
  assigns: [java.lang.Object, com.tv91.u.b.v0]
  uses: [?[OBJECT, ARRAY], com.tv91.u.b.v0]
  mth insns count: 26
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tv91.p213u.p221b.FileDownloadManager m17484u() {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f14060l
            boolean r1 = r0 instanceof p262d.p270b.MemoizedSentinel
            if (r1 == 0) goto L_0x0039
            monitor-enter(r0)
            java.lang.Object r1 = r10.f14060l     // Catch:{ all -> 0x0036 }
            boolean r2 = r1 instanceof p262d.p270b.MemoizedSentinel     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x0033
            com.tv91.u.b.v0 r1 = new com.tv91.u.b.v0     // Catch:{ all -> 0x0036 }
            com.tv91.u.b.x0.m1 r4 = r10.m17487x()     // Catch:{ all -> 0x0036 }
            com.tv91.u.b.x0.f1 r5 = r10.m17480q()     // Catch:{ all -> 0x0036 }
            com.tv91.u.b.x0.v1 r6 = r10.m17463H()     // Catch:{ all -> 0x0036 }
            com.tv91.u.b.x0.r1 r7 = r10.m17460E()     // Catch:{ all -> 0x0036 }
            com.tv91.u.b.x0.t1 r8 = r10.m17461F()     // Catch:{ all -> 0x0036 }
            com.tv91.u.b.x0.w1 r9 = r10.m17465J()     // Catch:{ all -> 0x0036 }
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0036 }
            java.lang.Object r2 = r10.f14060l     // Catch:{ all -> 0x0036 }
            java.lang.Object r2 = p262d.p270b.DoubleCheck.m22904a(r2, r1)     // Catch:{ all -> 0x0036 }
            r10.f14060l = r2     // Catch:{ all -> 0x0036 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            r0 = r1
            goto L_0x0039
        L_0x0036:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r1
        L_0x0039:
            com.tv91.u.b.v0 r0 = (com.tv91.p213u.p221b.FileDownloadManager) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tv91.DaggerApp_HiltComponents_SingletonC.m17484u():com.tv91.u.b.v0");
    }

    /* renamed from: v */
    private GlideImageLoader m17485v() {
        Object obj;
        Object obj2 = this.f14062n;
        if (obj2 instanceof MemoizedSentinel) {
            synchronized (obj2) {
                obj = this.f14062n;
                if (obj instanceof MemoizedSentinel) {
                    obj = new GlideImageLoader(ApplicationContextModule_ProvideContextFactory.m22898a(this.f14049a));
                    this.f14062n = DoubleCheck.m22904a(this.f14062n, obj);
                }
            }
            obj2 = obj;
        }
        return (GlideImageLoader) obj2;
    }

    /* renamed from: w */
    private App m17486w(App app) {
        App_MembersInjector.m17453a(app, m17467L());
        App_MembersInjector.m17455c(app, m17464I());
        App_MembersInjector.m17454b(app, m17484u());
        return app;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public LoadDownloadRecordsUseCase m17487x() {
        return new LoadDownloadRecordsUseCase(m17483t(), m17466K(), m17488y());
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public MovieDatabase m17488y() {
        Object obj;
        Object obj2 = this.f14058j;
        if (obj2 instanceof MemoizedSentinel) {
            synchronized (obj2) {
                obj = this.f14058j;
                if (obj instanceof MemoizedSentinel) {
                    obj = new MovieDatabase(m17482s());
                    this.f14058j = DoubleCheck.m22904a(this.f14058j, obj);
                }
            }
            obj2 = obj;
        }
        return (MovieDatabase) obj2;
    }

    /* renamed from: z */
    private boolean m17489z() {
        Object obj;
        Object obj2 = this.f14056h;
        if (obj2 instanceof MemoizedSentinel) {
            synchronized (obj2) {
                obj = this.f14056h;
                if (obj instanceof MemoizedSentinel) {
                    obj = Boolean.valueOf(AppModule.m20599a());
                    this.f14056h = DoubleCheck.m22904a(this.f14056h, obj);
                }
            }
            obj2 = obj;
        }
        return ((Boolean) obj2).booleanValue();
    }

    /* renamed from: a */
    public Animation mo16914a() {
        return ResourceModule_ProvideShakeAnimationFactory.m20613a(ApplicationContextModule_ProvideContextFactory.m22898a(this.f14049a));
    }

    /* renamed from: b */
    public void mo16472b(App app) {
        m17486w(app);
    }

    /* renamed from: c */
    public NavigatorProvider mo16915c() {
        Object obj;
        Object obj2 = this.f14061m;
        if (obj2 instanceof MemoizedSentinel) {
            synchronized (obj2) {
                obj = this.f14061m;
                if (obj instanceof MemoizedSentinel) {
                    obj = new NavigatorProvider();
                    this.f14061m = DoubleCheck.m22904a(this.f14061m, obj);
                }
            }
            obj2 = obj;
        }
        return (NavigatorProvider) obj2;
    }

    /* renamed from: d */
    public C3066f mo16916d() {
        return m17485v();
    }

    /* renamed from: e */
    public ActivityRetainedComponentBuilder mo16917e() {
        return new C2324b();
    }

    private DaggerApp_HiltComponents_SingletonC(ApplicationContextModule aVar) {
        this.f14050b = new MemoizedSentinel();
        this.f14051c = new MemoizedSentinel();
        this.f14052d = new MemoizedSentinel();
        this.f14053e = new MemoizedSentinel();
        this.f14054f = new MemoizedSentinel();
        this.f14055g = new MemoizedSentinel();
        this.f14056h = new MemoizedSentinel();
        this.f14057i = new MemoizedSentinel();
        this.f14058j = new MemoizedSentinel();
        this.f14059k = new MemoizedSentinel();
        this.f14060l = new MemoizedSentinel();
        this.f14061m = new MemoizedSentinel();
        this.f14062n = new MemoizedSentinel();
        this.f14049a = aVar;
    }
}
