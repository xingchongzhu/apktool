package com.umeng.p261vt.diff;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.p261vt.diff.util.ClassLoadUtil;
import com.umeng.tunnel.UMChannelAgent;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.umeng.vt.diff.Event */
public class Event {
    private static final int MAX_PROPERTY_LENGTH = 128;

    public static void commit(Context context, View view, String str, Map<String, Object> map, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        String str2 = "; UApp页面路径：";
        String str3 = "; 页面：";
        String str4 = "; 参数：";
        Integer valueOf = Integer.valueOf(1);
        String str5 = C3292V.VISUAL_TRACK_STYLE;
        String str6 = C3292V.VISUAL_TRACK_TEXT;
        String str7 = C3292V.VISUAL_TRACK_UAPP_PG;
        String str8 = UMRTLog.RTLOG_TAG;
        String str9 = C3292V.VISUAL_TRACK_PG;
        if (!booleanValue) {
            if (view != null) {
                String textPropertyFromView = textPropertyFromView(view);
                if (!TextUtils.isEmpty(textPropertyFromView)) {
                    map.put(str6, textPropertyFromView);
                }
                map.put(str9, view.getContext().getClass().getName());
            } else {
                map.put(str9, context.getClass().getName());
            }
            map.put(str5, valueOf);
            map.put(str7, getPageName());
            StringBuilder sb = new StringBuilder();
            String str10 = "release:事件名: ";
            sb.append(str10);
            sb.append(str);
            UMRTLog.m22228e(str8, sb.toString());
            if (map.containsKey(str6)) {
                String str11 = (String) map.get(str6);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str10);
                sb2.append(str);
                sb2.append(str4);
                sb2.append(str11);
                UMRTLog.m22228e(str8, sb2.toString());
            }
            if (map.containsKey(str9)) {
                String str12 = (String) map.get(str9);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str10);
                sb3.append(str);
                sb3.append(str3);
                sb3.append(str12);
                UMRTLog.m22228e(str8, sb3.toString());
            }
            if (map.containsKey(str7)) {
                String str13 = (String) map.get(str7);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str10);
                sb4.append(str);
                sb4.append(str2);
                sb4.append(str13);
                UMRTLog.m22228e(str8, sb4.toString());
            }
            MobclickAgent.onEventObject(context, str, map);
        } else if (UMChannelAgent.init()) {
            if (view != null) {
                String textPropertyFromView2 = textPropertyFromView(view);
                if (!TextUtils.isEmpty(textPropertyFromView2)) {
                    map.put(str6, textPropertyFromView2);
                }
                map.put(str9, view.getContext().getClass().getName());
            } else {
                map.put(str9, context.getClass().getName());
            }
            map.put(str5, valueOf);
            map.put(str7, getPageName());
            StringBuilder sb5 = new StringBuilder();
            String str14 = "config:事件名: ";
            sb5.append(str14);
            sb5.append(str);
            UMRTLog.m22228e(str8, sb5.toString());
            if (map.containsKey(str6)) {
                String str15 = (String) map.get(str6);
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str14);
                sb6.append(str);
                sb6.append(str4);
                sb6.append(str15);
                UMRTLog.m22228e(str8, sb6.toString());
            }
            if (map.containsKey(str9)) {
                String str16 = (String) map.get(str9);
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str14);
                sb7.append(str);
                sb7.append(str3);
                sb7.append(str16);
                UMRTLog.m22228e(str8, sb7.toString());
            }
            if (map.containsKey(str7)) {
                String str17 = (String) map.get(str7);
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str14);
                sb8.append(str);
                sb8.append(str2);
                sb8.append(str17);
                UMRTLog.m22228e(str8, sb8.toString());
            }
            UMChannelAgent.onDebugEvent(context, str, map);
        }
    }

    public static String getActivityName(View view) {
        if (view != null) {
            Context context = view.getContext();
            if (context != null) {
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (context instanceof Activity) {
                    return context.getClass().getCanonicalName();
                }
            }
        }
        return null;
    }

    public static String getPageName(View view) {
        String pageName = getPageName();
        String str = "VT";
        String str2 = "";
        if (pageName != null && !pageName.equals(str2) && !pageName.equals(str)) {
            return pageName;
        }
        String activityName = getActivityName(view);
        return (activityName == null || activityName.equals(str2)) ? str : activityName;
    }

    public static void init(Context context, String str, String str2, int i, String str3) {
    }

    public static void openDebug(String str) {
    }

    private static void reflectTrack(Context context, String str, Map<String, Object> map) {
        try {
            Class findClass = ClassLoadUtil.findClass("com.umeng.analytics.MobclickAgent");
            if (findClass != null) {
                Method method = findClass.getMethod("onEvent", new Class[]{Context.class, String.class, Map.class});
                if (method != null) {
                    method.invoke(null, new Object[]{context, str, map});
                }
            }
        } catch (Exception unused) {
        }
    }

    private static String textPropertyFromView(View view) {
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (text != null) {
                return text.toString();
            }
            return null;
        } else if (!(view instanceof ViewGroup)) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount && sb.length() < MAX_PROPERTY_LENGTH; i++) {
                String textPropertyFromView = textPropertyFromView(viewGroup.getChildAt(i));
                if (textPropertyFromView != null && textPropertyFromView.length() > 0) {
                    if (z) {
                        sb.append(", ");
                    }
                    sb.append(textPropertyFromView);
                    z = true;
                }
            }
            if (sb.length() > MAX_PROPERTY_LENGTH) {
                return sb.substring(0, MAX_PROPERTY_LENGTH);
            }
            if (z) {
                return sb.toString();
            }
            return null;
        }
    }

    public static String getPageName() {
        String currenPageName = PageNameMonitor.getInstance().getCurrenPageName();
        return TextUtils.isEmpty(currenPageName) ? "" : currenPageName;
    }
}
