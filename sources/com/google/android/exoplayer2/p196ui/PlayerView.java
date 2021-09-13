package com.google.android.exoplayer2.p196ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.exoplayer2.p196ui.AspectRatioFrameLayout.C1855b;
import com.google.android.exoplayer2.p196ui.PlayerControlView.C1872d;
import com.google.android.exoplayer2.p196ui.p197x.SingleTapListener;
import com.google.android.exoplayer2.p196ui.p197x.SphericalGLSurfaceView;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.C1155l1;
import p067c.p068a.p069a.p070a.C1155l1.C1156a;
import p067c.p068a.p069a.p070a.C1155l1.C1157b;
import p067c.p068a.p069a.p070a.C1155l1.C1158c;
import p067c.p068a.p069a.p070a.C1155l1.C1159d;
import p067c.p068a.p069a.p070a.ControlDispatcher;
import p067c.p068a.p069a.p070a.ExoPlaybackException;
import p067c.p068a.p069a.p070a.MediaItem;
import p067c.p068a.p069a.p070a.PlaybackParameters;
import p067c.p068a.p069a.p070a.PlaybackPreparer;
import p067c.p068a.p069a.p070a.Player;
import p067c.p068a.p069a.p070a.Timeline;
import p067c.p068a.p069a.p070a.Timeline.C1256b;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p088h2.p091k.PictureFrame;
import p067c.p068a.p069a.p070a.p088h2.p093m.ApicFrame;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p097j2.p098s0.AdsLoader;
import p067c.p068a.p069a.p070a.p097j2.p098s0.C1109c;
import p067c.p068a.p069a.p070a.p097j2.p098s0.C1110d;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.TextOutput;
import p067c.p068a.p069a.p070a.p110l2.TrackSelectionArray;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ErrorMessageProvider;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p069a.p070a.p112n2.C1223y;
import p067c.p068a.p069a.p070a.p112n2.VideoDecoderGLSurfaceView;
import p067c.p068a.p069a.p070a.p112n2.VideoListener;
import p067c.p068a.p134b.p136b.ImmutableList;

/* renamed from: com.google.android.exoplayer2.ui.PlayerView */
public class PlayerView extends FrameLayout implements C1109c {

    /* renamed from: A */
    private boolean f11945A;

    /* renamed from: a */
    private final C1857a f11946a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AspectRatioFrameLayout f11947b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final View f11948c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final View f11949d;

    /* renamed from: e */
    private final ImageView f11950e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final SubtitleView f11951f;

    /* renamed from: g */
    private final View f11952g;

    /* renamed from: h */
    private final TextView f11953h;

    /* renamed from: i */
    private final PlayerControlView f11954i;

    /* renamed from: j */
    private final FrameLayout f11955j;

    /* renamed from: k */
    private final FrameLayout f11956k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C1155l1 f11957l;

    /* renamed from: m */
    private boolean f11958m;

    /* renamed from: n */
    private C1872d f11959n;

    /* renamed from: o */
    private boolean f11960o;

    /* renamed from: p */
    private Drawable f11961p;

    /* renamed from: q */
    private int f11962q;

    /* renamed from: r */
    private boolean f11963r;

    /* renamed from: s */
    private boolean f11964s;

    /* renamed from: t */
    private ErrorMessageProvider<? super ExoPlaybackException> f11965t;

    /* renamed from: u */
    private CharSequence f11966u;

    /* renamed from: v */
    private int f11967v;

    /* renamed from: w */
    private boolean f11968w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f11969x;

    /* renamed from: y */
    private boolean f11970y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f11971z;

    /* renamed from: com.google.android.exoplayer2.ui.PlayerView$a */
    private final class C1857a implements C1156a, TextOutput, C1223y, OnLayoutChangeListener, SingleTapListener, C1872d {

        /* renamed from: a */
        private final C1256b f11972a = new C1256b();

        /* renamed from: b */
        private Object f11973b;

        public C1857a() {
        }

        /* renamed from: D */
        public /* synthetic */ void mo5615D(Timeline x1Var, int i) {
            Player.m9370s(this, x1Var, i);
        }

        /* renamed from: G */
        public void mo5618G(int i) {
            PlayerView.this.m14738J();
            PlayerView.this.m14741M();
            PlayerView.this.m14740L();
        }

