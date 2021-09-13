package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ProductGroup {
    public final int groupId;
    public final String image;
    public final List<Product> products;
    public final String subTitle;
    public final String title;

    @JsonCreator
    public ProductGroup(@JsonProperty("Program") int i, @JsonProperty("Title") String str, @JsonProperty("Desc") String str2, @JsonProperty("BkgdImg") String str3, @JsonProperty("info") List<Product> list) {
        this.groupId = i;
        this.title = str;
        this.subTitle = str2;
        this.image = str3;
        this.products = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductGroup{groupId=");
        sb.append(this.groupId);
        sb.append(", title='");
        sb.append(this.title);
        sb.append('\'');
        sb.append(", subTitle='");
        sb.append(this.subTitle);
        sb.append('\'');
        sb.append(", image='");
        sb.append(this.image);
        sb.append('\'');
        sb.append(", products=");
        sb.append(this.products);
        sb.append('}');
        return sb.toString();
    }
}
