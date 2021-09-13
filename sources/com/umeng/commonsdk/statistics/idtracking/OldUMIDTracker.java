package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.UMCommonContent;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import java.io.File;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.j */
public class OldUMIDTracker extends AbstractIdTracker {

    /* renamed from: a */
    private static final String f17745a = "oldumid";

    /* renamed from: b */
    private Context f17746b;

    /* renamed from: c */
    private String f17747c = null;

    /* renamed from: d */
    private String f17748d = null;

    public OldUMIDTracker(Context context) {
        super(f17745a);
        this.f17746b = context;
    }

    /* renamed from: b */
    private void m22589b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: j */
    private void m22590j() {
        try {
            m22589b("/data/local/tmp/.um");
            HelperUtils.writeFile(new File("/data/local/tmp/.um/sysid.dat"), this.f17748d);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: k */
    private void m22591k() {
        try {
            m22589b("/sdcard/Android/obj/.um");
            HelperUtils.writeFile(new File("/sdcard/Android/obj/.um/sysid.dat"), this.f17748d);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: l */
    private void m22592l() {
        try {
            m22589b("/sdcard/Android/data/.um");
            HelperUtils.writeFile(new File("/sdcard/Android/data/.um/sysid.dat"), this.f17748d);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public String mo19365f() {
        return this.f17747c;
    }

    /* renamed from: g */
    public boolean mo19378g() {
        return mo19379h();
    }

    /* renamed from: h */
    public boolean mo19379h() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f17746b, UMCommonContent.f16645g, null);
        this.f17748d = imprintProperty;
        if (!TextUtils.isEmpty(imprintProperty)) {
            this.f17748d = DataHelper.encryptBySHA1(this.f17748d);
            String readFile = HelperUtils.readFile(new File("/sdcard/Android/data/.um/sysid.dat"));
            String readFile2 = HelperUtils.readFile(new File("/sdcard/Android/obj/.um/sysid.dat"));
            String readFile3 = HelperUtils.readFile(new File("/data/local/tmp/.um/sysid.dat"));
            if (TextUtils.isEmpty(readFile)) {
                m22592l();
            } else if (!this.f17748d.equals(readFile)) {
                this.f17747c = readFile;
                return true;
            }
            if (TextUtils.isEmpty(readFile2)) {
                m22591k();
            } else if (!this.f17748d.equals(readFile2)) {
                this.f17747c = readFile2;
                return true;
            }
            if (TextUtils.isEmpty(readFile3)) {
                m22590j();
            } else if (!this.f17748d.equals(readFile3)) {
                this.f17747c = readFile3;
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void mo19380i() {
        try {
            m22592l();
            m22591k();
            m22590j();
        } catch (Exception unused) {
        }
    }
}
