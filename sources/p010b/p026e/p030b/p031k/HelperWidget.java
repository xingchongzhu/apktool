package p010b.p026e.p030b.p031k;

import java.util.ArrayList;
import java.util.Arrays;
import p010b.p026e.p030b.p031k.p032m.Grouping;
import p010b.p026e.p030b.p031k.p032m.WidgetGroup;

/* renamed from: b.e.b.k.i */
public class HelperWidget extends ConstraintWidget implements Helper {

    /* renamed from: D0 */
    public ConstraintWidget[] f4246D0 = new ConstraintWidget[4];

    /* renamed from: E0 */
    public int f4247E0 = 0;

    /* renamed from: a */
    public void mo4786a(ConstraintWidget eVar) {
        if (eVar != this && eVar != null) {
            int i = this.f4247E0 + 1;
            ConstraintWidget[] eVarArr = this.f4246D0;
            if (i > eVarArr.length) {
                this.f4246D0 = (ConstraintWidget[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            ConstraintWidget[] eVarArr2 = this.f4246D0;
            int i2 = this.f4247E0;
            eVarArr2[i2] = eVar;
            this.f4247E0 = i2 + 1;
        }
    }

    /* renamed from: a1 */
    public void mo4789a1(ArrayList<WidgetGroup> arrayList, int i, WidgetGroup oVar) {
        for (int i2 = 0; i2 < this.f4247E0; i2++) {
            oVar.mo4825a(this.f4246D0[i2]);
        }
        for (int i3 = 0; i3 < this.f4247E0; i3++) {
            Grouping.m4908a(this.f4246D0[i3], i, arrayList, oVar);
        }
    }

    /* renamed from: b */
    public void mo4787b(ConstraintWidgetContainer fVar) {
    }

    /* renamed from: b1 */
    public int mo4790b1(int i) {
        for (int i2 = 0; i2 < this.f4247E0; i2++) {
            ConstraintWidget eVar = this.f4246D0[i2];
            if (i == 0) {
                int i3 = eVar.f4125B0;
                if (i3 != -1) {
                    return i3;
                }
            }
            if (i == 1) {
                int i4 = eVar.f4127C0;
                if (i4 != -1) {
                    return i4;
                }
            }
        }
        return -1;
    }

    /* renamed from: c */
    public void mo4788c() {
        this.f4247E0 = 0;
        Arrays.fill(this.f4246D0, null);
    }
}
