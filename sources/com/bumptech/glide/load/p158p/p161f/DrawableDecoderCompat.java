package com.bumptech.glide.load.p158p.p161f;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.core.content.p007c.ResourcesCompat;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p011a.p017n.ContextThemeWrapper;

/* renamed from: com.bumptech.glide.load.p.f.a */
public final class DrawableDecoderCompat {

    /* renamed from: a */
    private static volatile boolean f10918a = true;

    /* renamed from: a */
    public static Drawable m13487a(Context context, int i, Theme theme) {
        return m13489c(context, context, i, theme);
    }

    /* renamed from: b */
    public static Drawable m13488b(Context context, Context context2, int i) {
        return m13489c(context, context2, i, null);
    }

    /* renamed from: c */
    private static Drawable m13489c(Context context, Context context2, int i, Theme theme) {
        try {
            if (f10918a) {
                return m13491e(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f10918a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return ContextCompat.m1758d(context2, i);
            }
            throw e;
        } catch (NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m13490d(context2, i, theme);
    }

    /* renamed from: d */
    private static Drawable m13490d(Context context, int i, Theme theme) {
        return ResourcesCompat.m1811a(context.getResources(), i, theme);
    }

    /* renamed from: e */
    private static Drawable m13491e(Context context, int i, Theme theme) {
        if (theme != null) {
            context = new ContextThemeWrapper(context, theme);
        }
        return AppCompatResources.m4143d(context, i);
    }
}
