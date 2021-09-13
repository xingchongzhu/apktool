package com.google.android.exoplayer2.p196ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.p196ui.TimeBar.C1884a;
import com.p259uc.crashsdk.export.CrashStatKey;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.C1155l1;
import p067c.p068a.p069a.p070a.C1155l1.C1156a;
import p067c.p068a.p069a.p070a.C1155l1.C1157b;
import p067c.p068a.p069a.p070a.ControlDispatcher;
import p067c.p068a.p069a.p070a.DefaultControlDispatcher;
import p067c.p068a.p069a.p070a.ExoPlaybackException;
import p067c.p068a.p069a.p070a.ExoPlayerLibraryInfo;
import p067c.p068a.p069a.p070a.MediaItem;
import p067c.p068a.p069a.p070a.PlaybackParameters;
import p067c.p068a.p069a.p070a.PlaybackPreparer;
import p067c.p068a.p069a.p070a.Player;
import p067c.p068a.p069a.p070a.Timeline;
import p067c.p068a.p069a.p070a.Timeline.C1256b;
import p067c.p068a.p069a.p070a.Timeline.C1257c;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p110l2.TrackSelectionArray;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.RepeatModeUtil;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.ui.j */
public class PlayerControlView extends FrameLayout {

    /* renamed from: A */
    private final Drawable f12018A;

    /* renamed from: B */
    private final Drawable f12019B;

    /* renamed from: C */
    private final float f12020C;

    /* renamed from: D */
    private final float f12021D;

    /* renamed from: G */
    private final String f12022G;

    /* renamed from: H */
    private final String f12023H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C1155l1 f12024I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public ControlDispatcher f12025J;

    /* renamed from: K */
    private C1871c f12026K;

    /* renamed from: L */
    private PlaybackPreparer f12027L;

    /* renamed from: M */
    private boolean f12028M;

    /* renamed from: N */
    private boolean f12029N;

    /* renamed from: O */
    private boolean f12030O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public boolean f12031P;

    /* renamed from: Q */
    private int f12032Q = 5000;

    /* renamed from: R */
    private int f12033R = CrashStatKey.LOG_LEGACY_TMP_FILE;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public int f12034S = 0;

    /* renamed from: T */
    private boolean f12035T = true;

    /* renamed from: U */
    private boolean f12036U = true;

    /* renamed from: V */
    private boolean f12037V = true;

    /* renamed from: W */
    private boolean f12038W = true;

    /* renamed from: a */
    private final C1870b f12039a;

    /* renamed from: a0 */
    private boolean f12040a0 = false;

    /* renamed from: b */
    private final CopyOnWriteArrayList<C1872d> f12041b;

    /* renamed from: b0 */
    private long f12042b0 = -9223372036854775807L;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final View f12043c;

    /* renamed from: c0 */
    private long[] f12044c0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final View f12045d;

    /* renamed from: d0 */
    private boolean[] f12046d0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final View f12047e;

    /* renamed from: e0 */
    private long[] f12048e0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final View f12049f;

    /* renamed from: f0 */
    private boolean[] f12050f0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final View f12051g;

    /* renamed from: g0 */
    private long f12052g0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final View f12053h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ImageView f12054i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final ImageView f12055j;

    /* renamed from: k */
    private final View f12056k;

    /* renamed from: l */
    private final TextView f12057l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final TextView f12058m;

    /* renamed from: n */
    private final TimeBar f12059n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final StringBuilder f12060o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Formatter f12061p;

    /* renamed from: q */
    private final C1256b f12062q;

    /* renamed from: r */
    private final C1257c f12063r;

    /* renamed from: s */
    private final Runnable f12064s;

    /* renamed from: t */
    private final Runnable f12065t;

    /* renamed from: u */
    private final Drawable f12066u;

    /* renamed from: v */
    private final Drawable f12067v;

    /* renamed from: w */
    private final Drawable f12068w;

    /* renamed from: x */
    private final String f12069x;

    /* renamed from: y */
    private final String f12070y;

    /* renamed from: z */
    private final String f12071z;

    /* renamed from: com.google.android.exoplayer2.ui.j$b */
    /* compiled from: PlayerControlView */
    private final class C1870b implements C1156a, C1884a, OnClickListener {
        private C1870b() {
        }

        /* renamed from: D */
        public /* synthetic */ void mo5615D(Timeline x1Var, int i) {
            Player.m9370s(this, x1Var, i);
        }

