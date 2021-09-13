.class public final Lcom/tv91/y/a;
.super Ljava/lang/Object;
.source "MovieDatabase.java"

# interfaces
.implements Lcom/tv91/y/c;


# instance fields
.field private final a:Lcom/tv91/y/i/c;

.field private final b:Lcom/tv91/y/i/b;


# direct methods
.method public constructor <init>(Lcom/tv91/y/i/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/tv91/y/i/c;

    invoke-direct {v0, p1}, Lcom/tv91/y/i/c;-><init>(Lcom/tv91/y/i/a;)V

    iput-object v0, p0, Lcom/tv91/y/a;->a:Lcom/tv91/y/i/c;

    .line 3
    new-instance v0, Lcom/tv91/y/i/b;

    invoke-direct {v0, p1}, Lcom/tv91/y/i/b;-><init>(Lcom/tv91/y/i/a;)V

    iput-object v0, p0, Lcom/tv91/y/a;->b:Lcom/tv91/y/i/b;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/tv91/model/a;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/y/a;->b:Lcom/tv91/y/i/b;

    invoke-virtual {p1}, Lcom/tv91/y/i/b;->d()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tv91/y/a;->b:Lcom/tv91/y/i/b;

    invoke-virtual {v0, p1}, Lcom/tv91/y/i/b;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c(Lcom/tv91/model/a;)Lcom/tv91/model/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/y/b;->e(Lcom/tv91/y/c;Lcom/tv91/model/a;)Lcom/tv91/model/a;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/String;I)Lcom/tv91/model/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/y/a;->b:Lcom/tv91/y/i/b;

    invoke-virtual {v0, p1, p2}, Lcom/tv91/y/i/b;->c(Ljava/lang/String;I)Lcom/tv91/model/a;

    move-result-object p1

    return-object p1
.end method

.method public synthetic e(Lcom/tv91/model/a;)Lcom/tv91/model/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/y/b;->c(Lcom/tv91/y/c;Lcom/tv91/model/a;)Lcom/tv91/model/a;

    move-result-object p1

    return-object p1
.end method

.method public synthetic f(Lcom/tv91/model/a;Ljava/lang/String;)Lcom/tv91/model/a;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/tv91/y/b;->b(Lcom/tv91/y/c;Lcom/tv91/model/a;Ljava/lang/String;)Lcom/tv91/model/a;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/String;I)Lcom/tv91/model/Movie;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/y/a;->a:Lcom/tv91/y/i/c;

    invoke-virtual {v0, p1, p2}, Lcom/tv91/y/i/c;->b(Ljava/lang/String;I)Lcom/tv91/model/Movie;

    move-result-object p1

    return-object p1
.end method

.method public h(Lcom/tv91/model/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/y/a;->b:Lcom/tv91/y/i/b;

    invoke-virtual {v0, p1}, Lcom/tv91/y/i/b;->f(Lcom/tv91/model/a;)V

    return-void
.end method

.method public i(Lcom/tv91/model/User;Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;)Lcom/tv91/model/a;
    .locals 9

    .line 1
    new-instance v8, Lcom/tv91/model/a;

    sget-object v7, Lcom/tv91/model/a$a;->c:Lcom/tv91/model/a$a;

    const-wide/16 v1, 0x1

    move-object v0, v8

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v7}, Lcom/tv91/model/a;-><init>(JLcom/tv91/model/User;Lcom/tv91/model/Movie;Lcom/tv91/model/DownloadInfo;Ljava/lang/String;Lcom/tv91/model/a$a;)V

    .line 2
    iget-object p1, p0, Lcom/tv91/y/a;->b:Lcom/tv91/y/i/b;

    invoke-virtual {p1, v8}, Lcom/tv91/y/i/b;->a(Lcom/tv91/model/a;)V

    return-object v8
.end method

.method public synthetic j(Lcom/tv91/model/a;)Lcom/tv91/model/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/y/b;->a(Lcom/tv91/y/c;Lcom/tv91/model/a;)Lcom/tv91/model/a;

    move-result-object p1

    return-object p1
.end method

.method public synthetic k(Lcom/tv91/model/a;)Lcom/tv91/model/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/tv91/y/b;->d(Lcom/tv91/y/c;Lcom/tv91/model/a;)Lcom/tv91/model/a;

    move-result-object p1

    return-object p1
.end method
