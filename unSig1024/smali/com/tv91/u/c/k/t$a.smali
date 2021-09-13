.class public final enum Lcom/tv91/u/c/k/t$a;
.super Ljava/lang/Enum;
.source "LoadMoviesUseCase.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/c/k/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tv91/u/c/k/t$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/tv91/u/c/k/t$a;

.field public static final enum b:Lcom/tv91/u/c/k/t$a;

.field public static final enum c:Lcom/tv91/u/c/k/t$a;

.field public static final enum d:Lcom/tv91/u/c/k/t$a;

.field public static final enum e:Lcom/tv91/u/c/k/t$a;

.field public static final enum f:Lcom/tv91/u/c/k/t$a;

.field public static final enum g:Lcom/tv91/u/c/k/t$a;

.field public static final enum h:Lcom/tv91/u/c/k/t$a;

.field private static final synthetic i:[Lcom/tv91/u/c/k/t$a;


# instance fields
.field final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/tv91/u/c/k/t$a;

    const-string v1, "CHANNEL"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/tv91/u/c/k/t$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tv91/u/c/k/t$a;->a:Lcom/tv91/u/c/k/t$a;

    new-instance v1, Lcom/tv91/u/c/k/t$a;

    const-string v4, "CATEGORY"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lcom/tv91/u/c/k/t$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/tv91/u/c/k/t$a;->b:Lcom/tv91/u/c/k/t$a;

    new-instance v4, Lcom/tv91/u/c/k/t$a;

    const-string v6, "SERIES"

    const/4 v7, 0x3

    invoke-direct {v4, v6, v5, v7}, Lcom/tv91/u/c/k/t$a;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/tv91/u/c/k/t$a;->c:Lcom/tv91/u/c/k/t$a;

    new-instance v6, Lcom/tv91/u/c/k/t$a;

    const-string v8, "SUPPLIER"

    const/4 v9, 0x4

    invoke-direct {v6, v8, v7, v9}, Lcom/tv91/u/c/k/t$a;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/tv91/u/c/k/t$a;->d:Lcom/tv91/u/c/k/t$a;

    new-instance v8, Lcom/tv91/u/c/k/t$a;

    const-string v10, "ACTOR"

    const/4 v11, 0x5

    invoke-direct {v8, v10, v9, v11}, Lcom/tv91/u/c/k/t$a;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/tv91/u/c/k/t$a;->e:Lcom/tv91/u/c/k/t$a;

    new-instance v10, Lcom/tv91/u/c/k/t$a;

    const-string v12, "KEYWORD"

    invoke-direct {v10, v12, v11, v3}, Lcom/tv91/u/c/k/t$a;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lcom/tv91/u/c/k/t$a;->f:Lcom/tv91/u/c/k/t$a;

    new-instance v12, Lcom/tv91/u/c/k/t$a;

    const-string v13, "SOURCE"

    const/4 v14, 0x6

    invoke-direct {v12, v13, v14, v5}, Lcom/tv91/u/c/k/t$a;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lcom/tv91/u/c/k/t$a;->g:Lcom/tv91/u/c/k/t$a;

    new-instance v13, Lcom/tv91/u/c/k/t$a;

    const-string v15, "RANK"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14, v2}, Lcom/tv91/u/c/k/t$a;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lcom/tv91/u/c/k/t$a;->h:Lcom/tv91/u/c/k/t$a;

    const/16 v15, 0x8

    new-array v15, v15, [Lcom/tv91/u/c/k/t$a;

    aput-object v0, v15, v2

    aput-object v1, v15, v3

    aput-object v4, v15, v5

    aput-object v6, v15, v7

    aput-object v8, v15, v9

    aput-object v10, v15, v11

    const/4 v0, 0x6

    aput-object v12, v15, v0

    aput-object v13, v15, v14

    .line 2
    sput-object v15, Lcom/tv91/u/c/k/t$a;->i:[Lcom/tv91/u/c/k/t$a;

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
    iput p3, p0, Lcom/tv91/u/c/k/t$a;->j:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tv91/u/c/k/t$a;
    .locals 1

    .line 1
    const-class v0, Lcom/tv91/u/c/k/t$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tv91/u/c/k/t$a;

    return-object p0
.end method

.method public static values()[Lcom/tv91/u/c/k/t$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/u/c/k/t$a;->i:[Lcom/tv91/u/c/k/t$a;

    invoke-virtual {v0}, [Lcom/tv91/u/c/k/t$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tv91/u/c/k/t$a;

    return-object v0
.end method
