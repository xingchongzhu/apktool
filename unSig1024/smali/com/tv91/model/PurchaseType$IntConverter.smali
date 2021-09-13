.class public final Lcom/tv91/model/PurchaseType$IntConverter;
.super Lcom/fasterxml/jackson/databind/util/StdConverter;
.source "PurchaseType.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/model/PurchaseType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IntConverter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/util/StdConverter<",
        "Lcom/tv91/model/PurchaseType;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/util/StdConverter;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/tv91/model/PurchaseType;)Ljava/lang/Integer;
    .locals 0

    .line 1
    iget p1, p1, Lcom/tv91/model/PurchaseType;->h:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/model/PurchaseType;

    invoke-virtual {p0, p1}, Lcom/tv91/model/PurchaseType$IntConverter;->a(Lcom/tv91/model/PurchaseType;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
