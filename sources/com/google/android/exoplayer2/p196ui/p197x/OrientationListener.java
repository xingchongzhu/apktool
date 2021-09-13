package com.google.android.exoplayer2.p196ui.p197x;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import p067c.p068a.p069a.p070a.p112n2.p113a0.FrameRotationQueue;

/* renamed from: com.google.android.exoplayer2.ui.x.d */
final class OrientationListener implements SensorEventListener {

    /* renamed from: a */
    private final float[] f12185a = new float[16];

    /* renamed from: b */
    private final float[] f12186b = new float[16];

    /* renamed from: c */
    private final float[] f12187c = new float[16];

    /* renamed from: d */
    private final float[] f12188d = new float[3];

    /* renamed from: e */
    private final Display f12189e;

    /* renamed from: f */
    private final C1890a[] f12190f;

    /* renamed from: g */
    private boolean f12191g;

    /* renamed from: com.google.android.exoplayer2.ui.x.d$a */
    /* compiled from: OrientationListener */
    public interface C1890a {
        /* renamed from: a */
        void mo14862a(float[] fArr, float f);
    }

    public OrientationListener(Display display, C1890a... aVarArr) {
        this.f12189e = display;
        this.f12190f = aVarArr;
    }

    /* renamed from: a */
    private float m14946a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f12186b);
        SensorManager.getOrientation(this.f12186b, this.f12188d);
        return this.f12188d[2];
    }

    /* renamed from: b */
    private void m14947b(float[] fArr, float f) {
        for (C1890a a : this.f12190f) {
            a.mo14862a(fArr, f);
        }
    }

    /* renamed from: c */
    private void m14948c(float[] fArr) {
        if (!this.f12191g) {
            FrameRotationQueue.m10483a(this.f12187c, fArr);
            this.f12191g = true;
        }
        float[] fArr2 = this.f12186b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f12186b, 0, this.f12187c, 0);
    }

    /* renamed from: d */
    private void m14949d(float[] fArr, int i) {
        if (i != 0) {
            int i2 = 130;
            int i3 = 129;
            if (i == 1) {
                i2 = 2;
            } else if (i == 2) {
                i2 = 129;
                i3 = 130;
            } else if (i == 3) {
                i3 = 1;
            } else {
                throw new IllegalStateException();
            }
            float[] fArr2 = this.f12186b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f12186b, i2, i3, fArr);
        }
    }

    /* renamed from: e */
    private static void m14950e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f12185a, sensorEvent.values);
        m14949d(this.f12185a, this.f12189e.getRotation());
        float a = m14946a(this.f12185a);
        m14950e(this.f12185a);
        m14948c(this.f12185a);
        m14947b(this.f12185a, a);
    }
}
