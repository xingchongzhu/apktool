.class public final synthetic Lc/a/a/a/j2/c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/j2/e0$a;

.field public final synthetic b:Lc/a/a/a/j2/e0;

.field public final synthetic c:Lc/a/a/a/j2/w;

.field public final synthetic d:Lc/a/a/a/j2/z;

.field public final synthetic e:Ljava/io/IOException;

.field public final synthetic f:Z


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/j2/e0$a;Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/j2/c;->a:Lc/a/a/a/j2/e0$a;

    iput-object p2, p0, Lc/a/a/a/j2/c;->b:Lc/a/a/a/j2/e0;

    iput-object p3, p0, Lc/a/a/a/j2/c;->c:Lc/a/a/a/j2/w;

    iput-object p4, p0, Lc/a/a/a/j2/c;->d:Lc/a/a/a/j2/z;

    iput-object p5, p0, Lc/a/a/a/j2/c;->e:Ljava/io/IOException;

    iput-boolean p6, p0, Lc/a/a/a/j2/c;->f:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lc/a/a/a/j2/c;->a:Lc/a/a/a/j2/e0$a;

    iget-object v1, p0, Lc/a/a/a/j2/c;->b:Lc/a/a/a/j2/e0;

    iget-object v2, p0, Lc/a/a/a/j2/c;->c:Lc/a/a/a/j2/w;

    iget-object v3, p0, Lc/a/a/a/j2/c;->d:Lc/a/a/a/j2/z;

    iget-object v4, p0, Lc/a/a/a/j2/c;->e:Ljava/io/IOException;

    iget-boolean v5, p0, Lc/a/a/a/j2/c;->f:Z

    invoke-virtual/range {v0 .. v5}, Lc/a/a/a/j2/e0$a;->l(Lc/a/a/a/j2/e0;Lc/a/a/a/j2/w;Lc/a/a/a/j2/z;Ljava/io/IOException;Z)V

    return-void
.end method
