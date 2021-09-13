package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import p010b.p011a.C0502a;
import p010b.p034g.p043k.AccessibilityDelegateCompat;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p010b.p048i.p049a.AbsSavedState;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: c */
    private static final int[] f13085c = {16842912};

    /* renamed from: d */
    private boolean f13086d;

    /* renamed from: e */
    private boolean f13087e;

    /* renamed from: f */
    private boolean f13088f;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C2043a extends AccessibilityDelegateCompat {
        C2043a() {
        }

        /* renamed from: f */
        public void mo2301f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2301f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        /* renamed from: g */
        public void mo2302g(View view, AccessibilityNodeInfoCompat cVar) {
            super.mo2302g(view, cVar);
            cVar.mo5049V(CheckableImageButton.this.mo15916a());
            cVar.mo5050W(CheckableImageButton.this.isChecked());
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$b */
    static class C2044b extends AbsSavedState {
        public static final Creator<C2044b> CREATOR = new C2045a();

        /* renamed from: c */
        boolean f13090c;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        static class C2045a implements ClassLoaderCreator<C2044b> {
            C2045a() {
            }

            /* renamed from: a */
            public C2044b createFromParcel(Parcel parcel) {
                return new C2044b(parcel, null);
            }

            /* renamed from: b */
            public C2044b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2044b(parcel, classLoader);
            }

            /* renamed from: c */
            public C2044b[] newArray(int i) {
                return new C2044b[i];
            }
        }

        public C2044b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: m */
        private void m16120m(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f13090c = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13090c ? 1 : 0);
        }

        public C2044b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m16120m(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502a.f3266B);
    }

    /* renamed from: a */
    public boolean mo15916a() {
        return this.f13087e;
    }

    public boolean isChecked() {
        return this.f13086d;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f13086d) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f13085c;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2044b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2044b bVar = (C2044b) parcelable;
        super.onRestoreInstanceState(bVar.mo5193l());
        setChecked(bVar.f13090c);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C2044b bVar = new C2044b(super.onSaveInstanceState());
        bVar.f13090c = this.f13086d;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f13087e != z) {
            this.f13087e = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f13087e && this.f13086d != z) {
            this.f13086d = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f13088f = z;
    }

    public void setPressed(boolean z) {
        if (this.f13088f) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f13086d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13087e = true;
        this.f13088f = true;
        ViewCompat.m5573o0(this, new C2043a());
    }
}
