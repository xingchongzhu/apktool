package com.tv91.features.shared.widget;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;

public final class NoScrollGridLayoutManager extends GridLayoutManager {
    public NoScrollGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    /* renamed from: k */
    public boolean mo3126k() {
        return false;
    }

    /* renamed from: l */
    public boolean mo3127l() {
        return false;
    }
}
