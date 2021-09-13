package p067c.p068a.p069a.p114b.p120n;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: c.a.a.b.n.b */
public class BadgeUtils {

    /* renamed from: a */
    public static final boolean f9667a = (VERSION.SDK_INT < 18);

    /* renamed from: a */
    public static void m11549a(BadgeDrawable aVar, View view, FrameLayout frameLayout) {
        m11551c(aVar, view, frameLayout);
        if (aVar.mo7983h() != null) {
            aVar.mo7983h().setForeground(aVar);
        } else if (!f9667a) {
            view.getOverlay().add(aVar);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    /* renamed from: b */
    public static void m11550b(BadgeDrawable aVar, View view) {
        if (aVar != null) {
            if (f9667a || aVar.mo7983h() != null) {
                aVar.mo7983h().setForeground(null);
            } else {
                view.getOverlay().remove(aVar);
            }
        }
    }

    /* renamed from: c */
    public static void m11551c(BadgeDrawable aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.mo7998y(view, frameLayout);
    }

    /* renamed from: d */
    public static void m11552d(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
