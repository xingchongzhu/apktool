.class public final Lc/a/a/a/d2/a;
.super Ljava/lang/Object;
.source "DeviceInfo.java"


# static fields
.field public static final a:Lc/a/a/a/d2/a;


# instance fields
.field public final b:I

.field public final c:I

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc/a/a/a/d2/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Lc/a/a/a/d2/a;-><init>(III)V

    sput-object v0, Lc/a/a/a/d2/a;->a:Lc/a/a/a/d2/a;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lc/a/a/a/d2/a;->b:I

    .line 3
    iput p2, p0, Lc/a/a/a/d2/a;->c:I

    .line 4
    iput p3, p0, Lc/a/a/a/d2/a;->d:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lc/a/a/a/d2/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Lc/a/a/a/d2/a;

    .line 3
    iget v1, p0, Lc/a/a/a/d2/a;->b:I

    iget v3, p1, Lc/a/a/a/d2/a;->b:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Lc/a/a/a/d2/a;->c:I

    iget v3, p1, Lc/a/a/a/d2/a;->c:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Lc/a/a/a/d2/a;->d:I

    iget p1, p1, Lc/a/a/a/d2/a;->d:I

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lc/a/a/a/d2/a;->b:I

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 2
    iget v0, p0, Lc/a/a/a/d2/a;->c:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 3
    iget v0, p0, Lc/a/a/a/d2/a;->d:I

    add-int/2addr v1, v0

    return v1
.end method
