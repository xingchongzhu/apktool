.class public final Lc/a/a/a/b2/m$b;
.super Ljava/lang/Object;
.source "Ac4Util.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/b2/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I


# direct methods
.method private constructor <init>(IIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lc/a/a/a/b2/m$b;->a:I

    .line 4
    iput p2, p0, Lc/a/a/a/b2/m$b;->c:I

    .line 5
    iput p3, p0, Lc/a/a/a/b2/m$b;->b:I

    .line 6
    iput p4, p0, Lc/a/a/a/b2/m$b;->d:I

    .line 7
    iput p5, p0, Lc/a/a/a/b2/m$b;->e:I

    return-void
.end method

.method synthetic constructor <init>(IIIIILc/a/a/a/b2/m$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lc/a/a/a/b2/m$b;-><init>(IIIII)V

    return-void
.end method
