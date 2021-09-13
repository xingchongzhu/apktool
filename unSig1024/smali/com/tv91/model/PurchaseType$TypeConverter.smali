.class public final Lcom/tv91/model/PurchaseType$TypeConverter;
.super Lcom/fasterxml/jackson/databind/util/StdConverter;
.source "PurchaseType.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/model/PurchaseType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TypeConverter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/util/StdConverter<",
        "Ljava/lang/Integer;",
        "Lcom/tv91/model/PurchaseType;",
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
.method public a(Ljava/lang/Integer;)Lcom/tv91/model/PurchaseType;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lcom/tv91/model/PurchaseType;->a(I)Lcom/tv91/model/PurchaseType;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/tv91/model/PurchaseType$TypeConverter;->a(Ljava/lang/Integer;)Lcom/tv91/model/PurchaseType;

    move-result-object p1

    return-object p1
.end method
