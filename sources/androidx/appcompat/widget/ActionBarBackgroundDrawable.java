package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
class ActionBarBackgroundDrawable extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f941a;

    public ActionBarBackgroundDrawable(ActionBarContainer actionBarContainer) {
        this.f941a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f941a;
        if (actionBarContainer.f696h) {
            Drawable drawable = actionBarContainer.f695g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f693e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f941a;
        Drawable drawable3 = actionBarContainer2.f694f;
        if (drawable3 != null && actionBarContainer2.f697i) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f941a;
        if (actionBarContainer.f696h) {
            Drawable drawable = actionBarContainer.f695g;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f693e;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
