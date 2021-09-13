.class final enum Lcom/tv91/u/c/i/e0$e;
.super Ljava/lang/Enum;
.source "MoviesView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/c/i/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tv91/u/c/i/e0$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/tv91/u/c/i/e0$e;

.field public static final enum b:Lcom/tv91/u/c/i/e0$e;

.field private static final synthetic c:[Lcom/tv91/u/c/i/e0$e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/tv91/u/c/i/e0$e;

    const-string v1, "LARGE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/tv91/u/c/i/e0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tv91/u/c/i/e0$e;->a:Lcom/tv91/u/c/i/e0$e;

    new-instance v1, Lcom/tv91/u/c/i/e0$e;

    const-string v3, "NORMAL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/tv91/u/c/i/e0$e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/tv91/u/c/i/e0$e;->b:Lcom/tv91/u/c/i/e0$e;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/tv91/u/c/i/e0$e;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 2
    sput-object v3, Lcom/tv91/u/c/i/e0$e;->c:[Lcom/tv91/u/c/i/e0$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tv91/u/c/i/e0$e;
    .locals 1

    .line 1
    const-class v0, Lcom/tv91/u/c/i/e0$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tv91/u/c/i/e0$e;

    return-object p0
.end method

.method public static values()[Lcom/tv91/u/c/i/e0$e;
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/u/c/i/e0$e;->c:[Lcom/tv91/u/c/i/e0$e;

    invoke-virtual {v0}, [Lcom/tv91/u/c/i/e0$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tv91/u/c/i/e0$e;

    return-object v0
.end method
