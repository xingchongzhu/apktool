package com.tv91.features.shared;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;

/* renamed from: com.tv91.features.shared.e */
/* compiled from: lambda */
public final /* synthetic */ class ViewSupplierSavadStateProvider implements SavedStateProvider {

    /* renamed from: a */
    public final /* synthetic */ ViewSupplier viewSupplier;

    public /* synthetic */ ViewSupplierSavadStateProvider(ViewSupplier viewSupplier) {
        this.viewSupplier = viewSupplier;
    }

    @NonNull
    @Override
    public Bundle saveState() {
        return this.viewSupplier.mo16808j();
    }
}
