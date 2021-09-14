package com.tv91.p210r;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.s0 */
public final class ViewPromotionWithdrawBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14585a;

    /* renamed from: b */
    public final Button f14586b;

    /* renamed from: c */
    public final ConstraintLayout f14587c;

    /* renamed from: d */
    public final ProgressBar f14588d;

    /* renamed from: e */
    public final EditText f14589e;

    /* renamed from: f */
    public final EditText f14590f;

    /* renamed from: g */
    public final EditText f14591g;

    /* renamed from: h */
    public final EditText f14592h;

    /* renamed from: i */
    public final EditText f14593i;

    /* renamed from: j */
    public final TextView f14594j;

    /* renamed from: k */
    public final EditText f14595k;

    /* renamed from: l */
    public final EditText f14596l;

    /* renamed from: m */
    public final Guideline f14597m;

    /* renamed from: n */
    public final LayoutToolbarTextTitleBinding f14598n;

    private ViewPromotionWithdrawBinding(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, ProgressBar progressBar, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, TextView textView, EditText editText6, EditText editText7, Guideline guideline, LayoutToolbarTextTitleBinding yVar) {
        this.f14585a = constraintLayout;
        this.f14586b = button;
        this.f14587c = constraintLayout2;
        this.f14588d = progressBar;
        this.f14589e = editText;
        this.f14590f = editText2;
        this.f14591g = editText3;
        this.f14592h = editText4;
        this.f14593i = editText5;
        this.f14594j = textView;
        this.f14595k = editText6;
        this.f14596l = editText7;
        this.f14597m = guideline;
        this.f14598n = yVar;
    }

    /* renamed from: b */
    public static ViewPromotionWithdrawBinding m17802b(View view) {
        View view2 = view;
        int i = R.id.button_promotion_withdraw;
        Button button = (Button) view2.findViewById(R.id.button_promotion_withdraw);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view2;
            i = R.id.progress_promotion_withdraw;
            ProgressBar progressBar = (ProgressBar) view2.findViewById(R.id.progress_promotion_withdraw);
            if (progressBar != null) {
                i = R.id.text_promotion_withdraw_bank_account;
                EditText editText = (EditText) view2.findViewById(R.id.text_promotion_withdraw_bank_account);
                if (editText != null) {
                    i = R.id.text_promotion_withdraw_bank_branch;
                    EditText editText2 = (EditText) view2.findViewById(R.id.text_promotion_withdraw_bank_branch);
                    if (editText2 != null) {
                        i = R.id.text_promotion_withdraw_bank_name;
                        EditText editText3 = (EditText) view2.findViewById(R.id.text_promotion_withdraw_bank_name);
                        if (editText3 != null) {
                            i = R.id.text_promotion_withdraw_bank_username;
                            EditText editText4 = (EditText) view2.findViewById(R.id.text_promotion_withdraw_bank_username);
                            if (editText4 != null) {
                                i = R.id.text_promotion_withdraw_city;
                                EditText editText5 = (EditText) view2.findViewById(R.id.text_promotion_withdraw_city);
                                if (editText5 != null) {
                                    i = R.id.text_promotion_withdraw_desc;
                                    TextView textView = (TextView) view2.findViewById(R.id.text_promotion_withdraw_desc);
                                    if (textView != null) {
                                        i = R.id.text_promotion_withdraw_province;
                                        EditText editText6 = (EditText) view2.findViewById(R.id.text_promotion_withdraw_province);
                                        if (editText6 != null) {
                                            i = R.id.text_promotion_withdraw_qq;
                                            EditText editText7 = (EditText) view2.findViewById(R.id.text_promotion_withdraw_qq);
                                            if (editText7 != null) {
                                                i = R.id.toolbar_guideline;
                                                Guideline guideline = (Guideline) view2.findViewById(R.id.toolbar_guideline);
                                                if (guideline != null) {
                                                    i = R.id.toolbar_promotion_withdraw;
                                                    View findViewById = view2.findViewById(R.id.toolbar_promotion_withdraw);
                                                    if (findViewById != null) {
                                                        ViewPromotionWithdrawBinding s0Var = new ViewPromotionWithdrawBinding(constraintLayout, button, constraintLayout, progressBar, editText, editText2, editText3, editText4, editText5, textView, editText6, editText7, guideline, LayoutToolbarTextTitleBinding.m17835b(findViewById));
                                                        return s0Var;
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14585a;
    }
}
