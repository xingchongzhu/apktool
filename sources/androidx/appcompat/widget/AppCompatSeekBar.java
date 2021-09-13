package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p010b.p011a.C0502a;

/* renamed from: androidx.appcompat.widget.v */
public class AppCompatSeekBar extends SeekBar {

    /* renamed from: a */
    private final AppCompatSeekBarHelper f1219a;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502a.f3273I);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1219a.mo1764h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1219a.mo1765i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1219a.mo1763g(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ThemeUtils.m1343a(this, getContext());
        AppCompatSeekBarHelper wVar = new AppCompatSeekBarHelper(this);
        this.f1219a = wVar;
        wVar.mo1729c(attributeSet, i);
    }
}
