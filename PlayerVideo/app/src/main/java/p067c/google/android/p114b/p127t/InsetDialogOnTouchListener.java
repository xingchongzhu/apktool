package p067c.google.android.p114b.p127t;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

/* renamed from: c.a.a.b.t.a */
public class InsetDialogOnTouchListener implements OnTouchListener {

    /* renamed from: a */
    private final Dialog f9692a;

    /* renamed from: b */
    private final int f9693b;

    /* renamed from: c */
    private final int f9694c;

    /* renamed from: d */
    private final int f9695d;

    public InsetDialogOnTouchListener(Dialog dialog, Rect rect) {
        this.f9692a = dialog;
        this.f9693b = rect.left;
        this.f9694c = rect.top;
        this.f9695d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f9693b + findViewById.getLeft();
        int top = this.f9694c + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) (findViewById.getWidth() + left), (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f9695d;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f9692a.onTouchEvent(obtain);
    }
}
