.class public Lcom/tv91/model/User$Builder;
.super Ljava/lang/Object;
.source "User.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties;
    ignoreUnknown = true
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/model/User;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private account:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private isCertified:Z

.field private isQuick:Z

.field private isVip:Z

.field private nickname:Ljava/lang/String;

.field private onlineServiceAvailable:Z

.field private onlineServiceUrl:Ljava/lang/String;

.field private phone:Ljava/lang/String;

.field private point:I

.field private sid:I

.field private token:Ljava/lang/String;

.field private vipDate:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/tv91/model/User;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-object v0, p1, Lcom/tv91/model/User;->id:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/model/User$Builder;->id:Ljava/lang/String;

    .line 4
    iget-object v0, p1, Lcom/tv91/model/User;->nickname:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/model/User$Builder;->nickname:Ljava/lang/String;

    .line 5
    const v0, 0xf4240

    iput v0, p0, Lcom/tv91/model/User$Builder;->point:I

    .line 6
    iget-object v0, p1, Lcom/tv91/model/User;->token:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/model/User$Builder;->token:Ljava/lang/String;

    .line 7
    iget-object v0, p1, Lcom/tv91/model/User;->vipDate:Ljava/util/Date;

    iput-object v0, p0, Lcom/tv91/model/User$Builder;->vipDate:Ljava/util/Date;

    .line 8
    iget-boolean v0, p1, Lcom/tv91/model/User;->isVip:Z

    iput-boolean v0, p0, Lcom/tv91/model/User$Builder;->isVip:Z

    .line 9
    iget-object v0, p1, Lcom/tv91/model/User;->account:Ljava/lang/String;

    iput-object v0, p0, Lcom/tv91/model/User$Builder;->account:Ljava/lang/String;

    .line 10
    iget v0, p1, Lcom/tv91/model/User;->sid:I

    iput v0, p0, Lcom/tv91/model/User$Builder;->sid:I

    .line 11
    iget-boolean v0, p1, Lcom/tv91/model/User;->isQuick:Z

    iput-boolean v0, p0, Lcom/tv91/model/User$Builder;->isQuick:Z

    .line 12
    iget-boolean v0, p1, Lcom/tv91/model/User;->isCertified:Z

    iput-boolean v0, p0, Lcom/tv91/model/User$Builder;->isCertified:Z

    .line 13
    iget-boolean v0, p1, Lcom/tv91/model/User;->onlineServiceAvailable:Z

    iput-boolean v0, p0, Lcom/tv91/model/User$Builder;->onlineServiceAvailable:Z

    .line 14
    iget-object p1, p1, Lcom/tv91/model/User;->onlineServiceUrl:Ljava/lang/String;

    iput-object p1, p0, Lcom/tv91/model/User$Builder;->onlineServiceUrl:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lcom/tv91/model/User$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/User$Builder;->id:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/tv91/model/User$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/User$Builder;->nickname:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/tv91/model/User$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tv91/model/User$Builder;->isCertified:Z

    return p0
.end method

.method static synthetic access$1100(Lcom/tv91/model/User$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tv91/model/User$Builder;->onlineServiceAvailable:Z

    return p0
.end method

.method static synthetic access$1200(Lcom/tv91/model/User$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/User$Builder;->onlineServiceUrl:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lcom/tv91/model/User$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tv91/model/User$Builder;->point:I

    return p0
.end method

.method static synthetic access$300(Lcom/tv91/model/User$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/User$Builder;->token:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$400(Lcom/tv91/model/User$Builder;)Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/User$Builder;->vipDate:Ljava/util/Date;

    return-object p0
.end method

.method static synthetic access$500(Lcom/tv91/model/User$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tv91/model/User$Builder;->isVip:Z

    return p0
.end method

.method static synthetic access$600(Lcom/tv91/model/User$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/User$Builder;->account:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$700(Lcom/tv91/model/User$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/model/User$Builder;->phone:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$800(Lcom/tv91/model/User$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tv91/model/User$Builder;->sid:I

    return p0
.end method

.method static synthetic access$900(Lcom/tv91/model/User$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tv91/model/User$Builder;->isQuick:Z

    return p0
.end method


# virtual methods
.method public account(Ljava/lang/String;)Lcom/tv91/model/User$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Account"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/User$Builder;->account:Ljava/lang/String;

    return-object p0
.end method

.method public build()Lcom/tv91/model/User;
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/model/User;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/tv91/model/User;-><init>(Lcom/tv91/model/User$Builder;Lcom/tv91/model/User$a;)V

    return-object v0
.end method

.method public id(Ljava/lang/String;)Lcom/tv91/model/User$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "MemberID"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/User$Builder;->id:Ljava/lang/String;

    return-object p0
.end method

.method public isCertified(Z)Lcom/tv91/model/User$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "IsValidMobile"
    .end annotation

    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        converter = Lcom/tv91/model/User$StringConverter;
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/tv91/model/User$Builder;->isCertified:Z

    return-object p0
.end method

.method public isQuick(Z)Lcom/tv91/model/User$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "IsQuick"
    .end annotation

    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        converter = Lcom/tv91/model/User$StringConverter;
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/tv91/model/User$Builder;->isQuick:Z

    return-object p0
.end method

.method public isVip(Z)Lcom/tv91/model/User$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "IsVIP"
    .end annotation

    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        converter = Lcom/tv91/model/User$StringConverter;
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/tv91/model/User$Builder;->isVip:Z

    return-object p0
.end method

.method public nickname(Ljava/lang/String;)Lcom/tv91/model/User$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "NickName"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/User$Builder;->nickname:Ljava/lang/String;

    return-object p0
.end method

.method public onlineServiceAvailable(Z)Lcom/tv91/model/User$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "OnlineService"
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/tv91/model/User$Builder;->onlineServiceAvailable:Z

    return-object p0
.end method

.method public onlineServiceUrl(Ljava/lang/String;)Lcom/tv91/model/User$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "OnlineUrl"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/User$Builder;->onlineServiceUrl:Ljava/lang/String;

    return-object p0
.end method

.method public phone(Ljava/lang/String;)Lcom/tv91/model/User$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Tel"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/User$Builder;->phone:Ljava/lang/String;

    return-object p0
.end method

.method public point(I)Lcom/tv91/model/User$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Point"
    .end annotation

    .line 1
    iput p1, p0, Lcom/tv91/model/User$Builder;->point:I

    return-object p0
.end method

.method public sid(I)Lcom/tv91/model/User$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "SID"
    .end annotation

    .line 1
    iput p1, p0, Lcom/tv91/model/User$Builder;->sid:I

    return-object p0
.end method

.method public token(Ljava/lang/String;)Lcom/tv91/model/User$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "Token"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/User$Builder;->token:Ljava/lang/String;

    return-object p0
.end method

.method public vipDate(Ljava/util/Date;)Lcom/tv91/model/User$Builder;
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "EndTime"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/model/User$Builder;->vipDate:Ljava/util/Date;

    return-object p0
.end method
