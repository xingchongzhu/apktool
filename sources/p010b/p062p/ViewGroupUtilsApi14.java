package p010b.p062p;

import android.animation.LayoutTransition;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.p.y */
class ViewGroupUtilsApi14 {

    /* renamed from: a */
    private static LayoutTransition f5131a;

    /* renamed from: b */
    private static Field f5132b;

    /* renamed from: c */
    private static boolean f5133c;

    /* renamed from: d */
    private static Method f5134d;

    /* renamed from: e */
    private static boolean f5135e;

    /* renamed from: b.p.y$a */
    /* compiled from: ViewGroupUtilsApi14 */
    static class C0733a extends LayoutTransition {
        C0733a() {
        }

        public boolean isChangingLayout() {
            return true;
        }
    }

    /* renamed from: a */
    private static void m6124a(LayoutTransition layoutTransition) {
        String str = "Failed to access cancel method by reflection";
        String str2 = "ViewGroupUtilsApi14";
        if (!f5135e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f5134d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i(str2, str);
            }
            f5135e = true;
        }
        Method method = f5134d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i(str2, str);
            } catch (InvocationTargetException unused3) {
                Log.i(str2, "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m6125b(android.view.ViewGroup r5, boolean r6) {
        /*
            android.animation.LayoutTransition r0 = f5131a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x0028
            b.p.y$a r0 = new b.p.y$a
            r0.<init>()
            f5131a = r0
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = f5131a
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = f5131a
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = f5131a
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = f5131a
            r4 = 4
            r0.setAnimator(r4, r3)
        L_0x0028:
            if (r6 == 0) goto L_0x0048
            android.animation.LayoutTransition r6 = r5.getLayoutTransition()
            if (r6 == 0) goto L_0x0042
            boolean r0 = r6.isRunning()
            if (r0 == 0) goto L_0x0039
            m6124a(r6)
        L_0x0039:
            android.animation.LayoutTransition r0 = f5131a
            if (r6 == r0) goto L_0x0042
            int r0 = p010b.p062p.C0718j.transition_layout_save
            r5.setTag(r0, r6)
        L_0x0042:
            android.animation.LayoutTransition r6 = f5131a
            r5.setLayoutTransition(r6)
            goto L_0x0094
        L_0x0048:
            r5.setLayoutTransition(r3)
            boolean r6 = f5133c
            java.lang.String r0 = "ViewGroupUtilsApi14"
            if (r6 != 0) goto L_0x0066
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r4 = "mLayoutSuppressed"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch:{ NoSuchFieldException -> 0x005f }
            f5132b = r6     // Catch:{ NoSuchFieldException -> 0x005f }
            r6.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x005f }
            goto L_0x0064
        L_0x005f:
            java.lang.String r6 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L_0x0064:
            f5133c = r1
        L_0x0066:
            java.lang.reflect.Field r6 = f5132b
            if (r6 == 0) goto L_0x007f
            boolean r6 = r6.getBoolean(r5)     // Catch:{ IllegalAccessException -> 0x007a }
            if (r6 == 0) goto L_0x0078
            java.lang.reflect.Field r1 = f5132b     // Catch:{ IllegalAccessException -> 0x0076 }
            r1.setBoolean(r5, r2)     // Catch:{ IllegalAccessException -> 0x0076 }
            goto L_0x0078
        L_0x0076:
            r2 = r6
            goto L_0x007a
        L_0x0078:
            r2 = r6
            goto L_0x007f
        L_0x007a:
            java.lang.String r6 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L_0x007f:
            if (r2 == 0) goto L_0x0084
            r5.requestLayout()
        L_0x0084:
            int r6 = p010b.p062p.C0718j.transition_layout_save
            java.lang.Object r0 = r5.getTag(r6)
            android.animation.LayoutTransition r0 = (android.animation.LayoutTransition) r0
            if (r0 == 0) goto L_0x0094
            r5.setTag(r6, r3)
            r5.setLayoutTransition(r0)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p062p.ViewGroupUtilsApi14.m6125b(android.view.ViewGroup, boolean):void");
    }
}
