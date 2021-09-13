package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: a */
    static final Mode f2014a = Mode.SRC_IN;

    /* renamed from: b */
    public int f2015b = -1;

    /* renamed from: c */
    Object f2016c;

    /* renamed from: d */
    public byte[] f2017d = null;

    /* renamed from: e */
    public Parcelable f2018e = null;

    /* renamed from: f */
    public int f2019f = 0;

    /* renamed from: g */
    public int f2020g = 0;

    /* renamed from: h */
    public ColorStateList f2021h = null;

    /* renamed from: i */
    Mode f2022i = f2014a;

    /* renamed from: j */
    public String f2023j = null;

    /* renamed from: k */
    public String f2024k;

    /* renamed from: b */
    private static int m1837b(Icon icon) {
        String str = "Unable to get icon resource";
        String str2 = "IconCompat";
        if (VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e(str2, str, e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e(str2, str, e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e(str2, str, e3);
            return 0;
        }
    }

    /* renamed from: e */
    private static String m1838e(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: a */
    public int mo2183a() {
        int i = this.f2015b;
        if (i == -1 && VERSION.SDK_INT >= 23) {
            return m1837b((Icon) this.f2016c);
        }
        if (i == 2) {
            return this.f2019f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResId() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public void mo2184c() {
        this.f2022i = Mode.valueOf(this.f2023j);
        switch (this.f2015b) {
            case -1:
                Parcelable parcelable = this.f2018e;
                if (parcelable != null) {
                    this.f2016c = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.f2018e;
                if (parcelable2 != null) {
                    this.f2016c = parcelable2;
                    return;
                }
                byte[] bArr = this.f2017d;
                this.f2016c = bArr;
                this.f2015b = 3;
                this.f2019f = 0;
                this.f2020g = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2017d, Charset.forName("UTF-16"));
                this.f2016c = str;
                if (this.f2015b == 2 && this.f2024k == null) {
                    this.f2024k = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2016c = this.f2017d;
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public void mo2185d(boolean z) {
        this.f2023j = this.f2022i.name();
        String str = "UTF-16";
        switch (this.f2015b) {
            case -1:
                if (!z) {
                    this.f2018e = (Parcelable) this.f2016c;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z) {
                    Bitmap bitmap = (Bitmap) this.f2016c;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f2017d = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f2018e = (Parcelable) this.f2016c;
                return;
            case 2:
                this.f2017d = ((String) this.f2016c).getBytes(Charset.forName(str));
                return;
            case 3:
                this.f2017d = (byte[]) this.f2016c;
                return;
            case 4:
            case 6:
                this.f2017d = this.f2016c.toString().getBytes(Charset.forName(str));
                return;
            default:
                return;
        }
    }

    public String toString() {
        if (this.f2015b == -1) {
            return String.valueOf(this.f2016c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m1838e(this.f2015b));
        switch (this.f2015b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2016c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2016c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2024k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(mo2183a())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2019f);
                if (this.f2020g != 0) {
                    sb.append(" off=");
                    sb.append(this.f2020g);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2016c);
                break;
        }
        if (this.f2021h != null) {
            sb.append(" tint=");
            sb.append(this.f2021h);
        }
        if (this.f2022i != f2014a) {
            sb.append(" mode=");
            sb.append(this.f2022i);
        }
        sb.append(")");
        return sb.toString();
    }
}
