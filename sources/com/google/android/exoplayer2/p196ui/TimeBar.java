package com.google.android.exoplayer2.p196ui;

/* renamed from: com.google.android.exoplayer2.ui.u */
public interface TimeBar {

    /* renamed from: com.google.android.exoplayer2.ui.u$a */
    /* compiled from: TimeBar */
    public interface C1884a {
        /* renamed from: a */
        void mo14847a(TimeBar uVar, long j);

        /* renamed from: b */
        void mo14848b(TimeBar uVar, long j);

        /* renamed from: d */
        void mo14849d(TimeBar uVar, long j, boolean z);
    }

    /* renamed from: a */
    void mo14704a(long[] jArr, boolean[] zArr, int i);

    /* renamed from: b */
    void mo14705b(C1884a aVar);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
