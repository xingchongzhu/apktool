package com.tv91.features.movie.play;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.KeyEvent;
import android.view.View;
import com.chip.ninetyonetv.R;
import com.google.android.exoplayer2.p196ui.PlayerView;
import com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory;
import com.google.android.exoplayer2.source.hls.p195v.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylist;
import com.google.android.exoplayer2.source.hls.p195v.HlsPlaylistParserFactory;
import com.google.android.exoplayer2.upstream.C1916m.C1917a;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.ParsingLoadable.C1908a;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.p252x.ActivityKey;
import com.tv91.p252x.KeyedActivity;
import com.tv91.utils.C3052g;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p067c.p068a.p069a.p070a.C1155l1;
import p067c.p068a.p069a.p070a.C1155l1.C1156a;
import p067c.p068a.p069a.p070a.C1155l1.C1157b;
import p067c.p068a.p069a.p070a.DefaultControlDispatcher;
import p067c.p068a.p069a.p070a.ExoPlaybackException;
import p067c.p068a.p069a.p070a.MediaItem;
import p067c.p068a.p069a.p070a.MediaItem.C1262c;
import p067c.p068a.p069a.p070a.PlaybackParameters;
import p067c.p068a.p069a.p070a.Player;
import p067c.p068a.p069a.p070a.SimpleExoPlayer;
import p067c.p068a.p069a.p070a.SimpleExoPlayer.C1248b;
import p067c.p068a.p069a.p070a.Timeline;
import p067c.p068a.p069a.p070a.p096i2.FilteringManifestParser;
import p067c.p068a.p069a.p070a.p097j2.BehindLiveWindowException;
import p067c.p068a.p069a.p070a.p097j2.C1080d0;
import p067c.p068a.p069a.p070a.p097j2.ProgressiveMediaSource.C1096b;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p110l2.TrackSelectionArray;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p295h.p296a.Timber;

public final class MoviePlayActivity extends KeyedActivity {

    /* renamed from: r */
    private PlayerView f13893r;

    /* renamed from: s */
    private Uri f13894s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public SimpleExoPlayer f13895t;

    /* renamed from: u */
    private C2290d f13896u;

    /* renamed from: v */
    private int f13897v;

    /* renamed from: w */
    private long f13898w;

    /* renamed from: x */
    private C1917a f13899x;

    /* renamed from: com.tv91.features.movie.play.MoviePlayActivity$b */
    private static final class C2287b implements HlsPlaylistParserFactory {
        private C2287b() {
        }

        /* renamed from: a */
        public C1908a<HlsPlaylist> mo14656a(HlsMasterPlaylist fVar, HlsMediaPlaylist gVar) {
            return new FilteringManifestParser(new M3U8Parser(fVar, gVar), Collections.emptyList());
        }

        /* renamed from: b */
        public C1908a<HlsPlaylist> mo14657b() {
            return new FilteringManifestParser(new M3U8Parser(), Collections.emptyList());
        }
    }

    /* renamed from: com.tv91.features.movie.play.MoviePlayActivity$c */
    public static class C2288c extends ActivityKey {
        public static final Creator<C2288c> CREATOR = new C2289a();
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Uri f13900a;

        /* renamed from: com.tv91.features.movie.play.MoviePlayActivity$c$a */
        static class C2289a implements Creator<C2288c> {
            C2289a() {
            }

            /* renamed from: a */
            public C2288c createFromParcel(Parcel parcel) {
                return new C2288c(parcel);
            }

            /* renamed from: b */
            public C2288c[] newArray(int i) {
                return new C2288c[i];
            }
        }

        public C2288c(Uri uri) {
            this.f13900a = uri;
        }

        /* renamed from: n */
        public Intent mo16474n(Context context) {
            return new Intent(context, MoviePlayActivity.class).putExtra("key_uri", this.f13900a);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f13900a.toString());
        }

