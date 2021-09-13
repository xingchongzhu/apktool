package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.appcompat.widget.o0 */
class ResourcesWrapper extends Resources {

    /* renamed from: a */
    private final Resources f1144a;

    public ResourcesWrapper(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1144a = resources;
    }

    public XmlResourceParser getAnimation(int i) throws NotFoundException {
        return this.f1144a.getAnimation(i);
    }

    public boolean getBoolean(int i) throws NotFoundException {
        return this.f1144a.getBoolean(i);
    }

    public int getColor(int i) throws NotFoundException {
        return this.f1144a.getColor(i);
    }

    public ColorStateList getColorStateList(int i) throws NotFoundException {
        return this.f1144a.getColorStateList(i);
    }

    public Configuration getConfiguration() {
        return this.f1144a.getConfiguration();
    }

    public float getDimension(int i) throws NotFoundException {
        return this.f1144a.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) throws NotFoundException {
        return this.f1144a.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) throws NotFoundException {
        return this.f1144a.getDimensionPixelSize(i);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f1144a.getDisplayMetrics();
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        return this.f1144a.getDrawable(i);
    }

    public Drawable getDrawableForDensity(int i, int i2) throws NotFoundException {
        return this.f1144a.getDrawableForDensity(i, i2);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.f1144a.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f1144a.getIdentifier(str, str2, str3);
    }

    public int[] getIntArray(int i) throws NotFoundException {
        return this.f1144a.getIntArray(i);
    }

    public int getInteger(int i) throws NotFoundException {
        return this.f1144a.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) throws NotFoundException {
        return this.f1144a.getLayout(i);
    }

    public Movie getMovie(int i) throws NotFoundException {
        return this.f1144a.getMovie(i);
    }

    public String getQuantityString(int i, int i2, Object... objArr) throws NotFoundException {
        return this.f1144a.getQuantityString(i, i2, objArr);
    }

    public CharSequence getQuantityText(int i, int i2) throws NotFoundException {
        return this.f1144a.getQuantityText(i, i2);
    }

    public String getResourceEntryName(int i) throws NotFoundException {
        return this.f1144a.getResourceEntryName(i);
    }

    public String getResourceName(int i) throws NotFoundException {
        return this.f1144a.getResourceName(i);
    }

    public String getResourcePackageName(int i) throws NotFoundException {
        return this.f1144a.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) throws NotFoundException {
        return this.f1144a.getResourceTypeName(i);
    }

    public String getString(int i) throws NotFoundException {
        return this.f1144a.getString(i);
    }

    public String[] getStringArray(int i) throws NotFoundException {
        return this.f1144a.getStringArray(i);
    }

    public CharSequence getText(int i) throws NotFoundException {
        return this.f1144a.getText(i);
    }

    public CharSequence[] getTextArray(int i) throws NotFoundException {
        return this.f1144a.getTextArray(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) throws NotFoundException {
        this.f1144a.getValue(i, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws NotFoundException {
        this.f1144a.getValueForDensity(i, i2, typedValue, z);
    }

    public XmlResourceParser getXml(int i) throws NotFoundException {
        return this.f1144a.getXml(i);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f1144a.obtainAttributes(attributeSet, iArr);
    }

    public TypedArray obtainTypedArray(int i) throws NotFoundException {
        return this.f1144a.obtainTypedArray(i);
    }

    public InputStream openRawResource(int i) throws NotFoundException {
        return this.f1144a.openRawResource(i);
    }

    public AssetFileDescriptor openRawResourceFd(int i) throws NotFoundException {
        return this.f1144a.openRawResourceFd(i);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f1144a.parseBundleExtra(str, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f1144a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f1144a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public Drawable getDrawable(int i, Theme theme) throws NotFoundException {
        return this.f1144a.getDrawable(i, theme);
    }

    public Drawable getDrawableForDensity(int i, int i2, Theme theme) {
        return this.f1144a.getDrawableForDensity(i, i2, theme);
    }

    public String getQuantityString(int i, int i2) throws NotFoundException {
        return this.f1144a.getQuantityString(i, i2);
    }

    public String getString(int i, Object... objArr) throws NotFoundException {
        return this.f1144a.getString(i, objArr);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f1144a.getText(i, charSequence);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) throws NotFoundException {
        this.f1144a.getValue(str, typedValue, z);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) throws NotFoundException {
        return this.f1144a.openRawResource(i, typedValue);
    }
}
