.class public final Lc/a/a/a/l0$b;
.super Ljava/lang/Object;
.source "DefaultLivePlaybackSpeedControl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:F

.field private b:F

.field private c:J

.field private d:F

.field private e:J

.field private f:J

.field private g:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x3f7851ec    # 0.97f

    .line 2
    iput v0, p0, Lc/a/a/a/l0$b;->a:F

    const v0, 0x3f83d70a    # 1.03f

    .line 3
    iput v0, p0, Lc/a/a/a/l0$b;->b:F

    const-wide/16 v0, 0x3e8

    .line 4
    iput-wide v0, p0, Lc/a/a/a/l0$b;->c:J

    const v0, 0x33d6bf95    # 1.0E-7f

    .line 5
    iput v0, p0, Lc/a/a/a/l0$b;->d:F

    const-wide/16 v0, 0x14

    .line 6
    invoke-static {v0, v1}, Lc/a/a/a/i0;->c(J)J

    move-result-wide v0

    iput-wide v0, p0, Lc/a/a/a/l0$b;->e:J

    const-wide/16 v0, 0x1f4

    .line 7
    invoke-static {v0, v1}, Lc/a/a/a/i0;->c(J)J

    move-result-wide v0

    iput-wide v0, p0, Lc/a/a/a/l0$b;->f:J

    const v0, 0x3f7fbe77    # 0.999f

    .line 8
    iput v0, p0, Lc/a/a/a/l0$b;->g:F

    return-void
.end method


# virtual methods
.method public a()Lc/a/a/a/l0;
    .locals 13

    .line 1
    new-instance v12, Lc/a/a/a/l0;

    iget v1, p0, Lc/a/a/a/l0$b;->a:F

    iget v2, p0, Lc/a/a/a/l0$b;->b:F

    iget-wide v3, p0, Lc/a/a/a/l0$b;->c:J

    iget v5, p0, Lc/a/a/a/l0$b;->d:F

    iget-wide v6, p0, Lc/a/a/a/l0$b;->e:J

    iget-wide v8, p0, Lc/a/a/a/l0$b;->f:J

    iget v10, p0, Lc/a/a/a/l0$b;->g:F

    const/4 v11, 0x0

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Lc/a/a/a/l0;-><init>(FFJFJJFLc/a/a/a/l0$a;)V

    return-object v12
.end method
