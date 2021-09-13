.class final Lc/a/a/a/j2/y$a;
.super Lc/a/a/a/j2/u;
.source "MaskingMediaSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/j2/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field public static final c:Ljava/lang/Object;


# instance fields
.field private final d:Ljava/lang/Object;

.field private final e:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lc/a/a/a/j2/y$a;->c:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lc/a/a/a/x1;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc/a/a/a/j2/u;-><init>(Lc/a/a/a/x1;)V

    .line 2
    iput-object p2, p0, Lc/a/a/a/j2/y$a;->d:Ljava/lang/Object;

    .line 3
    iput-object p3, p0, Lc/a/a/a/j2/y$a;->e:Ljava/lang/Object;

    return-void
.end method

.method static synthetic s(Lc/a/a/a/j2/y$a;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/a/a/a/j2/y$a;->e:Ljava/lang/Object;

    return-object p0
.end method

.method public static u(Lc/a/a/a/z0;)Lc/a/a/a/j2/y$a;
    .locals 3

    .line 1
    new-instance v0, Lc/a/a/a/j2/y$a;

    new-instance v1, Lc/a/a/a/j2/y$b;

    invoke-direct {v1, p0}, Lc/a/a/a/j2/y$b;-><init>(Lc/a/a/a/z0;)V

    sget-object p0, Lc/a/a/a/x1$c;->a:Ljava/lang/Object;

    sget-object v2, Lc/a/a/a/j2/y$a;->c:Ljava/lang/Object;

    invoke-direct {v0, v1, p0, v2}, Lc/a/a/a/j2/y$a;-><init>(Lc/a/a/a/x1;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static v(Lc/a/a/a/x1;Ljava/lang/Object;Ljava/lang/Object;)Lc/a/a/a/j2/y$a;
    .locals 1

    .line 1
    new-instance v0, Lc/a/a/a/j2/y$a;

    invoke-direct {v0, p0, p1, p2}, Lc/a/a/a/j2/y$a;-><init>(Lc/a/a/a/x1;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/u;->b:Lc/a/a/a/x1;

    .line 2
    sget-object v1, Lc/a/a/a/j2/y$a;->c:Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lc/a/a/a/j2/y$a;->e:Ljava/lang/Object;

    if-eqz v1, :cond_0

    move-object p1, v1

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Lc/a/a/a/x1;->b(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public g(ILc/a/a/a/x1$b;Z)Lc/a/a/a/x1$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/u;->b:Lc/a/a/a/x1;

    invoke-virtual {v0, p1, p2, p3}, Lc/a/a/a/x1;->g(ILc/a/a/a/x1$b;Z)Lc/a/a/a/x1$b;

    .line 2
    iget-object p1, p2, Lc/a/a/a/x1$b;->b:Ljava/lang/Object;

    iget-object v0, p0, Lc/a/a/a/j2/y$a;->e:Ljava/lang/Object;

    invoke-static {p1, v0}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    .line 3
    sget-object p1, Lc/a/a/a/j2/y$a;->c:Ljava/lang/Object;

    iput-object p1, p2, Lc/a/a/a/x1$b;->b:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public m(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/u;->b:Lc/a/a/a/x1;

    invoke-virtual {v0, p1}, Lc/a/a/a/x1;->m(I)Ljava/lang/Object;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lc/a/a/a/j2/y$a;->e:Ljava/lang/Object;

    invoke-static {p1, v0}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lc/a/a/a/j2/y$a;->c:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public o(ILc/a/a/a/x1$c;J)Lc/a/a/a/x1$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/j2/u;->b:Lc/a/a/a/x1;

    invoke-virtual {v0, p1, p2, p3, p4}, Lc/a/a/a/x1;->o(ILc/a/a/a/x1$c;J)Lc/a/a/a/x1$c;

    .line 2
    iget-object p1, p2, Lc/a/a/a/x1$c;->c:Ljava/lang/Object;

    iget-object p3, p0, Lc/a/a/a/j2/y$a;->d:Ljava/lang/Object;

    invoke-static {p1, p3}, Lc/a/a/a/m2/m0;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    sget-object p1, Lc/a/a/a/x1$c;->a:Ljava/lang/Object;

    iput-object p1, p2, Lc/a/a/a/x1$c;->c:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public t(Lc/a/a/a/x1;)Lc/a/a/a/j2/y$a;
    .locals 3

    .line 1
    new-instance v0, Lc/a/a/a/j2/y$a;

    iget-object v1, p0, Lc/a/a/a/j2/y$a;->d:Ljava/lang/Object;

    iget-object v2, p0, Lc/a/a/a/j2/y$a;->e:Ljava/lang/Object;

    invoke-direct {v0, p1, v1, v2}, Lc/a/a/a/j2/y$a;-><init>(Lc/a/a/a/x1;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
