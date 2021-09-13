package androidx.core.widget;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p010b.p034g.p043k.ContentInfoCompat;
import p010b.p034g.p043k.OnReceiveContentListener;

/* renamed from: androidx.core.widget.j */
public final class TextViewOnReceiveContentListener implements OnReceiveContentListener {

    /* renamed from: androidx.core.widget.j$a */
    /* compiled from: TextViewOnReceiveContentListener */
    private static final class C0272a {
        /* renamed from: a */
        static CharSequence m2002a(Context context, Item item, int i) {
            if ((i & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            if (coerceToText instanceof Spanned) {
                coerceToText = coerceToText.toString();
            }
            return coerceToText;
        }
    }

    /* renamed from: androidx.core.widget.j$b */
    /* compiled from: TextViewOnReceiveContentListener */
    private static final class C0273b {
        /* renamed from: a */
        static CharSequence m2003a(Context context, Item item, int i) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        }
    }

    /* renamed from: b */
    private static CharSequence m1997b(ClipData clipData, Context context, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i2 = 0; i2 < clipData.getItemCount(); i2++) {
            CharSequence c = m1998c(context, clipData.getItemAt(i2), i);
            if (c != null) {
                spannableStringBuilder.append(c);
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: c */
    private static CharSequence m1998c(Context context, Item item, int i) {
        if (VERSION.SDK_INT >= 16) {
            return C0272a.m2002a(context, item, i);
        }
        return C0273b.m2003a(context, item, i);
    }

    /* renamed from: d */
    private static void m1999d(TextView textView, ContentInfoCompat cVar) {
        m2000e((Editable) textView.getText(), m1997b(cVar.mo4974b(), textView.getContext(), cVar.mo4975c()));
    }

    /* renamed from: e */
    private static void m2000e(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    /* renamed from: a */
    public ContentInfoCompat mo2342a(View view, ContentInfoCompat cVar) {
        String str = "ReceiveContent";
        if (Log.isLoggable(str, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReceive: ");
            sb.append(cVar);
            Log.d(str, sb.toString());
        }
        int d = cVar.mo4976d();
        if (d == 2) {
            return cVar;
        }
        if (d == 3) {
            m1999d((TextView) view, cVar);
            return null;
        }
        ClipData b = cVar.mo4974b();
        int c = cVar.mo4975c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < b.getItemCount(); i++) {
            CharSequence c2 = m1998c(context, b.getItemAt(i), c);
            if (c2 != null) {
                if (!z) {
                    m2000e(editable, c2);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), c2);
                }
            }
        }
        return null;
    }
}
