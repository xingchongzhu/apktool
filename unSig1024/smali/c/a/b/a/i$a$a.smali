.class Lc/a/b/a/i$a$a;
.super Lc/a/b/a/i$b;
.source "Splitter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/b/a/i$a;->b(Lc/a/b/a/i;Ljava/lang/CharSequence;)Lc/a/b/a/i$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic h:Lc/a/b/a/i$a;


# direct methods
.method constructor <init>(Lc/a/b/a/i$a;Lc/a/b/a/i;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/b/a/i$a$a;->h:Lc/a/b/a/i$a;

    invoke-direct {p0, p2, p3}, Lc/a/b/a/i$b;-><init>(Lc/a/b/a/i;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method e(I)I
    .locals 0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method f(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/b/a/i$a$a;->h:Lc/a/b/a/i$a;

    iget-object v0, v0, Lc/a/b/a/i$a;->a:Lc/a/b/a/b;

    iget-object v1, p0, Lc/a/b/a/i$b;->c:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, p1}, Lc/a/b/a/b;->c(Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method
