package p010b.p062p;

import android.view.ViewGroup;

/* renamed from: b.p.l */
public class Scene {

    /* renamed from: a */
    private ViewGroup f5057a;

    /* renamed from: b */
    private Runnable f5058b;

    /* renamed from: b */
    public static Scene m6002b(ViewGroup viewGroup) {
        return (Scene) viewGroup.getTag(C0718j.transition_current_scene);
    }

    /* renamed from: c */
    static void m6003c(ViewGroup viewGroup, Scene lVar) {
        viewGroup.setTag(C0718j.transition_current_scene, lVar);
    }

    /* renamed from: a */
    public void mo5379a() {
        if (m6002b(this.f5057a) == this) {
            Runnable runnable = this.f5058b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
