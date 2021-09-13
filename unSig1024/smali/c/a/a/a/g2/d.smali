.class public final synthetic Lc/a/a/a/g2/d;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/g2/n;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/g2/n;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/g2/d;->a:Lc/a/a/a/g2/n;

    iput-object p2, p0, Lc/a/a/a/g2/d;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc/a/a/a/g2/d;->a:Lc/a/a/a/g2/n;

    iget-object v1, p0, Lc/a/a/a/g2/d;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lc/a/a/a/g2/n;->j(Ljava/lang/Runnable;)V

    return-void
.end method
