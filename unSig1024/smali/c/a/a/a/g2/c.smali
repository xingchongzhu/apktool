.class public final synthetic Lc/a/a/a/g2/c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/media/MediaCodec$OnFrameRenderedListener;


# instance fields
.field public final synthetic a:Lc/a/a/a/g2/l;

.field public final synthetic b:Lc/a/a/a/g2/q$b;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/g2/l;Lc/a/a/a/g2/q$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/g2/c;->a:Lc/a/a/a/g2/l;

    iput-object p2, p0, Lc/a/a/a/g2/c;->b:Lc/a/a/a/g2/q$b;

    return-void
.end method


# virtual methods
.method public final onFrameRendered(Landroid/media/MediaCodec;JJ)V
    .locals 7

    iget-object v0, p0, Lc/a/a/a/g2/c;->a:Lc/a/a/a/g2/l;

    iget-object v1, p0, Lc/a/a/a/g2/c;->b:Lc/a/a/a/g2/q$b;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v0 .. v6}, Lc/a/a/a/g2/l;->v(Lc/a/a/a/g2/q$b;Landroid/media/MediaCodec;JJ)V

    return-void
.end method
