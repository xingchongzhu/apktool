package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat.C0173a;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.C0266b;
import java.lang.ref.WeakReference;
import p010b.p011a.C0502a;
import p010b.p011a.C0507f;
import p010b.p011a.C0511j;
import p010b.p034g.p043k.ViewCompat;

class AlertController {

    /* renamed from: A */
    NestedScrollView f157A;

    /* renamed from: B */
    private int f158B = 0;

    /* renamed from: C */
    private Drawable f159C;

    /* renamed from: D */
    private ImageView f160D;

    /* renamed from: E */
    private TextView f161E;

    /* renamed from: F */
    private TextView f162F;

    /* renamed from: G */
    private View f163G;

    /* renamed from: H */
    ListAdapter f164H;

    /* renamed from: I */
    int f165I = -1;

    /* renamed from: J */
    private int f166J;

    /* renamed from: K */
    private int f167K;

    /* renamed from: L */
    int f168L;

    /* renamed from: M */
    int f169M;

    /* renamed from: N */
    int f170N;

    /* renamed from: O */
    int f171O;

    /* renamed from: P */
    private boolean f172P;

    /* renamed from: Q */
    private int f173Q = 0;

    /* renamed from: R */
    Handler f174R;

    /* renamed from: S */
    private final OnClickListener f175S = new C0044a();

    /* renamed from: a */
    private final Context f176a;

    /* renamed from: b */
    final AppCompatDialog f177b;

    /* renamed from: c */
    private final Window f178c;

    /* renamed from: d */
    private final int f179d;

    /* renamed from: e */
    private CharSequence f180e;

    /* renamed from: f */
    private CharSequence f181f;

    /* renamed from: g */
    ListView f182g;

    /* renamed from: h */
    private View f183h;

    /* renamed from: i */
    private int f184i;

    /* renamed from: j */
    private int f185j;

    /* renamed from: k */
    private int f186k;

    /* renamed from: l */
    private int f187l;

    /* renamed from: m */
    private int f188m;

    /* renamed from: n */
    private boolean f189n = false;

    /* renamed from: o */
    Button f190o;

    /* renamed from: p */
    private CharSequence f191p;

    /* renamed from: q */
    Message f192q;

    /* renamed from: r */
    private Drawable f193r;

    /* renamed from: s */
    Button f194s;

    /* renamed from: t */
    private CharSequence f195t;

    /* renamed from: u */
    Message f196u;

    /* renamed from: v */
    private Drawable f197v;

    /* renamed from: w */
    Button f198w;

    /* renamed from: x */
    private CharSequence f199x;

    /* renamed from: y */
    Message f200y;

    /* renamed from: z */
    private Drawable f201z;

    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f202a;

