.class public Lb/e/b/c;
.super Ljava/lang/Object;
.source "Cache.java"


# instance fields
.field a:Lb/e/b/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/e/b/f<",
            "Lb/e/b/b;",
            ">;"
        }
    .end annotation
.end field

.field b:Lb/e/b/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/e/b/f<",
            "Lb/e/b/b;",
            ">;"
        }
    .end annotation
.end field

.field c:Lb/e/b/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/e/b/f<",
            "Lb/e/b/i;",
            ">;"
        }
    .end annotation
.end field

.field d:[Lb/e/b/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lb/e/b/g;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Lb/e/b/g;-><init>(I)V

    iput-object v0, p0, Lb/e/b/c;->a:Lb/e/b/f;

    .line 3
    new-instance v0, Lb/e/b/g;

    invoke-direct {v0, v1}, Lb/e/b/g;-><init>(I)V

    iput-object v0, p0, Lb/e/b/c;->b:Lb/e/b/f;

    .line 4
    new-instance v0, Lb/e/b/g;

    invoke-direct {v0, v1}, Lb/e/b/g;-><init>(I)V

    iput-object v0, p0, Lb/e/b/c;->c:Lb/e/b/f;

    const/16 v0, 0x20

    new-array v0, v0, [Lb/e/b/i;

    .line 5
    iput-object v0, p0, Lb/e/b/c;->d:[Lb/e/b/i;

    return-void
.end method
