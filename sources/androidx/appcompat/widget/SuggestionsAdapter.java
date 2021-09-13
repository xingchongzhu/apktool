package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p010b.p011a.C0502a;
import p010b.p011a.C0507f;
import p010b.p046h.p047a.ResourceCursorAdapter;

/* renamed from: androidx.appcompat.widget.r0 */
class SuggestionsAdapter extends ResourceCursorAdapter implements OnClickListener {

    /* renamed from: l */
    private final SearchView f1181l;

    /* renamed from: m */
    private final SearchableInfo f1182m;

    /* renamed from: n */
    private final Context f1183n;

    /* renamed from: o */
    private final WeakHashMap<String, ConstantState> f1184o;

    /* renamed from: p */
    private final int f1185p;

    /* renamed from: q */
    private boolean f1186q = false;

    /* renamed from: r */
    private int f1187r = 1;

    /* renamed from: s */
    private ColorStateList f1188s;

    /* renamed from: t */
    private int f1189t = -1;

    /* renamed from: u */
    private int f1190u = -1;

    /* renamed from: v */
    private int f1191v = -1;

    /* renamed from: w */
    private int f1192w = -1;

    /* renamed from: x */
    private int f1193x = -1;

    /* renamed from: y */
    private int f1194y = -1;

    /* renamed from: androidx.appcompat.widget.r0$a */
    /* compiled from: SuggestionsAdapter */
    private static final class C0193a {

        /* renamed from: a */
        public final TextView f1195a;

        /* renamed from: b */
        public final TextView f1196b;

        /* renamed from: c */
        public final ImageView f1197c;

        /* renamed from: d */
        public final ImageView f1198d;

        /* renamed from: e */
        public final ImageView f1199e;

        public C0193a(View view) {
            this.f1195a = (TextView) view.findViewById(16908308);
            this.f1196b = (TextView) view.findViewById(16908309);
            this.f1197c = (ImageView) view.findViewById(16908295);
            this.f1198d = (ImageView) view.findViewById(16908296);
            this.f1199e = (ImageView) view.findViewById(C0507f.f3395q);
        }
    }

    public SuggestionsAdapter(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1181l = searchView;
        this.f1182m = searchableInfo;
        this.f1185p = searchView.getSuggestionCommitIconResId();
        this.f1183n = context;
        this.f1184o = weakHashMap;
    }

