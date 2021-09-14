package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chip.ninetyonetv.R;
import com.google.android.material.imageview.ShapeableImageView;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.i */
public final class AdapterMoviesHighlightBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14395a;

    /* renamed from: b */
    public final ShapeableImageView f14396b;

    /* renamed from: c */
    public final TextView f14397c;

    /* renamed from: d */
    public final TextView f14398d;

    private AdapterMoviesHighlightBinding(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, TextView textView, TextView textView2) {
        this.f14395a = constraintLayout;
        this.f14396b = shapeableImageView;
        this.f14397c = textView;
        this.f14398d = textView2;
    }

    /* renamed from: b */
    public static AdapterMoviesHighlightBinding m17729b(View view) {
        int i = R.id.image_movie_cover;
        ShapeableImageView shapeableImageView = (ShapeableImageView) view.findViewById(R.id.image_movie_cover);
        if (shapeableImageView != null) {
            i = R.id.text_movie_name;
            TextView textView = (TextView) view.findViewById(R.id.text_movie_name);
            if (textView != null) {
                i = R.id.text_movie_rank;
                TextView textView2 = (TextView) view.findViewById(R.id.text_movie_rank);
                if (textView2 != null) {
                    return new AdapterMoviesHighlightBinding((ConstraintLayout) view, shapeableImageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static AdapterMoviesHighlightBinding m17730d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_movies_highlight, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17729b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14395a;
    }
}
