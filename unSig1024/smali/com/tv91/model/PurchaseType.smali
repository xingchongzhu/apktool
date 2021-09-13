.class public final enum Lcom/tv91/model/PurchaseType;
.super Ljava/lang/Enum;
.source "PurchaseType.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
    converter = Lcom/tv91/model/PurchaseType$TypeConverter;
.end annotation

.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
    converter = Lcom/tv91/model/PurchaseType$IntConverter;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/model/PurchaseType$IntConverter;,
        Lcom/tv91/model/PurchaseType$TypeConverter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tv91/model/PurchaseType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/tv91/model/PurchaseType;

.field public static final enum b:Lcom/tv91/model/PurchaseType;

.field public static final enum c:Lcom/tv91/model/PurchaseType;

.field public static final enum d:Lcom/tv91/model/PurchaseType;

.field public static final enum e:Lcom/tv91/model/PurchaseType;

.field public static final enum f:Lcom/tv91/model/PurchaseType;

.field private static final synthetic g:[Lcom/tv91/model/PurchaseType;


# instance fields
.field public final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Lcom/tv91/model/PurchaseType;

    const-string v1, "SINGLE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/tv91/model/PurchaseType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tv91/model/PurchaseType;->a:Lcom/tv91/model/PurchaseType;

    .line 2
    new-instance v1, Lcom/tv91/model/PurchaseType;

    const-string v4, "WEEK"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lcom/tv91/model/PurchaseType;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/tv91/model/PurchaseType;->b:Lcom/tv91/model/PurchaseType;

    .line 3
    new-instance v4, Lcom/tv91/model/PurchaseType;

    const-string v6, "MONTH"

    const/4 v7, 0x3

    invoke-direct {v4, v6, v5, v7}, Lcom/tv91/model/PurchaseType;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/tv91/model/PurchaseType;->c:Lcom/tv91/model/PurchaseType;

    .line 4
    new-instance v6, Lcom/tv91/model/PurchaseType;

    const-string v8, "DOWNLOAD"

    const/4 v9, 0x4

    invoke-direct {v6, v8, v7, v9}, Lcom/tv91/model/PurchaseType;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/tv91/model/PurchaseType;->d:Lcom/tv91/model/PurchaseType;

    .line 5
    new-instance v8, Lcom/tv91/model/PurchaseType;

    const-string v10, "SEASON"

    const/4 v11, 0x5

    invoke-direct {v8, v10, v9, v11}, Lcom/tv91/model/PurchaseType;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/tv91/model/PurchaseType;->e:Lcom/tv91/model/PurchaseType;

    .line 6
    new-instance v10, Lcom/tv91/model/PurchaseType;

    const-string v12, "YEAR"

    const/4 v13, 0x6

    invoke-direct {v10, v12, v11, v13}, Lcom/tv91/model/PurchaseType;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lcom/tv91/model/PurchaseType;->f:Lcom/tv91/model/PurchaseType;

    new-array v12, v13, [Lcom/tv91/model/PurchaseType;

    aput-object v0, v12, v2

    aput-object v1, v12, v3

    aput-object v4, v12, v5

    aput-object v6, v12, v7

    aput-object v8, v12, v9

    aput-object v10, v12, v11

    .line 7
    sput-object v12, Lcom/tv91/model/PurchaseType;->g:[Lcom/tv91/model/PurchaseType;

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
    iput p3, p0, Lcom/tv91/model/PurchaseType;->h:I

    return-void
.end method

.method public static a(I)Lcom/tv91/model/PurchaseType;
    .locals 5

    .line 1
    invoke-static {}, Lcom/tv91/model/PurchaseType;->values()[Lcom/tv91/model/PurchaseType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    iget v4, v3, Lcom/tv91/model/PurchaseType;->h:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 3
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown id "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tv91/model/PurchaseType;
    .locals 1

    .line 1
    const-class v0, Lcom/tv91/model/PurchaseType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tv91/model/PurchaseType;

    return-object p0
.end method

.method public static values()[Lcom/tv91/model/PurchaseType;
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/model/PurchaseType;->g:[Lcom/tv91/model/PurchaseType;

    invoke-virtual {v0}, [Lcom/tv91/model/PurchaseType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tv91/model/PurchaseType;

    return-object v0
.end method
