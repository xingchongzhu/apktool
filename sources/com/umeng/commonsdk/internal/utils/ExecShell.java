package com.umeng.commonsdk.internal.utils;

import android.os.Build.VERSION;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/* renamed from: com.umeng.commonsdk.internal.utils.e */
public class ExecShell {

    /* renamed from: com.umeng.commonsdk.internal.utils.e$a */
    /* compiled from: ExecShell */
    public enum C3208a {
        check_su_binary(new String[]{"/system/xbin/which", "su"});
        

        /* renamed from: b */
        String[] f17578b;

        private C3208a(String[] strArr) {
            this.f17578b = strArr;
        }
    }

    /* renamed from: a */
    public ArrayList mo19268a(C3208a aVar) {
        ArrayList arrayList = new ArrayList();
        if (VERSION.SDK_INT > 28) {
            return arrayList;
        }
        try {
            Process exec = Runtime.getRuntime().exec(aVar.f17578b);
            new BufferedWriter(new OutputStreamWriter(exec.getOutputStream()));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    arrayList.add(readLine);
                } catch (Exception unused) {
                }
            }
            return arrayList;
        } catch (Exception unused2) {
            return null;
        }
    }
}
