.class final Lc/a/a/a/f2/i0/e$b;
.super Ljava/lang/Object;
.source "MatroskaExtractor.java"

# interfaces
.implements Lc/a/a/a/f2/i0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/f2/i0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lc/a/a/a/f2/i0/e;


# direct methods
.method private constructor <init>(Lc/a/a/a/f2/i0/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/f2/i0/e$b;->a:Lc/a/a/a/f2/i0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lc/a/a/a/f2/i0/e;Lc/a/a/a/f2/i0/e$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lc/a/a/a/f2/i0/e$b;-><init>(Lc/a/a/a/f2/i0/e;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/i0/e$b;->a:Lc/a/a/a/f2/i0/e;

    invoke-virtual {v0, p1}, Lc/a/a/a/f2/i0/e;->o(I)V

    return-void
.end method

.method public b(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/i0/e$b;->a:Lc/a/a/a/f2/i0/e;

    invoke-virtual {v0, p1}, Lc/a/a/a/f2/i0/e;->u(I)I

    move-result p1

    return p1
.end method

.method public c(ID)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/i0/e$b;->a:Lc/a/a/a/f2/i0/e;

    invoke-virtual {v0, p1, p2, p3}, Lc/a/a/a/f2/i0/e;->r(ID)V

    return-void
.end method

.method public d(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/i0/e$b;->a:Lc/a/a/a/f2/i0/e;

    invoke-virtual {v0, p1}, Lc/a/a/a/f2/i0/e;->z(I)Z

    move-result p1

    return p1
.end method

.method public e(IILc/a/a/a/f2/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/i0/e$b;->a:Lc/a/a/a/f2/i0/e;

    invoke-virtual {v0, p1, p2, p3}, Lc/a/a/a/f2/i0/e;->l(IILc/a/a/a/f2/k;)V

    return-void
.end method

.method public f(ILjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/i0/e$b;->a:Lc/a/a/a/f2/i0/e;

    invoke-virtual {v0, p1, p2}, Lc/a/a/a/f2/i0/e;->H(ILjava/lang/String;)V

    return-void
.end method

.method public g(IJJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/i0/e$b;->a:Lc/a/a/a/f2/i0/e;

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lc/a/a/a/f2/i0/e;->G(IJJ)V

    return-void
.end method

.method public h(IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/f2/i0/e$b;->a:Lc/a/a/a/f2/i0/e;

    invoke-virtual {v0, p1, p2, p3}, Lc/a/a/a/f2/i0/e;->x(IJ)V

    return-void
.end method
