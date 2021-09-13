package com.tv91.p213u.p214a.p218p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import androidx.core.content.ContextCompat;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.p205h.ViewHolder;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.p210r.AdapterEntryBinding;
import com.tv91.p213u.p214a.ProfileScreen;
import java.util.ArrayList;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.a.p.u */
/* compiled from: MenuAdapter */
final class C2425u extends BaseAdapter {

    /* renamed from: a */
    private final List<ProfileScreen> f14867a = new ArrayList();

    /* renamed from: b */
    private final Context f14868b;

    /* renamed from: c */
    private Consumer<ProfileScreen> f14869c;

    /* renamed from: com.tv91.u.a.p.u$b */
    /* compiled from: MenuAdapter */
    private static class C2427b extends ViewHolder<ProfileScreen> {

        /* renamed from: w */
        private final AdapterEntryBinding f14870w;

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo16844M(ProfileScreen jVar) {
            if (jVar == ProfileScreen.ACCOUNT) {
                this.f14870w.f14322c.setVisibility(0);
                this.f14870w.f14322c.setImageResource(R.drawable.ic_mail_outline_24dp);
                this.f14870w.f14321b.setVisibility(8);
            } else if (jVar == ProfileScreen.VIP) {
                this.f14870w.f14322c.setVisibility(0);
                this.f14870w.f14322c.setImageResource(R.drawable.ic_crown_full);
                this.f14870w.f14323d.setTextColor(mo16846O(R.color.light_orange));
                this.f14870w.f14321b.setVisibility(8);
            } else if (jVar == ProfileScreen.OPEN_VIP) {
                this.f14870w.f14322c.setVisibility(0);
                this.f14870w.f14322c.setImageResource(R.drawable.ic_crown);
            } else if (jVar == ProfileScreen.VERIFICATION_ON) {
                this.f14870w.f14322c.setVisibility(0);
                this.f14870w.f14322c.setImageResource(R.drawable.ic_phone);
                this.f14870w.f14321b.setVisibility(8);
            } else if (jVar == ProfileScreen.VERIFICATION_OFF) {
                this.f14870w.f14322c.setVisibility(0);
                this.f14870w.f14322c.setImageResource(R.drawable.ic_phone);
                this.f14870w.f14321b.setVisibility(0);
            } else if (jVar == ProfileScreen.DEPOSIT_HISTORY) {
                this.f14870w.f14322c.setVisibility(0);
                this.f14870w.f14322c.setImageResource(R.drawable.ic_note);
            } else if (jVar == ProfileScreen.VERSION) {
                this.f14870w.f14321b.setVisibility(8);
            }
            this.f14870w.f14323d.setText(jVar.mo17148a());
        }

        private C2427b(AdapterEntryBinding cVar) {
            super(cVar);
            this.f14870w = cVar;
            this.f2841b.setBackgroundColor(mo16846O(R.color.gray_42));
            this.f2841b.setPadding(mo16847P(R.dimen.spacing_x_large), 0, 0, 0);
            cVar.f14324e.setVisibility(0);
        }
    }

    C2425u(Context context) {
        this.f14868b = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void mo17254c(ProfileScreen jVar, View view) {
        Consumer<ProfileScreen> aVar = this.f14869c;
        if (aVar != null) {
            aVar.mo4887a(jVar);
        }
    }

    /* renamed from: a */
    public ProfileScreen getItem(int i) {
        return (ProfileScreen) this.f14867a.get(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo17255d(Consumer<ProfileScreen> aVar) {
        this.f14869c = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo17256e(List<ProfileScreen> list) {
        this.f14867a.clear();
        this.f14867a.addAll(list);
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f14867a.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ProfileScreen a = getItem(i);
        if (a == ProfileScreen.GAP) {
            View view2 = new View(this.f14868b);
            view2.setBackgroundColor(ContextCompat.m1756b(this.f14868b, R.color.color_primary));
            view2.setLayoutParams(new LayoutParams(-1, this.f14868b.getResources().getDimensionPixelOffset(R.dimen.spacing_x_large)));
            view2.setEnabled(false);
            return view2;
        }
        C2427b bVar = new C2427b(AdapterEntryBinding.m17688d(LayoutInflater.from(this.f14868b), viewGroup, false));
        bVar.f2841b.setOnClickListener(Clicks.m17391a(new C2407b(this, a)));
        bVar.mo16844M(a);
        return bVar.f2841b;
    }
}
