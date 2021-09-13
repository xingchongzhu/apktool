package p010b.p034g.p043k.p044f0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: b.g.k.f0.a */
public final class AccessibilityClickableSpanCompat extends ClickableSpan {

    /* renamed from: a */
    private final int f4660a;

    /* renamed from: b */
    private final AccessibilityNodeInfoCompat f4661b;

    /* renamed from: c */
    private final int f4662c;

    public AccessibilityClickableSpanCompat(int i, AccessibilityNodeInfoCompat cVar, int i2) {
        this.f4660a = i;
        this.f4661b = cVar;
        this.f4662c = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4660a);
        this.f4661b.mo5043N(this.f4662c, bundle);
    }
}
