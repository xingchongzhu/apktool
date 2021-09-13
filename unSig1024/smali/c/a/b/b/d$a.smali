.class Lc/a/b/b/d$a;
.super Lc/a/b/b/d$c;
.source "AbstractMapBasedMultimap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/b/b/d;->g()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/b/b/d<",
        "TK;TV;>.c<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic f:Lc/a/b/b/d;


# direct methods
.method constructor <init>(Lc/a/b/b/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/b/b/d$a;->f:Lc/a/b/b/d;

    invoke-direct {p0, p1}, Lc/a/b/b/d$c;-><init>(Lc/a/b/b/d;)V

    return-void
.end method


# virtual methods
.method a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    return-object p2
.end method
