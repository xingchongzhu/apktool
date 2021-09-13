.class abstract Lc/a/c/i/b/g;
.super Ljava/lang/Object;
.source "Token.java"


# static fields
.field static final a:Lc/a/c/i/b/g;


# instance fields
.field private final b:Lc/a/c/i/b/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lc/a/c/i/b/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lc/a/c/i/b/e;-><init>(Lc/a/c/i/b/g;II)V

    sput-object v0, Lc/a/c/i/b/g;->a:Lc/a/c/i/b/g;

    return-void
.end method

.method constructor <init>(Lc/a/c/i/b/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/c/i/b/g;->b:Lc/a/c/i/b/g;

    return-void
.end method


# virtual methods
.method final a(II)Lc/a/c/i/b/g;
    .locals 1

    .line 1
    new-instance v0, Lc/a/c/i/b/e;

    invoke-direct {v0, p0, p1, p2}, Lc/a/c/i/b/e;-><init>(Lc/a/c/i/b/g;II)V

    return-object v0
.end method

.method final b(II)Lc/a/c/i/b/g;
    .locals 1

    .line 1
    new-instance v0, Lc/a/c/i/b/b;

    invoke-direct {v0, p0, p1, p2}, Lc/a/c/i/b/b;-><init>(Lc/a/c/i/b/g;II)V

    return-object v0
.end method

.method abstract c(Lc/a/c/j/a;[B)V
.end method

.method final d()Lc/a/c/i/b/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/c/i/b/g;->b:Lc/a/c/i/b/g;

    return-object v0
.end method
