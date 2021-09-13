.class public final synthetic Lc/a/a/a/y;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/r0;

.field public final synthetic b:Lc/a/a/a/m1;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/r0;Lc/a/a/a/m1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/y;->a:Lc/a/a/a/r0;

    iput-object p2, p0, Lc/a/a/a/y;->b:Lc/a/a/a/m1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc/a/a/a/y;->a:Lc/a/a/a/r0;

    iget-object v1, p0, Lc/a/a/a/y;->b:Lc/a/a/a/m1;

    invoke-virtual {v0, v1}, Lc/a/a/a/r0;->O(Lc/a/a/a/m1;)V

    return-void
.end method
