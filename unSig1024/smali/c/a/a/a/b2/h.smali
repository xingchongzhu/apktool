.class public final synthetic Lc/a/a/a/b2/h;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/b2/r$a;

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/b2/r$a;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/b2/h;->a:Lc/a/a/a/b2/r$a;

    iput p2, p0, Lc/a/a/a/b2/h;->b:I

    iput-wide p3, p0, Lc/a/a/a/b2/h;->c:J

    iput-wide p5, p0, Lc/a/a/a/b2/h;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lc/a/a/a/b2/h;->a:Lc/a/a/a/b2/r$a;

    iget v1, p0, Lc/a/a/a/b2/h;->b:I

    iget-wide v2, p0, Lc/a/a/a/b2/h;->c:J

    iget-wide v4, p0, Lc/a/a/a/b2/h;->d:J

    invoke-virtual/range {v0 .. v5}, Lc/a/a/a/b2/r$a;->x(IJJ)V

    return-void
.end method
