.class final Lc/a/a/a/m2/s$c;
.super Ljava/lang/Object;
.source "ListenerSet.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/m2/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "E:",
        "Lc/a/a/a/m2/x;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private b:Lc/a/a/a/m2/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field private c:Z

.field private d:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lc/a/b/a/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lc/a/b/a/k<",
            "TE;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/m2/s$c;->a:Ljava/lang/Object;

    .line 3
    invoke-interface {p2}, Lc/a/b/a/k;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/m2/x;

    iput-object p1, p0, Lc/a/a/a/m2/s$c;->b:Lc/a/a/a/m2/x;

    return-void
.end method


# virtual methods
.method public a(ILc/a/a/a/m2/s$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lc/a/a/a/m2/s$a<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/m2/s$c;->d:Z

    if-nez v0, :cond_1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/m2/s$c;->b:Lc/a/a/a/m2/x;

    invoke-virtual {v0, p1}, Lc/a/a/a/m2/x;->a(I)V

    :cond_0
    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lc/a/a/a/m2/s$c;->c:Z

    .line 4
    iget-object p1, p0, Lc/a/a/a/m2/s$c;->a:Ljava/lang/Object;

    invoke-interface {p2, p1}, Lc/a/a/a/m2/s$a;->a(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public b(Lc/a/b/a/k;Lc/a/a/a/m2/s$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/b/a/k<",
            "TE;>;",
            "Lc/a/a/a/m2/s$b<",
            "TT;TE;>;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lc/a/a/a/m2/s$c;->d:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lc/a/a/a/m2/s$c;->c:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/a/a/a/m2/s$c;->b:Lc/a/a/a/m2/x;

    .line 3
    invoke-interface {p1}, Lc/a/b/a/k;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/m2/x;

    iput-object p1, p0, Lc/a/a/a/m2/s$c;->b:Lc/a/a/a/m2/x;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lc/a/a/a/m2/s$c;->c:Z

    .line 5
    iget-object p1, p0, Lc/a/a/a/m2/s$c;->a:Ljava/lang/Object;

    invoke-interface {p2, p1, v0}, Lc/a/a/a/m2/s$b;->a(Ljava/lang/Object;Lc/a/a/a/m2/x;)V

    :cond_0
    return-void
.end method

.method public c(Lc/a/a/a/m2/s$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/m2/s$b<",
            "TT;TE;>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/a/a/a/m2/s$c;->d:Z

    .line 2
    iget-boolean v0, p0, Lc/a/a/a/m2/s$c;->c:Z

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lc/a/a/a/m2/s$c;->a:Ljava/lang/Object;

    iget-object v1, p0, Lc/a/a/a/m2/s$c;->b:Lc/a/a/a/m2/x;

    invoke-interface {p1, v0, v1}, Lc/a/a/a/m2/s$b;->a(Ljava/lang/Object;Lc/a/a/a/m2/x;)V

    :cond_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 1
    const-class v0, Lc/a/a/a/m2/s$c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 2
    :cond_1
    iget-object v0, p0, Lc/a/a/a/m2/s$c;->a:Ljava/lang/Object;

    check-cast p1, Lc/a/a/a/m2/s$c;

    iget-object p1, p1, Lc/a/a/a/m2/s$c;->a:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/m2/s$c;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
