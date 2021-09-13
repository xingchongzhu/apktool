.class public final Lc/a/c/i/b/a;
.super Ljava/lang/Object;
.source "AztecCode.java"


# instance fields
.field private a:Z

.field private b:I

.field private c:I

.field private d:I

.field private e:Lc/a/c/j/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lc/a/c/j/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/c/i/b/a;->e:Lc/a/c/j/b;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc/a/c/i/b/a;->d:I

    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc/a/c/i/b/a;->a:Z

    return-void
.end method

.method public d(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc/a/c/i/b/a;->c:I

    return-void
.end method

.method public e(Lc/a/c/j/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/c/i/b/a;->e:Lc/a/c/j/b;

    return-void
.end method

.method public f(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc/a/c/i/b/a;->b:I

    return-void
.end method
