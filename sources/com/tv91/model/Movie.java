package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;

@JsonDeserialize(builder = Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Movie {
    public final List<Actor> actors;
    public final List<Category> categories;
    public final Channel channel;
    public final String createTime;
    public final String description;
    public final int download;
    public final String duration;
    public final String extension;
    public final boolean favorite;
    public final int favoriteCount;
    public final long fileSize;

    /* renamed from: id */
    public final int f14083id;
    public final String image;
    public final String name;
    public final int playCount;
    public final int point;
    public final String poster;
    public final String resolution;
    public final String screenshot;
    public final Series series;
    public final int sourceId;
    public final Supplier supplier;
    public final int type;
    public final int typeId;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {
        /* access modifiers changed from: private */
        public List<Actor> actors;
        /* access modifiers changed from: private */
        public List<Category> categories;
        /* access modifiers changed from: private */
        public Channel channel;
        /* access modifiers changed from: private */
        public String createTime;
        /* access modifiers changed from: private */
        public String description;
        /* access modifiers changed from: private */
        public int download;
        /* access modifiers changed from: private */
        public String duration;
        /* access modifiers changed from: private */
        public String extension;
        /* access modifiers changed from: private */
        public boolean favorite;
        /* access modifiers changed from: private */
        public int favoriteCount;
        /* access modifiers changed from: private */
        public long fileSize;
        /* access modifiers changed from: private */

        /* renamed from: id */
        public int f14084id;
        /* access modifiers changed from: private */
        public String image;
        /* access modifiers changed from: private */
        public String name;
        /* access modifiers changed from: private */
        public int playCount;
        /* access modifiers changed from: private */
        public int point;
        /* access modifiers changed from: private */
        public String poster;
        /* access modifiers changed from: private */
        public String resolution;
        /* access modifiers changed from: private */
        public String screenshot;
        /* access modifiers changed from: private */
        public Series series;
        /* access modifiers changed from: private */
        public int sourceId = 1;
        /* access modifiers changed from: private */
        public Supplier supplier;
        /* access modifiers changed from: private */
        public int type;
        /* access modifiers changed from: private */
        public int typeId = 1;

        public Builder() {
        }

        @JsonProperty("Actor")
        public Builder actors(List<Actor> list) {
            this.actors = list;
            return this;
        }

        public Movie build() {
            return new Movie(this);
        }

        @JsonProperty("Class")
        public Builder categories(List<Category> list) {
            this.categories = list;
            return this;
        }

        @JsonProperty("Channel")
        public Builder channel(Channel channel2) {
            this.channel = channel2;
            return this;
        }

        @JsonProperty("CreateTime")
        public Builder createTime(String str) {
            this.createTime = str;
            return this;
        }

        @JsonProperty("Description")
        public Builder description(String str) {
            this.description = str;
            return this;
        }

        @JsonProperty("Download")
        public Builder download(int i) {
            this.download = i;
            return this;
        }

        @JsonProperty("Length")
        public Builder duration(String str) {
            this.duration = str;
            return this;
        }

        @JsonProperty("Extension")
        public Builder extension(String str) {
            this.extension = str;
            return this;
        }

        @JsonProperty("IsFavorite")
        public Builder favorite(boolean z) {
            this.favorite = z;
            return this;
        }

        @JsonProperty("FavoriteCount")
        public Builder favoriteCount(int i) {
            this.favoriteCount = i;
            return this;
        }

        @JsonProperty("FileSize")
        public Builder fileSize(long j) {
            this.fileSize = j;
            return this;
        }

        @JsonAlias({"ID"})
        @JsonProperty("MovieID")
        /* renamed from: id */
        public Builder mo16981id(int i) {
            this.f14084id = i;
            return this;
        }

        @JsonAlias({"Pic"})
        @JsonProperty("Img")
        public Builder image(String str) {
            this.image = str;
            return this;
        }

        @JsonAlias({"Title"})
        @JsonProperty("Name")
        public Builder name(String str) {
            this.name = str;
            return this;
        }

        @JsonProperty("PlayCount")
        public Builder playCount(int i) {
            this.playCount = i;
            return this;
        }

        @JsonProperty("Point")
        public Builder point(int i) {
            this.point = i;
            return this;
        }

        @JsonProperty("CoverImg")
        public Builder poster(String str) {
            this.poster = str;
            return this;
        }

        @JsonProperty("Resolution")
        public Builder resolution(String str) {
            this.resolution = str;
            return this;
        }

        @JsonProperty("CutPicName")
        public Builder screenshot(String str) {
            this.screenshot = str;
            return this;
        }

        @JsonProperty("Series")
        public Builder series(Series series2) {
            this.series = series2;
            return this;
        }

        @JsonProperty("SourceId")
        public Builder sourceId(int i) {
            this.sourceId = i;
            return this;
        }

        @JsonProperty("Supplier")
        public Builder supplier(Supplier supplier2) {
            this.supplier = supplier2;
            return this;
        }

        @JsonProperty("Type")
        public Builder type(int i) {
            this.type = i;
            return this;
        }

        @JsonProperty("TypeId")
        public Builder typeId(int i) {
            this.typeId = i;
            return this;
        }

        public Builder(Movie movie) {
            this.f14084id = movie.f14083id;
            this.name = movie.name;
            this.description = movie.description;
            this.createTime = movie.createTime;
            this.image = movie.image;
            this.poster = movie.poster;
            this.screenshot = movie.screenshot;
            this.duration = movie.duration;
            this.fileSize = movie.fileSize;
            this.resolution = movie.resolution;
            this.channel = movie.channel;
            this.categories = movie.categories;
            this.supplier = movie.supplier;
            this.series = movie.series;
            this.actors = movie.actors;
            this.point = movie.point;
            this.download = movie.download;
            this.type = movie.type;
            this.extension = movie.extension;
            this.favoriteCount = movie.favoriteCount;
            this.playCount = movie.playCount;
            this.favorite = movie.favorite;
            this.sourceId = movie.sourceId;
            this.typeId = movie.typeId;
        }
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Movie{id=");
        sb.append(this.f14083id);
        sb.append(", name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", description='");
        sb.append(this.description);
        sb.append('\'');
        sb.append(", createTime='");
        sb.append(this.createTime);
        sb.append('\'');
        sb.append(", image='");
        sb.append(this.image);
        sb.append('\'');
        sb.append(", poster='");
        sb.append(this.poster);
        sb.append('\'');
        sb.append(", screenshot='");
        sb.append(this.screenshot);
        sb.append('\'');
        sb.append(", duration='");
        sb.append(this.duration);
        sb.append('\'');
        sb.append(", fileSize=");
        sb.append(this.fileSize);
        sb.append(", resolution='");
        sb.append(this.resolution);
        sb.append('\'');
        sb.append(", channel=");
        sb.append(this.channel);
        sb.append(", categories=");
        sb.append(this.categories);
        sb.append(", supplier=");
        sb.append(this.supplier);
        sb.append(", series=");
        sb.append(this.series);
        sb.append(", actors=");
        sb.append(this.actors);
        sb.append(", point=");
        sb.append(this.point);
        sb.append(", download=");
        sb.append(this.download);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", extension='");
        sb.append(this.extension);
        sb.append('\'');
        sb.append(", favoriteCount=");
        sb.append(this.favoriteCount);
        sb.append(", playCount=");
        sb.append(this.playCount);
        sb.append(", favorite=");
        sb.append(this.favorite);
        sb.append(", sourceId=");
        sb.append(this.sourceId);
        sb.append(", typeId=");
        sb.append(this.typeId);
        sb.append('}');
        return sb.toString();
    }

    private Movie(Builder builder) {
        this.f14083id = builder.f14084id;
        this.name = builder.name;
        this.description = builder.description;
        this.createTime = builder.createTime;
        this.image = builder.image;
        this.poster = builder.poster;
        this.screenshot = builder.screenshot;
        this.duration = builder.duration;
        this.fileSize = builder.fileSize;
        this.resolution = builder.resolution;
        this.channel = builder.channel;
        this.categories = builder.categories;
        this.supplier = builder.supplier;
        this.series = builder.series;
        this.actors = builder.actors;
        this.point = builder.point;
        this.download = builder.download;
        this.type = builder.type;
        this.extension = builder.extension;
        this.favoriteCount = builder.favoriteCount;
        this.playCount = builder.playCount;
        this.favorite = builder.favorite;
        this.sourceId = builder.sourceId;
        this.typeId = builder.typeId;
    }
}
