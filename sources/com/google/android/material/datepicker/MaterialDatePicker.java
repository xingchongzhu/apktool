package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.datepicker.CalendarConstraints.C1994b;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1288d;
import p067c.p068a.p069a.p114b.C1290e;
import p067c.p068a.p069a.p114b.C1291f;
import p067c.p068a.p069a.p114b.C1293h;
import p067c.p068a.p069a.p114b.C1295j;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable;
import p067c.p068a.p069a.p114b.p127t.InsetDialogOnTouchListener;
import p067c.p068a.p069a.p114b.p133z.MaterialAttributes;

/* renamed from: com.google.android.material.datepicker.i */
public final class MaterialDatePicker<S> extends DialogFragment {

    /* renamed from: t0 */
    static final Object f12896t0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: u0 */
    static final Object f12897u0 = "CANCEL_BUTTON_TAG";

    /* renamed from: v0 */
    static final Object f12898v0 = "TOGGLE_BUTTON_TAG";

    /* renamed from: A0 */
    private int f12899A0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public DateSelector<S> f12900B0;

    /* renamed from: C0 */
    private PickerFragment<S> f12901C0;

    /* renamed from: D0 */
    private CalendarConstraints f12902D0;

    /* renamed from: E0 */
    private MaterialCalendar<S> f12903E0;

    /* renamed from: F0 */
    private int f12904F0;

    /* renamed from: G0 */
    private CharSequence f12905G0;

    /* renamed from: H0 */
    private boolean f12906H0;

    /* renamed from: I0 */
    private int f12907I0;

    /* renamed from: J0 */
    private TextView f12908J0;
    /* access modifiers changed from: private */

    /* renamed from: K0 */
    public CheckableImageButton f12909K0;

    /* renamed from: L0 */
    private MaterialShapeDrawable f12910L0;
    /* access modifiers changed from: private */

    /* renamed from: M0 */
    public Button f12911M0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public final LinkedHashSet<MaterialPickerOnPositiveButtonClickListener<? super S>> f12912w0 = new LinkedHashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public final LinkedHashSet<OnClickListener> f12913x0 = new LinkedHashSet<>();

    /* renamed from: y0 */
    private final LinkedHashSet<OnCancelListener> f12914y0 = new LinkedHashSet<>();

    /* renamed from: z0 */
    private final LinkedHashSet<OnDismissListener> f12915z0 = new LinkedHashSet<>();

    /* renamed from: com.google.android.material.datepicker.i$a */
    /* compiled from: MaterialDatePicker */
    class C2009a implements OnClickListener {
        C2009a() {
        }

        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f12912w0.iterator();
            while (it.hasNext()) {
                ((MaterialPickerOnPositiveButtonClickListener) it.next()).mo15652a(MaterialDatePicker.this.mo15647M2());
            }
            MaterialDatePicker.this.mo2599o2();
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$b */
    /* compiled from: MaterialDatePicker */
    class C2010b implements OnClickListener {
        C2010b() {
        }

        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f12913x0.iterator();
            while (it.hasNext()) {
                ((OnClickListener) it.next()).onClick(view);
            }
            MaterialDatePicker.this.mo2599o2();
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$c */
    /* compiled from: MaterialDatePicker */
    class C2011c extends OnSelectionChangedListener<S> {
        C2011c() {
        }

