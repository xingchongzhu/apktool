.class public final Lc/a/b/a/i;
.super Ljava/lang/Object;
.source "Splitter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/b/a/i$b;,
        Lc/a/b/a/i$c;
    }
.end annotation


# instance fields
.field private final a:Lc/a/b/a/b;

.field private final b:Z

.field private final c:Lc/a/b/a/i$c;

.field private final d:I


# direct methods
.method private constructor <init>(Lc/a/b/a/i$c;)V
    .locals 3

    .line 1
    invoke-static {}, Lc/a/b/a/b;->f()Lc/a/b/a/b;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7fffffff

    invoke-direct {p0, p1, v1, v0, v2}, Lc/a/b/a/i;-><init>(Lc/a/b/a/i$c;ZLc/a/b/a/b;I)V

    return-void
.end method

.method private constructor <init>(Lc/a/b/a/i$c;ZLc/a/b/a/b;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc/a/b/a/i;->c:Lc/a/b/a/i$c;

    .line 4
    iput-boolean p2, p0, Lc/a/b/a/i;->b:Z

    .line 5
    iput-object p3, p0, Lc/a/b/a/i;->a:Lc/a/b/a/b;

    .line 6
    iput p4, p0, Lc/a/b/a/i;->d:I

    return-void
.end method

.method static synthetic a(Lc/a/b/a/i;)Lc/a/b/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/b/a/i;->a:Lc/a/b/a/b;

    return-object p0
.end method

.method static synthetic b(Lc/a/b/a/i;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lc/a/b/a/i;->b:Z

    return p0
.end method

.method static synthetic c(Lc/a/b/a/i;)I
    .locals 0

    .line 1
    iget p0, p0, Lc/a/b/a/i;->d:I

    return p0
.end method

.method public static d(C)Lc/a/b/a/i;
    .locals 0

    .line 1
    invoke-static {p0}, Lc/a/b/a/b;->d(C)Lc/a/b/a/b;

    move-result-object p0

    invoke-static {p0}, Lc/a/b/a/i;->e(Lc/a/b/a/b;)Lc/a/b/a/i;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lc/a/b/a/b;)Lc/a/b/a/i;
    .locals 2

    .line 1
    invoke-static {p0}, Lc/a/b/a/g;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lc/a/b/a/i;

    new-instance v1, Lc/a/b/a/i$a;

    invoke-direct {v1, p0}, Lc/a/b/a/i$a;-><init>(Lc/a/b/a/b;)V

    invoke-direct {v0, v1}, Lc/a/b/a/i;-><init>(Lc/a/b/a/i$c;)V

    return-object v0
.end method

.method private g(Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/a/i;->c:Lc/a/b/a/i$c;

    invoke-interface {v0, p0, p1}, Lc/a/b/a/i$c;->a(Lc/a/b/a/i;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public f(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lc/a/b/a/g;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-direct {p0, p1}, Lc/a/b/a/i;->g(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
