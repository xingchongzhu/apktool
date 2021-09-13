.class final Lc/a/a/a/k2/e;
.super Lc/a/a/a/k2/k;
.source "SimpleSubtitleOutputBuffer.java"


# instance fields
.field private final f:Lc/a/a/a/c2/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/a/a/c2/h$a<",
            "Lc/a/a/a/k2/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc/a/a/a/c2/h$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/c2/h$a<",
            "Lc/a/a/a/k2/k;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/a/a/k2/k;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/k2/e;->f:Lc/a/a/a/c2/h$a;

    return-void
.end method


# virtual methods
.method public final n()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/e;->f:Lc/a/a/a/c2/h$a;

    invoke-interface {v0, p0}, Lc/a/a/a/c2/h$a;->a(Lc/a/a/a/c2/h;)V

    return-void
.end method
