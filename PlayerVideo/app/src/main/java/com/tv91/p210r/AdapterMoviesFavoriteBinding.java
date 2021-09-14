package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chip.ninetyonetv.R;
import com.google.android.material.imageview.ShapeableImageView;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.h */
public final class AdapterMoviesFavoriteBinding implements ViewBinding {

    /* renamed from: a */
    private final FrameLayout f14380a;

    /* renamed from: b */
    public final FrameLayout f14381b;

    /* renamed from: c */
    public final ShapeableImageView f14382c;

    /* renamed from: d */
    public final LinearLayout f14383d;

    /* renamed from: e */
    public final TextView f14384e;

    /* renamed from: f */
    public final TextView f14385f;

    private AdapterMoviesFavoriteBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ShapeableImageView shapeableImageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f14380a = frameLayout;
        this.f14381b = frameLayout2;
        this.f14382c = shapeableImageView;
        this.f14383d = linearLayout;
        this.f14384e = textView;
        this.f14385f = textView2;
    }

    /* renamed from: b */
    public static AdapterMoviesFavoriteBinding m17722b(View view) {
        int i = R.id.frame_remove;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.frame_remove);
        if (frameLayout != null) {
            i = R.id.image_movie_cover;
            ShapeableImageView shapeableImageView = (ShapeableImageView) view.findViewById(R.id.image_movie_cover);
            if (shapeableImageView != null) {
                i = R.id.layout_favorite;
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_favorite);
                if (linearLayout != null) {
                    i = R.id.text_movie_date;
                    TextView textView = (TextView) view.findViewById(R.id.text_movie_date);
                    if (textView != null) {
                        i = R.id.text_movie_name;
                        TextView textView2 = (TextView) view.findViewById(R.id.text_movie_name);
                        if (textView2 != null) {
                            AdapterMoviesFavoriteBinding hVar = new AdapterMoviesFavoriteBinding((FrameLayout) view, frameLayout, shapeableImageView, linearLayout, textView, textView2);
                            return hVar;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static AdapterMoviesFavoriteBinding m17723d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_movies_favorite, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17722b(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo5604a() {
        return this.f14380a;
    }
}
