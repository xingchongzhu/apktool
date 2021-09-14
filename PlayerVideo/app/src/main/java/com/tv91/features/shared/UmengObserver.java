package com.tv91.features.shared;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.C0377b;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.umeng.analytics.MobclickAgent;
import p295h.p296a.Timber;

public final class UmengObserver implements LifecycleObserver {

    /* renamed from: a */
    private final String f13959a;

    public UmengObserver(String str) {
        this.f13959a = str;
    }

    @OnLifecycleEvent(C0377b.ON_PAUSE)
    public void onPause(LifecycleOwner iVar) {
        if (iVar instanceof ComponentActivity) {
            MobclickAgent.onPause((ComponentActivity) iVar);
        } else if (iVar instanceof Fragment) {
            MobclickAgent.onPageEnd(this.f13959a);
        }
    }

    @OnLifecycleEvent(C0377b.ON_RESUME)
    public void onResume(LifecycleOwner iVar) {
        Timber.m24039a("UMENG analysis for %s in %s", this.f13959a, iVar.getClass().getSimpleName());
        if (iVar instanceof ComponentActivity) {
            MobclickAgent.onResume((ComponentActivity) iVar);
        } else if (iVar instanceof Fragment) {
            MobclickAgent.onPageStart(this.f13959a);
        }
    }
}
