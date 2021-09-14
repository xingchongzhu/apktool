package com.tv91.p210r;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.d0 */
public final class ViewDownloadBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14338a;

    /* renamed from: b */
    public final ConstraintLayout f14339b;

    /* renamed from: c */
    public final RecyclerView f14340c;

    /* renamed from: d */
    public final LayoutToolbarTextTitleBinding f14341d;

    /* renamed from: e */
    public final Guideline f14342e;

    private ViewDownloadBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, LayoutToolbarTextTitleBinding yVar, Guideline guideline) {
        this.f14338a = constraintLayout;
        this.f14339b = constraintLayout2;
        this.f14340c = recyclerView;
        this.f14341d = yVar;
        this.f14342e = guideline;
    }

    /* renamed from: b */
    public static ViewDownloadBinding m17698b(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.recycler_download;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_download);
        if (recyclerView != null) {
            i = R.id.toolbar_download;
            View findViewById = view.findViewById(R.id.toolbar_download);
            if (findViewById != null) {
                LayoutToolbarTextTitleBinding b = LayoutToolbarTextTitleBinding.m17835b(findViewById);
                i = R.id.toolbar_guideline;
                Guideline guideline = (Guideline) view.findViewById(R.id.toolbar_guideline);
                if (guideline != null) {
                    ViewDownloadBinding d0Var = new ViewDownloadBinding((ConstraintLayout) view, constraintLayout, recyclerView, b, guideline);
                    return d0Var;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14338a;
    }
}
