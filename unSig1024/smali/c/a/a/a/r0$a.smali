.class Lc/a/a/a/r0$a;
.super Ljava/lang/Object;
.source "ExoPlayerImplInternal.java"

# interfaces
.implements Lc/a/a/a/p1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/a/a/r0;->l(IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/a/a/a/r0;


# direct methods
.method constructor <init>(Lc/a/a/a/r0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/r0$a;->a:Lc/a/a/a/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 3

    const-wide/16 v0, 0x7d0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 1
    iget-object p1, p0, Lc/a/a/a/r0$a;->a:Lc/a/a/a/r0;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lc/a/a/a/r0;->c(Lc/a/a/a/r0;Z)Z

    :cond_0
    return-void
.end method
