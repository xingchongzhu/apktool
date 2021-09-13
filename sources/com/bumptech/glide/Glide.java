package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.InputStreamRewinder.C1428a;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.C1421a;
import com.bumptech.glide.load.p152n.Engine;
import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import com.bumptech.glide.load.p152n.p154b0.MemoryCache;
import com.bumptech.glide.load.p156o.AssetUriLoader.C1507b;
import com.bumptech.glide.load.p156o.AssetUriLoader.C1508c;
import com.bumptech.glide.load.p156o.ByteArrayLoader.C1509a;
import com.bumptech.glide.load.p156o.ByteArrayLoader.C1513d;
import com.bumptech.glide.load.p156o.ByteBufferEncoder;
import com.bumptech.glide.load.p156o.ByteBufferFileLoader.C1516b;
import com.bumptech.glide.load.p156o.DataUrlLoader.C1519c;
import com.bumptech.glide.load.p156o.FileLoader.C1522b;
import com.bumptech.glide.load.p156o.FileLoader.C1526e;
import com.bumptech.glide.load.p156o.GlideUrl;
import com.bumptech.glide.load.p156o.MediaStoreFileLoader.C1531a;
import com.bumptech.glide.load.p156o.ResourceLoader.C1542a;
import com.bumptech.glide.load.p156o.ResourceLoader.C1543b;
import com.bumptech.glide.load.p156o.ResourceLoader.C1544c;
import com.bumptech.glide.load.p156o.ResourceLoader.C1545d;
import com.bumptech.glide.load.p156o.StreamEncoder;
import com.bumptech.glide.load.p156o.StringLoader.C1546a;
import com.bumptech.glide.load.p156o.StringLoader.C1547b;
import com.bumptech.glide.load.p156o.StringLoader.C1548c;
import com.bumptech.glide.load.p156o.UnitModelLoader.C1549a;
import com.bumptech.glide.load.p156o.UriLoader.C1551a;
import com.bumptech.glide.load.p156o.UriLoader.C1552b;
import com.bumptech.glide.load.p156o.UriLoader.C1554d;
import com.bumptech.glide.load.p156o.UrlUriLoader.C1555a;
import com.bumptech.glide.load.p156o.p157y.HttpGlideUrlLoader.C1556a;
import com.bumptech.glide.load.p156o.p157y.MediaStoreImageThumbLoader.C1557a;
import com.bumptech.glide.load.p156o.p157y.MediaStoreVideoThumbLoader.C1558a;
import com.bumptech.glide.load.p156o.p157y.QMediaStoreUriLoader.C1560b;
import com.bumptech.glide.load.p156o.p157y.QMediaStoreUriLoader.C1561c;
import com.bumptech.glide.load.p156o.p157y.UrlLoader.C1563a;
import com.bumptech.glide.load.p158p.p159d.BitmapDrawableDecoder;
import com.bumptech.glide.load.p158p.p159d.BitmapDrawableEncoder;
import com.bumptech.glide.load.p158p.p159d.BitmapEncoder;
import com.bumptech.glide.load.p158p.p159d.ByteBufferBitmapDecoder;
import com.bumptech.glide.load.p158p.p159d.ByteBufferBitmapImageDecoderResourceDecoder;
import com.bumptech.glide.load.p158p.p159d.DefaultImageHeaderParser;
import com.bumptech.glide.load.p158p.p159d.Downsampler;
import com.bumptech.glide.load.p158p.p159d.ExifInterfaceImageHeaderParser;
import com.bumptech.glide.load.p158p.p159d.InputStreamBitmapImageDecoderResourceDecoder;
import com.bumptech.glide.load.p158p.p159d.ParcelFileDescriptorBitmapDecoder;
import com.bumptech.glide.load.p158p.p159d.ResourceBitmapDecoder;
import com.bumptech.glide.load.p158p.p159d.StreamBitmapDecoder;
import com.bumptech.glide.load.p158p.p159d.UnitBitmapDecoder;
import com.bumptech.glide.load.p158p.p159d.VideoDecoder;
import com.bumptech.glide.load.p158p.p160e.ByteBufferRewinder.C1598a;
import com.bumptech.glide.load.p158p.p161f.ResourceDrawableDecoder;
import com.bumptech.glide.load.p158p.p161f.UnitDrawableDecoder;
import com.bumptech.glide.load.p158p.p162g.FileDecoder;
import com.bumptech.glide.load.p158p.p163h.ByteBufferGifDecoder;
import com.bumptech.glide.load.p158p.p163h.GifDrawable;
import com.bumptech.glide.load.p158p.p163h.GifDrawableEncoder;
import com.bumptech.glide.load.p158p.p163h.GifFrameResourceDecoder;
import com.bumptech.glide.load.p158p.p163h.StreamGifDecoder;
import com.bumptech.glide.load.p158p.p164i.BitmapBytesTranscoder;
import com.bumptech.glide.load.p158p.p164i.BitmapDrawableTranscoder;
import com.bumptech.glide.load.p158p.p164i.DrawableBytesTranscoder;
import com.bumptech.glide.load.p158p.p164i.GifDrawableBytesTranscoder;
import com.bumptech.glide.p166n.GifDecoder;
import com.bumptech.glide.p167o.ConnectivityMonitorFactory;
import com.bumptech.glide.p167o.RequestManagerRetriever;
import com.bumptech.glide.p168p.GlideModule;
import com.bumptech.glide.p168p.ManifestParser;
import com.bumptech.glide.p170r.RequestListener;
import com.bumptech.glide.p170r.RequestOptions;
import com.bumptech.glide.p170r.p171j.ImageViewTargetFactory;
import com.bumptech.glide.p170r.p171j.Target;
import com.bumptech.glide.p174t.C1638j;
import com.bumptech.glide.p174t.C1639k;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bumptech.glide.b */
public class Glide implements ComponentCallbacks2 {