        /* renamed from: H */
        public void mo5619H(boolean z, int i) {
            PlayerView.this.m14738J();
            PlayerView.this.m14740L();
        }

        /* renamed from: L */
        public void mo5623L(TrackGroupArray q0Var, TrackSelectionArray lVar) {
            C1155l1 l1Var = (C1155l1) Assertions.m10153e(PlayerView.this.f11957l);
            Timeline M = l1Var.mo7198M();
            if (M.mo7743q()) {
                this.f11973b = null;
            } else if (!l1Var.mo7195I().mo6990n()) {
                this.f11973b = M.mo5990g(l1Var.mo7221u(), this.f11972a, true).f8951b;
            } else {
                Object obj = this.f11973b;
                if (obj != null) {
                    int b = M.mo5987b(obj);
                    if (b == -1 || l1Var.mo7203R() != M.mo7738f(b, this.f11972a).f8952c) {
                        this.f11973b = null;
                    } else {
                        return;
                    }
                }
            }
            PlayerView.this.m14742N(false);
        }

        /* renamed from: P */
        public /* synthetic */ void mo5627P(boolean z) {
            Player.m9368q(this, z);
        }

        /* renamed from: R */
        public /* synthetic */ void mo5629R(C1155l1 l1Var, C1157b bVar) {
            Player.m9352a(this, l1Var, bVar);
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
        public void mo14785a(int i) {
            PlayerView.this.m14739K();
        }

        /* renamed from: b */
        public void mo7599b(int i, int i2, int i3, float f) {
            float f2 = (i2 == 0 || i == 0) ? 1.0f : (((float) i) * f) / ((float) i2);
            if (PlayerView.this.f11949d instanceof TextureView) {
                if (i3 == 90 || i3 == 270) {
                    f2 = 1.0f / f2;
                }
                if (PlayerView.this.f11971z != 0) {
                    PlayerView.this.f11949d.removeOnLayoutChangeListener(this);
                }
                PlayerView.this.f11971z = i3;
                if (PlayerView.this.f11971z != 0) {
                    PlayerView.this.f11949d.addOnLayoutChangeListener(this);
                }
                PlayerView.m14761q((TextureView) PlayerView.this.f11949d, PlayerView.this.f11971z);
            }
            PlayerView playerView = PlayerView.this;
            playerView.mo14733B(f2, playerView.f11947b, PlayerView.this.f11949d);
        }

        /* renamed from: c */
        public /* synthetic */ void mo5642c(int i) {
            Player.m9366o(this, i);
        }

        /* renamed from: d */
        public void mo7600d() {
            if (PlayerView.this.f11948c != null) {
                PlayerView.this.f11948c.setVisibility(4);
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

        /* renamed from: h */
        public /* synthetic */ void mo7601h(int i, int i2) {
            VideoListener.m10627a(this, i, i2);
        }

        /* renamed from: i */
        public /* synthetic */ void mo5648i(boolean z) {
            Player.m9357f(this, z);
        }

        /* renamed from: j */
        public void mo5650j(int i) {
            if (PlayerView.this.m14767z() && PlayerView.this.f11969x) {
                PlayerView.this.mo14783w();
            }
        }

        /* renamed from: o */
        public /* synthetic */ void mo5660o(List list) {
            Player.m9369r(this, list);
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.m14761q((TextureView) view, PlayerView.this.f11971z);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return PlayerView.this.m14737I();
        }

        /* renamed from: q */
        public /* synthetic */ void mo5664q(Timeline x1Var, Object obj, int i) {
            Player.m9371t(this, x1Var, obj, i);
        }

        /* renamed from: r */
        public /* synthetic */ void mo5666r(ExoPlaybackException p0Var) {
            Player.m9363l(this, p0Var);
        }

        /* renamed from: t */
        public void mo7067t(List<Cue> list) {
            if (PlayerView.this.f11951f != null) {
                PlayerView.this.f11951f.mo7067t(list);
            }
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

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: A */
    private void m14731A(boolean z) {
        if ((!m14767z() || !this.f11969x) && m14744P()) {
            boolean z2 = this.f11954i.mo14817I() && this.f11954i.getShowTimeoutMs() <= 0;
            boolean F = m14735F();
            if (z || z2 || F) {
                m14736H(F);
            }
        }
    }

    @RequiresNonNull({"artworkView"})
    /* renamed from: C */
    private boolean m14732C(Metadata aVar) {
        byte[] bArr;
        int i;
        int i2 = 0;
        int i3 = -1;
        boolean z = false;
        while (i2 < aVar.mo6552o()) {
            C1034b n = aVar.mo6551n(i2);
            if (n instanceof ApicFrame) {
                ApicFrame bVar = (ApicFrame) n;
                bArr = bVar.f7274e;
                i = bVar.f7273d;
            } else if (n instanceof PictureFrame) {
                PictureFrame aVar2 = (PictureFrame) n;
                bArr = aVar2.f7255h;
                i = aVar2.f7248a;
            } else {
                continue;
                i2++;
            }
            if (i3 == -1 || i == 3) {
                z = m14733D(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                if (i == 3) {
                    break;
                }
                i3 = i;
                i2++;
            } else {
                i2++;
            }
        }
        return z;
    }

    @RequiresNonNull({"artworkView"})
    /* renamed from: D */
    private boolean m14733D(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                mo14733B(((float) intrinsicWidth) / ((float) intrinsicHeight), this.f11947b, this.f11950e);
                this.f11950e.setImageDrawable(drawable);
                this.f11950e.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    private static void m14734E(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    /* renamed from: F */
    private boolean m14735F() {
        C1155l1 l1Var = this.f11957l;
        boolean z = true;
        if (l1Var == null) {
            return true;
        }
        int q = l1Var.mo7219q();
        if (!this.f11968w || !(q == 1 || q == 4 || !this.f11957l.mo7217n())) {
            z = false;
        }
        return z;
    }

    /* renamed from: H */
    private void m14736H(boolean z) {
        if (m14744P()) {
            this.f11954i.setShowTimeoutMs(z ? 0 : this.f11967v);
            this.f11954i.mo14819P();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public boolean m14737I() {
        if (!m14744P() || this.f11957l == null) {
            return false;
        }
        if (!this.f11954i.mo14817I()) {
            m14731A(true);
        } else if (this.f11970y) {
            this.f11954i.mo14816F();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r4.f11957l.mo7217n() == false) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m14738J() {
        /*
            r4 = this;
            android.view.View r0 = r4.f11952g
            if (r0 == 0) goto L_0x002b
            c.a.a.a.l1 r0 = r4.f11957l
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0020
            int r0 = r0.mo7219q()
            r3 = 2
            if (r0 != r3) goto L_0x0020
            int r0 = r4.f11962q
            if (r0 == r3) goto L_0x0021
            if (r0 != r1) goto L_0x0020
            c.a.a.a.l1 r0 = r4.f11957l
            boolean r0 = r0.mo7217n()
            if (r0 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            android.view.View r0 = r4.f11952g
            if (r1 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r2 = 8
        L_0x0028:
            r0.setVisibility(r2)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p196ui.PlayerView.m14738J():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m14739K() {
        PlayerControlView jVar = this.f11954i;
        String str = null;
        if (jVar == null || !this.f11958m) {
            setContentDescription(null);
        } else if (jVar.getVisibility() == 0) {
            if (this.f11970y) {
                str = getResources().getString(C1878p.exo_controls_hide);
            }
            setContentDescription(str);
        } else {
            setContentDescription(getResources().getString(C1878p.exo_controls_show));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m14740L() {
        if (!m14767z() || !this.f11969x) {
            m14731A(false);
        } else {
            mo14783w();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m14741M() {
        TextView textView = this.f11953h;
        if (textView != null) {
            CharSequence charSequence = this.f11966u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f11953h.setVisibility(0);
                return;
            }
            C1155l1 l1Var = this.f11957l;
            ExoPlaybackException e = l1Var != null ? l1Var.mo7210e() : null;
            if (e != null) {
                ErrorMessageProvider<? super ExoPlaybackException> nVar = this.f11965t;
                if (nVar != null) {
                    this.f11953h.setText((CharSequence) nVar.mo7463a(e).second);
                    this.f11953h.setVisibility(0);
                }
            }
            this.f11953h.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m14742N(boolean z) {
        C1155l1 l1Var = this.f11957l;
        if (l1Var == null || l1Var.mo7195I().mo6990n()) {
            if (!this.f11963r) {
                m14765v();
                m14762r();
            }
            return;
        }
        if (z && !this.f11963r) {
            m14762r();
        }
        TrackSelectionArray T = l1Var.mo7204T();
        int i = 0;
        while (i < T.f8284a) {
            if (l1Var.mo7205U(i) != 2 || T.mo7321a(i) == null) {
                i++;
            } else {
                m14765v();
                return;
            }
        }
        m14762r();
        if (m14743O()) {
            for (Metadata C : l1Var.mo7220r()) {
                if (m14732C(C)) {
                    return;
                }
            }
            if (m14733D(this.f11961p)) {
                return;
            }
        }
        m14765v();
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    /* renamed from: O */
    private boolean m14743O() {
        if (!this.f11960o) {
            return false;
        }
        Assertions.m10156h(this.f11950e);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    /* renamed from: P */
    private boolean m14744P() {
        if (!this.f11958m) {
            return false;
        }
        Assertions.m10156h(this.f11954i);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static void m14761q(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        if (!(width == 0.0f || height == 0.0f || i == 0)) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate((float) i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    /* renamed from: r */
    private void m14762r() {
        View view = this.f11948c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: s */
    private static void m14763s(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C1874l.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(C1873k.exo_edit_mode_background_color));
    }

    /* renamed from: t */
    private static void m14764t(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C1874l.exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(C1873k.exo_edit_mode_background_color, null));
    }

    /* renamed from: v */
    private void m14765v() {
        ImageView imageView = this.f11950e;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f11950e.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: y */
    private boolean m14766y(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public boolean m14767z() {
        C1155l1 l1Var = this.f11957l;
        return l1Var != null && l1Var.mo7213h() && this.f11957l.mo7217n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo14733B(float f, AspectRatioFrameLayout aspectRatioFrameLayout, View view) {
        if (aspectRatioFrameLayout != null) {
            if (view instanceof SphericalGLSurfaceView) {
                f = 0.0f;
            }
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* renamed from: G */
    public void mo14734G() {
        m14736H(m14735F());
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C1155l1 l1Var = this.f11957l;
        if (l1Var != null && l1Var.mo7213h()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean y = m14766y(keyEvent.getKeyCode());
        boolean z = false;
        if (y && m14744P() && !this.f11954i.mo14817I()) {
            m14731A(true);
        } else if (mo14782u(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            m14731A(true);
        } else {
            if (y && m14744P()) {
                m14731A(true);
            }
            return z;
        }
        z = true;
        return z;
    }

    public List<C1110d> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f11956k;
        if (frameLayout != null) {
            arrayList.add(new C1110d(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        PlayerControlView jVar = this.f11954i;
        if (jVar != null) {
            arrayList.add(new C1110d(jVar, 0));
        }
        return ImmutableList.m11916m(arrayList);
    }

    @Deprecated
    public /* bridge */ /* synthetic */ View[] getAdOverlayViews() {
        return AdsLoader.m9249a(this);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) Assertions.m10157i(this.f11955j, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f11968w;
    }

    public boolean getControllerHideOnTouch() {
        return this.f11970y;
    }

    public int getControllerShowTimeoutMs() {
        return this.f11967v;
    }

    public Drawable getDefaultArtwork() {
        return this.f11961p;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f11956k;
    }

    public C1155l1 getPlayer() {
        return this.f11957l;
    }

    public int getResizeMode() {
        Assertions.m10156h(this.f11947b);
        return this.f11947b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f11951f;
    }

    public boolean getUseArtwork() {
        return this.f11960o;
    }

    public boolean getUseController() {
        return this.f11958m;
    }

    public View getVideoSurfaceView() {
        return this.f11949d;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m14744P() || this.f11957l == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11945A = true;
            return true;
        } else if (action != 1 || !this.f11945A) {
            return false;
        } else {
            this.f11945A = false;
            performClick();
            return true;
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m14744P() || this.f11957l == null) {
            return false;
        }
        m14731A(true);
        return true;
    }

    public boolean performClick() {
        super.performClick();
        return m14737I();
    }

    public void setAspectRatioListener(C1855b bVar) {
        Assertions.m10156h(this.f11947b);
        this.f11947b.setAspectRatioListener(bVar);
    }

    public void setControlDispatcher(ControlDispatcher j0Var) {
        Assertions.m10156h(this.f11954i);
        this.f11954i.setControlDispatcher(j0Var);
    }

    public void setControllerAutoShow(boolean z) {
        this.f11968w = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f11969x = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        Assertions.m10156h(this.f11954i);
        this.f11970y = z;
        m14739K();
    }

    public void setControllerShowTimeoutMs(int i) {
        Assertions.m10156h(this.f11954i);
        this.f11967v = i;
        if (this.f11954i.mo14817I()) {
            mo14734G();
        }
    }

    public void setControllerVisibilityListener(C1872d dVar) {
        Assertions.m10156h(this.f11954i);
        C1872d dVar2 = this.f11959n;
        if (dVar2 != dVar) {
            if (dVar2 != null) {
                this.f11954i.mo14818K(dVar2);
            }
            this.f11959n = dVar;
            if (dVar != null) {
                this.f11954i.mo14846y(dVar);
            }
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        Assertions.m10154f(this.f11953h != null);
        this.f11966u = charSequence;
        m14741M();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f11961p != drawable) {
            this.f11961p = drawable;
            m14742N(false);
        }
    }

    public void setErrorMessageProvider(ErrorMessageProvider<? super ExoPlaybackException> nVar) {
        if (this.f11965t != nVar) {
            this.f11965t = nVar;
            m14741M();
        }
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i) {
        Assertions.m10156h(this.f11954i);
        this.f11954i.setFastForwardIncrementMs(i);
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f11963r != z) {
            this.f11963r = z;
            m14742N(false);
        }
    }

    @Deprecated
    public void setPlaybackPreparer(PlaybackPreparer j1Var) {
        Assertions.m10156h(this.f11954i);
        this.f11954i.setPlaybackPreparer(j1Var);
    }

    public void setPlayer(C1155l1 l1Var) {
        Assertions.m10154f(Looper.myLooper() == Looper.getMainLooper());
        Assertions.m10149a(l1Var == null || l1Var.mo7199N() == Looper.getMainLooper());
        C1155l1 l1Var2 = this.f11957l;
        if (l1Var2 != l1Var) {
            if (l1Var2 != null) {
                l1Var2.mo7201P(this.f11946a);
                C1159d g = l1Var2.mo7212g();
                if (g != null) {
                    g.mo7230V(this.f11946a);
                    View view = this.f11949d;
                    if (view instanceof TextureView) {
                        g.mo7237x((TextureView) view);
                    } else if (view instanceof SphericalGLSurfaceView) {
                        ((SphericalGLSurfaceView) view).setVideoComponent(null);
                    } else if (view instanceof SurfaceView) {
                        g.mo7228F((SurfaceView) view);
                    }
                }
                C1158c Y = l1Var2.mo7207Y();
                if (Y != null) {
                    Y.mo7225J(this.f11946a);
                }
            }
            SubtitleView subtitleView = this.f11951f;
            if (subtitleView != null) {
                subtitleView.setCues(null);
            }
            this.f11957l = l1Var;
            if (m14744P()) {
                this.f11954i.setPlayer(l1Var);
            }
            m14738J();
            m14741M();
            m14742N(true);
            if (l1Var != null) {
                C1159d g2 = l1Var.mo7212g();
                if (g2 != null) {
                    View view2 = this.f11949d;
                    if (view2 instanceof TextureView) {
                        g2.mo7229S((TextureView) view2);
                    } else if (view2 instanceof SphericalGLSurfaceView) {
                        ((SphericalGLSurfaceView) view2).setVideoComponent(g2);
                    } else if (view2 instanceof SurfaceView) {
                        g2.mo7227E((SurfaceView) view2);
                    }
                    g2.mo7231X(this.f11946a);
                }
                C1158c Y2 = l1Var.mo7207Y();
                if (Y2 != null) {
                    Y2.mo7224G(this.f11946a);
                    SubtitleView subtitleView2 = this.f11951f;
                    if (subtitleView2 != null) {
                        subtitleView2.setCues(Y2.mo7226v());
                    }
                }
                l1Var.mo7192C(this.f11946a);
                m14731A(false);
            } else {
                mo14783w();
            }
        }
    }

    public void setRepeatToggleModes(int i) {
        Assertions.m10156h(this.f11954i);
        this.f11954i.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        Assertions.m10156h(this.f11947b);
        this.f11947b.setResizeMode(i);
    }

    @Deprecated
    public void setRewindIncrementMs(int i) {
        Assertions.m10156h(this.f11954i);
        this.f11954i.setRewindIncrementMs(i);
    }

    public void setShowBuffering(int i) {
        if (this.f11962q != i) {
            this.f11962q = i;
            m14738J();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        Assertions.m10156h(this.f11954i);
        this.f11954i.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        Assertions.m10156h(this.f11954i);
        this.f11954i.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        Assertions.m10156h(this.f11954i);
        this.f11954i.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        Assertions.m10156h(this.f11954i);
        this.f11954i.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        Assertions.m10156h(this.f11954i);
        this.f11954i.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        Assertions.m10156h(this.f11954i);
        this.f11954i.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f11948c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        Assertions.m10154f(!z || this.f11950e != null);
        if (this.f11960o != z) {
            this.f11960o = z;
            m14742N(false);
        }
    }

    public void setUseController(boolean z) {
        Assertions.m10154f(!z || this.f11954i != null);
        if (this.f11958m != z) {
            this.f11958m = z;
            if (m14744P()) {
                this.f11954i.setPlayer(this.f11957l);
            } else {
                PlayerControlView jVar = this.f11954i;
                if (jVar != null) {
                    jVar.mo14816F();
                    this.f11954i.setPlayer(null);
                }
            }
            m14739K();
        }
    }

    public void setUseSensorRotation(boolean z) {
        if (this.f11964s != z) {
            this.f11964s = z;
            View view = this.f11949d;
            if (view instanceof SphericalGLSurfaceView) {
                ((SphericalGLSurfaceView) view).setUseSensorRotation(z);
            }
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f11949d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    /* renamed from: u */
    public boolean mo14782u(KeyEvent keyEvent) {
        return m14744P() && this.f11954i.mo14815A(keyEvent);
    }

    /* renamed from: w */
    public void mo14783w() {
        PlayerControlView jVar = this.f11954i;
        if (jVar != null) {
            jVar.mo14816F();
        }
    }

    /* renamed from: x */
    public boolean mo14784x() {
        PlayerControlView jVar = this.f11954i;
        return jVar != null && jVar.mo14817I();
    }

    /* JADX INFO: finally extract failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        boolean z5;
        boolean z6;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        super(context, attributeSet, i);
        C1857a aVar = new C1857a();
        this.f11946a = aVar;
        if (isInEditMode()) {
            this.f11947b = null;
            this.f11948c = null;
            this.f11949d = null;
            this.f11950e = null;
            this.f11951f = null;
            this.f11952g = null;
            this.f11953h = null;
            this.f11954i = null;
            this.f11955j = null;
            this.f11956k = null;
            ImageView imageView = new ImageView(context2);
            if (Util.f8398a >= 23) {
                m14764t(getResources(), imageView);
            } else {
                m14763s(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i8 = C1877o.exo_player_view;
        this.f11964s = true;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C1879q.f12081I, 0, 0);
            try {
                int i9 = C1879q.f12091S;
                boolean hasValue = obtainStyledAttributes.hasValue(i9);
                int color = obtainStyledAttributes.getColor(i9, 0);
                int resourceId = obtainStyledAttributes.getResourceId(C1879q.f12087O, i8);
                boolean z7 = obtainStyledAttributes.getBoolean(C1879q.f12093U, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(C1879q.f12083K, 0);
                boolean z8 = obtainStyledAttributes.getBoolean(C1879q.f12094V, true);
                int i10 = obtainStyledAttributes.getInt(C1879q.f12092T, 1);
                int i11 = obtainStyledAttributes.getInt(C1879q.f12088P, 0);
                int i12 = obtainStyledAttributes.getInt(C1879q.f12090R, 5000);
                boolean z9 = obtainStyledAttributes.getBoolean(C1879q.f12085M, true);
                int i13 = resourceId;
                boolean z10 = obtainStyledAttributes.getBoolean(C1879q.f12082J, true);
                i7 = obtainStyledAttributes.getInteger(C1879q.f12089Q, 0);
                int i14 = i11;
                this.f11963r = obtainStyledAttributes.getBoolean(C1879q.f12086N, this.f11963r);
                boolean z11 = obtainStyledAttributes.getBoolean(C1879q.f12084L, true);
                this.f11964s = obtainStyledAttributes.getBoolean(C1879q.f12095W, this.f11964s);
                obtainStyledAttributes.recycle();
                i5 = i10;
                i8 = i13;
                z6 = z10;
                i2 = i12;
                z = z8;
                z5 = z11;
                i3 = resourceId2;
                z2 = z7;
                z3 = hasValue;
                i4 = color;
                z4 = z9;
                i6 = i14;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z6 = true;
            z5 = true;
            i7 = 0;
            i6 = 0;
            i5 = 1;
            z4 = true;
            i4 = 0;
            z3 = false;
            z2 = true;
            i3 = 0;
            i2 = 5000;
            z = true;
        }
        LayoutInflater.from(context).inflate(i8, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(C1875m.exo_content_frame);
        this.f11947b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            m14734E(aspectRatioFrameLayout, i6);
        }
        View findViewById = findViewById(C1875m.exo_shutter);
        this.f11948c = findViewById;
        if (findViewById != null && z3) {
            findViewById.setBackgroundColor(i4);
        }
        if (aspectRatioFrameLayout == null || i5 == 0) {
            this.f11949d = null;
        } else {
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            if (i5 == 2) {
                this.f11949d = new TextureView(context2);
            } else if (i5 == 3) {
                SphericalGLSurfaceView hVar = new SphericalGLSurfaceView(context2);
                hVar.setSingleTapListener(aVar);
                hVar.setUseSensorRotation(this.f11964s);
                this.f11949d = hVar;
            } else if (i5 != 4) {
                this.f11949d = new SurfaceView(context2);
            } else {
                this.f11949d = new VideoDecoderGLSurfaceView(context2);
            }
            this.f11949d.setLayoutParams(layoutParams);
            aspectRatioFrameLayout.addView(this.f11949d, 0);
        }
        this.f11955j = (FrameLayout) findViewById(C1875m.exo_ad_overlay);
        this.f11956k = (FrameLayout) findViewById(C1875m.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(C1875m.exo_artwork);
        this.f11950e = imageView2;
        this.f11960o = z2 && imageView2 != null;
        if (i3 != 0) {
            this.f11961p = ContextCompat.m1758d(getContext(), i3);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(C1875m.exo_subtitles);
        this.f11951f = subtitleView;
        if (subtitleView != null) {
            subtitleView.mo14789d();
            subtitleView.mo14790e();
        }
        View findViewById2 = findViewById(C1875m.exo_buffering);
        this.f11952g = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f11962q = i7;
        TextView textView = (TextView) findViewById(C1875m.exo_error_message);
        this.f11953h = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i15 = C1875m.exo_controller;
        PlayerControlView jVar = (PlayerControlView) findViewById(i15);
        View findViewById3 = findViewById(C1875m.exo_controller_placeholder);
        if (jVar != null) {
            this.f11954i = jVar;
        } else if (findViewById3 != null) {
            PlayerControlView jVar2 = new PlayerControlView(context2, null, 0, attributeSet2);
            this.f11954i = jVar2;
            jVar2.setId(i15);
            jVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(jVar2, indexOfChild);
        } else {
            this.f11954i = null;
        }
        PlayerControlView jVar3 = this.f11954i;
        this.f11967v = jVar3 != null ? i2 : 0;
        this.f11970y = z4;
        this.f11968w = z6;
        this.f11969x = z5;
        this.f11958m = z && jVar3 != null;
        mo14783w();
        m14739K();
        PlayerControlView jVar4 = this.f11954i;
        if (jVar4 != null) {
            jVar4.mo14846y(aVar);
        }
    }
}
