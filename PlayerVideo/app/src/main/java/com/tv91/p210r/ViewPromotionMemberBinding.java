package com.tv91.p210r;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.q0 */
public final class ViewPromotionMemberBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14557a;

    /* renamed from: b */
    public final Button f14558b;

    /* renamed from: c */
    public final Button f14559c;

    /* renamed from: d */
    public final Button f14560d;

    /* renamed from: e */
    public final ImageView f14561e;

    /* renamed from: f */
    public final ImageView f14562f;

    /* renamed from: g */
    public final ConstraintLayout f14563g;

    /* renamed from: h */
    public final ProgressBar f14564h;

    /* renamed from: i */
    public final TextView f14565i;

    /* renamed from: j */
    public final TextView f14566j;

    /* renamed from: k */
    public final Guideline f14567k;

    /* renamed from: l */
    public final LayoutToolbarTextTitleBinding f14568l;

    private ViewPromotionMemberBinding(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, ProgressBar progressBar, TextView textView, TextView textView2, Guideline guideline, LayoutToolbarTextTitleBinding yVar) {
        this.f14557a = constraintLayout;
        this.f14558b = button;
        this.f14559c = button2;
        this.f14560d = button3;
        this.f14561e = imageView;
        this.f14562f = imageView2;
        this.f14563g = constraintLayout2;
        this.f14564h = progressBar;
        this.f14565i = textView;
        this.f14566j = textView2;
        this.f14567k = guideline;
        this.f14568l = yVar;
    }

    /* renamed from: b */
    public static ViewPromotionMemberBinding m17789b(View view) {
        int i = R.id.button_promotion_member_copy_link;
        Button button = (Button) view.findViewById(R.id.button_promotion_member_copy_link);
        if (button != null) {
            i = R.id.button_promotion_member_save_qrcode;
            Button button2 = (Button) view.findViewById(R.id.button_promotion_member_save_qrcode);
            if (button2 != null) {
                i = R.id.button_promotion_member_statement;
                Button button3 = (Button) view.findViewById(R.id.button_promotion_member_statement);
                if (button3 != null) {
                    i = R.id.image_promotion_member_logo;
                    ImageView imageView = (ImageView) view.findViewById(R.id.image_promotion_member_logo);
                    if (imageView != null) {
                        i = R.id.image_promotion_member_qrcode;
                        ImageView imageView2 = (ImageView) view.findViewById(R.id.image_promotion_member_qrcode);
                        if (imageView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i = R.id.progress_promotion_member;
                            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_promotion_member);
                            if (progressBar != null) {
                                i = R.id.text_promotion_member_qrcode_desc;
                                TextView textView = (TextView) view.findViewById(R.id.text_promotion_member_qrcode_desc);
                                if (textView != null) {
                                    i = R.id.text_promotion_member_rule;
                                    TextView textView2 = (TextView) view.findViewById(R.id.text_promotion_member_rule);
                                    if (textView2 != null) {
                                        i = R.id.toolbar_guideline;
                                        Guideline guideline = (Guideline) view.findViewById(R.id.toolbar_guideline);
                                        if (guideline != null) {
                                            i = R.id.toolbar_promotion_member;
                                            View findViewById = view.findViewById(R.id.toolbar_promotion_member);
                                            if (findViewById != null) {
                                                ViewPromotionMemberBinding q0Var = new ViewPromotionMemberBinding(constraintLayout, button, button2, button3, imageView, imageView2, constraintLayout, progressBar, textView, textView2, guideline, LayoutToolbarTextTitleBinding.m17835b(findViewById));
                                                return q0Var;
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
        return this.f14557a;
    }
}