    /* renamed from: a */
    private static volatile Glide f10177a;

    /* renamed from: b */
    private static volatile boolean f10178b;

    /* renamed from: c */
    private final Engine f10179c;

    /* renamed from: d */
    private final BitmapPool f10180d;

    /* renamed from: e */
    private final MemoryCache f10181e;

    /* renamed from: f */
    private final GlideContext f10182f;

    /* renamed from: g */
    private final Registry f10183g;

    /* renamed from: h */
    private final ArrayPool f10184h;

    /* renamed from: i */
    private final RequestManagerRetriever f10185i;

    /* renamed from: j */
    private final ConnectivityMonitorFactory f10186j;

    /* renamed from: k */
    private final List<RequestManager> f10187k = new ArrayList();

    /* renamed from: l */
    private final C1405a f10188l;

    /* renamed from: m */
    private MemoryCategory f10189m = MemoryCategory.NORMAL;

    /* renamed from: com.bumptech.glide.b$a */
    /* compiled from: Glide */
    public interface C1405a {
        /* renamed from: a */
        RequestOptions mo8699a();
    }

    Glide(Context context, Engine kVar, MemoryCache hVar, BitmapPool eVar, ArrayPool bVar, RequestManagerRetriever pVar, ConnectivityMonitorFactory dVar, int i, C1405a aVar, Map<Class<?>, TransitionOptions<?, ?>> map, List<RequestListener<Object>> list, GlideExperiments eVar2) {
        ResourceDecoder kVar2;
        ResourceDecoder kVar3;
        Context context2 = context;
        BitmapPool eVar3 = eVar;
        ArrayPool bVar2 = bVar;
        Class<GifDecoder> cls = GifDecoder.class;
        Class<String> cls2 = String.class;
        Class<Integer> cls3 = Integer.class;
        Class<byte[]> cls4 = byte[].class;
        this.f10179c = kVar;
        this.f10180d = eVar3;
        this.f10184h = bVar2;
        this.f10181e = hVar;
        this.f10185i = pVar;
        this.f10186j = dVar;
        this.f10188l = aVar;
        Resources resources = context.getResources();
        Registry iVar = new Registry();
        this.f10183g = iVar;
        iVar.mo8726o(new DefaultImageHeaderParser());
        int i2 = VERSION.SDK_INT;
        if (i2 >= 27) {
            iVar.mo8726o(new ExifInterfaceImageHeaderParser());
        }
        List g = iVar.mo8718g();
        ByteBufferGifDecoder aVar2 = new ByteBufferGifDecoder(context2, g, eVar3, bVar2);
        ResourceDecoder h = VideoDecoder.m13308h(eVar);
        Downsampler nVar = new Downsampler(iVar.mo8718g(), resources.getDisplayMetrics(), eVar3, bVar2);
        if (!eVar2.mo8711a(C1407b.class) || i2 < 28) {
            ResourceDecoder gVar = new ByteBufferBitmapDecoder(nVar);
            kVar3 = new StreamBitmapDecoder(nVar, bVar2);
            kVar2 = gVar;
        } else {
            kVar3 = new InputStreamBitmapImageDecoderResourceDecoder();
            kVar2 = new ByteBufferBitmapImageDecoderResourceDecoder();
        }
        Class<byte[]> cls5 = cls4;
        ResourceDrawableDecoder dVar2 = new ResourceDrawableDecoder(context2);
        int i3 = i2;
        C1544c cVar = new C1544c(resources);
        C1545d dVar3 = new C1545d(resources);
        Class<String> cls6 = cls2;
        C1543b bVar3 = new C1543b(resources);
        C1545d dVar4 = dVar3;
        C1542a aVar3 = new C1542a(resources);
        BitmapEncoder cVar2 = new BitmapEncoder(bVar2);
        Class<Integer> cls7 = cls3;
        BitmapBytesTranscoder aVar4 = new BitmapBytesTranscoder();
        GifDrawableBytesTranscoder dVar5 = new GifDrawableBytesTranscoder();
        ContentResolver contentResolver = context.getContentResolver();
        C1543b bVar4 = bVar3;
        C1544c cVar3 = cVar;
        ResourceDrawableDecoder dVar6 = dVar2;
        String str = "Bitmap";
        iVar.mo8713a(ByteBuffer.class, new ByteBufferEncoder()).mo8713a(InputStream.class, new StreamEncoder(bVar2)).mo8717e(str, ByteBuffer.class, Bitmap.class, kVar2).mo8717e(str, InputStream.class, Bitmap.class, kVar3);
        if (ParcelFileDescriptorRewinder.m12483c()) {
            iVar.mo8717e(str, ParcelFileDescriptor.class, Bitmap.class, new ParcelFileDescriptorBitmapDecoder(nVar));
        }
        BitmapDrawableDecoder aVar5 = new BitmapDrawableDecoder(resources, kVar2);
        String str2 = "BitmapDrawable";
        String str3 = "Gif";
        ResourceDrawableDecoder dVar7 = dVar6;
        iVar.mo8717e(str, ParcelFileDescriptor.class, Bitmap.class, h).mo8717e(str, AssetFileDescriptor.class, Bitmap.class, VideoDecoder.m13303c(eVar)).mo8716d(Bitmap.class, Bitmap.class, C1549a.m13191a()).mo8717e(str, Bitmap.class, Bitmap.class, new UnitBitmapDecoder()).mo8714b(Bitmap.class, cVar2).mo8717e(str2, ByteBuffer.class, BitmapDrawable.class, aVar5).mo8717e(str2, InputStream.class, BitmapDrawable.class, new BitmapDrawableDecoder(resources, kVar3)).mo8717e(str2, ParcelFileDescriptor.class, BitmapDrawable.class, new BitmapDrawableDecoder(resources, h)).mo8714b(BitmapDrawable.class, new BitmapDrawableEncoder(eVar3, cVar2)).mo8717e(str3, InputStream.class, GifDrawable.class, new StreamGifDecoder(g, aVar2, bVar2)).mo8717e(str3, ByteBuffer.class, GifDrawable.class, aVar2).mo8714b(GifDrawable.class, new GifDrawableEncoder()).mo8716d(cls, cls, C1549a.m13191a()).mo8717e(str, cls, Bitmap.class, new GifFrameResourceDecoder(eVar3)).mo8715c(Uri.class, Drawable.class, dVar7).mo8715c(Uri.class, Bitmap.class, new ResourceBitmapDecoder(dVar7, eVar3)).mo8727p(new C1598a()).mo8716d(File.class, ByteBuffer.class, new C1516b()).mo8716d(File.class, InputStream.class, new C1526e()).mo8715c(File.class, File.class, new FileDecoder()).mo8716d(File.class, ParcelFileDescriptor.class, new C1522b()).mo8716d(File.class, File.class, C1549a.m13191a()).mo8727p(new C1428a(bVar2));
        if (ParcelFileDescriptorRewinder.m12483c()) {
            iVar.mo8727p(new C1421a());
        }
        Class cls8 = Integer.TYPE;
        C1544c cVar4 = cVar3;
        C1543b bVar5 = bVar4;
        Class<Integer> cls9 = cls7;
        C1545d dVar8 = dVar4;
        C1542a aVar6 = aVar3;
        Class<String> cls10 = cls6;
        Context context3 = context;
        iVar.mo8716d(cls8, InputStream.class, cVar4).mo8716d(cls8, ParcelFileDescriptor.class, bVar5).mo8716d(cls9, InputStream.class, cVar4).mo8716d(cls9, ParcelFileDescriptor.class, bVar5).mo8716d(cls9, Uri.class, dVar8).mo8716d(cls8, AssetFileDescriptor.class, aVar6).mo8716d(cls9, AssetFileDescriptor.class, aVar6).mo8716d(cls8, Uri.class, dVar8).mo8716d(cls10, InputStream.class, new C1519c()).mo8716d(Uri.class, InputStream.class, new C1519c()).mo8716d(cls10, InputStream.class, new C1548c()).mo8716d(cls10, ParcelFileDescriptor.class, new C1547b()).mo8716d(cls10, AssetFileDescriptor.class, new C1546a()).mo8716d(Uri.class, InputStream.class, new C1508c(context.getAssets())).mo8716d(Uri.class, ParcelFileDescriptor.class, new C1507b(context.getAssets())).mo8716d(Uri.class, InputStream.class, new C1557a(context3)).mo8716d(Uri.class, InputStream.class, new C1558a(context3));
        int i4 = i3;
        if (i4 >= 29) {
            iVar.mo8716d(Uri.class, InputStream.class, new C1561c(context3));
            iVar.mo8716d(Uri.class, ParcelFileDescriptor.class, new C1560b(context3));
        }
        ContentResolver contentResolver2 = contentResolver;
        Class<byte[]> cls11 = cls5;
        BitmapBytesTranscoder aVar7 = aVar4;
        GifDrawableBytesTranscoder dVar9 = dVar5;
        iVar.mo8716d(Uri.class, InputStream.class, new C1554d(contentResolver2)).mo8716d(Uri.class, ParcelFileDescriptor.class, new C1552b(contentResolver2)).mo8716d(Uri.class, AssetFileDescriptor.class, new C1551a(contentResolver2)).mo8716d(Uri.class, InputStream.class, new C1555a()).mo8716d(URL.class, InputStream.class, new C1563a()).mo8716d(Uri.class, File.class, new C1531a(context3)).mo8716d(GlideUrl.class, InputStream.class, new C1556a()).mo8716d(cls11, ByteBuffer.class, new C1509a()).mo8716d(cls11, InputStream.class, new C1513d()).mo8716d(Uri.class, Uri.class, C1549a.m13191a()).mo8716d(Drawable.class, Drawable.class, C1549a.m13191a()).mo8715c(Drawable.class, Drawable.class, new UnitDrawableDecoder()).mo8728q(Bitmap.class, BitmapDrawable.class, new BitmapDrawableTranscoder(resources)).mo8728q(Bitmap.class, cls11, aVar7).mo8728q(Drawable.class, cls11, new DrawableBytesTranscoder(eVar3, aVar7, dVar9)).mo8728q(GifDrawable.class, cls11, dVar9);
        if (i4 >= 23) {
            ResourceDecoder d = VideoDecoder.m13304d(eVar);
            iVar.mo8715c(ByteBuffer.class, Bitmap.class, d);
            iVar.mo8715c(ByteBuffer.class, BitmapDrawable.class, new BitmapDrawableDecoder(resources, d));
        }
        GlideContext dVar10 = new GlideContext(context, bVar, iVar, new ImageViewTargetFactory(), aVar, map, list, kVar, eVar2, i);
        this.f10182f = dVar10;
    }

