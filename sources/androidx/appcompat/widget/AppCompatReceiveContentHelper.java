package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import p010b.p034g.p043k.ContentInfoCompat.C0619a;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p045g0.InputConnectionCompat.C0651c;
import p010b.p034g.p043k.p045g0.InputContentInfoCompat;

/* renamed from: androidx.appcompat.widget.u */
final class AppCompatReceiveContentHelper {

    /* renamed from: androidx.appcompat.widget.u$a */
    /* compiled from: AppCompatReceiveContentHelper */
    class C0194a implements C0651c {

        /* renamed from: a */
        final /* synthetic */ View f1214a;

        C0194a(View view) {
            this.f1214a = view;
        }

        /* renamed from: a */
        public boolean mo1754a(InputContentInfoCompat cVar, int i, Bundle bundle) {
            boolean z = false;
            if (VERSION.SDK_INT >= 25 && (i & 1) != 0) {
                try {
                    cVar.mo5121d();
                    InputContentInfo inputContentInfo = (InputContentInfo) cVar.mo5122e();
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                } catch (Exception e) {
                    Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e);
                    return false;
                }
            }
            if (ViewCompat.m5553e0(this.f1214a, new C0619a(new ClipData(cVar.mo5119b(), new Item(cVar.mo5118a())), 2).mo4981d(cVar.mo5120c()).mo4979b(bundle).mo4978a()) == null) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: androidx.appcompat.widget.u$b */
    /* compiled from: AppCompatReceiveContentHelper */
    private static final class C0195b {
        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        static boolean m1354a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                ViewCompat.m5553e0(textView, new C0619a(dragEvent.getClipData(), 3).mo4978a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        /* renamed from: b */
        static boolean m1355b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            ViewCompat.m5553e0(view, new C0619a(dragEvent.getClipData(), 3).mo4978a());
            return true;
        }
    }

    /* renamed from: a */
    static C0651c m1349a(View view) {
        return new C0194a(view);
    }

    /* renamed from: b */
    static boolean m1350b(View view, DragEvent dragEvent) {
        boolean z;
        if (VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && ViewCompat.m5520F(view) != null) {
            Activity d = m1352d(view);
            if (d == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't handle drop: no activity: view=");
                sb.append(view);
                Log.i("ReceiveContent", sb.toString());
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    if (view instanceof TextView) {
                        z = C0195b.m1354a(dragEvent, (TextView) view, d);
                    } else {
                        z = C0195b.m1355b(dragEvent, view, d);
                    }
                    return z;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    static boolean m1351c(TextView textView, int i) {
        ClipData clipData;
        int i2 = 0;
        if ((i != 16908322 && i != 16908337) || ViewCompat.m5520F(textView) == null) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            clipData = null;
        } else {
            clipData = clipboardManager.getPrimaryClip();
        }
        if (clipData != null && clipData.getItemCount() > 0) {
            C0619a aVar = new C0619a(clipData, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            ViewCompat.m5553e0(textView, aVar.mo4980c(i2).mo4978a());
        }
        return true;
    }

    /* renamed from: d */
    static Activity m1352d(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
