package p271e.p272f0.p277i;

/* renamed from: e.f0.i.b */
public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: m */
    public final int f18242m;

    private ErrorCode(int i) {
        this.f18242m = i;
    }

    /* renamed from: a */
    public static ErrorCode m23237a(int i) {
        ErrorCode[] values;
        for (ErrorCode bVar : values()) {
            if (bVar.f18242m == i) {
                return bVar;
            }
        }
        return null;
    }
}
