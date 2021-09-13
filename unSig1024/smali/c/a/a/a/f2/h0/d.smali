.class public final Lc/a/a/a/f2/h0/d;
.super Ljava/lang/Object;
.source "StartOffsetExtractorOutput.java"

# interfaces
.implements Lc/a/a/a/f2/l;


# instance fields
.field private final a:J

.field private final b:Lc/a/a/a/f2/l;


# direct methods
.method public constructor <init>(JLc/a/a/a/f2/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lc/a/a/a/f2/h0/d;->a:J

    .line 3
    iput-object p3, p0, Lc/a/a/a/f2/h0/d;->b:Lc/a/a/a/f2/l;

    return-void
.end method

.method static synthetic a(Lc/a/a/a/f2/h0/d;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc/a/a/a/f2/h0/d;->a:J

    return-wide v0
.end method


# virtual methods
.method public f(Lc/a/a/a/f2/y;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/h0/d;->b:Lc/a/a/a/f2/l;

    new-instance v1, Lc/a/a/a/f2/h0/d$a;

    invoke-direct {v1, p0, p1}, Lc/a/a/a/f2/h0/d$a;-><init>(Lc/a/a/a/f2/h0/d;Lc/a/a/a/f2/y;)V

    invoke-interface {v0, v1}, Lc/a/a/a/f2/l;->f(Lc/a/a/a/f2/y;)V

    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/h0/d;->b:Lc/a/a/a/f2/l;

    invoke-interface {v0}, Lc/a/a/a/f2/l;->h()V

    return-void
.end method

.method public q(II)Lc/a/a/a/f2/b0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/h0/d;->b:Lc/a/a/a/f2/l;

    invoke-interface {v0, p1, p2}, Lc/a/a/a/f2/l;->q(II)Lc/a/a/a/f2/b0;

    move-result-object p1

    return-object p1
.end method
