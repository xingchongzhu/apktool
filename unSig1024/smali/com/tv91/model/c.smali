.class public final enum Lcom/tv91/model/c;
.super Ljava/lang/Enum;
.source "RankType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tv91/model/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/tv91/model/c;

.field public static final enum b:Lcom/tv91/model/c;

.field public static final enum c:Lcom/tv91/model/c;

.field private static final synthetic d:[Lcom/tv91/model/c;


# instance fields
.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/tv91/model/c;

    const-string v1, "DAY"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/tv91/model/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tv91/model/c;->a:Lcom/tv91/model/c;

    new-instance v1, Lcom/tv91/model/c;

    const-string v4, "MONTH"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lcom/tv91/model/c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/tv91/model/c;->b:Lcom/tv91/model/c;

    new-instance v4, Lcom/tv91/model/c;

    const-string v6, "YEAR"

    const/4 v7, 0x3

    invoke-direct {v4, v6, v5, v7}, Lcom/tv91/model/c;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/tv91/model/c;->c:Lcom/tv91/model/c;

    new-array v6, v7, [Lcom/tv91/model/c;

    aput-object v0, v6, v2

    aput-object v1, v6, v3

    aput-object v4, v6, v5

    .line 2
    sput-object v6, Lcom/tv91/model/c;->d:[Lcom/tv91/model/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lcom/tv91/model/c;->e:I

    return-void
.end method

.method public static a(I)Lcom/tv91/model/c;
    .locals 1

    .line 1
    invoke-static {}, Lcom/tv91/model/c;->values()[Lcom/tv91/model/c;

    move-result-object v0

    aget-object p0, v0, p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tv91/model/c;
    .locals 1

    .line 1
    const-class v0, Lcom/tv91/model/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tv91/model/c;

    return-object p0
.end method

.method public static values()[Lcom/tv91/model/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/model/c;->d:[Lcom/tv91/model/c;

    invoke-virtual {v0}, [Lcom/tv91/model/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tv91/model/c;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method
