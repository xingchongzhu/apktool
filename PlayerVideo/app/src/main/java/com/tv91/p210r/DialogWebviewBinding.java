package com.tv91.p210r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import com.chip.ninetyonetv.R;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.r */
public final class DialogWebviewBinding implements ViewBinding {

    /* renamed from: a */
    private final LinearLayout f14569a;

    /* renamed from: b */
    public final Button f14570b;

    /* renamed from: c */
    public final LayoutToolbarTextTitleBinding f14571c;

    /* renamed from: d */
    public final WebView f14572d;

    private DialogWebviewBinding(LinearLayout linearLayout, Button button, LayoutToolbarTextTitleBinding yVar, WebView webView) {
        this.f14569a = linearLayout;
        this.f14570b = button;
        this.f14571c = yVar;
        this.f14572d = webView;
    }

    /* renamed from: b */
    public static DialogWebviewBinding m17792b(View view) {
        int i = R.id.dialog_negative_button;
        Button button = (Button) view.findViewById(R.id.dialog_negative_button);
        if (button != null) {
            i = R.id.dialog_title_toolbar;
            View findViewById = view.findViewById(R.id.dialog_title_toolbar);
            if (findViewById != null) {
                LayoutToolbarTextTitleBinding b = LayoutToolbarTextTitleBinding.m17835b(findViewById);
                WebView webView = (WebView) view.findViewById(R.id.dialog_web_view);
                if (webView != null) {
                    return new DialogWebviewBinding((LinearLayout) view, button, b, webView);
                }
                i = R.id.dialog_web_view;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static DialogWebviewBinding m17793d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17792b(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo5604a() {
        return this.f14569a;
    }
}
