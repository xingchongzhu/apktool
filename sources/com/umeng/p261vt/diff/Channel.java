package com.umeng.p261vt.diff;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.p261vt.diff.util.ClassLoadUtil;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.vt.diff.Channel */
public class Channel {
    private static final String UM_VISUAL_IMPRINT = "utm-visual";

    private void download() {
        try {
            Class findClass = ClassLoadUtil.findClass("com.umeng.vt.vismode.config.ConfigTools");
            if (findClass != null) {
                Method method = findClass.getMethod("download", new Class[0]);
                if (method != null) {
                    method.invoke(findClass.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), new Object[0]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void storeConfig(Map<String, String> map) {
        try {
            Class findClass = ClassLoadUtil.findClass("com.umeng.vt.vismode.config.ConfigTools");
            if (findClass != null) {
                Method method = findClass.getMethod("storeConfig", new Class[]{Map.class});
                if (method != null) {
                    method.invoke(findClass.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), new Object[]{map});
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void init(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            loadConfig(applicationContext);
            registerListener(applicationContext);
        }
    }

    public void loadConfig(Context context) {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, UM_VISUAL_IMPRINT, null);
        if (!TextUtils.isEmpty(imprintProperty)) {
            String str = new String(Base64.decode(imprintProperty, 0));
            HashMap hashMap = new HashMap();
            hashMap.put("data-track", str);
            storeConfig(hashMap);
        }
    }

    public void registerListener(final Context context) {
        ImprintHandler.getImprintService(context).registImprintCallback(UM_VISUAL_IMPRINT, new UMImprintChangeCallback() {
            public void onImprintValueChanged(String str, String str2) {
                if (Channel.UM_VISUAL_IMPRINT.equals(str)) {
                    Channel.this.loadConfig(context);
                }
            }
        });
    }
}
