.class final Lc/a/a/a/k2/t/h;
.super Ljava/lang/Object;
.source "TtmlSubtitle.java"

# interfaces
.implements Lc/a/a/a/k2/f;


# instance fields
.field private final a:Lc/a/a/a/k2/t/d;

.field private final b:[J

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/k2/t/g;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/k2/t/e;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc/a/a/a/k2/t/d;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/a/k2/t/d;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/k2/t/g;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/a/k2/t/e;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/k2/t/h;->a:Lc/a/a/a/k2/t/d;

    .line 3
    iput-object p3, p0, Lc/a/a/a/k2/t/h;->d:Ljava/util/Map;

    .line 4
    iput-object p4, p0, Lc/a/a/a/k2/t/h;->e:Ljava/util/Map;

    if-eqz p2, :cond_0

    .line 5
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Lc/a/a/a/k2/t/h;->c:Ljava/util/Map;

    .line 6
    invoke-virtual {p1}, Lc/a/a/a/k2/t/d;->j()[J

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/k2/t/h;->b:[J

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/h;->b:[J

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1, v1}, Lc/a/a/a/m2/m0;->d([JJZZ)I

    move-result p1

    .line 2
    iget-object p2, p0, Lc/a/a/a/k2/t/h;->b:[J

    array-length p2, p2

    if-ge p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public b(I)J
    .locals 3

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/h;->b:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public c(J)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lc/a/a/a/k2/c;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/h;->a:Lc/a/a/a/k2/t/d;

    iget-object v3, p0, Lc/a/a/a/k2/t/h;->c:Ljava/util/Map;

    iget-object v4, p0, Lc/a/a/a/k2/t/h;->d:Ljava/util/Map;

    iget-object v5, p0, Lc/a/a/a/k2/t/h;->e:Ljava/util/Map;

    move-wide v1, p1

    invoke-virtual/range {v0 .. v5}, Lc/a/a/a/k2/t/d;->h(JLjava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/k2/t/h;->b:[J

    array-length v0, v0

    return v0
.end method
