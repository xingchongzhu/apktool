package com.tv91.p210r;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.n0 */
public final class ViewPaymentHistoryBinding implements ViewBinding {

    /* renamed from: a */
    private final RelativeLayout f14506a;

    /* renamed from: b */
    public final LinearLayout f14507b;

    /* renamed from: c */
    public final RelativeLayout f14508c;

    /* renamed from: d */
    public final ProgressBar f14509d;

    /* renamed from: e */
    public final RecyclerView f14510e;

    /* renamed from: f */
    public final TextView f14511f;

    /* renamed from: g */
    public final LayoutToolbarTextTitleBinding f14512g;

    private ViewPaymentHistoryBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, RelativeLayout relativeLayout2, ProgressBar progressBar, RecyclerView recyclerView, TextView textView, LayoutToolbarTextTitleBinding yVar) {
        this.f14506a = relativeLayout;
        this.f14507b = linearLayout;
        this.f14508c = relativeLayout2;
        this.f14509d = progressBar;
        this.f14510e = recyclerView;
        this.f14511f = textView;
        this.f14512g = yVar;
    }

    /* renamed from: b */
    public static ViewPaymentHistoryBinding m17768b(View view) {
        int i = R.id.header_payment_history;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.header_payment_history);
        if (linearLayout != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R.id.progress_payment_history;
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_payment_history);
            if (progressBar != null) {
                i = R.id.recycler_payment_history;
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_payment_history);
                if (recyclerView != null) {
                    i = R.id.text_payment_history_empty;
                    TextView textView = (TextView) view.findViewById(R.id.text_payment_history_empty);
                    if (textView != null) {
                        i = R.id.toolbar_payment_history;
                        View findViewById = view.findViewById(R.id.toolbar_payment_history);
                        if (findViewById != null) {
                            ViewPaymentHistoryBinding n0Var = new ViewPaymentHistoryBinding(relativeLayout, linearLayout, relativeLayout, progressBar, recyclerView, textView, LayoutToolbarTextTitleBinding.m17835b(findViewById));
                            return n0Var;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public RelativeLayout mo5604a() {
        return this.f14506a;
    }
}
