.class public final synthetic Lc/a/a/a/j2/g;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/j2/e0$a;

.field public final synthetic b:Lc/a/a/a/j2/e0;

.field public final synthetic c:Lc/a/a/a/j2/w;

.field public final synthetic d:Lc/a/a/a/j2/z;


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/j2/e0$a;Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/j2/g;->a:Lc/a/a/a/j2/e0$a;

    iput-object p2, p0, Lc/a/a/a/j2/g;->b:Lc/a/a/a/j2/e0;

    iput-object p3, p0, Lc/a/a/a/j2/g;->c:Lc/a/a/a/j2/w;

    iput-object p4, p0, Lc/a/a/a/j2/g;->d:Lc/a/a/a/j2/z;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lc/a/a/a/j2/g;->a:Lc/a/a/a/j2/e0$a;

    iget-object v1, p0, Lc/a/a/a/j2/g;->b:Lc/a/a/a/j2/e0;

    iget-object v2, p0, Lc/a/a/a/j2/g;->c:Lc/a/a/a/j2/w;

    iget-object v3, p0, Lc/a/a/a/j2/g;->d:Lc/a/a/a/j2/z;

    invoke-virtual {v0, v1, v2, v3}, Lc/a/a/a/j2/e0$a;->h(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;)V

    return-void
.end method
