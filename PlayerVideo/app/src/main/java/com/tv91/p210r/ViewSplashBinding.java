package com.tv91.p210r;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.w0 */
public final class ViewSplashBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14666a;

    /* renamed from: b */
    public final Guideline f14667b;

    /* renamed from: c */
    public final ConstraintLayout f14668c;

    /* renamed from: d */
    public final ImageView f14669d;

    /* renamed from: e */
    public final ProgressBar f14670e;

    /* renamed from: f */
    public final TextView f14671f;

    private ViewSplashBinding(ConstraintLayout constraintLayout, Guideline guideline, ConstraintLayout constraintLayout2, ImageView imageView, ProgressBar progressBar, TextView textView) {
        this.f14666a = constraintLayout;
        this.f14667b = guideline;
        this.f14668c = constraintLayout2;
        this.f14669d = imageView;
        this.f14670e = progressBar;
        this.f14671f = textView;
    }

    /* renamed from: b */
    public static ViewSplashBinding m17826b(View view) {
        int i = R.id.guideline;
        Guideline guideline = (Guideline) view.findViewById(R.id.guideline);
        if (guideline != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.logo;
            ImageView imageView = (ImageView) view.findViewById(R.id.logo);
            if (imageView != null) {
                i = R.id.progress_splash;
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_splash);
                if (progressBar != null) {
                    i = R.id.text_check_version;
                    TextView textView = (TextView) view.findViewById(R.id.text_check_version);
                    if (textView != null) {
                        ViewSplashBinding w0Var = new ViewSplashBinding(constraintLayout, guideline, constraintLayout, imageView, progressBar, textView);
                        return w0Var;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14666a;
    }
}
