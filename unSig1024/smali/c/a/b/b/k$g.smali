.class final Lc/a/b/b/k$g;
.super Lc/a/b/b/e;
.source "CompactHashMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/b/b/e<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation
.end field

.field private b:I

.field final synthetic c:Lc/a/b/b/k;


# direct methods
.method constructor <init>(Lc/a/b/b/k;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/b/b/k$g;->c:Lc/a/b/b/k;

    invoke-direct {p0}, Lc/a/b/b/e;-><init>()V

    .line 2
    iget-object p1, p1, Lc/a/b/b/k;->c:[Ljava/lang/Object;

    aget-object p1, p1, p2

    iput-object p1, p0, Lc/a/b/b/k$g;->a:Ljava/lang/Object;

    .line 3
    iput p2, p0, Lc/a/b/b/k$g;->b:I

    return-void
.end method

.method private a()V
    .locals 3

    .line 1
    iget v0, p0, Lc/a/b/b/k$g;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lc/a/b/b/k$g;->c:Lc/a/b/b/k;

    .line 2
    invoke-virtual {v1}, Lc/a/b/b/k;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lc/a/b/b/k$g;->a:Ljava/lang/Object;

    iget-object v1, p0, Lc/a/b/b/k$g;->c:Lc/a/b/b/k;

    iget-object v1, v1, Lc/a/b/b/k;->c:[Ljava/lang/Object;

    iget v2, p0, Lc/a/b/b/k$g;->b:I

    aget-object v1, v1, v2

    .line 3
    invoke-static {v0, v1}, Lc/a/b/a/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    :cond_0
    iget-object v0, p0, Lc/a/b/b/k$g;->c:Lc/a/b/b/k;

    iget-object v1, p0, Lc/a/b/b/k$g;->a:Ljava/lang/Object;

    invoke-static {v0, v1}, Lc/a/b/b/k;->c(Lc/a/b/b/k;Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lc/a/b/b/k$g;->b:I

    :cond_1
    return-void
.end method


# virtual methods
.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/k$g;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/b/b/k$g;->a()V

    .line 2
    iget v0, p0, Lc/a/b/b/k$g;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lc/a/b/b/k$g;->c:Lc/a/b/b/k;

    iget-object v1, v1, Lc/a/b/b/k;->d:[Ljava/lang/Object;

    aget-object v0, v1, v0

    :goto_0
    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TV;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lc/a/b/b/k$g;->a()V

    .line 2
    iget v0, p0, Lc/a/b/b/k$g;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lc/a/b/b/k$g;->c:Lc/a/b/b/k;

    iget-object v1, p0, Lc/a/b/b/k$g;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Lc/a/b/b/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    iget-object v1, p0, Lc/a/b/b/k$g;->c:Lc/a/b/b/k;

    iget-object v1, v1, Lc/a/b/b/k;->d:[Ljava/lang/Object;

    aget-object v2, v1, v0

    .line 5
    aput-object p1, v1, v0

    return-object v2
.end method
