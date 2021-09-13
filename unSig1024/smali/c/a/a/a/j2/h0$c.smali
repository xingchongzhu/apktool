.class final Lc/a/a/a/j2/h0$c;
.super Ljava/lang/Object;
.source "ProgressiveMediaPeriod.java"

# interfaces
.implements Lc/a/a/a/j2/l0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/j2/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final a:I

.field final synthetic b:Lc/a/a/a/j2/h0;


# direct methods
.method public constructor <init>(Lc/a/a/a/j2/h0;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/j2/h0$c;->b:Lc/a/a/a/j2/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lc/a/a/a/j2/h0$c;->a:I

    return-void
.end method

.method static synthetic d(Lc/a/a/a/j2/h0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/a/a/j2/h0$c;->a:I

    return p0
.end method


# virtual methods
.method public a(Lc/a/a/a/v0;Lc/a/a/a/c2/f;Z)I
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/h0$c;->b:Lc/a/a/a/j2/h0;

    iget v1, p0, Lc/a/a/a/j2/h0$c;->a:I

    invoke-virtual {v0, v1, p1, p2, p3}, Lc/a/a/a/j2/h0;->b0(ILc/a/a/a/v0;Lc/a/a/a/c2/f;Z)I

    move-result p1

    return p1
.end method

.method public b()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/h0$c;->b:Lc/a/a/a/j2/h0;

    iget v1, p0, Lc/a/a/a/j2/h0$c;->a:I

    invoke-virtual {v0, v1}, Lc/a/a/a/j2/h0;->W(I)V

    return-void
.end method

.method public c(J)I
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/h0$c;->b:Lc/a/a/a/j2/h0;

    iget v1, p0, Lc/a/a/a/j2/h0$c;->a:I

    invoke-virtual {v0, v1, p1, p2}, Lc/a/a/a/j2/h0;->f0(IJ)I

    move-result p1

    return p1
.end method

.method public e()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/h0$c;->b:Lc/a/a/a/j2/h0;

    iget v1, p0, Lc/a/a/a/j2/h0$c;->a:I

    invoke-virtual {v0, v1}, Lc/a/a/a/j2/h0;->M(I)Z

    move-result v0

    return v0
.end method
