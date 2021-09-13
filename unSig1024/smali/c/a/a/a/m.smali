.class public final synthetic Lc/a/a/a/m;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lc/a/a/a/m2/s$a;


# instance fields
.field public final synthetic a:Lc/a/a/a/h1;

.field public final synthetic b:Lc/a/a/a/l2/l;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/h1;Lc/a/a/a/l2/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/m;->a:Lc/a/a/a/h1;

    iput-object p2, p0, Lc/a/a/a/m;->b:Lc/a/a/a/l2/l;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lc/a/a/a/m;->a:Lc/a/a/a/h1;

    iget-object v1, p0, Lc/a/a/a/m;->b:Lc/a/a/a/l2/l;

    check-cast p1, Lc/a/a/a/l1$a;

    invoke-static {v0, v1, p1}, Lc/a/a/a/q0;->u0(Lc/a/a/a/h1;Lc/a/a/a/l2/l;Lc/a/a/a/l1$a;)V

    return-void
.end method
