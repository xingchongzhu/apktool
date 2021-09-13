package com.google.android.exoplayer2.p196ui.p197x;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import p067c.p068a.p069a.p070a.p111m2.GlUtil;
import p067c.p068a.p069a.p070a.p112n2.p113a0.Projection;
import p067c.p068a.p069a.p070a.p112n2.p113a0.Projection.C1205a;
import p067c.p068a.p069a.p070a.p112n2.p113a0.Projection.C1206b;

/* renamed from: com.google.android.exoplayer2.ui.x.e */
final class ProjectionRenderer {

    /* renamed from: a */
    private static final String[] f12192a = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: b */
    private static final String[] f12193b = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: c */
    private static final float[] f12194c = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: d */
    private static final float[] f12195d = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: e */
    private static final float[] f12196e = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: f */
    private static final float[] f12197f = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: g */
    private static final float[] f12198g = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: h */
    private int f12199h;

    /* renamed from: i */
    private C1891a f12200i;

    /* renamed from: j */
    private C1891a f12201j;

    /* renamed from: k */
    private int f12202k;

    /* renamed from: l */
    private int f12203l;

    /* renamed from: m */
    private int f12204m;

    /* renamed from: n */
    private int f12205n;

    /* renamed from: o */
    private int f12206o;

    /* renamed from: p */
    private int f12207p;

    /* renamed from: com.google.android.exoplayer2.ui.x.e$a */
    /* compiled from: ProjectionRenderer */
    private static class C1891a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f12208a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final FloatBuffer f12209b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final FloatBuffer f12210c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final int f12211d;

        public C1891a(C1206b bVar) {
            this.f12208a = bVar.mo7523a();
            this.f12209b = GlUtil.m10343f(bVar.f8498c);
            this.f12210c = GlUtil.m10343f(bVar.f8499d);
            int i = bVar.f8497b;
            if (i == 1) {
                this.f12211d = 5;
            } else if (i != 2) {
                this.f12211d = 4;
            } else {
                this.f12211d = 6;
            }
        }
    }

    ProjectionRenderer() {
    }

    /* renamed from: c */
    public static boolean m14952c(Projection dVar) {
        C1205a aVar = dVar.f8491a;
        C1205a aVar2 = dVar.f8492b;
        if (aVar.mo7522b() == 1 && aVar.mo7521a(0).f8496a == 0 && aVar2.mo7522b() == 1 && aVar2.mo7521a(0).f8496a == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14863a(int i, float[] fArr, boolean z) {
        C1891a aVar = z ? this.f12201j : this.f12200i;
        if (aVar != null) {
            GLES20.glUseProgram(this.f12202k);
            GlUtil.m10339b();
            GLES20.glEnableVertexAttribArray(this.f12205n);
            GLES20.glEnableVertexAttribArray(this.f12206o);
            GlUtil.m10339b();
            int i2 = this.f12199h;
            float[] fArr2 = i2 == 1 ? z ? f12196e : f12195d : i2 == 2 ? z ? f12198g : f12197f : f12194c;
            GLES20.glUniformMatrix3fv(this.f12204m, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(this.f12203l, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(this.f12207p, 0);
            GlUtil.m10339b();
            GLES20.glVertexAttribPointer(this.f12205n, 3, 5126, false, 12, aVar.f12209b);
            GlUtil.m10339b();
            GLES20.glVertexAttribPointer(this.f12206o, 2, 5126, false, 8, aVar.f12210c);
            GlUtil.m10339b();
            GLES20.glDrawArrays(aVar.f12211d, 0, aVar.f12208a);
            GlUtil.m10339b();
            GLES20.glDisableVertexAttribArray(this.f12205n);
            GLES20.glDisableVertexAttribArray(this.f12206o);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo14864b() {
        int d = GlUtil.m10341d(f12192a, f12193b);
        this.f12202k = d;
        this.f12203l = GLES20.glGetUniformLocation(d, "uMvpMatrix");
        this.f12204m = GLES20.glGetUniformLocation(this.f12202k, "uTexMatrix");
        this.f12205n = GLES20.glGetAttribLocation(this.f12202k, "aPosition");
        this.f12206o = GLES20.glGetAttribLocation(this.f12202k, "aTexCoords");
        this.f12207p = GLES20.glGetUniformLocation(this.f12202k, "uTexture");
    }

    /* renamed from: d */
    public void mo14865d(Projection dVar) {
        if (m14952c(dVar)) {
            this.f12199h = dVar.f8493c;
            C1891a aVar = new C1891a(dVar.f8491a.mo7521a(0));
            this.f12200i = aVar;
            if (!dVar.f8494d) {
                aVar = new C1891a(dVar.f8492b.mo7521a(0));
            }
            this.f12201j = aVar;
        }
    }
}
