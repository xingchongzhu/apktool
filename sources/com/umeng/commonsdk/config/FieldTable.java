package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.config.d */
public class FieldTable {

    /* renamed from: a */
    public static final long f17349a = 1000;

    /* renamed from: b */
    public static final String f17350b = "_LAST_FIELD";

    /* renamed from: c */
    public static final String f17351c = "3758096383";

    /* renamed from: d */
    public static final String f17352d = "2147483647";

    /* renamed from: e */
    public static final String f17353e = "262143";

    /* renamed from: f */
    public static final String f17354f = "2047";

    /* renamed from: g */
    public static final int f17355g = 64;

    /* renamed from: h */
    public static String[] f17356h = new String[C3182a.values().length];

    /* renamed from: i */
    public static String[] f17357i = new String[C3183b.values().length];

    /* renamed from: j */
    public static String[] f17358j = new String[C3184c.values().length];

    /* renamed from: k */
    public static String[] f17359k = new String[C3185d.values().length];

    /* renamed from: l */
    private static Map<String, String[]> f17360l = new HashMap();

    /* renamed from: com.umeng.commonsdk.config.d$a */
    /* compiled from: FieldTable */
    public enum C3182a {
        header_utoken,
        header_cpu,
        header_mccmnc,
        header_sub_os_name,
        header_sub_os_version,
        header_device_type,
        header_device_id_imei,
        header_device_id_mac,
        header_device_id_android_id,
        header_device_id_serialNo,
        header_bulid,
        header_os_version,
        header_resolution,
        header_mc,
        header_timezone,
        header_local_info,
        header_carrier,
        header_access,
        header_tracking_imei,
        header_tracking_android_id,
        header_tracking_utdid,
        header_tracking_idmd5,
        header_tracking_idfa,
        header_tracking_mac,
        header_tracking_serial,
        header_tracking_uuid,
        header_tracking_uop,
        header_tracking_oldumid,
        header_tracking_newumid,
        header_ekv_send_on_exit,
        header_device_oaid,
        header_local_ip,
        header_foreground_count,
        header_first_resume,
        _LAST_FIELD
    }

    /* renamed from: com.umeng.commonsdk.config.d$b */
    /* compiled from: FieldTable */
    public enum C3183b {
        inner_rs,
        inner_by,
        inner_gp,
        inner_to,
        inner_mo,
        inner_ca,
        inner_fl,
        inner_gdf_r,
        inner_thm_z,
        inner_dsk_s,
        inner_sd,
        inner_build,
        inner_sr,
        inner_scr,
        inner_sinfo,
        inner_winfo,
        inner_input,
        inner_bt,
        inner_mem,
        inner_cpu,
        inner_rom,
        inner_bstn,
        inner_cam,
        inner_appls,
        inner_lbs,
        internal_run_server,
        internal_imsi,
        internal_meid,
        tp_tp,
        inner_imei2,
        inner_iccid,
        _LAST_FIELD
    }

    /* renamed from: com.umeng.commonsdk.config.d$c */
    /* compiled from: FieldTable */
    public enum C3184c {
        push_cpu,
        push_imei,
        push_mac,
        push_android_id,
        push_serialNo,
        push_settings_android_id,
        push_network_access_mode,
        push_on_line,
        push_time_zone,
        push_locale_info,
        push_resolution,
        push_operator,
        push_utdid,
        push_service_work,
        push_service_name,
        push_intent_exist,
        push_data_data,
        push_notification_enabled,
        _LAST_FIELD
    }

    /* renamed from: com.umeng.commonsdk.config.d$d */
    /* compiled from: FieldTable */
    public enum C3185d {
        share_device_id,
        share_imsi,
        share_iccid,
        share_sn,
        share_net_accmode,
        share_android_id,
        share_wifi_mac,
        share_sd_size,
        share_ssid,
        share_resolution,
        share_conn_type,
        _LAST_FIELD
    }

    static {
        String[] strArr = f17356h;
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < C3182a.values().length; i++) {
                f17356h[i] = C3182a.values()[i].toString();
            }
            Map<String, String[]> map = f17360l;
            if (map != null) {
                map.put(C3182a.class.getName(), f17356h);
            }
        }
        String[] strArr2 = f17357i;
        if (strArr2 != null && strArr2.length > 0) {
            for (int i2 = 0; i2 < C3183b.values().length; i2++) {
                f17357i[i2] = C3183b.values()[i2].toString();
            }
            Map<String, String[]> map2 = f17360l;
            if (map2 != null) {
                map2.put(C3183b.class.getName(), f17357i);
            }
        }
        String[] strArr3 = f17358j;
        if (strArr3 != null && strArr3.length > 0) {
            for (int i3 = 0; i3 < C3184c.values().length; i3++) {
                f17358j[i3] = C3184c.values()[i3].toString();
            }
            Map<String, String[]> map3 = f17360l;
            if (map3 != null) {
                map3.put(C3184c.class.getName(), f17358j);
            }
        }
        String[] strArr4 = f17359k;
        if (strArr4 != null && strArr4.length > 0) {
            for (int i4 = 0; i4 < C3185d.values().length; i4++) {
                f17359k[i4] = C3185d.values()[i4].toString();
            }
            Map<String, String[]> map4 = f17360l;
            if (map4 != null) {
                map4.put(C3185d.class.getName(), f17359k);
            }
        }
    }

    /* renamed from: a */
    public static boolean m22216a(String str) {
        return str != null && str.length() > 0 && !f17350b.equalsIgnoreCase(str);
    }

    /* renamed from: b */
    public static String[] m22217b(String str) {
        if (str == null || str.length() <= 0 || !f17360l.containsKey(str)) {
            return null;
        }
        return (String[]) f17360l.get(str);
    }
}
