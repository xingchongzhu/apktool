package com.umeng.analytics.vshelper;

public class PageNameMonitor implements PageLifeCycle {
    private static String currentActivity;
    private static String currentCustomPage;
    private static Object lock = new Object();

    /* renamed from: com.umeng.analytics.vshelper.PageNameMonitor$a */
    private static class C3168a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final PageNameMonitor f17309a = new PageNameMonitor();

        private C3168a() {
        }
    }

    public static PageNameMonitor getInstance() {
        return C3168a.f17309a;
    }

    public void activityPause(String str) {
        synchronized (lock) {
            currentActivity = null;
        }
    }

    public void activityResume(String str) {
        synchronized (lock) {
            currentActivity = str;
        }
    }

    public void customPageBegin(String str) {
        synchronized (lock) {
            currentCustomPage = str;
        }
    }

    public void customPageEnd(String str) {
        synchronized (lock) {
            currentCustomPage = null;
        }
    }

    public String getCurrenPageName() {
        synchronized (lock) {
            String str = currentCustomPage;
            if (str != null) {
                return str;
            }
            String str2 = currentActivity;
            if (str2 != null) {
                return str2;
            }
            return null;
        }
    }

    private PageNameMonitor() {
    }
}
