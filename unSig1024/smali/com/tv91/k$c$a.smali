.class final Lcom/tv91/k$c$a;
.super Ljava/lang/Object;
.source "DaggerApp_HiltComponents_SingletonC.java"

# interfaces
.implements Ld/a/b/d/b/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/k$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/app/Activity;

.field final synthetic b:Lcom/tv91/k$c;


# direct methods
.method private constructor <init>(Lcom/tv91/k$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/k$c$a;->b:Lcom/tv91/k$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/k$c;Lcom/tv91/k$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/k$c$a;-><init>(Lcom/tv91/k$c;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ld/a/b/c/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tv91/k$c$a;->d()Lcom/tv91/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Landroid/app/Activity;)Ld/a/b/d/b/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tv91/k$c$a;->c(Landroid/app/Activity;)Lcom/tv91/k$c$a;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/app/Activity;)Lcom/tv91/k$c$a;
    .locals 0

    .line 1
    invoke-static {p1}, Ld/b/c;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    iput-object p1, p0, Lcom/tv91/k$c$a;->a:Landroid/app/Activity;

    return-object p0
.end method

.method public d()Lcom/tv91/f;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tv91/k$c$a;->a:Landroid/app/Activity;

    const-class v1, Landroid/app/Activity;

    invoke-static {v0, v1}, Ld/b/c;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 2
    new-instance v0, Lcom/tv91/k$c$b;

    iget-object v1, p0, Lcom/tv91/k$c$a;->b:Lcom/tv91/k$c;

    iget-object v2, p0, Lcom/tv91/k$c$a;->a:Landroid/app/Activity;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/tv91/k$c$b;-><init>(Lcom/tv91/k$c;Landroid/app/Activity;Lcom/tv91/k$a;)V

    return-object v0
.end method
