.class public final synthetic Lc/a/a/a/n2/d;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/n2/z$a;

.field public final synthetic b:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/n2/z$a;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/n2/d;->a:Lc/a/a/a/n2/z$a;

    iput-object p2, p0, Lc/a/a/a/n2/d;->b:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc/a/a/a/n2/d;->a:Lc/a/a/a/n2/z$a;

    iget-object v1, p0, Lc/a/a/a/n2/d;->b:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Lc/a/a/a/n2/z$a;->t(Landroid/view/Surface;)V

    return-void
.end method
