.class public final Lc/a/a/a/e2/r$b;
.super Ljava/lang/Object;
.source "DefaultDrmSessionManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/e2/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/UUID;

.field private c:Lc/a/a/a/e2/d0$c;

.field private d:Z

.field private e:[I

.field private f:Z

.field private g:Lcom/google/android/exoplayer2/upstream/a0;

.field private h:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lc/a/a/a/e2/r$b;->a:Ljava/util/HashMap;

    .line 3
    sget-object v0, Lc/a/a/a/i0;->d:Ljava/util/UUID;

    iput-object v0, p0, Lc/a/a/a/e2/r$b;->b:Ljava/util/UUID;

    .line 4
    sget-object v0, Lc/a/a/a/e2/f0;->a:Lc/a/a/a/e2/d0$c;

    iput-object v0, p0, Lc/a/a/a/e2/r$b;->c:Lc/a/a/a/e2/d0$c;

    .line 5
    new-instance v0, Lcom/google/android/exoplayer2/upstream/v;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/upstream/v;-><init>()V

    iput-object v0, p0, Lc/a/a/a/e2/r$b;->g:Lcom/google/android/exoplayer2/upstream/a0;

    const/4 v0, 0x0

    new-array v0, v0, [I

    .line 6
    iput-object v0, p0, Lc/a/a/a/e2/r$b;->e:[I

    const-wide/32 v0, 0x493e0

    .line 7
    iput-wide v0, p0, Lc/a/a/a/e2/r$b;->h:J

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/e2/i0;)Lc/a/a/a/e2/r;
    .locals 13

    .line 1
    new-instance v12, Lc/a/a/a/e2/r;

    iget-object v1, p0, Lc/a/a/a/e2/r$b;->b:Ljava/util/UUID;

    iget-object v2, p0, Lc/a/a/a/e2/r$b;->c:Lc/a/a/a/e2/d0$c;

    iget-object v4, p0, Lc/a/a/a/e2/r$b;->a:Ljava/util/HashMap;

    iget-boolean v5, p0, Lc/a/a/a/e2/r$b;->d:Z

    iget-object v6, p0, Lc/a/a/a/e2/r$b;->e:[I

    iget-boolean v7, p0, Lc/a/a/a/e2/r$b;->f:Z

    iget-object v8, p0, Lc/a/a/a/e2/r$b;->g:Lcom/google/android/exoplayer2/upstream/a0;

    iget-wide v9, p0, Lc/a/a/a/e2/r$b;->h:J

    const/4 v11, 0x0

    move-object v0, v12

    move-object v3, p1

    invoke-direct/range {v0 .. v11}, Lc/a/a/a/e2/r;-><init>(Ljava/util/UUID;Lc/a/a/a/e2/d0$c;Lc/a/a/a/e2/i0;Ljava/util/HashMap;Z[IZLcom/google/android/exoplayer2/upstream/a0;JLc/a/a/a/e2/r$a;)V

    return-object v12
.end method

.method public b(Z)Lc/a/a/a/e2/r$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc/a/a/a/e2/r$b;->d:Z

    return-object p0
.end method

.method public c(Z)Lc/a/a/a/e2/r$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc/a/a/a/e2/r$b;->f:Z

    return-object p0
.end method

.method public varargs d([I)Lc/a/a/a/e2/r$b;
    .locals 6

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget v3, p1, v2

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v4, :cond_1

    if-ne v3, v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    .line 2
    :cond_1
    :goto_1
    invoke-static {v5}, Lc/a/a/a/m2/f;->a(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 3
    :cond_2
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, Lc/a/a/a/e2/r$b;->e:[I

    return-object p0
.end method

.method public e(Ljava/util/UUID;Lc/a/a/a/e2/d0$c;)Lc/a/a/a/e2/r$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/UUID;

    iput-object p1, p0, Lc/a/a/a/e2/r$b;->b:Ljava/util/UUID;

    .line 2
    invoke-static {p2}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/e2/d0$c;

    iput-object p1, p0, Lc/a/a/a/e2/r$b;->c:Lc/a/a/a/e2/d0$c;

    return-object p0
.end method
