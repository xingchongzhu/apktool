package p067c.p068a.p069a.p070a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import p067c.p068a.p069a.p070a.p072b2.AudioCapabilities;
import p067c.p068a.p069a.p070a.p072b2.AudioProcessor;
import p067c.p068a.p069a.p070a.p072b2.AudioRendererEventListener;
import p067c.p068a.p069a.p070a.p072b2.AudioSink;
import p067c.p068a.p069a.p070a.p072b2.DefaultAudioSink;
import p067c.p068a.p069a.p070a.p072b2.DefaultAudioSink.C0843d;
import p067c.p068a.p069a.p070a.p087g2.MediaCodecSelector;
import p067c.p068a.p069a.p070a.p088h2.MetadataOutput;
import p067c.p068a.p069a.p070a.p088h2.MetadataRenderer;
import p067c.p068a.p069a.p070a.p100k2.TextOutput;
import p067c.p068a.p069a.p070a.p100k2.TextRenderer;
import p067c.p068a.p069a.p070a.p112n2.VideoRendererEventListener;
import p067c.p068a.p069a.p070a.p112n2.p113a0.CameraMotionRenderer;

/* renamed from: c.a.a.a.o0 */
public class DefaultRenderersFactory implements RenderersFactory {

    /* renamed from: a */
    private final Context f8663a;

    /* renamed from: b */
    private int f8664b = 0;

    /* renamed from: c */
    private long f8665c = 5000;

    /* renamed from: d */
    private boolean f8666d;

    /* renamed from: e */
    private MediaCodecSelector f8667e = MediaCodecSelector.f7177a;

    /* renamed from: f */
    private boolean f8668f;

    /* renamed from: g */
    private boolean f8669g;

    /* renamed from: h */
    private boolean f8670h;

    /* renamed from: i */
    private boolean f8671i;

    /* renamed from: j */
    private boolean f8672j;

    /* renamed from: k */
    private boolean f8673k;

    public DefaultRenderersFactory(Context context) {
        this.f8663a = context;
    }

