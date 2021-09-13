package p067c.p068a.p069a.p070a.p111m2;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.Display.Mode;
import android.view.WindowManager;
import com.google.android.exoplayer2.upstream.C1916m;
import com.p259uc.crashsdk.export.LogType;
import com.umeng.analytics.pro.UMCommonContent;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p134b.p135a.Charsets;

/* renamed from: c.a.a.a.m2.m0 */
public final class Util {

    /* renamed from: a */
    public static final int f8398a;

    /* renamed from: b */
    public static final String f8399b;

    /* renamed from: c */
    public static final String f8400c;

    /* renamed from: d */
    public static final String f8401d;

    /* renamed from: e */
    public static final String f8402e;

    /* renamed from: f */
    public static final byte[] f8403f = new byte[0];

    /* renamed from: g */
    private static final Pattern f8404g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: h */
    private static final Pattern f8405h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: i */
    private static final Pattern f8406i = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: j */
    private static final Pattern f8407j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");

    /* renamed from: k */
    private static HashMap<String, String> f8408k;

    /* renamed from: l */
    private static final String[] f8409l = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", UMCommonContent.f16607ae, "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: m */
    private static final String[] f8410m = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: n */
    private static final int[] f8411n;

    /* renamed from: o */
    private static final int[] f8412o;

