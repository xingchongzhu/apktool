package p010b.p046h.p047a;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: b.h.a.b */
class CursorFilter extends Filter {

    /* renamed from: a */
    C0670a f4772a;

    /* renamed from: b.h.a.b$a */
    /* compiled from: CursorFilter */
    interface C0670a {
        /* renamed from: a */
        void mo1730a(Cursor cursor);

        /* renamed from: b */
        Cursor mo5176b();

        /* renamed from: c */
        CharSequence mo1731c(Cursor cursor);

        /* renamed from: d */
        Cursor mo1732d(CharSequence charSequence);
    }

    CursorFilter(C0670a aVar) {
        this.f4772a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f4772a.mo1731c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public FilterResults performFiltering(CharSequence charSequence) {
        Cursor d = this.f4772a.mo1732d(charSequence);
        FilterResults filterResults = new FilterResults();
        if (d != null) {
            filterResults.count = d.getCount();
            filterResults.values = d;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor b = this.f4772a.mo5176b();
        Object obj = filterResults.values;
        if (obj != null && obj != b) {
            this.f4772a.mo1730a((Cursor) obj);
        }
    }
}
