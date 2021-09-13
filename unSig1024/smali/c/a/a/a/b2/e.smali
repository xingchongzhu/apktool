.class public final synthetic Lc/a/a/a/b2/e;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/b2/r$a;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/b2/r$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/b2/e;->a:Lc/a/a/a/b2/r$a;

    iput-object p2, p0, Lc/a/a/a/b2/e;->b:Ljava/lang/String;

    iput-wide p3, p0, Lc/a/a/a/b2/e;->c:J

    iput-wide p5, p0, Lc/a/a/a/b2/e;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lc/a/a/a/b2/e;->a:Lc/a/a/a/b2/r$a;

    iget-object v1, p0, Lc/a/a/a/b2/e;->b:Ljava/lang/String;

    iget-wide v2, p0, Lc/a/a/a/b2/e;->c:J

    iget-wide v4, p0, Lc/a/a/a/b2/e;->d:J

    invoke-virtual/range {v0 .. v5}, Lc/a/a/a/b2/r$a;->j(Ljava/lang/String;JJ)V

    return-void
.end method
