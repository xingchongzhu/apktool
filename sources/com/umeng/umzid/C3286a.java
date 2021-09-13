package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.security.SecureRandom;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

/* renamed from: com.umeng.umzid.a */
public class C3286a {

    /* renamed from: com.umeng.umzid.a$a */
    public static class C3287a implements HostnameVerifier {
        public boolean verify(String str, SSLSession sSLSession) {
            return !TextUtils.isEmpty(str) && ("aaid.umeng.com".equalsIgnoreCase(str) || "pre-aaid.umeng.com".equalsIgnoreCase(str));
        }
    }

    /* renamed from: a */
    public static SharedPreferences m22873a(Context context) {
        if (context != null) {
            return context.getSharedPreferences("umzid_general_config", 0);
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized String m22874a(String str, String str2) {
        synchronized (C3286a.class) {
            try {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                httpsURLConnection.setHostnameVerifier(new C3287a());
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init(null, null, new SecureRandom());
                httpsURLConnection.setSSLSocketFactory(instance.getSocketFactory());
                httpsURLConnection.setRequestProperty("Content-Type", "application/json");
                httpsURLConnection.setConnectTimeout(30000);
                httpsURLConnection.setReadTimeout(30000);
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setDoInput(true);
                OutputStream outputStream = httpsURLConnection.getOutputStream();
                outputStream.write(str2.getBytes());
                outputStream.flush();
                outputStream.close();
                if (httpsURLConnection.getResponseCode() == 200) {
                    InputStreamReader inputStreamReader = new InputStreamReader(httpsURLConnection.getInputStream());
                    StringBuffer stringBuffer = new StringBuffer();
                    while (true) {
                        int read = inputStreamReader.read();
                        if (read != -1) {
                            stringBuffer.append((char) read);
                        } else {
                            String stringBuffer2 = stringBuffer.toString();
                            return stringBuffer2;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
