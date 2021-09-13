package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p010b.p034g.p042j.Preconditions;

/* renamed from: androidx.appcompat.widget.y */
final class AppCompatTextClassifierHelper {

    /* renamed from: a */
    private TextView f1263a;

    /* renamed from: b */
    private TextClassifier f1264b;

    AppCompatTextClassifierHelper(TextView textView) {
        this.f1263a = (TextView) Preconditions.m5188e(textView);
    }

    /* renamed from: a */
    public TextClassifier mo1852a() {
        TextClassifier textClassifier = this.f1264b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1263a.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            textClassifier = TextClassifier.NO_OP;
        }
        return textClassifier;
    }

    /* renamed from: b */
    public void mo1853b(TextClassifier textClassifier) {
        this.f1264b = textClassifier;
    }
}
