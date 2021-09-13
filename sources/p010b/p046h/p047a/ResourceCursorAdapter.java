package p010b.p046h.p047a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.h.a.c */
public abstract class ResourceCursorAdapter extends CursorAdapter {

    /* renamed from: i */
    private int f4773i;

    /* renamed from: j */
    private int f4774j;

    /* renamed from: k */
    private LayoutInflater f4775k;

    @Deprecated
    public ResourceCursorAdapter(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f4774j = i;
        this.f4773i = i;
        this.f4775k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: g */
    public View mo5178g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f4775k.inflate(this.f4774j, viewGroup, false);
    }

    /* renamed from: h */
    public View mo1736h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f4775k.inflate(this.f4773i, viewGroup, false);
    }
}
