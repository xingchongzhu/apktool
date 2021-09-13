package com.bumptech.glide;

import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.p170r.p172k.NoTransition;
import com.bumptech.glide.p170r.p172k.TransitionFactory;

/* renamed from: com.bumptech.glide.l */
public abstract class TransitionOptions<CHILD extends TransitionOptions<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a */
    private TransitionFactory<? super TranscodeType> f10275a = NoTransition.m14039b();

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (TransitionOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final TransitionFactory<? super TranscodeType> mo8766b() {
        return this.f10275a;
    }
}
