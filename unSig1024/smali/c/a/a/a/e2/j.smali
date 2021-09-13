.class public final synthetic Lc/a/a/a/e2/j;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/e2/w$a;

.field public final synthetic b:Lc/a/a/a/e2/w;

.field public final synthetic c:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/e2/w$a;Lc/a/a/a/e2/w;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/e2/j;->a:Lc/a/a/a/e2/w$a;

    iput-object p2, p0, Lc/a/a/a/e2/j;->b:Lc/a/a/a/e2/w;

    iput-object p3, p0, Lc/a/a/a/e2/j;->c:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc/a/a/a/e2/j;->a:Lc/a/a/a/e2/w$a;

    iget-object v1, p0, Lc/a/a/a/e2/j;->b:Lc/a/a/a/e2/w;

    iget-object v2, p0, Lc/a/a/a/e2/j;->c:Ljava/lang/Exception;

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/e2/w$a;->q(Lc/a/a/a/e2/w;Ljava/lang/Exception;)V

    return-void
.end method
