package com.tv91.p210r;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.widget.DrawableTextView;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.k0 */
public final class ViewMovieBinding implements ViewBinding {

    /* renamed from: A */
    public final TextView f14440A;

    /* renamed from: B */
    public final TextView f14441B;

    /* renamed from: C */
    public final TextView f14442C;

    /* renamed from: D */
    public final LayoutToolbarTextTitleBinding f14443D;

    /* renamed from: E */
    public final View f14444E;

    /* renamed from: a */
    private final RelativeLayout f14445a;

    /* renamed from: b */
    public final ConstraintLayout f14446b;

    /* renamed from: c */
    public final Button f14447c;

    /* renamed from: d */
    public final Button f14448d;

    /* renamed from: e */
    public final Button f14449e;

    /* renamed from: f */
    public final RecyclerView f14450f;

    /* renamed from: g */
    public final RecyclerView f14451g;

    /* renamed from: h */
    public final Guideline f14452h;

    /* renamed from: i */
    public final ImageView f14453i;

    /* renamed from: j */
    public final ImageView f14454j;

    /* renamed from: k */
    public final ImageView f14455k;

    /* renamed from: l */
    public final ImageView f14456l;

    /* renamed from: m */
    public final RelativeLayout f14457m;

    /* renamed from: n */
    public final ProgressBar f14458n;

    /* renamed from: o */
    public final ProgressBar f14459o;

    /* renamed from: p */
    public final ContentLoadingProgressBar f14460p;

    /* renamed from: q */
    public final ScrollView f14461q;

    /* renamed from: r */
    public final TextView f14462r;

    /* renamed from: s */
    public final DrawableTextView f14463s;

    /* renamed from: t */
    public final TextView f14464t;

    /* renamed from: u */
    public final TextView f14465u;

    /* renamed from: v */
    public final TextView f14466v;

    /* renamed from: w */
    public final TextView f14467w;

    /* renamed from: x */
    public final TextView f14468x;

    /* renamed from: y */
    public final TextView f14469y;

    /* renamed from: z */
    public final TextView f14470z;

    private ViewMovieBinding(RelativeLayout relativeLayout, ConstraintLayout constraintLayout, Button button, Button button2, Button button3, RecyclerView recyclerView, RecyclerView recyclerView2, Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, RelativeLayout relativeLayout2, ProgressBar progressBar, ProgressBar progressBar2, ContentLoadingProgressBar contentLoadingProgressBar, ScrollView scrollView, TextView textView, DrawableTextView drawableTextView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, LayoutToolbarTextTitleBinding yVar, View view) {
        this.f14445a = relativeLayout;
        this.f14446b = constraintLayout;
        this.f14447c = button;
        this.f14448d = button2;
        this.f14449e = button3;
        this.f14450f = recyclerView;
        this.f14451g = recyclerView2;
        this.f14452h = guideline;
        this.f14453i = imageView;
        this.f14454j = imageView2;
        this.f14455k = imageView3;
        this.f14456l = imageView4;
        this.f14457m = relativeLayout2;
        this.f14458n = progressBar;
        this.f14459o = progressBar2;
        this.f14460p = contentLoadingProgressBar;
        this.f14461q = scrollView;
        this.f14462r = textView;
        this.f14463s = drawableTextView;
        this.f14464t = textView2;
        this.f14465u = textView3;
        this.f14466v = textView4;
        this.f14467w = textView5;
        this.f14468x = textView6;
        this.f14469y = textView7;
        this.f14470z = textView8;
        this.f14440A = textView9;
        this.f14441B = textView10;
        this.f14442C = textView11;
        this.f14443D = yVar;
        this.f14444E = view;
    }

