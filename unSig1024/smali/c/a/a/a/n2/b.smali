.class public final synthetic Lc/a/a/a/n2/b;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/n2/z$a;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/n2/z$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/n2/b;->a:Lc/a/a/a/n2/z$a;

    iput-object p2, p0, Lc/a/a/a/n2/b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc/a/a/a/n2/b;->a:Lc/a/a/a/n2/z$a;

    iget-object v1, p0, Lc/a/a/a/n2/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lc/a/a/a/n2/z$a;->j(Ljava/lang/String;)V

    return-void
.end method
