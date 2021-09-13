package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.widget.DrawableTextView;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.b */
public final class AdapterDownloadBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14299a;

    /* renamed from: b */
    public final ImageView f14300b;

    /* renamed from: c */
    public final ImageView f14301c;

    /* renamed from: d */
    public final ImageView f14302d;

    /* renamed from: e */
    public final ProgressBar f14303e;

    /* renamed from: f */
    public final ProgressBar f14304f;

    /* renamed from: g */
    public final DrawableTextView f14305g;

    /* renamed from: h */
    public final TextView f14306h;

    /* renamed from: i */
    public final DrawableTextView f14307i;

    /* renamed from: j */
    public final TextView f14308j;

    /* renamed from: k */
    public final TextView f14309k;

    /* renamed from: l */
    public final TextView f14310l;

    /* renamed from: m */
    public final View f14311m;

    private AdapterDownloadBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ProgressBar progressBar, ProgressBar progressBar2, DrawableTextView drawableTextView, TextView textView, DrawableTextView drawableTextView2, TextView textView2, TextView textView3, TextView textView4, View view) {
        this.f14299a = constraintLayout;
        this.f14300b = imageView;
        this.f14301c = imageView2;
        this.f14302d = imageView3;
        this.f14303e = progressBar;
        this.f14304f = progressBar2;
        this.f14305g = drawableTextView;
        this.f14306h = textView;
        this.f14307i = drawableTextView2;
        this.f14308j = textView2;
        this.f14309k = textView3;
        this.f14310l = textView4;
        this.f14311m = view;
    }

    /* renamed from: b */
    public static AdapterDownloadBinding m17680b(View view) {
        View view2 = view;
        int i = R.id.image_action_play_pause;
        ImageView imageView = (ImageView) view2.findViewById(R.id.image_action_play_pause);
        if (imageView != null) {
            i = R.id.image_movie_poster;
            ImageView imageView2 = (ImageView) view2.findViewById(R.id.image_movie_poster);
            if (imageView2 != null) {
                i = R.id.image_movie_poster_mask;
                ImageView imageView3 = (ImageView) view2.findViewById(R.id.image_movie_poster_mask);
                if (imageView3 != null) {
                    i = R.id.progress_busy;
                    ProgressBar progressBar = (ProgressBar) view2.findViewById(R.id.progress_busy);
                    if (progressBar != null) {
                        i = R.id.progress_download;
                        ProgressBar progressBar2 = (ProgressBar) view2.findViewById(R.id.progress_download);
                        if (progressBar2 != null) {
                            i = R.id.text_download_move;
                            DrawableTextView drawableTextView = (DrawableTextView) view2.findViewById(R.id.text_download_move);
                            if (drawableTextView != null) {
                                i = R.id.text_download_progress;
                                TextView textView = (TextView) view2.findViewById(R.id.text_download_progress);
                                if (textView != null) {
                                    i = R.id.text_download_remove;
                                    DrawableTextView drawableTextView2 = (DrawableTextView) view2.findViewById(R.id.text_download_remove);
                                    if (drawableTextView2 != null) {
                                        i = R.id.text_download_status;
                                        TextView textView2 = (TextView) view2.findViewById(R.id.text_download_status);
                                        if (textView2 != null) {
                                            i = R.id.text_movie_file_size;
                                            TextView textView3 = (TextView) view2.findViewById(R.id.text_movie_file_size);
                                            if (textView3 != null) {
                                                i = R.id.text_movie_name;
                                                TextView textView4 = (TextView) view2.findViewById(R.id.text_movie_name);
                                                if (textView4 != null) {
                                                    i = R.id.view_divider;
                                                    View findViewById = view2.findViewById(R.id.view_divider);
                                                    if (findViewById != null) {
                                                        AdapterDownloadBinding bVar = new AdapterDownloadBinding((ConstraintLayout) view2, imageView, imageView2, imageView3, progressBar, progressBar2, drawableTextView, textView, drawableTextView2, textView2, textView3, textView4, findViewById);
                                                        return bVar;
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

    /* renamed from: d */
    public static AdapterDownloadBinding m17681d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_download, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17680b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14299a;
    }
}
