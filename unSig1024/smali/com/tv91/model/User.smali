.class public final Lcom/tv91/model/User;
.super Ljava/lang/Object;
.source "User.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties;
    ignoreUnknown = true
.end annotation

.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
    builder = Lcom/tv91/model/User$Builder;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/model/User$StringConverter;,
        Lcom/tv91/model/User$BooleanConverter;,
        Lcom/tv91/model/User$Builder;
    }
.end annotation


# instance fields
.field public final account:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Account"
    .end annotation
.end field

.field public final id:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "MemberID"
    .end annotation
.end field

.field public final isCertified:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "IsValidMobile"
    .end annotation

    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
        converter = Lcom/tv91/model/User$BooleanConverter;
    .end annotation
.end field

.field public final isQuick:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "IsQuick"
    .end annotation

    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
        converter = Lcom/tv91/model/User$BooleanConverter;
    .end annotation
.end field

.field public final isVip:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "IsVIP"
    .end annotation

    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
        converter = Lcom/tv91/model/User$BooleanConverter;
    .end annotation
.end field

.field public final nickname:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "NickName"
    .end annotation
.end field

.field public final onlineServiceAvailable:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "OnlineService"
    .end annotation
.end field

.field public final onlineServiceUrl:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "OnlineUrl"
    .end annotation
.end field

.field public final phone:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Tel"
    .end annotation
.end field

.field public final point:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Point"
    .end annotation
.end field

.field public final sid:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "SID"
    .end annotation
.end field

.field public final token:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Token"
    .end annotation
.end field

.field public final vipDate:Ljava/util/Date;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "EndTime"
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/tv91/model/User$Builder;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/tv91/model/User$Builder;->access$000(Lcom/tv91/model/User$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/User;->id:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/tv91/model/User$Builder;->access$100(Lcom/tv91/model/User$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/User;->nickname:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lcom/tv91/model/User$Builder;->access$200(Lcom/tv91/model/User$Builder;)I

    const v0, 0xf4240

    iput v0, p0, Lcom/tv91/model/User;->point:I

    .line 6
    invoke-static {p1}, Lcom/tv91/model/User$Builder;->access$300(Lcom/tv91/model/User$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/User;->token:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Lcom/tv91/model/User$Builder;->access$400(Lcom/tv91/model/User$Builder;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/User;->vipDate:Ljava/util/Date;

    .line 8
    invoke-static {p1}, Lcom/tv91/model/User$Builder;->access$500(Lcom/tv91/model/User$Builder;)Z

    const v0, 0x1

    iput-boolean v0, p0, Lcom/tv91/model/User;->isVip:Z

    .line 9
    invoke-static {p1}, Lcom/tv91/model/User$Builder;->access$600(Lcom/tv91/model/User$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/User;->account:Ljava/lang/String;

    .line 10
    invoke-static {p1}, Lcom/tv91/model/User$Builder;->access$700(Lcom/tv91/model/User$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tv91/model/User;->phone:Ljava/lang/String;

    .line 11
    invoke-static {p1}, Lcom/tv91/model/User$Builder;->access$800(Lcom/tv91/model/User$Builder;)I

    move-result v0

    iput v0, p0, Lcom/tv91/model/User;->sid:I

    .line 12
    invoke-static {p1}, Lcom/tv91/model/User$Builder;->access$900(Lcom/tv91/model/User$Builder;)Z

    const v0, 0x1

    iput-boolean v0, p0, Lcom/tv91/model/User;->isQuick:Z

    .line 13
    invoke-static {p1}, Lcom/tv91/model/User$Builder;->access$1000(Lcom/tv91/model/User$Builder;)Z

    const v0, 0x1

    iput-boolean v0, p0, Lcom/tv91/model/User;->isCertified:Z

    .line 14
    invoke-static {p1}, Lcom/tv91/model/User$Builder;->access$1100(Lcom/tv91/model/User$Builder;)Z

    const v0, 0x1

    iput-boolean v0, p0, Lcom/tv91/model/User;->onlineServiceAvailable:Z

    .line 15
    invoke-static {p1}, Lcom/tv91/model/User$Builder;->access$1200(Lcom/tv91/model/User$Builder;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/model/User;->onlineServiceUrl:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/model/User$Builder;Lcom/tv91/model/User$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/model/User;-><init>(Lcom/tv91/model/User$Builder;)V

    return-void
.end method


# virtual methods
.method public newBuilder()Lcom/tv91/model/User$Builder;
    .locals 1

    .line 1
    new-instance v0, Lcom/tv91/model/User$Builder;

    invoke-direct {v0, p0}, Lcom/tv91/model/User$Builder;-><init>(Lcom/tv91/model/User;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "User{id=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tv91/model/User;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", nickname=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/User;->nickname:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", point="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/tv91/model/User;->point:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", token=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/User;->token:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", vipDate="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/User;->vipDate:Ljava/util/Date;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", isVip="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/tv91/model/User;->isVip:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", account=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/User;->account:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", phone=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/User;->phone:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", sid="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/tv91/model/User;->sid:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", isQuick="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/tv91/model/User;->isQuick:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", isCertified="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/tv91/model/User;->isCertified:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", onlineServiceAvailable="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/tv91/model/User;->onlineServiceAvailable:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", onlineServiceUrl=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tv91/model/User;->onlineServiceUrl:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
