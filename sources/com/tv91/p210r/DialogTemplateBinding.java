package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.q */
public final class DialogTemplateBinding implements ViewBinding {

    /* renamed from: a */
    private final LinearLayout f14550a;

    /* renamed from: b */
    public final FrameLayout f14551b;

    /* renamed from: c */
    public final TextView f14552c;

    /* renamed from: d */
    public final Button f14553d;

    /* renamed from: e */
    public final Button f14554e;

    /* renamed from: f */
    public final Button f14555f;

    /* renamed from: g */
    public final TextView f14556g;

    private DialogTemplateBinding(LinearLayout linearLayout, FrameLayout frameLayout, TextView textView, Button button, Button button2, Button button3, TextView textView2) {
        this.f14550a = linearLayout;
        this.f14551b = frameLayout;
        this.f14552c = textView;
        this.f14553d = button;
        this.f14554e = button2;
        this.f14555f = button3;
        this.f14556g = textView2;
    }

    /* renamed from: b */
    public static DialogTemplateBinding m17784b(View view) {
        int i = R.id.dialog_container;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.dialog_container);
        if (frameLayout != null) {
            i = R.id.dialog_message;
            TextView textView = (TextView) view.findViewById(R.id.dialog_message);
            if (textView != null) {
                i = R.id.dialog_negative_button;
                Button button = (Button) view.findViewById(R.id.dialog_negative_button);
                if (button != null) {
                    i = R.id.dialog_neutral_button;
                    Button button2 = (Button) view.findViewById(R.id.dialog_neutral_button);
                    if (button2 != null) {
                        i = R.id.dialog_positive_button;
                        Button button3 = (Button) view.findViewById(R.id.dialog_positive_button);
                        if (button3 != null) {
                            i = R.id.dialog_title;
                            TextView textView2 = (TextView) view.findViewById(R.id.dialog_title);
                            if (textView2 != null) {
                                DialogTemplateBinding qVar = new DialogTemplateBinding((LinearLayout) view, frameLayout, textView, button, button2, button3, textView2);
                                return qVar;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static DialogTemplateBinding m17785d(LayoutInflater layoutInflater) {
        return m17786e(layoutInflater, null, false);
    }

    /* renamed from: e */
    public static DialogTemplateBinding m17786e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_template, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17784b(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo5604a() {
        return this.f14550a;
    }
}
