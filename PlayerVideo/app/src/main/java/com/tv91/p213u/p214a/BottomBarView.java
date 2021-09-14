package com.tv91.p213u.p214a;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.core.widget.TextViewCompat;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.widget.DrawableTextView;
import com.tv91.p210r.LayoutToolbarBottomBinding;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.a.e */
public abstract class BottomBarView extends BasicView implements DashboardView {

    /* renamed from: e */
    private final LayoutToolbarBottomBinding f14731e;

    /* renamed from: f */
    private final Dashboard f14732f;

    public BottomBarView(Dashboard hVar, LayoutToolbarBottomBinding wVar) {
        super(wVar.mo5604a().getRootView());
        this.f14732f = hVar;
        this.f14731e = wVar;
        m17865q2();
    }

    /* renamed from: q2 */
    private void m17865q2() {
        int l2 = mo16812l2(R.color.color_accent);
        LayoutToolbarBottomBinding wVar = this.f14731e;
        DrawableTextView[] drawableTextViewArr = {wVar.f14663d, wVar.f14662c, wVar.f14661b, wVar.f14665f, wVar.f14664e};
        for (int i = 0; i < 5; i++) {
            DrawableTextView drawableTextView = drawableTextViewArr[i];
            if (drawableTextView.getId() == this.f14732f.f14739g) {
                TextViewCompat.m1981j(drawableTextView, null);
                drawableTextView.mo16876h(-1, this.f14732f.f14740h, -1, -1);
                drawableTextView.setTextColor(l2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void mo17134s2(Consumer aVar, View view) {
        Dashboard a = Dashboard.m17882a(view.getId());
        if (this.f14732f != a) {
            aVar.mo4887a(a);
        }
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f14731e.f14663d.setOnClickListener(null);
        this.f14731e.f14662c.setOnClickListener(null);
        this.f14731e.f14661b.setOnClickListener(null);
        this.f14731e.f14665f.setOnClickListener(null);
        this.f14731e.f14664e.setOnClickListener(null);
    }

    /* renamed from: t */
    public void mo17135t(Consumer<Dashboard> aVar) {
        OnClickListener a = Clicks.m17391a(new C2356b(this, aVar));
        this.f14731e.f14663d.setOnClickListener(a);
        this.f14731e.f14662c.setOnClickListener(a);
        this.f14731e.f14661b.setOnClickListener(a);
        this.f14731e.f14665f.setOnClickListener(a);
        this.f14731e.f14664e.setOnClickListener(a);
    }
}