        /* renamed from: G */
        public /* synthetic */ void mo5618G(int i) {
            Player.m9361j(this, i);
        }

        /* renamed from: H */
        public /* synthetic */ void mo5619H(boolean z, int i) {
            Player.m9359h(this, z, i);
        }

        /* renamed from: L */
        public /* synthetic */ void mo5623L(TrackGroupArray q0Var, TrackSelectionArray lVar) {
            Player.m9372u(this, q0Var, lVar);
        }

        /* renamed from: P */
        public /* synthetic */ void mo5627P(boolean z) {
            Player.m9368q(this, z);
        }

        /* renamed from: R */
        public void mo5629R(C1155l1 l1Var, C1157b bVar) {
            if (bVar.mo7223c(5, 6)) {
                PlayerControlView.this.m14847T();
            }
            if (bVar.mo7223c(5, 6, 8)) {
                PlayerControlView.this.m14848U();
            }
            if (bVar.mo5741b(9)) {
                PlayerControlView.this.m14849V();
            }
            if (bVar.mo5741b(10)) {
                PlayerControlView.this.m14850W();
            }
            if (bVar.mo7223c(9, 10, 12, 0)) {
                PlayerControlView.this.m14846S();
            }
            if (bVar.mo7223c(12, 0)) {
                PlayerControlView.this.m14851X();
            }
        }

        /* renamed from: S */
        public /* synthetic */ void mo5630S(boolean z) {
            Player.m9353b(this, z);
        }

        /* renamed from: W */
        public /* synthetic */ void mo5634W(boolean z) {
            Player.m9354c(this, z);
        }

        /* renamed from: Z */
        public /* synthetic */ void mo5637Z(boolean z) {
            Player.m9356e(this, z);
        }

        /* renamed from: a */
        public void mo14847a(TimeBar uVar, long j) {
            if (PlayerControlView.this.f12058m != null) {
                PlayerControlView.this.f12058m.setText(Util.m10278a0(PlayerControlView.this.f12060o, PlayerControlView.this.f12061p, j));
            }
        }

        /* renamed from: b */
        public void mo14848b(TimeBar uVar, long j) {
            PlayerControlView.this.f12031P = true;
            if (PlayerControlView.this.f12058m != null) {
                PlayerControlView.this.f12058m.setText(Util.m10278a0(PlayerControlView.this.f12060o, PlayerControlView.this.f12061p, j));
            }
        }

        /* renamed from: c */
        public /* synthetic */ void mo5642c(int i) {
            Player.m9366o(this, i);
        }

        /* renamed from: d */
        public void mo14849d(TimeBar uVar, long j, boolean z) {
            PlayerControlView.this.f12031P = false;
            if (!z && PlayerControlView.this.f12024I != null) {
                PlayerControlView jVar = PlayerControlView.this;
                jVar.m14842N(jVar.f12024I, j);
            }
        }

        /* renamed from: e */
        public /* synthetic */ void mo5644e(PlaybackParameters i1Var) {
            Player.m9360i(this, i1Var);
        }

        /* renamed from: f */
        public /* synthetic */ void mo5645f(int i) {
            Player.m9362k(this, i);
        }

        /* renamed from: g */
        public /* synthetic */ void mo5646g(boolean z, int i) {
            Player.m9364m(this, z, i);
        }

        /* renamed from: i */
        public /* synthetic */ void mo5648i(boolean z) {
            Player.m9357f(this, z);
        }

        /* renamed from: j */
        public /* synthetic */ void mo5650j(int i) {
            Player.m9365n(this, i);
        }

        /* renamed from: o */
        public /* synthetic */ void mo5660o(List list) {
            Player.m9369r(this, list);
        }

