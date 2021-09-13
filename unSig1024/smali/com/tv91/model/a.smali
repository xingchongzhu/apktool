.class public final Lcom/tv91/model/a;
.super Ljava/lang/Object;
.source "DownloadRecord.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/model/a$a;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Lcom/tv91/model/User;

.field public final c:Lcom/tv91/model/Movie;

.field public final d:Lcom/tv91/model/DownloadInfo;

.field public final e:Ljava/lang/String;

.field public final f:Lcom/tv91/model/a$a;


# direct methods
.method public constructor <init>(JLcom/tv91/model/User;Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;Lcom/tv91/model/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/tv91/model/a;->a:J

    .line 3
    iput-object p3, p0, Lcom/tv91/model/a;->b:Lcom/tv91/model/User;

    .line 4
    iput-object p4, p0, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    .line 5
    iput-object p5, p0, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    .line 6
    iput-object p6, p0, Lcom/tv91/model/a;->e:Ljava/lang/String;

    .line 7
    iput-object p7, p0, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    sget-object v1, Lcom/tv91/model/a$a;->d:Lcom/tv91/model/a$a;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/tv91/model/a$a;->g:Lcom/tv91/model/a$a;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public b(Lcom/tv91/model/a$a;)Lcom/tv91/model/a;
    .locals 9

    .line 1
    new-instance v8, Lcom/tv91/model/a;

    iget-wide v1, p0, Lcom/tv91/model/a;->a:J

    iget-object v3, p0, Lcom/tv91/model/a;->b:Lcom/tv91/model/User;

    iget-object v4, p0, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-object v5, p0, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget-object v6, p0, Lcom/tv91/model/a;->e:Ljava/lang/String;

    move-object v0, v8

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lcom/tv91/model/a;-><init>(JLcom/tv91/model/User;Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;Lcom/tv91/model/a$a;)V

    return-object v8
.end method

.method public c(Lcom/tv91/model/Movie;)Lcom/tv91/model/a;
    .locals 9

    .line 1
    new-instance v8, Lcom/tv91/model/a;

    iget-wide v1, p0, Lcom/tv91/model/a;->a:J

    iget-object v3, p0, Lcom/tv91/model/a;->b:Lcom/tv91/model/User;

    iget-object v5, p0, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget-object v6, p0, Lcom/tv91/model/a;->e:Ljava/lang/String;

    iget-object v7, p0, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    move-object v0, v8

    move-object v4, p1

    invoke-direct/range {v0 .. v7}, Lcom/tv91/model/a;-><init>(JLcom/tv91/model/User;Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;Lcom/tv91/model/a$a;)V

    return-object v8
.end method

.method public d(Lcom/tv91/model/User;)Lcom/tv91/model/a;
    .locals 9

    .line 1
    new-instance v8, Lcom/tv91/model/a;

    iget-wide v1, p0, Lcom/tv91/model/a;->a:J

    iget-object v4, p0, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-object v5, p0, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    iget-object v6, p0, Lcom/tv91/model/a;->e:Ljava/lang/String;

    iget-object v7, p0, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    move-object v0, v8

    move-object v3, p1

    invoke-direct/range {v0 .. v7}, Lcom/tv91/model/a;-><init>(JLcom/tv91/model/User;Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;Lcom/tv91/model/a$a;)V

    return-object v8
.end method

.method public e(Ljava/lang/String;Lcom/tv91/model/a$a;)Lcom/tv91/model/a;
    .locals 9

    .line 1
    new-instance v8, Lcom/tv91/model/a;

    iget-wide v1, p0, Lcom/tv91/model/a;->a:J

    iget-object v3, p0, Lcom/tv91/model/a;->b:Lcom/tv91/model/User;

    iget-object v4, p0, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-object v5, p0, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    move-object v0, v8

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/tv91/model/a;-><init>(JLcom/tv91/model/User;Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;Lcom/tv91/model/a$a;)V

    return-object v8
.end method

.method public f(Lcom/tv91/model/a;)Z
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/tv91/model/a;->b:Lcom/tv91/model/User;

    iget-object v0, v0, Lcom/tv91/model/User;->id:Ljava/lang/String;

    iget-object v1, p1, Lcom/tv91/model/a;->b:Lcom/tv91/model/User;

    iget-object v1, v1, Lcom/tv91/model/User;->id:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget v0, v0, Lcom/tv91/model/Movie;->id:I

    iget-object p1, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget p1, p1, Lcom/tv91/model/Movie;->id:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownloadRecord{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/tv91/model/a;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", user="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tv91/model/a;->b:Lcom/tv91/model/User;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", movie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", downloadInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tv91/model/a;->d:Lcom/tv91/model/DownloadInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", filePath=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
