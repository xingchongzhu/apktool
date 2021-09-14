package p067c.google.android.p114b.p119m;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p010b.p025d.SimpleArrayMap;

/* renamed from: c.a.a.b.m.h */
public class MotionSpec {

    /* renamed from: a */
    private final SimpleArrayMap<String, MotionTiming> f9624a = new SimpleArrayMap<>();

    /* renamed from: b */
    private final SimpleArrayMap<String, PropertyValuesHolder[]> f9625b = new SimpleArrayMap<>();

    /* renamed from: a */
    private static void m11484a(MotionSpec hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.mo7961h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.mo7963i(objectAnimator.getPropertyName(), MotionTiming.m11493b(objectAnimator));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Animator must be an ObjectAnimator: ");
        sb.append(animator);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static MotionSpec m11485b(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return m11486c(context, resourceId);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static MotionSpec m11486c(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m11487d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m11487d(arrayList);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            Log.w("MotionSpec", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: d */
    private static MotionSpec m11487d(List<Animator> list) {
        MotionSpec hVar = new MotionSpec();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m11484a(hVar, (Animator) list.get(i));
        }
        return hVar;
    }

    /* renamed from: e */
    public MotionTiming mo7957e(String str) {
        if (mo7960g(str)) {
            return (MotionTiming) this.f9624a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionSpec)) {
            return false;
        }
        return this.f9624a.equals(((MotionSpec) obj).f9624a);
    }

    /* renamed from: f */
    public long mo7959f() {
        int size = this.f9624a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            MotionTiming iVar = (MotionTiming) this.f9624a.mo4513m(i);
            j = Math.max(j, iVar.mo7966c() + iVar.mo7967d());
        }
        return j;
    }

    /* renamed from: g */
    public boolean mo7960g(String str) {
        return this.f9624a.get(str) != null;
    }

    /* renamed from: h */
    public void mo7961h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f9625b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f9624a.hashCode();
    }

    /* renamed from: i */
    public void mo7963i(String str, MotionTiming iVar) {
        this.f9624a.put(str, iVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(MotionSpec.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.f9624a);
        sb.append("}\n");
        return sb.toString();
    }
}
