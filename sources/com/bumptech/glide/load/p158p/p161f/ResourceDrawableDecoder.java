package com.bumptech.glide.load.p158p.p161f;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.p152n.Resource;
import java.util.List;

/* renamed from: com.bumptech.glide.load.p.f.d */
public class ResourceDrawableDecoder implements ResourceDecoder<Uri, Drawable> {

    /* renamed from: a */
    private final Context f10920a;

    public ResourceDrawableDecoder(Context context) {
        this.f10920a = context.getApplicationContext();
    }

    /* renamed from: d */
    private Context m13499d(Uri uri, String str) {
        if (str.equals(this.f10920a.getPackageName())) {
            return this.f10920a;
        }
        try {
            return this.f10920a.createPackageContext(str, 0);
        } catch (NameNotFoundException e) {
            if (str.contains(this.f10920a.getPackageName())) {
                return this.f10920a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to obtain context or unrecognized Uri format for: ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    /* renamed from: e */
    private int m13500e(Uri uri) {
        try {
            return Integer.parseInt((String) uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized Uri format: ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    /* renamed from: f */
    private int m13501f(Context context, Uri uri) {
        List pathSegments = uri.getPathSegments();
        String str = (String) pathSegments.get(0);
        String str2 = (String) pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, uri.getAuthority());
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to find resource id for: ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    private int m13502g(Context context, Uri uri) {
        List pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m13501f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m13500e(uri);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized Uri format: ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public Resource<Drawable> mo8839a(Uri uri, int i, int i2, Options iVar) {
        Context d = m13499d(uri, uri.getAuthority());
        return NonOwnedDrawableResource.m13495g(DrawableDecoderCompat.m13488b(this.f10920a, d, m13502g(d, uri)));
    }

    /* renamed from: h */
    public boolean mo8840b(Uri uri, Options iVar) {
        return uri.getScheme().equals("android.resource");
    }
}
