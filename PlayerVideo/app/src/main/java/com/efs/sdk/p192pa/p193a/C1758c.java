package com.efs.sdk.p192pa.p193a;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.efs.sdk.p192pa.C1749PA;
import com.efs.sdk.p192pa.PAANRListener;
import com.efs.sdk.p192pa.PAMsgListener;

/* renamed from: com.efs.sdk.pa.a.c */
public final class C1758c implements C1749PA {

    /* renamed from: a */
    private boolean f11476a;

    /* renamed from: b */
    private Looper f11477b = Looper.myLooper();

    /* renamed from: c */
    private C1760e f11478c;

    /* renamed from: d */
    private C1761f f11479d;

    /* renamed from: e */
    private C1752a f11480e;

    /* renamed from: f */
    private C1755b f11481f = new C1755b();

    /* renamed from: g */
    private C1762g f11482g = new C1762g();

    /* renamed from: h */
    private boolean f11483h;

    /* renamed from: i */
    private boolean f11484i;

    public C1758c(boolean z) {
        this.f11484i = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a A[SYNTHETIC, Splitter:B:17:0x002a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void enableDumpToFile(String r4) {
        /*
            r3 = this;
            com.efs.sdk.pa.a.f r0 = r3.f11479d
            if (r0 == 0) goto L_0x002d
            if (r4 == 0) goto L_0x002d
            java.lang.String r1 = r4.trim()
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0011
            goto L_0x002d
        L_0x0011:
            r0.f11493c = r4
            java.io.BufferedOutputStream r1 = r0.f11494d
            if (r1 != 0) goto L_0x002d
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0027 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0027 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0025 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x0025 }
            r0.f11494d = r4     // Catch:{ Exception -> 0x0025 }
            return
        L_0x0025:
            r1 = r2
            goto L_0x0028
        L_0x0027:
        L_0x0028:
            if (r1 == 0) goto L_0x002d
            r1.close()     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.p192pa.p193a.C1758c.enableDumpToFile(java.lang.String):void");
    }

    public final void enableLog(boolean z) {
        this.f11476a = z;
        this.f11481f.f11470b = z;
        this.f11482g.f11496b = z;
        C1761f fVar = this.f11479d;
        if (fVar != null) {
            fVar.f11492b = z;
        }
    }

    public final int endCalFPS(String str) {
        if (!this.f11483h) {
            return -1;
        }
        C1755b bVar = this.f11481f;
        int i = 0;
        if (!(str == null || str.trim().length() == 0)) {
            C1756a aVar = (C1756a) bVar.f11469a.get(str);
            if (aVar == null) {
                return 0;
            }
            View view = aVar.f11474d;
            if (!(view == null || aVar.f11473c == null)) {
                view.getViewTreeObserver().removeOnPreDrawListener(aVar.f11473c);
            }
            bVar.f11469a.remove(str);
            int currentTimeMillis = (int) (((float) aVar.f11472b) / (((float) (System.currentTimeMillis() - aVar.f11471a)) / 1000.0f));
            if (currentTimeMillis > 0) {
                i = currentTimeMillis;
            }
            if (bVar.f11470b) {
                StringBuilder sb = new StringBuilder("key=");
                sb.append(str);
                sb.append(",fps=");
                sb.append(i);
                Log.e("PerformanceAnalyze", sb.toString());
            }
        }
        return i;
    }

    public final long endCalTime(String str) {
        if (!this.f11483h) {
            return -1;
        }
        C1762g gVar = this.f11482g;
        long j = 0;
        if (!(str == null || str.trim().length() == 0)) {
            C1763a aVar = (C1763a) gVar.f11495a.get(str);
            if (aVar == null) {
                return 0;
            }
            gVar.f11495a.remove(str);
            j = System.currentTimeMillis() - aVar.f11497a;
            if (gVar.f11496b) {
                StringBuilder sb = new StringBuilder("key=");
                sb.append(str);
                sb.append(",consumeTime=");
                sb.append(j);
                Log.e("PerformanceAnalyze", sb.toString());
            }
        }
        return j;
    }

    public final void registerPAANRListener(Context context, PAANRListener pAANRListener) {
        registerPAANRListener(context, pAANRListener, 2000);
    }

    public final void registerPAMsgListener(PAMsgListener pAMsgListener) {
        if (this.f11478c == null) {
            this.f11478c = new C1760e();
        }
        this.f11477b.setMessageLogging(this.f11478c);
        if (this.f11479d == null) {
            this.f11479d = new C1761f();
        }
        C1761f fVar = this.f11479d;
        fVar.f11492b = this.f11476a;
        fVar.f11491a = pAMsgListener;
        this.f11478c.f11485a.add(fVar);
    }

    public final void start() {
        if (this.f11484i) {
            this.f11483h = true;
            C1760e eVar = this.f11478c;
            if (eVar != null) {
                this.f11477b.setMessageLogging(eVar);
            }
            C1752a aVar = this.f11480e;
            if (aVar != null && aVar.f11456f) {
                aVar.f11456f = false;
                aVar.f11457g.post(aVar.f11463m);
                aVar.f11460j = SystemClock.uptimeMillis();
            }
        }
    }

    public final void startCalFPS(String str, View view) {
        if (this.f11483h) {
            C1755b bVar = this.f11481f;
            if (!(str == null || str.trim().length() == 0 || view == null || bVar.f11469a.get(str) != null)) {
                C1756a aVar = new C1756a(0);
                aVar.f11474d = view;
                C17571 r6 = new OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        C1756a.this.f11472b++;
                        return true;
                    }
                };
                aVar.f11473c = r6;
                aVar.f11474d.getViewTreeObserver().addOnPreDrawListener(r6);
                aVar.f11471a = System.currentTimeMillis();
                bVar.f11469a.put(str, aVar);
            }
        }
    }

    public final void startCalTime(String str) {
        if (this.f11483h) {
            C1762g gVar = this.f11482g;
            if (!(str == null || str.trim().length() == 0 || gVar.f11495a.get(str) != null)) {
                C1763a aVar = new C1763a(0);
                aVar.f11497a = System.currentTimeMillis();
                gVar.f11495a.put(str, aVar);
            }
        }
    }

    public final void stop() {
        this.f11483h = false;
        this.f11477b.setMessageLogging(null);
        C1752a aVar = this.f11480e;
        if (aVar != null) {
            aVar.f11456f = true;
            aVar.f11457g.removeCallbacksAndMessages(null);
            aVar.f11451a = true;
        }
    }

    public final void unRegisterPAMsgListener() {
        C1761f fVar = this.f11479d;
        if (fVar != null) {
            fVar.f11491a = null;
        }
        C1760e eVar = this.f11478c;
        if (eVar != null) {
            eVar.f11485a.remove(fVar);
        }
    }

    public final void unregisterPAANRListener() {
    }

    public final void registerPAANRListener(Context context, PAANRListener pAANRListener, long j) {
        registerPAANRListener(context, pAANRListener, j, Looper.getMainLooper().getThread());
    }

    public final void registerPAANRListener(Context context, PAANRListener pAANRListener, long j, Thread thread) {
        if (this.f11480e == null) {
            if (thread != null) {
                this.f11480e = new C1752a((Application) context.getApplicationContext(), j);
            } else {
                this.f11480e = new C1752a((Application) context.getApplicationContext(), j, false);
            }
        }
        this.f11480e.f11458h = pAANRListener;
    }
}
