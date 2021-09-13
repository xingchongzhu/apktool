.class public Lb/p/b;
.super Lb/p/q;
.source "AutoTransition.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lb/p/q;-><init>()V

    .line 2
    invoke-direct {p0}, Lb/p/b;->s0()V

    return-void
.end method

.method private s0()V
    .locals 3

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lb/p/q;->p0(I)Lb/p/q;

    .line 2
    new-instance v1, Lb/p/d;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lb/p/d;-><init>(I)V

    invoke-virtual {p0, v1}, Lb/p/q;->h0(Lb/p/m;)Lb/p/q;

    move-result-object v1

    new-instance v2, Lb/p/c;

    invoke-direct {v2}, Lb/p/c;-><init>()V

    .line 3
    invoke-virtual {v1, v2}, Lb/p/q;->h0(Lb/p/m;)Lb/p/q;

    move-result-object v1

    new-instance v2, Lb/p/d;

    invoke-direct {v2, v0}, Lb/p/d;-><init>(I)V

    .line 4
    invoke-virtual {v1, v2}, Lb/p/q;->h0(Lb/p/m;)Lb/p/q;

    return-void
.end method
