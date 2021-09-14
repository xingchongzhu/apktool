package com.tv91.p210r;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.widget.CountdownTextView;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.m0 */
public final class ViewPaymentBinding implements ViewBinding {

    /* renamed from: a */
    private final FrameLayout f14486a;

    /* renamed from: b */
    public final ConstraintLayout f14487b;

    /* renamed from: c */
    public final RecyclerView f14488c;

    /* renamed from: d */
    public final RecyclerView f14489d;

    /* renamed from: e */
    public final ImageView f14490e;

    /* renamed from: f */
    public final FrameLayout f14491f;

    /* renamed from: g */
    public final ProgressBar f14492g;

    /* renamed from: h */
    public final ScrollView f14493h;

    /* renamed from: i */
    public final CountdownTextView f14494i;

    /* renamed from: j */
    public final TextView f14495j;

    /* renamed from: k */
    public final TextView f14496k;

    /* renamed from: l */
    public final TextView f14497l;

    /* renamed from: m */
    public final TextView f14498m;

    /* renamed from: n */
    public final TextView f14499n;

    /* renamed from: o */
    public final LayoutToolbarTextTitleBinding f14500o;

    private ViewPaymentBinding(FrameLayout frameLayout, ConstraintLayout constraintLayout, RecyclerView recyclerView, RecyclerView recyclerView2, ImageView imageView, FrameLayout frameLayout2, ProgressBar progressBar, ScrollView scrollView, CountdownTextView countdownTextView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LayoutToolbarTextTitleBinding yVar) {
        this.f14486a = frameLayout;
        this.f14487b = constraintLayout;
        this.f14488c = recyclerView;
        this.f14489d = recyclerView2;
        this.f14490e = imageView;
        this.f14491f = frameLayout2;
        this.f14492g = progressBar;
        this.f14493h = scrollView;
        this.f14494i = countdownTextView;
        this.f14495j = textView;
        this.f14496k = textView2;
        this.f14497l = textView3;
        this.f14498m = textView4;
        this.f14499n = textView5;
        this.f14500o = yVar;
    }

    /* renamed from: b */
    public static ViewPaymentBinding m17761b(View view) {
        View view2 = view;
        int i = R.id.container_payment;
        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.container_payment);
        if (constraintLayout != null) {
            i = R.id.grid_payment_point;
            RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.grid_payment_point);
            if (recyclerView != null) {
                i = R.id.grid_payment_vip;
                RecyclerView recyclerView2 = (RecyclerView) view2.findViewById(R.id.grid_payment_vip);
                if (recyclerView2 != null) {
                    i = R.id.image_payment_intro;
                    ImageView imageView = (ImageView) view2.findViewById(R.id.image_payment_intro);
                    if (imageView != null) {
                        FrameLayout frameLayout = (FrameLayout) view2;
                        i = R.id.progress_payment;
                        ProgressBar progressBar = (ProgressBar) view2.findViewById(R.id.progress_payment);
                        if (progressBar != null) {
                            i = R.id.scrollView_payment;
                            ScrollView scrollView = (ScrollView) view2.findViewById(R.id.scrollView_payment);
                            if (scrollView != null) {
                                i = R.id.text_payment_countdown;
                                CountdownTextView countdownTextView = (CountdownTextView) view2.findViewById(R.id.text_payment_countdown);
                                if (countdownTextView != null) {
                                    i = R.id.text_payment_point;
                                    TextView textView = (TextView) view2.findViewById(R.id.text_payment_point);
                                    if (textView != null) {
                                        i = R.id.text_payment_point_subtitle;
                                        TextView textView2 = (TextView) view2.findViewById(R.id.text_payment_point_subtitle);
                                        if (textView2 != null) {
                                            i = R.id.text_payment_reminder;
                                            TextView textView3 = (TextView) view2.findViewById(R.id.text_payment_reminder);
                                            if (textView3 != null) {
                                                i = R.id.text_payment_vip;
                                                TextView textView4 = (TextView) view2.findViewById(R.id.text_payment_vip);
                                                if (textView4 != null) {
                                                    i = R.id.text_payment_vip_subtitle;
                                                    TextView textView5 = (TextView) view2.findViewById(R.id.text_payment_vip_subtitle);
                                                    if (textView5 != null) {
                                                        i = R.id.toolbar_payment;
                                                        View findViewById = view2.findViewById(R.id.toolbar_payment);
                                                        if (findViewById != null) {
                                                            ViewPaymentBinding m0Var = new ViewPaymentBinding(frameLayout, constraintLayout, recyclerView, recyclerView2, imageView, frameLayout, progressBar, scrollView, countdownTextView, textView, textView2, textView3, textView4, textView5, LayoutToolbarTextTitleBinding.m17835b(findViewById));
                                                            return m0Var;
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
    public FrameLayout mo5604a() {
        return this.f14486a;
    }
}
