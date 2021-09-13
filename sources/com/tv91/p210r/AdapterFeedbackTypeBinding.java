package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.chip.ninetyonetv.R;
import java.util.Objects;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.e */
public final class AdapterFeedbackTypeBinding implements ViewBinding {

    /* renamed from: a */
    private final TextView f14343a;

    /* renamed from: b */
    public final TextView f14344b;

    private AdapterFeedbackTypeBinding(TextView textView, TextView textView2) {
        this.f14343a = textView;
        this.f14344b = textView2;
    }

    /* renamed from: b */
    public static AdapterFeedbackTypeBinding m17701b(View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new AdapterFeedbackTypeBinding(textView, textView);
    }

    /* renamed from: d */
    public static AdapterFeedbackTypeBinding m17702d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_feedback_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17701b(inflate);
    }

    /* renamed from: c */
    public TextView mo5604a() {
        return this.f14343a;
    }
}
