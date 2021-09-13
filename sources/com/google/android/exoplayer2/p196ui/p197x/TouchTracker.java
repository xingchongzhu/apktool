package com.google.android.exoplayer2.p196ui.p197x;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.exoplayer2.p196ui.p197x.OrientationListener.C1890a;

/* renamed from: com.google.android.exoplayer2.ui.x.i */
class TouchTracker extends SimpleOnGestureListener implements OnTouchListener, C1890a {

    /* renamed from: a */
    private final PointF f12248a = new PointF();

    /* renamed from: b */
    private final PointF f12249b = new PointF();

    /* renamed from: c */
    private final C1893a f12250c;

    /* renamed from: d */
    private final float f12251d;

    /* renamed from: e */
    private final GestureDetector f12252e;

    /* renamed from: f */
    private volatile float f12253f;

    /* renamed from: g */
    private SingleTapListener f12254g;

    /* renamed from: com.google.android.exoplayer2.ui.x.i$a */
    /* compiled from: TouchTracker */
    interface C1893a {
        /* renamed from: b */
        void mo14879b(PointF pointF);
    }

    public TouchTracker(Context context, C1893a aVar, float f) {
        this.f12250c = aVar;
        this.f12251d = f;
        this.f12252e = new GestureDetector(context, this);
        this.f12253f = 3.1415927f;
    }

    /* renamed from: a */
    public void mo14862a(float[] fArr, float f) {
        this.f12253f = -f;
    }

    /* renamed from: b */
    public void mo14883b(SingleTapListener gVar) {
        this.f12254g = gVar;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f12248a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f12248a.x) / this.f12251d;
        float y = motionEvent2.getY();
        PointF pointF = this.f12248a;
        float f3 = (y - pointF.y) / this.f12251d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = (double) this.f12253f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f12249b;
        pointF2.x -= (cos * x) - (sin * f3);
        float f4 = pointF2.y + (sin * x) + (cos * f3);
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        this.f12250c.mo14879b(this.f12249b);
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        SingleTapListener gVar = this.f12254g;
        if (gVar != null) {
            return gVar.onSingleTapUp(motionEvent);
        }
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f12252e.onTouchEvent(motionEvent);
    }
}
