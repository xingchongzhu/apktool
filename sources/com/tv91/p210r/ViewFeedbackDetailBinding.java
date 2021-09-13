package com.tv91.p210r;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.g0 */
public final class ViewFeedbackDetailBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14369a;

    /* renamed from: b */
    public final Guideline f14370b;

    /* renamed from: c */
    public final ConstraintLayout f14371c;

    /* renamed from: d */
    public final TextView f14372d;

    /* renamed from: e */
    public final TextView f14373e;

    /* renamed from: f */
    public final TextView f14374f;

    /* renamed from: g */
    public final TextView f14375g;

    /* renamed from: h */
    public final TextView f14376h;

    /* renamed from: i */
    public final TextView f14377i;

    /* renamed from: j */
    public final LayoutToolbarTextTitleBinding f14378j;

    /* renamed from: k */
    public final Guideline f14379k;

    private ViewFeedbackDetailBinding(ConstraintLayout constraintLayout, Guideline guideline, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, LayoutToolbarTextTitleBinding yVar, Guideline guideline2) {
        this.f14369a = constraintLayout;
        this.f14370b = guideline;
        this.f14371c = constraintLayout2;
        this.f14372d = textView;
        this.f14373e = textView2;
        this.f14374f = textView3;
        this.f14375g = textView4;
        this.f14376h = textView5;
        this.f14377i = textView6;
        this.f14378j = yVar;
        this.f14379k = guideline2;
    }

    /* renamed from: b */
    public static ViewFeedbackDetailBinding m17719b(View view) {
        int i = R.id.horizontal_guideline_50_percent;
        Guideline guideline = (Guideline) view.findViewById(R.id.horizontal_guideline_50_percent);
        if (guideline != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.text_feedback_detail_content;
            TextView textView = (TextView) view.findViewById(R.id.text_feedback_detail_content);
            if (textView != null) {
                i = R.id.text_feedback_detail_date;
                TextView textView2 = (TextView) view.findViewById(R.id.text_feedback_detail_date);
                if (textView2 != null) {
                    i = R.id.text_feedback_detail_reply_content;
                    TextView textView3 = (TextView) view.findViewById(R.id.text_feedback_detail_reply_content);
                    if (textView3 != null) {
                        i = R.id.text_feedback_detail_reply_date;
                        TextView textView4 = (TextView) view.findViewById(R.id.text_feedback_detail_reply_date);
                        if (textView4 != null) {
                            i = R.id.text_feedback_detail_reply_title;
                            TextView textView5 = (TextView) view.findViewById(R.id.text_feedback_detail_reply_title);
                            if (textView5 != null) {
                                i = R.id.text_feedback_detail_title;
                                TextView textView6 = (TextView) view.findViewById(R.id.text_feedback_detail_title);
                                if (textView6 != null) {
                                    i = R.id.toolbar_feedback_detail;
                                    View findViewById = view.findViewById(R.id.toolbar_feedback_detail);
                                    if (findViewById != null) {
                                        LayoutToolbarTextTitleBinding b = LayoutToolbarTextTitleBinding.m17835b(findViewById);
                                        i = R.id.toolbar_guideline;
                                        Guideline guideline2 = (Guideline) view.findViewById(R.id.toolbar_guideline);
                                        if (guideline2 != null) {
                                            ViewFeedbackDetailBinding g0Var = new ViewFeedbackDetailBinding(constraintLayout, guideline, constraintLayout, textView, textView2, textView3, textView4, textView5, textView6, b, guideline2);
                                            return g0Var;
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
        return this.f14369a;
    }
}
