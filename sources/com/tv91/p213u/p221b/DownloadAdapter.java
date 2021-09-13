package com.tv91.p213u.p221b;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.p205h.RecyclerAdapter;
import com.tv91.features.shared.p205h.ViewHolder;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.widget.DrawableTextView;
import com.tv91.model.DownloadRecord;
import com.tv91.model.DownloadRecord.C2335a;
import com.tv91.p210r.AdapterDownloadBinding;
import com.tv91.utils.C3052g;
import java.io.File;
import java.util.Objects;
import p010b.p034g.p042j.Consumer;
import p010b.p034g.p042j.Supplier;

/* renamed from: com.tv91.u.b.p0 */
final class DownloadAdapter extends RecyclerAdapter<DownloadRecord, C2482b> {

    /* renamed from: e */
    private Consumer<DownloadRecord> f14970e = C2462g.f14944a;

    /* renamed from: f */
    private Consumer<DownloadRecord> f14971f = C2452b.f14930a;

    /* renamed from: g */
    private Consumer<DownloadRecord> f14972g = C2460f.f14942a;

    /* renamed from: h */
    private Consumer<DownloadRecord> f14973h = C2458e.f14940a;

    /* renamed from: i */
    private boolean f14974i;

    /* renamed from: com.tv91.u.b.p0$a */
    /* compiled from: DownloadAdapter */
    static /* synthetic */ class C2481a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14975a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tv91.model.a$a[] r0 = com.tv91.model.DownloadRecord.C2335a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14975a = r0
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14975a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.MOVED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14975a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.DOWNLOADING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14975a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.PAUSED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14975a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.QUEUED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f14975a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.MISSING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f14975a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tv91.model.a$a r1 = com.tv91.model.DownloadRecord.C2335a.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tv91.p213u.p221b.DownloadAdapter.C2481a.<clinit>():void");
        }
    }

    /* renamed from: com.tv91.u.b.p0$b */
    /* compiled from: DownloadAdapter */
    static class C2482b extends ViewHolder<DownloadRecord> {

        /* renamed from: A */
        private final int f14976A;

        /* renamed from: B */
        private final int f14977B;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public final AdapterDownloadBinding f14978w;

        /* renamed from: x */
        private final Drawable f14979x;

        /* renamed from: y */
        private final Drawable f14980y;

        /* renamed from: z */
        private final Drawable f14981z;

        /* synthetic */ C2482b(AdapterDownloadBinding bVar, C2481a aVar) {
            this(bVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: W */
        public void m18289W(DownloadRecord aVar, boolean z) {
            this.f13991v.mo18692b(aVar.f14101c.poster).mo18695e(R.drawable.photo_poster_medium).mo18693c(R.drawable.photo_poster_medium).mo18697g(this.f14978w.f14301c);
            this.f14978w.f14310l.setText(aVar.f14101c.name);
            this.f14978w.f14309k.setText(Formatter.formatFileSize(this.f13990u, aVar.f14101c.fileSize));
            switch (C2481a.f14975a[aVar.f14104f.ordinal()]) {
                case 1:
                case 2:
                    m18294c0(aVar, z);
                    break;
                case 3:
                    m18295d0(m18290X(aVar), z);
                    break;
                case 4:
                case 5:
                    m18298g0(m18290X(aVar), z);
                    break;
                case 6:
                    m18297f0(z);
                    break;
                case 7:
                    m18296e0(m18290X(aVar), z);
                    break;
            }
            this.f14978w.f14307i.setVisibility(z ? 0 : 8);
        }

        /* renamed from: X */
        private int m18290X(DownloadRecord aVar) {
            Uri parse = C3052g.m20586g(aVar.f14103e) ? null : Uri.parse(aVar.f14103e);
            if (parse == null || !C3052g.m20581b(parse.getScheme(), "file")) {
                return 0;
            }
            File file = new File(parse.getPath());
            if (file.exists()) {
                return (int) ((((float) file.length()) * 100.0f) / ((float) aVar.f14101c.fileSize));
            }
            return 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: Y */
        public void m18291Y(Supplier<DownloadRecord> iVar, OnClickListener onClickListener) {
            this.f14978w.f14300b.setOnClickListener(Clicks.m17391a(new C2454c(this, iVar, onClickListener)));
            this.f14978w.f14308j.setOnClickListener(Clicks.m17391a(new C2456d(iVar, onClickListener)));
            this.f14978w.f14307i.setOnClickListener(Clicks.m17391a(onClickListener));
            this.f14978w.f14305g.setOnClickListener(Clicks.m17391a(onClickListener));
        }

        /* access modifiers changed from: private */
        /* renamed from: Z */
        public /* synthetic */ void mo17355a0(Supplier iVar, OnClickListener onClickListener, View view) {
            C2335a aVar = ((DownloadRecord) iVar.mo4947a()).f14104f;
            if (aVar == C2335a.DOWNLOADING || aVar == C2335a.QUEUED || aVar == C2335a.PAUSED || aVar == C2335a.EXPIRED) {
                view.setVisibility(8);
                this.f14978w.f14303e.setVisibility(0);
                onClickListener.onClick(view);
            }
        }

        /* renamed from: b0 */
        static /* synthetic */ void m18293b0(Supplier iVar, OnClickListener onClickListener, View view) {
            if (((DownloadRecord) iVar.mo4947a()).mo17036a()) {
                onClickListener.onClick(view);
            }
        }

        /* renamed from: c0 */
        private void m18294c0(DownloadRecord aVar, boolean z) {
            int i = 0;
            boolean z2 = aVar.f14104f == C2335a.DONE;
            this.f14978w.f14302d.setImageDrawable(null);
            this.f14978w.f14304f.setVisibility(8);
            this.f14978w.f14306h.setVisibility(8);
            this.f14978w.f14300b.setVisibility(8);
            this.f14978w.f14303e.setVisibility(8);
            this.f14978w.f14308j.setText(z2 ? R.string.download_content_status_done : R.string.download_content_status_moved);
            this.f14978w.f14308j.setTextColor(this.f14976A);
            DrawableTextView drawableTextView = this.f14978w.f14305g;
            if (!z || !z2) {
                i = 8;
            }
            drawableTextView.setVisibility(i);
        }

        /* renamed from: d0 */
        private void m18295d0(int i, boolean z) {
            this.f14978w.f14302d.setImageDrawable(this.f14979x);
            int i2 = 0;
            this.f14978w.f14304f.setVisibility(0);
            this.f14978w.f14304f.setProgress(i);
            this.f14978w.f14306h.setVisibility(0);
            this.f14978w.f14306h.setText(C3052g.m20582c("%d%%", Integer.valueOf(i)));
            this.f14978w.f14300b.setVisibility(0);
            this.f14978w.f14300b.setImageDrawable(this.f14980y);
            this.f14978w.f14303e.setVisibility(8);
            this.f14978w.f14308j.setText(R.string.download_content_status_downloading);
            this.f14978w.f14308j.setTextColor(this.f14977B);
            DrawableTextView drawableTextView = this.f14978w.f14307i;
            if (!z) {
                i2 = 8;
            }
            drawableTextView.setVisibility(i2);
        }

        /* renamed from: e0 */
        private void m18296e0(int i, boolean z) {
            this.f14978w.f14302d.setImageDrawable(this.f14979x);
            int i2 = 0;
            this.f14978w.f14304f.setVisibility(0);
            this.f14978w.f14304f.setProgress(i);
            this.f14978w.f14306h.setVisibility(0);
            this.f14978w.f14306h.setText(C3052g.m20582c("%d%%", Integer.valueOf(i)));
            this.f14978w.f14300b.setImageDrawable(this.f14981z);
            this.f14978w.f14303e.setVisibility(8);
            this.f14978w.f14308j.setText(R.string.download_content_status_expired);
            this.f14978w.f14308j.setTextColor(this.f14976A);
            DrawableTextView drawableTextView = this.f14978w.f14307i;
            if (!z) {
                i2 = 8;
            }
            drawableTextView.setVisibility(i2);
        }

        /* renamed from: f0 */
        private void m18297f0(boolean z) {
            this.f14978w.f14302d.setImageDrawable(this.f14979x);
            int i = 8;
            this.f14978w.f14304f.setVisibility(8);
            this.f14978w.f14306h.setVisibility(8);
            this.f14978w.f14300b.setVisibility(8);
            this.f14978w.f14303e.setVisibility(8);
            this.f14978w.f14308j.setText(R.string.download_content_status_missing);
            this.f14978w.f14308j.setTextColor(this.f14976A);
            DrawableTextView drawableTextView = this.f14978w.f14307i;
            if (z) {
                i = 0;
            }
            drawableTextView.setVisibility(i);
        }

        /* renamed from: g0 */
        private void m18298g0(int i, boolean z) {
            this.f14978w.f14302d.setImageDrawable(this.f14979x);
            int i2 = 0;
            this.f14978w.f14304f.setVisibility(0);
            this.f14978w.f14304f.setProgress(i);
            this.f14978w.f14306h.setVisibility(0);
            this.f14978w.f14306h.setText(C3052g.m20582c("%d%%", Integer.valueOf(i)));
            this.f14978w.f14300b.setImageDrawable(this.f14981z);
            this.f14978w.f14300b.setVisibility(0);
            this.f14978w.f14303e.setVisibility(8);
            this.f14978w.f14308j.setText(R.string.download_content_status_pause);
            this.f14978w.f14308j.setTextColor(this.f14976A);
            DrawableTextView drawableTextView = this.f14978w.f14307i;
            if (!z) {
                i2 = 8;
            }
            drawableTextView.setVisibility(i2);
        }

        private C2482b(AdapterDownloadBinding bVar) {
            super(bVar);
            this.f14978w = bVar;
            this.f14979x = new ColorDrawable(mo16846O(R.color.black_translucent_38));
            this.f14980y = mo16848Q(R.drawable.ic_pause_circular);
            this.f14981z = mo16848Q(R.drawable.ic_play_circular);
            this.f14976A = mo16846O(R.color.white_translucent_50);
            this.f14977B = mo16846O(R.color.color_accent);
        }
    }

    DownloadAdapter() {
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void mo17347O(C2482b bVar, View view) {
        DownloadRecord aVar = (DownloadRecord) mo16833B(bVar.mo3369j());
        if (view == bVar.f14978w.f14300b) {
            this.f14970e.mo4887a(aVar);
        } else if (view == bVar.f14978w.f14308j) {
            this.f14971f.mo4887a(aVar);
        } else if (view == bVar.f14978w.f14307i) {
            this.f14972g.mo4887a(aVar);
        } else if (view == bVar.f14978w.f14305g) {
            this.f14973h.mo4887a(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ DownloadRecord mo17348Q(C2482b bVar) {
        return (DownloadRecord) mo16833B(bVar.mo3369j());
    }

    /* renamed from: R */
    static /* synthetic */ void m18269R(DownloadRecord aVar) {
    }

    /* renamed from: S */
    static /* synthetic */ void m18270S(DownloadRecord aVar) {
    }

    /* renamed from: T */
    static /* synthetic */ void m18271T(DownloadRecord aVar) {
    }

    /* renamed from: U */
    static /* synthetic */ void m18272U(DownloadRecord aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public C2482b mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        C2482b bVar = new C2482b(AdapterDownloadBinding.m17681d(layoutInflater, viewGroup, false), null);
        bVar.m18291Y(new C2464h(this, bVar), new C2450a(this, bVar));
        return bVar;
    }

    /* renamed from: M */
    public int mo16834C(DownloadRecord aVar) {
        for (ITEM item : this.f13983c) {
            if (item.mo17041f(aVar)) {
                return this.f13983c.indexOf(item);
            }
        }
        return super.mo16834C(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: V */
    public void mo17349V(Consumer<DownloadRecord> aVar) {
        if (aVar != null) {
            this.f14970e = aVar;
        }
    }

    /* renamed from: W */
    public void mo3419m(C2482b bVar, int i) {
        Object B = mo16833B(i);
        Objects.requireNonNull(B);
        bVar.m18289W((DownloadRecord) B, this.f14974i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: X */
    public void mo17351X(Consumer<DownloadRecord> aVar) {
        if (aVar != null) {
            this.f14973h = aVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Y */
    public void mo17352Y(Consumer<DownloadRecord> aVar) {
        if (aVar != null) {
            this.f14972g = aVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Z */
    public void mo17353Z(Consumer<DownloadRecord> aVar) {
        if (aVar != null) {
            this.f14971f = aVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a0 */
    public void mo17354a0() {
        this.f14974i = !this.f14974i;
        mo3414h();
    }
}
