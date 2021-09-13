.class public final synthetic Lc/a/a/a/m2/b;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:Lc/a/a/a/m2/s;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/m2/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/m2/b;->a:Lc/a/a/a/m2/s;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object v0, p0, Lc/a/a/a/m2/b;->a:Lc/a/a/a/m2/s;

    invoke-static {v0, p1}, Lc/a/a/a/m2/s;->e(Lc/a/a/a/m2/s;Landroid/os/Message;)Z

    move-result p1

    return p1
.end method
