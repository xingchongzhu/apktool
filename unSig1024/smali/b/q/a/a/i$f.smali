.class abstract Lb/q/a/a/i$f;
.super Lb/q/a/a/i$e;
.source "VectorDrawableCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/q/a/a/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "f"
.end annotation


# instance fields
.field protected a:[Lb/g/d/c$b;

.field b:Ljava/lang/String;

.field c:I

.field d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lb/q/a/a/i$e;-><init>(Lb/q/a/a/i$a;)V

    .line 2
    iput-object v0, p0, Lb/q/a/a/i$f;->a:[Lb/g/d/c$b;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lb/q/a/a/i$f;->c:I

    return-void
.end method

.method public constructor <init>(Lb/q/a/a/i$f;)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lb/q/a/a/i$e;-><init>(Lb/q/a/a/i$a;)V

    .line 5
    iput-object v0, p0, Lb/q/a/a/i$f;->a:[Lb/g/d/c$b;

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lb/q/a/a/i$f;->c:I

    .line 7
    iget-object v0, p1, Lb/q/a/a/i$f;->b:Ljava/lang/String;

    iput-object v0, p0, Lb/q/a/a/i$f;->b:Ljava/lang/String;

    .line 8
    iget v0, p1, Lb/q/a/a/i$f;->d:I

    iput v0, p0, Lb/q/a/a/i$f;->d:I

    .line 9
    iget-object p1, p1, Lb/q/a/a/i$f;->a:[Lb/g/d/c$b;

    invoke-static {p1}, Lb/g/d/c;->f([Lb/g/d/c$b;)[Lb/g/d/c$b;

    move-result-object p1

    iput-object p1, p0, Lb/q/a/a/i$f;->a:[Lb/g/d/c$b;

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/graphics/Path;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 2
    iget-object v0, p0, Lb/q/a/a/i$f;->a:[Lb/g/d/c$b;

    if-eqz v0, :cond_0

    .line 3
    invoke-static {v0, p1}, Lb/g/d/c$b;->e([Lb/g/d/c$b;Landroid/graphics/Path;)V

    :cond_0
    return-void
.end method

.method public getPathData()[Lb/g/d/c$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lb/q/a/a/i$f;->a:[Lb/g/d/c$b;

    return-object v0
.end method

.method public getPathName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lb/q/a/a/i$f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public setPathData([Lb/g/d/c$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb/q/a/a/i$f;->a:[Lb/g/d/c$b;

    invoke-static {v0, p1}, Lb/g/d/c;->b([Lb/g/d/c$b;[Lb/g/d/c$b;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p1}, Lb/g/d/c;->f([Lb/g/d/c$b;)[Lb/g/d/c$b;

    move-result-object p1

    iput-object p1, p0, Lb/q/a/a/i$f;->a:[Lb/g/d/c$b;

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lb/q/a/a/i$f;->a:[Lb/g/d/c$b;

    invoke-static {v0, p1}, Lb/g/d/c;->j([Lb/g/d/c$b;[Lb/g/d/c$b;)V

    :goto_0
    return-void
.end method
