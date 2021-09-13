.class final Lc/a/a/a/b2/y$f;
.super Ljava/lang/Object;
.source "DefaultAudioSink.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/b2/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation


# instance fields
.field public final a:Lc/a/a/a/i1;

.field public final b:Z

.field public final c:J

.field public final d:J


# direct methods
.method private constructor <init>(Lc/a/a/a/i1;ZJJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc/a/a/a/b2/y$f;->a:Lc/a/a/a/i1;

    .line 4
    iput-boolean p2, p0, Lc/a/a/a/b2/y$f;->b:Z

    .line 5
    iput-wide p3, p0, Lc/a/a/a/b2/y$f;->c:J

    .line 6
    iput-wide p5, p0, Lc/a/a/a/b2/y$f;->d:J

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/i1;ZJJLc/a/a/a/b2/y$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lc/a/a/a/b2/y$f;-><init>(Lc/a/a/a/i1;ZJJ)V

    return-void
.end method
