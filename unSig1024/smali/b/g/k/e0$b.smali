.class public final Lb/g/k/e0$b;
.super Ljava/lang/Object;
.source "WindowInsetsCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/g/k/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lb/g/k/e0$f;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Lb/g/k/e0$e;

    invoke-direct {v0}, Lb/g/k/e0$e;-><init>()V

    iput-object v0, p0, Lb/g/k/e0$b;->a:Lb/g/k/e0$f;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, Lb/g/k/e0$d;

    invoke-direct {v0}, Lb/g/k/e0$d;-><init>()V

    iput-object v0, p0, Lb/g/k/e0$b;->a:Lb/g/k/e0$f;

    goto :goto_0

    :cond_1
    const/16 v1, 0x14

    if-lt v0, v1, :cond_2

    .line 5
    new-instance v0, Lb/g/k/e0$c;

    invoke-direct {v0}, Lb/g/k/e0$c;-><init>()V

    iput-object v0, p0, Lb/g/k/e0$b;->a:Lb/g/k/e0$f;

    goto :goto_0

    .line 6
    :cond_2
    new-instance v0, Lb/g/k/e0$f;

    invoke-direct {v0}, Lb/g/k/e0$f;-><init>()V

    iput-object v0, p0, Lb/g/k/e0$b;->a:Lb/g/k/e0$f;

    :goto_0
    return-void
.end method

.method public constructor <init>(Lb/g/k/e0;)V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 9
    new-instance v0, Lb/g/k/e0$e;

    invoke-direct {v0, p1}, Lb/g/k/e0$e;-><init>(Lb/g/k/e0;)V

    iput-object v0, p0, Lb/g/k/e0$b;->a:Lb/g/k/e0$f;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 10
    new-instance v0, Lb/g/k/e0$d;

    invoke-direct {v0, p1}, Lb/g/k/e0$d;-><init>(Lb/g/k/e0;)V

    iput-object v0, p0, Lb/g/k/e0$b;->a:Lb/g/k/e0$f;

    goto :goto_0

    :cond_1
    const/16 v1, 0x14

    if-lt v0, v1, :cond_2

    .line 11
    new-instance v0, Lb/g/k/e0$c;

    invoke-direct {v0, p1}, Lb/g/k/e0$c;-><init>(Lb/g/k/e0;)V

    iput-object v0, p0, Lb/g/k/e0$b;->a:Lb/g/k/e0$f;

    goto :goto_0

    .line 12
    :cond_2
    new-instance v0, Lb/g/k/e0$f;

    invoke-direct {v0, p1}, Lb/g/k/e0$f;-><init>(Lb/g/k/e0;)V

    iput-object v0, p0, Lb/g/k/e0$b;->a:Lb/g/k/e0$f;

    :goto_0
    return-void
.end method


# virtual methods
.method public a()Lb/g/k/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Lb/g/k/e0$b;->a:Lb/g/k/e0$f;

    invoke-virtual {v0}, Lb/g/k/e0$f;->b()Lb/g/k/e0;

    move-result-object v0

    return-object v0
.end method

.method public b(Lb/g/d/b;)Lb/g/k/e0$b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lb/g/k/e0$b;->a:Lb/g/k/e0$f;

    invoke-virtual {v0, p1}, Lb/g/k/e0$f;->d(Lb/g/d/b;)V

    return-object p0
.end method

.method public c(Lb/g/d/b;)Lb/g/k/e0$b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lb/g/k/e0$b;->a:Lb/g/k/e0$f;

    invoke-virtual {v0, p1}, Lb/g/k/e0$f;->f(Lb/g/d/b;)V

    return-object p0
.end method
