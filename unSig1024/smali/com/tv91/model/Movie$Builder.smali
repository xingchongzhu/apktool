.class public Lcom/tv91/model/Movie$Builder;
.super Ljava/lang/Object;
.source "Movie.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties;
    ignoreUnknown = true
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/model/Movie;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private actors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/Actor;",
            ">;"
        }
    .end annotation
.end field

.field private categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/Category;",
            ">;"
        }
    .end annotation
.end field

.field private channel:Lcom/tv91/model/Channel;

.field private createTime:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private download:I

.field private duration:Ljava/lang/String;

.field private extension:Ljava/lang/String;

.field private favorite:Z

.field private favoriteCount:I

.field private fileSize:J

.field private id:I

.field private image:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private playCount:I

.field private point:I

.field private poster:Ljava/lang/String;

.field private resolution:Ljava/lang/String;

.field private screenshot:Ljava/lang/String;

.field private series:Lcom/tv91/model/Series;

.field private sourceId:I

.field private supplier:Lcom/tv91/model/Supplier;

.field private type:I

.field private typeId:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/tv91/model/Movie$Builder;->sourceId:I

    .line 3
    iput v0, p0, Lcom/tv91/model/Movie$Builder;->typeId:I

    return-void
.end method

.method public constructor <init>(Lcom/tv91/model/Movie;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lcom/tv91/model/Movie$Builder;->sourceId:I

    .line 6
    iput v0, p0, Lcom/tv91/model/Movie$Builder;->typeId:I

    .line 7
    iget v0, p1, Lcom/tv91/model/Movie;->id:I

    iput v0, p0, Lcom/tv91/model/Movie$Builder;->id:I

    .line 8
    iget-object v0, p1, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/model/Movie$Builder;->name:Ljava/lang/String;

    .line 9
    iget-object v0, p1, Lcom/tv91/model/Movie;->description:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/model/Movie$Builder;->description:Ljava/lang/String;

    .line 10
    iget-object v0, p1, Lcom/tv91/model/Movie;->createTime:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/model/Movie$Builder;->createTime:Ljava/lang/String;

    .line 11
    iget-object v0, p1, Lcom/tv91/model/Movie;->image:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/model/Movie$Builder;->image:Ljava/lang/String;

    .line 12
    iget-object v0, p1, Lcom/tv91/model/Movie;->poster:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/model/Movie$Builder;->poster:Ljava/lang/String;

    .line 13
    iget-object v0, p1, Lcom/tv91/model/Movie;->screenshot:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/model/Movie$Builder;->screenshot:Ljava/lang/String;

    .line 14
    iget-object v0, p1, Lcom/tv91/model/Movie;->duration:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/model/Movie$Builder;->duration:Ljava/lang/String;

    .line 15
    iget-wide v0, p1, Lcom/tv91/model/Movie;->fileSize:J

    iput-wide v0, p0, Lcom/tv91/model/Movie$Builder;->fileSize:J

    .line 16
    iget-object v0, p1, Lcom/tv91/model/Movie;->resolution:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/model/Movie$Builder;->resolution:Ljava/lang/String;

    .line 17
    iget-object v0, p1, Lcom/tv91/model/Movie;->channel:Lcom/tv91/model/Channel;

    iput-object v0, p0, Lcom/tv91/model/Movie$Builder;->channel:Lcom/tv91/model/Channel;

    .line 18
    iget-object v0, p1, Lcom/tv91/model/Movie;->categories:Ljava/util/List;

    iput-object v0, p0, Lcom/tv91/model/Movie$Builder;->categories:Ljava/util/List;

    .line 19
    iget-object v0, p1, Lcom/tv91/model/Movie;->supplier:Lcom/tv91/model/Supplier;

    iput-object v0, p0, Lcom/tv91/model/Movie$Builder;->supplier:Lcom/tv91/model/Supplier;

    .line 20
    iget-object v0, p1, Lcom/tv91/model/Movie;->series:Lcom/tv91/model/Series;

    iput-object v0, p0, Lcom/tv91/model/Movie$Builder;->series:Lcom/tv91/model/Series;

    .line 21
    iget-object v0, p1, Lcom/tv91/model/Movie;->actors:Ljava/util/List;

    iput-object v0, p0, Lcom/tv91/model/Movie$Builder;->actors:Ljava/util/List;

    .line 22
    iget v0, p1, Lcom/tv91/model/Movie;->point:I

    iput v0, p0, Lcom/tv91/model/Movie$Builder;->point:I

    .line 23
    iget v0, p1, Lcom/tv91/model/Movie;->download:I

    iput v0, p0, Lcom/tv91/model/Movie$Builder;->download:I

    .line 24
    iget v0, p1, Lcom/tv91/model/Movie;->type:I

    iput v0, p0, Lcom/tv91/model/Movie$Builder;->type:I

    .line 25
    iget-object v0, p1, Lcom/tv91/model/Movie;->extension:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/model/Movie$Builder;->extension:Ljava/lang/String;

    .line 26
    iget v0, p1, Lcom/tv91/model/Movie;->favoriteCount:I

    iput v0, p0, Lcom/tv91/model/Movie$Builder;->favoriteCount:I

    .line 27
    iget v0, p1, Lcom/tv91/model/Movie;->playCount:I

    iput v0, p0, Lcom/tv91/model/Movie$Builder;->playCount:I

    .line 28
    iget-boolean v0, p1, Lcom/tv91/model/Movie;->favorite:Z

    iput-boolean v0, p0, Lcom/tv91/model/Movie$Builder;->favorite:Z

    .line 29
    iget v0, p1, Lcom/tv91/model/Movie;->sourceId:I

    iput v0, p0, Lcom/tv91/model/Movie$Builder;->sourceId:I

    .line 30
    iget p1, p1, Lcom/tv91/model/Movie;->typeId:I

    iput p1, p0, Lcom/tv91/model/Movie$Builder;->typeId:I

    return-void
.end method

.method static synthetic access$000(Lcom/tv91/model/Movie$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tv91/model/Movie$Builder;->id:I

    return p0
.end method

.method static synthetic access$100(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/Movie$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/tv91/model/Movie$Builder;)Lcom/tv91/model/Channel;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/Movie$Builder;->channel:Lcom/tv91/model/Channel;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/tv91/model/Movie$Builder;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/Movie$Builder;->categories:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/tv91/model/Movie$Builder;)Lcom/tv91/model/Supplier;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/Movie$Builder;->supplier:Lcom/tv91/model/Supplier;

    return-object p0
.end method

.method static synthetic access$1300(Lcom/tv91/model/Movie$Builder;)Lcom/tv91/model/Series;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/Movie$Builder;->series:Lcom/tv91/model/Series;

    return-object p0
.end method

.method static synthetic access$1400(Lcom/tv91/model/Movie$Builder;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/Movie$Builder;->actors:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$1500(Lcom/tv91/model/Movie$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tv91/model/Movie$Builder;->point:I

    return p0
.end method

.method static synthetic access$1600(Lcom/tv91/model/Movie$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tv91/model/Movie$Builder;->download:I

    return p0
.end method

.method static synthetic access$1700(Lcom/tv91/model/Movie$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tv91/model/Movie$Builder;->type:I

    return p0
.end method

.method static synthetic access$1800(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/Movie$Builder;->extension:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1900(Lcom/tv91/model/Movie$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tv91/model/Movie$Builder;->favoriteCount:I

    return p0
.end method

.method static synthetic access$200(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/Movie$Builder;->description:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$2000(Lcom/tv91/model/Movie$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tv91/model/Movie$Builder;->playCount:I

    return p0
.end method

.method static synthetic access$2100(Lcom/tv91/model/Movie$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tv91/model/Movie$Builder;->favorite:Z

    return p0
.end method

.method static synthetic access$2200(Lcom/tv91/model/Movie$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tv91/model/Movie$Builder;->sourceId:I

    return p0
.end method

.method static synthetic access$2300(Lcom/tv91/model/Movie$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tv91/model/Movie$Builder;->typeId:I

    return p0
.end method

.method static synthetic access$300(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/Movie$Builder;->createTime:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$400(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/Movie$Builder;->image:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$500(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/Movie$Builder;->poster:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$600(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/Movie$Builder;->screenshot:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$700(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/Movie$Builder;->duration:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$800(Lcom/tv91/model/Movie$Builder;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tv91/model/Movie$Builder;->fileSize:J

    return-wide v0
.end method

.method static synthetic access$900(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/Movie$Builder;->resolution:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public actors(Ljava/util/List;)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Actor"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/Actor;",
            ">;)",
            "Lcom/tv91/model/Movie$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/Movie$Builder;->actors:Ljava/util/List;

    return-object p0
.end method

.method public build()Lcom/tv91/model/Movie;
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/model/Movie;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/tv91/model/Movie;-><init>(Lcom/tv91/model/Movie$Builder;Lcom/tv91/model/Movie$a;)V

    return-object v0
.end method

.method public categories(Ljava/util/List;)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Class"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tv91/model/Category;",
            ">;)",
            "Lcom/tv91/model/Movie$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/Movie$Builder;->categories:Ljava/util/List;

    return-object p0
.end method

.method public channel(Lcom/tv91/model/Channel;)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Channel"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/Movie$Builder;->channel:Lcom/tv91/model/Channel;

    return-object p0
.end method

.method public createTime(Ljava/lang/String;)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "CreateTime"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/Movie$Builder;->createTime:Ljava/lang/String;

    return-object p0
.end method

.method public description(Ljava/lang/String;)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Description"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/Movie$Builder;->description:Ljava/lang/String;

    return-object p0
.end method

.method public download(I)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Download"
    .end annotation

    .line 1
    iput p1, p0, Lcom/tv91/model/Movie$Builder;->download:I

    return-object p0
.end method

.method public duration(Ljava/lang/String;)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Length"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/Movie$Builder;->duration:Ljava/lang/String;

    return-object p0
.end method

.method public extension(Ljava/lang/String;)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Extension"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/Movie$Builder;->extension:Ljava/lang/String;

    return-object p0
.end method

.method public favorite(Z)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "IsFavorite"
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/tv91/model/Movie$Builder;->favorite:Z

    return-object p0
.end method

.method public favoriteCount(I)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "FavoriteCount"
    .end annotation

    .line 1
    iput p1, p0, Lcom/tv91/model/Movie$Builder;->favoriteCount:I

    return-object p0
.end method

.method public fileSize(J)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "FileSize"
    .end annotation

    .line 1
    iput-wide p1, p0, Lcom/tv91/model/Movie$Builder;->fileSize:J

    return-object p0
.end method

.method public id(I)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonAlias;
        value = {
            "ID"
        }
    .end annotation

    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "MovieID"
    .end annotation

    .line 1
    iput p1, p0, Lcom/tv91/model/Movie$Builder;->id:I

    return-object p0
.end method

.method public image(Ljava/lang/String;)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonAlias;
        value = {
            "Pic"
        }
    .end annotation

    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Img"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/Movie$Builder;->image:Ljava/lang/String;

    return-object p0
.end method

.method public name(Ljava/lang/String;)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonAlias;
        value = {
            "Title"
        }
    .end annotation

    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Name"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/Movie$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method public playCount(I)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "PlayCount"
    .end annotation

    .line 1
    iput p1, p0, Lcom/tv91/model/Movie$Builder;->playCount:I

    return-object p0
.end method

.method public point(I)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Point"
    .end annotation

    .line 1
    iput p1, p0, Lcom/tv91/model/Movie$Builder;->point:I

    return-object p0
.end method

.method public poster(Ljava/lang/String;)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "CoverImg"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/Movie$Builder;->poster:Ljava/lang/String;

    return-object p0
.end method

.method public resolution(Ljava/lang/String;)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Resolution"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/Movie$Builder;->resolution:Ljava/lang/String;

    return-object p0
.end method

.method public screenshot(Ljava/lang/String;)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "CutPicName"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/Movie$Builder;->screenshot:Ljava/lang/String;

    return-object p0
.end method

.method public series(Lcom/tv91/model/Series;)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Series"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/Movie$Builder;->series:Lcom/tv91/model/Series;

    return-object p0
.end method

.method public sourceId(I)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "SourceId"
    .end annotation

    .line 1
    iput p1, p0, Lcom/tv91/model/Movie$Builder;->sourceId:I

    return-object p0
.end method

.method public supplier(Lcom/tv91/model/Supplier;)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Supplier"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/Movie$Builder;->supplier:Lcom/tv91/model/Supplier;

    return-object p0
.end method

.method public type(I)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Type"
    .end annotation

    .line 1
    iput p1, p0, Lcom/tv91/model/Movie$Builder;->type:I

    return-object p0
.end method

.method public typeId(I)Lcom/tv91/model/Movie$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "TypeId"
    .end annotation

    .line 1
    iput p1, p0, Lcom/tv91/model/Movie$Builder;->typeId:I

    return-object p0
.end method
