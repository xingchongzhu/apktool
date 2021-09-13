package p067c.p068a.p069a.p070a.p072b2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings.Global;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.b2.o */
public final class AudioCapabilities {

    /* renamed from: a */
    public static final AudioCapabilities f5552a = new AudioCapabilities(new int[]{2}, 8);

    /* renamed from: b */
    private static final AudioCapabilities f5553b = new AudioCapabilities(new int[]{2, 5, 6}, 8);

    /* renamed from: c */
    private final int[] f5554c;

    /* renamed from: d */
    private final int f5555d;

    public AudioCapabilities(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f5554c = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f5554c = new int[0];
        }
        this.f5555d = i;
    }

    /* renamed from: a */
    private static boolean m6642a() {
        if (Util.f8398a >= 17) {
            String str = Util.f8400c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static AudioCapabilities m6643b(Context context) {
        return m6644c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: c */
    static AudioCapabilities m6644c(Context context, Intent intent) {
        if (m6642a() && Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f5553b;
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f5552a;
        }
        return new AudioCapabilities(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    /* renamed from: d */
    public int mo5842d() {
        return this.f5555d;
    }

    /* renamed from: e */
    public boolean mo5843e(int i) {
        return Arrays.binarySearch(this.f5554c, i) >= 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities oVar = (AudioCapabilities) obj;
        if (!Arrays.equals(this.f5554c, oVar.f5554c) || this.f5555d != oVar.f5555d) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f5555d + (Arrays.hashCode(this.f5554c) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(this.f5555d);
        sb.append(", supportedEncodings=");
        sb.append(Arrays.toString(this.f5554c));
        sb.append("]");
        return sb.toString();
    }
}
