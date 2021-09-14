package com.tv91.p213u.p237f.p239d;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tv91.model.Feedback;
import com.tv91.utils.Parcels;
import java.util.Date;

/* renamed from: com.tv91.u.f.d.a */
public final class FeedbackModel implements Parcelable {
    public static final Creator<FeedbackModel> CREATOR = new C2894a();

    /* renamed from: a */
    public String f15748a;

    /* renamed from: b */
    public String f15749b;

    /* renamed from: c */
    public Date f15750c;

    /* renamed from: d */
    public String f15751d;

    /* renamed from: e */
    public Date f15752e;

    /* renamed from: com.tv91.u.f.d.a$a */
    /* compiled from: FeedbackModel */
    static class C2894a implements Creator<FeedbackModel> {
        C2894a() {
        }

        /* renamed from: a */
        public FeedbackModel createFromParcel(Parcel parcel) {
            return new FeedbackModel(parcel);
        }

        /* renamed from: b */
        public FeedbackModel[] newArray(int i) {
            return new FeedbackModel[i];
        }
    }

    public FeedbackModel() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15748a);
        parcel.writeString(this.f15749b);
        Parcels.m20572d(parcel, this.f15750c);
        parcel.writeString(this.f15751d);
        Parcels.m20572d(parcel, this.f15752e);
    }

    public FeedbackModel(Feedback feedback) {
        this.f15748a = feedback.f14081id;
        this.f15749b = feedback.content;
        this.f15750c = feedback.date;
        this.f15751d = feedback.replyContent;
        this.f15752e = feedback.replyDate;
    }

    protected FeedbackModel(Parcel parcel) {
        this.f15748a = parcel.readString();
        this.f15749b = parcel.readString();
        this.f15750c = Parcels.m20570b(parcel);
        this.f15751d = parcel.readString();
        this.f15752e = Parcels.m20570b(parcel);
    }
}
