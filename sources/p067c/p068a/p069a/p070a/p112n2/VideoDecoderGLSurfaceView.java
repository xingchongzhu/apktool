package p067c.p068a.p069a.p070a.p112n2;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* renamed from: c.a.a.a.n2.s */
public class VideoDecoderGLSurfaceView extends GLSurfaceView {

    /* renamed from: a */
    private final VideoDecoderGLFrameRenderer f8628a;

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    public VideoDecoderOutputBufferRenderer getVideoDecoderOutputBufferRenderer() {
        return this.f8628a;
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        VideoDecoderGLFrameRenderer rVar = new VideoDecoderGLFrameRenderer(this);
        this.f8628a = rVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(rVar);
        setRenderMode(0);
    }
}
