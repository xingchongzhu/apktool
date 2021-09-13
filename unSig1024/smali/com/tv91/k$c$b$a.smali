.class final Lcom/tv91/k$c$b$a;
.super Ljava/lang/Object;
.source "DaggerApp_HiltComponents_SingletonC.java"

# interfaces
.implements Ld/a/b/d/b/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/k$c$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private a:Landroidx/fragment/app/Fragment;

.field final synthetic b:Lcom/tv91/k$c$b;


# direct methods
.method private constructor <init>(Lcom/tv91/k$c$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/k$c$b$a;->b:Lcom/tv91/k$c$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/k$c$b;Lcom/tv91/k$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/k$c$b$a;-><init>(Lcom/tv91/k$c$b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ld/a/b/c/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tv91/k$c$b$a;->c()Lcom/tv91/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Landroidx/fragment/app/Fragment;)Ld/a/b/d/b/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tv91/k$c$b$a;->d(Landroidx/fragment/app/Fragment;)Lcom/tv91/k$c$b$a;

    move-result-object p1

    return-object p1
.end method

.method public c()Lcom/tv91/h;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/k$c$b$a;->a:Landroidx/fragment/app/Fragment;

    const-class v1, Landroidx/fragment/app/Fragment;

    invoke-static {v0, v1}, Ld/b/c;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 2
    new-instance v0, Lcom/tv91/k$c$b$b;

    iget-object v1, p0, Lcom/tv91/k$c$b$a;->b:Lcom/tv91/k$c$b;

    iget-object v2, p0, Lcom/tv91/k$c$b$a;->a:Landroidx/fragment/app/Fragment;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/tv91/k$c$b$b;-><init>(Lcom/tv91/k$c$b;Landroidx/fragment/app/Fragment;Lcom/tv91/k$a;)V

    return-object v0
.end method

.method public d(Landroidx/fragment/app/Fragment;)Lcom/tv91/k$c$b$a;
    .locals 0

    .line 1
    invoke-static {p1}, Ld/b/c;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/Fragment;

    iput-object p1, p0, Lcom/tv91/k$c$b$a;->a:Landroidx/fragment/app/Fragment;

    return-object p0
.end method
