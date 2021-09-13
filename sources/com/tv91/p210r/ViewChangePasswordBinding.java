package com.tv91.p210r;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.b0 */
public final class ViewChangePasswordBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14312a;

    /* renamed from: b */
    public final Button f14313b;

    /* renamed from: c */
    public final ConstraintLayout f14314c;

    /* renamed from: d */
    public final TextView f14315d;

    /* renamed from: e */
    public final EditText f14316e;

    /* renamed from: f */
    public final EditText f14317f;

    /* renamed from: g */
    public final LayoutToolbarTextTitleBinding f14318g;

    /* renamed from: h */
    public final Guideline f14319h;

    private ViewChangePasswordBinding(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, TextView textView, EditText editText, EditText editText2, LayoutToolbarTextTitleBinding yVar, Guideline guideline) {
        this.f14312a = constraintLayout;
        this.f14313b = button;
        this.f14314c = constraintLayout2;
        this.f14315d = textView;
        this.f14316e = editText;
        this.f14317f = editText2;
        this.f14318g = yVar;
        this.f14319h = guideline;
    }

    /* renamed from: b */
    public static ViewChangePasswordBinding m17684b(View view) {
        int i = R.id.button_change_password;
        Button button = (Button) view.findViewById(R.id.button_change_password);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.text_change_password_error;
            TextView textView = (TextView) view.findViewById(R.id.text_change_password_error);
            if (textView != null) {
                i = R.id.text_confirm_new_password;
                EditText editText = (EditText) view.findViewById(R.id.text_confirm_new_password);
                if (editText != null) {
                    i = R.id.text_new_password;
                    EditText editText2 = (EditText) view.findViewById(R.id.text_new_password);
                    if (editText2 != null) {
                        i = R.id.toolbar_change_password;
                        View findViewById = view.findViewById(R.id.toolbar_change_password);
                        if (findViewById != null) {
                            LayoutToolbarTextTitleBinding b = LayoutToolbarTextTitleBinding.m17835b(findViewById);
                            i = R.id.toolbar_guideline;
                            Guideline guideline = (Guideline) view.findViewById(R.id.toolbar_guideline);
                            if (guideline != null) {
                                ViewChangePasswordBinding b0Var = new ViewChangePasswordBinding(constraintLayout, button, constraintLayout, textView, editText, editText2, b, guideline);
                                return b0Var;
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
        return this.f14312a;
    }
}
