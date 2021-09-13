package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.C0212b;
import p010b.p026e.p030b.p031k.ConstraintWidget.C0561b;

/* renamed from: androidx.constraintlayout.widget.g */
public class Placeholder extends View {

    /* renamed from: a */
    private int f1566a;

    /* renamed from: b */
    private View f1567b;

    /* renamed from: c */
    private int f1568c;

    /* renamed from: a */
    public void mo1993a(ConstraintLayout constraintLayout) {
        if (this.f1567b != null) {
            C0212b bVar = (C0212b) getLayoutParams();
            C0212b bVar2 = (C0212b) this.f1567b.getLayoutParams();
            bVar2.f1388n0.mo4696T0(0);
            C0561b y = bVar.f1388n0.mo4747y();
            C0561b bVar3 = C0561b.FIXED;
            if (y != bVar3) {
                bVar.f1388n0.mo4698U0(bVar2.f1388n0.mo4691R());
            }
            if (bVar.f1388n0.mo4685O() != bVar3) {
                bVar.f1388n0.mo4742v0(bVar2.f1388n0.mo4741v());
            }
            bVar2.f1388n0.mo4696T0(8);
        }
    }

    /* renamed from: b */
    public void mo1994b(ConstraintLayout constraintLayout) {
        if (this.f1566a == -1 && !isInEditMode()) {
            setVisibility(this.f1568c);
        }
        View findViewById = constraintLayout.findViewById(this.f1566a);
        this.f1567b = findViewById;
        if (findViewById != null) {
            ((C0212b) findViewById.getLayoutParams()).f1364b0 = true;
            this.f1567b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1567b;
    }

    public int getEmptyVisibility() {
        return this.f1568c;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Align.LEFT);
            String str = "?";
            paint.getTextBounds(str, 0, 1, rect);
            canvas.drawText(str, ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        if (this.f1566a != i) {
            View view = this.f1567b;
            if (view != null) {
                view.setVisibility(0);
                ((C0212b) this.f1567b.getLayoutParams()).f1364b0 = false;
                this.f1567b = null;
            }
            this.f1566a = i;
            if (i != -1) {
                View findViewById = ((View) getParent()).findViewById(i);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f1568c = i;
    }
}
