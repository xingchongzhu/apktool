package com.tv91.p252x;

import androidx.fragment.app.Fragment;
import java.util.Objects;

/* renamed from: com.tv91.x.f */
public abstract class KeyedFragment extends Fragment {
    public KeyedFragment() {
    }

    /* renamed from: l2 */
    public final <KEY extends FragmentKey> KEY mo18584l2() {
        KEY key = requireArguments().getParcelable("fragment-key-tag");
        Objects.requireNonNull(key, "The key provided as fragment argument should not be null!");
        return key;
    }

    public KeyedFragment(int i) {
        super(i);
    }
}
