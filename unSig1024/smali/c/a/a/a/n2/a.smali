.class public final synthetic Lc/a/a/a/n2/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/n2/z$a;

.field public final synthetic b:Lc/a/a/a/c2/d;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/n2/z$a;Lc/a/a/a/c2/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/n2/a;->a:Lc/a/a/a/n2/z$a;

    iput-object p2, p0, Lc/a/a/a/n2/a;->b:Lc/a/a/a/c2/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc/a/a/a/n2/a;->a:Lc/a/a/a/n2/z$a;

    iget-object v1, p0, Lc/a/a/a/n2/a;->b:Lc/a/a/a/c2/d;

    invoke-virtual {v0, v1}, Lc/a/a/a/n2/z$a;->l(Lc/a/a/a/c2/d;)V

    return-void
.end method
