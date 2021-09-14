package com.tv91.p213u.p231e.p233h;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tv91.model.PromotionDetail;
import com.tv91.model.PromotionReport;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tv91.u.e.h.b */
public final class PromotionReportModel implements Parcelable {
    public static final Creator<PromotionReportModel> CREATOR = new C2827a();

    /* renamed from: a */
    public int f15611a;

    /* renamed from: b */
    public String f15612b;

    /* renamed from: c */
    public int f15613c;

    /* renamed from: d */
    public int f15614d;

    /* renamed from: e */
    public int f15615e;

    /* renamed from: f */
    public boolean f15616f;

    /* renamed from: g */
    public List<PromotionDetailModel> f15617g;

    /* renamed from: com.tv91.u.e.h.b$a */
    /* compiled from: PromotionReportModel */
    static class C2827a implements Creator<PromotionReportModel> {
        C2827a() {
        }

        /* renamed from: a */
        public PromotionReportModel createFromParcel(Parcel parcel) {
            return new PromotionReportModel(parcel);
        }

        /* renamed from: b */
        public PromotionReportModel[] newArray(int i) {
            return new PromotionReportModel[i];
        }
    }

    public PromotionReportModel(PromotionReport promotionReport) {
        this.f15611a = promotionReport.type;
        this.f15612b = promotionReport.name;
        this.f15613c = promotionReport.current;
        this.f15614d = promotionReport.target;
        this.f15615e = promotionReport.bonus;
        this.f15616f = promotionReport.isExchangeable();
        this.f15617g = new ArrayList();
        for (PromotionDetail aVar : promotionReport.details) {
            this.f15617g.add(new PromotionDetailModel(aVar));
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f15611a);
        parcel.writeString(this.f15612b);
        parcel.writeInt(this.f15613c);
        parcel.writeInt(this.f15614d);
        parcel.writeInt(this.f15615e);
        parcel.writeByte(this.f15616f ? (byte) 1 : 0);
        parcel.writeTypedList(this.f15617g);
    }

    protected PromotionReportModel(Parcel parcel) {
        this.f15611a = parcel.readInt();
        this.f15612b = parcel.readString();
        this.f15613c = parcel.readInt();
        this.f15614d = parcel.readInt();
        this.f15615e = parcel.readInt();
        this.f15616f = parcel.readByte() != 0;
        this.f15617g = parcel.createTypedArrayList(PromotionDetailModel.CREATOR);
    }
}
