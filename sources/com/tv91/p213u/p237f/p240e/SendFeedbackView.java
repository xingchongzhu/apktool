package com.tv91.p213u.p237f.p240e;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import androidx.core.content.ContextCompat;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.BasicView;
import com.tv91.features.shared.Toolbar;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.FeedbackType;
import com.tv91.p210r.AdapterFeedbackTypeBinding;
import com.tv91.p210r.ViewFeedbackFormBinding;
import com.tv91.p213u.p237f.SendFeedbackScreen;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.f.e.r */
final class SendFeedbackView extends BasicView implements SendFeedbackScreen {

    /* renamed from: e */
    private final ViewFeedbackFormBinding f15777e;

    /* renamed from: f */
    private final Toolbar f15778f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C2911b f15779g;

    /* renamed from: h */
    private final ProgressDialog f15780h = new ProgressDialog(this.f13974b);

    /* renamed from: com.tv91.u.f.e.r$a */
    /* compiled from: SendFeedbackView */
    class C2910a implements OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ Consumer f15781a;

        C2910a(Consumer aVar) {
            this.f15781a = aVar;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            this.f15781a.mo4887a(SendFeedbackView.this.f15779g.getItem(i));
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.tv91.u.f.e.r$b */
    /* compiled from: SendFeedbackView */
    private static class C2911b extends ArrayAdapter<FeedbackType> {

        /* renamed from: a */
        private final Context f15783a;

        /* synthetic */ C2911b(Context context, C2910a aVar) {
            this(context);
        }

        /* renamed from: b */
        private View m20010b(int i, View view, ViewGroup viewGroup) {
            AdapterFeedbackTypeBinding eVar;
            if (view == null) {
                eVar = AdapterFeedbackTypeBinding.m17702d(LayoutInflater.from(this.f15783a), viewGroup, false);
            } else {
                eVar = AdapterFeedbackTypeBinding.m17701b(view);
            }
            eVar.f14344b.setText(((FeedbackType) getItem(i)).value);
            return eVar.mo5604a();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m20011c(List<FeedbackType> list) {
            clear();
            addAll(list);
            notifyDataSetChanged();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            View b = m20010b(i, view, viewGroup);
            b.setBackgroundColor(ContextCompat.m1756b(this.f15783a, R.color.white_translucent_12));
            return b;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return m20010b(i, view, viewGroup);
        }

        private C2911b(Context context) {
            super(context, 0);
            this.f15783a = context;
        }
    }

    SendFeedbackView(ViewFeedbackFormBinding h0Var) {
        super(h0Var);
        this.f15777e = h0Var;
        Toolbar gVar = new Toolbar(h0Var.f14393h);
        this.f15778f = gVar;
        C2911b bVar = new C2911b(this.f13974b, null);
        this.f15779g = bVar;
        gVar.mo16828p(R.string.report_feedback_title);
        gVar.mo16819c(R.menu.menu_cancel);
        h0Var.f14390e.setAdapter(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void mo18259s2(Consumer aVar, View view) {
        aVar.mo4887a(this.f15777e.f14391f.getText());
    }

    /* renamed from: J */
    public void mo16635J(Bundle bundle) {
        this.f15778f.mo16817a();
    }

    /* renamed from: a */
    public void mo18187a(boolean z) {
        this.f15777e.f14387b.setEnabled(!z);
        if (z) {
            this.f15780h.show();
        } else {
            this.f15780h.dismiss();
        }
    }

    /* renamed from: a0 */
    public void mo18188a0(List<FeedbackType> list) {
        this.f15779g.m20011c(list);
    }

    /* renamed from: d */
    public void mo18189d(Runnable runnable) {
        this.f15778f.mo16822j(runnable);
    }

    /* renamed from: f */
    public void mo18190f(Consumer<CharSequence> aVar) {
        this.f15777e.f14387b.setOnClickListener(Clicks.m17391a(new C2907m(this, aVar)));
    }

    /* renamed from: g0 */
    public void mo16552g0(String str) {
        CustomDialog.m17423a(this.f13974b, str);
    }

    /* renamed from: h2 */
    public void mo16553h2(Bundle bundle) {
        this.f15778f.mo16818b();
        this.f15777e.f14390e.setOnItemSelectedListener(null);
        this.f15777e.f14387b.setOnClickListener(null);
    }

    /* renamed from: n1 */
    public void mo18191n1(Consumer<FeedbackType> aVar) {
        this.f15777e.f14390e.setOnItemSelectedListener(new C2910a(aVar));
    }
}
