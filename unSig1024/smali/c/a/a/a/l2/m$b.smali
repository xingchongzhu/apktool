.class public Lc/a/a/a/l2/m$b;
.super Ljava/lang/Object;
.source "TrackSelectionParameters.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/l2/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field a:Lc/a/b/b/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/r<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field b:I

.field c:Lc/a/b/b/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/r<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field d:I

.field e:Z

.field f:I


# direct methods
.method public constructor <init>()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-static {}, Lc/a/b/b/r;->p()Lc/a/b/b/r;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/l2/m$b;->a:Lc/a/b/b/r;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lc/a/a/a/l2/m$b;->b:I

    .line 6
    invoke-static {}, Lc/a/b/b/r;->p()Lc/a/b/b/r;

    move-result-object v1

    iput-object v1, p0, Lc/a/a/a/l2/m$b;->c:Lc/a/b/b/r;

    .line 7
    iput v0, p0, Lc/a/a/a/l2/m$b;->d:I

    .line 8
    iput-boolean v0, p0, Lc/a/a/a/l2/m$b;->e:Z

    .line 9
    iput v0, p0, Lc/a/a/a/l2/m$b;->f:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/a/a/l2/m$b;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lc/a/a/a/l2/m$b;->b(Landroid/content/Context;)Lc/a/a/a/l2/m$b;

    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "captioning"

    .line 2
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/CaptioningManager;

    if-eqz p1, :cond_2

    .line 3
    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x440

    .line 4
    iput v0, p0, Lc/a/a/a/l2/m$b;->d:I

    .line 5
    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 6
    invoke-static {p1}, Lc/a/a/a/m2/m0;->P(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc/a/b/b/r;->q(Ljava/lang/Object;)Lc/a/b/b/r;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/l2/m$b;->c:Lc/a/b/b/r;

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public a()Lc/a/a/a/l2/m;
    .locals 8

    .line 1
    new-instance v7, Lc/a/a/a/l2/m;

    iget-object v1, p0, Lc/a/a/a/l2/m$b;->a:Lc/a/b/b/r;

    iget v2, p0, Lc/a/a/a/l2/m$b;->b:I

    iget-object v3, p0, Lc/a/a/a/l2/m$b;->c:Lc/a/b/b/r;

    iget v4, p0, Lc/a/a/a/l2/m$b;->d:I

    iget-boolean v5, p0, Lc/a/a/a/l2/m$b;->e:Z

    iget v6, p0, Lc/a/a/a/l2/m$b;->f:I

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lc/a/a/a/l2/m;-><init>(Lc/a/b/b/r;ILc/a/b/b/r;IZI)V

    return-object v7
.end method

.method public b(Landroid/content/Context;)Lc/a/a/a/l2/m$b;
    .locals 2

    .line 1
    sget v0, Lc/a/a/a/m2/m0;->a:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lc/a/a/a/l2/m$b;->c(Landroid/content/Context;)V

    :cond_0
    return-object p0
.end method
