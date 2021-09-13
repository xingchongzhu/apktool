package p067c.p068a.p069a.p114b.p117c0;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C2053k;

/* renamed from: c.a.a.b.c0.h */
public class MaterialShapeUtils {
    /* renamed from: a */
    static CornerTreatment m11333a(int i) {
        if (i == 0) {
            return new RoundedCornerTreatment();
        }
        if (i != 1) {
            return m11334b();
        }
        return new CutCornerTreatment();
    }

    /* renamed from: b */
    static CornerTreatment m11334b() {
        return new RoundedCornerTreatment();
    }

    /* renamed from: c */
    static EdgeTreatment m11335c() {
        return new EdgeTreatment();
    }

    /* renamed from: d */
    public static void m11336d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).mo7842W(f);
        }
    }

    /* renamed from: e */
    public static void m11337e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            m11338f(view, (MaterialShapeDrawable) background);
        }
    }

    /* renamed from: f */
    public static void m11338f(View view, MaterialShapeDrawable gVar) {
        if (gVar.mo7837O()) {
            gVar.mo7846a0(C2053k.m16232c(view));
        }
    }
}
