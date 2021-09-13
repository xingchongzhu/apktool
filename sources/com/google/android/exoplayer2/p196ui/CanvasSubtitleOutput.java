package com.google.android.exoplayer2.p196ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.p100k2.CaptionStyleCompat;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.Cue.C1119b;

/* renamed from: com.google.android.exoplayer2.ui.g */
final class CanvasSubtitleOutput extends View implements C1858a {

    /* renamed from: a */
    private final List<SubtitlePainter> f12011a;

    /* renamed from: b */
    private List<Cue> f12012b;

    /* renamed from: c */
    private int f12013c;

    /* renamed from: d */
    private float f12014d;

    /* renamed from: e */
    private CaptionStyleCompat f12015e;

    /* renamed from: f */
    private float f12016f;

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private static Cue m14819b(Cue cVar) {
        C1119b o = cVar.mo7035a().mo7045j(-3.4028235E38f).mo7046k(Integer.MIN_VALUE).mo7050o(null);
        if (cVar.f7712f == 0) {
            o.mo7043h(1.0f - cVar.f7711e, 0);
        } else {
            o.mo7043h((-cVar.f7711e) - 1.0f, 1);
        }
        int i = cVar.f7713g;
        if (i == 0) {
            o.mo7044i(2);
        } else if (i == 2) {
            o.mo7044i(0);
        }
        return o.mo7036a();
    }

    /* renamed from: a */
    public void mo14798a(List<Cue> list, CaptionStyleCompat bVar, float f, int i, float f2) {
        this.f12012b = list;
        this.f12015e = bVar;
        this.f12014d = f;
        this.f12013c = i;
        this.f12016f = f2;
        while (this.f12011a.size() < list.size()) {
            this.f12011a.add(new SubtitlePainter(getContext()));
        }
        invalidate();
    }

    public void dispatchDraw(Canvas canvas) {
        List<Cue> list = this.f12012b;
        if (!list.isEmpty()) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int paddingBottom = height - getPaddingBottom();
            if (paddingBottom > paddingTop && width > paddingLeft) {
                int i = paddingBottom - paddingTop;
                float a = SubtitleViewUtils.m14930a(this.f12013c, this.f12014d, height, i);
                if (a > 0.0f) {
                    int size = list.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Cue cVar = (Cue) list.get(i2);
                        if (cVar.f7722p != Integer.MIN_VALUE) {
                            cVar = m14819b(cVar);
                        }
                        Cue cVar2 = cVar;
                        float f = a;
                        int i3 = i2;
                        int i4 = size;
                        int i5 = i;
                        int i6 = paddingBottom;
                        int i7 = width;
                        ((SubtitlePainter) this.f12011a.get(i2)).mo14852b(cVar2, this.f12015e, f, SubtitleViewUtils.m14930a(cVar2.f7720n, cVar2.f7721o, height, i), this.f12016f, canvas, paddingLeft, paddingTop, width, i6);
                        i2 = i3 + 1;
                        size = i4;
                        i = i5;
                        paddingBottom = i6;
                        width = i7;
                    }
                }
            }
        }
    }

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12011a = new ArrayList();
        this.f12012b = Collections.emptyList();
        this.f12013c = 0;
        this.f12014d = 0.0533f;
        this.f12015e = CaptionStyleCompat.f7700a;
        this.f12016f = 0.08f;
    }
}