        protected C2288c(Parcel parcel) {
            super(parcel);
            this.f13900a = Uri.parse(parcel.readString());
        }
    }

    /* renamed from: com.tv91.features.movie.play.MoviePlayActivity$d */
    private final class C2290d implements C1156a {
        private C2290d() {
        }

        /* renamed from: D */
        public /* synthetic */ void mo5615D(Timeline x1Var, int i) {
            Player.m9370s(this, x1Var, i);
        }

        /* renamed from: G */
        public void mo5618G(int i) {
            if (i == 3) {
                MoviePlayActivity.this.getWindow().addFlags(128);
            } else {
                MoviePlayActivity.this.getWindow().clearFlags(128);
            }
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

        /* renamed from: c */
        public /* synthetic */ void mo5642c(int i) {
            Player.m9366o(this, i);
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
        public void mo5650j(int i) {
            if (MoviePlayActivity.this.f13895t.mo7210e() != null) {
                MoviePlayActivity.this.m17247Z();
            }
        }

        /* renamed from: o */
        public /* synthetic */ void mo5660o(List list) {
            Player.m9369r(this, list);
        }

        /* renamed from: q */
        public /* synthetic */ void mo5664q(Timeline x1Var, Object obj, int i) {
            Player.m9371t(this, x1Var, obj, i);
        }

        /* renamed from: r */
        public void mo5666r(ExoPlaybackException p0Var) {
            if (MoviePlayActivity.this.m17244V(p0Var)) {
                MoviePlayActivity.this.m17242T();
                MoviePlayActivity.this.m17243U();
                return;
            }
            MoviePlayActivity.this.m17247Z();
            Timber.m24041c(p0Var);
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

    /* renamed from: S */
    private C1080d0 m17241S(Uri uri) {
        if (this.f13899x == null) {
            this.f13899x = new DefaultDataSourceFactory(this, Util.m10288f0(this, "91TVPlayer"));
        }
        String lastPathSegment = uri.getLastPathSegment();
        Objects.requireNonNull(lastPathSegment);
        String str = lastPathSegment;
        if (str.toLowerCase().endsWith("mp4")) {
            return new C1096b(this.f13899x).mo6906a(new C1262c().mo7786g(uri).mo7780a());
        }
        if (str.toLowerCase().endsWith("m3u8")) {
            return new Factory(this.f13899x).mo14561b(new C2287b()).mo14560a(new C1262c().mo7786g(uri).mo7780a());
        }
        if (C3052g.m20581b("content", uri.getScheme())) {
            return new C1096b(this.f13899x).mo6906a(new C1262c().mo7786g(uri).mo7780a());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported type: ");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m17242T() {
        this.f13897v = -1;
        this.f13898w = -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m17243U() {
        if (this.f13895t == null) {
            SimpleExoPlayer w = new C1248b(this).mo7721w();
            this.f13895t = w;
            C2290d dVar = new C2290d();
            this.f13896u = dVar;
            w.mo7192C(dVar);
        }
        this.f13893r.setPlayer(this.f13895t);
        C1080d0 S = m17241S(this.f13894s);
        int i = this.f13897v;
        boolean z = i != -1;
        if (z) {
            this.f13895t.mo7216k(i, this.f13898w);
        }
        this.f13895t.mo7719P0(S, !z);
        this.f13895t.mo7209d();
        this.f13895t.mo6401b0();
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public boolean m17244V(ExoPlaybackException p0Var) {
        if (p0Var.f8675a != 0) {
            return false;
        }
        for (Throwable g = p0Var.mo7630g(); g != null; g = g.getCause()) {
            if (g instanceof BehindLiveWindowException) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void mo16795X(View view) {
        finish();
    }

    /* renamed from: Y */
    private void m17246Y() {
        if (this.f13895t != null) {
            m17247Z();
            this.f13895t.mo7201P(this.f13896u);
            this.f13895t.mo7718L0();
            this.f13895t = null;
            this.f13896u = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m17247Z() {
        SimpleExoPlayer v1Var = this.f13895t;
        if (v1Var != null) {
            this.f13897v = v1Var.mo7203R();
            this.f13898w = this.f13895t.mo6406w() ? Math.max(0, this.f13895t.mo7206W()) : -9223372036854775807L;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f13893r.mo14784x()) {
            this.f13893r.mo14783w();
        } else {
            this.f13893r.mo14734G();
        }
        return super.dispatchKeyEvent(keyEvent) || this.f13893r.mo14782u(keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo132b().mo2999a(new UmengObserver("影片播放頁面"));
        Uri p = ((C2288c) mo18583M()).f13900a;
        this.f13894s = p;
        if (p == null && bundle != null) {
            Uri uri = (Uri) bundle.getParcelable("key_uri");
            this.f13894s = uri;
            if (uri == null) {
                finish();
            }
        }
        m17242T();
        setContentView((int) R.layout.activity_movie_play);
        PlayerView playerView = (PlayerView) findViewById(R.id.player_view);
        this.f13893r = playerView;
        playerView.setResizeMode(0);
        this.f13893r.setControllerShowTimeoutMs(3000);
        this.f13893r.setControllerHideOnTouch(true);
        this.f13893r.setControllerAutoShow(false);
        this.f13893r.setShowBuffering(1);
        this.f13893r.setControlDispatcher(new DefaultControlDispatcher(15000, 15000));
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (Util.f8398a <= 23) {
            m17246Y();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (Util.f8398a <= 23 || this.f13895t == null) {
            m17243U();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Uri uri = this.f13894s;
        if (uri != null) {
            bundle.putParcelable("key_uri", uri);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        findViewById(R.id.exo_close).setOnClickListener(Clicks.m17391a(new C2291a(this)));
        if (Util.f8398a > 23) {
            m17243U();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getWindow().clearFlags(128);
        if (Util.f8398a > 23) {
            m17246Y();
        }
    }
}
