package com.tv91.p210r;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.widget.CountdownTextView;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.x0 */
public final class ViewVerifyBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14674a;

    /* renamed from: b */
    public final Button f14675b;

    /* renamed from: c */
    public final Guideline f14676c;

    /* renamed from: d */
    public final ConstraintLayout f14677d;

    /* renamed from: e */
    public final EditText f14678e;

    /* renamed from: f */
    public final TextView f14679f;

    /* renamed from: g */
    public final TextView f14680g;

    /* renamed from: h */
    public final EditText f14681h;

    /* renamed from: i */
    public final CountdownTextView f14682i;

    /* renamed from: j */
    public final LayoutToolbarTextTitleBinding f14683j;

    private ViewVerifyBinding(ConstraintLayout constraintLayout, Button button, Guideline guideline, ConstraintLayout constraintLayout2, EditText editText, TextView textView, TextView textView2, EditText editText2, CountdownTextView countdownTextView, LayoutToolbarTextTitleBinding yVar) {
        this.f14674a = constraintLayout;
        this.f14675b = button;
        this.f14676c = guideline;
        this.f14677d = constraintLayout2;
        this.f14678e = editText;
        this.f14679f = textView;
        this.f14680g = textView2;
        this.f14681h = editText2;
        this.f14682i = countdownTextView;
        this.f14683j = yVar;
    }

    /* renamed from: b */
    public static ViewVerifyBinding m17832b(View view) {
        int i = R.id.button_verify;
        Button button = (Button) view.findViewById(R.id.button_verify);
        if (button != null) {
            i = R.id.horizontal_guideline_60_percent;
            Guideline guideline = (Guideline) view.findViewById(R.id.horizontal_guideline_60_percent);
            if (guideline != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.text_verify_code;
                EditText editText = (EditText) view.findViewById(R.id.text_verify_code);
                if (editText != null) {
                    i = R.id.text_verify_description;
                    TextView textView = (TextView) view.findViewById(R.id.text_verify_description);
                    if (textView != null) {
                        i = R.id.text_verify_error;
                        TextView textView2 = (TextView) view.findViewById(R.id.text_verify_error);
                        if (textView2 != null) {
                            i = R.id.text_verify_phone;
                            EditText editText2 = (EditText) view.findViewById(R.id.text_verify_phone);
                            if (editText2 != null) {
                                i = R.id.text_verify_send_sms;
                                CountdownTextView countdownTextView = (CountdownTextView) view.findViewById(R.id.text_verify_send_sms);
                                if (countdownTextView != null) {
                                    i = R.id.toolbar_verify;
                                    View findViewById = view.findViewById(R.id.toolbar_verify);
                                    if (findViewById != null) {
                                        ViewVerifyBinding x0Var = new ViewVerifyBinding(constraintLayout, button, guideline, constraintLayout, editText, textView, textView2, editText2, countdownTextView, LayoutToolbarTextTitleBinding.m17835b(findViewById));
                                        return x0Var;
                                    }
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
        return this.f14674a;
    }
}
