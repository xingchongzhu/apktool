package com.google.android.exoplayer2.p196ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.p100k2.CaptionStyleCompat;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.Cue.C1119b;
import p067c.p068a.p069a.p070a.p100k2.TextOutput;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.ui.SubtitleView */
public final class SubtitleView extends FrameLayout implements TextOutput {

    /* renamed from: a */
    private List<Cue> f11975a = Collections.emptyList();

    /* renamed from: b */
    private CaptionStyleCompat f11976b = CaptionStyleCompat.f7700a;

    /* renamed from: c */
    private int f11977c = 0;

    /* renamed from: d */
    private float f11978d = 0.0533f;

    /* renamed from: e */
    private float f11979e = 0.08f;

    /* renamed from: f */
    private boolean f11980f = true;

    /* renamed from: g */
    private boolean f11981g = true;

    /* renamed from: h */
    private int f11982h;

    /* renamed from: i */
    private C1858a f11983i;

    /* renamed from: j */
    private View f11984j;

    /* renamed from: com.google.android.exoplayer2.ui.SubtitleView$a */
    interface C1858a {
        /* renamed from: a */
        void mo14798a(List<Cue> list, CaptionStyleCompat bVar, float f, int i, float f2);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CanvasSubtitleOutput gVar = new CanvasSubtitleOutput(context, attributeSet);
        this.f11983i = gVar;
        this.f11984j = gVar;
        addView(gVar);
        this.f11982h = 1;
    }

    /* renamed from: a */
    private Cue m14799a(Cue cVar) {
        CharSequence charSequence = cVar.f7708b;
        if (!this.f11980f) {
            C1119b b = cVar.mo7035a().mo7051p(-3.4028235E38f, Integer.MIN_VALUE).mo7037b();
            if (charSequence != null) {
                b.mo7049n(charSequence.toString());
            }
            return b.mo7036a();
        }
        if (!this.f11981g) {
            if (charSequence == null) {
                return cVar;
            }
            C1119b p = cVar.mo7035a().mo7051p(-3.4028235E38f, Integer.MIN_VALUE);
            if (charSequence instanceof Spanned) {
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                for (AbsoluteSizeSpan removeSpan : (AbsoluteSizeSpan[]) valueOf.getSpans(0, valueOf.length(), AbsoluteSizeSpan.class)) {
                    valueOf.removeSpan(removeSpan);
                }
                for (RelativeSizeSpan removeSpan2 : (RelativeSizeSpan[]) valueOf.getSpans(0, valueOf.length(), RelativeSizeSpan.class)) {
                    valueOf.removeSpan(removeSpan2);
                }
                p.mo7049n(valueOf);
            }
            cVar = p.mo7036a();
        }
        return cVar;
    }

    /* renamed from: c */
    private void m14800c(int i, float f) {
        this.f11977c = i;
        this.f11978d = f;
        m14801f();
    }

    /* renamed from: f */
    private void m14801f() {
        this.f11983i.mo14798a(getCuesWithStylingPreferencesApplied(), this.f11976b, this.f11978d, this.f11977c, this.f11979e);
    }

    private List<Cue> getCuesWithStylingPreferencesApplied() {
        if (this.f11980f && this.f11981g) {
            return this.f11975a;
        }
        ArrayList arrayList = new ArrayList(this.f11975a.size());
        for (int i = 0; i < this.f11975a.size(); i++) {
            arrayList.add(m14799a((Cue) this.f11975a.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        if (Util.f8398a < 19 || isInEditMode()) {
            return 1.0f;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private CaptionStyleCompat getUserCaptionStyle() {
        CaptionStyleCompat bVar;
        if (Util.f8398a < 19 || isInEditMode()) {
            return CaptionStyleCompat.f7700a;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            bVar = CaptionStyleCompat.f7700a;
        } else {
            bVar = CaptionStyleCompat.m9374a(captioningManager.getUserStyle());
        }
        return bVar;
    }

    private <T extends View & C1858a> void setView(T t) {
        removeView(this.f11984j);
        View view = this.f11984j;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).mo14853g();
        }
        this.f11984j = t;
        this.f11983i = (C1858a) t;
        addView(t);
    }

    /* renamed from: b */
    public void mo14788b(float f, boolean z) {
        m14800c(z ? 1 : 0, f);
    }

    /* renamed from: d */
    public void mo14789d() {
        setStyle(getUserCaptionStyle());
    }

    /* renamed from: e */
    public void mo14790e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f11981g = z;
        m14801f();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f11980f = z;
        m14801f();
    }

    public void setBottomPaddingFraction(float f) {
        this.f11979e = f;
        m14801f();
    }

    public void setCues(List<Cue> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f11975a = list;
        m14801f();
    }

    public void setFractionalTextSize(float f) {
        mo14788b(f, false);
    }

    public void setStyle(CaptionStyleCompat bVar) {
        this.f11976b = bVar;
        m14801f();
    }

    public void setViewType(int i) {
        if (this.f11982h != i) {
            if (i == 1) {
                setView(new CanvasSubtitleOutput(getContext()));
            } else if (i == 2) {
                setView(new WebViewSubtitleOutput(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
            this.f11982h = i;
        }
    }

    /* renamed from: t */
    public void mo7067t(List<Cue> list) {
        setCues(list);
    }
}
