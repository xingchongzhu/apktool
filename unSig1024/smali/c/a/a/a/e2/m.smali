.class public final synthetic Lc/a/a/a/e2/m;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/media/MediaDrm$OnEventListener;


# instance fields
.field public final synthetic a:Lc/a/a/a/e2/f0;

.field public final synthetic b:Lc/a/a/a/e2/d0$b;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/e2/f0;Lc/a/a/a/e2/d0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/e2/m;->a:Lc/a/a/a/e2/f0;

    iput-object p2, p0, Lc/a/a/a/e2/m;->b:Lc/a/a/a/e2/d0$b;

    return-void
.end method


# virtual methods
.method public final onEvent(Landroid/media/MediaDrm;[BII[B)V
    .locals 7

    iget-object v0, p0, Lc/a/a/a/e2/m;->a:Lc/a/a/a/e2/f0;

    iget-object v1, p0, Lc/a/a/a/e2/m;->b:Lc/a/a/a/e2/d0$b;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lc/a/a/a/e2/f0;->w(Lc/a/a/a/e2/d0$b;Landroid/media/MediaDrm;[BII[B)V

    return-void
.end method
