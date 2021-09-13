package p067c.p068a.p069a.p114b.p119m;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: c.a.a.b.m.i */
public class MotionTiming {

    /* renamed from: a */
    private long f9626a = 0;

    /* renamed from: b */
    private long f9627b = 300;

    /* renamed from: c */
    private TimeInterpolator f9628c = null;

    /* renamed from: d */
    private int f9629d = 0;

    /* renamed from: e */
    private int f9630e = 1;

    public MotionTiming(long j, long j2) {
        this.f9626a = j;
        this.f9627b = j2;
    }

    /* renamed from: b */
    static MotionTiming m11493b(ValueAnimator valueAnimator) {
        MotionTiming iVar = new MotionTiming(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m11494f(valueAnimator));
        iVar.f9629d = valueAnimator.getRepeatCount();
        iVar.f9630e = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: f */
    private static TimeInterpolator m11494f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return AnimationUtils.f9612b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return AnimationUtils.f9613c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            interpolator = AnimationUtils.f9614d;
        }
        return interpolator;
    }

    /* renamed from: a */
    public void mo7965a(Animator animator) {
        animator.setStartDelay(mo7966c());
        animator.setDuration(mo7967d());
        animator.setInterpolator(mo7968e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo7970g());
            valueAnimator.setRepeatMode(mo7971h());
        }
    }

    /* renamed from: c */
    public long mo7966c() {
        return this.f9626a;
    }

    /* renamed from: d */
    public long mo7967d() {
        return this.f9627b;
    }

    /* renamed from: e */
    public TimeInterpolator mo7968e() {
        TimeInterpolator timeInterpolator = this.f9628c;
        return timeInterpolator != null ? timeInterpolator : AnimationUtils.f9612b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionTiming)) {
            return false;
        }
        MotionTiming iVar = (MotionTiming) obj;
        if (mo7966c() == iVar.mo7966c() && mo7967d() == iVar.mo7967d() && mo7970g() == iVar.mo7970g() && mo7971h() == iVar.mo7971h()) {
            return mo7968e().getClass().equals(iVar.mo7968e().getClass());
        }
        return false;
    }

    /* renamed from: g */
    public int mo7970g() {
        return this.f9629d;
    }

    /* renamed from: h */
    public int mo7971h() {
        return this.f9630e;
    }

    public int hashCode() {
        return (((((((((int) (mo7966c() ^ (mo7966c() >>> 32))) * 31) + ((int) (mo7967d() ^ (mo7967d() >>> 32)))) * 31) + mo7968e().getClass().hashCode()) * 31) + mo7970g()) * 31) + mo7971h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(MotionTiming.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(mo7966c());
        sb.append(" duration: ");
        sb.append(mo7967d());
        sb.append(" interpolator: ");
        sb.append(mo7968e().getClass());
        sb.append(" repeatCount: ");
        sb.append(mo7970g());
        sb.append(" repeatMode: ");
        sb.append(mo7971h());
        sb.append("}\n");
        return sb.toString();
    }

    public MotionTiming(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f9626a = j;
        this.f9627b = j2;
        this.f9628c = timeInterpolator;
    }
}
