.class public final Lc/a/a/a/h2/o/g;
.super Lc/a/a/a/h2/o/b;
.source "TimeSignalCommand.java"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc/a/a/a/h2/o/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/a/h2/o/g$a;

    invoke-direct {v0}, Lc/a/a/a/h2/o/g$a;-><init>()V

    sput-object v0, Lc/a/a/a/h2/o/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(JJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lc/a/a/a/h2/o/b;-><init>()V

    .line 3
    iput-wide p1, p0, Lc/a/a/a/h2/o/g;->a:J

    .line 4
    iput-wide p3, p0, Lc/a/a/a/h2/o/g;->b:J

    return-void
.end method

.method synthetic constructor <init>(JJLc/a/a/a/h2/o/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lc/a/a/a/h2/o/g;-><init>(JJ)V

    return-void
.end method

.method static l(Lc/a/a/a/m2/a0;JLc/a/a/a/m2/j0;)Lc/a/a/a/h2/o/g;
    .locals 1

    .line 1
    invoke-static {p0, p1, p2}, Lc/a/a/a/h2/o/g;->m(Lc/a/a/a/m2/a0;J)J

    move-result-wide p0

    .line 2
    invoke-virtual {p3, p0, p1}, Lc/a/a/a/m2/j0;->b(J)J

    move-result-wide p2

    .line 3
    new-instance v0, Lc/a/a/a/h2/o/g;

    invoke-direct {v0, p0, p1, p2, p3}, Lc/a/a/a/h2/o/g;-><init>(JJ)V

    return-object v0
.end method

.method static m(Lc/a/a/a/m2/a0;J)J
    .locals 7

    .line 1
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->D()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x80

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    const-wide/16 v2, 0x1

    and-long/2addr v0, v2

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    .line 2
    invoke-virtual {p0}, Lc/a/a/a/m2/a0;->F()J

    move-result-wide v2

    or-long/2addr v0, v2

    add-long/2addr v0, p1

    const-wide p0, 0x1ffffffffL

    and-long/2addr p0, v0

    goto :goto_0

    :cond_0
    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    return-wide p0
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/h2/o/g;->a:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 2
    iget-wide v0, p0, Lc/a/a/a/h2/o/g;->b:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