        /* renamed from: a */
        public void mo15650a(S s) {
            MaterialDatePicker.this.m15863T2();
            MaterialDatePicker.this.f12911M0.setEnabled(MaterialDatePicker.this.f12900B0.mo15614e());
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$d */
    /* compiled from: MaterialDatePicker */
    class C2012d implements OnClickListener {
        C2012d() {
        }

        public void onClick(View view) {
            MaterialDatePicker.this.f12911M0.setEnabled(MaterialDatePicker.this.f12900B0.mo15614e());
            MaterialDatePicker.this.f12909K0.toggle();
            MaterialDatePicker iVar = MaterialDatePicker.this;
            iVar.m15864U2(iVar.f12909K0);
            MaterialDatePicker.this.m15862S2();
        }
    }

    /* renamed from: I2 */
    private static Drawable m15854I2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, AppCompatResources.m4143d(context, C1290e.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AppCompatResources.m4143d(context, C1290e.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: J2 */
    private static int m15855J2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C1288d.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C1288d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C1288d.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C1288d.mtrl_calendar_days_of_week_height);
        int i = MonthAdapter.f12931a;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C1288d.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(C1288d.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(C1288d.mtrl_calendar_bottom_padding);
    }

    /* renamed from: L2 */
    private static int m15856L2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C1288d.mtrl_calendar_content_padding);
        int i = Month.m15882o().f12927d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C1288d.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(C1288d.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: N2 */
    private int m15857N2(Context context) {
        int i = this.f12899A0;
        if (i != 0) {
            return i;
        }
        return this.f12900B0.mo15612b(context);
    }

    /* renamed from: O2 */
    private void m15858O2(Context context) {
        this.f12909K0.setTag(f12898v0);
        this.f12909K0.setImageDrawable(m15854I2(context));
        this.f12909K0.setChecked(this.f12907I0 != 0);
        ViewCompat.m5573o0(this.f12909K0, null);
        m15864U2(this.f12909K0);
        this.f12909K0.setOnClickListener(new C2012d());
    }

    /* renamed from: P2 */
    static boolean m15859P2(Context context) {
        return m15861R2(context, 16843277);
    }

    /* renamed from: Q2 */
    static boolean m15860Q2(Context context) {
        return m15861R2(context, C1270b.nestedScrollable);
    }

    /* renamed from: R2 */
    static boolean m15861R2(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.m11598c(context, C1270b.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public void m15862S2() {
        int N2 = m15857N2(mo2385O1());
        this.f12903E0 = MaterialCalendar.m15815C2(this.f12900B0, N2, this.f12902D0);
        this.f12901C0 = this.f12909K0.isChecked() ? MaterialTextInputPicker.m15875n2(this.f12900B0, N2, this.f12902D0) : this.f12903E0;
        m15863T2();
        FragmentTransaction m = mo2364H().mo2808m();
        m.mo2942p(C1291f.mtrl_calendar_frame, this.f12901C0);
        m.mo2518j();
        this.f12901C0.mo15636l2(new C2011c());
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public void m15863T2() {
        String K2 = mo15646K2();
        this.f12908J0.setContentDescription(String.format(mo2443i0(C1295j.mtrl_picker_announce_current_selection), new Object[]{K2}));
        this.f12908J0.setText(K2);
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public void m15864U2(CheckableImageButton checkableImageButton) {
        String str;
        if (this.f12909K0.isChecked()) {
            str = checkableImageButton.getContext().getString(C1295j.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(C1295j.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f12909K0.setContentDescription(str);
    }

    /* renamed from: J0 */
    public final void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        if (bundle == null) {
            bundle = mo2361G();
        }
        this.f12899A0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f12900B0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f12902D0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f12904F0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f12905G0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f12907I0 = bundle.getInt("INPUT_MODE_KEY");
    }

    /* renamed from: K2 */
    public String mo15646K2() {
        return this.f12900B0.mo15611a(mo2367I());
    }

    /* renamed from: M2 */
    public final S mo15647M2() {
        return this.f12900B0.mo15616h();
    }

    /* renamed from: N0 */
    public final View mo2381N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f12906H0 ? C1293h.mtrl_picker_fullscreen : C1293h.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f12906H0) {
            inflate.findViewById(C1291f.mtrl_calendar_frame).setLayoutParams(new LayoutParams(m15856L2(context), -2));
        } else {
            View findViewById = inflate.findViewById(C1291f.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(C1291f.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LayoutParams(m15856L2(context), -1));
            findViewById2.setMinimumHeight(m15855J2(mo2385O1()));
        }
        TextView textView = (TextView) inflate.findViewById(C1291f.mtrl_picker_header_selection_text);
        this.f12908J0 = textView;
        ViewCompat.m5577q0(textView, 1);
        this.f12909K0 = (CheckableImageButton) inflate.findViewById(C1291f.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(C1291f.mtrl_picker_title_text);
        CharSequence charSequence = this.f12905G0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f12904F0);
        }
        m15858O2(context);
        this.f12911M0 = (Button) inflate.findViewById(C1291f.confirm_button);
        if (this.f12900B0.mo15614e()) {
            this.f12911M0.setEnabled(true);
        } else {
            this.f12911M0.setEnabled(false);
        }
        this.f12911M0.setTag(f12896t0);
        this.f12911M0.setOnClickListener(new C2009a());
        Button button = (Button) inflate.findViewById(C1291f.cancel_button);
        button.setTag(f12897u0);
        button.setOnClickListener(new C2010b());
        return inflate;
    }

    /* renamed from: f1 */
    public final void mo2434f1(Bundle bundle) {
        super.mo2434f1(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f12899A0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f12900B0);
        C1994b bVar = new C1994b(this.f12902D0);
        if (this.f12903E0.mo15639y2() != null) {
            bVar.mo15606b(this.f12903E0.mo15639y2().f12929f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.mo15605a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f12904F0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f12905G0);
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        Window window = mo2607w2().getWindow();
        if (this.f12906H0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f12910L0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = mo2423c0().getDimensionPixelOffset(C1288d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            InsetDrawable insetDrawable = new InsetDrawable(this.f12910L0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(insetDrawable);
            window.getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(mo2607w2(), rect));
        }
        m15862S2();
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        this.f12901C0.mo15691m2();
        super.mo2440h1();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f12914y0.iterator();
        while (it.hasNext()) {
            ((OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f12915z0.iterator();
        while (it.hasNext()) {
            ((OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) mo2452l0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: s2 */
    public final Dialog mo2604s2(Bundle bundle) {
        Dialog dialog = new Dialog(mo2385O1(), m15857N2(mo2385O1()));
        Context context = dialog.getContext();
        this.f12906H0 = m15859P2(context);
        int c = MaterialAttributes.m11598c(context, C1270b.colorSurface, MaterialDatePicker.class.getCanonicalName());
        MaterialShapeDrawable gVar = new MaterialShapeDrawable(context, null, C1270b.materialCalendarStyle, C1296k.Widget_MaterialComponents_MaterialCalendar);
        this.f12910L0 = gVar;
        gVar.mo7836M(context);
        this.f12910L0.mo7843X(ColorStateList.valueOf(c));
        this.f12910L0.mo7842W(ViewCompat.m5588w(dialog.getWindow().getDecorView()));
        return dialog;
    }
}
