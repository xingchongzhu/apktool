package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import androidx.appcompat.view.menu.MenuBuilder.C0103b;
import androidx.appcompat.widget.TintTypedArray;

public final class ExpandedMenuView extends ListView implements C0103b, MenuView, OnItemClickListener {

    /* renamed from: a */
    private static final int[] f467a = {16842964, 16843049};

    /* renamed from: b */
    private MenuBuilder f468b;

    /* renamed from: c */
    private int f469c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    /* renamed from: a */
    public boolean mo507a(MenuItemImpl iVar) {
        return this.f468b.mo654L(iVar, 0);
    }

    /* renamed from: b */
    public void mo508b(MenuBuilder gVar) {
        this.f468b = gVar;
    }

    public int getWindowAnimations() {
        return this.f469c;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo507a((MenuItemImpl) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        TintTypedArray v = TintTypedArray.m1406v(context, attributeSet, f467a, i, 0);
        if (v.mo1850s(0)) {
            setBackgroundDrawable(v.mo1838g(0));
        }
        if (v.mo1850s(1)) {
            setDivider(v.mo1838g(1));
        }
        v.mo1851w();
    }
}
