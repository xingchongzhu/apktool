package p067c.p068a.p069a.p070a.p075e2;

import com.fasterxml.jackson.core.JsonPointer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.e2.p */
final class ClearKeyUtil {
    /* renamed from: a */
    public static byte[] m7079a(byte[] bArr) {
        if (Util.f8398a >= 27) {
            return bArr;
        }
        return Util.m10290g0(m7081c(Util.m10239B(bArr)));
    }

    /* renamed from: b */
    public static byte[] m7080b(byte[] bArr) {
        if (Util.f8398a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(Util.m10239B(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(m7082d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(m7082d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return Util.m10290g0(sb.toString());
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to adjust response data: ");
            sb2.append(Util.m10239B(bArr));
            Log.m10382d("ClearKeyUtil", sb2.toString(), e);
            return bArr;
        }
    }

    /* renamed from: c */
    private static String m7081c(String str) {
        return str.replace('+', '-').replace(JsonPointer.SEPARATOR, '_');
    }

    /* renamed from: d */
    private static String m7082d(String str) {
        return str.replace('-', '+').replace('_', JsonPointer.SEPARATOR);
    }
}
