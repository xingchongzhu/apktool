package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.d */
public final class AdapterFeedbackBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14333a;

    /* renamed from: b */
    public final CheckBox f14334b;

    /* renamed from: c */
    public final FrameLayout f14335c;

    /* renamed from: d */
    public final TextView f14336d;

    /* renamed from: e */
    public final TextView f14337e;

    private AdapterFeedbackBinding(ConstraintLayout constraintLayout, CheckBox checkBox, FrameLayout frameLayout, TextView textView, TextView textView2) {
        this.f14333a = constraintLayout;
        this.f14334b = checkBox;
        this.f14335c = frameLayout;
        this.f14336d = textView;
        this.f14337e = textView2;
    }

    /* renamed from: b */
    public static AdapterFeedbackBinding m17694b(View view) {
        int i = R.id.checkbox_feedback_reply;
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.checkbox_feedback_reply);
        if (checkBox != null) {
            i = R.id.frame_checkbox;
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.frame_checkbox);
            if (frameLayout != null) {
                i = R.id.text_feedback_content;
                TextView textView = (TextView) view.findViewById(R.id.text_feedback_content);
                if (textView != null) {
                    i = R.id.text_feedback_date;
                    TextView textView2 = (TextView) view.findViewById(R.id.text_feedback_date);
                    if (textView2 != null) {
                        AdapterFeedbackBinding dVar = new AdapterFeedbackBinding((ConstraintLayout) view, checkBox, frameLayout, textView, textView2);
                        return dVar;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static AdapterFeedbackBinding m17695d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_feedback, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17694b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14333a;
    }
}