    /* renamed from: a */
    private static void m12383a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f10178b) {
            f10178b = true;
            m12387m(context, generatedAppGlideModule);
            f10178b = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /* renamed from: c */
    public static Glide m12384c(Context context) {
        if (f10177a == null) {
            GeneratedAppGlideModule d = m12385d(context.getApplicationContext());
            synchronized (Glide.class) {
                if (f10177a == null) {
                    m12383a(context, d);
                }
            }
        }
        return f10177a;
    }

    /* renamed from: d */
    private static GeneratedAppGlideModule m12385d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            String str = "Glide";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
        } catch (InstantiationException e) {
            m12389q(e);
        } catch (IllegalAccessException e2) {
            m12389q(e2);
        } catch (NoSuchMethodException e3) {
            m12389q(e3);
        } catch (InvocationTargetException e4) {
            m12389q(e4);
        }
        return null;
    }

    /* renamed from: l */
    private static RequestManagerRetriever m12386l(Context context) {
        C1638j.m14082e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m12384c(context).mo8691k();
    }

    /* renamed from: m */
    private static void m12387m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m12388n(context, new GlideBuilder(), generatedAppGlideModule);
    }

    /* renamed from: n */
    private static void m12388n(Context context, GlideBuilder cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<GlideModule> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo9423c()) {
            emptyList = new ManifestParser(applicationContext).mo9427a();
        }
        String str = "Glide";
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo8682d().isEmpty()) {
            Set d = generatedAppGlideModule.mo8682d();
            Iterator it = emptyList.iterator();
            while (it.hasNext()) {
                GlideModule bVar = (GlideModule) it.next();
                if (d.contains(bVar.getClass())) {
                    if (Log.isLoggable(str, 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("AppGlideModule excludes manifest GlideModule: ");
                        sb.append(bVar);
                        Log.d(str, sb.toString());
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable(str, 3)) {
            for (GlideModule bVar2 : emptyList) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Discovered GlideModule from manifest: ");
                sb2.append(bVar2.getClass());
                Log.d(str, sb2.toString());
            }
        }
        cVar.mo8701b(generatedAppGlideModule != null ? generatedAppGlideModule.mo8683e() : null);
        for (GlideModule a : emptyList) {
            a.mo9424a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo9422b(applicationContext, cVar);
        }
        Glide a2 = cVar.mo8700a(applicationContext);
        for (GlideModule bVar3 : emptyList) {
            try {
                bVar3.mo9425b(applicationContext, a2, a2.f10183g);
            } catch (AbstractMethodError e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                sb3.append(bVar3.getClass().getName());
                throw new IllegalStateException(sb3.toString(), e);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo9426a(applicationContext, a2, a2.f10183g);
        }
        applicationContext.registerComponentCallbacks(a2);
        f10177a = a2;
    }

    /* renamed from: q */
    private static void m12389q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static RequestManager m12390t(Context context) {
        return m12386l(context).mo9396l(context);
    }

    /* renamed from: u */
    public static RequestManager m12391u(View view) {
        return m12386l(view.getContext()).mo9397m(view);
    }

    /* renamed from: b */
    public void mo8684b() {
        C1639k.m14083a();
        this.f10181e.mo8929b();
        this.f10180d.mo8881b();
        this.f10184h.mo8859b();
    }

    /* renamed from: e */
    public ArrayPool mo8685e() {
        return this.f10184h;
    }

    /* renamed from: f */
    public BitmapPool mo8686f() {
        return this.f10180d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public ConnectivityMonitorFactory mo8687g() {
        return this.f10186j;
    }

    /* renamed from: h */
    public Context mo8688h() {
        return this.f10182f.getBaseContext();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public GlideContext mo8689i() {
        return this.f10182f;
    }

    /* renamed from: j */
    public Registry mo8690j() {
        return this.f10183g;
    }

    /* renamed from: k */
    public RequestManagerRetriever mo8691k() {
        return this.f10185i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo8692o(RequestManager kVar) {
        synchronized (this.f10187k) {
            if (!this.f10187k.contains(kVar)) {
                this.f10187k.add(kVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo8684b();
    }

    public void onTrimMemory(int i) {
        mo8697r(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo8696p(Target<?> hVar) {
        synchronized (this.f10187k) {
            for (RequestManager z : this.f10187k) {
                if (z.mo8762z(hVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: r */
    public void mo8697r(int i) {
        C1639k.m14083a();
        synchronized (this.f10187k) {
            for (RequestManager onTrimMemory : this.f10187k) {
                onTrimMemory.onTrimMemory(i);
            }
        }
        this.f10181e.mo8921a(i);
        this.f10180d.mo8880a(i);
        this.f10184h.mo8858a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo8698s(RequestManager kVar) {
        synchronized (this.f10187k) {
            if (this.f10187k.contains(kVar)) {
                this.f10187k.remove(kVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}
