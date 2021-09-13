.class public final Le/b0;
.super Ljava/lang/Object;
.source "Response.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/b0$a;
    }
.end annotation


# instance fields
.field final a:Le/z;

.field final b:Le/x;

.field final c:I

.field final d:Ljava/lang/String;

.field final e:Le/r;

.field final f:Le/s;

.field final g:Le/c0;

.field final h:Le/b0;

.field final i:Le/b0;

.field final j:Le/b0;

.field final k:J

.field final l:J

.field private volatile m:Le/d;


# direct methods
.method constructor <init>(Le/b0$a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Le/b0$a;->a:Le/z;

    iput-object v0, p0, Le/b0;->a:Le/z;

    .line 3
    iget-object v0, p1, Le/b0$a;->b:Le/x;

    iput-object v0, p0, Le/b0;->b:Le/x;

    .line 4
    iget v0, p1, Le/b0$a;->c:I

    iput v0, p0, Le/b0;->c:I

    .line 5
    iget-object v0, p1, Le/b0$a;->d:Ljava/lang/String;

    iput-object v0, p0, Le/b0;->d:Ljava/lang/String;

    .line 6
    iget-object v0, p1, Le/b0$a;->e:Le/r;

    iput-object v0, p0, Le/b0;->e:Le/r;

    .line 7
    iget-object v0, p1, Le/b0$a;->f:Le/s$a;

    invoke-virtual {v0}, Le/s$a;->d()Le/s;

    move-result-object v0

    iput-object v0, p0, Le/b0;->f:Le/s;

    .line 8
    iget-object v0, p1, Le/b0$a;->g:Le/c0;

    iput-object v0, p0, Le/b0;->g:Le/c0;

    .line 9
    iget-object v0, p1, Le/b0$a;->h:Le/b0;

    iput-object v0, p0, Le/b0;->h:Le/b0;

    .line 10
    iget-object v0, p1, Le/b0$a;->i:Le/b0;

    iput-object v0, p0, Le/b0;->i:Le/b0;

    .line 11
    iget-object v0, p1, Le/b0$a;->j:Le/b0;

    iput-object v0, p0, Le/b0;->j:Le/b0;

    .line 12
    iget-wide v0, p1, Le/b0$a;->k:J

    iput-wide v0, p0, Le/b0;->k:J

    .line 13
    iget-wide v0, p1, Le/b0$a;->l:J

    iput-wide v0, p0, Le/b0;->l:J

    return-void
.end method


# virtual methods
.method public B()Le/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b0;->g:Le/c0;

    return-object v0
.end method

.method public C()Le/d;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b0;->m:Le/d;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Le/b0;->f:Le/s;

    invoke-static {v0}, Le/d;->k(Le/s;)Le/d;

    move-result-object v0

    iput-object v0, p0, Le/b0;->m:Le/d;

    :goto_0
    return-object v0
.end method

.method public D()I
    .locals 1

    .line 1
    iget v0, p0, Le/b0;->c:I

    return v0
.end method

.method public E()Le/r;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b0;->e:Le/r;

    return-object v0
.end method

.method public F(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Le/b0;->G(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public G(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b0;->f:Le/s;

    invoke-virtual {v0, p1}, Le/s;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object p2, p1

    :cond_0
    return-object p2
.end method

.method public H()Le/s;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b0;->f:Le/s;

    return-object v0
.end method

.method public I()Z
    .locals 2

    .line 1
    iget v0, p0, Le/b0;->c:I

    const/16 v1, 0xc8

    if-lt v0, v1, :cond_0

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public J()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b0;->d:Ljava/lang/String;

    return-object v0
.end method

.method public K()Le/b0$a;
    .locals 1

    .line 1
    new-instance v0, Le/b0$a;

    invoke-direct {v0, p0}, Le/b0$a;-><init>(Le/b0;)V

    return-object v0
.end method

.method public L()Le/b0;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b0;->j:Le/b0;

    return-object v0
.end method

.method public M()J
    .locals 2

    .line 1
    iget-wide v0, p0, Le/b0;->l:J

    return-wide v0
.end method

.method public N()Le/z;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b0;->a:Le/z;

    return-object v0
.end method

.method public O()J
    .locals 2

    .line 1
    iget-wide v0, p0, Le/b0;->k:J

    return-wide v0
.end method

.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b0;->g:Le/c0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Le/c0;->close()V

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response{protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b0;->b:Le/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/b0;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b0;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b0;->a:Le/z;

    .line 2
    invoke-virtual {v1}, Le/z;->i()Le/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
