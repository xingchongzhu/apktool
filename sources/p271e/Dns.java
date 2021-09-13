package p271e;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: e.o */
public interface Dns {

    /* renamed from: a */
    public static final Dns f18612a = new C3365a();

    /* renamed from: e.o$a */
    /* compiled from: Dns */
    class C3365a implements Dns {
        C3365a() {
        }

        /* renamed from: a */
        public List<InetAddress> mo20020a(String str) throws UnknownHostException {
            if (str != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(str));
                } catch (NullPointerException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Broken system behaviour for dns lookup of ");
                    sb.append(str);
                    UnknownHostException unknownHostException = new UnknownHostException(sb.toString());
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            } else {
                throw new UnknownHostException("hostname == null");
            }
        }
    }

    /* renamed from: a */
    List<InetAddress> mo20020a(String str) throws UnknownHostException;
}
