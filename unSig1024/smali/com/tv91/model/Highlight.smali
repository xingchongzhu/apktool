.class public final Lcom/tv91/model/Highlight;
.super Ljava/lang/Object;
.source "Highlight.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties;
    ignoreUnknown = true
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/model/Highlight$Recommend;,
        Lcom/tv91/model/Highlight$Web;,
        Lcom/tv91/model/Highlight$Model;,
        Lcom/tv91/model/Highlight$Swag;,
        Lcom/tv91/model/Highlight$MovieGroup;,
        Lcom/tv91/model/Highlight$Ranking;,
        Lcom/tv91/model/Highlight$Advertise;
    }
.end annotation


# instance fields
.field public final advertise:Lcom/tv91/model/Highlight$Advertise;

.field public final groups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/Highlight$MovieGroup;",
            ">;"
        }
    .end annotation
.end field

.field public final rankingMonth:Lcom/tv91/model/Highlight$Ranking;

.field public final rankingTop:Lcom/tv91/model/Highlight$Ranking;

.field public final rankingYear:Lcom/tv91/model/Highlight$Ranking;

.field public final recommend:Lcom/tv91/model/Highlight$Recommend;

.field public final web:Lcom/tv91/model/Highlight$Web;


# direct methods
.method public constructor <init>(Lcom/tv91/model/Highlight$Advertise;Lcom/tv91/model/Highlight$Ranking;Lcom/tv91/model/Highlight$Ranking;Lcom/tv91/model/Highlight$Ranking;Ljava/util/List;Lcom/tv91/model/Highlight$Web;Lcom/tv91/model/Highlight$Recommend;)V
    .locals 0
    .param p1    # Lcom/tv91/model/Highlight$Advertise;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "Adv"
        .end annotation
    .end param
    .param p2    # Lcom/tv91/model/Highlight$Ranking;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "Ranking"
        .end annotation
    .end param
    .param p3    # Lcom/tv91/model/Highlight$Ranking;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "RankingMM"
        .end annotation
    .end param
    .param p4    # Lcom/tv91/model/Highlight$Ranking;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "RankingYY"
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "FilmList"
        .end annotation
    .end param
    .param p6    # Lcom/tv91/model/Highlight$Web;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "WebBox"
        .end annotation
    .end param
    .param p7    # Lcom/tv91/model/Highlight$Recommend;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "PushMovie"
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tv91/model/Highlight$Advertise;",
            "Lcom/tv91/model/Highlight$Ranking;",
            "Lcom/tv91/model/Highlight$Ranking;",
            "Lcom/tv91/model/Highlight$Ranking;",
            "Ljava/util/List<",
            "Lcom/tv91/model/Highlight$MovieGroup;",
            ">;",
            "Lcom/tv91/model/Highlight$Web;",
            "Lcom/tv91/model/Highlight$Recommend;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tv91/model/Highlight;->advertise:Lcom/tv91/model/Highlight$Advertise;

    .line 3
    iput-object p2, p0, Lcom/tv91/model/Highlight;->rankingTop:Lcom/tv91/model/Highlight$Ranking;

    .line 4
    iput-object p3, p0, Lcom/tv91/model/Highlight;->rankingMonth:Lcom/tv91/model/Highlight$Ranking;

    .line 5
    iput-object p4, p0, Lcom/tv91/model/Highlight;->rankingYear:Lcom/tv91/model/Highlight$Ranking;

    .line 6
    iput-object p5, p0, Lcom/tv91/model/Highlight;->groups:Ljava/util/List;

    .line 7
    iput-object p6, p0, Lcom/tv91/model/Highlight;->web:Lcom/tv91/model/Highlight$Web;

    .line 8
    iput-object p7, p0, Lcom/tv91/model/Highlight;->recommend:Lcom/tv91/model/Highlight$Recommend;

    return-void
.end method