    /* renamed from: a */
    public C1227p1[] mo7621a(Handler handler, VideoRendererEventListener zVar, AudioRendererEventListener rVar, TextOutput lVar, MetadataOutput fVar) {
        ArrayList arrayList = new ArrayList();
        mo7628h(this.f8663a, this.f8664b, this.f8667e, this.f8666d, handler, zVar, this.f8665c, arrayList);
        AudioSink c = mo7623c(this.f8663a, this.f8671i, this.f8672j, this.f8673k);
        if (c != null) {
            mo7622b(this.f8663a, this.f8664b, this.f8667e, this.f8666d, c, handler, rVar, arrayList);
        }
        ArrayList arrayList2 = arrayList;
        mo7627g(this.f8663a, lVar, handler.getLooper(), this.f8664b, arrayList2);
        mo7625e(this.f8663a, fVar, handler.getLooper(), this.f8664b, arrayList2);
        mo7624d(this.f8663a, this.f8664b, arrayList);
        Handler handler2 = handler;
        mo7626f(this.f8663a, handler, this.f8664b, arrayList);
        return (C1227p1[]) arrayList.toArray(new C1227p1[0]);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006c A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a5 A[ExcHandler: Exception (r0v6 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:20:0x0078] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7622b(android.content.Context r15, int r16, p067c.p068a.p069a.p070a.p087g2.MediaCodecSelector r17, boolean r18, p067c.p068a.p069a.p070a.p072b2.AudioSink r19, android.os.Handler r20, p067c.p068a.p069a.p070a.p072b2.AudioRendererEventListener r21, java.util.ArrayList<p067c.p068a.p069a.p070a.C1227p1> r22) {
        /*
            r14 = this;
            r1 = r14
            r0 = r16
            r9 = r22
            java.lang.String r10 = "DefaultRenderersFactory"
            java.lang.Class<c.a.a.a.b2.s> r11 = p067c.p068a.p069a.p070a.p072b2.AudioSink.class
            java.lang.Class<c.a.a.a.b2.r> r12 = p067c.p068a.p069a.p070a.p072b2.AudioRendererEventListener.class
            c.a.a.a.b2.b0 r13 = new c.a.a.a.b2.b0
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r20
            r7 = r21
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            boolean r2 = r1.f8668f
            r13.mo6486i0(r2)
            boolean r2 = r1.f8669g
            r13.mo6487j0(r2)
            boolean r2 = r1.f8670h
            r13.mo6489k0(r2)
            r9.add(r13)
            if (r0 != 0) goto L_0x0031
            return
        L_0x0031:
            int r2 = r22.size()
            r3 = 2
            if (r0 != r3) goto L_0x003a
            int r2 = r2 + -1
        L_0x003a:
            r0 = 0
            r4 = 3
            r5 = 1
            java.lang.String r6 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r7[r0] = r8     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            r7[r5] = r12     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            r7[r3] = r11     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            java.lang.reflect.Constructor r6 = r6.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            r7[r0] = r20     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            r7[r5] = r21     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            r7[r3] = r19     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            java.lang.Object r6 = r6.newInstance(r7)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            c.a.a.a.p1 r6 = (p067c.p068a.p069a.p070a.C1227p1) r6     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            int r7 = r2 + 1
            r9.add(r2, r6)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x006c }
            java.lang.String r2 = "Loaded LibopusAudioRenderer."
            p067c.p068a.p069a.p070a.p111m2.Log.m10384f(r10, r2)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x006c }
            goto L_0x0076
        L_0x006a:
            r2 = r7
            goto L_0x0075
        L_0x006c:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating Opus extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x0075:
            r7 = r2
        L_0x0076:
            java.lang.String r2 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r6[r0] = r8     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            r6[r5] = r12     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            r6[r3] = r11     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            r6[r0] = r20     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            r6[r5] = r21     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            r6[r3] = r19     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            java.lang.Object r2 = r2.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            c.a.a.a.p1 r2 = (p067c.p068a.p069a.p070a.C1227p1) r2     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            int r6 = r7 + 1
            r9.add(r7, r2)     // Catch:{ ClassNotFoundException -> 0x00a3, Exception -> 0x00a5 }
            java.lang.String r2 = "Loaded LibflacAudioRenderer."
            p067c.p068a.p069a.p070a.p111m2.Log.m10384f(r10, r2)     // Catch:{ ClassNotFoundException -> 0x00a3, Exception -> 0x00a5 }
            goto L_0x00af
        L_0x00a3:
            r7 = r6
            goto L_0x00ae
        L_0x00a5:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating FLAC extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x00ae:
            r6 = r7
        L_0x00af:
            java.lang.String r2 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r7[r0] = r8     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r7[r5] = r12     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r7[r3] = r11     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r4[r0] = r20     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r4[r5] = r21     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r4[r3] = r19     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.Object r0 = r2.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            c.a.a.a.p1 r0 = (p067c.p068a.p069a.p070a.C1227p1) r0     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r9.add(r6, r0)     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            p067c.p068a.p069a.p070a.p111m2.Log.m10384f(r10, r0)     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            goto L_0x00e3
        L_0x00da:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating FFmpeg extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.DefaultRenderersFactory.mo7622b(android.content.Context, int, c.a.a.a.g2.u, boolean, c.a.a.a.b2.s, android.os.Handler, c.a.a.a.b2.r, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public AudioSink mo7623c(Context context, boolean z, boolean z2, boolean z3) {
        DefaultAudioSink yVar = new DefaultAudioSink(AudioCapabilities.m6643b(context), new C0843d(new AudioProcessor[0]), z, z2, z3);
        return yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7624d(Context context, int i, ArrayList<C1227p1> arrayList) {
        arrayList.add(new CameraMotionRenderer());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo7625e(Context context, MetadataOutput fVar, Looper looper, int i, ArrayList<C1227p1> arrayList) {
        arrayList.add(new MetadataRenderer(fVar, looper));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo7626f(Context context, Handler handler, int i, ArrayList<C1227p1> arrayList) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7627g(Context context, TextOutput lVar, Looper looper, int i, ArrayList<C1227p1> arrayList) {
        arrayList.add(new TextRenderer(lVar, looper));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0088, code lost:
        throw new java.lang.RuntimeException("Error instantiating VP9 extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0080 A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x0043] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7628h(android.content.Context r16, int r17, p067c.p068a.p069a.p070a.p087g2.MediaCodecSelector r18, boolean r19, android.os.Handler r20, p067c.p068a.p069a.p070a.p112n2.VideoRendererEventListener r21, long r22, java.util.ArrayList<p067c.p068a.p069a.p070a.C1227p1> r24) {
        /*
            r15 = this;
            r1 = r15
            r0 = r17
            r11 = r24
            java.lang.String r12 = "DefaultRenderersFactory"
            java.lang.Class<c.a.a.a.n2.z> r13 = p067c.p068a.p069a.p070a.p112n2.VideoRendererEventListener.class
            c.a.a.a.n2.q r14 = new c.a.a.a.n2.q
            r10 = 50
            r2 = r14
            r3 = r16
            r4 = r18
            r5 = r22
            r7 = r19
            r8 = r20
            r9 = r21
            r2.<init>(r3, r4, r5, r7, r8, r9, r10)
            boolean r2 = r1.f8668f
            r14.mo6486i0(r2)
            boolean r2 = r1.f8669g
            r14.mo6487j0(r2)
            boolean r2 = r1.f8670h
            r14.mo6489k0(r2)
            r11.add(r14)
            if (r0 != 0) goto L_0x0032
            return
        L_0x0032:
            int r2 = r24.size()
            r3 = 2
            if (r0 != r3) goto L_0x003b
            int r2 = r2 + -1
        L_0x003b:
            r0 = 50
            r4 = 3
            r5 = 0
            r6 = 4
            r7 = 1
            java.lang.String r8 = "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r5] = r10     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Class<android.os.Handler> r10 = android.os.Handler.class
            r9[r7] = r10     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r3] = r13     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r4] = r10     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.reflect.Constructor r8 = r8.getConstructor(r9)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Long r10 = java.lang.Long.valueOf(r22)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r5] = r10     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r7] = r20     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r3] = r21     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r4] = r10     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Object r8 = r8.newInstance(r9)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            c.a.a.a.p1 r8 = (p067c.p068a.p069a.p070a.C1227p1) r8     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            int r9 = r2 + 1
            r11.add(r2, r8)     // Catch:{ ClassNotFoundException -> 0x007e, Exception -> 0x0080 }
            java.lang.String r2 = "Loaded LibvpxVideoRenderer."
            p067c.p068a.p069a.p070a.p111m2.Log.m10384f(r12, r2)     // Catch:{ ClassNotFoundException -> 0x007e, Exception -> 0x0080 }
            goto L_0x008a
        L_0x007e:
            r2 = r9
            goto L_0x0089
        L_0x0080:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating VP9 extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x0089:
            r9 = r2
        L_0x008a:
            java.lang.String r2 = "com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            r8[r5] = r10     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.Class<android.os.Handler> r10 = android.os.Handler.class
            r8[r7] = r10     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            r8[r3] = r13     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            r8[r4] = r10     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r8)     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.Long r8 = java.lang.Long.valueOf(r22)     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            r6[r5] = r8     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            r6[r7] = r20     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            r6[r3] = r21     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            r6[r4] = r0     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.Object r0 = r2.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            c.a.a.a.p1 r0 = (p067c.p068a.p069a.p070a.C1227p1) r0     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            r11.add(r9, r0)     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.String r0 = "Loaded Libgav1VideoRenderer."
            p067c.p068a.p069a.p070a.p111m2.Log.m10384f(r12, r0)     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            goto L_0x00ce
        L_0x00c5:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating AV1 extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.DefaultRenderersFactory.mo7628h(android.content.Context, int, c.a.a.a.g2.u, boolean, android.os.Handler, c.a.a.a.n2.z, long, java.util.ArrayList):void");
    }
}
