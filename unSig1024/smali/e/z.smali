.class public final Le/z;
.super Ljava/lang/Object;
.source "Request.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/z$a;
    }
.end annotation


# instance fields
.field final a:Le/t;

.field final b:Ljava/lang/String;

.field final c:Le/s;

.field final d:Le/a0;

.field final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private volatile f:Le/d;


# direct methods
.method constructor <init>(Le/z$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Le/z$a;->a:Le/t;

    iput-object v0, p0, Le/z;->a:Le/t;

    .line 3
    iget-object v0, p1, Le/z$a;->b:Ljava/lang/String;

    iput-object v0, p0, Le/z;->b:Ljava/lang/String;

    .line 4
    iget-object v0, p1, Le/z$a;->c:Le/s$a;

    invoke-virtual {v0}, Le/s$a;->d()Le/s;

    move-result-object v0

    iput-object v0, p0, Le/z;->c:Le/s;

    .line 5
    iget-object v0, p1, Le/z$a;->d:Le/a0;

    iput-object v0, p0, Le/z;->d:Le/a0;

    .line 6
    iget-object p1, p1, Le/z$a;->e:Ljava/util/Map;

    invoke-static {p1}, Le/f0/c;->u(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Le/z;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()Le/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Le/z;->d:Le/a0;

    return-object v0
.end method

.method public b()Le/d;
    .locals 1

    .line 1
    iget-object v0, p0, Le/z;->f:Le/d;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Le/z;->c:Le/s;

    invoke-static {v0}, Le/d;->k(Le/s;)Le/d;

    move-result-object v0

    iput-object v0, p0, Le/z;->f:Le/d;

    :goto_0
    return-object v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/z;->c:Le/s;

    invoke-virtual {v0, p1}, Le/s;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public d()Le/s;
    .locals 1

    .line 1
    iget-object v0, p0, Le/z;->c:Le/s;

    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/z;->a:Le/t;

    invoke-virtual {v0}, Le/t;->n()Z

    move-result v0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/z;->b:Ljava/lang/String;

    return-object v0
.end method

.method public g()Le/z$a;
    .locals 1

    .line 1
    new-instance v0, Le/z$a;

    invoke-direct {v0, p0}, Le/z$a;-><init>(Le/z;)V

    return-object v0
.end method

.method public h(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "+TT;>;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/z;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i()Le/t;
    .locals 1

    .line 1
    iget-object v0, p0, Le/z;->a:Le/t;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Request{method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/z;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/z;->a:Le/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/z;->e:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
