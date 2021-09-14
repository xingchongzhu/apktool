package com.tv91.p213u.p231e.p233h;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tv91.model.PromotionDetail;
import com.tv91.utils.Parcels;
import java.util.Date;

/* renamed from: com.tv91.u.e.h.a */
public final class PromotionDetailModel implements Parcelable {
    public static final Creator<PromotionDetailModel> CREATOR = new C2826a();

    /* renamed from: a */
    public String f15608a;

    /* renamed from: b */
    public Date f15609b;

    /* renamed from: c */
    public int f15610c;

    /* renamed from: com.tv91.u.e.h.a$a */
    /* compiled from: PromotionDetailModel */
    static class C2826a implements Creator<PromotionDetailModel> {
        C2826a() {
        }

        /* renamed from: a */
        public PromotionDetailModel createFromParcel(Parcel parcel) {
            return new PromotionDetailModel(parcel);
        }

        /* renamed from: b */
        public PromotionDetailModel[] newArray(int i) {
            return new PromotionDetailModel[i];
        }
    }

    public PromotionDetailModel(PromotionDetail promotionDetail) {
        this.f15608a = promotionDetail.name;
        this.f15609b = promotionDetail.date;
        this.f15610c = promotionDetail.effect;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15608a);
        Parcels.m20572d(parcel, this.f15609b);
        parcel.writeInt(this.f15610c);
    }

    protected PromotionDetailModel(Parcel parcel) {
        this.f15608a = parcel.readString();
        this.f15609b = Parcels.m20570b(parcel);
        this.f15610c = parcel.readInt();
    }
}
