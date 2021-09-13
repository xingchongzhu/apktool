package com.tv91.p252x;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Objects;

/* renamed from: com.tv91.x.e */
public abstract class KeyedActivity extends AppCompatActivity {
    /* renamed from: M */
    public final <KEY extends ActivityKey> KEY mo18583M() {
        KEY key = (ActivityKey) getIntent().getParcelableExtra("activity-key-extra");
        Objects.requireNonNull(key, "The key provided as activity argument should never null!");
        return key;
    }
}
