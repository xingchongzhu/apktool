package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMLogUtils;

/* renamed from: com.umeng.analytics.pro.i */
public class UMLogAnalytics {

    /* renamed from: A */
    public static final String f17059A = "MobclickAgent.setSecret方法参数secretkey不能为null，也不能为空字符串。|secretkey参数必须是非空 字符串。";

    /* renamed from: B */
    public static final String f17060B = "统计SDK常见问题索引贴 详见链接 http://developer.umeng.com/docs/66650/cate/66650";

    /* renamed from: C */
    public static final String f17061C;

    /* renamed from: D */
    public static final String f17062D;

    /* renamed from: E */
    public static final String f17063E;

    /* renamed from: F */
    public static final String f17064F;

    /* renamed from: G */
    public static final String f17065G;

    /* renamed from: H */
    public static final String f17066H = "检测到进入页面生命周期时尚未完成SDK初始化，请检查是否未在Application.onCreate函数中执行SDK初始化函数。";

    /* renamed from: I */
    public static final String f17067I;

    /* renamed from: J */
    public static final String f17068J;

    /* renamed from: K */
    public static final String f17069K;

    /* renamed from: L */
    public static final String f17070L;

    /* renamed from: M */
    public static final String f17071M;

    /* renamed from: N */
    public static final String f17072N = "MobclickAgent.onDeepLinkReceived方法Context参数不能为null。|参数Context需要指定ApplicationContext值。";

    /* renamed from: O */
    public static final String f17073O = "MobclickAgent.onDeepLinkReceived方法link参数不能为null，也不能为空字符串。|参数link必须为非空字符串。";

    /* renamed from: P */
    public static final String f17074P = "MobclickAgent.onDeepLinkReceived方法link参数长度超过限制。|参数link长度不能超过1024字符。";

    /* renamed from: Q */
    public static final String f17075Q;

    /* renamed from: R */
    public static final String f17076R;

    /* renamed from: S */
    public static final String f17077S;

    /* renamed from: T */
    public static final String f17078T;

    /* renamed from: U */
    public static final String f17079U;

    /* renamed from: V */
    public static final String f17080V;

    /* renamed from: W */
    public static final String f17081W;

    /* renamed from: X */
    public static final String f17082X;

    /* renamed from: Y */
    public static final String f17083Y;

    /* renamed from: Z */
    public static final String f17084Z;

    /* renamed from: a */
    public static final String f17085a;

    /* renamed from: aa */
    public static final String f17086aa;

    /* renamed from: ab */
    public static final String f17087ab;

    /* renamed from: ac */
    public static final String f17088ac;

    /* renamed from: ad */
    public static final String f17089ad;

    /* renamed from: ae */
    public static final String f17090ae;

    /* renamed from: af */
    public static final String f17091af;

    /* renamed from: ag */
    public static final String f17092ag;

    /* renamed from: ah */
    public static final String f17093ah;

    /* renamed from: ai */
    public static final String f17094ai;

    /* renamed from: aj */
    public static final String f17095aj;

    /* renamed from: ak */
    public static final String f17096ak;

    /* renamed from: al */
    public static final String f17097al;

    /* renamed from: am */
    public static final String f17098am;

    /* renamed from: an */
    public static final String f17099an;

    /* renamed from: ao */
    public static final String f17100ao;

    /* renamed from: ap */
    public static final String f17101ap;

    /* renamed from: aq */
    public static final String f17102aq;

    /* renamed from: ar */
    public static final String f17103ar = "请在Application.onCreate函数中使用UMConfigure.preInit函数初始化友盟sdk";

    /* renamed from: b */
    public static final String f17104b;

    /* renamed from: c */
    public static final String f17105c;

    /* renamed from: d */
    public static final String f17106d;

    /* renamed from: e */
    public static final String f17107e;

    /* renamed from: f */
    public static final String f17108f;

    /* renamed from: g */
    public static final String f17109g;

    /* renamed from: h */
    public static final String f17110h;

    /* renamed from: i */
    public static final String f17111i;

    /* renamed from: j */
    public static final String f17112j;

    /* renamed from: k */
    public static final String f17113k;

    /* renamed from: l */
    public static final String f17114l;

    /* renamed from: m */
    public static final String f17115m;

