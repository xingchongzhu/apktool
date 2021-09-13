.class public final synthetic Lc/a/a/a/a2/a1;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lc/a/a/a/m2/s$a;


# instance fields
.field public final synthetic a:Lc/a/a/a/a2/d1$a;

.field public final synthetic b:Lc/a/a/a/c2/d;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/c2/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/a2/a1;->a:Lc/a/a/a/a2/d1$a;

    iput-object p2, p0, Lc/a/a/a/a2/a1;->b:Lc/a/a/a/c2/d;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lc/a/a/a/a2/a1;->a:Lc/a/a/a/a2/d1$a;

    iget-object v1, p0, Lc/a/a/a/a2/a1;->b:Lc/a/a/a/c2/d;

    check-cast p1, Lc/a/a/a/a2/d1;

    invoke-static {v0, v1, p1}, Lc/a/a/a/a2/c1;->c1(Lc/a/a/a/a2/d1$a;Lc/a/a/a/c2/d;Lc/a/a/a/a2/d1;)V

    return-void
.end method
