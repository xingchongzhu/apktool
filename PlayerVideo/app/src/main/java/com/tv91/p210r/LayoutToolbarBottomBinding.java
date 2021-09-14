package com.tv91.p210r;

import android.view.View;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.widget.DrawableTextView;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.w */
public final class LayoutToolbarBottomBinding implements ViewBinding {

    /* renamed from: a */
    private final View f14660a;

    /* renamed from: b */
    public final DrawableTextView f14661b;

    /* renamed from: c */
    public final DrawableTextView f14662c;

    /* renamed from: d */
    public final DrawableTextView f14663d;

    /* renamed from: e */
    public final DrawableTextView f14664e;

    /* renamed from: f */
    public final DrawableTextView f14665f;

    private LayoutToolbarBottomBinding(View view, DrawableTextView drawableTextView, DrawableTextView drawableTextView2, DrawableTextView drawableTextView3, DrawableTextView drawableTextView4, DrawableTextView drawableTextView5) {
        this.f14660a = view;
        this.f14661b = drawableTextView;
        this.f14662c = drawableTextView2;
        this.f14663d = drawableTextView3;
        this.f14664e = drawableTextView4;
        this.f14665f = drawableTextView5;
    }

    /* renamed from: b */
    public static LayoutToolbarBottomBinding m17824b(View view) {
        int i = R.id.bottom_menu_actress;
        DrawableTextView drawableTextView = (DrawableTextView) view.findViewById(R.id.bottom_menu_actress);
        if (drawableTextView != null) {
            i = R.id.bottom_menu_category;
            DrawableTextView drawableTextView2 = (DrawableTextView) view.findViewById(R.id.bottom_menu_category);
            if (drawableTextView2 != null) {
                i = R.id.bottom_menu_home;
                DrawableTextView drawableTextView3 = (DrawableTextView) view.findViewById(R.id.bottom_menu_home);
                if (drawableTextView3 != null) {
                    i = R.id.bottom_menu_profile;
                    DrawableTextView drawableTextView4 = (DrawableTextView) view.findViewById(R.id.bottom_menu_profile);
                    if (drawableTextView4 != null) {
                        i = R.id.bottom_menu_promotion;
                        DrawableTextView drawableTextView5 = (DrawableTextView) view.findViewById(R.id.bottom_menu_promotion);
                        if (drawableTextView5 != null) {
                            LayoutToolbarBottomBinding wVar = new LayoutToolbarBottomBinding(view, drawableTextView, drawableTextView2, drawableTextView3, drawableTextView4, drawableTextView5);
                            return wVar;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: a */
    public View mo5604a() {
        return this.f14660a;
    }
}
