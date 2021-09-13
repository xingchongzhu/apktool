.class public abstract Lcom/tv91/u/a/d;
.super Lcom/tv91/x/f;
.source "BottomBarFragment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V::",
        "Lcom/tv91/u/a/i;",
        ">",
        "Lcom/tv91/x/f;"
    }
.end annotation


# instance fields
.field private final d0:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/tv91/u/a/h;",
            "Lcom/tv91/x/c;",
            ">;"
        }
    .end annotation
.end field

.field private e0:Lcom/tv91/x/h;

.field private f0:Lcom/tv91/u/a/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/tv91/x/f;-><init>()V

    .line 2
    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lcom/tv91/u/a/h;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/tv91/u/a/d;->d0:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lcom/tv91/x/f;-><init>(I)V

    .line 4
    new-instance p1, Ljava/util/EnumMap;

    const-class v0, Lcom/tv91/u/a/h;

    invoke-direct {p1, v0}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object p1, p0, Lcom/tv91/u/a/d;->d0:Ljava/util/Map;

    return-void
.end method

.method private m2(Lcom/tv91/u/a/h;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tv91/u/a/d;->f0:Lcom/tv91/u/a/h;

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v1, Lcom/tv91/u/a/h;->a:Lcom/tv91/u/a/h;

    if-ne p1, v1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/tv91/u/a/d;->e0:Lcom/tv91/x/h;

    invoke-virtual {p1}, Lcom/tv91/x/h;->d()Z

    goto :goto_0

    :cond_1
    if-ne v0, v1, :cond_2

    .line 4
    iget-object v0, p0, Lcom/tv91/u/a/d;->e0:Lcom/tv91/x/h;

    iget-object v1, p0, Lcom/tv91/u/a/d;->d0:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/x/g;

    invoke-virtual {v0, p1}, Lcom/tv91/x/h;->e(Lcom/tv91/x/g;)V

    goto :goto_0

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/tv91/u/a/d;->e0:Lcom/tv91/x/h;

    iget-object v1, p0, Lcom/tv91/u/a/d;->d0:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/x/g;

    invoke-virtual {v0, p1}, Lcom/tv91/x/h;->h(Lcom/tv91/x/g;)V

    :goto_0
    return-void
.end method

.method public static synthetic p2(Lcom/tv91/u/a/d;Lcom/tv91/u/a/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tv91/u/a/d;->m2(Lcom/tv91/u/a/h;)V

    return-void
.end method


# virtual methods
.method public J0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->J0(Landroid/os/Bundle;)V

    .line 2
    invoke-static {p0}, Lcom/tv91/x/h;->b(Landroidx/fragment/app/Fragment;)Lcom/tv91/x/h;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/a/d;->e0:Lcom/tv91/x/h;

    .line 3
    invoke-virtual {p0}, Lcom/tv91/u/a/d;->n2()Lcom/tv91/u/a/h;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/a/d;->f0:Lcom/tv91/u/a/h;

    .line 4
    iget-object p1, p0, Lcom/tv91/u/a/d;->d0:Ljava/util/Map;

    sget-object v0, Lcom/tv91/u/a/h;->a:Lcom/tv91/u/a/h;

    new-instance v1, Lcom/tv91/u/a/o/l$a;

    invoke-direct {v1}, Lcom/tv91/u/a/o/l$a;-><init>()V

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object p1, p0, Lcom/tv91/u/a/d;->d0:Ljava/util/Map;

    sget-object v0, Lcom/tv91/u/a/h;->b:Lcom/tv91/u/a/h;

    new-instance v1, Lcom/tv91/u/a/n/o$a;

    invoke-direct {v1}, Lcom/tv91/u/a/n/o$a;-><init>()V

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object p1, p0, Lcom/tv91/u/a/d;->d0:Ljava/util/Map;

    sget-object v0, Lcom/tv91/u/a/h;->c:Lcom/tv91/u/a/h;

    new-instance v1, Lcom/tv91/u/a/m/i$a;

    invoke-direct {v1}, Lcom/tv91/u/a/m/i$a;-><init>()V

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    iget-object p1, p0, Lcom/tv91/u/a/d;->d0:Ljava/util/Map;

    sget-object v0, Lcom/tv91/u/a/h;->d:Lcom/tv91/u/a/h;

    new-instance v1, Lcom/tv91/u/a/q/h$a;

    invoke-direct {v1}, Lcom/tv91/u/a/q/h$a;-><init>()V

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iget-object p1, p0, Lcom/tv91/u/a/d;->d0:Ljava/util/Map;

    sget-object v0, Lcom/tv91/u/a/h;->e:Lcom/tv91/u/a/h;

    new-instance v1, Lcom/tv91/u/a/p/v$b;

    invoke-direct {v1}, Lcom/tv91/u/a/p/v$b;-><init>()V

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public g1()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 2
    invoke-virtual {p0}, Lcom/tv91/u/a/d;->o2()Lcom/tv91/features/shared/ViewSupplier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tv91/features/shared/ViewSupplier;->g()Lcom/tv91/q/a/f;

    move-result-object v0

    check-cast v0, Lcom/tv91/u/a/i;

    new-instance v1, Lcom/tv91/u/a/a;

    invoke-direct {v1, p0}, Lcom/tv91/u/a/a;-><init>(Lcom/tv91/u/a/d;)V

    invoke-interface {v0, v1}, Lcom/tv91/u/a/i;->t(Lb/g/j/a;)V

    return-void
.end method

.method protected abstract n2()Lcom/tv91/u/a/h;
.end method

.method protected abstract o2()Lcom/tv91/features/shared/ViewSupplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/tv91/features/shared/ViewSupplier<",
            "TV;>;"
        }
    .end annotation
.end method