        /* renamed from: b */
        private final int f203b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0511j.f3583f2);
            this.f203b = obtainStyledAttributes.getDimensionPixelOffset(C0511j.f3588g2, -1);
            this.f202a = obtainStyledAttributes.getDimensionPixelOffset(C0511j.f3593h2, -1);
        }

        /* renamed from: a */
        public void mo234a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f202a, getPaddingRight(), z2 ? getPaddingBottom() : this.f203b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class C0044a implements OnClickListener {
        C0044a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f190o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f192q
                if (r1 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x000f:
                android.widget.Button r1 = r0.f194s
                if (r3 != r1) goto L_0x001c
                android.os.Message r1 = r0.f196u
                if (r1 == 0) goto L_0x001c
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x001c:
                android.widget.Button r1 = r0.f198w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f200y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f174R
                r1 = 1
                androidx.appcompat.app.g r3 = r3.f177b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0044a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    class C0045b implements C0266b {

        /* renamed from: a */
        final /* synthetic */ View f205a;

        /* renamed from: b */
        final /* synthetic */ View f206b;

        C0045b(View view, View view2) {
            this.f205a = view;
            this.f206b = view2;
        }

        /* renamed from: a */
        public void mo236a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m187f(nestedScrollView, this.f205a, this.f206b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    class C0046c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f208a;

        /* renamed from: b */
        final /* synthetic */ View f209b;

        C0046c(View view, View view2) {
            this.f208a = view;
            this.f209b = view2;
        }

        public void run() {
            AlertController.m187f(AlertController.this.f157A, this.f208a, this.f209b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    class C0047d implements OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f211a;

        /* renamed from: b */
        final /* synthetic */ View f212b;

        C0047d(View view, View view2) {
            this.f211a = view;
            this.f212b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m187f(absListView, this.f211a, this.f212b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    class C0048e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f214a;

        /* renamed from: b */
        final /* synthetic */ View f215b;

        C0048e(View view, View view2) {
            this.f214a = view;
            this.f215b = view2;
        }

        public void run() {
            AlertController.m187f(AlertController.this.f182g, this.f214a, this.f215b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0049f {

        /* renamed from: A */
        public int f217A;

        /* renamed from: B */
        public int f218B;

        /* renamed from: C */
        public int f219C;

        /* renamed from: D */
        public int f220D;

        /* renamed from: E */
        public boolean f221E = false;

        /* renamed from: F */
        public boolean[] f222F;

        /* renamed from: G */
        public boolean f223G;

        /* renamed from: H */
        public boolean f224H;

        /* renamed from: I */
        public int f225I = -1;

        /* renamed from: J */
        public OnMultiChoiceClickListener f226J;

        /* renamed from: K */
        public Cursor f227K;

        /* renamed from: L */
        public String f228L;

        /* renamed from: M */
        public String f229M;

        /* renamed from: N */
        public OnItemSelectedListener f230N;

        /* renamed from: O */
        public C0054e f231O;

        /* renamed from: P */
        public boolean f232P = true;

        /* renamed from: a */
        public final Context f233a;

        /* renamed from: b */
        public final LayoutInflater f234b;

        /* renamed from: c */
        public int f235c = 0;

        /* renamed from: d */
        public Drawable f236d;

        /* renamed from: e */
        public int f237e = 0;

        /* renamed from: f */
        public CharSequence f238f;

        /* renamed from: g */
        public View f239g;

        /* renamed from: h */
        public CharSequence f240h;

        /* renamed from: i */
        public CharSequence f241i;

        /* renamed from: j */
        public Drawable f242j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f243k;

        /* renamed from: l */
        public CharSequence f244l;

        /* renamed from: m */
        public Drawable f245m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f246n;

        /* renamed from: o */
        public CharSequence f247o;

        /* renamed from: p */
        public Drawable f248p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f249q;

        /* renamed from: r */
        public boolean f250r;

        /* renamed from: s */
        public OnCancelListener f251s;

        /* renamed from: t */
        public OnDismissListener f252t;

        /* renamed from: u */
        public OnKeyListener f253u;

        /* renamed from: v */
        public CharSequence[] f254v;

        /* renamed from: w */
        public ListAdapter f255w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f256x;

        /* renamed from: y */
        public int f257y;

        /* renamed from: z */
        public View f258z;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        class C0050a extends ArrayAdapter<CharSequence> {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f259a;

            C0050a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                this.f259a = recycleListView;
                super(context, i, i2, charSequenceArr);
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0049f.this.f222F;
                if (zArr != null && zArr[i]) {
                    this.f259a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        class C0051b extends CursorAdapter {

            /* renamed from: a */
            private final int f261a;

            /* renamed from: b */
            private final int f262b;

            /* renamed from: c */
            final /* synthetic */ RecycleListView f263c;

            /* renamed from: d */
            final /* synthetic */ AlertController f264d;

            C0051b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                this.f263c = recycleListView;
                this.f264d = alertController;
                super(context, cursor, z);
                Cursor cursor2 = getCursor();
                this.f261a = cursor2.getColumnIndexOrThrow(C0049f.this.f228L);
                this.f262b = cursor2.getColumnIndexOrThrow(C0049f.this.f229M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f261a));
                RecycleListView recycleListView = this.f263c;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f262b) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0049f.this.f234b.inflate(this.f264d.f169M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        class C0052c implements OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ AlertController f266a;

            C0052c(AlertController alertController) {
                this.f266a = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0049f.this.f256x.onClick(this.f266a.f177b, i);
                if (!C0049f.this.f224H) {
                    this.f266a.f177b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        class C0053d implements OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f268a;

            /* renamed from: b */
            final /* synthetic */ AlertController f269b;

            C0053d(RecycleListView recycleListView, AlertController alertController) {
                this.f268a = recycleListView;
                this.f269b = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0049f.this.f222F;
                if (zArr != null) {
                    zArr[i] = this.f268a.isItemChecked(i);
                }
                C0049f.this.f226J.onClick(this.f269b.f177b, i, this.f268a.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface C0054e {
            /* renamed from: a */
            void mo247a(ListView listView);
        }

        public C0049f(Context context) {
            this.f233a = context;
            this.f250r = true;
            this.f234b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v1, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v2, types: [androidx.appcompat.app.AlertController$h] */
        /* JADX WARNING: type inference failed for: r2v2, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v21, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v22, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: type inference failed for: r9v6 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1, types: [android.widget.ListAdapter]
  assigns: [android.widget.ListAdapter, android.widget.SimpleCursorAdapter, androidx.appcompat.app.AlertController$f$b, androidx.appcompat.app.AlertController$f$a]
  uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.widget.ListAdapter, android.widget.SimpleCursorAdapter, androidx.appcompat.app.AlertController$f$b, androidx.appcompat.app.AlertController$f$a]
  mth insns count: 70
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
         */
        /* JADX WARNING: Unknown variable types count: 5 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m213b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f234b
                int r1 = r11.f168L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f223G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f227K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f233a
                int r4 = r11.f169M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f254v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f233a
                android.database.Cursor r4 = r10.f227K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.f224H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.f170N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.f171O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.f227K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f233a
                android.database.Cursor r5 = r10.f227K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f228L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f255w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f233a
                java.lang.CharSequence[] r3 = r10.f254v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.f231O
                if (r1 == 0) goto L_0x0072
                r1.mo247a(r0)
            L_0x0072:
                r11.f164H = r9
                int r1 = r10.f225I
                r11.f165I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f256x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x0091
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f226J
                if (r1 == 0) goto L_0x0091
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x0091:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f230N
                if (r1 == 0) goto L_0x0098
                r0.setOnItemSelectedListener(r1)
            L_0x0098:
                boolean r1 = r10.f224H
                if (r1 == 0) goto L_0x00a0
                r0.setChoiceMode(r8)
                goto L_0x00a8
            L_0x00a0:
                boolean r1 = r10.f223G
                if (r1 == 0) goto L_0x00a8
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a8:
                r11.f182g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0049f.m213b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo241a(AlertController alertController) {
            View view = this.f239g;
            if (view != null) {
                alertController.mo226l(view);
            } else {
                CharSequence charSequence = this.f238f;
                if (charSequence != null) {
                    alertController.mo230q(charSequence);
                }
                Drawable drawable = this.f236d;
                if (drawable != null) {
                    alertController.mo228n(drawable);
                }
                int i = this.f235c;
                if (i != 0) {
                    alertController.mo227m(i);
                }
                int i2 = this.f237e;
                if (i2 != 0) {
                    alertController.mo227m(alertController.mo220c(i2));
                }
            }
            CharSequence charSequence2 = this.f240h;
            if (charSequence2 != null) {
                alertController.mo229o(charSequence2);
            }
            CharSequence charSequence3 = this.f241i;
            if (!(charSequence3 == null && this.f242j == null)) {
                alertController.mo225k(-1, charSequence3, this.f243k, null, this.f242j);
            }
            CharSequence charSequence4 = this.f244l;
            if (!(charSequence4 == null && this.f245m == null)) {
                alertController.mo225k(-2, charSequence4, this.f246n, null, this.f245m);
            }
            CharSequence charSequence5 = this.f247o;
            if (!(charSequence5 == null && this.f248p == null)) {
                alertController.mo225k(-3, charSequence5, this.f249q, null, this.f248p);
            }
            if (!(this.f254v == null && this.f227K == null && this.f255w == null)) {
                m213b(alertController);
            }
            View view2 = this.f258z;
            if (view2 == null) {
                int i3 = this.f257y;
                if (i3 != 0) {
                    alertController.mo231r(i3);
                }
            } else if (this.f221E) {
                alertController.mo233t(view2, this.f217A, this.f218B, this.f219C, this.f220D);
            } else {
                alertController.mo232s(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static final class C0055g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f271a;

        public C0055g(DialogInterface dialogInterface) {
            this.f271a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f271a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    private static class C0056h extends ArrayAdapter<CharSequence> {
        public C0056h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, AppCompatDialog gVar, Window window) {
        this.f176a = context;
        this.f177b = gVar;
        this.f178c = window;
        this.f174R = new C0055g(gVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0511j.f3465F, C0502a.f3291n, 0);
        this.f166J = obtainStyledAttributes.getResourceId(C0511j.f3470G, 0);
        this.f167K = obtainStyledAttributes.getResourceId(C0511j.f3480I, 0);
        this.f168L = obtainStyledAttributes.getResourceId(C0511j.f3490K, 0);
        this.f169M = obtainStyledAttributes.getResourceId(C0511j.f3495L, 0);
        this.f170N = obtainStyledAttributes.getResourceId(C0511j.f3503N, 0);
        this.f171O = obtainStyledAttributes.getResourceId(C0511j.f3485J, 0);
        this.f172P = obtainStyledAttributes.getBoolean(C0511j.f3499M, true);
        this.f179d = obtainStyledAttributes.getDimensionPixelSize(C0511j.f3475H, 0);
        obtainStyledAttributes.recycle();
        gVar.mo422d(1);
    }

    /* renamed from: a */
    static boolean m185a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m185a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m186b(Button button) {
        LayoutParams layoutParams = (LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    static void m187f(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: i */
    private ViewGroup m188i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: j */
    private int m189j() {
        int i = this.f167K;
        if (i == 0) {
            return this.f166J;
        }
        if (this.f173Q == 1) {
            return i;
        }
        return this.f166J;
    }

    /* renamed from: p */
    private void m190p(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f178c.findViewById(C0507f.f3400v);
        View findViewById2 = this.f178c.findViewById(C0507f.f3399u);
        if (VERSION.SDK_INT >= 23) {
            ViewCompat.m5515C0(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById != null || findViewById2 != null) {
            if (this.f181f != null) {
                this.f157A.setOnScrollChangeListener(new C0045b(findViewById, findViewById2));
                this.f157A.post(new C0046c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f182g;
            if (listView != null) {
                listView.setOnScrollListener(new C0047d(findViewById, findViewById2));
                this.f182g.post(new C0048e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        }
    }

    /* renamed from: u */
    private void m191u(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f190o = button;
        button.setOnClickListener(this.f175S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f191p) || this.f193r != null) {
            this.f190o.setText(this.f191p);
            Drawable drawable = this.f193r;
            if (drawable != null) {
                int i = this.f179d;
                drawable.setBounds(0, 0, i, i);
                this.f190o.setCompoundDrawables(this.f193r, null, null, null);
            }
            this.f190o.setVisibility(0);
            z = true;
        } else {
            this.f190o.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f194s = button2;
        button2.setOnClickListener(this.f175S);
        if (!TextUtils.isEmpty(this.f195t) || this.f197v != null) {
            this.f194s.setText(this.f195t);
            Drawable drawable2 = this.f197v;
            if (drawable2 != null) {
                int i2 = this.f179d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f194s.setCompoundDrawables(this.f197v, null, null, null);
            }
            this.f194s.setVisibility(0);
            z |= true;
        } else {
            this.f194s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f198w = button3;
        button3.setOnClickListener(this.f175S);
        if (!TextUtils.isEmpty(this.f199x) || this.f201z != null) {
            this.f198w.setText(this.f199x);
            Drawable drawable3 = this.f201z;
            if (drawable3 != null) {
                int i3 = this.f179d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f198w.setCompoundDrawables(this.f201z, null, null, null);
            }
            this.f198w.setVisibility(0);
            z |= true;
        } else {
            this.f198w.setVisibility(8);
        }
        if (m196z(this.f176a)) {
            if (z) {
                m186b(this.f190o);
            } else if (z) {
                m186b(this.f194s);
            } else if (z) {
                m186b(this.f198w);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: v */
    private void m192v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f178c.findViewById(C0507f.f3401w);
        this.f157A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f157A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f162F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f181f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                this.f157A.removeView(this.f162F);
                if (this.f182g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f157A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.f157A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.f182g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroup.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: w */
    private void m193w(ViewGroup viewGroup) {
        View view = this.f183h;
        boolean z = false;
        if (view == null) {
            view = this.f184i != 0 ? LayoutInflater.from(this.f176a).inflate(this.f184i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m185a(view)) {
            this.f178c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f178c.findViewById(C0507f.f3392n);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f189n) {
                frameLayout.setPadding(this.f185j, this.f186k, this.f187l, this.f188m);
            }
            if (this.f182g != null) {
                ((C0173a) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: x */
    private void m194x(ViewGroup viewGroup) {
        if (this.f163G != null) {
            viewGroup.addView(this.f163G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f178c.findViewById(C0507f.f3377O).setVisibility(8);
            return;
        }
        this.f160D = (ImageView) this.f178c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f180e)) || !this.f172P) {
            this.f178c.findViewById(C0507f.f3377O).setVisibility(8);
            this.f160D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f178c.findViewById(C0507f.f3388j);
        this.f161E = textView;
        textView.setText(this.f180e);
        int i = this.f158B;
        if (i != 0) {
            this.f160D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f159C;
        if (drawable != null) {
            this.f160D.setImageDrawable(drawable);
            return;
        }
        this.f161E.setPadding(this.f160D.getPaddingLeft(), this.f160D.getPaddingTop(), this.f160D.getPaddingRight(), this.f160D.getPaddingBottom());
        this.f160D.setVisibility(8);
    }

    /* renamed from: y */
    private void m195y() {
        View findViewById = this.f178c.findViewById(C0507f.f3398t);
        int i = C0507f.f3378P;
        View findViewById2 = findViewById.findViewById(i);
        int i2 = C0507f.f3391m;
        View findViewById3 = findViewById.findViewById(i2);
        int i3 = C0507f.f3389k;
        View findViewById4 = findViewById.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(C0507f.f3393o);
        m193w(viewGroup);
        View findViewById5 = viewGroup.findViewById(i);
        View findViewById6 = viewGroup.findViewById(i2);
        View findViewById7 = viewGroup.findViewById(i3);
        ViewGroup i4 = m188i(findViewById5, findViewById2);
        ViewGroup i5 = m188i(findViewById6, findViewById3);
        ViewGroup i6 = m188i(findViewById7, findViewById4);
        m192v(i5);
        m191u(i6);
        m194x(i4);
        char c = 0;
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (i4 == null || i4.getVisibility() == 8) ? false : true;
        boolean z3 = (i6 == null || i6.getVisibility() == 8) ? false : true;
        if (!z3 && i5 != null) {
            View findViewById8 = i5.findViewById(C0507f.f3373K);
            if (findViewById8 != null) {
                findViewById8.setVisibility(0);
            }
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f157A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f181f == null && this.f182g == null)) {
                view = i4.findViewById(C0507f.f3376N);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (i5 != null) {
            View findViewById9 = i5.findViewById(C0507f.f3374L);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        ListView listView = this.f182g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo234a(z2, z3);
        }
        if (!z) {
            View view2 = this.f182g;
            if (view2 == null) {
                view2 = this.f157A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m190p(i5, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f182g;
        if (listView2 != null) {
            ListAdapter listAdapter = this.f164H;
            if (listAdapter != null) {
                listView2.setAdapter(listAdapter);
                int i7 = this.f165I;
                if (i7 > -1) {
                    listView2.setItemChecked(i7, true);
                    listView2.setSelection(i7);
                }
            }
        }
    }

    /* renamed from: z */
    private static boolean m196z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0502a.f3290m, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int mo220c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f176a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView mo221d() {
        return this.f182g;
    }

    /* renamed from: e */
    public void mo222e() {
        this.f177b.setContentView(m189j());
        m195y();
    }

    /* renamed from: g */
    public boolean mo223g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f157A;
        return nestedScrollView != null && nestedScrollView.mo2285q(keyEvent);
    }

    /* renamed from: h */
    public boolean mo224h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f157A;
        return nestedScrollView != null && nestedScrollView.mo2285q(keyEvent);
    }

    /* renamed from: k */
    public void mo225k(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f174R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f199x = charSequence;
            this.f200y = message;
            this.f201z = drawable;
        } else if (i == -2) {
            this.f195t = charSequence;
            this.f196u = message;
            this.f197v = drawable;
        } else if (i == -1) {
            this.f191p = charSequence;
            this.f192q = message;
            this.f193r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: l */
    public void mo226l(View view) {
        this.f163G = view;
    }

    /* renamed from: m */
    public void mo227m(int i) {
        this.f159C = null;
        this.f158B = i;
        ImageView imageView = this.f160D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f160D.setImageResource(this.f158B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: n */
    public void mo228n(Drawable drawable) {
        this.f159C = drawable;
        this.f158B = 0;
        ImageView imageView = this.f160D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f160D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: o */
    public void mo229o(CharSequence charSequence) {
        this.f181f = charSequence;
        TextView textView = this.f162F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void mo230q(CharSequence charSequence) {
        this.f180e = charSequence;
        TextView textView = this.f161E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void mo231r(int i) {
        this.f183h = null;
        this.f184i = i;
        this.f189n = false;
    }

    /* renamed from: s */
    public void mo232s(View view) {
        this.f183h = view;
        this.f184i = 0;
        this.f189n = false;
    }

    /* renamed from: t */
    public void mo233t(View view, int i, int i2, int i3, int i4) {
        this.f183h = view;
        this.f184i = 0;
        this.f189n = true;
        this.f185j = i;
        this.f186k = i2;
        this.f187l = i3;
        this.f188m = i4;
    }
}
