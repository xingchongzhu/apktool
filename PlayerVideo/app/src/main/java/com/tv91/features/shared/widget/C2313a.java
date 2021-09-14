package com.tv91.features.shared.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tv91.features.shared.widget.CustomDialog.C2317a;
import com.tv91.p210r.DialogTemplateBinding;

/* renamed from: com.tv91.features.shared.widget.a */
/* compiled from: lambda */
public final /* synthetic */ class C2313a implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C2317a f14026a;

    /* renamed from: b */
    public final /* synthetic */ CustomDialog f14027b;

    /* renamed from: c */
    public final /* synthetic */ DialogTemplateBinding f14028c;

    public /* synthetic */ C2313a(C2317a aVar, CustomDialog eVar, DialogTemplateBinding qVar) {
        this.f14026a = aVar;
        this.f14027b = eVar;
        this.f14028c = qVar;
    }

    public final void onClick(View view) {
        this.f14026a.mo16892c(this.f14027b, this.f14028c, view);
    }
}
