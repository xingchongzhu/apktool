.class public final synthetic Lc/a/a/a/e2/i;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/e2/w$a;

.field public final synthetic b:Lc/a/a/a/e2/w;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/e2/w$a;Lc/a/a/a/e2/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/e2/i;->a:Lc/a/a/a/e2/w$a;

    iput-object p2, p0, Lc/a/a/a/e2/i;->b:Lc/a/a/a/e2/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc/a/a/a/e2/i;->a:Lc/a/a/a/e2/w$a;

    iget-object v1, p0, Lc/a/a/a/e2/i;->b:Lc/a/a/a/e2/w;

    invoke-virtual {v0, v1}, Lc/a/a/a/e2/w$a;->m(Lc/a/a/a/e2/w;)V

    return-void
.end method
