.class public final synthetic Lc/a/a/a/n2/g;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/n2/z$a;

.field public final synthetic b:Lc/a/a/a/u0;

.field public final synthetic c:Lc/a/a/a/c2/g;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/n2/z$a;Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/n2/g;->a:Lc/a/a/a/n2/z$a;

    iput-object p2, p0, Lc/a/a/a/n2/g;->b:Lc/a/a/a/u0;

    iput-object p3, p0, Lc/a/a/a/n2/g;->c:Lc/a/a/a/c2/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc/a/a/a/n2/g;->a:Lc/a/a/a/n2/z$a;

    iget-object v1, p0, Lc/a/a/a/n2/g;->b:Lc/a/a/a/u0;

    iget-object v2, p0, Lc/a/a/a/n2/g;->c:Lc/a/a/a/c2/g;

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/n2/z$a;->r(Lc/a/a/a/u0;Lc/a/a/a/c2/g;)V

    return-void
.end method
