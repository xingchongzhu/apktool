.class final Lc/a/a/a/j2/h0$e;
.super Ljava/lang/Object;
.source "ProgressiveMediaPeriod.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/j2/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field public final a:Lc/a/a/a/j2/q0;

.field public final b:[Z

.field public final c:[Z

.field public final d:[Z


# direct methods
.method public constructor <init>(Lc/a/a/a/j2/q0;[Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/j2/h0$e;->a:Lc/a/a/a/j2/q0;

    .line 3
    iput-object p2, p0, Lc/a/a/a/j2/h0$e;->b:[Z

    .line 4
    iget p1, p1, Lc/a/a/a/j2/q0;->b:I

    new-array p2, p1, [Z

    iput-object p2, p0, Lc/a/a/a/j2/h0$e;->c:[Z

    .line 5
    new-array p1, p1, [Z

    iput-object p1, p0, Lc/a/a/a/j2/h0$e;->d:[Z

    return-void
.end method
