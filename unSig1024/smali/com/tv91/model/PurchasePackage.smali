.class public final Lcom/tv91/model/PurchasePackage;
.super Ljava/lang/Object;
.source "PurchasePackage.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties;
    ignoreUnknown = true
.end annotation


# instance fields
.field public final day:I

.field public final download:Z

.field public final name:Ljava/lang/String;

.field public final point:I

.field public final price:D

.field public final type:Lcom/tv91/model/PurchaseType;


# direct methods
.method public constructor <init>(Lcom/tv91/model/PurchaseType;Ljava/lang/String;IIDZ)V
    .locals 0
    .param p1    # Lcom/tv91/model/PurchaseType;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "BuyTypeID"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "BuyTypeName"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "Day"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "Point"
        .end annotation
    .end param
    .param p5    # D
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "Desc"
        .end annotation
    .end param
    .param p7    # Z
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "IsDownload"
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/model/PurchasePackage;->type:Lcom/tv91/model/PurchaseType;

    .line 3
    iput-object p2, p0, Lcom/tv91/model/PurchasePackage;->name:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/tv91/model/PurchasePackage;->day:I

    .line 5
    const p4, 0x0
    iput p4, p0, Lcom/tv91/model/PurchasePackage;->point:I

    .line 6
    const p5, 0x0
    iput-wide p5, p0, Lcom/tv91/model/PurchasePackage;->price:D

    .line 7
    iput-boolean p7, p0, Lcom/tv91/model/PurchasePackage;->download:Z

    return-void
.end method

.method public static download(I)Lcom/tv91/model/PurchasePackage;
    .locals 9

    .line 1
    new-instance v8, Lcom/tv91/model/PurchasePackage;

    sget-object v1, Lcom/tv91/model/PurchaseType;->d:Lcom/tv91/model/PurchaseType;

    const-string v2, ""

    const/4 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    move-object v0, v8

    move v4, p0

    invoke-direct/range {v0 .. v7}, Lcom/tv91/model/PurchasePackage;-><init>(Lcom/tv91/model/PurchaseType;Ljava/lang/String;IIDZ)V

    return-object v8
.end method

.method public static single(I)Lcom/tv91/model/PurchasePackage;
    .locals 9

    .line 1
    new-instance v8, Lcom/tv91/model/PurchasePackage;

    sget-object v1, Lcom/tv91/model/PurchaseType;->a:Lcom/tv91/model/PurchaseType;

    const-string v2, ""

    const/4 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object v0, v8

    move v4, p0

    invoke-direct/range {v0 .. v7}, Lcom/tv91/model/PurchasePackage;-><init>(Lcom/tv91/model/PurchaseType;Ljava/lang/String;IIDZ)V

    return-object v8
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PurchasePackage{type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tv91/model/PurchasePackage;->type:Lcom/tv91/model/PurchaseType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tv91/model/PurchasePackage;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", day="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tv91/model/PurchasePackage;->day:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", point="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tv91/model/PurchasePackage;->point:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", price="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/tv91/model/PurchasePackage;->price:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", download="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/tv91/model/PurchasePackage;->download:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