    /* renamed from: n */
    public static final String f17116n;

    /* renamed from: o */
    public static final String f17117o;

    /* renamed from: p */
    public static final String f17118p;

    /* renamed from: q */
    public static final String f17119q;

    /* renamed from: r */
    public static final String f17120r;

    /* renamed from: s */
    public static final String f17121s;

    /* renamed from: t */
    public static final String f17122t;

    /* renamed from: u */
    public static final String f17123u;

    /* renamed from: v */
    public static final String f17124v;

    /* renamed from: w */
    public static final String f17125w;

    /* renamed from: x */
    public static final String f17126x;

    /* renamed from: y */
    public static final String f17127y;

    /* renamed from: z */
    public static final String f17128z = "MobclickAgent.setSecret方法参数context不能为null|参数Context需要指定ApplicationContext值。";

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("事件属性集合参数为空|onEvent接口必须传入非空的属性集合。详见问题链接 ");
        String str = "66946";
        sb.append(UMLogUtils.makeUrl(str));
        f17085a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        String str2 = "事件ID和保留字冲突|onEvent接口传入的事件ID不能和保留字冲突。详见问题链接 ";
        sb2.append(str2);
        sb2.append(UMLogUtils.makeUrl(str));
        f17104b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("事件ID为null或者为空字符串|onEvent接口传入的事件ID不能为null，也不能为空字符串。详见问题链接 ");
        sb3.append(UMLogUtils.makeUrl(str));
        f17105c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("事件属性集合map没有加入K-V值|事件属性集合参数map必须添加K-V值。详见问题链接 ");
        sb4.append(UMLogUtils.makeUrl(str));
        f17106d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("事件属性集合map中key值和保留字冲突|事件属性集合map中key值不能和保留字冲突。详见问题链接 ");
        sb5.append(UMLogUtils.makeUrl(str));
        f17107e = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append("事件ID为null或者长度超过限制|事件ID不能为null、空串，且长度不能超过128个字符。详见问题链接 ");
        sb6.append(UMLogUtils.makeUrl(str));
        f17108f = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append("事件属性集合参数为空或者事件属性集合map没有加入K-V值|事件属性集合参数map必须添加K-V值。详见问题链接 ");
        sb7.append(UMLogUtils.makeUrl(str));
        f17109g = sb7.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append("事件属性集合map中key非法|事件属性集合参数map中key不能为非法的。详见问题链接 ");
        sb8.append(UMLogUtils.makeUrl(str));
        f17110h = sb8.toString();
        StringBuilder sb9 = new StringBuilder();
        sb9.append("事件属性集合map中value为null|事件属性集合参数map中value不能为null。详见问题链接 ");
        sb9.append(UMLogUtils.makeUrl(str));
        f17111i = sb9.toString();
        StringBuilder sb10 = new StringBuilder();
        sb10.append("事件属性集合map中value长度超过限制|事件属性集合参数map中value如果为字符串时，其长度不能超过256个字符。详见问题链接 ");
        sb10.append(UMLogUtils.makeUrl(str));
        f17112j = sb10.toString();
        StringBuilder sb11 = new StringBuilder();
        sb11.append("事件标签为null或者为空字符串|onEvent接口传入的事件标签不能为null，也不能为空字符串。详见问题链接 ");
        sb11.append(UMLogUtils.makeUrl(str));
        f17113k = sb11.toString();
        StringBuilder sb12 = new StringBuilder();
        sb12.append("事件ID为null或者长度超过限制，或事件标签长度超过限制|事件ID不能为null、空串，且长度不能超过128个字符。事件标签长度不能超过256个字符。详见问题链接 ");
        sb12.append(UMLogUtils.makeUrl(str));
        f17114l = sb12.toString();
        StringBuilder sb13 = new StringBuilder();
        sb13.append(str2);
        sb13.append(UMLogUtils.makeUrl(str));
        f17115m = sb13.toString();
        StringBuilder sb14 = new StringBuilder();
        sb14.append("MobclickAgent.onResume接口参数不能为null|MobclickAgent.onResume接口参数应该传入当前Activity的上下文。详见问题链接 ");
        String str3 = "66948";
        sb14.append(UMLogUtils.makeUrl(str3));
        f17116n = sb14.toString();
        StringBuilder sb15 = new StringBuilder();
        sb15.append("MobclickAgent.onResume接口参数不是Activity的上下文|MobclickAgent.onResume接口参数应该传入当前Activity的上下文。详见问题链接 ");
        sb15.append(UMLogUtils.makeUrl(str3));
        f17117o = sb15.toString();
        StringBuilder sb16 = new StringBuilder();
        sb16.append("MobclickAgent.onPause接口参数不能为null|MobclickAgent.onPause接口参数应该传入当前Activity的上下文。详见问题链接 ");
        sb16.append(UMLogUtils.makeUrl(str3));
        f17118p = sb16.toString();
        StringBuilder sb17 = new StringBuilder();
        sb17.append("MobclickAgent.onPause接口参数不是Activity的上下文|MobclickAgent.onPause接口参数应该传入当前Activity的上下文。详见问题链接 ");
        sb17.append(UMLogUtils.makeUrl(str3));
        f17119q = sb17.toString();
        StringBuilder sb18 = new StringBuilder();
        sb18.append("@ 遗漏了Mobclick.onResume函数调用|每个Activity的onResume中都必须调用MobclickAgent.onResume。详见问题链接 ");
        sb18.append(UMLogUtils.makeUrl(str3));
        f17120r = sb18.toString();
        StringBuilder sb19 = new StringBuilder();
        sb19.append("@ 遗漏了Mobclick.onPaused函数调用|每个Activity的onPaused中都必须调用MobclickAgent.onPaused。详见问题链接 ");
        sb19.append(UMLogUtils.makeUrl(str3));
        f17121s = sb19.toString();
        StringBuilder sb20 = new StringBuilder();
        sb20.append("MobclickAgent.onProfileSignIn接口参数 账号ID 不能为null|账号ID不能为空。详见问题链接 ");
        String str4 = "66951";
        sb20.append(UMLogUtils.makeUrl(str4));
        f17122t = sb20.toString();
        StringBuilder sb21 = new StringBuilder();
        sb21.append("MobclickAgent.onProfileSignIn接口参数 账号ID 长度超过限制|账号ID 长度不能超过64个字符。详见问题链接 ");
        sb21.append(UMLogUtils.makeUrl(str4));
        f17123u = sb21.toString();
        StringBuilder sb22 = new StringBuilder();
        sb22.append("MobclickAgent.onProfileSignIn接口参数 账号来源 长度超过限制|账号来源 长度不能超过32个字符。详见问题链接 ");
        sb22.append(UMLogUtils.makeUrl(str4));
        f17124v = sb22.toString();
        StringBuilder sb23 = new StringBuilder();
        sb23.append("MobclickAgent.reportError方法参数context不能为null|参数Context需要指定ApplicationContext值。详见问题链接 ");
        String str5 = "66971";
        sb23.append(UMLogUtils.makeUrl(str5));
        f17125w = sb23.toString();
        StringBuilder sb24 = new StringBuilder();
        sb24.append("MobclickAgent.reportError方法参数error不能为null，也不能为空字符串。|error参数必须是非空字符串。详见问题链接 ");
        sb24.append(UMLogUtils.makeUrl(str5));
        f17126x = sb24.toString();
        StringBuilder sb25 = new StringBuilder();
        sb25.append("MobclickAgent.reportError方法 Context和Throwable参数都不能为空。|参数Context需要指定ApplicationContext值，Throwable参数传入捕获到的异常对象。详见问题链接 ");
        sb25.append(UMLogUtils.makeUrl(str5));
        f17127y = sb25.toString();
        StringBuilder sb26 = new StringBuilder();
        sb26.append("MobclickAgent.onPageStart方法参数不能为null，也不能为空字符串。|参数viewName必须为非空字符串。详见链接 ");
        String str6 = "66975";
        sb26.append(UMLogUtils.makeUrl(str6));
        f17061C = sb26.toString();
        StringBuilder sb27 = new StringBuilder();
        sb27.append("MobclickAgent.onPageEnd方法参数不能为null，也不能为空字符串。|参数viewName必须为非空 字符串。详见链接 ");
        sb27.append(UMLogUtils.makeUrl(str6));
        f17062D = sb27.toString();
        StringBuilder sb28 = new StringBuilder();
        sb28.append("对于页面@，onPageStart和onPageEnd调用对的参数不一致。|对于同一个页面，请先调用onPageStart，再调用onPageEnd。详见链接 ");
        sb28.append(UMLogUtils.makeUrl(str6));
        f17063E = sb28.toString();
        StringBuilder sb29 = new StringBuilder();
        sb29.append("对于页面@，请确保先依序成对调用onPageStart，onPageEnd接口，再调用onPageStart接口对其它页面进行统计。|对于任意一个页面，必须依序成对调用onPageStart以及onPageEnd，不能有遗漏。详见链接 ");
        sb29.append(UMLogUtils.makeUrl(str6));
        f17064F = sb29.toString();
        StringBuilder sb30 = new StringBuilder();
        sb30.append("对于页面@，请检查是否遗漏onPageStart接口调用。|对于任意一个页面，必须依序成对调用onPageStart以及onPageEnd，不能有遗漏。详见链接 ");
        sb30.append(UMLogUtils.makeUrl(str6));
        f17065G = sb30.toString();
        StringBuilder sb31 = new StringBuilder();
        sb31.append("当前发送策略为：启动时发送。详见链接 ");
        String str7 = "66976";
        sb31.append(UMLogUtils.makeUrl(str7));
        f17067I = sb31.toString();
        StringBuilder sb32 = new StringBuilder();
        sb32.append("当前发送策略为: 间隔发送。间隔时间为：@秒。详见链接 ");
        sb32.append(UMLogUtils.makeUrl(str7));
        f17068J = sb32.toString();
        StringBuilder sb33 = new StringBuilder();
        sb33.append("当前发送策略为: 集成测试。但是SDK未切换到调试模式，所以后台设置未生效。|如想切换到集成测试发送策略，请调用UMConfigure.setLogEnabled(true)将SDK切换到调试模式。详见链接 ");
        sb33.append(UMLogUtils.makeUrl(str7));
        f17069K = sb33.toString();
        StringBuilder sb34 = new StringBuilder();
        sb34.append("当前发送策略为：集成测试。详见链接 ");
        sb34.append(UMLogUtils.makeUrl(str7));
        f17070L = sb34.toString();
        StringBuilder sb35 = new StringBuilder();
        sb35.append("当前发送策略为: 准实时发送。间隔时间为：@秒。详见链接 ");
        sb35.append(UMLogUtils.makeUrl(str7));
        f17071M = sb35.toString();
        StringBuilder sb36 = new StringBuilder();
        sb36.append("发送数据时发生java.net.UnknownHostException异常|友盟后端对设备端证书验证失败。请确保设备端没有运行抓包代理类程序。详见链接 ");
        String str8 = "66978";
        sb36.append(UMLogUtils.makeUrl(str8));
        f17075Q = sb36.toString();
        StringBuilder sb37 = new StringBuilder();
        sb37.append("发送数据时发生javax.net.sslHandshakeException异常|导致友盟后端域名解析失败。请检查系统DNS服务器配置是否正确。详见链接 ");
        sb37.append(UMLogUtils.makeUrl(str8));
        f17076R = sb37.toString();
        StringBuilder sb38 = new StringBuilder();
        sb38.append("track接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：");
        String str9 = "67310";
        sb38.append(UMLogUtils.makeUrl(str9));
        f17077S = sb38.toString();
        StringBuilder sb39 = new StringBuilder();
        sb39.append("registerSuperProperty接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：");
        sb39.append(UMLogUtils.makeUrl(str9));
        f17078T = sb39.toString();
        StringBuilder sb40 = new StringBuilder();
        sb40.append("unregisterSuperProperty接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：");
        sb40.append(UMLogUtils.makeUrl(str9));
        f17079U = sb40.toString();
        StringBuilder sb41 = new StringBuilder();
        sb41.append("getSuperProperty接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接: ");
        sb41.append(UMLogUtils.makeUrl(str9));
        f17080V = sb41.toString();
        StringBuilder sb42 = new StringBuilder();
        sb42.append("getSuperProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：");
        sb42.append(UMLogUtils.makeUrl(str9));
        f17081W = sb42.toString();
        StringBuilder sb43 = new StringBuilder();
        sb43.append("clearSuperProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：");
        sb43.append(UMLogUtils.makeUrl(str9));
        f17082X = sb43.toString();
        StringBuilder sb44 = new StringBuilder();
        sb44.append("setFirstLaunchEvent接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：");
        sb44.append(UMLogUtils.makeUrl(str9));
        f17083Y = sb44.toString();
        StringBuilder sb45 = new StringBuilder();
        sb45.append("registerPreProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：");
        sb45.append(UMLogUtils.makeUrl(str9));
        f17084Z = sb45.toString();
        StringBuilder sb46 = new StringBuilder();
        sb46.append("unregisterPreProperty接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：");
        sb46.append(UMLogUtils.makeUrl(str9));
        f17086aa = sb46.toString();
        StringBuilder sb47 = new StringBuilder();
        sb47.append("clearPreProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：");
        sb47.append(UMLogUtils.makeUrl(str9));
        f17087ab = sb47.toString();
        StringBuilder sb48 = new StringBuilder();
        sb48.append("getPreProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：");
        sb48.append(UMLogUtils.makeUrl(str9));
        f17088ac = sb48.toString();
        StringBuilder sb49 = new StringBuilder();
        sb49.append("eventName为空，请检查|eventName参数不能为空，详见问题连接：");
        String str10 = "67311";
        sb49.append(UMLogUtils.makeUrl(str10));
        f17089ad = sb49.toString();
        StringBuilder sb50 = new StringBuilder();
        sb50.append("请注意：map为空|track接口的参数说明，详见问题连接：");
        sb50.append(UMLogUtils.makeUrl(str10));
        f17090ae = sb50.toString();
        StringBuilder sb51 = new StringBuilder();
        sb51.append("context参数为空｜context参数不能为空，详见问题连接：");
        String str11 = "67312";
        sb51.append(UMLogUtils.makeUrl(str11));
        f17091af = sb51.toString();
        StringBuilder sb52 = new StringBuilder();
        sb52.append("propertyName参数或propertyValue参数为空｜propertyName、propertyValue参数不能为空，详见问题连接：");
        sb52.append(UMLogUtils.makeUrl(str11));
        f17092ag = sb52.toString();
        StringBuilder sb53 = new StringBuilder();
        String str12 = "context参数为空|context参数不能为空，详见问题连接：";
        sb53.append(str12);
        sb53.append(UMLogUtils.makeUrl("67313"));
        f17093ah = sb53.toString();
        StringBuilder sb54 = new StringBuilder();
        sb54.append(str12);
        sb54.append(UMLogUtils.makeUrl("67316"));
        f17094ai = sb54.toString();
        StringBuilder sb55 = new StringBuilder();
        sb55.append(str12);
        String str13 = "67318";
        sb55.append(UMLogUtils.makeUrl(str13));
        f17095aj = sb55.toString();
        StringBuilder sb56 = new StringBuilder();
        sb56.append("trackID参数为空|trackID参数不能为空，详见问题连接：");
        sb56.append(UMLogUtils.makeUrl(str13));
        f17096ak = sb56.toString();
        StringBuilder sb57 = new StringBuilder();
        sb57.append(str12);
        String str14 = "67319";
        sb57.append(UMLogUtils.makeUrl(str14));
        f17097al = sb57.toString();
        StringBuilder sb58 = new StringBuilder();
        sb58.append("propertics参数为空|propertics参数不能为空，详见问题连接：");
        sb58.append(UMLogUtils.makeUrl(str14));
        f17098am = sb58.toString();
        StringBuilder sb59 = new StringBuilder();
        sb59.append(str12);
        String str15 = "67320";
        sb59.append(UMLogUtils.makeUrl(str15));
        f17099an = sb59.toString();
        StringBuilder sb60 = new StringBuilder();
        sb60.append("未匹配到您传入的property参数|property参数不能匹配，");
        sb60.append(UMLogUtils.makeUrl(str15));
        f17100ao = sb60.toString();
        StringBuilder sb61 = new StringBuilder();
        sb61.append(str12);
        sb61.append(UMLogUtils.makeUrl("67321"));
        f17101ap = sb61.toString();
        StringBuilder sb62 = new StringBuilder();
        sb62.append(str12);
        sb62.append(UMLogUtils.makeUrl("67322"));
        f17102aq = sb62.toString();
    }
}
