.class public final synthetic Lc/a/a/a/a2/j;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lc/a/a/a/m2/s$a;


# instance fields
.field public final synthetic a:Lc/a/a/a/a2/d1$a;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:F


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/a2/d1$a;IIIF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/a2/j;->a:Lc/a/a/a/a2/d1$a;

    iput p2, p0, Lc/a/a/a/a2/j;->b:I

    iput p3, p0, Lc/a/a/a/a2/j;->c:I

    iput p4, p0, Lc/a/a/a/a2/j;->d:I

    iput p5, p0, Lc/a/a/a/a2/j;->e:F

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lc/a/a/a/a2/j;->a:Lc/a/a/a/a2/d1$a;

    iget v1, p0, Lc/a/a/a/a2/j;->b:I

    iget v2, p0, Lc/a/a/a/a2/j;->c:I

    iget v3, p0, Lc/a/a/a/a2/j;->d:I

    iget v4, p0, Lc/a/a/a/a2/j;->e:F

    move-object v5, p1

    check-cast v5, Lc/a/a/a/a2/d1;

    invoke-static/range {v0 .. v5}, Lc/a/a/a/a2/c1;->f1(Lc/a/a/a/a2/d1$a;IIIFLc/a/a/a/a2/d1;)V

    return-void
.end method
