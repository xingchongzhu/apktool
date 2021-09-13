.class public final synthetic Lc/a/a/a/z;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/d1;

.field public final synthetic b:Lc/a/b/b/r$a;

.field public final synthetic c:Lc/a/a/a/j2/d0$a;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/d1;Lc/a/b/b/r$a;Lc/a/a/a/j2/d0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/z;->a:Lc/a/a/a/d1;

    iput-object p2, p0, Lc/a/a/a/z;->b:Lc/a/b/b/r$a;

    iput-object p3, p0, Lc/a/a/a/z;->c:Lc/a/a/a/j2/d0$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc/a/a/a/z;->a:Lc/a/a/a/d1;

    iget-object v1, p0, Lc/a/a/a/z;->b:Lc/a/b/b/r$a;

    iget-object v2, p0, Lc/a/a/a/z;->c:Lc/a/a/a/j2/d0$a;

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/d1;->v(Lc/a/b/b/r$a;Lc/a/a/a/j2/d0$a;)V

    return-void
.end method
