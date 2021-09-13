.class public final synthetic Lc/a/a/a/j2/i;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/j2/h0;

.field public final synthetic b:Lc/a/a/a/f2/y;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/j2/h0;Lc/a/a/a/f2/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/j2/i;->a:Lc/a/a/a/j2/h0;

    iput-object p2, p0, Lc/a/a/a/j2/i;->b:Lc/a/a/a/f2/y;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc/a/a/a/j2/i;->a:Lc/a/a/a/j2/h0;

    iget-object v1, p0, Lc/a/a/a/j2/i;->b:Lc/a/a/a/f2/y;

    invoke-virtual {v0, v1}, Lc/a/a/a/j2/h0;->R(Lc/a/a/a/f2/y;)V

    return-void
.end method
