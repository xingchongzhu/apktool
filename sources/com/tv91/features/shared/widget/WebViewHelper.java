package com.tv91.features.shared.widget;

import android.annotation.SuppressLint;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.tv91.features.shared.widget.f */
public final class WebViewHelper {

    /* renamed from: com.tv91.features.shared.widget.f$b */
    /* compiled from: WebViewHelper */
    private static class C2319b extends WebViewClient {
        private C2319b() {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return false;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: a */
    public static void m17451a(WebView webView, WebViewClient webViewClient, String str) {
        if (!(webView.getTag() != null)) {
            webView.setWebViewClient(webViewClient);
            webView.setWebChromeClient(new WebChromeClient());
            webView.setLayerType(2, null);
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setAllowFileAccess(false);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setCacheMode(2);
            webView.setTag(Boolean.TRUE);
        }
        webView.loadUrl(str);
    }

    /* renamed from: b */
    public static void m17452b(WebView webView, String str) {
        m17451a(webView, new C2319b(), str);
    }
}
