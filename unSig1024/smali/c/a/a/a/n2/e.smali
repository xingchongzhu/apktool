.class public final synthetic Lc/a/a/a/n2/e;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/n2/z$a;

.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/n2/z$a;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/n2/e;->a:Lc/a/a/a/n2/z$a;

    iput p2, p0, Lc/a/a/a/n2/e;->b:I

    iput-wide p3, p0, Lc/a/a/a/n2/e;->c:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lc/a/a/a/n2/e;->a:Lc/a/a/a/n2/z$a;

    iget v1, p0, Lc/a/a/a/n2/e;->b:I

    iget-wide v2, p0, Lc/a/a/a/n2/e;->c:J

    invoke-virtual {v0, v1, v2, v3}, Lc/a/a/a/n2/z$a;->n(IJ)V

    return-void
.end method