    static {
        String str = VERSION.CODENAME;
        int i = "S".equals(str) ? 31 : "R".equals(str) ? 30 : VERSION.SDK_INT;
        f8398a = i;
        String str2 = Build.DEVICE;
        f8399b = str2;
        String str3 = Build.MANUFACTURER;
        f8400c = str3;
        String str4 = Build.MODEL;
        f8401d = str4;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        String str5 = ", ";
        sb.append(str5);
        sb.append(str4);
        sb.append(str5);
        sb.append(str3);
        sb.append(str5);
        sb.append(i);
        f8402e = sb.toString();
        int[] iArr = new int[LogType.UNEXP];
        // fill-array-data instruction
        iArr[0] = 0;
        iArr[1] = 79764919;
        iArr[2] = 159529838;
        iArr[3] = 222504665;
        iArr[4] = 319059676;
        iArr[5] = 398814059;
        iArr[6] = 445009330;
        iArr[7] = 507990021;
        iArr[8] = 638119352;
        iArr[9] = 583659535;
        iArr[10] = 797628118;
        iArr[11] = 726387553;
        iArr[12] = 890018660;
        iArr[13] = 835552979;
        iArr[14] = 1015980042;
        iArr[15] = 944750013;
        iArr[16] = 1276238704;
        iArr[17] = 1221641927;
        iArr[18] = 1167319070;
        iArr[19] = 1095957929;
        iArr[20] = 1595256236;
        iArr[21] = 1540665371;
        iArr[22] = 1452775106;
        iArr[23] = 1381403509;
        iArr[24] = 1780037320;
        iArr[25] = 1859660671;
        iArr[26] = 1671105958;
        iArr[27] = 1733955601;
        iArr[28] = 2031960084;
        iArr[29] = 2111593891;
        iArr[30] = 1889500026;
        iArr[31] = 1952343757;
        iArr[32] = -1742489888;
        iArr[33] = -1662866601;
        iArr[34] = -1851683442;
        iArr[35] = -1788833735;
        iArr[36] = -1960329156;
        iArr[37] = -1880695413;
        iArr[38] = -2103051438;
        iArr[39] = -2040207643;
        iArr[40] = -1104454824;
        iArr[41] = -1159051537;
        iArr[42] = -1213636554;
        iArr[43] = -1284997759;
        iArr[44] = -1389417084;
        iArr[45] = -1444007885;
        iArr[46] = -1532160278;
        iArr[47] = -1603531939;
        iArr[48] = -734892656;
        iArr[49] = -789352409;
        iArr[50] = -575645954;
        iArr[51] = -646886583;
        iArr[52] = -952755380;
        iArr[53] = -1007220997;
        iArr[54] = -827056094;
        iArr[55] = -898286187;
        iArr[56] = -231047128;
        iArr[57] = -151282273;
        iArr[58] = -71779514;
        iArr[59] = -8804623;
        iArr[60] = -515967244;
        iArr[61] = -436212925;
        iArr[62] = -390279782;
        iArr[63] = -327299027;
        iArr[64] = 881225847;
        iArr[65] = 809987520;
        iArr[66] = 1023691545;
        iArr[67] = 969234094;
        iArr[68] = 662832811;
        iArr[69] = 591600412;
        iArr[70] = 771767749;
        iArr[71] = 717299826;
        iArr[72] = 311336399;
        iArr[73] = 374308984;
        iArr[74] = 453813921;
        iArr[75] = 533576470;
        iArr[76] = 25881363;
        iArr[77] = 88864420;
        iArr[78] = 134795389;
        iArr[79] = 214552010;
        iArr[80] = 2023205639;
        iArr[81] = 2086057648;
        iArr[82] = 1897238633;
        iArr[83] = 1976864222;
        iArr[84] = 1804852699;
        iArr[85] = 1867694188;
        iArr[86] = 1645340341;
        iArr[87] = 1724971778;
        iArr[88] = 1587496639;
        iArr[89] = 1516133128;
        iArr[90] = 1461550545;
        iArr[91] = 1406951526;
        iArr[92] = 1302016099;
        iArr[93] = 1230646740;
        iArr[94] = 1142491917;
        iArr[95] = 1087903418;
        iArr[96] = -1398421865;
        iArr[97] = -1469785312;
        iArr[98] = -1524105735;
        iArr[99] = -1578704818;
        iArr[100] = -1079922613;
        iArr[101] = -1151291908;
        iArr[102] = -1239184603;
        iArr[103] = -1293773166;
        iArr[104] = -1968362705;
        iArr[105] = -1905510760;
        iArr[106] = -2094067647;
        iArr[107] = -2014441994;
        iArr[108] = -1716953613;
        iArr[109] = -1654112188;
        iArr[110] = -1876203875;
        iArr[111] = -1796572374;
        iArr[112] = -525066777;
        iArr[113] = -462094256;
        iArr[114] = -382327159;
        iArr[115] = -302564546;
        iArr[116] = -206542021;
        iArr[117] = -143559028;
        iArr[118] = -97365931;
        iArr[119] = -17609246;
        iArr[120] = -960696225;
        iArr[121] = -1031934488;
        iArr[122] = -817968335;
        iArr[123] = -872425850;
        iArr[124] = -709327229;
        iArr[125] = -780559564;
        iArr[126] = -600130067;
        iArr[127] = -654598054;
        iArr[128] = 1762451694;
        iArr[129] = 1842216281;
        iArr[130] = 1619975040;
        iArr[131] = 1682949687;
        iArr[132] = 2047383090;
        iArr[133] = 2127137669;
        iArr[134] = 1938468188;
        iArr[135] = 2001449195;
        iArr[136] = 1325665622;
        iArr[137] = 1271206113;
        iArr[138] = 1183200824;
        iArr[139] = 1111960463;
        iArr[140] = 1543535498;
        iArr[141] = 1489069629;
        iArr[142] = 1434599652;
        iArr[143] = 1363369299;
        iArr[144] = 622672798;
        iArr[145] = 568075817;
        iArr[146] = 748617968;
        iArr[147] = 677256519;
        iArr[148] = 907627842;
        iArr[149] = 853037301;
        iArr[150] = 1067152940;
        iArr[151] = 995781531;
        iArr[152] = 51762726;
        iArr[153] = 131386257;
        iArr[154] = 177728840;
        iArr[155] = 240578815;
        iArr[156] = 269590778;
        iArr[157] = 349224269;
        iArr[158] = 429104020;
        iArr[159] = 491947555;
        iArr[160] = -248556018;
        iArr[161] = -168932423;
        iArr[162] = -122852000;
        iArr[163] = -60002089;
        iArr[164] = -500490030;
        iArr[165] = -420856475;
        iArr[166] = -341238852;
        iArr[167] = -278395381;
        iArr[168] = -685261898;
        iArr[169] = -739858943;
        iArr[170] = -559578920;
        iArr[171] = -630940305;
        iArr[172] = -1004286614;
        iArr[173] = -1058877219;
        iArr[174] = -845023740;
        iArr[175] = -916395085;
        iArr[176] = -1119974018;
        iArr[177] = -1174433591;
        iArr[178] = -1262701040;
        iArr[179] = -1333941337;
        iArr[180] = -1371866206;
        iArr[181] = -1426332139;
        iArr[182] = -1481064244;
        iArr[183] = -1552294533;
        iArr[184] = -1690935098;
        iArr[185] = -1611170447;
        iArr[186] = -1833673816;
        iArr[187] = -1770699233;
        iArr[188] = -2009983462;
        iArr[189] = -1930228819;
        iArr[190] = -2119160460;
        iArr[191] = -2056179517;
        iArr[192] = 1569362073;
        iArr[193] = 1498123566;
        iArr[194] = 1409854455;
        iArr[195] = 1355396672;
        iArr[196] = 1317987909;
        iArr[197] = 1246755826;
        iArr[198] = 1192025387;
        iArr[199] = 1137557660;
        iArr[200] = 2072149281;
        iArr[201] = 2135122070;
        iArr[202] = 1912620623;
        iArr[203] = 1992383480;
        iArr[204] = 1753615357;
        iArr[205] = 1816598090;
        iArr[206] = 1627664531;
        iArr[207] = 1707420964;
        iArr[208] = 295390185;
        iArr[209] = 358241886;
        iArr[210] = 404320391;
        iArr[211] = 483945776;
        iArr[212] = 43990325;
        iArr[213] = 106832002;
        iArr[214] = 186451547;
        iArr[215] = 266083308;
        iArr[216] = 932423249;
        iArr[217] = 861060070;
        iArr[218] = 1041341759;
        iArr[219] = 986742920;
        iArr[220] = 613929101;
        iArr[221] = 542559546;
        iArr[222] = 756411363;
        iArr[223] = 701822548;
        iArr[224] = -978770311;
        iArr[225] = -1050133554;
        iArr[226] = -869589737;
        iArr[227] = -924188512;
        iArr[228] = -693284699;
        iArr[229] = -764654318;
        iArr[230] = -550540341;
        iArr[231] = -605129092;
        iArr[232] = -475935807;
        iArr[233] = -413084042;
        iArr[234] = -366743377;
        iArr[235] = -287118056;
        iArr[236] = -257573603;
        iArr[237] = -194731862;
        iArr[238] = -114850189;
        iArr[239] = -35218492;
        iArr[240] = -1984365303;
        iArr[241] = -1921392450;
        iArr[242] = -2143631769;
        iArr[243] = -2063868976;
        iArr[244] = -1698919467;
        iArr[245] = -1635936670;
        iArr[246] = -1824608069;
        iArr[247] = -1744851700;
        iArr[248] = -1347415887;
        iArr[249] = -1418654458;
        iArr[250] = -1506661409;
        iArr[251] = -1561119128;
        iArr[252] = -1129027987;
        iArr[253] = -1200260134;
        iArr[254] = -1254728445;
        iArr[255] = -1309196108;
        f8411n = iArr;
        int[] iArr2 = new int[LogType.UNEXP];
        // fill-array-data instruction
        iArr2[0] = 0;
        iArr2[1] = 7;
        iArr2[2] = 14;
        iArr2[3] = 9;
        iArr2[4] = 28;
        iArr2[5] = 27;
        iArr2[6] = 18;
        iArr2[7] = 21;
        iArr2[8] = 56;
        iArr2[9] = 63;
        iArr2[10] = 54;
        iArr2[11] = 49;
        iArr2[12] = 36;
        iArr2[13] = 35;
        iArr2[14] = 42;
        iArr2[15] = 45;
        iArr2[16] = 112;
        iArr2[17] = 119;
        iArr2[18] = 126;
        iArr2[19] = 121;
        iArr2[20] = 108;
        iArr2[21] = 107;
        iArr2[22] = 98;
        iArr2[23] = 101;
        iArr2[24] = 72;
        iArr2[25] = 79;
        iArr2[26] = 70;
        iArr2[27] = 65;
        iArr2[28] = 84;
        iArr2[29] = 83;
        iArr2[30] = 90;
        iArr2[31] = 93;
        iArr2[32] = 224;
        iArr2[33] = 231;
        iArr2[34] = 238;
        iArr2[35] = 233;
        iArr2[36] = 252;
        iArr2[37] = 251;
        iArr2[38] = 242;
        iArr2[39] = 245;
        iArr2[40] = 216;
        iArr2[41] = 223;
        iArr2[42] = 214;
        iArr2[43] = 209;
        iArr2[44] = 196;
        iArr2[45] = 195;
        iArr2[46] = 202;
        iArr2[47] = 205;
        iArr2[48] = 144;
        iArr2[49] = 151;
        iArr2[50] = 158;
        iArr2[51] = 153;
        iArr2[52] = 140;
        iArr2[53] = 139;
        iArr2[54] = 130;
        iArr2[55] = 133;
        iArr2[56] = 168;
        iArr2[57] = 175;
        iArr2[58] = 166;
        iArr2[59] = 161;
        iArr2[60] = 180;
        iArr2[61] = 179;
        iArr2[62] = 186;
        iArr2[63] = 189;
        iArr2[64] = 199;
        iArr2[65] = 192;
        iArr2[66] = 201;
        iArr2[67] = 206;
        iArr2[68] = 219;
        iArr2[69] = 220;
        iArr2[70] = 213;
        iArr2[71] = 210;
        iArr2[72] = 255;
        iArr2[73] = 248;
        iArr2[74] = 241;
        iArr2[75] = 246;
        iArr2[76] = 227;
        iArr2[77] = 228;
        iArr2[78] = 237;
        iArr2[79] = 234;
        iArr2[80] = 183;
        iArr2[81] = 176;
        iArr2[82] = 185;
        iArr2[83] = 190;
        iArr2[84] = 171;
        iArr2[85] = 172;
        iArr2[86] = 165;
        iArr2[87] = 162;
        iArr2[88] = 143;
        iArr2[89] = 136;
        iArr2[90] = 129;
        iArr2[91] = 134;
        iArr2[92] = 147;
        iArr2[93] = 148;
        iArr2[94] = 157;
        iArr2[95] = 154;
        iArr2[96] = 39;
        iArr2[97] = 32;
        iArr2[98] = 41;
        iArr2[99] = 46;
        iArr2[100] = 59;
        iArr2[101] = 60;
        iArr2[102] = 53;
        iArr2[103] = 50;
        iArr2[104] = 31;
        iArr2[105] = 24;
        iArr2[106] = 17;
        iArr2[107] = 22;
        iArr2[108] = 3;
        iArr2[109] = 4;
        iArr2[110] = 13;
        iArr2[111] = 10;
        iArr2[112] = 87;
        iArr2[113] = 80;
        iArr2[114] = 89;
        iArr2[115] = 94;
        iArr2[116] = 75;
        iArr2[117] = 76;
        iArr2[118] = 69;
        iArr2[119] = 66;
        iArr2[120] = 111;
        iArr2[121] = 104;
        iArr2[122] = 97;
        iArr2[123] = 102;
        iArr2[124] = 115;
        iArr2[125] = 116;
        iArr2[126] = 125;
        iArr2[127] = 122;
        iArr2[128] = 137;
        iArr2[129] = 142;
        iArr2[130] = 135;
        iArr2[131] = 128;
        iArr2[132] = 149;
        iArr2[133] = 146;
        iArr2[134] = 155;
        iArr2[135] = 156;
        iArr2[136] = 177;
        iArr2[137] = 182;
        iArr2[138] = 191;
        iArr2[139] = 184;
        iArr2[140] = 173;
        iArr2[141] = 170;
        iArr2[142] = 163;
        iArr2[143] = 164;
        iArr2[144] = 249;
        iArr2[145] = 254;
        iArr2[146] = 247;
        iArr2[147] = 240;
        iArr2[148] = 229;
        iArr2[149] = 226;
        iArr2[150] = 235;
        iArr2[151] = 236;
        iArr2[152] = 193;
        iArr2[153] = 198;
        iArr2[154] = 207;
        iArr2[155] = 200;
        iArr2[156] = 221;
        iArr2[157] = 218;
        iArr2[158] = 211;
        iArr2[159] = 212;
        iArr2[160] = 105;
        iArr2[161] = 110;
        iArr2[162] = 103;
        iArr2[163] = 96;
        iArr2[164] = 117;
        iArr2[165] = 114;
        iArr2[166] = 123;
        iArr2[167] = 124;
        iArr2[168] = 81;
        iArr2[169] = 86;
        iArr2[170] = 95;
        iArr2[171] = 88;
        iArr2[172] = 77;
        iArr2[173] = 74;
        iArr2[174] = 67;
        iArr2[175] = 68;
        iArr2[176] = 25;
        iArr2[177] = 30;
        iArr2[178] = 23;
        iArr2[179] = 16;
        iArr2[180] = 5;
        iArr2[181] = 2;
        iArr2[182] = 11;
        iArr2[183] = 12;
        iArr2[184] = 33;
        iArr2[185] = 38;
        iArr2[186] = 47;
        iArr2[187] = 40;
        iArr2[188] = 61;
        iArr2[189] = 58;
        iArr2[190] = 51;
        iArr2[191] = 52;
        iArr2[192] = 78;
        iArr2[193] = 73;
        iArr2[194] = 64;
        iArr2[195] = 71;
        iArr2[196] = 82;
        iArr2[197] = 85;
        iArr2[198] = 92;
        iArr2[199] = 91;
        iArr2[200] = 118;
        iArr2[201] = 113;
        iArr2[202] = 120;
        iArr2[203] = 127;
        iArr2[204] = 106;
        iArr2[205] = 109;
        iArr2[206] = 100;
        iArr2[207] = 99;
        iArr2[208] = 62;
        iArr2[209] = 57;
        iArr2[210] = 48;
        iArr2[211] = 55;
        iArr2[212] = 34;
        iArr2[213] = 37;
        iArr2[214] = 44;
        iArr2[215] = 43;
        iArr2[216] = 6;
        iArr2[217] = 1;
        iArr2[218] = 8;
        iArr2[219] = 15;
        iArr2[220] = 26;
        iArr2[221] = 29;
        iArr2[222] = 20;
        iArr2[223] = 19;
        iArr2[224] = 174;
        iArr2[225] = 169;
        iArr2[226] = 160;
        iArr2[227] = 167;
        iArr2[228] = 178;
        iArr2[229] = 181;
        iArr2[230] = 188;
        iArr2[231] = 187;
        iArr2[232] = 150;
        iArr2[233] = 145;
        iArr2[234] = 152;
        iArr2[235] = 159;
        iArr2[236] = 138;
        iArr2[237] = 141;
        iArr2[238] = 132;
        iArr2[239] = 131;
        iArr2[240] = 222;
        iArr2[241] = 217;
        iArr2[242] = 208;
        iArr2[243] = 215;
        iArr2[244] = 194;
        iArr2[245] = 197;
        iArr2[246] = 204;
        iArr2[247] = 203;
        iArr2[248] = 230;
        iArr2[249] = 225;
        iArr2[250] = 232;
        iArr2[251] = 239;
        iArr2[252] = 250;
        iArr2[253] = 253;
        iArr2[254] = 244;
        iArr2[255] = 243;
        f8412o = iArr2;
    }

