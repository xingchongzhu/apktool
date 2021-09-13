package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.fragment.app.c0 */
final class LogWriter extends Writer {

    /* renamed from: a */
    private final String f2299a;

    /* renamed from: b */
    private StringBuilder f2300b = new StringBuilder(128);

    LogWriter(String str) {
        this.f2299a = str;
    }

    /* renamed from: B */
    private void m2251B() {
        if (this.f2300b.length() > 0) {
            Log.d(this.f2299a, this.f2300b.toString());
            StringBuilder sb = this.f2300b;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m2251B();
    }

    public void flush() {
        m2251B();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m2251B();
            } else {
                this.f2300b.append(c);
            }
        }
    }
}
