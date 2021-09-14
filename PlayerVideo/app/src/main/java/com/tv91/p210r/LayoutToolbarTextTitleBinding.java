package com.tv91.p210r;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.y */
public final class LayoutToolbarTextTitleBinding implements ViewBinding {

    /* renamed from: a */
    private final Toolbar f14684a;

    /* renamed from: b */
    public final TextView f14685b;

    private LayoutToolbarTextTitleBinding(Toolbar toolbar, TextView textView) {
        this.f14684a = toolbar;
        this.f14685b = textView;
    }

    /* renamed from: b */
    public static LayoutToolbarTextTitleBinding m17835b(View view) {
        TextView textView = (TextView) view.findViewById(R.id.text_toolbar_title);
        if (textView != null) {
            return new LayoutToolbarTextTitleBinding((Toolbar) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.text_toolbar_title)));
    }

    /* renamed from: c */
    public Toolbar mo5604a() {
        return this.f14684a;
    }
}
