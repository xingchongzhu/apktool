.class public final enum Lcom/tv91/u/h/c;
.super Ljava/lang/Enum;
.source "HistoryScreen.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tv91/u/h/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/tv91/u/h/c;

.field public static final enum b:Lcom/tv91/u/h/c;

.field public static final enum c:Lcom/tv91/u/h/c;

.field private static final synthetic d:[Lcom/tv91/u/h/c;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/tv91/u/h/c;

    const-string v1, "PURCHASE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/tv91/u/h/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tv91/u/h/c;->a:Lcom/tv91/u/h/c;

    new-instance v1, Lcom/tv91/u/h/c;

    const-string v3, "PURCHASE_EXTERNAL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/tv91/u/h/c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/tv91/u/h/c;->b:Lcom/tv91/u/h/c;

    new-instance v3, Lcom/tv91/u/h/c;

    const-string v5, "PAYMENT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/tv91/u/h/c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/tv91/u/h/c;->c:Lcom/tv91/u/h/c;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/tv91/u/h/c;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 2
    sput-object v5, Lcom/tv91/u/h/c;->d:[Lcom/tv91/u/h/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tv91/u/h/c;
    .locals 1

    .line 1
    const-class v0, Lcom/tv91/u/h/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tv91/u/h/c;

    return-object p0
.end method

.method public static values()[Lcom/tv91/u/h/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/u/h/c;->d:[Lcom/tv91/u/h/c;

    invoke-virtual {v0}, [Lcom/tv91/u/h/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tv91/u/h/c;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/u/h/c;->a:Lcom/tv91/u/h/c;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/tv91/u/h/c;->b:Lcom/tv91/u/h/c;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