    /* renamed from: A */
    public static String m10237A(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: A0 */
    public static <T> void m10238A0(List<T> list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        } else if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    /* renamed from: B */
    public static String m10239B(byte[] bArr) {
        return new String(bArr, Charsets.f9743c);
    }

    /* renamed from: B0 */
    public static long m10240B0(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        double d = (double) j2;
        double d2 = (double) j3;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) j;
        Double.isNaN(d4);
        return (long) (d4 * d3);
    }

    /* renamed from: C */
    public static String m10241C(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, Charsets.f9743c);
    }

    /* renamed from: C0 */
    public static void m10242C0(long[] jArr, long j, long j2) {
        int i = 0;
        if (j2 >= j && j2 % j == 0) {
            long j3 = j2 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
        } else if (j2 >= j || j % j2 != 0) {
            double d = (double) j;
            double d2 = (double) j2;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            while (i < jArr.length) {
                double d4 = (double) jArr[i];
                Double.isNaN(d4);
                jArr[i] = (long) (d4 * d3);
                i++;
            }
        } else {
            long j4 = j / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
        }
    }

    /* renamed from: D */
    public static int m10243D(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f8398a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: D0 */
    public static String[] m10244D0(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: E */
    public static int m10245E(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    /* renamed from: E0 */
    public static String[] m10246E0(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: F */
    public static int m10247F(String str, int i) {
        int i2 = 0;
        for (String m : m10248F0(str)) {
            if (i == MimeTypes.m10407m(m)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: F0 */
    public static String[] m10248F0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return m10244D0(str.trim(), "(\\s*,\\s*)");
    }

    /* renamed from: G */
    public static String m10249G(String str, int i) {
        String[] F0 = m10248F0(str);
        String str2 = null;
        if (F0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str3 : F0) {
            if (i == MimeTypes.m10407m(str3)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            str2 = sb.toString();
        }
        return str2;
    }

    /* renamed from: G0 */
    public static long m10250G0(long j, long j2, long j3) {
        long j4 = j - j2;
        return ((j ^ j4) & (j2 ^ j)) < 0 ? j3 : j4;
    }

    /* renamed from: H */
    public static String m10251H(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /* renamed from: H0 */
    public static byte[] m10252H0(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: I */
    public static String m10253I(Context context) {
        if (context != null) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (!TextUtils.isEmpty(networkCountryIso)) {
                    return m10260L0(networkCountryIso);
                }
            }
        }
        return m10260L0(Locale.getDefault().getCountry());
    }

    /* renamed from: I0 */
    public static long m10254I0(int i, int i2) {
        return m10258K0(i2) | (m10258K0(i) << 32);
    }

    /* renamed from: J */
    public static Point m10255J(Context context) {
        return m10257K(context, ((WindowManager) Assertions.m10153e((WindowManager) context.getSystemService("window"))).getDefaultDisplay());
    }

    /* renamed from: J0 */
    public static String m10256J0(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    /* renamed from: K */
    public static Point m10257K(Context context, Display display) {
        String str;
        int i = f8398a;
        if (i <= 29 && display.getDisplayId() == 0 && m10302m0(context)) {
            if ("Sony".equals(f8400c) && f8401d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            if (i < 28) {
                str = m10286e0("sys.display-size");
            } else {
                str = m10286e0("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] D0 = m10244D0(str.trim(), "x");
                    if (D0.length == 2) {
                        int parseInt = Integer.parseInt(D0[0]);
                        int parseInt2 = Integer.parseInt(D0[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid display size: ");
                sb.append(str);
                Log.m10381c("Util", sb.toString());
            }
        }
        Point point = new Point();
        int i2 = f8398a;
        if (i2 >= 23) {
            m10265O(display, point);
        } else if (i2 >= 17) {
            m10263N(display, point);
        } else {
            m10261M(display, point);
        }
        return point;
    }

    /* renamed from: K0 */
    public static long m10258K0(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: L */
    public static Looper m10259L() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    /* renamed from: L0 */
    public static String m10260L0(String str) {
        return str == null ? str : str.toUpperCase(Locale.US);
    }

    /* renamed from: M */
    private static void m10261M(Display display, Point point) {
        display.getSize(point);
    }

    /* renamed from: M0 */
    public static CharSequence m10262M0(CharSequence charSequence, int i) {
        return charSequence.length() <= i ? charSequence : charSequence.subSequence(0, i);
    }

    /* renamed from: N */
    private static void m10263N(Display display, Point point) {
        display.getRealSize(point);
    }

    /* renamed from: N0 */
    public static void m10264N0(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: O */
    private static void m10265O(Display display, Point point) {
        Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    /* renamed from: P */
    public static String m10266P(Locale locale) {
        return f8398a >= 21 ? m10267Q(locale) : locale.toString();
    }

    /* renamed from: Q */
    private static String m10267Q(Locale locale) {
        return locale.toLanguageTag();
    }

    /* renamed from: R */
    public static long m10268R(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = (double) j;
        double d2 = (double) f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d * d2);
    }

    /* renamed from: S */
    private static int m10269S(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            case 20:
                return f8398a >= 29 ? 9 : 0;
            default:
                return 6;
        }
    }

    /* renamed from: T */
    public static int m10270T(Context context) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (!(type == 4 || type == 5)) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return m10269S(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    /* renamed from: U */
    public static long m10271U(long j) {
        if (j == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j + SystemClock.elapsedRealtime();
    }

    /* renamed from: V */
    public static int m10272V(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    /* renamed from: W */
    public static Format m10273W(int i, int i2, int i3) {
        return new C1245b().mo7705e0("audio/raw").mo7682H(i2).mo7706f0(i3).mo7699Y(i).mo7679E();
    }

    /* renamed from: X */
    public static int m10274X(int i, int i2) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 268435456) {
                        if (i == 536870912) {
                            return i2 * 3;
                        }
                        if (i != 805306368) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i2 *= 4;
            }
            return i2;
        }
        return i2 * 2;
    }

    /* renamed from: Y */
    public static long m10275Y(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = (double) j;
        double d2 = (double) f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    /* renamed from: Z */
    public static int m10276Z(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: a */
    public static long m10277a(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? j3 : j4;
    }

    /* renamed from: a0 */
    public static String m10278a0(StringBuilder sb, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        String str = j < 0 ? "-" : "";
        long abs = (Math.abs(j) + 500) / 1000;
        long j2 = abs % 60;
        long j3 = (abs / 60) % 60;
        long j4 = abs / 3600;
        sb.setLength(0);
        if (j4 > 0) {
            return formatter.format("%s%d:%02d:%02d", new Object[]{str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)}).toString();
        }
        return formatter.format("%s%02d:%02d", new Object[]{str, Long.valueOf(j3), Long.valueOf(j2)}).toString();
    }

    /* renamed from: b */
    public static boolean m10279b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b0 */
    public static String[] m10280b0() {
        String[] c0 = m10282c0();
        for (int i = 0; i < c0.length; i++) {
            c0[i] = m10314s0(c0[i]);
        }
        return c0;
    }

    /* renamed from: c */
    public static <T extends Comparable<? super T>> int m10281c(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i = binarySearch ^ -1;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (((Comparable) list.get(binarySearch)).compareTo(t) == 0);
            i = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(list.size() - 1, i) : i;
    }

    /* renamed from: c0 */
    private static String[] m10282c0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f8398a >= 24) {
            return m10284d0(configuration);
        }
        return new String[]{m10266P(configuration.locale)};
    }

    /* renamed from: d */
    public static int m10283d(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = binarySearch ^ -1;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i) : i;
    }

    /* renamed from: d0 */
    private static String[] m10284d0(Configuration configuration) {
        return m10244D0(configuration.getLocales().toLanguageTags(), ",");
    }

    /* renamed from: e */
    public static int m10285e(LongArray uVar, long j, boolean z, boolean z2) {
        int c = uVar.mo7483c() - 1;
        int i = 0;
        while (i <= c) {
            int i2 = (i + c) >>> 1;
            if (uVar.mo7482b(i2) < j) {
                i = i2 + 1;
            } else {
                c = i2 - 1;
            }
        }
        if (z) {
            int i3 = c + 1;
            if (i3 < uVar.mo7483c() && uVar.mo7482b(i3) == j) {
                return i3;
            }
        }
        if (!z2 || c != -1) {
            return c;
        }
        return 0;
    }

    /* renamed from: e0 */
    private static String m10286e0(String str) {
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to read system property ");
            sb.append(str);
            Log.m10382d("Util", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: f */
    public static <T extends Comparable<? super T>> int m10287f(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (((Comparable) list.get(binarySearch)).compareTo(t) == 0);
            i = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i) : i;
    }

    /* renamed from: f0 */
    public static String m10288f0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
            str2 = "?";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(" (Linux;Android ");
        sb.append(VERSION.RELEASE);
        sb.append(") ");
        sb.append("ExoPlayerLib/2.13.3");
        return sb.toString();
    }

    /* renamed from: g */
    public static int m10289g(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i);
            i2 = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    /* renamed from: g0 */
    public static byte[] m10290g0(String str) {
        return str.getBytes(Charsets.f9743c);
    }

    /* renamed from: h */
    public static int m10291h(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i) : i;
    }

    /* renamed from: h0 */
    public static boolean m10292h0(ParsableByteArray a0Var, ParsableByteArray a0Var2, Inflater inflater) {
        if (a0Var.mo7376a() <= 0) {
            return false;
        }
        if (a0Var2.mo7377b() < a0Var.mo7376a()) {
            a0Var2.mo7378c(a0Var.mo7376a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(a0Var.mo7379d(), a0Var.mo7380e(), a0Var.mo7376a());
        int i = 0;
        while (true) {
            try {
                i += inflater.inflate(a0Var2.mo7379d(), i, a0Var2.mo7377b() - i);
                if (inflater.finished()) {
                    a0Var2.mo7373O(i);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else if (i == a0Var2.mo7377b()) {
                    a0Var2.mo7378c(a0Var2.mo7377b() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: i */
    public static <T> T m10293i(T t) {
        return t;
    }

    /* renamed from: i0 */
    public static boolean m10294i0(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: j */
    public static <T> T[] m10295j(T[] tArr) {
        return tArr;
    }

    /* renamed from: j0 */
    public static boolean m10296j0(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: k */
    public static int m10297k(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: k0 */
    public static boolean m10298k0(int i) {
        return i == 10 || i == 13;
    }

    /* renamed from: l */
    public static void m10299l(C1916m mVar) {
        if (mVar != null) {
            try {
                mVar.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: l0 */
    public static boolean m10300l0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* renamed from: m */
    public static void m10301m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: m0 */
    public static boolean m10302m0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: n */
    public static int m10303n(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* renamed from: n0 */
    static /* synthetic */ Thread m10304n0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* renamed from: o */
    public static float m10305o(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: o0 */
    public static int m10306o0(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public static int m10307p(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: p0 */
    private static String m10308p0(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f8410m;
            if (i >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i])) {
                StringBuilder sb = new StringBuilder();
                sb.append(strArr[i + 1]);
                sb.append(str.substring(strArr[i].length()));
                return sb.toString();
            }
            i += 2;
        }
    }

    /* renamed from: q */
    public static long m10309q(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: q0 */
    public static <T> void m10310q0(List<T> list, int i, int i2, int i3) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i4 = (i2 - i) - 1; i4 >= 0; i4--) {
            arrayDeque.addFirst(list.remove(i + i4));
        }
        list.addAll(Math.min(i3, list.size()), arrayDeque);
    }

    /* renamed from: r */
    public static boolean m10311r(Object[] objArr, Object obj) {
        for (Object b : objArr) {
            if (m10279b(b, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r0 */
    public static ExecutorService m10312r0(String str) {
        return Executors.newSingleThreadExecutor(new C1188e(str));
    }

    /* renamed from: s */
    public static int m10313s(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f8411n[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    /* renamed from: s0 */
    public static String m10314s0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !"und".equals(replace)) {
            str = replace;
        }
        String J0 = m10256J0(str);
        String str2 = m10246E0(J0, "-")[0];
        if (f8408k == null) {
            f8408k = m10327z();
        }
        String str3 = (String) f8408k.get(str2);
        if (str3 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(J0.substring(str2.length()));
            J0 = sb.toString();
            str2 = str3;
        }
        if ("no".equals(str2) || UMCommonContent.f16577aA.equals(str2) || "zh".equals(str2)) {
            J0 = m10308p0(J0);
        }
        return J0;
    }

    /* renamed from: t */
    public static int m10315t(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f8412o[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    /* renamed from: t0 */
    public static <T> T[] m10316t0(T[] tArr, T t) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t;
        return m10295j(copyOf);
    }

    /* renamed from: u */
    public static Handler m10317u(Looper looper, Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: u0 */
    public static <T> T[] m10318u0(T[] tArr, T[] tArr2) {
        T[] copyOf = Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, copyOf, tArr.length, tArr2.length);
        return copyOf;
    }

    /* renamed from: v */
    public static Handler m10319v() {
        return m10321w(null);
    }

    /* renamed from: v0 */
    public static <T> T[] m10320v0(T[] tArr, int i) {
        Assertions.m10149a(i <= tArr.length);
        return Arrays.copyOf(tArr, i);
    }

    /* renamed from: w */
    public static Handler m10321w(Callback callback) {
        return m10317u((Looper) Assertions.m10156h(Looper.myLooper()), callback);
    }

    /* renamed from: w0 */
    public static <T> T[] m10322w0(T[] tArr, int i, int i2) {
        boolean z = true;
        Assertions.m10149a(i >= 0);
        if (i2 > tArr.length) {
            z = false;
        }
        Assertions.m10149a(z);
        return Arrays.copyOfRange(tArr, i, i2);
    }

    /* renamed from: x */
    public static Handler m10323x() {
        return m10325y(null);
    }

    /* renamed from: x0 */
    public static long m10324x0(String str) throws ParserException {
        Matcher matcher = f8404g.matcher(str);
        if (matcher.matches()) {
            int i = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                StringBuilder sb = new StringBuilder();
                sb.append("0.");
                sb.append(matcher.group(8));
                gregorianCalendar.set(14, new BigDecimal(sb.toString()).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i != 0 ? timeInMillis - ((long) (i * 60000)) : timeInMillis;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid date/time format: ");
        sb2.append(str);
        throw new ParserException(sb2.toString());
    }

    /* renamed from: y */
    public static Handler m10325y(Callback callback) {
        return m10317u(m10259L(), callback);
    }

    /* renamed from: y0 */
    public static boolean m10326y0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: z */
    private static HashMap<String, String> m10327z() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f8409l.length);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f8409l;
            if (i >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    /* renamed from: z0 */
    public static boolean m10328z0(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