        public void onClick(View view) {
            C1155l1 t = PlayerControlView.this.f12024I;
            if (t != null) {
                if (PlayerControlView.this.f12045d == view) {
                    PlayerControlView.this.f12025J.mo6800g(t);
                } else if (PlayerControlView.this.f12043c == view) {
                    PlayerControlView.this.f12025J.mo6798e(t);
                } else if (PlayerControlView.this.f12051g == view) {
                    if (t.mo7219q() != 4) {
                        PlayerControlView.this.f12025J.mo6796c(t);
                    }
                } else if (PlayerControlView.this.f12053h == view) {
                    PlayerControlView.this.f12025J.mo6801h(t);
                } else if (PlayerControlView.this.f12047e == view) {
                    PlayerControlView.this.m14834C(t);
                } else if (PlayerControlView.this.f12049f == view) {
                    PlayerControlView.this.m14833B(t);
                } else if (PlayerControlView.this.f12054i == view) {
                    PlayerControlView.this.f12025J.mo6794a(t, RepeatModeUtil.m10140a(t.mo7196K(), PlayerControlView.this.f12034S));
                } else if (PlayerControlView.this.f12055j == view) {
                    PlayerControlView.this.f12025J.mo6795b(t, !t.mo7200O());
                }
            }
        }

        /* renamed from: q */
        public /* synthetic */ void mo5664q(Timeline x1Var, Object obj, int i) {
            Player.m9371t(this, x1Var, obj, i);
        }

        /* renamed from: r */
        public /* synthetic */ void mo5666r(ExoPlaybackException p0Var) {
            Player.m9363l(this, p0Var);
        }

        /* renamed from: u */
        public /* synthetic */ void mo5669u(boolean z) {
            Player.m9355d(this, z);
        }

        /* renamed from: w */
        public /* synthetic */ void mo5671w() {
            Player.m9367p(this);
        }

