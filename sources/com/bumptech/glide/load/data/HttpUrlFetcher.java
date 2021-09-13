package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.DataFetcher.C1422a;
import com.bumptech.glide.load.p156o.GlideUrl;
import com.bumptech.glide.p174t.ContentLengthInputStream;
import com.bumptech.glide.p174t.LogTime;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.load.data.j */
public class HttpUrlFetcher implements DataFetcher<InputStream> {

    /* renamed from: a */
    static final C1427b f10308a = new C1426a();

    /* renamed from: b */
    private final GlideUrl f10309b;

    /* renamed from: c */
    private final int f10310c;

    /* renamed from: d */
    private final C1427b f10311d;

    /* renamed from: e */
    private HttpURLConnection f10312e;

    /* renamed from: f */
    private InputStream f10313f;

    /* renamed from: g */
    private volatile boolean f10314g;

    /* renamed from: com.bumptech.glide.load.data.j$a */
    /* compiled from: HttpUrlFetcher */
    private static class C1426a implements C1427b {
        C1426a() {
        }

        /* renamed from: a */
        public HttpURLConnection mo8810a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.bumptech.glide.load.data.j$b */
    /* compiled from: HttpUrlFetcher */
    interface C1427b {
        /* renamed from: a */
        HttpURLConnection mo8810a(URL url) throws IOException;
    }

    public HttpUrlFetcher(GlideUrl gVar, int i) {
        this(gVar, i, f10308a);
    }

    /* renamed from: c */
    private HttpURLConnection m12529c(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection a = this.f10311d.mo8810a(url);
            for (Entry entry : map.entrySet()) {
                a.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            a.setConnectTimeout(this.f10310c);
            a.setReadTimeout(this.f10310c);
            a.setUseCaches(false);
            a.setDoInput(true);
            a.setInstanceFollowRedirects(false);
            return a;
        } catch (IOException e) {
            throw new HttpException("URL.openConnection threw", 0, e);
        }
    }

    /* renamed from: d */
    private static int m12530d(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            String str = "HttpUrlFetcher";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to get a response code", e);
            }
            return -1;
        }
    }

    /* renamed from: g */
    private InputStream m12531g(HttpURLConnection httpURLConnection) throws HttpException {
        String str = "HttpUrlFetcher";
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f10313f = ContentLengthInputStream.m14057C(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got non empty content encoding: ");
                    sb.append(httpURLConnection.getContentEncoding());
                    Log.d(str, sb.toString());
                }
                this.f10313f = httpURLConnection.getInputStream();
            }
            return this.f10313f;
        } catch (IOException e) {
            throw new HttpException("Failed to obtain InputStream", m12530d(httpURLConnection), e);
        }
    }

    /* renamed from: h */
    private static boolean m12532h(int i) {
        return i / 100 == 2;
    }

    /* renamed from: i */
    private static boolean m12533i(int i) {
        return i / 100 == 3;
    }

    /* renamed from: j */
    private InputStream m12534j(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection c = m12529c(url, map);
            this.f10312e = c;
            try {
                c.connect();
                this.f10313f = this.f10312e.getInputStream();
                if (this.f10314g) {
                    return null;
                }
                int d = m12530d(this.f10312e);
                if (m12532h(d)) {
                    return m12531g(this.f10312e);
                }
                if (m12533i(d)) {
                    String headerField = this.f10312e.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            mo8785b();
                            return m12534j(url3, i + 1, url, map);
                        } catch (MalformedURLException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Bad redirect url: ");
                            sb.append(headerField);
                            throw new HttpException(sb.toString(), d, e);
                        }
                    } else {
                        throw new HttpException("Received empty or null redirect url", d);
                    }
                } else if (d == -1) {
                    throw new HttpException(d);
                } else {
                    try {
                        throw new HttpException(this.f10312e.getResponseMessage(), d);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", d, e2);
                    }
                }
            } catch (IOException e3) {
                throw new HttpException("Failed to connect or obtain data", m12530d(this.f10312e), e3);
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
    }

    /* renamed from: a */
    public Class<InputStream> mo8780a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo8785b() {
        InputStream inputStream = this.f10313f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f10312e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f10312e = null;
    }

    public void cancel() {
        this.f10314g = true;
    }

    /* renamed from: e */
    public DataSource mo8789e() {
        return DataSource.REMOTE;
    }

    /* renamed from: f */
    public void mo8790f(Priority gVar, C1422a<? super InputStream> aVar) {
        StringBuilder sb;
        String str = "Finished http url fetcher fetch in ";
        String str2 = "HttpUrlFetcher";
        long b = LogTime.m14065b();
        try {
            aVar.mo8797d(m12534j(this.f10309b.mo9124h(), 0, null, this.f10309b.mo9123e()));
            if (Log.isLoggable(str2, 2)) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(LogTime.m14064a(b));
                Log.v(str2, sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Failed to load data for url", e);
            }
            aVar.mo8796c(e);
            if (Log.isLoggable(str2, 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable(str2, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(LogTime.m14064a(b));
                Log.v(str2, sb2.toString());
            }
            throw th;
        }
    }

    HttpUrlFetcher(GlideUrl gVar, int i, C1427b bVar) {
        this.f10309b = gVar;
        this.f10310c = i;
        this.f10311d = bVar;
    }
}
