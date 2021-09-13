package com.umeng.analytics.pro;

import com.umeng.analytics.pro.TBase;
import com.umeng.analytics.pro.TFieldIdEnum;
import java.io.Serializable;

/* renamed from: com.umeng.analytics.pro.aq */
public interface TBase<T extends TBase<?, ?>, F extends TFieldIdEnum> extends Serializable {
    void clear();

    TBase<T, F> deepCopy();

    F fieldForId(int i);

    void read(TProtocol bpVar) throws TException;

    void write(TProtocol bpVar) throws TException;
}
