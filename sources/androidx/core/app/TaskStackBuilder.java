package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.i */
public final class TaskStackBuilder implements Iterable<Intent> {

    /* renamed from: a */
    private final ArrayList<Intent> f1980a = new ArrayList<>();

    /* renamed from: b */
    private final Context f1981b;

    /* renamed from: androidx.core.app.i$a */
    /* compiled from: TaskStackBuilder */
    public interface C0248a {
        /* renamed from: k */
        Intent mo307k();
    }

    private TaskStackBuilder(Context context) {
        this.f1981b = context;
    }

    /* renamed from: e */
    public static TaskStackBuilder m1736e(Context context) {
        return new TaskStackBuilder(context);
    }

    /* renamed from: b */
    public TaskStackBuilder mo2144b(Intent intent) {
        this.f1980a.add(intent);
        return this;
    }

    /* renamed from: c */
    public TaskStackBuilder mo2145c(Activity activity) {
        Intent k = activity instanceof C0248a ? ((C0248a) activity).mo307k() : null;
        if (k == null) {
            k = NavUtils.m1730a(activity);
        }
        if (k != null) {
            ComponentName component = k.getComponent();
            if (component == null) {
                component = k.resolveActivity(this.f1981b.getPackageManager());
            }
            mo2146d(component);
            mo2144b(k);
        }
        return this;
    }

    /* renamed from: d */
    public TaskStackBuilder mo2146d(ComponentName componentName) {
        int size = this.f1980a.size();
        try {
            Intent b = NavUtils.m1731b(this.f1981b, componentName);
            while (b != null) {
                this.f1980a.add(size, b);
                b = NavUtils.m1731b(this.f1981b, b.getComponent());
            }
            return this;
        } catch (NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: f */
    public void mo2147f() {
        mo2148g(null);
    }

    /* renamed from: g */
    public void mo2148g(Bundle bundle) {
        if (!this.f1980a.isEmpty()) {
            ArrayList<Intent> arrayList = this.f1980a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!ContextCompat.m1763i(this.f1981b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f1981b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1980a.iterator();
    }
}
