.class final Lc/a/a/a/f2/k0/f$f;
.super Ljava/lang/Object;
.source "AtomParsers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/f2/k0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation


# instance fields
.field private final a:I

.field private final b:J

.field private final c:I


# direct methods
.method public constructor <init>(IJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lc/a/a/a/f2/k0/f$f;->a:I

    .line 3
    iput-wide p2, p0, Lc/a/a/a/f2/k0/f$f;->b:J

    .line 4
    iput p4, p0, Lc/a/a/a/f2/k0/f$f;->c:I

    return-void
.end method

.method static synthetic a(Lc/a/a/a/f2/k0/f$f;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/f2/k0/f$f;->b:J

    return-wide v0
.end method

.method static synthetic b(Lc/a/a/a/f2/k0/f$f;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/f2/k0/f$f;->a:I

    return p0
.end method

.method static synthetic c(Lc/a/a/a/f2/k0/f$f;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/f2/k0/f$f;->c:I

    return p0
.end method
