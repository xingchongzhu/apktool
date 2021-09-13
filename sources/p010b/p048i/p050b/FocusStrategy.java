package p010b.p048i.p050b;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: b.i.b.b */
class FocusStrategy {

    /* renamed from: b.i.b.b$a */
    /* compiled from: FocusStrategy */
    public interface C0676a<T> {
        /* renamed from: a */
        void mo5218a(T t, Rect rect);
    }

    /* renamed from: b.i.b.b$b */
    /* compiled from: FocusStrategy */
    public interface C0677b<T, V> {
        /* renamed from: a */
        V mo5220a(T t, int i);

        /* renamed from: b */
        int mo5221b(T t);
    }

    /* renamed from: b.i.b.b$c */
    /* compiled from: FocusStrategy */
    private static class C0678c<T> implements Comparator<T> {

        /* renamed from: a */
        private final Rect f4792a = new Rect();

        /* renamed from: b */
        private final Rect f4793b = new Rect();

        /* renamed from: c */
        private final boolean f4794c;

        /* renamed from: d */
        private final C0676a<T> f4795d;

        C0678c(boolean z, C0676a<T> aVar) {
            this.f4794c = z;
            this.f4795d = aVar;
        }

        public int compare(T t, T t2) {
            Rect rect = this.f4792a;
            Rect rect2 = this.f4793b;
            this.f4795d.mo5218a(t, rect);
            this.f4795d.mo5218a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            int i3 = -1;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i4 = rect.left;
            int i5 = rect2.left;
            if (i4 < i5) {
                if (this.f4794c) {
                    i3 = 1;
                }
                return i3;
            } else if (i4 > i5) {
                if (!this.f4794c) {
                    i3 = 1;
                }
                return i3;
            } else {
                int i6 = rect.bottom;
                int i7 = rect2.bottom;
                if (i6 < i7) {
                    return -1;
                }
                if (i6 > i7) {
                    return 1;
                }
                int i8 = rect.right;
                int i9 = rect2.right;
                if (i8 < i9) {
                    if (this.f4794c) {
                        i3 = 1;
                    }
                    return i3;
                } else if (i8 <= i9) {
                    return 0;
                } else {
                    if (!this.f4794c) {
                        i3 = 1;
                    }
                    return i3;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m5725a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean b = m5726b(i, rect, rect2);
        boolean z = false;
        if (m5726b(i, rect, rect3) || !b) {
            return false;
        }
        if (!m5734j(i, rect, rect3) || i == 17 || i == 66) {
            return true;
        }
        if (m5735k(i, rect, rect2) < m5737m(i, rect, rect3)) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private static boolean m5726b(int i, Rect rect, Rect rect2) {
        boolean z = true;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                z = false;
            }
            return z;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public static <L, T> T m5727c(L l, C0677b<L, T> bVar, C0676a<T> aVar, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t2 = null;
        int b = bVar.mo5221b(l);
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < b; i2++) {
            T a = bVar.mo5220a(l, i2);
            if (a != t) {
                aVar.mo5218a(a, rect3);
                if (m5732h(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = a;
                }
            }
        }
        return t2;
    }

    /* renamed from: d */
    public static <L, T> T m5728d(L l, C0677b<L, T> bVar, C0676a<T> aVar, T t, int i, boolean z, boolean z2) {
        int b = bVar.mo5221b(l);
        ArrayList arrayList = new ArrayList(b);
        for (int i2 = 0; i2 < b; i2++) {
            arrayList.add(bVar.mo5220a(l, i2));
        }
        Collections.sort(arrayList, new C0678c(z, aVar));
        if (i == 1) {
            return m5730f(t, arrayList, z2);
        }
        if (i == 2) {
            return m5729e(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: e */
    private static <T> T m5729e(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = -1;
        } else {
            i = arrayList.lastIndexOf(t);
        }
        int i2 = i + 1;
        if (i2 < size) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    private static <T> T m5730f(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = size;
        } else {
            i = arrayList.indexOf(t);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    private static int m5731g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: h */
    private static boolean m5732h(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean z = false;
        if (!m5733i(rect, rect2, i)) {
            return false;
        }
        if (!m5733i(rect, rect3, i) || m5725a(i, rect, rect2, rect3)) {
            return true;
        }
        if (m5725a(i, rect, rect3, rect2)) {
            return false;
        }
        if (m5731g(m5735k(i, rect, rect2), m5739o(i, rect, rect2)) < m5731g(m5735k(i, rect, rect3), m5739o(i, rect, rect3))) {
            z = true;
        }
        return z;
    }

    /* renamed from: i */
    private static boolean m5733i(Rect rect, Rect rect2, int i) {
        boolean z = true;
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 <= i3 && rect.left < i3) || rect.left <= rect2.left) {
                z = false;
            }
            return z;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 <= i5 && rect.top < i5) || rect.top <= rect2.top) {
                z = false;
            }
            return z;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 >= i7 && rect.right > i7) || rect.right >= rect2.right) {
                z = false;
            }
            return z;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 >= i9 && rect.bottom > i9) || rect.bottom >= rect2.bottom) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: j */
    private static boolean m5734j(int i, Rect rect, Rect rect2) {
        boolean z = true;
        if (i == 17) {
            if (rect.left < rect2.right) {
                z = false;
            }
            return z;
        } else if (i == 33) {
            if (rect.top < rect2.bottom) {
                z = false;
            }
            return z;
        } else if (i == 66) {
            if (rect.right > rect2.left) {
                z = false;
            }
            return z;
        } else if (i == 130) {
            if (rect.bottom > rect2.top) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: k */
    private static int m5735k(int i, Rect rect, Rect rect2) {
        return Math.max(0, m5736l(i, rect, rect2));
    }

    /* renamed from: l */
    private static int m5736l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: m */
    private static int m5737m(int i, Rect rect, Rect rect2) {
        return Math.max(1, m5738n(i, rect, rect2));
    }

    /* renamed from: n */
    private static int m5738n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: o */
    private static int m5739o(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
