package com.efs.sdk.base.protocol.file;

import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.p176a.p177a.C1651a;
import com.efs.sdk.base.p176a.p179c.C1679b;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.base.protocol.file.section.JSONSection;
import com.efs.sdk.base.protocol.file.section.KVSection;
import com.efs.sdk.base.protocol.file.section.TextSection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EfsTextFile extends AbsFileLog {
    private static final String FILE_START = "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***";
    private static final String SECTION_START = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---";
    private boolean mHasInitLinkInfo = false;
    private String mLinkID = null;
    private String mLinkKey = null;
    private List<AbsSection> sectionList = new ArrayList();

    public EfsTextFile(String str) {
        super(str);
    }

    private String changeToStr() {
        StringBuilder sb = new StringBuilder(FILE_START);
        sb.append("\n");
        int i = 0;
        for (AbsSection absSection : this.sectionList) {
            if (i > 0) {
                sb.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
            }
            sb.append(absSection.changeToStr());
            i++;
        }
        return sb.toString();
    }

    private void initLinkInfo() {
        if ((TextUtils.isEmpty(this.mLinkID) || TextUtils.isEmpty(this.mLinkKey)) && !this.mHasInitLinkInfo) {
            for (AbsSection absSection : this.sectionList) {
                if (absSection instanceof KVSection) {
                    Map dataMap = ((KVSection) absSection).getDataMap();
                    if (TextUtils.isEmpty(this.mLinkID)) {
                        String str = Constants.LOG_KEY_LINK_ID;
                        if (dataMap.containsKey(str)) {
                            this.mLinkID = String.valueOf(dataMap.get(str));
                        }
                    }
                    if (TextUtils.isEmpty(this.mLinkKey)) {
                        String str2 = Constants.LOG_KEY_LINK_KEY;
                        if (dataMap.containsKey(str2)) {
                            this.mLinkKey = String.valueOf(dataMap.get(str2));
                        }
                    }
                }
            }
            this.mHasInitLinkInfo = true;
        }
    }

    private void insertCustomInfoSection() {
        KVSection kVSection = new KVSection("custom_info");
        for (Entry entry : C1682a.m14214a().mo9636a().entrySet()) {
            kVSection.put((String) entry.getKey(), entry.getValue());
        }
        this.sectionList.add(0, kVSection);
    }

    public JSONSection createAndAddJSONSection(String str) {
        JSONSection jSONSection = new JSONSection(str);
        this.sectionList.add(jSONSection);
        return jSONSection;
    }

    public KVSection createAndAddKVSection(String str) {
        KVSection kVSection = new KVSection(str);
        this.sectionList.add(kVSection);
        return kVSection;
    }

    public TextSection createAndAddTextSection(String str) {
        TextSection textSection = new TextSection(str);
        this.sectionList.add(textSection);
        return textSection;
    }

    public byte[] generate() {
        String changeToStr = changeToStr();
        if (C1682a.m14214a().f11303g) {
            C1728d.m14307a("efs.base", changeToStr);
        }
        return changeToStr.getBytes();
    }

    public String generateString() {
        return changeToStr();
    }

    public String getLinkId() {
        initLinkInfo();
        return this.mLinkID;
    }

    public String getLinkKey() {
        initLinkInfo();
        return this.mLinkKey;
    }

    public void insertGlobal(C1679b bVar) {
        insertCustomInfoSection();
        List<AbsSection> list = this.sectionList;
        String logType = getLogType();
        ArrayList arrayList = new ArrayList();
        KVSection kVSection = new KVSection("global_head");
        String str = "appid";
        KVSection put = kVSection.put("type", logType).put(str, bVar.f11333a.get(str));
        String str2 = "wid";
        KVSection put2 = put.put(str2, bVar.f11333a.get(str2));
        String str3 = "pid";
        KVSection put3 = put2.put(str3, bVar.f11333a.get(str3));
        String str4 = "pkg";
        KVSection put4 = put3.put(str4, bVar.f11333a.get(str4));
        String str5 = "ver";
        KVSection put5 = put4.put(str5, bVar.f11333a.get(str5));
        String str6 = "vcode";
        KVSection put6 = put5.put(str6, bVar.f11333a.get(str6));
        String str7 = "ps";
        KVSection put7 = put6.put(str7, bVar.f11333a.get(str7));
        String str8 = "stime";
        KVSection put8 = put7.put(str8, bVar.f11333a.get(str8));
        C1651a.m14131a();
        KVSection put9 = put8.put("ctime", Long.valueOf(C1651a.m14134b() / 1000));
        C1651a.m14131a();
        KVSection put10 = put9.put("w_tm", Long.valueOf(C1651a.m14134b() / 1000));
        String str9 = "sdk_ver";
        put10.put(str9, bVar.f11333a.get(str9));
        String str10 = "uid";
        String valueOf = String.valueOf(bVar.mo9652b(str10, ""));
        if (!TextUtils.isEmpty(valueOf)) {
            kVSection.put(str10, valueOf);
        }
        arrayList.add(kVSection);
        KVSection kVSection2 = new KVSection("device_info");
        String str11 = "lang";
        String str12 = "brand";
        KVSection put11 = kVSection2.put(str11, bVar.f11333a.get(str11)).put(str12, bVar.f11333a.get(str12));
        String str13 = "model";
        KVSection put12 = put11.put(str13, bVar.f11333a.get(str13));
        String str14 = "rom";
        KVSection put13 = put12.put(str14, bVar.f11333a.get(str14));
        String str15 = "sdk";
        KVSection put14 = put13.put(str15, bVar.f11333a.get(str15));
        String str16 = "dsp_h";
        KVSection put15 = put14.put(str16, bVar.f11333a.get(str16));
        String str17 = "dsp_w";
        KVSection put16 = put15.put(str17, bVar.f11333a.get(str17));
        String str18 = "tzone";
        KVSection put17 = put16.put(str18, bVar.f11333a.get(str18));
        String str19 = "net";
        String str20 = "fr";
        put17.put(str19, bVar.f11333a.get(str19)).put(str20, bVar.f11333a.get(str20));
        arrayList.add(kVSection2);
        list.addAll(0, arrayList);
    }
}
