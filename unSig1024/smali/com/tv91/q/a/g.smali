.class public final Lcom/tv91/q/a/g;
.super Ljava/lang/Object;
.source "ErrorHandler.java"

# interfaces
.implements Lb/g/j/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb/g/j/a<",
        "Lcom/tv91/s/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/EnumMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumMap<",
            "Lcom/tv91/s/d;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;>;"
        }
    .end annotation
.end field

.field private c:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-class v0, Lcom/tv91/s/d;

    const/16 v1, 0xf

    new-array v1, v1, [Ljava/util/Map$Entry;

    sget-object v2, Lcom/tv91/s/d;->a:Lcom/tv91/s/d;

    const v3, 0x7f120077

    .line 2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lcom/tv91/s/d;->b:Lcom/tv91/s/d;

    const v4, 0x7f120076

    .line 3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    sget-object v2, Lcom/tv91/s/d;->c:Lcom/tv91/s/d;

    const v4, 0x7f120087

    .line 4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/4 v4, 0x2

    aput-object v2, v1, v4

    sget-object v2, Lcom/tv91/s/d;->d:Lcom/tv91/s/d;

    const v4, 0x7f120081

    .line 5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/4 v4, 0x3

    aput-object v2, v1, v4

    sget-object v2, Lcom/tv91/s/d;->e:Lcom/tv91/s/d;

    const v4, 0x7f120089

    .line 6
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/4 v4, 0x4

    aput-object v2, v1, v4

    sget-object v2, Lcom/tv91/s/d;->f:Lcom/tv91/s/d;

    const v4, 0x7f120079

    .line 7
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/4 v4, 0x5

    aput-object v2, v1, v4

    sget-object v2, Lcom/tv91/s/d;->g:Lcom/tv91/s/d;

    const v4, 0x7f120088

    .line 8
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/4 v4, 0x6

    aput-object v2, v1, v4

    sget-object v2, Lcom/tv91/s/d;->h:Lcom/tv91/s/d;

    const v4, 0x7f12007b

    .line 9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/4 v4, 0x7

    aput-object v2, v1, v4

    sget-object v2, Lcom/tv91/s/d;->i:Lcom/tv91/s/d;

    const v4, 0x7f120078

    .line 10
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/16 v4, 0x8

    aput-object v2, v1, v4

    sget-object v2, Lcom/tv91/s/d;->j:Lcom/tv91/s/d;

    const v4, 0x7f120082

    .line 11
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/16 v4, 0x9

    aput-object v2, v1, v4

    sget-object v2, Lcom/tv91/s/d;->k:Lcom/tv91/s/d;

    const v4, 0x7f120083

    .line 12
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/16 v4, 0xa

    aput-object v2, v1, v4

    sget-object v2, Lcom/tv91/s/d;->l:Lcom/tv91/s/d;

    const v4, 0x7f12008a

    .line 13
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/16 v4, 0xb

    aput-object v2, v1, v4

    sget-object v2, Lcom/tv91/s/d;->m:Lcom/tv91/s/d;

    const v4, 0x7f12007e

    .line 14
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/16 v4, 0xc

    aput-object v2, v1, v4

    sget-object v2, Lcom/tv91/s/d;->n:Lcom/tv91/s/d;

    const v4, 0x7f12007f

    .line 15
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/16 v4, 0xd

    aput-object v2, v1, v4

    sget-object v2, Lcom/tv91/s/d;->o:Lcom/tv91/s/d;

    .line 16
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/16 v3, 0xe

    aput-object v2, v1, v3

    .line 17
    invoke-static {v0, v1}, Lcom/tv91/utils/d;->b(Ljava/lang/Class;[Ljava/util/Map$Entry;)Ljava/util/EnumMap;

    move-result-object v0

    sput-object v0, Lcom/tv91/q/a/g;->a:Ljava/util/EnumMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/tv91/q/a/g;->b:Ljava/util/Map;

    .line 3
    sget-object v0, Lcom/tv91/q/a/a;->a:Lcom/tv91/q/a/a;

    iput-object v0, p0, Lcom/tv91/q/a/g;->c:Lb/g/j/a;

    .line 4
    sget-object v0, Lcom/tv91/q/a/b;->a:Lcom/tv91/q/a/b;

    iput-object v0, p0, Lcom/tv91/q/a/g;->d:Lb/g/j/a;

    .line 5
    sget-object v0, Lcom/tv91/q/a/d;->a:Lcom/tv91/q/a/d;

    iput-object v0, p0, Lcom/tv91/q/a/g;->e:Lb/g/j/a;

    return-void
.end method

.method public static d(Lb/g/j/a;)Lcom/tv91/q/a/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;)",
            "Lcom/tv91/q/a/g;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tv91/q/a/g;

    invoke-direct {v0}, Lcom/tv91/q/a/g;-><init>()V

    .line 2
    new-instance v1, Lcom/tv91/q/a/c;

    invoke-direct {v1, p0}, Lcom/tv91/q/a/c;-><init>(Lb/g/j/a;)V

    iput-object v1, v0, Lcom/tv91/q/a/g;->e:Lb/g/j/a;

    return-object v0
.end method

.method static synthetic f(Lb/g/j/a;Lcom/tv91/s/c;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/tv91/s/c;->c()Ljava/lang/Exception;

    move-result-object v0

    invoke-static {v0}, Lh/a/a;->c(Ljava/lang/Throwable;)V

    .line 2
    invoke-interface {p0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic g(Ljava/lang/Integer;)V
    .locals 0

    return-void
.end method

.method static synthetic h(Lcom/tv91/s/c;)V
    .locals 0

    return-void
.end method

.method static synthetic i(Lcom/tv91/s/c;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tv91/s/c;

    invoke-virtual {p0, p1}, Lcom/tv91/q/a/g;->b(Lcom/tv91/s/c;)V

    return-void
.end method

.method public b(Lcom/tv91/s/c;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/tv91/s/c;->e()Lcom/tv91/s/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tv91/q/a/g;->c:Lb/g/j/a;

    sget-object v1, Lcom/tv91/q/a/g;->a:Ljava/util/EnumMap;

    invoke-virtual {v1, v0}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/tv91/s/c;->c()Ljava/lang/Exception;

    move-result-object v0

    instance-of v0, v0, Lcom/tv91/s/g;

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/tv91/q/a/g;->d:Lb/g/j/a;

    invoke-interface {v0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/tv91/q/a/g;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/tv91/s/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/g/j/a;

    if-eqz v0, :cond_2

    .line 6
    invoke-interface {v0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/tv91/q/a/g;->e:Lb/g/j/a;

    invoke-interface {v0, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;Lb/g/j/a;)Lcom/tv91/q/a/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;)",
            "Lcom/tv91/q/a/g;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/q/a/g;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tv91/q/a/g;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "0000001"

    .line 3
    invoke-static {v0, p1}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/tv91/q/a/g;->b:Ljava/util/Map;

    const-string v0, "NotLogin"

    .line 4
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/tv91/q/a/g;->b:Ljava/util/Map;

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public e(Lb/g/j/a;)Lcom/tv91/q/a/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/tv91/q/a/g;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/q/a/g;->c:Lb/g/j/a;

    return-object p0
.end method

.method public j(Lb/g/j/a;)Lcom/tv91/q/a/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/a<",
            "Lcom/tv91/s/c;",
            ">;)",
            "Lcom/tv91/q/a/g;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tv91/q/a/g;->d:Lb/g/j/a;

    return-object p0
.end method
