.class public final enum Lcom/tv91/u/a/h;
.super Ljava/lang/Enum;
.source "Dashboard.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tv91/u/a/h;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/tv91/u/a/h;

.field public static final enum b:Lcom/tv91/u/a/h;

.field public static final enum c:Lcom/tv91/u/a/h;

.field public static final enum d:Lcom/tv91/u/a/h;

.field public static final enum e:Lcom/tv91/u/a/h;

.field private static final synthetic f:[Lcom/tv91/u/a/h;


# instance fields
.field public final g:I

.field public final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lcom/tv91/u/a/h;

    const-string v1, "HOME"

    const/4 v2, 0x0

    const v3, 0x7f0a0061

    const v4, 0x7f0800d9

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/tv91/u/a/h;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/tv91/u/a/h;->a:Lcom/tv91/u/a/h;

    .line 2
    new-instance v1, Lcom/tv91/u/a/h;

    const-string v3, "CATEGORY"

    const/4 v4, 0x1

    const v5, 0x7f0a0060

    const v6, 0x7f0800f4

    invoke-direct {v1, v3, v4, v5, v6}, Lcom/tv91/u/a/h;-><init>(Ljava/lang/String;III)V

    sput-object v1, Lcom/tv91/u/a/h;->b:Lcom/tv91/u/a/h;

    .line 3
    new-instance v3, Lcom/tv91/u/a/h;

    const-string v5, "ACTOR"

    const/4 v6, 0x2

    const v7, 0x7f0a005f

    const v8, 0x7f0800f6

    invoke-direct {v3, v5, v6, v7, v8}, Lcom/tv91/u/a/h;-><init>(Ljava/lang/String;III)V

    sput-object v3, Lcom/tv91/u/a/h;->c:Lcom/tv91/u/a/h;

    .line 4
    new-instance v5, Lcom/tv91/u/a/h;

    const-string v7, "PROMOTION"

    const/4 v8, 0x3

    const v9, 0x7f0a0063

    const v10, 0x7f0800ee

    invoke-direct {v5, v7, v8, v9, v10}, Lcom/tv91/u/a/h;-><init>(Ljava/lang/String;III)V

    sput-object v5, Lcom/tv91/u/a/h;->d:Lcom/tv91/u/a/h;

    .line 5
    new-instance v7, Lcom/tv91/u/a/h;

    const-string v9, "PROFILE"

    const/4 v10, 0x4

    const v11, 0x7f0a0062

    const v12, 0x7f0800f1

    invoke-direct {v7, v9, v10, v11, v12}, Lcom/tv91/u/a/h;-><init>(Ljava/lang/String;III)V

    sput-object v7, Lcom/tv91/u/a/h;->e:Lcom/tv91/u/a/h;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/tv91/u/a/h;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    .line 6
    sput-object v9, Lcom/tv91/u/a/h;->f:[Lcom/tv91/u/a/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lcom/tv91/u/a/h;->g:I

    .line 3
    iput p4, p0, Lcom/tv91/u/a/h;->h:I

    return-void
.end method

.method public static a(I)Lcom/tv91/u/a/h;
    .locals 5

    .line 1
    invoke-static {}, Lcom/tv91/u/a/h;->values()[Lcom/tv91/u/a/h;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    iget v4, v3, Lcom/tv91/u/a/h;->g:I

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

    const-string v2, "unknown id "

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

.method public static valueOf(Ljava/lang/String;)Lcom/tv91/u/a/h;
    .locals 1

    .line 1
    const-class v0, Lcom/tv91/u/a/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tv91/u/a/h;

    return-object p0
.end method

.method public static values()[Lcom/tv91/u/a/h;
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/u/a/h;->f:[Lcom/tv91/u/a/h;

    invoke-virtual {v0}, [Lcom/tv91/u/a/h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tv91/u/a/h;

    return-object v0
.end method
