.class public final synthetic Lc/a/a/a/n2/h;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/n2/z$a;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:F


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/n2/z$a;IIIF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/n2/h;->a:Lc/a/a/a/n2/z$a;

    iput p2, p0, Lc/a/a/a/n2/h;->b:I

    iput p3, p0, Lc/a/a/a/n2/h;->c:I

    iput p4, p0, Lc/a/a/a/n2/h;->d:I

    iput p5, p0, Lc/a/a/a/n2/h;->e:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lc/a/a/a/n2/h;->a:Lc/a/a/a/n2/z$a;

    iget v1, p0, Lc/a/a/a/n2/h;->b:I

    iget v2, p0, Lc/a/a/a/n2/h;->c:I

    iget v3, p0, Lc/a/a/a/n2/h;->d:I

    iget v4, p0, Lc/a/a/a/n2/h;->e:F

    invoke-virtual {v0, v1, v2, v3, v4}, Lc/a/a/a/n2/z$a;->x(IIIF)V

    return-void
.end method
