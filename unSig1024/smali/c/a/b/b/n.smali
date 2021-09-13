.class Lc/a/b/b/n;
.super Lc/a/b/b/s;
.source "EmptyImmutableListMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/b/b/s<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field static final f:Lc/a/b/b/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc/a/b/b/n;

    invoke-direct {v0}, Lc/a/b/b/n;-><init>()V

    sput-object v0, Lc/a/b/b/n;->f:Lc/a/b/b/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-static {}, Lc/a/b/b/t;->j()Lc/a/b/b/t;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lc/a/b/b/s;-><init>(Lc/a/b/b/t;I)V

    return-void
.end method
