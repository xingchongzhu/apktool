.class final Lc/a/a/a/f2/l0/i$c;
.super Ljava/lang/Object;
.source "StreamReader.java"

# interfaces
.implements Lc/a/a/a/f2/l0/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/f2/l0/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/f2/l0/i$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lc/a/a/a/f2/l0/i$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/f2/k;)J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public b()Lc/a/a/a/f2/y;
    .locals 3

    .line 1
    new-instance v0, Lc/a/a/a/f2/y$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lc/a/a/a/f2/y$b;-><init>(J)V

    return-object v0
.end method

.method public c(J)V
    .locals 0

    return-void
.end method
