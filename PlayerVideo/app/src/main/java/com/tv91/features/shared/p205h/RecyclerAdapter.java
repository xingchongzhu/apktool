package com.tv91.features.shared.p205h;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.C0407d0;
import androidx.recyclerview.widget.RecyclerView.C0410g;
import com.tv91.features.shared.p206i.Clicks;
import java.util.ArrayList;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.features.shared.h.b */
public abstract class RecyclerAdapter<ITEM, VH extends C0407d0> extends C0410g<VH> {

    /* renamed from: c */
    protected final List<ITEM> f13983c;

    /* renamed from: d */
    protected Consumer<ITEM> f13984d;

    public RecyclerAdapter() {
        this.f13983c = new ArrayList();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void mo16836F(C0407d0 d0Var, View view) {
        Consumer<ITEM> aVar = this.f13984d;
        if (aVar != null) {
            aVar.mo4887a(this.f13983c.get(d0Var.mo3369j()));
        }
    }

    /* renamed from: y */
    private int m17355y(int i) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid index: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract VH mo16832A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i);

    /* renamed from: B */
    public ITEM mo16833B(int i) {
        if (mo16835D()) {
            return null;
        }
        return this.f13983c.get(i);
    }

    /* renamed from: C */
    public int mo16834C(ITEM item) {
        if (mo16835D()) {
            return -1;
        }
        return this.f13983c.indexOf(item);
    }

    /* renamed from: D */
    public boolean mo16835D() {
        return this.f13983c.isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo16837G(VH vh, ITEM item) {
    }

    /* renamed from: H */
    public void mo16838H(Consumer<ITEM> aVar) {
        this.f13984d = aVar;
    }

    /* renamed from: I */
    public void mo16839I(ITEM item) {
        int C = mo16834C(item);
        if (C >= 0 && this.f13983c.remove(mo16833B(C))) {
            mo3417k(C);
        }
    }

    /* renamed from: J */
    public void mo16840J(List<ITEM> list) {
        this.f13983c.clear();
        this.f13983c.addAll(list);
        mo3414h();
    }

    /* renamed from: K */
    public void mo16841K(int i, ITEM item) {
        this.f13983c.set(m17355y(i), item);
        mo3415i(i);
    }

    /* renamed from: c */
    public int mo3409c() {
        return this.f13983c.size();
    }

    /* renamed from: m */
    public void mo3419m(VH vh, int i) {
        if (vh instanceof ViewHolder) {
            ((ViewHolder) vh).mo16844M(this.f13983c.get(i));
        } else {
            mo16837G(vh, this.f13983c.get(i));
        }
    }

    /* renamed from: o */
    public VH mo3421o(ViewGroup viewGroup, int i) {
        VH A = mo16832A(LayoutInflater.from(viewGroup.getContext()), viewGroup, i);
        A.f2841b.setOnClickListener(Clicks.m17391a(new C2299a(this, A)));
        return A;
    }

    /* renamed from: x */
    public void mo16842x(List<ITEM> list) {
        int size = this.f13983c.size();
        this.f13983c.addAll(list);
        mo3416j(size, list.size());
    }

    /* renamed from: z */
    public void mo16843z(boolean z) {
        this.f13983c.clear();
        if (z) {
            mo3414h();
        }
    }

    public RecyclerAdapter(List<ITEM> list) {
        ArrayList arrayList = new ArrayList();
        this.f13983c = arrayList;
        arrayList.addAll(list);
    }
}
