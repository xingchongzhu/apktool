package p010b.p046h.p047a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.umeng.analytics.pro.Constants;

/* renamed from: b.h.a.a */
public abstract class CursorAdapter extends BaseAdapter implements Filterable, C0670a {

    /* renamed from: a */
    protected boolean f4762a;

    /* renamed from: b */
    protected boolean f4763b;

    /* renamed from: c */
    protected Cursor f4764c;

    /* renamed from: d */
    protected Context f4765d;

    /* renamed from: e */
    protected int f4766e;

    /* renamed from: f */
    protected C0668a f4767f;

    /* renamed from: g */
    protected DataSetObserver f4768g;

    /* renamed from: h */
    protected CursorFilter f4769h;

    /* renamed from: b.h.a.a$a */
    /* compiled from: CursorAdapter */
    private class C0668a extends ContentObserver {
        C0668a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            CursorAdapter.this.mo5183i();
        }
    }

    /* renamed from: b.h.a.a$b */
    /* compiled from: CursorAdapter */
    private class C0669b extends DataSetObserver {
        C0669b() {
        }

        public void onChanged() {
            CursorAdapter aVar = CursorAdapter.this;
            aVar.f4762a = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            CursorAdapter aVar = CursorAdapter.this;
            aVar.f4762a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public CursorAdapter(Context context, Cursor cursor, boolean z) {
        mo5177f(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public void mo1730a(Cursor cursor) {
        Cursor j = mo5184j(cursor);
        if (j != null) {
            j.close();
        }
    }

    /* renamed from: b */
    public Cursor mo5176b() {
        return this.f4764c;
    }

    /* renamed from: c */
    public abstract CharSequence mo1731c(Cursor cursor);

    /* renamed from: e */
    public abstract void mo1733e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo5177f(Context context, Cursor cursor, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f4763b = true;
        } else {
            this.f4763b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f4764c = cursor;
        this.f4762a = z;
        this.f4765d = context;
        this.f4766e = z ? cursor.getColumnIndexOrThrow(Constants.f16724d) : -1;
        if ((i & 2) == 2) {
            this.f4767f = new C0668a();
            this.f4768g = new C0669b();
        } else {
            this.f4767f = null;
            this.f4768g = null;
        }
        if (z) {
            C0668a aVar = this.f4767f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f4768g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo5178g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        if (this.f4762a) {
            Cursor cursor = this.f4764c;
            if (cursor != null) {
                return cursor.getCount();
            }
        }
        return 0;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f4762a) {
            return null;
        }
        this.f4764c.moveToPosition(i);
        if (view == null) {
            view = mo5178g(this.f4765d, this.f4764c, viewGroup);
        }
        mo1733e(view, this.f4765d, this.f4764c);
        return view;
    }

    public Filter getFilter() {
        if (this.f4769h == null) {
            this.f4769h = new CursorFilter(this);
        }
        return this.f4769h;
    }

    public Object getItem(int i) {
        if (this.f4762a) {
            Cursor cursor = this.f4764c;
            if (cursor != null) {
                cursor.moveToPosition(i);
                return this.f4764c;
            }
        }
        return null;
    }

    public long getItemId(int i) {
        if (this.f4762a) {
            Cursor cursor = this.f4764c;
            if (cursor != null && cursor.moveToPosition(i)) {
                return this.f4764c.getLong(this.f4766e);
            }
        }
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f4762a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f4764c.moveToPosition(i)) {
            if (view == null) {
                view = mo1736h(this.f4765d, this.f4764c, viewGroup);
            }
            mo1733e(view, this.f4765d, this.f4764c);
            return view;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("couldn't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: h */
    public abstract View mo1736h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo5183i() {
        if (this.f4763b) {
            Cursor cursor = this.f4764c;
            if (cursor != null && !cursor.isClosed()) {
                this.f4762a = this.f4764c.requery();
            }
        }
    }

    /* renamed from: j */
    public Cursor mo5184j(Cursor cursor) {
        Cursor cursor2 = this.f4764c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0668a aVar = this.f4767f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f4768g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f4764c = cursor;
        if (cursor != null) {
            C0668a aVar2 = this.f4767f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f4768g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f4766e = cursor.getColumnIndexOrThrow(Constants.f16724d);
            this.f4762a = true;
            notifyDataSetChanged();
        } else {
            this.f4766e = -1;
            this.f4762a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
