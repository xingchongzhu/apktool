package p010b.p062p;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b.p.s */
public class TransitionValues {

    /* renamed from: a */
    public final Map<String, Object> f5122a = new HashMap();

    /* renamed from: b */
    public View f5123b;

    /* renamed from: c */
    final ArrayList<Transition> f5124c = new ArrayList<>();

    @Deprecated
    public TransitionValues() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof TransitionValues) {
            TransitionValues sVar = (TransitionValues) obj;
            if (this.f5123b == sVar.f5123b && this.f5122a.equals(sVar.f5122a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f5123b.hashCode() * 31) + this.f5122a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionValues@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(":\n");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("    view = ");
        sb3.append(this.f5123b);
        String str = "\n";
        sb3.append(str);
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("    values:");
        String sb6 = sb5.toString();
        for (String str2 : this.f5122a.keySet()) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("    ");
            sb7.append(str2);
            sb7.append(": ");
            sb7.append(this.f5122a.get(str2));
            sb7.append(str);
            sb6 = sb7.toString();
        }
        return sb6;
    }

    public TransitionValues(View view) {
        this.f5123b = view;
    }
}
