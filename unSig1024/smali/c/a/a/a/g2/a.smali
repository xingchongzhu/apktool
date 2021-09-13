.class public final synthetic Lc/a/a/a/g2/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lc/a/b/a/k;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc/a/a/a/g2/a;->a:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lc/a/a/a/g2/a;->a:I

    invoke-static {v0}, Lc/a/a/a/g2/l$b;->c(I)Landroid/os/HandlerThread;

    move-result-object v0

    return-object v0
.end method
