package com.umeng.analytics.process;

import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DBFileTraversalUtil {

    /* renamed from: a */
    private static ExecutorService f17267a = Executors.newSingleThreadExecutor();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static FileLockUtil f17268b = new FileLockUtil();

    /* renamed from: com.umeng.analytics.process.DBFileTraversalUtil$a */
    public interface C3161a {
        /* renamed from: a */
        void mo19199a();
    }

    public static void traverseDBFiles(String str, final FileLockCallback fileLockCallback, final C3161a aVar) {
        final File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            f17267a.execute(new Runnable() {
                public void run() {
                    File[] listFiles;
                    String str = UMRTLog.RTLOG_TAG;
                    try {
                        for (File file : file.listFiles()) {
                            if (file.getName().endsWith(DBConstant.f17290d)) {
                                DBFileTraversalUtil.f17268b.doFileOperateion(file, fileLockCallback);
                                StringBuilder sb = new StringBuilder();
                                sb.append("--->>> file: ");
                                sb.append(file.getName());
                                UMRTLog.m22229i(str, sb.toString());
                            }
                        }
                        C3161a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo19199a();
                        }
                    } catch (Throwable unused) {
                    }
                    UMRTLog.m22229i(str, "--->>> end *** ");
                }
            });
        }
    }
}
