package com.tv91.features.shared.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.tv91.C2336p;
import java.util.concurrent.TimeUnit;

public final class CountdownTextView extends AppCompatTextView {

    /* renamed from: f */
    private CountDownTimer f14012f;

    /* renamed from: g */
    private boolean f14013g;

    /* renamed from: h */
    private int f14014h;

    /* renamed from: i */
    private int f14015i;

    /* renamed from: j */
    private int f14016j;

    /* renamed from: k */
    private long f14017k;

    /* renamed from: l */
    private int f14018l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f14019m;

    /* renamed from: n */
    private int f14020n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C2312b f14021o;

    /* renamed from: com.tv91.features.shared.widget.CountdownTextView$a */
    class C2311a extends CountDownTimer {
        C2311a(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            if (CountdownTextView.this.f14021o != null) {
                CountdownTextView.this.f14021o.mo16868a();
            }
            CountdownTextView.this.m17412o();
            CountdownTextView.this.mo16859n();
        }

        public void onTick(long j) {
            int i = (int) j;
            if (i > 0) {
                if (CountdownTextView.this.f14021o != null) {
                    CountdownTextView.this.f14021o.mo16869b(i);
                }
                if (CountdownTextView.this.f14019m != -1) {
                    CountdownTextView countdownTextView = CountdownTextView.this;
                    countdownTextView.setText(countdownTextView.getContext().getString(CountdownTextView.this.f14019m, new Object[]{Integer.valueOf(CountdownTextView.this.m17411k((long) i))}));
                }
            }
        }
    }

    /* renamed from: com.tv91.features.shared.widget.CountdownTextView$b */
    public interface C2312b {
        /* renamed from: a */
        void mo16868a();

        /* renamed from: b */
        void mo16869b(int i);
    }

    public CountdownTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* renamed from: j */
    private void m17410j() {
        if (this.f14019m != -1) {
            setText(getContext().getString(this.f14019m, new Object[]{Integer.valueOf(this.f14014h)}));
        }
        setClickable(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public int m17411k(long j) {
        return (int) TimeUnit.MILLISECONDS.toSeconds(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m17412o() {
        int i = this.f14020n;
        if (i != -1) {
            setText(i);
        }
        setClickable(true);
    }

    /* renamed from: l */
    public void mo16857l() {
        mo16858m(this.f14014h, this.f14016j);
    }

    /* renamed from: m */
    public void mo16858m(int i, int i2) {
        if (!this.f14013g) {
            m17410j();
            C2311a aVar = new C2311a(1000 * ((long) i), (long) i2);
            this.f14012f = aVar;
            this.f14017k = SystemClock.elapsedRealtime();
            this.f14013g = true;
            this.f14012f.start();
        }
    }

    /* renamed from: n */
    public void mo16859n() {
        CountDownTimer countDownTimer = this.f14012f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f14013g = false;
            this.f14012f = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.f14018l;
        if (i != -1) {
            setText(i);
        }
        if (this.f14013g) {
            int i2 = this.f14015i;
            if (i2 > 0) {
                mo16858m(i2, this.f14016j);
                return;
            }
        }
        this.f14013g = false;
        m17412o();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14021o = null;
        mo16859n();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        this.f14013g = bundle.getBoolean("CountdownTextView_countDownStarted");
        this.f14015i = bundle.getInt("CountdownTextView_countDownTime");
        super.onRestoreInstanceState(bundle.getParcelable("CountdownTextView_superState"));
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CountdownTextView_superState", super.onSaveInstanceState());
        bundle.putBoolean("CountdownTextView_countDownStarted", this.f14013g);
        int k = this.f14014h - m17411k(SystemClock.elapsedRealtime() - this.f14017k);
        this.f14015i = k;
        bundle.putInt("CountdownTextView_countDownTime", k);
        return bundle;
    }

    public void setCountDownListener(C2312b bVar) {
        this.f14021o = bVar;
    }

    public void setCountDownTime(int i) {
        this.f14014h = i;
        if (this.f14013g) {
            mo16859n();
            mo16857l();
        }
    }

    public CountdownTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14017k = -1;
        this.f14018l = -1;
        this.f14019m = -1;
        this.f14020n = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2336p.f14160P);
            this.f14014h = obtainStyledAttributes.getInt(2, 60);
            this.f14016j = obtainStyledAttributes.getInt(0, 1000);
            this.f14018l = obtainStyledAttributes.getResourceId(4, -1);
            this.f14019m = obtainStyledAttributes.getResourceId(1, -1);
            this.f14020n = obtainStyledAttributes.getResourceId(3, this.f14018l);
            obtainStyledAttributes.recycle();
        }
    }
}
