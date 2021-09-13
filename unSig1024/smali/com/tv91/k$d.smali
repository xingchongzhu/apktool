.class public final Lcom/tv91/k$d;
.super Ljava/lang/Object;
.source "DaggerApp_HiltComponents_SingletonC.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private a:Ld/a/b/d/c/a;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/k$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/k$d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ld/a/b/d/c/a;)Lcom/tv91/k$d;
    .locals 0

    .line 1
    invoke-static {p1}, Ld/b/c;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld/a/b/d/c/a;

    iput-object p1, p0, Lcom/tv91/k$d;->a:Ld/a/b/d/c/a;

    return-object p0
.end method

.method public b()Lcom/tv91/i;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/k$d;->a:Ld/a/b/d/c/a;

    const-class v1, Ld/a/b/d/c/a;

    invoke-static {v0, v1}, Ld/b/c;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 2
    new-instance v0, Lcom/tv91/k;

    iget-object v1, p0, Lcom/tv91/k$d;->a:Ld/a/b/d/c/a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/tv91/k;-><init>(Ld/a/b/d/c/a;Lcom/tv91/k$a;)V

    return-object v0
.end method