        /* renamed from: x */
        public /* synthetic */ void mo5672x(MediaItem z0Var, int i) {
            Player.m9358g(this, z0Var, i);
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.j$c */
    /* compiled from: PlayerControlView */
    public interface C1871c {
        /* renamed from: a */
        void mo14851a(long j, long j2);
    }

    /* renamed from: com.google.android.exoplayer2.ui.j$d */
    /* compiled from: PlayerControlView */
    public interface C1872d {
        /* renamed from: a */
        void mo14785a(int i);
    }

    static {
        ExoPlayerLibraryInfo.m10920a("goog.exo.ui");
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int i2 = C1877o.exo_player_control_view;
        int i3 = 5000;
        int i4 = 15000;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C1879q.f12121w, 0, 0);
            try {
                i3 = obtainStyledAttributes.getInt(C1879q.f12073A, 5000);
                i4 = obtainStyledAttributes.getInt(C1879q.f12123y, 15000);
                this.f12032Q = obtainStyledAttributes.getInt(C1879q.f12079G, this.f12032Q);
                i2 = obtainStyledAttributes.getResourceId(C1879q.f12122x, i2);
                this.f12034S = m14836E(obtainStyledAttributes, this.f12034S);
                this.f12035T = obtainStyledAttributes.getBoolean(C1879q.f12077E, this.f12035T);
                this.f12036U = obtainStyledAttributes.getBoolean(C1879q.f12074B, this.f12036U);
                this.f12037V = obtainStyledAttributes.getBoolean(C1879q.f12076D, this.f12037V);
                this.f12038W = obtainStyledAttributes.getBoolean(C1879q.f12075C, this.f12038W);
                this.f12040a0 = obtainStyledAttributes.getBoolean(C1879q.f12078F, this.f12040a0);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(C1879q.f12080H, this.f12033R));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f12041b = new CopyOnWriteArrayList<>();
        this.f12062q = new C1256b();
        this.f12063r = new C1257c();
        StringBuilder sb = new StringBuilder();
        this.f12060o = sb;
        this.f12061p = new Formatter(sb, Locale.getDefault());
        this.f12044c0 = new long[0];
        this.f12046d0 = new boolean[0];
        this.f12048e0 = new long[0];
        this.f12050f0 = new boolean[0];
        C1870b bVar = new C1870b();
        this.f12039a = bVar;
        this.f12025J = new DefaultControlDispatcher((long) i4, (long) i3);
        this.f12064s = new C1866d(this);
        this.f12065t = new C1863a(this);
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        int i5 = C1875m.exo_progress;
        TimeBar uVar = (TimeBar) findViewById(i5);
        View findViewById = findViewById(C1875m.exo_progress_placeholder);
        if (uVar != null) {
            this.f12059n = uVar;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(i5);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.f12059n = defaultTimeBar;
        } else {
            this.f12059n = null;
        }
        this.f12057l = (TextView) findViewById(C1875m.exo_duration);
        this.f12058m = (TextView) findViewById(C1875m.exo_position);
        TimeBar uVar2 = this.f12059n;
        if (uVar2 != null) {
            uVar2.mo14705b(bVar);
        }
        View findViewById2 = findViewById(C1875m.exo_play);
        this.f12047e = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(bVar);
        }
        View findViewById3 = findViewById(C1875m.exo_pause);
        this.f12049f = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(bVar);
        }
        View findViewById4 = findViewById(C1875m.exo_prev);
        this.f12043c = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(bVar);
        }
        View findViewById5 = findViewById(C1875m.exo_next);
        this.f12045d = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(bVar);
        }
        View findViewById6 = findViewById(C1875m.exo_rew);
        this.f12053h = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(bVar);
        }
        View findViewById7 = findViewById(C1875m.exo_ffwd);
        this.f12051g = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(bVar);
        }
        ImageView imageView = (ImageView) findViewById(C1875m.exo_repeat_toggle);
        this.f12054i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(C1875m.exo_shuffle);
        this.f12055j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        View findViewById8 = findViewById(C1875m.exo_vr);
        this.f12056k = findViewById8;
        setShowVrButton(false);
        m14845R(false, false, findViewById8);
        Resources resources = context.getResources();
        this.f12020C = ((float) resources.getInteger(C1876n.exo_media_button_opacity_percentage_enabled)) / 100.0f;
        this.f12021D = ((float) resources.getInteger(C1876n.exo_media_button_opacity_percentage_disabled)) / 100.0f;
        this.f12066u = resources.getDrawable(C1874l.exo_controls_repeat_off);
        this.f12067v = resources.getDrawable(C1874l.exo_controls_repeat_one);
        this.f12068w = resources.getDrawable(C1874l.exo_controls_repeat_all);
        this.f12018A = resources.getDrawable(C1874l.exo_controls_shuffle_on);
        this.f12019B = resources.getDrawable(C1874l.exo_controls_shuffle_off);
        this.f12069x = resources.getString(C1878p.exo_controls_repeat_off_description);
        this.f12070y = resources.getString(C1878p.exo_controls_repeat_one_description);
        this.f12071z = resources.getString(C1878p.exo_controls_repeat_all_description);
        this.f12022G = resources.getString(C1878p.exo_controls_shuffle_on_description);
        this.f12023H = resources.getString(C1878p.exo_controls_shuffle_off_description);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m14833B(C1155l1 l1Var) {
        this.f12025J.mo6803j(l1Var, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m14834C(C1155l1 l1Var) {
        int q = l1Var.mo7219q();
        if (q == 1) {
            PlaybackPreparer j1Var = this.f12027L;
            if (j1Var != null) {
                j1Var.mo6805a();
            } else {
                this.f12025J.mo6797d(l1Var);
            }
        } else if (q == 4) {
            m14841M(l1Var, l1Var.mo7203R(), -9223372036854775807L);
        }
        this.f12025J.mo6803j(l1Var, true);
    }

    /* renamed from: D */
    private void m14835D(C1155l1 l1Var) {
        int q = l1Var.mo7219q();
        if (q == 1 || q == 4 || !l1Var.mo7217n()) {
            m14834C(l1Var);
        } else {
            m14833B(l1Var);
        }
    }

    /* renamed from: E */
    private static int m14836E(TypedArray typedArray, int i) {
        return typedArray.getInt(C1879q.f12124z, i);
    }

    /* renamed from: G */
    private void m14837G() {
        removeCallbacks(this.f12065t);
        if (this.f12032Q > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i = this.f12032Q;
            this.f12042b0 = uptimeMillis + ((long) i);
            if (this.f12028M) {
                postDelayed(this.f12065t, (long) i);
                return;
            }
            return;
        }
        this.f12042b0 = -9223372036854775807L;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: H */
    private static boolean m14838H(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* renamed from: L */
    private void m14840L() {
        boolean O = m14843O();
        if (!O) {
            View view = this.f12047e;
            if (view != null) {
                view.requestFocus();
                return;
            }
        }
        if (O) {
            View view2 = this.f12049f;
            if (view2 != null) {
                view2.requestFocus();
            }
        }
    }

    /* renamed from: M */
    private boolean m14841M(C1155l1 l1Var, int i, long j) {
        return this.f12025J.mo6804k(l1Var, i, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m14842N(C1155l1 l1Var, long j) {
        int i;
        Timeline M = l1Var.mo7198M();
        if (this.f12030O && !M.mo7743q()) {
            int p = M.mo6973p();
            i = 0;
            while (true) {
                long d = M.mo7742n(i, this.f12063r).mo7765d();
                if (j < d) {
                    break;
                } else if (i == p - 1) {
                    j = d;
                    break;
                } else {
                    j -= d;
                    i++;
                }
            }
        } else {
            i = l1Var.mo7203R();
        }
        if (!m14841M(l1Var, i, j)) {
            m14848U();
        }
    }

    /* renamed from: O */
    private boolean m14843O() {
        C1155l1 l1Var = this.f12024I;
        if (l1Var == null || l1Var.mo7219q() == 4 || this.f12024I.mo7219q() == 1 || !this.f12024I.mo7217n()) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    private void m14844Q() {
        m14847T();
        m14846S();
        m14849V();
        m14850W();
        m14851X();
    }

    /* renamed from: R */
    private void m14845R(boolean z, boolean z2, View view) {
        if (view != null) {
            view.setEnabled(z2);
            view.setAlpha(z2 ? this.f12020C : this.f12021D);
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m14846S() {
        /*
            r8 = this;
            boolean r0 = r8.mo14817I()
            if (r0 == 0) goto L_0x009a
            boolean r0 = r8.f12028M
            if (r0 != 0) goto L_0x000c
            goto L_0x009a
        L_0x000c:
            c.a.a.a.l1 r0 = r8.f12024I
            r1 = 0
            if (r0 == 0) goto L_0x0073
            c.a.a.a.x1 r2 = r0.mo7198M()
            boolean r3 = r2.mo7743q()
            if (r3 != 0) goto L_0x0073
            boolean r3 = r0.mo7213h()
            if (r3 != 0) goto L_0x0073
            int r3 = r0.mo7203R()
            c.a.a.a.x1$c r4 = r8.f12063r
            r2.mo7742n(r3, r4)
            c.a.a.a.x1$c r2 = r8.f12063r
            boolean r3 = r2.f8965j
            r4 = 1
            if (r3 != 0) goto L_0x0040
            boolean r2 = r2.mo7768f()
            if (r2 == 0) goto L_0x0040
            boolean r2 = r0.hasPrevious()
            if (r2 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r2 = 0
            goto L_0x0041
        L_0x0040:
            r2 = 1
        L_0x0041:
            if (r3 == 0) goto L_0x004d
            c.a.a.a.j0 r5 = r8.f12025J
            boolean r5 = r5.mo6799f()
            if (r5 == 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            if (r3 == 0) goto L_0x005a
            c.a.a.a.j0 r6 = r8.f12025J
            boolean r6 = r6.mo6802i()
            if (r6 == 0) goto L_0x005a
            r6 = 1
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            c.a.a.a.x1$c r7 = r8.f12063r
            boolean r7 = r7.mo7768f()
            if (r7 == 0) goto L_0x0069
            c.a.a.a.x1$c r7 = r8.f12063r
            boolean r7 = r7.f8966k
            if (r7 != 0) goto L_0x006f
        L_0x0069:
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0070
        L_0x006f:
            r1 = 1
        L_0x0070:
            r0 = r1
            r1 = r2
            goto L_0x0077
        L_0x0073:
            r0 = 0
            r3 = 0
            r5 = 0
            r6 = 0
        L_0x0077:
            boolean r2 = r8.f12037V
            android.view.View r4 = r8.f12043c
            r8.m14845R(r2, r1, r4)
            boolean r1 = r8.f12035T
            android.view.View r2 = r8.f12053h
            r8.m14845R(r1, r5, r2)
            boolean r1 = r8.f12036U
            android.view.View r2 = r8.f12051g
            r8.m14845R(r1, r6, r2)
            boolean r1 = r8.f12038W
            android.view.View r2 = r8.f12045d
            r8.m14845R(r1, r0, r2)
            com.google.android.exoplayer2.ui.u r0 = r8.f12059n
            if (r0 == 0) goto L_0x009a
            r0.setEnabled(r3)
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p196ui.PlayerControlView.m14846S():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m14847T() {
        boolean z;
        if (mo14817I() && this.f12028M) {
            boolean O = m14843O();
            View view = this.f12047e;
            int i = 8;
            boolean z2 = true;
            if (view != null) {
                z = (O && view.isFocused()) | false;
                this.f12047e.setVisibility(O ? 8 : 0);
            } else {
                z = false;
            }
            View view2 = this.f12049f;
            if (view2 != null) {
                if (O || !view2.isFocused()) {
                    z2 = false;
                }
                z |= z2;
                View view3 = this.f12049f;
                if (O) {
                    i = 0;
                }
                view3.setVisibility(i);
            }
            if (z) {
                m14840L();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m14848U() {
        long j;
        int i;
        if (mo14817I() && this.f12028M) {
            C1155l1 l1Var = this.f12024I;
            long j2 = 0;
            if (l1Var != null) {
                j2 = this.f12052g0 + l1Var.mo7214i();
                j = this.f12052g0 + l1Var.mo7202Q();
            } else {
                j = 0;
            }
            TextView textView = this.f12058m;
            if (textView != null && !this.f12031P) {
                textView.setText(Util.m10278a0(this.f12060o, this.f12061p, j2));
            }
            TimeBar uVar = this.f12059n;
            if (uVar != null) {
                uVar.setPosition(j2);
                this.f12059n.setBufferedPosition(j);
            }
            C1871c cVar = this.f12026K;
            if (cVar != null) {
                cVar.mo14851a(j2, j);
            }
            removeCallbacks(this.f12064s);
            if (l1Var == null) {
                i = 1;
            } else {
                i = l1Var.mo7219q();
            }
            long j3 = 1000;
            if (l1Var != null && l1Var.mo6405t()) {
                TimeBar uVar2 = this.f12059n;
                long min = Math.min(uVar2 != null ? uVar2.getPreferredUpdateDelay() : 1000, 1000 - (j2 % 1000));
                float f = l1Var.mo7208c().f7376b;
                if (f > 0.0f) {
                    j3 = (long) (((float) min) / f);
                }
                postDelayed(this.f12064s, Util.m10309q(j3, (long) this.f12033R, 1000));
            } else if (i != 4 && i != 1) {
                postDelayed(this.f12064s, 1000);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m14849V() {
        if (mo14817I() && this.f12028M) {
            ImageView imageView = this.f12054i;
            if (imageView != null) {
                if (this.f12034S == 0) {
                    m14845R(false, false, imageView);
                    return;
                }
                C1155l1 l1Var = this.f12024I;
                if (l1Var == null) {
                    m14845R(true, false, imageView);
                    this.f12054i.setImageDrawable(this.f12066u);
                    this.f12054i.setContentDescription(this.f12069x);
                    return;
                }
                m14845R(true, true, imageView);
                int K = l1Var.mo7196K();
                if (K == 0) {
                    this.f12054i.setImageDrawable(this.f12066u);
                    this.f12054i.setContentDescription(this.f12069x);
                } else if (K == 1) {
                    this.f12054i.setImageDrawable(this.f12067v);
                    this.f12054i.setContentDescription(this.f12070y);
                } else if (K == 2) {
                    this.f12054i.setImageDrawable(this.f12068w);
                    this.f12054i.setContentDescription(this.f12071z);
                }
                this.f12054i.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m14850W() {
        String str;
        if (mo14817I() && this.f12028M) {
            ImageView imageView = this.f12055j;
            if (imageView != null) {
                C1155l1 l1Var = this.f12024I;
                if (!this.f12040a0) {
                    m14845R(false, false, imageView);
                } else if (l1Var == null) {
                    m14845R(true, false, imageView);
                    this.f12055j.setImageDrawable(this.f12019B);
                    this.f12055j.setContentDescription(this.f12023H);
                } else {
                    m14845R(true, true, imageView);
                    this.f12055j.setImageDrawable(l1Var.mo7200O() ? this.f12018A : this.f12019B);
                    ImageView imageView2 = this.f12055j;
                    if (l1Var.mo7200O()) {
                        str = this.f12022G;
                    } else {
                        str = this.f12023H;
                    }
                    imageView2.setContentDescription(str);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m14851X() {
        int i;
        C1257c cVar;
        C1155l1 l1Var = this.f12024I;
        if (l1Var != null) {
            boolean z = true;
            this.f12030O = this.f12029N && m14876z(l1Var.mo7198M(), this.f12063r);
            long j = 0;
            this.f12052g0 = 0;
            Timeline M = l1Var.mo7198M();
            if (!M.mo7743q()) {
                int R = l1Var.mo7203R();
                boolean z2 = this.f12030O;
                int i2 = z2 ? 0 : R;
                int p = z2 ? M.mo6973p() - 1 : R;
                long j2 = 0;
                i = 0;
                while (true) {
                    if (i2 > p) {
                        break;
                    }
                    if (i2 == R) {
                        this.f12052g0 = C.m8861d(j2);
                    }
                    M.mo7742n(i2, this.f12063r);
                    C1257c cVar2 = this.f12063r;
                    if (cVar2.f8973r == -9223372036854775807L) {
                        Assertions.m10154f(this.f12030O ^ z);
                        break;
                    }
                    int i3 = cVar2.f8970o;
                    while (true) {
                        cVar = this.f12063r;
                        if (i3 > cVar.f8971p) {
                            break;
                        }
                        M.mo7738f(i3, this.f12062q);
                        int c = this.f12062q.mo7747c();
                        for (int i4 = 0; i4 < c; i4++) {
                            long f = this.f12062q.mo7751f(i4);
                            if (f == Long.MIN_VALUE) {
                                long j3 = this.f12062q.f8953d;
                                if (j3 == -9223372036854775807L) {
                                } else {
                                    f = j3;
                                }
                            }
                            long l = f + this.f12062q.mo7758l();
                            if (l >= 0) {
                                long[] jArr = this.f12044c0;
                                if (i == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.f12044c0 = Arrays.copyOf(jArr, length);
                                    this.f12046d0 = Arrays.copyOf(this.f12046d0, length);
                                }
                                this.f12044c0[i] = C.m8861d(j2 + l);
                                this.f12046d0[i] = this.f12062q.mo7759m(i4);
                                i++;
                            }
                        }
                        i3++;
                    }
                    j2 += cVar.f8973r;
                    i2++;
                    z = true;
                }
                j = j2;
            } else {
                i = 0;
            }
            long d = C.m8861d(j);
            TextView textView = this.f12057l;
            if (textView != null) {
                textView.setText(Util.m10278a0(this.f12060o, this.f12061p, d));
            }
            TimeBar uVar = this.f12059n;
            if (uVar != null) {
                uVar.setDuration(d);
                int length2 = this.f12048e0.length;
                int i5 = i + length2;
                long[] jArr2 = this.f12044c0;
                if (i5 > jArr2.length) {
                    this.f12044c0 = Arrays.copyOf(jArr2, i5);
                    this.f12046d0 = Arrays.copyOf(this.f12046d0, i5);
                }
                System.arraycopy(this.f12048e0, 0, this.f12044c0, i, length2);
                System.arraycopy(this.f12050f0, 0, this.f12046d0, i, length2);
                this.f12059n.mo14704a(this.f12044c0, this.f12046d0, i5);
            }
            m14848U();
        }
    }

    /* renamed from: z */
    private static boolean m14876z(Timeline x1Var, C1257c cVar) {
        if (x1Var.mo6973p() > 100) {
            return false;
        }
        int p = x1Var.mo6973p();
        for (int i = 0; i < p; i++) {
            if (x1Var.mo7742n(i, cVar).f8973r == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: A */
    public boolean mo14815A(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C1155l1 l1Var = this.f12024I;
        if (l1Var == null || !m14838H(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (l1Var.mo7219q() != 4) {
                    this.f12025J.mo6796c(l1Var);
                }
            } else if (keyCode == 89) {
                this.f12025J.mo6801h(l1Var);
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    m14835D(l1Var);
                } else if (keyCode == 87) {
                    this.f12025J.mo6800g(l1Var);
                } else if (keyCode == 88) {
                    this.f12025J.mo6798e(l1Var);
                } else if (keyCode == 126) {
                    m14834C(l1Var);
                } else if (keyCode == 127) {
                    m14833B(l1Var);
                }
            }
        }
        return true;
    }

    /* renamed from: F */
    public void mo14816F() {
        if (mo14817I()) {
            setVisibility(8);
            Iterator it = this.f12041b.iterator();
            while (it.hasNext()) {
                ((C1872d) it.next()).mo14785a(getVisibility());
            }
            removeCallbacks(this.f12064s);
            removeCallbacks(this.f12065t);
            this.f12042b0 = -9223372036854775807L;
        }
    }

    /* renamed from: I */
    public boolean mo14817I() {
        return getVisibility() == 0;
    }

    /* renamed from: K */
    public void mo14818K(C1872d dVar) {
        this.f12041b.remove(dVar);
    }

    /* renamed from: P */
    public void mo14819P() {
        if (!mo14817I()) {
            setVisibility(0);
            Iterator it = this.f12041b.iterator();
            while (it.hasNext()) {
                ((C1872d) it.next()).mo14785a(getVisibility());
            }
            m14844Q();
            m14840L();
        }
        m14837G();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return mo14815A(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f12065t);
        } else if (motionEvent.getAction() == 1) {
            m14837G();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C1155l1 getPlayer() {
        return this.f12024I;
    }

    public int getRepeatToggleModes() {
        return this.f12034S;
    }

    public boolean getShowShuffleButton() {
        return this.f12040a0;
    }

    public int getShowTimeoutMs() {
        return this.f12032Q;
    }

    public boolean getShowVrButton() {
        View view = this.f12056k;
        return view != null && view.getVisibility() == 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12028M = true;
        long j = this.f12042b0;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                mo14816F();
            } else {
                postDelayed(this.f12065t, uptimeMillis);
            }
        } else if (mo14817I()) {
            m14837G();
        }
        m14844Q();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12028M = false;
        removeCallbacks(this.f12064s);
        removeCallbacks(this.f12065t);
    }

    public void setControlDispatcher(ControlDispatcher j0Var) {
        if (this.f12025J != j0Var) {
            this.f12025J = j0Var;
            m14846S();
        }
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i) {
        ControlDispatcher j0Var = this.f12025J;
        if (j0Var instanceof DefaultControlDispatcher) {
            ((DefaultControlDispatcher) j0Var).mo7033m((long) i);
            m14846S();
        }
    }

    @Deprecated
    public void setPlaybackPreparer(PlaybackPreparer j1Var) {
        this.f12027L = j1Var;
    }

    public void setPlayer(C1155l1 l1Var) {
        boolean z = true;
        Assertions.m10154f(Looper.myLooper() == Looper.getMainLooper());
        if (!(l1Var == null || l1Var.mo7199N() == Looper.getMainLooper())) {
            z = false;
        }
        Assertions.m10149a(z);
        C1155l1 l1Var2 = this.f12024I;
        if (l1Var2 != l1Var) {
            if (l1Var2 != null) {
                l1Var2.mo7201P(this.f12039a);
            }
            this.f12024I = l1Var;
            if (l1Var != null) {
                l1Var.mo7192C(this.f12039a);
            }
            m14844Q();
        }
    }

    public void setProgressUpdateListener(C1871c cVar) {
        this.f12026K = cVar;
    }

    public void setRepeatToggleModes(int i) {
        this.f12034S = i;
        C1155l1 l1Var = this.f12024I;
        if (l1Var != null) {
            int K = l1Var.mo7196K();
            if (i == 0 && K != 0) {
                this.f12025J.mo6794a(this.f12024I, 0);
            } else if (i == 1 && K == 2) {
                this.f12025J.mo6794a(this.f12024I, 1);
            } else if (i == 2 && K == 1) {
                this.f12025J.mo6794a(this.f12024I, 2);
            }
        }
        m14849V();
    }

    @Deprecated
    public void setRewindIncrementMs(int i) {
        ControlDispatcher j0Var = this.f12025J;
        if (j0Var instanceof DefaultControlDispatcher) {
            ((DefaultControlDispatcher) j0Var).mo7034n((long) i);
            m14846S();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        this.f12036U = z;
        m14846S();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f12029N = z;
        m14851X();
    }

    public void setShowNextButton(boolean z) {
        this.f12038W = z;
        m14846S();
    }

    public void setShowPreviousButton(boolean z) {
        this.f12037V = z;
        m14846S();
    }

    public void setShowRewindButton(boolean z) {
        this.f12035T = z;
        m14846S();
    }

    public void setShowShuffleButton(boolean z) {
        this.f12040a0 = z;
        m14850W();
    }

    public void setShowTimeoutMs(int i) {
        this.f12032Q = i;
        if (mo14817I()) {
            m14837G();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.f12056k;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f12033R = Util.m10307p(i, 16, 1000);
    }

    public void setVrButtonListener(OnClickListener onClickListener) {
        View view = this.f12056k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            m14845R(getShowVrButton(), onClickListener != null, this.f12056k);
        }
    }

    /* renamed from: y */
    public void mo14846y(C1872d dVar) {
        Assertions.m10153e(dVar);
        this.f12041b.add(dVar);
    }
}
