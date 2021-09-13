package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.c */
public class ConstraintLayoutStates {

    /* renamed from: a */
    private final ConstraintLayout f1436a;

    /* renamed from: b */
    int f1437b = -1;

    /* renamed from: c */
    int f1438c = -1;

    /* renamed from: d */
    private SparseArray<C0217a> f1439d = new SparseArray<>();

    /* renamed from: e */
    private SparseArray<ConstraintSet> f1440e = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* compiled from: ConstraintLayoutStates */
    static class C0217a {

        /* renamed from: a */
        int f1441a;

        /* renamed from: b */
        ArrayList<C0218b> f1442b = new ArrayList<>();

        /* renamed from: c */
        int f1443c = -1;

        /* renamed from: d */
        ConstraintSet f1444d;

        public C0217a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0226i.f1604F4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0226i.f1610G4) {
                    this.f1441a = obtainStyledAttributes.getResourceId(index, this.f1441a);
                } else if (index == C0226i.f1616H4) {
                    this.f1443c = obtainStyledAttributes.getResourceId(index, this.f1443c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1443c);
                    context.getResources().getResourceName(this.f1443c);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet dVar = new ConstraintSet();
                        this.f1444d = dVar;
                        dVar.mo1969f(context, this.f1443c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1965a(C0218b bVar) {
            this.f1442b.add(bVar);
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$b */
    /* compiled from: ConstraintLayoutStates */
    static class C0218b {

        /* renamed from: a */
        float f1445a = Float.NaN;

        /* renamed from: b */
        float f1446b = Float.NaN;

        /* renamed from: c */
        float f1447c = Float.NaN;

        /* renamed from: d */
        float f1448d = Float.NaN;

        /* renamed from: e */
        int f1449e = -1;

        /* renamed from: f */
        ConstraintSet f1450f;

        public C0218b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0226i.f1738b5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0226i.f1745c5) {
                    this.f1449e = obtainStyledAttributes.getResourceId(index, this.f1449e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1449e);
                    context.getResources().getResourceName(this.f1449e);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet dVar = new ConstraintSet();
                        this.f1450f = dVar;
                        dVar.mo1969f(context, this.f1449e);
                    }
                } else if (index == C0226i.f1752d5) {
                    this.f1448d = obtainStyledAttributes.getDimension(index, this.f1448d);
                } else if (index == C0226i.f1759e5) {
                    this.f1446b = obtainStyledAttributes.getDimension(index, this.f1446b);
                } else if (index == C0226i.f1766f5) {
                    this.f1447c = obtainStyledAttributes.getDimension(index, this.f1447c);
                } else if (index == C0226i.f1773g5) {
                    this.f1445a = obtainStyledAttributes.getDimension(index, this.f1445a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i) {
        this.f1436a = constraintLayout;
        m1545a(context, i);
    }

    /* renamed from: a */
    private void m1545a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        C0217a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (!(c == 0 || c == 1)) {
                        if (c == 2) {
                            aVar = new C0217a(context, xml);
                            this.f1439d.put(aVar.f1441a, aVar);
                        } else if (c == 3) {
                            C0218b bVar = new C0218b(context, xml);
                            if (aVar != null) {
                                aVar.mo1965a(bVar);
                            }
                        } else if (c != 4) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("unknown tag ");
                            sb.append(name);
                            Log.v("ConstraintLayoutStates", sb.toString());
                        } else {
                            m1546b(context, xml);
                        }
                    }
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m1546b(Context context, XmlPullParser xmlPullParser) {
        int i;
        ConstraintSet dVar = new ConstraintSet();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String str = "id";
            if (str.equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), str, context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue.length() > 1) {
                        i = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.mo1974n(context, xmlPullParser);
                this.f1440e.put(i, dVar);
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo1964c(ConstraintsChangedListener fVar) {
    }
}
