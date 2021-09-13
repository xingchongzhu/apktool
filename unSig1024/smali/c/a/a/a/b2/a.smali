.class public final synthetic Lc/a/a/a/b2/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/b2/r$a;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/b2/r$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/b2/a;->a:Lc/a/a/a/b2/r$a;

    iput-boolean p2, p0, Lc/a/a/a/b2/a;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc/a/a/a/b2/a;->a:Lc/a/a/a/b2/r$a;

    iget-boolean v1, p0, Lc/a/a/a/b2/a;->b:Z

    invoke-virtual {v0, v1}, Lc/a/a/a/b2/r$a;->v(Z)V

    return-void
.end method
