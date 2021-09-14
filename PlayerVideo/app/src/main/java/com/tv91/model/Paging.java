package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Paging<E> {
    private final List<E> data;
    public final int pageCount;
    public final int totalSize;

    @JsonCreator
    public Paging(@JsonProperty("Total") int i, @JsonProperty("PageCount") int i2, @JsonAlias({"Data", "Movies"}) @JsonProperty("Data") List<E> list) {
        this.totalSize = i;
        this.pageCount = i2;
        this.data = list;
    }

    public static <E> Paging<E> empty() {
        return new Paging<>(0, 0, Collections.emptyList());
    }

    public List<E> getData() {
        return this.data;
    }

    public List<E> getMovies() {
        return this.data;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paging{totalSize=");
        sb.append(this.totalSize);
        sb.append(", pageCount=");
        sb.append(this.pageCount);
        sb.append(", data=");
        sb.append(this.data);
        sb.append('}');
        return sb.toString();
    }
}
