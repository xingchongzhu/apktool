package com.efs.sdk.base.protocol.file.section;

public class TextSection extends AbsSection {
    private String body;

    public TextSection(String str) {
        super("text");
        this.name = str;
    }

    public String changeToStr() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDeclarationLine());
        String str = "\n";
        sb.append(str);
        sb.append(this.body);
        sb.append(str);
        return sb.toString();
    }

    public void setBody(String str) {
        this.body = str;
    }
}
