.class Lb/g/k/e0$l;
.super Ljava/lang/Object;
.source "WindowInsetsCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/g/k/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "l"
.end annotation


# static fields
.field static final a:Lb/g/k/e0;


# instance fields
.field final b:Lb/g/k/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lb/g/k/e0$b;

    invoke-direct {v0}, Lb/g/k/e0$b;-><init>()V

    .line 2
    invoke-virtual {v0}, Lb/g/k/e0$b;->a()Lb/g/k/e0;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lb/g/k/e0;->a()Lb/g/k/e0;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lb/g/k/e0;->b()Lb/g/k/e0;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lb/g/k/e0;->c()Lb/g/k/e0;

    move-result-object v0

    sput-object v0, Lb/g/k/e0$l;->a:Lb/g/k/e0;

    return-void
.end method

.method constructor <init>(Lb/g/k/e0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lb/g/k/e0$l;->b:Lb/g/k/e0;

    return-void
.end method


# virtual methods
.method a()Lb/g/k/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$l;->b:Lb/g/k/e0;

    return-object v0
.end method

.method b()Lb/g/k/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$l;->b:Lb/g/k/e0;

    return-object v0
.end method

.method c()Lb/g/k/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$l;->b:Lb/g/k/e0;

    return-object v0
.end method

.method d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method e(Lb/g/k/e0;)V
    .locals 0

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lb/g/k/e0$l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Lb/g/k/e0$l;

    .line 3
    invoke-virtual {p0}, Lb/g/k/e0$l;->l()Z

    move-result v1

    invoke-virtual {p1}, Lb/g/k/e0$l;->l()Z

    move-result v3

    if-ne v1, v3, :cond_2

    .line 4
    invoke-virtual {p0}, Lb/g/k/e0$l;->k()Z

    move-result v1

    invoke-virtual {p1}, Lb/g/k/e0$l;->k()Z

    move-result v3

    if-ne v1, v3, :cond_2

    .line 5
    invoke-virtual {p0}, Lb/g/k/e0$l;->i()Lb/g/d/b;

    move-result-object v1

    invoke-virtual {p1}, Lb/g/k/e0$l;->i()Lb/g/d/b;

    move-result-object v3

    invoke-static {v1, v3}, Lb/g/j/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 6
    invoke-virtual {p0}, Lb/g/k/e0$l;->h()Lb/g/d/b;

    move-result-object v1

    invoke-virtual {p1}, Lb/g/k/e0$l;->h()Lb/g/d/b;

    move-result-object v3

    invoke-static {v1, v3}, Lb/g/j/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {p0}, Lb/g/k/e0$l;->f()Lb/g/k/d;

    move-result-object v1

    invoke-virtual {p1}, Lb/g/k/e0$l;->f()Lb/g/k/d;

    move-result-object p1

    invoke-static {v1, p1}, Lb/g/j/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method f()Lb/g/k/d;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method g()Lb/g/d/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb/g/k/e0$l;->i()Lb/g/d/b;

    move-result-object v0

    return-object v0
.end method

.method h()Lb/g/d/b;
    .locals 1

    .line 1
    sget-object v0, Lb/g/d/b;->a:Lb/g/d/b;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    invoke-virtual {p0}, Lb/g/k/e0$l;->l()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lb/g/k/e0$l;->k()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lb/g/k/e0$l;->i()Lb/g/d/b;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 2
    invoke-virtual {p0}, Lb/g/k/e0$l;->h()Lb/g/d/b;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lb/g/k/e0$l;->f()Lb/g/k/d;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 3
    invoke-static {v0}, Lb/g/j/c;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method i()Lb/g/d/b;
    .locals 1

    .line 1
    sget-object v0, Lb/g/d/b;->a:Lb/g/d/b;

    return-object v0
.end method

.method j(IIII)Lb/g/k/e0;
    .locals 0

    .line 1
    sget-object p1, Lb/g/k/e0$l;->a:Lb/g/k/e0;

    return-object p1
.end method

.method k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method l()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public m([Lb/g/d/b;)V
    .locals 0

    return-void
.end method

.method n(Lb/g/d/b;)V
    .locals 0

    return-void
.end method

.method o(Lb/g/k/e0;)V
    .locals 0

    return-void
.end method

.method public p(Lb/g/d/b;)V
    .locals 0

    return-void
.end method
