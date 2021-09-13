package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a */
    long f2041a = -1;

    /* renamed from: b */
    boolean f2042b = false;

    /* renamed from: c */
    boolean f2043c = false;

    /* renamed from: d */
    boolean f2044d = false;

    /* renamed from: e */
    private final Runnable f2045e = new C0263a();

    /* renamed from: f */
    private final Runnable f2046f = new C0264b();

    /* renamed from: androidx.core.widget.ContentLoadingProgressBar$a */
    class C0263a implements Runnable {
        C0263a() {
        }

        public void run() {
            ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
            contentLoadingProgressBar.f2042b = false;
            contentLoadingProgressBar.f2041a = -1;
            contentLoadingProgressBar.setVisibility(8);
        }
    }

    /* renamed from: androidx.core.widget.ContentLoadingProgressBar$b */
    class C0264b implements Runnable {
        C0264b() {
        }

        public void run() {
            ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
            contentLoadingProgressBar.f2043c = false;
            if (!contentLoadingProgressBar.f2044d) {
                contentLoadingProgressBar.f2041a = System.currentTimeMillis();
                ContentLoadingProgressBar.this.setVisibility(0);
            }
        }
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m1871a() {
        removeCallbacks(this.f2045e);
        removeCallbacks(this.f2046f);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1871a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1871a();
    }
}
