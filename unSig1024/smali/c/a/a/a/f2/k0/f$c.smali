.class final Lc/a/a/a/f2/k0/f$c;
.super Ljava/lang/Object;
.source "AtomParsers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/f2/k0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field public final a:[Lc/a/a/a/f2/k0/p;

.field public b:Lc/a/a/a/u0;

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-array p1, p1, [Lc/a/a/a/f2/k0/p;

    iput-object p1, p0, Lc/a/a/a/f2/k0/f$c;->a:[Lc/a/a/a/f2/k0/p;

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lc/a/a/a/f2/k0/f$c;->d:I

    return-void
.end method
