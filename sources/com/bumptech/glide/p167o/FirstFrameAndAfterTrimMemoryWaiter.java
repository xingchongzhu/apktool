package com.bumptech.glide.p167o;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: com.bumptech.glide.o.i */
final class FirstFrameAndAfterTrimMemoryWaiter implements FrameWaiter, ComponentCallbacks2 {
    FirstFrameAndAfterTrimMemoryWaiter() {
    }

    /* renamed from: a */
    public void mo9375a(Activity activity) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        onTrimMemory(20);
    }

    public void onTrimMemory(int i) {
    }
}
