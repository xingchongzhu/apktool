.class public final synthetic Lc/a/a/a/b;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/f0$a;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/f0$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/b;->a:Lc/a/a/a/f0$a;

    iput p2, p0, Lc/a/a/a/b;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc/a/a/a/b;->a:Lc/a/a/a/f0$a;

    iget v1, p0, Lc/a/a/a/b;->b:I

    invoke-virtual {v0, v1}, Lc/a/a/a/f0$a;->b(I)V

    return-void
.end method
