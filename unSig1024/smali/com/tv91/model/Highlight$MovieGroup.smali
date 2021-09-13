.class public Lcom/tv91/model/Highlight$MovieGroup;
.super Ljava/lang/Object;
.source "Highlight.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties;
    ignoreUnknown = true
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/model/Highlight;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MovieGroup"
.end annotation


# instance fields
.field public final description:Ljava/lang/String;

.field public final hasMore:Z

.field public id:I

.field public final movies:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/Movie;",
            ">;"
        }
    .end annotation
.end field

.field public final title:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "Title"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "Desc"
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "List"
        .end annotation
    .end param
    .param p4    # Z
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "IsMore"
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/tv91/model/Movie;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/model/Highlight$MovieGroup;->title:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/tv91/model/Highlight$MovieGroup;->description:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/tv91/model/Highlight$MovieGroup;->movies:Ljava/util/List;

    .line 5
    iput-boolean p4, p0, Lcom/tv91/model/Highlight$MovieGroup;->hasMore:Z

    if-eqz p3, :cond_0

    .line 6
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 7
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/Movie;

    iget p1, p1, Lcom/tv91/model/Movie;->typeId:I

    iput p1, p0, Lcom/tv91/model/Highlight$MovieGroup;->id:I

    :cond_0
    return-void
.end method
