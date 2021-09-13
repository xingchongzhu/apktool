package p067c.p068a.p069a.p070a.p112n2;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.GlUtil;

/* renamed from: c.a.a.a.n2.r */
class VideoDecoderGLFrameRenderer implements Renderer, VideoDecoderOutputBufferRenderer {

    /* renamed from: a */
    private static final float[] f8613a = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

    /* renamed from: b */
    private static final float[] f8614b = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

    /* renamed from: c */
    private static final float[] f8615c = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

    /* renamed from: d */
    private static final String[] f8616d = {"y_tex", "u_tex", "v_tex"};

    /* renamed from: e */
    private static final FloatBuffer f8617e = GlUtil.m10343f(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* renamed from: f */
    private final GLSurfaceView f8618f;

    /* renamed from: g */
    private final int[] f8619g = new int[3];

    /* renamed from: h */
    private final AtomicReference<VideoDecoderOutputBuffer> f8620h;

    /* renamed from: i */
    private FloatBuffer[] f8621i;

    /* renamed from: j */
    private int f8622j;

    /* renamed from: k */
    private int[] f8623k;

    /* renamed from: l */
    private int f8624l;

    /* renamed from: m */
    private int[] f8625m;

    /* renamed from: n */
    private int[] f8626n;

    /* renamed from: o */
    private VideoDecoderOutputBuffer f8627o;

    public VideoDecoderGLFrameRenderer(GLSurfaceView gLSurfaceView) {
        this.f8618f = gLSurfaceView;
        this.f8620h = new AtomicReference<>();
        this.f8621i = new FloatBuffer[3];
        this.f8623k = new int[3];
        this.f8625m = new int[3];
        this.f8626n = new int[3];
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.f8625m;
            this.f8626n[i] = -1;
            iArr[i] = -1;
        }
    }

    /* renamed from: a */
    private void m10596a() {
        GLES20.glGenTextures(3, this.f8619g, 0);
        for (int i = 0; i < 3; i++) {
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f8622j, f8616d[i]), i);
            GLES20.glActiveTexture(33984 + i);
            GLES20.glBindTexture(3553, this.f8619g[i]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
        }
        GlUtil.m10339b();
    }

    public void onDrawFrame(GL10 gl10) {
        VideoDecoderOutputBuffer tVar = (VideoDecoderOutputBuffer) this.f8620h.getAndSet(null);
        if (tVar != null || this.f8627o != null) {
            if (tVar != null) {
                VideoDecoderOutputBuffer tVar2 = this.f8627o;
                if (tVar2 != null) {
                    tVar2.mo5972n();
                }
                this.f8627o = tVar;
            }
            VideoDecoderOutputBuffer tVar3 = (VideoDecoderOutputBuffer) Assertions.m10153e(this.f8627o);
            float[] fArr = f8614b;
            int i = tVar3.f8633h;
            if (i == 1) {
                fArr = f8613a;
            } else if (i == 3) {
                fArr = f8615c;
            }
            GLES20.glUniformMatrix3fv(this.f8624l, 1, false, fArr, 0);
            int[] iArr = (int[]) Assertions.m10153e(tVar3.f8632g);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) Assertions.m10153e(tVar3.f8631f);
            int i2 = 0;
            while (i2 < 3) {
                int i3 = i2 == 0 ? tVar3.f8630e : (tVar3.f8630e + 1) / 2;
                GLES20.glActiveTexture(33984 + i2);
                GLES20.glBindTexture(3553, this.f8619g[i2]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i2], i3, 0, 6409, 5121, byteBufferArr[i2]);
                i2++;
            }
            int[] iArr2 = new int[3];
            iArr2[0] = tVar3.f8629d;
            int i4 = (iArr2[0] + 1) / 2;
            iArr2[2] = i4;
            iArr2[1] = i4;
            for (int i5 = 0; i5 < 3; i5++) {
                if (this.f8625m[i5] != iArr2[i5] || this.f8626n[i5] != iArr[i5]) {
                    Assertions.m10154f(iArr[i5] != 0);
                    float f = ((float) iArr2[i5]) / ((float) iArr[i5]);
                    this.f8621i[i5] = GlUtil.m10343f(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f, 0.0f, f, 1.0f});
                    GLES20.glVertexAttribPointer(this.f8623k[i5], 2, 5126, false, 0, this.f8621i[i5]);
                    this.f8625m[i5] = iArr2[i5];
                    this.f8626n[i5] = iArr[i5];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            GlUtil.m10339b();
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int c = GlUtil.m10340c("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
        this.f8622j = c;
        GLES20.glUseProgram(c);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f8622j, "in_pos");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, f8617e);
        this.f8623k[0] = GLES20.glGetAttribLocation(this.f8622j, "in_tc_y");
        GLES20.glEnableVertexAttribArray(this.f8623k[0]);
        this.f8623k[1] = GLES20.glGetAttribLocation(this.f8622j, "in_tc_u");
        GLES20.glEnableVertexAttribArray(this.f8623k[1]);
        this.f8623k[2] = GLES20.glGetAttribLocation(this.f8622j, "in_tc_v");
        GLES20.glEnableVertexAttribArray(this.f8623k[2]);
        GlUtil.m10339b();
        this.f8624l = GLES20.glGetUniformLocation(this.f8622j, "mColorConversion");
        GlUtil.m10339b();
        m10596a();
        GlUtil.m10339b();
    }
}
