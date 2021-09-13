package p067c.p068a.p069a.p070a.p111m2;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* renamed from: c.a.a.a.m2.p */
public final class GlUtil {
    /* renamed from: a */
    private static void m10338a(int i, String str, int i2) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
            sb.append(", source: ");
            sb.append(str);
            m10347j(sb.toString());
        }
        GLES20.glAttachShader(i2, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        m10339b();
    }

    /* renamed from: b */
    public static void m10339b() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("glError ");
                sb.append(GLU.gluErrorString(glGetError));
                Log.m10381c("GlUtil", sb.toString());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public static int m10340c(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        m10339b();
        m10338a(35633, str, glCreateProgram);
        m10338a(35632, str2, glCreateProgram);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to link shader program: \n");
            sb.append(GLES20.glGetProgramInfoLog(glCreateProgram));
            m10347j(sb.toString());
        }
        m10339b();
        return glCreateProgram;
    }

    /* renamed from: d */
    public static int m10341d(String[] strArr, String[] strArr2) {
        String str = "\n";
        return m10340c(TextUtils.join(str, strArr), TextUtils.join(str, strArr2));
    }

    /* renamed from: e */
    public static FloatBuffer m10342e(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* renamed from: f */
    public static FloatBuffer m10343f(float[] fArr) {
        return (FloatBuffer) m10342e(fArr.length).put(fArr).flip();
    }

    /* renamed from: g */
    public static int m10344g() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m10339b();
        return iArr[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if ("XT1650".equals(p067c.p068a.p069a.p070a.p111m2.Util.f8401d) != false) goto L_0x0020;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m10345h(android.content.Context r5) {
        /*
            int r0 = p067c.p068a.p069a.p070a.p111m2.Util.f8398a
            r1 = 0
            r2 = 24
            if (r0 >= r2) goto L_0x0008
            return r1
        L_0x0008:
            r2 = 26
            if (r0 >= r2) goto L_0x0021
            java.lang.String r3 = p067c.p068a.p069a.p070a.p111m2.Util.f8400c
            java.lang.String r4 = "samsung"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0020
            java.lang.String r3 = p067c.p068a.p069a.p070a.p111m2.Util.f8401d
            java.lang.String r4 = "XT1650"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0021
        L_0x0020:
            return r1
        L_0x0021:
            if (r0 >= r2) goto L_0x0030
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r0 = "android.hardware.vr.high_performance"
            boolean r5 = r5.hasSystemFeature(r0)
            if (r5 != 0) goto L_0x0030
            return r1
        L_0x0030:
            android.opengl.EGLDisplay r5 = android.opengl.EGL14.eglGetDisplay(r1)
            r0 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r5 = android.opengl.EGL14.eglQueryString(r5, r0)
            if (r5 == 0) goto L_0x0045
            java.lang.String r0 = "EGL_EXT_protected_content"
            boolean r5 = r5.contains(r0)
            if (r5 == 0) goto L_0x0045
            r1 = 1
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p111m2.GlUtil.m10345h(android.content.Context):boolean");
    }

    /* renamed from: i */
    public static boolean m10346i() {
        boolean z = false;
        if (Util.f8398a < 17) {
            return false;
        }
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if (eglQueryString != null && eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    private static void m10347j(String str) {
        Log.m10381c("GlUtil", str);
    }
}
