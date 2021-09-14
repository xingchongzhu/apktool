package com.tv91.features.shared;

import android.view.MenuItem;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.p210r.LayoutToolbarImageTitleBinding;
import com.tv91.p210r.LayoutToolbarTextTitleBinding;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tv91.features.shared.g */
public final class Toolbar {

    /* renamed from: a */
    private final LayoutToolbarTextTitleBinding f13977a;

    /* renamed from: b */
    private final LayoutToolbarImageTitleBinding f13978b;

    /* renamed from: c */
    private final androidx.appcompat.widget.Toolbar f13979c;

    /* renamed from: d */
    private final Map<Integer, Runnable> f13980d;

    public Toolbar(LayoutToolbarTextTitleBinding yVar) {
        this.f13980d = new HashMap();
        this.f13977a = yVar;
        this.f13978b = null;
        this.f13979c = yVar.mo5604a();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m17339g(MenuItem menuItem) {
        Runnable runnable = (Runnable) this.f13980d.get(Integer.valueOf(menuItem.getItemId()));
        if (runnable == null) {
            return false;
        }
        runnable.run();
        return true;
    }

    /* renamed from: a */
    public void mo16817a() {
        this.f13979c.setOnMenuItemClickListener(new C2296c(this));
    }

    /* renamed from: b */
    public void mo16818b() {
        this.f13979c.setNavigationOnClickListener(null);
        this.f13979c.setOnMenuItemClickListener(null);
    }

    /* renamed from: c */
    public void mo16819c(int i) {
        this.f13979c.getMenu().clear();
        this.f13979c.mo1255x(i);
    }

    /* renamed from: h */
    public void mo16820h(Runnable runnable) {
        this.f13980d.put(Integer.valueOf(R.id.action_add), runnable);
    }

    /* renamed from: i */
    public void mo16821i(Runnable runnable) {
        this.f13979c.setNavigationIcon((int) R.drawable.ic_chevron_left_large);
        this.f13979c.setNavigationContentDescription((int) R.string.toolbar_navigation_content);
        this.f13979c.setNavigationOnClickListener(Clicks.m17391a(new C2295b(runnable)));
    }

    /* renamed from: j */
    public void mo16822j(Runnable runnable) {
        this.f13980d.put(Integer.valueOf(R.id.action_cancel), runnable);
    }

    /* renamed from: k */
    public void mo16823k(Runnable runnable) {
        this.f13979c.setNavigationIcon((int) R.drawable.ic_coins);
        this.f13979c.setNavigationOnClickListener(Clicks.m17391a(new C2294a(runnable)));
    }

    /* renamed from: l */
    public void mo16824l(Runnable runnable) {
        this.f13980d.put(Integer.valueOf(R.id.action_edit), runnable);
    }

    /* renamed from: m */
    public void mo16825m(Runnable runnable) {
        this.f13980d.put(Integer.valueOf(R.id.action_edit_favorite), runnable);
    }

    /* renamed from: n */
    public void mo16826n(Runnable runnable) {
        this.f13980d.put(Integer.valueOf(R.id.action_search), runnable);
    }

    /* renamed from: o */
    public void mo16827o(int i) {
        LayoutToolbarImageTitleBinding xVar = this.f13978b;
        if (xVar != null) {
            xVar.f14673b.setImageResource(i);
        }
    }

    /* renamed from: p */
    public void mo16828p(int i) {
        LayoutToolbarTextTitleBinding yVar = this.f13977a;
        if (yVar != null) {
            yVar.f14685b.setText(i);
        }
    }

    /* renamed from: q */
    public void mo16829q(String str) {
        LayoutToolbarTextTitleBinding yVar = this.f13977a;
        if (yVar != null) {
            yVar.f14685b.setText(str);
        }
    }

    /* renamed from: r */
    public void mo16830r(boolean z) {
        this.f13979c.setVisibility(z ? 0 : 8);
    }

    public Toolbar(LayoutToolbarImageTitleBinding xVar) {
        this.f13980d = new HashMap();
        this.f13977a = null;
        this.f13978b = xVar;
        this.f13979c = xVar.mo5604a();
    }
}