    /* renamed from: b */
    public static ViewMovieBinding m17747b(View view) {
        View view2 = view;
        int i = R.id.bottom_download_bar;
        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.bottom_download_bar);
        if (constraintLayout != null) {
            i = R.id.button_download;
            Button button = (Button) view2.findViewById(R.id.button_download);
            if (button != null) {
                i = R.id.button_favorite;
                Button button2 = (Button) view2.findViewById(R.id.button_favorite);
                if (button2 != null) {
                    i = R.id.button_movie_similar_more;
                    Button button3 = (Button) view2.findViewById(R.id.button_movie_similar_more);
                    if (button3 != null) {
                        i = R.id.grid_movie_actor;
                        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.grid_movie_actor);
                        if (recyclerView != null) {
                            i = R.id.grid_movies_similar_categories;
                            RecyclerView recyclerView2 = (RecyclerView) view2.findViewById(R.id.grid_movies_similar_categories);
                            if (recyclerView2 != null) {
                                i = R.id.guide;
                                Guideline guideline = (Guideline) view2.findViewById(R.id.guide);
                                if (guideline != null) {
                                    i = R.id.image_action_download_view;
                                    ImageView imageView = (ImageView) view2.findViewById(R.id.image_action_download_view);
                                    if (imageView != null) {
                                        i = R.id.image_action_play;
                                        ImageView imageView2 = (ImageView) view2.findViewById(R.id.image_action_play);
                                        if (imageView2 != null) {
                                            i = R.id.image_movie_poster;
                                            ImageView imageView3 = (ImageView) view2.findViewById(R.id.image_movie_poster);
                                            if (imageView3 != null) {
                                                i = R.id.image_movie_shader;
                                                ImageView imageView4 = (ImageView) view2.findViewById(R.id.image_movie_shader);
                                                if (imageView4 != null) {
                                                    RelativeLayout relativeLayout = (RelativeLayout) view2;
                                                    i = R.id.progress_download;
                                                    ProgressBar progressBar = (ProgressBar) view2.findViewById(R.id.progress_download);
                                                    if (progressBar != null) {
                                                        i = R.id.progress_movie;
                                                        ProgressBar progressBar2 = (ProgressBar) view2.findViewById(R.id.progress_movie);
                                                        if (progressBar2 != null) {
                                                            i = R.id.progress_movie_similar;
                                                            ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) view2.findViewById(R.id.progress_movie_similar);
                                                            if (contentLoadingProgressBar != null) {
                                                                i = R.id.scrollview_container;
                                                                ScrollView scrollView = (ScrollView) view2.findViewById(R.id.scrollview_container);
                                                                if (scrollView != null) {
                                                                    i = R.id.text_download_status;
                                                                    TextView textView = (TextView) view2.findViewById(R.id.text_download_status);
                                                                    if (textView != null) {
                                                                        i = R.id.text_favorite_count;
                                                                        DrawableTextView drawableTextView = (DrawableTextView) view2.findViewById(R.id.text_favorite_count);
                                                                        if (drawableTextView != null) {
                                                                            i = R.id.text_movie_actor;
                                                                            TextView textView2 = (TextView) view2.findViewById(R.id.text_movie_actor);
                                                                            if (textView2 != null) {
                                                                                i = R.id.text_movie_category;
                                                                                TextView textView3 = (TextView) view2.findViewById(R.id.text_movie_category);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.text_movie_channel;
                                                                                    TextView textView4 = (TextView) view2.findViewById(R.id.text_movie_channel);
                                                                                    if (textView4 != null) {
                                                                                        i = R.id.text_movie_date;
                                                                                        TextView textView5 = (TextView) view2.findViewById(R.id.text_movie_date);
                                                                                        if (textView5 != null) {
                                                                                            i = R.id.text_movie_download_name;
                                                                                            TextView textView6 = (TextView) view2.findViewById(R.id.text_movie_download_name);
                                                                                            if (textView6 != null) {
                                                                                                i = R.id.text_movie_id;
                                                                                                TextView textView7 = (TextView) view2.findViewById(R.id.text_movie_id);
                                                                                                if (textView7 != null) {
                                                                                                    i = R.id.text_movie_name;
                                                                                                    TextView textView8 = (TextView) view2.findViewById(R.id.text_movie_name);
                                                                                                    if (textView8 != null) {
                                                                                                        i = R.id.text_movie_point;
                                                                                                        TextView textView9 = (TextView) view2.findViewById(R.id.text_movie_point);
                                                                                                        if (textView9 != null) {
                                                                                                            i = R.id.text_movie_similar_categories;
                                                                                                            TextView textView10 = (TextView) view2.findViewById(R.id.text_movie_similar_categories);
                                                                                                            if (textView10 != null) {
                                                                                                                i = R.id.text_play_count;
                                                                                                                TextView textView11 = (TextView) view2.findViewById(R.id.text_play_count);
                                                                                                                if (textView11 != null) {
                                                                                                                    i = R.id.toolbar_movie;
                                                                                                                    View findViewById = view2.findViewById(R.id.toolbar_movie);
                                                                                                                    if (findViewById != null) {
                                                                                                                        LayoutToolbarTextTitleBinding b = LayoutToolbarTextTitleBinding.m17835b(findViewById);
                                                                                                                        i = R.id.view_divider_1;
                                                                                                                        View findViewById2 = view2.findViewById(R.id.view_divider_1);
                                                                                                                        if (findViewById2 != null) {
                                                                                                                            ViewMovieBinding k0Var = new ViewMovieBinding(relativeLayout, constraintLayout, button, button2, button3, recyclerView, recyclerView2, guideline, imageView, imageView2, imageView3, imageView4, relativeLayout, progressBar, progressBar2, contentLoadingProgressBar, scrollView, textView, drawableTextView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, b, findViewById2);
                                                                                                                            return k0Var;
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
    public RelativeLayout mo5604a() {
        return this.f14445a;
    }
}
