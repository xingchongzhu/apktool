.class public abstract Lc/a/b/b/m;
.super Ljava/lang/Object;
.source "ComparisonChain.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/b/b/m$b;
    }
.end annotation


# static fields
.field private static final a:Lc/a/b/b/m;

.field private static final b:Lc/a/b/b/m;

.field private static final c:Lc/a/b/b/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc/a/b/b/m$a;

    invoke-direct {v0}, Lc/a/b/b/m$a;-><init>()V

    sput-object v0, Lc/a/b/b/m;->a:Lc/a/b/b/m;

    .line 2
    new-instance v0, Lc/a/b/b/m$b;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lc/a/b/b/m$b;-><init>(I)V

    sput-object v0, Lc/a/b/b/m;->b:Lc/a/b/b/m;

    .line 3
    new-instance v0, Lc/a/b/b/m$b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lc/a/b/b/m$b;-><init>(I)V

    sput-object v0, Lc/a/b/b/m;->c:Lc/a/b/b/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lc/a/b/b/m$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/b/b/m;-><init>()V

    return-void
.end method

.method static synthetic a()Lc/a/b/b/m;
    .locals 1

    .line 1
    sget-object v0, Lc/a/b/b/m;->b:Lc/a/b/b/m;

    return-object v0
.end method

.method static synthetic b()Lc/a/b/b/m;
    .locals 1

    .line 1
    sget-object v0, Lc/a/b/b/m;->c:Lc/a/b/b/m;

    return-object v0
.end method

.method static synthetic c()Lc/a/b/b/m;
    .locals 1

    .line 1
    sget-object v0, Lc/a/b/b/m;->a:Lc/a/b/b/m;

    return-object v0
.end method

.method public static j()Lc/a/b/b/m;
    .locals 1

    .line 1
    sget-object v0, Lc/a/b/b/m;->a:Lc/a/b/b/m;

    return-object v0
.end method


# virtual methods
.method public abstract d(II)Lc/a/b/b/m;
.end method

.method public abstract e(JJ)Lc/a/b/b/m;
.end method

.method public abstract f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lc/a/b/b/m;
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lc/a/b/b/m;"
        }
    .end annotation
.end method

.method public abstract g(ZZ)Lc/a/b/b/m;
.end method

.method public abstract h(ZZ)Lc/a/b/b/m;
.end method

.method public abstract i()I
.end method
