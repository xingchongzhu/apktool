package com.efs.sdk.base;

import android.app.Application;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.p176a.p178b.C1658a.C1660b;
import com.efs.sdk.base.p176a.p178b.C1665e;
import com.efs.sdk.base.p176a.p179c.C1670a;
import com.efs.sdk.base.p176a.p179c.p180a.C1674c;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p183e.C1691d;
import com.efs.sdk.base.p176a.p187h.C1713a;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EfsReporter {
    private static C1682a sControllerCenter;

    public static class Builder {
        private static Map<String, EfsReporter> sInstanceMap = new ConcurrentHashMap();
        private static boolean sUseAppContext = true;
        private final String TAG;
        private C1670a mGlobalEnvStruct;

        public interface IPublicParams {
            Map<String, String> getRecordHeaders();
        }

        public Builder(Application application, String str, String str2) {
            this(application.getApplicationContext(), str, str2);
        }

        private static Context checkContext(Context context) {
            String str = "efs.base";
            if (context != null) {
                if (sUseAppContext && !(context instanceof Application)) {
                    context = context.getApplicationContext();
                    if (context == null || !(context instanceof Application)) {
                        String str2 = "Can not get Application context from given context!";
                        C1728d.m14309b(str, str2, null);
                        throw new IllegalArgumentException(str2);
                    }
                }
                return context;
            }
            C1728d.m14309b(str, "context can not be null!", null);
            throw null;
        }

        private void checkParam(String str) {
            C1670a access$100 = ((EfsReporter) sInstanceMap.get(str)).getGlobalEnvStruct();
            String str2 = "efs-core: duplicate init, but ";
            if (!access$100.f11299c.equals(getGlobalEnvStruct().f11299c)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append("application context is different");
                throw new RuntimeException(sb.toString());
            } else if (!TextUtils.isEmpty(access$100.f11298b) && !access$100.f11298b.equals(getGlobalEnvStruct().f11298b)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append("secret is different");
                throw new RuntimeException(sb2.toString());
            } else if (access$100.f11305i == getGlobalEnvStruct().f11305i) {
                if (!TextUtils.isEmpty(getGlobalEnvStruct().f11304h) && !getGlobalEnvStruct().f11304h.equals(access$100.f11304h)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(" uid is different");
                    C1728d.m14308a("efs.reporter.builder", sb3.toString(), null);
                }
                if (getGlobalEnvStruct().mo9636a() != null && getGlobalEnvStruct().mo9636a().size() > 0) {
                    access$100.mo9637a(getGlobalEnvStruct().mo9636a());
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append("intl setting is different");
                throw new RuntimeException(sb4.toString());
            }
        }

        public Builder addEfsReporterObserver(IEfsReporterObserver iEfsReporterObserver) {
            C1670a aVar = this.mGlobalEnvStruct;
            if (!aVar.f11311o.contains(iEfsReporterObserver)) {
                aVar.f11311o.add(iEfsReporterObserver);
            }
            return this;
        }

        public EfsReporter build() {
            String str = getGlobalEnvStruct().f11297a;
            if (!sInstanceMap.containsKey(str)) {
                synchronized (EfsReporter.class) {
                    if (!sInstanceMap.containsKey(str)) {
                        EfsReporter efsReporter = new EfsReporter(this);
                        sInstanceMap.put(str, efsReporter);
                        return efsReporter;
                    }
                }
            }
            C1728d.m14308a("efs.reporter.builder", "efs-core: duplicate init", null);
            checkParam(str);
            return (EfsReporter) sInstanceMap.get(str);
        }

        public Builder configRefreshAction(IConfigRefreshAction iConfigRefreshAction) {
            C1674c.m14183a().f11322b = iConfigRefreshAction;
            return this;
        }

        public Builder configRefreshDelayMills(long j) {
            this.mGlobalEnvStruct.f11306j = j;
            return this;
        }

        public Builder debug(boolean z) {
            this.mGlobalEnvStruct.f11302f = z;
            return this;
        }

        public Builder efsDirRootName(String str) {
            C1713a.m14262a(str);
            return this;
        }

        public Builder enableSendLog(boolean z) {
            this.mGlobalEnvStruct.f11301e = z;
            return this;
        }

        public Builder enableWaStat(boolean z) {
            this.mGlobalEnvStruct.f11300d = z;
            return this;
        }

        public C1670a getGlobalEnvStruct() {
            return this.mGlobalEnvStruct;
        }

        public Builder intl(boolean z) {
            this.mGlobalEnvStruct.f11305i = z;
            return this;
        }

        public Builder logEncryptAction(ILogEncryptAction iLogEncryptAction) {
            this.mGlobalEnvStruct.f11309m = iLogEncryptAction;
            return this;
        }

        public Builder maxConcurrentUploadCnt(int i) {
            C1691d.m14231a().f11356a = i;
            return this;
        }

        public Builder printLogDetail(boolean z) {
            this.mGlobalEnvStruct.f11303g = z;
            return this;
        }

        public Builder publicParams(IPublicParams iPublicParams) {
            if (iPublicParams.getRecordHeaders() != null && iPublicParams.getRecordHeaders().size() > 0) {
                this.mGlobalEnvStruct.mo9637a(iPublicParams.getRecordHeaders());
            }
            return this;
        }

        public Builder uid(String str) {
            this.mGlobalEnvStruct.f11304h = str;
            return this;
        }

        public Builder(Context context, String str, String str2) {
            this.TAG = "efs.reporter.builder";
            Context checkContext = checkContext(context);
            if (TextUtils.isEmpty(str)) {
                throw new RuntimeException("EfsReporter init, appid is empty");
            } else if (!TextUtils.isEmpty(str2)) {
                C1670a aVar = new C1670a();
                this.mGlobalEnvStruct = aVar;
                aVar.f11299c = checkContext;
                aVar.f11297a = str;
                aVar.f11298b = str2;
            } else {
                throw new RuntimeException("EfsReporter init, secret is empty");
            }
        }

        public Builder publicParams(Map<String, String> map) {
            if (map.size() > 0) {
                this.mGlobalEnvStruct.mo9637a(map);
            }
            return this;
        }
    }

    /* access modifiers changed from: private */
    public C1670a getGlobalEnvStruct() {
        return C1682a.m14214a();
    }

    public void addPublicParams(Map<String, String> map) {
        if (map.size() > 0) {
            getGlobalEnvStruct().mo9637a(map);
        }
    }

    public void flushRecordLogImmediately(String str) {
        C1665e a = C1660b.f11288a.f11286c.mo9626a(1);
        if (a != null) {
            a.mo9631a(str);
        }
    }

    public Map<String, String> getAllConfig() {
        return C1674c.m14183a().mo9643c();
    }

    public void getAllSdkConfig(String[] strArr, IConfigCallback iConfigCallback) {
        C1674c a = C1674c.m14183a();
        a.f11325e.put(iConfigCallback, strArr);
        if (!a.f11324d.f11319e.isEmpty()) {
            a.mo9644d();
        }
    }

    public void refreshConfig(String str) {
        C1674c.m14183a().mo9641a(str);
    }

    public void registerCallback(int i, ValueCallback<Pair<Message, Message>> valueCallback) {
        C1670a globalEnvStruct = getGlobalEnvStruct();
        if (valueCallback != null) {
            List list = (List) globalEnvStruct.f11310n.get(Integer.valueOf(i));
            if (list == null) {
                list = new LinkedList();
                globalEnvStruct.f11310n.putIfAbsent(Integer.valueOf(i), list);
            }
            list.add(valueCallback);
        }
    }

    public void send(ILogProtocol iLogProtocol) {
        sControllerCenter.mo9654a(iLogProtocol);
    }

    public HttpResponse sendSyncImediatelly(String str, int i, String str2, File file) {
        return sendSyncImediatelly(str, i, str2, true, file);
    }

    public void setEnableRefreshConfigFromRemote(boolean z) {
        C1674c.m14183a().f11323c = z;
    }

    private EfsReporter(Builder builder) {
        sControllerCenter = new C1682a(builder);
    }

    public HttpResponse sendSyncImediatelly(String str, int i, String str2, boolean z, File file) {
        return C1682a.m14215a(str, i, str2, z, file);
    }

    public Map<String, Object> getAllSdkConfig() {
        return new HashMap(C1674c.m14183a().f11324d.f11319e);
    }
}
