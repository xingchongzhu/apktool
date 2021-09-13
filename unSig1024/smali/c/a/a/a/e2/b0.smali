.class public final Lc/a/a/a/e2/b0;
.super Ljava/lang/Object;
.source "ErrorStateDrmSession.java"

# interfaces
.implements Lc/a/a/a/e2/v;


# instance fields
.field private final a:Lc/a/a/a/e2/v$a;


# direct methods
.method public constructor <init>(Lc/a/a/a/e2/v$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/e2/v$a;

    iput-object p1, p0, Lc/a/a/a/e2/b0;->a:Lc/a/a/a/e2/v$a;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b(Lc/a/a/a/e2/w$a;)V
    .locals 0

    return-void
.end method

.method public c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Lc/a/a/a/e2/w$a;)V
    .locals 0

    return-void
.end method

.method public final e()Ljava/util/UUID;
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/i0;->a:Ljava/util/UUID;

    return-object v0
.end method

.method public f()Lc/a/a/a/e2/c0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public g()Lc/a/a/a/e2/v$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/e2/b0;->a:Lc/a/a/a/e2/v$a;

    return-object v0
.end method

.method public getState()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
