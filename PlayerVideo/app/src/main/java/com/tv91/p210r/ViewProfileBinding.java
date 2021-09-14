package com.tv91.p210r;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.widget.DrawableTextView;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.o0 */
public final class ViewProfileBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14519a;

    /* renamed from: b */
    public final Guideline f14520b;

    /* renamed from: c */
    public final LinearLayout f14521c;

    /* renamed from: d */
    public final ImageView f14522d;

    /* renamed from: e */
    public final ImageView f14523e;

    /* renamed from: f */
    public final ConstraintLayout f14524f;

    /* renamed from: g */
    public final ConstraintLayout f14525g;

    /* renamed from: h */
    public final ListView f14526h;

    /* renamed from: i */
    public final ProgressBar f14527i;

    /* renamed from: j */
    public final DrawableTextView f14528j;

    /* renamed from: k */
    public final TextView f14529k;

    /* renamed from: l */
    public final TextView f14530l;

    /* renamed from: m */
    public final TextView f14531m;

    /* renamed from: n */
    public final TextView f14532n;

    /* renamed from: o */
    public final TextView f14533o;

    /* renamed from: p */
    public final Guideline f14534p;

    /* renamed from: q */
    public final LayoutToolbarTextTitleBinding f14535q;

    /* renamed from: r */
    public final View f14536r;

    private ViewProfileBinding(ConstraintLayout constraintLayout, Guideline guideline, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ListView listView, ProgressBar progressBar, DrawableTextView drawableTextView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, Guideline guideline2, LayoutToolbarTextTitleBinding yVar, View view) {
        this.f14519a = constraintLayout;
        this.f14520b = guideline;
        this.f14521c = linearLayout;
        this.f14522d = imageView;
        this.f14523e = imageView2;
        this.f14524f = constraintLayout2;
        this.f14525g = constraintLayout3;
        this.f14526h = listView;
        this.f14527i = progressBar;
        this.f14528j = drawableTextView;
        this.f14529k = textView;
        this.f14530l = textView2;
        this.f14531m = textView3;
        this.f14532n = textView4;
        this.f14533o = textView5;
        this.f14534p = guideline2;
        this.f14535q = yVar;
        this.f14536r = view;
    }

    /* renamed from: b */
    public static ViewProfileBinding m17775b(View view) {
        View view2 = view;
        int i = R.id.bottom_bar_guideline;
        Guideline guideline = (Guideline) view2.findViewById(R.id.bottom_bar_guideline);
        if (guideline != null) {
            i = R.id.bottom_nav;
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.bottom_nav);
            if (linearLayout != null) {
                i = R.id.image_user_account;
                ImageView imageView = (ImageView) view2.findViewById(R.id.image_user_account);
                if (imageView != null) {
                    i = R.id.image_user_avatar;
                    ImageView imageView2 = (ImageView) view2.findViewById(R.id.image_user_avatar);
                    if (imageView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                        i = R.id.layout_profile_account;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view2.findViewById(R.id.layout_profile_account);
                        if (constraintLayout2 != null) {
                            i = R.id.list_profile_action;
                            ListView listView = (ListView) view2.findViewById(R.id.list_profile_action);
                            if (listView != null) {
                                i = R.id.progress_profile;
                                ProgressBar progressBar = (ProgressBar) view2.findViewById(R.id.progress_profile);
                                if (progressBar != null) {
                                    i = R.id.text_exchange;
                                    DrawableTextView drawableTextView = (DrawableTextView) view2.findViewById(R.id.text_exchange);
                                    if (drawableTextView != null) {
                                        i = R.id.text_user_account;
                                        TextView textView = (TextView) view2.findViewById(R.id.text_user_account);
                                        if (textView != null) {
                                            i = R.id.text_user_id;
                                            TextView textView2 = (TextView) view2.findViewById(R.id.text_user_id);
                                            if (textView2 != null) {
                                                i = R.id.text_user_nickname;
                                                TextView textView3 = (TextView) view2.findViewById(R.id.text_user_nickname);
                                                if (textView3 != null) {
                                                    i = R.id.text_user_point;
                                                    TextView textView4 = (TextView) view2.findViewById(R.id.text_user_point);
                                                    if (textView4 != null) {
                                                        i = R.id.text_version;
                                                        TextView textView5 = (TextView) view2.findViewById(R.id.text_version);
                                                        if (textView5 != null) {
                                                            i = R.id.toolbar_guideline;
                                                            Guideline guideline2 = (Guideline) view2.findViewById(R.id.toolbar_guideline);
                                                            if (guideline2 != null) {
                                                                i = R.id.toolbar_profile;
                                                                View findViewById = view2.findViewById(R.id.toolbar_profile);
                                                                if (findViewById != null) {
                                                                    LayoutToolbarTextTitleBinding b = LayoutToolbarTextTitleBinding.m17835b(findViewById);
                                                                    i = R.id.view_divider;
                                                                    View findViewById2 = view2.findViewById(R.id.view_divider);
                                                                    if (findViewById2 != null) {
                                                                        ViewProfileBinding o0Var = new ViewProfileBinding(constraintLayout, guideline, linearLayout, imageView, imageView2, constraintLayout, constraintLayout2, listView, progressBar, drawableTextView, textView, textView2, textView3, textView4, textView5, guideline2, b, findViewById2);
                                                                        return o0Var;
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14519a;
    }
}