    /* renamed from: A */
    private void m1320A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1184o.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    private void m1321B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: k */
    private Drawable m1322k(String str) {
        ConstantState constantState = (ConstantState) this.f1184o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    private CharSequence m1323l(CharSequence charSequence) {
        if (this.f1188s == null) {
            TypedValue typedValue = new TypedValue();
            this.f1183n.getTheme().resolveAttribute(C0502a.f3275K, typedValue, true);
            this.f1188s = this.f1183n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(null, 0, 0, this.f1188s, null);
        spannableString.setSpan(textAppearanceSpan, 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    private Drawable m1324m(ComponentName componentName) {
        String str = "SuggestionsAdapter";
        PackageManager packageManager = this.f1183n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid icon resource ");
            sb.append(iconResource);
            sb.append(" for ");
            sb.append(componentName.flattenToShortString());
            Log.w(str, sb.toString());
            return null;
        } catch (NameNotFoundException e) {
            Log.w(str, e.toString());
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.graphics.drawable.Drawable$ConstantState] */
    /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.graphics.drawable.Drawable, android.graphics.drawable.Drawable$ConstantState]
  uses: [java.lang.Object, android.graphics.drawable.Drawable]
  mth insns count: 21
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1325n(android.content.ComponentName r4) {
        /*
            r3 = this;
            java.lang.String r0 = r4.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.f1184o
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0023
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r3.f1184o
            java.lang.Object r4 = r4.get(r0)
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4
            if (r4 != 0) goto L_0x0018
            goto L_0x0022
        L_0x0018:
            android.content.Context r0 = r3.f1183n
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r2 = r4.newDrawable(r0)
        L_0x0022:
            return r2
        L_0x0023:
            android.graphics.drawable.Drawable r4 = r3.m1324m(r4)
            if (r4 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            android.graphics.drawable.Drawable$ConstantState r2 = r4.getConstantState()
        L_0x002e:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.f1184o
            r1.put(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SuggestionsAdapter.m1325n(android.content.ComponentName):android.graphics.drawable.Drawable");
    }

    /* renamed from: o */
    public static String m1326o(Cursor cursor, String str) {
        return m1332w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: p */
    private Drawable m1327p() {
        Drawable n = m1325n(this.f1182m.getSearchActivity());
        if (n != null) {
            return n;
        }
        return this.f1183n.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("Resource does not exist: ");
        r3.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException(r3.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1328q(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.mo1741r(r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.f1183n     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SuggestionsAdapter.m1328q(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: s */
    private Drawable m1329s(String str) {
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                StringBuilder sb = new StringBuilder();
                sb.append("android.resource://");
                sb.append(this.f1183n.getPackageName());
                sb.append("/");
                sb.append(parseInt);
                String sb2 = sb.toString();
                Drawable k = m1322k(sb2);
                if (k != null) {
                    return k;
                }
                Drawable d = ContextCompat.m1758d(this.f1183n, parseInt);
                m1320A(sb2, d);
                return d;
            } catch (NumberFormatException unused) {
                Drawable k2 = m1322k(str);
                if (k2 != null) {
                    return k2;
                }
                drawable = m1328q(Uri.parse(str));
                m1320A(str, drawable);
            } catch (NotFoundException unused2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Icon resource not found: ");
                sb3.append(str);
                Log.w("SuggestionsAdapter", sb3.toString());
                return null;
            }
        }
        return drawable;
    }

    /* renamed from: t */
    private Drawable m1330t(Cursor cursor) {
        int i = this.f1192w;
        if (i == -1) {
            return null;
        }
        Drawable s = m1329s(cursor.getString(i));
        if (s != null) {
            return s;
        }
        return m1327p();
    }

    /* renamed from: u */
    private Drawable m1331u(Cursor cursor) {
        int i = this.f1193x;
        if (i == -1) {
            return null;
        }
        return m1329s(cursor.getString(i));
    }

    /* renamed from: w */
    private static String m1332w(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: y */
    private void m1333y(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    private void m1334z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo1730a(Cursor cursor) {
        String str = "SuggestionsAdapter";
        if (this.f1186q) {
            Log.w(str, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        try {
            super.mo1730a(cursor);
            if (cursor != null) {
                this.f1189t = cursor.getColumnIndex("suggest_text_1");
                this.f1190u = cursor.getColumnIndex("suggest_text_2");
                this.f1191v = cursor.getColumnIndex("suggest_text_2_url");
                this.f1192w = cursor.getColumnIndex("suggest_icon_1");
                this.f1193x = cursor.getColumnIndex("suggest_icon_2");
                this.f1194y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e(str, "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: c */
    public CharSequence mo1731c(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String o = m1326o(cursor, "suggest_intent_query");
        if (o != null) {
            return o;
        }
        if (this.f1182m.shouldRewriteQueryFromData()) {
            String o2 = m1326o(cursor, "suggest_intent_data");
            if (o2 != null) {
                return o2;
            }
        }
        if (this.f1182m.shouldRewriteQueryFromText()) {
            String o3 = m1326o(cursor, "suggest_text_1");
            if (o3 != null) {
                return o3;
            }
        }
        return null;
    }

    /* renamed from: d */
    public Cursor mo1732d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1181l.getVisibility() == 0 && this.f1181l.getWindowVisibility() == 0) {
            try {
                Cursor v = mo1742v(this.f1182m, charSequence2, 50);
                if (v != null) {
                    v.getCount();
                    return v;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* renamed from: e */
    public void mo1733e(View view, Context context, Cursor cursor) {
        CharSequence charSequence;
        C0193a aVar = (C0193a) view.getTag();
        int i = this.f1194y;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f1195a != null) {
            m1334z(aVar.f1195a, m1332w(cursor, this.f1189t));
        }
        if (aVar.f1196b != null) {
            String w = m1332w(cursor, this.f1191v);
            if (w != null) {
                charSequence = m1323l(w);
            } else {
                charSequence = m1332w(cursor, this.f1190u);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aVar.f1195a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1195a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1195a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1195a.setMaxLines(1);
                }
            }
            m1334z(aVar.f1196b, charSequence);
        }
        ImageView imageView = aVar.f1197c;
        if (imageView != null) {
            m1333y(imageView, m1330t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1198d;
        if (imageView2 != null) {
            m1333y(imageView2, m1331u(cursor), 8);
        }
        int i3 = this.f1187r;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f1199e.setVisibility(0);
            aVar.f1199e.setTag(aVar.f1195a.getText());
            aVar.f1199e.setOnClickListener(this);
            return;
        }
        aVar.f1199e.setVisibility(8);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View g = mo5178g(this.f1183n, mo5176b(), viewGroup);
            if (g != null) {
                ((C0193a) g.getTag()).f1195a.setText(e.toString());
            }
            return g;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View h = mo1736h(this.f1183n, mo5176b(), viewGroup);
            if (h != null) {
                ((C0193a) h.getTag()).f1195a.setText(e.toString());
            }
            return h;
        }
    }

    /* renamed from: h */
    public View mo1736h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h = super.mo1736h(context, cursor, viewGroup);
        h.setTag(new C0193a(h));
        ((ImageView) h.findViewById(C0507f.f3395q)).setImageResource(this.f1185p);
        return h;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1321B(mo5176b());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1321B(mo5176b());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1181l.mo1080U((CharSequence) tag);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public Drawable mo1741r(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1183n.getPackageManager().getResourcesForApplication(authority);
                List pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt((String) pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Single path segment is not a resource ID: ");
                            sb.append(uri);
                            throw new FileNotFoundException(sb.toString());
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("More than two path segments: ");
                        sb2.append(uri);
                        throw new FileNotFoundException(sb2.toString());
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("No resource found for: ");
                    sb3.append(uri);
                    throw new FileNotFoundException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("No path: ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            } catch (NameNotFoundException unused2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("No package found for authority: ");
                sb5.append(uri);
                throw new FileNotFoundException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("No authority: ");
            sb6.append(uri);
            throw new FileNotFoundException(sb6.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public Cursor mo1742v(SearchableInfo searchableInfo, String str, int i) {
        String[] strArr = null;
        if (searchableInfo == null) {
            return null;
        }
        String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        Builder authority = new Builder().scheme("content").authority(suggestAuthority);
        String str2 = "";
        Builder fragment = authority.query(str2).fragment(str2);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1183n.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: x */
    public void mo1743x(int i) {
        this.f1187r = i;
    }
}
