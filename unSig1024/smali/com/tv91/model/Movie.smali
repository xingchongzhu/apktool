.class public final Lcom/tv91/model/Movie;
.super Ljava/lang/Object;
.source "Movie.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties;
    ignoreUnknown = true
.end annotation

.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
    builder = Lcom/tv91/model/Movie$Builder;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/model/Movie$Builder;
    }
.end annotation


# instance fields
.field public final actors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/Actor;",
            ">;"
        }
    .end annotation
.end field

.field public final categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tv91/model/Category;",
            ">;"
        }
    .end annotation
.end field

.field public final channel:Lcom/tv91/model/Channel;

.field public final createTime:Ljava/lang/String;

.field public final description:Ljava/lang/String;

.field public final download:I

.field public final duration:Ljava/lang/String;

.field public final extension:Ljava/lang/String;

.field public final favorite:Z

.field public final favoriteCount:I

.field public final fileSize:J

.field public final id:I

.field public final image:Ljava/lang/String;

.field public final name:Ljava/lang/String;

.field public final playCount:I

.field public final point:I

.field public final poster:Ljava/lang/String;

.field public final resolution:Ljava/lang/String;

.field public final screenshot:Ljava/lang/String;

.field public final series:Lcom/tv91/model/Series;

.field public final sourceId:I

.field public final supplier:Lcom/tv91/model/Supplier;

.field public final type:I

.field public final typeId:I


# direct methods
.method private constructor <init>(Lcom/tv91/model/Movie$Builder;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$000(Lcom/tv91/model/Movie$Builder;)I

    move-result v0

    iput v0, p0, Lcom/tv91/model/Movie;->id:I

    .line 4
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$100(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$200(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/Movie;->description:Ljava/lang/String;

    .line 6
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$300(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/Movie;->createTime:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$400(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/Movie;->image:Ljava/lang/String;

    .line 8
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$500(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/Movie;->poster:Ljava/lang/String;

    .line 9
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$600(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/Movie;->screenshot:Ljava/lang/String;

    .line 10
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$700(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/Movie;->duration:Ljava/lang/String;

    .line 11
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$800(Lcom/tv91/model/Movie$Builder;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tv91/model/Movie;->fileSize:J

    .line 12
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$900(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/Movie;->resolution:Ljava/lang/String;

    .line 13
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$1000(Lcom/tv91/model/Movie$Builder;)Lcom/tv91/model/Channel;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/Movie;->channel:Lcom/tv91/model/Channel;

    .line 14
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$1100(Lcom/tv91/model/Movie$Builder;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/Movie;->categories:Ljava/util/List;

    .line 15
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$1200(Lcom/tv91/model/Movie$Builder;)Lcom/tv91/model/Supplier;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/Movie;->supplier:Lcom/tv91/model/Supplier;

    .line 16
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$1300(Lcom/tv91/model/Movie$Builder;)Lcom/tv91/model/Series;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/Movie;->series:Lcom/tv91/model/Series;

    .line 17
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$1400(Lcom/tv91/model/Movie$Builder;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/Movie;->actors:Ljava/util/List;

    .line 18
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$1500(Lcom/tv91/model/Movie$Builder;)I

    const v0, 0x0

    iput v0, p0, Lcom/tv91/model/Movie;->point:I

    .line 19
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$1600(Lcom/tv91/model/Movie$Builder;)I

    const v0, 0x0

    iput v0, p0, Lcom/tv91/model/Movie;->download:I

    .line 20
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$1700(Lcom/tv91/model/Movie$Builder;)I

    move-result v0

    iput v0, p0, Lcom/tv91/model/Movie;->type:I

    .line 21
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$1800(Lcom/tv91/model/Movie$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/Movie;->extension:Ljava/lang/String;

    .line 22
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$1900(Lcom/tv91/model/Movie$Builder;)I

    move-result v0

    iput v0, p0, Lcom/tv91/model/Movie;->favoriteCount:I

    .line 23
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$2000(Lcom/tv91/model/Movie$Builder;)I

    const v0, 0x0

    iput v0, p0, Lcom/tv91/model/Movie;->playCount:I

    .line 24
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$2100(Lcom/tv91/model/Movie$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/tv91/model/Movie;->favorite:Z

    .line 25
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$2200(Lcom/tv91/model/Movie$Builder;)I

    move-result v0

    iput v0, p0, Lcom/tv91/model/Movie;->sourceId:I

    .line 26
    invoke-static {p1}, Lcom/tv91/model/Movie$Builder;->access$2300(Lcom/tv91/model/Movie$Builder;)I

    move-result p1

    iput p1, p0, Lcom/tv91/model/Movie;->typeId:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/model/Movie$Builder;Lcom/tv91/model/Movie$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/model/Movie;-><init>(Lcom/tv91/model/Movie$Builder;)V

    return-void
.end method


# virtual methods
.method public newBuilder()Lcom/tv91/model/Movie$Builder;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/model/Movie$Builder;

    invoke-direct {v0, p0}, Lcom/tv91/model/Movie$Builder;-><init>(Lcom/tv91/model/Movie;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Movie{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tv91/model/Movie;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", description=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/Movie;->description:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", createTime=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/Movie;->createTime:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", image=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/Movie;->image:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", poster=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/Movie;->poster:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", screenshot=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/Movie;->screenshot:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", duration=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/Movie;->duration:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", fileSize="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/tv91/model/Movie;->fileSize:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", resolution=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/Movie;->resolution:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", channel="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/Movie;->channel:Lcom/tv91/model/Channel;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", categories="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/Movie;->categories:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", supplier="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/Movie;->supplier:Lcom/tv91/model/Supplier;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", series="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/Movie;->series:Lcom/tv91/model/Series;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", actors="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/Movie;->actors:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", point="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/tv91/model/Movie;->point:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", download="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/tv91/model/Movie;->download:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", type="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/tv91/model/Movie;->type:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", extension=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/Movie;->extension:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", favoriteCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tv91/model/Movie;->favoriteCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", playCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tv91/model/Movie;->playCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", favorite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/tv91/model/Movie;->favorite:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", sourceId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tv91/model/Movie;->sourceId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", typeId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tv91/model/Movie;->typeId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
