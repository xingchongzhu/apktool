package com.tv91.p210r;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.v0 */
public final class ViewRegisterBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14650a;

    /* renamed from: b */
    public final Button f14651b;

    /* renamed from: c */
    public final ConstraintLayout f14652c;

    /* renamed from: d */
    public final EditText f14653d;

    /* renamed from: e */
    public final EditText f14654e;

    /* renamed from: f */
    public final TextView f14655f;

    /* renamed from: g */
    public final EditText f14656g;

    /* renamed from: h */
    public final EditText f14657h;

    /* renamed from: i */
    public final Guideline f14658i;

    /* renamed from: j */
    public final LayoutToolbarTextTitleBinding f14659j;

    private ViewRegisterBinding(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, EditText editText, EditText editText2, TextView textView, EditText editText3, EditText editText4, Guideline guideline, LayoutToolbarTextTitleBinding yVar) {
        this.f14650a = constraintLayout;
        this.f14651b = button;
        this.f14652c = constraintLayout2;
        this.f14653d = editText;
        this.f14654e = editText2;
        this.f14655f = textView;
        this.f14656g = editText3;
        this.f14657h = editText4;
        this.f14658i = guideline;
        this.f14659j = yVar;
    }

    /* renamed from: b */
    public static ViewRegisterBinding m17821b(View view) {
        int i = R.id.button_register;
        Button button = (Button) view.findViewById(R.id.button_register);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.text_register_account;
            EditText editText = (EditText) view.findViewById(R.id.text_register_account);
            if (editText != null) {
                i = R.id.text_register_confirm_password;
                EditText editText2 = (EditText) view.findViewById(R.id.text_register_confirm_password);
                if (editText2 != null) {
                    i = R.id.text_register_error;
                    TextView textView = (TextView) view.findViewById(R.id.text_register_error);
                    if (textView != null) {
                        i = R.id.text_register_nickname;
                        EditText editText3 = (EditText) view.findViewById(R.id.text_register_nickname);
                        if (editText3 != null) {
                            i = R.id.text_register_password;
                            EditText editText4 = (EditText) view.findViewById(R.id.text_register_password);
                            if (editText4 != null) {
                                i = R.id.toolbar_guideline;
                                Guideline guideline = (Guideline) view.findViewById(R.id.toolbar_guideline);
                                if (guideline != null) {
                                    i = R.id.toolbar_register;
                                    View findViewById = view.findViewById(R.id.toolbar_register);
                                    if (findViewById != null) {
                                        ViewRegisterBinding v0Var = new ViewRegisterBinding(constraintLayout, button, constraintLayout, editText, editText2, textView, editText3, editText4, guideline, LayoutToolbarTextTitleBinding.m17835b(findViewById));
                                        return v0Var;
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
        return this.f14650a;
    }
}
