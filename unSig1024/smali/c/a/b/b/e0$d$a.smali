.class Lc/a/b/b/e0$d$a;
.super Lc/a/b/b/e0$c;
.source "MultimapBuilder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/b/b/e0$d;->b(I)Lc/a/b/b/e0$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/b/b/e0$c<",
        "TK0;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lc/a/b/b/e0$d;


# direct methods
.method constructor <init>(Lc/a/b/b/e0$d;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/b/b/e0$d$a;->b:Lc/a/b/b/e0$d;

    iput p2, p0, Lc/a/b/b/e0$d$a;->a:I

    invoke-direct {p0}, Lc/a/b/b/e0$c;-><init>()V

    return-void
.end method


# virtual methods
.method public c()Lc/a/b/b/y;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:TK0;V:",
            "Ljava/lang/Object;",
            ">()",
            "Lc/a/b/b/y<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/e0$d$a;->b:Lc/a/b/b/e0$d;

    .line 2
    invoke-virtual {v0}, Lc/a/b/b/e0$d;->c()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Lc/a/b/b/e0$b;

    iget v2, p0, Lc/a/b/b/e0$d$a;->a:I

    invoke-direct {v1, v2}, Lc/a/b/b/e0$b;-><init>(I)V

    .line 3
    invoke-static {v0, v1}, Lc/a/b/b/f0;->b(Ljava/util/Map;Lc/a/b/a/k;)Lc/a/b/b/y;

    move-result-object v0

    return-object v0
.end method
