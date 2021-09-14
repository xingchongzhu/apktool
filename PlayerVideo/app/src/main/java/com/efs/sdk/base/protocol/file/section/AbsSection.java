package com.efs.sdk.base.protocol.file.section;


import com.chip.ninetyonetv.BuildConfig;

public abstract class AbsSection {
    public static final String SEP_LINE_BREAK = "linebreak";
    public static final String SEP_ORIGIN_LINE_BREAK = "\n";
    String name;
    String sep;
    String type;
    String version = BuildConfig.VERSION_NAME;

    public AbsSection(String str) {
        String str2 = "";
        this.name = str2;
        this.sep = str2;
        this.type = str;
    }

    public abstract String changeToStr();

    /* access modifiers changed from: 0000 */
    public String getDeclarationLine() {
        StringBuilder sb = new StringBuilder("section:");
        sb.append(this.name);
        String str = ",";
        sb.append(str);
        sb.append(this.type);
        sb.append(str);
        sb.append(this.version);
        sb.append(str);
        sb.append(this.sep);
        return sb.toString();
    }

    public void setSep(String str) {
        if (str.equals("\n")) {
            this.sep = SEP_LINE_BREAK;
        } else {
            this.sep = str;
        }
    }
}
