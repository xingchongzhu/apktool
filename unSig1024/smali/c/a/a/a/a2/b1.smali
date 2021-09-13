.class public final synthetic Lc/a/a/a/a2/b1;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lc/a/a/a/m2/s$b;


# instance fields
.field public final synthetic a:Lc/a/a/a/a2/c1;

.field public final synthetic b:Lc/a/a/a/l1;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/a2/c1;Lc/a/a/a/l1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/a2/b1;->a:Lc/a/a/a/a2/c1;

    iput-object p2, p0, Lc/a/a/a/a2/b1;->b:Lc/a/a/a/l1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lc/a/a/a/m2/x;)V
    .locals 2

    iget-object v0, p0, Lc/a/a/a/a2/b1;->a:Lc/a/a/a/a2/c1;

    iget-object v1, p0, Lc/a/a/a/a2/b1;->b:Lc/a/a/a/l1;

    check-cast p1, Lc/a/a/a/a2/d1;

    check-cast p2, Lc/a/a/a/a2/d1$b;

    invoke-virtual {v0, v1, p1, p2}, Lc/a/a/a/a2/c1;->i1(Lc/a/a/a/l1;Lc/a/a/a/a2/d1;Lc/a/a/a/a2/d1$b;)V

    return-void
.end method
