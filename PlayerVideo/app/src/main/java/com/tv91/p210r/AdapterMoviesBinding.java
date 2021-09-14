package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chip.ninetyonetv.R;
import com.google.android.material.imageview.ShapeableImageView;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.g */
public final class AdapterMoviesBinding implements ViewBinding {

    /* renamed from: a */
    private final LinearLayout f14365a;

    /* renamed from: b */
    public final ShapeableImageView f14366b;

    /* renamed from: c */
    public final TextView f14367c;

    /* renamed from: d */
    public final TextView f14368d;

    private AdapterMoviesBinding(LinearLayout linearLayout, ShapeableImageView shapeableImageView, TextView textView, TextView textView2) {
        this.f14365a = linearLayout;
        this.f14366b = shapeableImageView;
        this.f14367c = textView;
        this.f14368d = textView2;
    }

    /* renamed from: b */
    public static AdapterMoviesBinding m17715b(View view) {
        int i = R.id.image_movie_cover;
        ShapeableImageView shapeableImageView = (ShapeableImageView) view.findViewById(R.id.image_movie_cover);
        if (shapeableImageView != null) {
            i = R.id.text_movie_date;
            TextView textView = (TextView) view.findViewById(R.id.text_movie_date);
            if (textView != null) {
                i = R.id.text_movie_name;
                TextView textView2 = (TextView) view.findViewById(R.id.text_movie_name);
                if (textView2 != null) {
                    return new AdapterMoviesBinding((LinearLayout) view, shapeableImageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static AdapterMoviesBinding m17716d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_movies, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17715b(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo5604a() {
        return this.f14365a;
    }
}
