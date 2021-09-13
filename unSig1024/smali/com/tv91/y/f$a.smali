.class final Lcom/tv91/y/f$a;
.super Ljava/lang/Object;
.source "UserPreference.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/y/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Ljava/util/Date;

.field public f:Z

.field public g:Ljava/lang/String;

.field public h:I

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/tv91/model/User;
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/model/User$Builder;

    invoke-direct {v0}, Lcom/tv91/model/User$Builder;-><init>()V

    iget-object v1, p0, Lcom/tv91/y/f$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tv91/model/User$Builder;->id(Ljava/lang/String;)Lcom/tv91/model/User$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/y/f$a;->b:Ljava/lang/String;

    .line 2
    invoke-virtual {v0, v1}, Lcom/tv91/model/User$Builder;->nickname(Ljava/lang/String;)Lcom/tv91/model/User$Builder;

    move-result-object v0

    iget v1, p0, Lcom/tv91/y/f$a;->c:I

    .line 3
    invoke-virtual {v0, v1}, Lcom/tv91/model/User$Builder;->point(I)Lcom/tv91/model/User$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/y/f$a;->d:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1}, Lcom/tv91/model/User$Builder;->token(Ljava/lang/String;)Lcom/tv91/model/User$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/y/f$a;->e:Ljava/util/Date;

    .line 5
    invoke-virtual {v0, v1}, Lcom/tv91/model/User$Builder;->vipDate(Ljava/util/Date;)Lcom/tv91/model/User$Builder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/tv91/y/f$a;->f:Z

    .line 6
    invoke-virtual {v0, v1}, Lcom/tv91/model/User$Builder;->isVip(Z)Lcom/tv91/model/User$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/y/f$a;->g:Ljava/lang/String;

    .line 7
    invoke-virtual {v0, v1}, Lcom/tv91/model/User$Builder;->account(Ljava/lang/String;)Lcom/tv91/model/User$Builder;

    move-result-object v0

    iget v1, p0, Lcom/tv91/y/f$a;->h:I

    .line 8
    invoke-virtual {v0, v1}, Lcom/tv91/model/User$Builder;->sid(I)Lcom/tv91/model/User$Builder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/tv91/y/f$a;->i:Z

    .line 9
    invoke-virtual {v0, v1}, Lcom/tv91/model/User$Builder;->isQuick(Z)Lcom/tv91/model/User$Builder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/tv91/y/f$a;->j:Z

    .line 10
    invoke-virtual {v0, v1}, Lcom/tv91/model/User$Builder;->isCertified(Z)Lcom/tv91/model/User$Builder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/tv91/y/f$a;->k:Z

    .line 11
    invoke-virtual {v0, v1}, Lcom/tv91/model/User$Builder;->onlineServiceAvailable(Z)Lcom/tv91/model/User$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/y/f$a;->l:Ljava/lang/String;

    .line 12
    invoke-virtual {v0, v1}, Lcom/tv91/model/User$Builder;->onlineServiceUrl(Ljava/lang/String;)Lcom/tv91/model/User$Builder;

    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/tv91/model/User$Builder;->build()Lcom/tv91/model/User;

    move-result-object v0

    return-object v0
.end method
