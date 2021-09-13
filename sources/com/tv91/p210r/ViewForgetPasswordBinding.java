package com.tv91.p210r;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.i0 */
public final class ViewForgetPasswordBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14399a;

    /* renamed from: b */
    public final Button f14400b;

    /* renamed from: c */
    public final ImageView f14401c;

    /* renamed from: d */
    public final Guideline f14402d;

    /* renamed from: e */
    public final ConstraintLayout f14403e;

    /* renamed from: f */
    public final TextView f14404f;

    /* renamed from: g */
    public final TextView f14405g;

    /* renamed from: h */
    public final TextView f14406h;

    /* renamed from: i */
    public final EditText f14407i;

    /* renamed from: j */
    public final EditText f14408j;

    /* renamed from: k */
    public final EditText f14409k;

    /* renamed from: l */
    public final EditText f14410l;

    /* renamed from: m */
    public final LayoutToolbarTextTitleBinding f14411m;

    private ViewForgetPasswordBinding(ConstraintLayout constraintLayout, Button button, ImageView imageView, Guideline guideline, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, EditText editText, EditText editText2, EditText editText3, EditText editText4, LayoutToolbarTextTitleBinding yVar) {
        this.f14399a = constraintLayout;
        this.f14400b = button;
        this.f14401c = imageView;
        this.f14402d = guideline;
        this.f14403e = constraintLayout2;
        this.f14404f = textView;
        this.f14405g = textView2;
        this.f14406h = textView3;
        this.f14407i = editText;
        this.f14408j = editText2;
        this.f14409k = editText3;
        this.f14410l = editText4;
        this.f14411m = yVar;
    }

    /* renamed from: b */
    public static ViewForgetPasswordBinding m17733b(View view) {
        View view2 = view;
        int i = R.id.button_reset;
        Button button = (Button) view2.findViewById(R.id.button_reset);
        if (button != null) {
            i = R.id.button_send_email;
            ImageView imageView = (ImageView) view2.findViewById(R.id.button_send_email);
            if (imageView != null) {
                i = R.id.horizontal_guideline_40_percent;
                Guideline guideline = (Guideline) view2.findViewById(R.id.horizontal_guideline_40_percent);
                if (guideline != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                    i = R.id.text_error_email;
                    TextView textView = (TextView) view2.findViewById(R.id.text_error_email);
                    if (textView != null) {
                        i = R.id.text_error_other;
                        TextView textView2 = (TextView) view2.findViewById(R.id.text_error_other);
                        if (textView2 != null) {
                            i = R.id.text_forget_description;
                            TextView textView3 = (TextView) view2.findViewById(R.id.text_forget_description);
                            if (textView3 != null) {
                                i = R.id.text_forget_email;
                                EditText editText = (EditText) view2.findViewById(R.id.text_forget_email);
                                if (editText != null) {
                                    i = R.id.text_reset_confirm_password;
                                    EditText editText2 = (EditText) view2.findViewById(R.id.text_reset_confirm_password);
                                    if (editText2 != null) {
                                        i = R.id.text_reset_password;
                                        EditText editText3 = (EditText) view2.findViewById(R.id.text_reset_password);
                                        if (editText3 != null) {
                                            i = R.id.text_reset_verification;
                                            EditText editText4 = (EditText) view2.findViewById(R.id.text_reset_verification);
                                            if (editText4 != null) {
                                                i = R.id.toolbar_forget_password;
                                                View findViewById = view2.findViewById(R.id.toolbar_forget_password);
                                                if (findViewById != null) {
                                                    ViewForgetPasswordBinding i0Var = new ViewForgetPasswordBinding(constraintLayout, button, imageView, guideline, constraintLayout, textView, textView2, textView3, editText, editText2, editText3, editText4, LayoutToolbarTextTitleBinding.m17835b(findViewById));
                                                    return i0Var;
                                                }
                                            }
                                        }
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
        return this.f14399a;
    }
}
