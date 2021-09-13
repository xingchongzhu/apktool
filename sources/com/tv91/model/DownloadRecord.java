package com.tv91.model;

import com.tv91.utils.C3052g;

/* renamed from: com.tv91.model.a */
public final class DownloadRecord {

    /* renamed from: a */
    public final long f14099a;

    /* renamed from: b */
    public final User f14100b;

    /* renamed from: c */
    public final Movie f14101c;

    /* renamed from: d */
    public final DownloadInfo f14102d;

    /* renamed from: e */
    public final String f14103e;

    /* renamed from: f */
    public final C2335a f14104f;

    /* renamed from: com.tv91.model.a$a */
    /* compiled from: DownloadRecord */
    public enum C2335a {
        DOWNLOADING,
        PAUSED,
        QUEUED,
        DONE,
        DELETED,
        MISSING,
        MOVED,
        EXPIRED;

        /* renamed from: a */
        public static C2335a m17632a(String str) {
            String lowerCase = str.toLowerCase();
            lowerCase.hashCode();
            char c = 65535;
            switch (lowerCase.hashCode()) {
                case -1309235419:
                    if (lowerCase.equals("expired")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1211129254:
                    if (lowerCase.equals("downloading")) {
                        c = 1;
                        break;
                    }
                    break;
                case -995321554:
                    if (lowerCase.equals("paused")) {
                        c = 2;
                        break;
                    }
                    break;
                case -948696717:
                    if (lowerCase.equals("queued")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3089282:
                    if (lowerCase.equals("done")) {
                        c = 4;
                        break;
                    }
                    break;
                case 104087219:
                    if (lowerCase.equals("moved")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1069449574:
                    if (lowerCase.equals("missing")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1550463001:
                    if (lowerCase.equals("deleted")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return EXPIRED;
                case 1:
                    return DOWNLOADING;
                case 2:
                    return PAUSED;
                case 3:
                    return QUEUED;
                case 4:
                    return DONE;
                case 5:
                    return MOVED;
                case 6:
                    return MISSING;
                case 7:
                    return DELETED;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown Status name ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
            }
        }

        public String toString() {
            return super.toString().toLowerCase();
        }
    }

    public DownloadRecord(long j, User user, Movie movie, DownloadInfo downloadInfo, String str, C2335a aVar) {
        this.f14099a = j;
        this.f14100b = user;
        this.f14101c = movie;
        this.f14102d = downloadInfo;
        this.f14103e = str;
        this.f14104f = aVar;
    }

    /* renamed from: a */
    public boolean mo17036a() {
        C2335a aVar = this.f14104f;
        return aVar == C2335a.DONE || aVar == C2335a.MOVED;
    }

    /* renamed from: b */
    public DownloadRecord mo17037b(C2335a aVar) {
        DownloadRecord aVar2 = new DownloadRecord(this.f14099a, this.f14100b, this.f14101c, this.f14102d, this.f14103e, aVar);
        return aVar2;
    }

    /* renamed from: c */
    public DownloadRecord mo17038c(Movie movie) {
        DownloadRecord aVar = new DownloadRecord(this.f14099a, this.f14100b, movie, this.f14102d, this.f14103e, this.f14104f);
        return aVar;
    }

    /* renamed from: d */
    public DownloadRecord mo17039d(User user) {
        DownloadRecord aVar = new DownloadRecord(this.f14099a, user, this.f14101c, this.f14102d, this.f14103e, this.f14104f);
        return aVar;
    }

    /* renamed from: e */
    public DownloadRecord mo17040e(String str, C2335a aVar) {
        DownloadRecord aVar2 = new DownloadRecord(this.f14099a, this.f14100b, this.f14101c, this.f14102d, str, aVar);
        return aVar2;
    }

    /* renamed from: f */
    public boolean mo17041f(DownloadRecord aVar) {
        return aVar != null && C3052g.m20581b(this.f14100b.f14097id, aVar.f14100b.f14097id) && this.f14101c.f14083id == aVar.f14101c.f14083id;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DownloadRecord{id=");
        sb.append(this.f14099a);
        sb.append(", user=");
        sb.append(this.f14100b);
        sb.append(", movie=");
        sb.append(this.f14101c);
        sb.append(", downloadInfo=");
        sb.append(this.f14102d);
        sb.append(", filePath='");
        sb.append(this.f14103e);
        sb.append('\'');
        sb.append(", status=");
        sb.append(this.f14104f);
        sb.append('}');
        return sb.toString();
    }
}
