package com.tv91.features.shared.p206i;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.tv91.features.shared.i.e */
public final class Clicks {

    /* renamed from: com.tv91.features.shared.i.e$b */
    /* compiled from: Clicks */
    private static class C2306b implements OnClickListener {

        /* renamed from: a */
        private final long f13997a;

        /* renamed from: b */
        private final OnClickListener f13998b;

        /* renamed from: c */
        private long f13999c;

        /* renamed from: a */
        static /* synthetic */ void m17392a(View view) {
        }

        public void onClick(View view) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                if (currentTimeMillis - this.f13999c > this.f13997a) {
                    this.f13998b.onClick(view);
                }
            } finally {
                this.f13999c = currentTimeMillis;
            }
        }

        private C2306b(long j, OnClickListener onClickListener) {
            this.f13999c = 0;
            this.f13997a = j;
            if (onClickListener == null) {
                onClickListener = C2301a.f13992a;
            }
            this.f13998b = onClickListener;
        }
    }

    /* renamed from: a */
    public static OnClickListener m17391a(OnClickListener onClickListener) {
        return new C2306b(500, onClickListener);
    }
}
