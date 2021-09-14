package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.f */
public final class AdapterHighlightGroupBinding implements ViewBinding {

    /* renamed from: a */
    private final RelativeLayout f14351a;

    /* renamed from: b */
    public final Button f14352b;

    /* renamed from: c */
    public final LinearLayout f14353c;

    /* renamed from: d */
    public final HorizontalScrollView f14354d;

    /* renamed from: e */
    public final TextView f14355e;

    private AdapterHighlightGroupBinding(RelativeLayout relativeLayout, Button button, LinearLayout linearLayout, HorizontalScrollView horizontalScrollView, TextView textView) {
        this.f14351a = relativeLayout;
        this.f14352b = button;
        this.f14353c = linearLayout;
        this.f14354d = horizontalScrollView;
        this.f14355e = textView;
    }

    /* renamed from: b */
    public static AdapterHighlightGroupBinding m17708b(View view) {
        int i = R.id.button_more;
        Button button = (Button) view.findViewById(R.id.button_more);
        if (button != null) {
            i = R.id.container_film;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.container_film);
            if (linearLayout != null) {
                i = R.id.scrollview_film;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view.findViewById(R.id.scrollview_film);
                if (horizontalScrollView != null) {
                    i = R.id.text_title;
                    TextView textView = (TextView) view.findViewById(R.id.text_title);
                    if (textView != null) {
                        AdapterHighlightGroupBinding fVar = new AdapterHighlightGroupBinding((RelativeLayout) view, button, linearLayout, horizontalScrollView, textView);
                        return fVar;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static AdapterHighlightGroupBinding m17709d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_highlight_group, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17708b(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo5604a() {
        return this.f14351a;
    }
}
