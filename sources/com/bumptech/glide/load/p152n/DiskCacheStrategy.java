package com.bumptech.glide.load.p152n;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: com.bumptech.glide.load.n.j */
public abstract class DiskCacheStrategy {

    /* renamed from: a */
    public static final DiskCacheStrategy f10555a = new C1485a();

    /* renamed from: b */
    public static final DiskCacheStrategy f10556b = new C1486b();

    /* renamed from: c */
    public static final DiskCacheStrategy f10557c = new C1487c();

    /* renamed from: d */
    public static final DiskCacheStrategy f10558d = new C1488d();

    /* renamed from: e */
    public static final DiskCacheStrategy f10559e = new C1489e();

    /* renamed from: com.bumptech.glide.load.n.j$a */
    /* compiled from: DiskCacheStrategy */
    class C1485a extends DiskCacheStrategy {
        C1485a() {
        }

        /* renamed from: a */
        public boolean mo9015a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo9016b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo9017c(DataSource aVar) {
            return aVar == DataSource.REMOTE;
        }

        /* renamed from: d */
        public boolean mo9018d(boolean z, DataSource aVar, EncodeStrategy cVar) {
            return (aVar == DataSource.RESOURCE_DISK_CACHE || aVar == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.j$b */
    /* compiled from: DiskCacheStrategy */
    class C1486b extends DiskCacheStrategy {
        C1486b() {
        }

        /* renamed from: a */
        public boolean mo9015a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo9016b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo9017c(DataSource aVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo9018d(boolean z, DataSource aVar, EncodeStrategy cVar) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.j$c */
    /* compiled from: DiskCacheStrategy */
    class C1487c extends DiskCacheStrategy {
        C1487c() {
        }

        /* renamed from: a */
        public boolean mo9015a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo9016b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo9017c(DataSource aVar) {
            return (aVar == DataSource.DATA_DISK_CACHE || aVar == DataSource.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: d */
        public boolean mo9018d(boolean z, DataSource aVar, EncodeStrategy cVar) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.j$d */
    /* compiled from: DiskCacheStrategy */
    class C1488d extends DiskCacheStrategy {
        C1488d() {
        }

        /* renamed from: a */
        public boolean mo9015a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo9016b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo9017c(DataSource aVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo9018d(boolean z, DataSource aVar, EncodeStrategy cVar) {
            return (aVar == DataSource.RESOURCE_DISK_CACHE || aVar == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.j$e */
    /* compiled from: DiskCacheStrategy */
    class C1489e extends DiskCacheStrategy {
        C1489e() {
        }

        /* renamed from: a */
        public boolean mo9015a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo9016b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo9017c(DataSource aVar) {
            return aVar == DataSource.REMOTE;
        }

        /* renamed from: d */
        public boolean mo9018d(boolean z, DataSource aVar, EncodeStrategy cVar) {
            return ((z && aVar == DataSource.DATA_DISK_CACHE) || aVar == DataSource.LOCAL) && cVar == EncodeStrategy.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo9015a();

    /* renamed from: b */
    public abstract boolean mo9016b();

    /* renamed from: c */
    public abstract boolean mo9017c(DataSource aVar);

    /* renamed from: d */
    public abstract boolean mo9018d(boolean z, DataSource aVar, EncodeStrategy cVar);
}
