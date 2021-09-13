.class final Lcom/tv91/k$c$b;
.super Lcom/tv91/f;
.source "DaggerApp_HiltComponents_SingletonC.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/k$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/k$c$b$b;,
        Lcom/tv91/k$c$b$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/tv91/k$c;


# direct methods
.method private constructor <init>(Lcom/tv91/k$c;Landroid/app/Activity;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tv91/k$c$b;->a:Lcom/tv91/k$c;

    invoke-direct {p0}, Lcom/tv91/f;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/k$c;Landroid/app/Activity;Lcom/tv91/k$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tv91/k$c$b;-><init>(Lcom/tv91/k$c;Landroid/app/Activity;)V

    return-void
.end method

.method private d(Lcom/tv91/MainActivity;)Lcom/tv91/MainActivity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/k$c$b;->a:Lcom/tv91/k$c;

    iget-object v0, v0, Lcom/tv91/k$c;->b:Lcom/tv91/k;

    invoke-static {v0}, Lcom/tv91/k;->f(Lcom/tv91/k;)Lcom/tv91/y/d;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tv91/o;->a(Lcom/tv91/MainActivity;Lcom/tv91/y/e;)V

    return-object p1
.end method


# virtual methods
.method public a(Lcom/tv91/features/authentication/AuthActivity;)V
    .locals 0

    return-void
.end method

.method public b()Ld/a/b/d/b/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/k$c$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/tv91/k$c$b$a;-><init>(Lcom/tv91/k$c$b;Lcom/tv91/k$a;)V

    return-object v0
.end method

.method public c(Lcom/tv91/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/k$c$b;->d(Lcom/tv91/MainActivity;)Lcom/tv91/MainActivity;

    return-void
.end method
