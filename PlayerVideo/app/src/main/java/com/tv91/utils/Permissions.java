package com.tv91.utils;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p295h.p296a.Timber;

/* renamed from: com.tv91.utils.f */
public final class Permissions {

    /* renamed from: a */
    private static final List<String> f16072a = Collections.emptyList();

    /* renamed from: com.tv91.utils.f$a */
    /* compiled from: Permissions */
    public static class BaseFragment extends Fragment {

        /* renamed from: d0 */
        private C3051b f16073d0;

        /* access modifiers changed from: private */
        /* renamed from: m2 */
        public void m20576m2(C3051b bVar, String... strArr) {
            this.f16073d0 = bVar;
            requestPermissions(strArr, 23);
        }

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //mo2435f2(true);
        }

        /* renamed from: d1 */
        public void mo2427d1(int i, String[] strArr, int[] iArr) {
            Permissions.m20573a(getActivity(), strArr, iArr, this.f16073d0);
        }
    }

    /* renamed from: com.tv91.utils.f$b */
    /* compiled from: Permissions */
    public interface C3051b {
        /* renamed from: i */
        void mo16467i(List<String> list, List<String> list2, List<String> list3);
    }

    /* renamed from: a */
    public static void m20573a(Activity activity, String[] strArr, int[] iArr, C3051b bVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (iArr[i] == 0) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
                if (ActivityCompat.checkSelfPermission(activity, str)!= PackageManager.PERMISSION_GRANTED) {
                    arrayList3.add(str);
                }
            }
        }
        bVar.mo16467i(arrayList, arrayList2, arrayList3);
    }

    /* renamed from: b */
    public static void m20574b(Activity activity, C3051b bVar, String... strArr) {
        if (VERSION.SDK_INT < 23) {
            List asList = Arrays.asList(strArr);
            List<String> list = f16072a;
            bVar.mo16467i(asList, list, list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) == PackageManager.PERMISSION_DENIED) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            List asList2 = Arrays.asList(strArr);
            List<String> list2 = f16072a;
            bVar.mo16467i(asList2, list2, list2);
            return;
        }
        if (activity instanceof FragmentActivity) {
            FragmentManager t = ((FragmentActivity) activity).getSupportFragmentManager();
            String str2 = "permission_fragment_tag";
            BaseFragment aVar = (BaseFragment) t.findFragmentByTag(str2);
            if (aVar == null) {
                aVar = new BaseFragment();
                t.beginTransaction().add(aVar, str2).commit();
            }
            aVar.m20576m2(bVar, strArr);
        } else {
            Timber.m24044f("Must override onRequestPermissionsResult", new Object[0]);
            activity.requestPermissions(strArr, 23);
        }
    }
}
