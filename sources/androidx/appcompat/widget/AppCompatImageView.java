package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.TintableImageSourceView;
import p010b.p034g.p043k.TintableBackgroundView;

/* renamed from: androidx.appcompat.widget.o */
public class AppCompatImageView extends ImageView implements TintableBackgroundView, TintableImageSourceView {

    /* renamed from: a */
    private final AppCompatBackgroundHelper f1142a;

    /* renamed from: b */
    private final AppCompatImageHelper f1143b;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper eVar = this.f1142a;
        if (eVar != null) {
            eVar.mo1388b();
        }
        AppCompatImageHelper nVar = this.f1143b;
        if (nVar != null) {
            nVar.mo1617b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper eVar = this.f1142a;
        if (eVar != null) {
            return eVar.mo1389c();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper eVar = this.f1142a;
        if (eVar != null) {
            return eVar.mo1390d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        AppCompatImageHelper nVar = this.f1143b;
        if (nVar != null) {
            return nVar.mo1618c();
        }
        return null;
    }

    public Mode getSupportImageTintMode() {
        AppCompatImageHelper nVar = this.f1143b;
        if (nVar != null) {
            return nVar.mo1619d();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1143b.mo1620e() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper eVar = this.f1142a;
        if (eVar != null) {
            eVar.mo1392f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper eVar = this.f1142a;
        if (eVar != null) {
            eVar.mo1393g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        AppCompatImageHelper nVar = this.f1143b;
        if (nVar != null) {
            nVar.mo1617b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        AppCompatImageHelper nVar = this.f1143b;
        if (nVar != null) {
            nVar.mo1617b();
        }
    }

    public void setImageResource(int i) {
        AppCompatImageHelper nVar = this.f1143b;
        if (nVar != null) {
            nVar.mo1622g(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        AppCompatImageHelper nVar = this.f1143b;
        if (nVar != null) {
            nVar.mo1617b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper eVar = this.f1142a;
        if (eVar != null) {
            eVar.mo1395i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        AppCompatBackgroundHelper eVar = this.f1142a;
        if (eVar != null) {
            eVar.mo1396j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        AppCompatImageHelper nVar = this.f1143b;
        if (nVar != null) {
            nVar.mo1623h(colorStateList);
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        AppCompatImageHelper nVar = this.f1143b;
        if (nVar != null) {
            nVar.mo1624i(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.m1357b(context), attributeSet, i);
        ThemeUtils.m1343a(this, getContext());
        AppCompatBackgroundHelper eVar = new AppCompatBackgroundHelper(this);
        this.f1142a = eVar;
        eVar.mo1391e(attributeSet, i);
        AppCompatImageHelper nVar = new AppCompatImageHelper(this);
        this.f1143b = nVar;
        nVar.mo1621f(attributeSet, i);
    }
}
