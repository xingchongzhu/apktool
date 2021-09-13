package com.tv91.p210r;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.h0 */
public final class ViewFeedbackFormBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14386a;

    /* renamed from: b */
    public final Button f14387b;

    /* renamed from: c */
    public final ConstraintLayout f14388c;

    /* renamed from: d */
    public final FrameLayout f14389d;

    /* renamed from: e */
    public final Spinner f14390e;

    /* renamed from: f */
    public final EditText f14391f;

    /* renamed from: g */
    public final TextView f14392g;

    /* renamed from: h */
    public final LayoutToolbarTextTitleBinding f14393h;

    /* renamed from: i */
    public final Guideline f14394i;

    private ViewFeedbackFormBinding(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, FrameLayout frameLayout, Spinner spinner, EditText editText, TextView textView, LayoutToolbarTextTitleBinding yVar, Guideline guideline) {
        this.f14386a = constraintLayout;
        this.f14387b = button;
        this.f14388c = constraintLayout2;
        this.f14389d = frameLayout;
        this.f14390e = spinner;
        this.f14391f = editText;
        this.f14392g = textView;
        this.f14393h = yVar;
        this.f14394i = guideline;
    }

    /* renamed from: b */
    public static ViewFeedbackFormBinding m17726b(View view) {
        int i = R.id.button_send_feedback;
        Button button = (Button) view.findViewById(R.id.button_send_feedback);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.layout_feedback_type;
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.layout_feedback_type);
            if (frameLayout != null) {
                i = R.id.spinner_feedback_type;
                Spinner spinner = (Spinner) view.findViewById(R.id.spinner_feedback_type);
                if (spinner != null) {
                    i = R.id.text_feedback_content;
                    EditText editText = (EditText) view.findViewById(R.id.text_feedback_content);
                    if (editText != null) {
                        i = R.id.text_feedback_form_desc;
                        TextView textView = (TextView) view.findViewById(R.id.text_feedback_form_desc);
                        if (textView != null) {
                            i = R.id.toolbar_feedback_form;
                            View findViewById = view.findViewById(R.id.toolbar_feedback_form);
                            if (findViewById != null) {
                                LayoutToolbarTextTitleBinding b = LayoutToolbarTextTitleBinding.m17835b(findViewById);
                                i = R.id.toolbar_guideline;
                                Guideline guideline = (Guideline) view.findViewById(R.id.toolbar_guideline);
                                if (guideline != null) {
                                    ViewFeedbackFormBinding h0Var = new ViewFeedbackFormBinding(constraintLayout, button, constraintLayout, frameLayout, spinner, editText, textView, b, guideline);
                                    return h0Var;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14386a;
    }
}
