.class public final synthetic Lc/a/a/a/f2/k0/d;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lc/a/b/a/e;


# instance fields
.field public final synthetic a:Lc/a/a/a/f2/k0/i;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/f2/k0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f2/k0/d;->a:Lc/a/a/a/f2/k0/i;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lc/a/a/a/f2/k0/d;->a:Lc/a/a/a/f2/k0/i;

    check-cast p1, Lc/a/a/a/f2/k0/o;

    invoke-virtual {v0, p1}, Lc/a/a/a/f2/k0/i;->n(Lc/a/a/a/f2/k0/o;)Lc/a/a/a/f2/k0/o;

    move-result-object p1

    return-object p1
.end method
