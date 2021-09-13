.class public final synthetic Lcom/tv91/z/a;
.super Ljava/lang/Object;
.source "Api.java"


# direct methods
.method public static A(Lcom/tv91/z/b;IIII)Lcom/tv91/model/Paging;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII)",
            "Lcom/tv91/model/Paging<",
            "Lcom/tv91/model/Movie;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->i:Lcom/tv91/z/b$a;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/util/Map$Entry;

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v2, "PageIndex"

    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "PageSize"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "TypeId"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "SourceId"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v1, p2

    .line 6
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lcom/tv91/model/Movie;

    invoke-interface {p0, p1, p2}, Lcom/tv91/z/b;->c(Ljava/lang/String;Ljava/lang/Class;)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1
.end method

.method public static B(Lcom/tv91/z/b;III[ILjava/lang/String;)Lcom/tv91/model/Paging;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III[I",
            "Ljava/lang/String;",
            ")",
            "Lcom/tv91/model/Paging<",
            "Lcom/tv91/model/Movie;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->h:Lcom/tv91/z/b$a;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/util/Map$Entry;

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v2, "PageIndex"

    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "PageSize"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "Type"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    const-string p1, "ID"

    .line 5
    invoke-static {p1, p4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v1, p2

    .line 6
    invoke-static {p5}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p5, ""

    :cond_0
    const-string p1, "Data"

    invoke-static {p1, p5}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, v1, p2

    .line 7
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lcom/tv91/model/Movie;

    invoke-interface {p0, p1, p2}, Lcom/tv91/z/b;->c(Ljava/lang/String;Ljava/lang/Class;)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1
.end method

.method public static C(Lcom/tv91/z/b;I)Ljava/util/List;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/tv91/model/Movie;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->j:Lcom/tv91/z/b$a;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/util/Map$Entry;

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v2, "Type"

    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    .line 3
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class v0, Lcom/tv91/model/Movie;

    invoke-interface {p0, p1, v0}, Lcom/tv91/z/b;->O(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public static D(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/tv91/model/PromotionReport;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->j0:Lcom/tv91/z/b$a;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lcom/tv91/model/PromotionReport;

    invoke-interface {p0, p1, p2}, Lcom/tv91/z/b;->O(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public static E(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;)Lcom/tv91/model/User;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->Q:Lcom/tv91/z/b$a;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lcom/tv91/model/User;

    invoke-interface {p0, p1, p2}, Lcom/tv91/z/b;->I(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/User;

    return-object p1
.end method

.method public static F(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;)Lcom/tv91/model/User;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->b:Lcom/tv91/z/b$a;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "Account"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Password"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lcom/tv91/model/User;

    invoke-interface {p0, p1, p2}, Lcom/tv91/z/b;->I(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/User;

    return-object p1
.end method

.method public static G(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;)Lcom/tv91/model/User;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->g0:Lcom/tv91/z/b$a;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "Phone"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "SMSCode"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lcom/tv91/model/User;

    invoke-interface {p0, p1, p2}, Lcom/tv91/z/b;->I(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/User;

    return-object p1
.end method

.method public static H(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->m:Lcom/tv91/z/b$a;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    const-string p1, "Password"

    .line 4
    invoke-static {p1, p3}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    return-void
.end method

.method public static I(Lcom/tv91/z/b;Ljava/lang/String;)Lcom/tv91/z/b$b;
    .locals 2
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tv91/s/f;,
            Lcom/tv91/s/a;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/tv91/z/b$b;->a(Ljava/lang/String;)Lcom/tv91/z/b$b;

    move-result-object p1

    .line 2
    iget-boolean v0, p1, Lcom/tv91/z/b$b;->b:Z

    if-eqz v0, :cond_0

    return-object p1

    .line 3
    :cond_0
    new-instance v0, Lcom/tv91/s/a;

    iget-object v1, p1, Lcom/tv91/z/b$b;->d:Ljava/lang/String;

    iget-object p1, p1, Lcom/tv91/z/b$b;->c:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Lcom/tv91/s/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0
.end method

.method public static J(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    move-result-object p1

    iget-object p1, p1, Lcom/tv91/z/b$b;->c:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/tv91/utils/Jsons;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public static K(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;
    .locals 0
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    move-result-object p1

    iget-object p1, p1, Lcom/tv91/z/b$b;->c:Ljava/lang/String;

    invoke-static {p2}, Lcom/tv91/utils/Jsons;->c(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/tv91/utils/Jsons;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public static L(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/Class;)Lcom/tv91/model/Paging;
    .locals 0
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/tv91/model/Paging<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    move-result-object p1

    iget-object p1, p1, Lcom/tv91/z/b$b;->c:Ljava/lang/String;

    invoke-static {p2}, Lcom/tv91/utils/Jsons;->d(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/tv91/utils/Jsons;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/Paging;

    return-object p1
.end method

.method public static M(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->o:Lcom/tv91/z/b$a;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "MovieID"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "BuyTypeID"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v1, p2

    if-gtz p5, :cond_0

    const-string p1, ""

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string p2, "SourceId"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, v1, p2

    .line 7
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    return-void
.end method

.method public static N(Lcom/tv91/z/b;I)Lcom/tv91/model/User;
    .locals 5
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->c0:Lcom/tv91/z/b$a;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/util/Map$Entry;

    const/4 v2, 0x1

    .line 2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "OS"

    invoke-static {v4, v3}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v3, "SID"

    invoke-static {v3, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    aput-object p1, v1, v2

    .line 4
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class v0, Lcom/tv91/model/User;

    invoke-interface {p0, p1, v0}, Lcom/tv91/z/b;->I(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/User;

    return-object p1
.end method

.method public static O(Lcom/tv91/z/b;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->l:Lcom/tv91/z/b$a;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/util/Map$Entry;

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v2, "SID"

    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "PID"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    const-string p1, "Account"

    .line 4
    invoke-static {p1, p3}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    const-string p1, "Password"

    .line 5
    invoke-static {p1, p4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v1, p2

    const-string p1, "NickName"

    .line 6
    invoke-static {p1, p5}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, v1, p2

    .line 7
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    return-void
.end method

.method public static P(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->x:Lcom/tv91/z/b$a;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "MovieID"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    return-void
.end method

.method public static Q(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 1
    invoke-static {p2}, Lcom/tv91/utils/g;->j(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v0, p2

    const-string p1, "%s?data=%s"

    invoke-static {p1, v0}, Lcom/tv91/utils/g;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/z/b;->G(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public static R(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->u:Lcom/tv91/z/b$a;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "ValidID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "ValidCode"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    const-string p1, "Password"

    .line 4
    invoke-static {p1, p3}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    return-void
.end method

.method public static S(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->d0:Lcom/tv91/z/b$a;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    const-string p1, "Phone"

    .line 4
    invoke-static {p1, p3}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    return-void
.end method

.method public static T(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->I:Lcom/tv91/z/b$a;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    const-string p1, "Message"

    .line 4
    invoke-static {p1, p3}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "Type"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v1, p2

    .line 6
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    return-void
.end method

.method public static U(Lcom/tv91/z/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->t:Lcom/tv91/z/b$a;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "Account"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    .line 3
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    move-result-object p1

    iget-object p1, p1, Lcom/tv91/z/b$b;->c:Ljava/lang/String;

    return-object p1
.end method

.method public static V(Lcom/tv91/z/b;Ljava/lang/String;)V
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->f0:Lcom/tv91/z/b$a;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "Phone"

    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    return-void
.end method

.method public static W(Lcom/tv91/z/b;Lcom/tv91/z/b$a;)Ljava/lang/String;
    .locals 1
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p0, p1, v0}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static X(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->k0:Lcom/tv91/z/b$a;

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "Type"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    const-string p1, "QQ"

    .line 5
    invoke-static {p1, p4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v1, p2

    const-string p1, "BankName"

    .line 6
    invoke-static {p1, p5}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, v1, p2

    const-string p1, "Branch"

    .line 7
    invoke-static {p1, p6}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x5

    aput-object p1, v1, p2

    const-string p1, "Name"

    .line 8
    invoke-static {p1, p7}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x6

    aput-object p1, v1, p2

    const-string p1, "Account"

    .line 9
    invoke-static {p1, p8}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x7

    aput-object p1, v1, p2

    const-string p1, "Province"

    .line 10
    invoke-static {p1, p9}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/16 p2, 0x8

    aput-object p1, v1, p2

    const-string p1, "City"

    .line 11
    invoke-static {p1, p10}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/16 p2, 0x9

    aput-object p1, v1, p2

    .line 12
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    move-result-object p1

    iget-object p1, p1, Lcom/tv91/z/b$b;->c:Ljava/lang/String;

    return-object p1
.end method

.method public static a(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->w:Lcom/tv91/z/b$a;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "MovieID"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    return-void
.end method

.method public static b(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->e0:Lcom/tv91/z/b$a;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    const-string p1, "Phone"

    .line 4
    invoke-static {p1, p3}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    const-string p1, "SMSCode"

    .line 5
    invoke-static {p1, p4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v1, p2

    .line 6
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    return-void
.end method

.method public static c(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->Y:Lcom/tv91/z/b$a;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "MovieID"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "CID"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v1, p2

    const-string p1, "GID"

    .line 6
    invoke-static {p1, p5}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, v1, p2

    .line 7
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    return-void
.end method

.method public static d(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->U:Lcom/tv91/z/b$a;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "RefID"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    const-string p1, "UID"

    .line 5
    invoke-static {p1, p4}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v1, p2

    .line 6
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    move-result-object p1

    iget-object p1, p1, Lcom/tv91/z/b$b;->c:Ljava/lang/String;

    return-object p1
.end method

.method public static e(Lcom/tv91/z/b;)Ljava/util/List;
    .locals 2
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tv91/model/ExternalSource;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->m0:Lcom/tv91/z/b$a;

    invoke-interface {p0, v0}, Lcom/tv91/z/b;->a0(Lcom/tv91/z/b$a;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/tv91/model/ExternalSource;

    invoke-interface {p0, v0, v1}, Lcom/tv91/z/b;->O(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static f(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;I)Lcom/tv91/model/DownloadInfo;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->X:Lcom/tv91/z/b$a;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "MovieID"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lcom/tv91/model/DownloadInfo;

    invoke-interface {p0, p1, p2}, Lcom/tv91/z/b;->I(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/DownloadInfo;

    return-object p1
.end method

.method public static g(Lcom/tv91/z/b;)Ljava/lang/String;
    .locals 1
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->Z:Lcom/tv91/z/b$a;

    invoke-interface {p0, v0}, Lcom/tv91/z/b;->a0(Lcom/tv91/z/b$a;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    move-result-object v0

    iget-object v0, v0, Lcom/tv91/z/b$b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static h(Lcom/tv91/z/b;)Ljava/util/List;
    .locals 2
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tv91/model/FeedbackType;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->H:Lcom/tv91/z/b$a;

    invoke-interface {p0, v0}, Lcom/tv91/z/b;->a0(Lcom/tv91/z/b$a;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/tv91/model/FeedbackType;

    invoke-interface {p0, v0, v1}, Lcom/tv91/z/b;->O(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static i(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;II)Lcom/tv91/model/Paging;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II)",
            "Lcom/tv91/model/Paging<",
            "Lcom/tv91/model/PaymentHistory;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->K:Lcom/tv91/z/b$a;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "PageIndex"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "PageSize"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v1, p2

    .line 6
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lcom/tv91/model/PaymentHistory;

    invoke-interface {p0, p1, p2}, Lcom/tv91/z/b;->c(Ljava/lang/String;Ljava/lang/Class;)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1
.end method

.method public static j(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/tv91/model/PaymentHistory;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x1

    const/16 v1, 0x1f4

    .line 1
    invoke-interface {p0, p1, p2, v0, v1}, Lcom/tv91/z/b;->a(Ljava/lang/String;Ljava/lang/String;II)Lcom/tv91/model/Paging;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tv91/model/Paging;->getData()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public static k(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/tv91/model/ProductGroup;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->l0:Lcom/tv91/z/b$a;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    const-string p1, "UID"

    .line 4
    invoke-static {p1, p3}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lcom/tv91/model/ProductGroup;

    invoke-interface {p0, p1, p2}, Lcom/tv91/z/b;->O(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public static l(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;I)Lcom/tv91/model/Promotion;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->i0:Lcom/tv91/z/b$a;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "SID"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lcom/tv91/model/Promotion;

    invoke-interface {p0, p1, p2}, Lcom/tv91/z/b;->I(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/Promotion;

    return-object p1
.end method

.method public static m(Lcom/tv91/z/b;I)Ljava/util/List;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/tv91/model/Promotion;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->h0:Lcom/tv91/z/b$a;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/util/Map$Entry;

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v2, "SID"

    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    .line 3
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class v0, Lcom/tv91/model/Promotion;

    invoke-interface {p0, p1, v0}, Lcom/tv91/z/b;->O(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public static n(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;II)Lcom/tv91/model/Paging;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II)",
            "Lcom/tv91/model/Paging<",
            "Lcom/tv91/model/PurchaseHistory;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->s:Lcom/tv91/z/b$a;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "PageIndex"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "PageSize"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v1, p2

    .line 6
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lcom/tv91/model/PurchaseHistory;

    invoke-interface {p0, p1, p2}, Lcom/tv91/z/b;->c(Ljava/lang/String;Ljava/lang/Class;)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1
.end method

.method public static o(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Lcom/tv91/model/PurchaseHistory;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->r:Lcom/tv91/z/b$a;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    if-gtz p3, :cond_0

    const-string p1, ""

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string p2, "SourceId"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lcom/tv91/model/PurchaseHistory;

    invoke-interface {p0, p1, p2}, Lcom/tv91/z/b;->O(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public static p(Lcom/tv91/z/b;)Ljava/util/List;
    .locals 2
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tv91/model/PurchasePackage;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->R:Lcom/tv91/z/b$a;

    invoke-interface {p0, v0}, Lcom/tv91/z/b;->a0(Lcom/tv91/z/b$a;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/tv91/model/PurchasePackage;

    invoke-interface {p0, v0, v1}, Lcom/tv91/z/b;->O(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static q(Lcom/tv91/z/b;Ljava/lang/String;)Lcom/tv91/model/Url;
    .locals 1
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-interface {p0, p1}, Lcom/tv91/z/b;->G(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-class v0, Lcom/tv91/model/Url;

    invoke-static {p1, v0}, Lcom/tv91/utils/Jsons;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/Url;

    return-object p1
.end method

.method public static r(Lcom/tv91/z/b;Ljava/lang/String;)Lcom/tv91/model/Version;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->V:Lcom/tv91/z/b$a;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "PackageName"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    .line 3
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class v0, Lcom/tv91/model/Version;

    invoke-interface {p0, p1, v0}, Lcom/tv91/z/b;->I(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/Version;

    return-object p1
.end method

.method public static s(Lcom/tv91/z/b;II)Lcom/tv91/model/Paging;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/tv91/model/Paging<",
            "Lcom/tv91/model/Actor;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->z:Lcom/tv91/z/b$a;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/util/Map$Entry;

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v2, "PageIndex"

    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "PageSize"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lcom/tv91/model/Actor;

    invoke-interface {p0, p1, p2}, Lcom/tv91/z/b;->c(Ljava/lang/String;Ljava/lang/Class;)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1
.end method

.method public static t(Lcom/tv91/z/b;)Ljava/util/List;
    .locals 2
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tv91/model/Category;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->d:Lcom/tv91/z/b$a;

    invoke-interface {p0, v0}, Lcom/tv91/z/b;->a0(Lcom/tv91/z/b$a;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/tv91/model/Category;

    invoke-interface {p0, v0, v1}, Lcom/tv91/z/b;->O(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static u(Lcom/tv91/z/b;)Ljava/util/List;
    .locals 2
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tv91/model/Channel;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->c:Lcom/tv91/z/b$a;

    invoke-interface {p0, v0}, Lcom/tv91/z/b;->a0(Lcom/tv91/z/b$a;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/tv91/model/Channel;

    invoke-interface {p0, v0, v1}, Lcom/tv91/z/b;->O(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static v(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;II)Lcom/tv91/model/Paging;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II)",
            "Lcom/tv91/model/Paging<",
            "Lcom/tv91/model/Movie;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->b0:Lcom/tv91/z/b$a;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "PageIndex"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "PageSize"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v1, p2

    .line 6
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lcom/tv91/model/Movie;

    invoke-interface {p0, p1, p2}, Lcom/tv91/z/b;->c(Ljava/lang/String;Ljava/lang/Class;)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1
.end method

.method public static w(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;II)Lcom/tv91/model/Paging;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II)",
            "Lcom/tv91/model/Paging<",
            "Lcom/tv91/model/Feedback;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->J:Lcom/tv91/z/b$a;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "PageIndex"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "PageSize"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v1, p2

    .line 6
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lcom/tv91/model/Feedback;

    invoke-interface {p0, p1, p2}, Lcom/tv91/z/b;->c(Ljava/lang/String;Ljava/lang/Class;)Lcom/tv91/model/Paging;

    move-result-object p1

    return-object p1
.end method

.method public static x(Lcom/tv91/z/b;)Lcom/tv91/model/Highlight;
    .locals 6
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->h:Lcom/tv91/z/b$a;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/util/Map$Entry;

    const/4 v2, 0x0

    .line 2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "PageIndex"

    invoke-static {v4, v3}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v4

    aput-object v4, v1, v2

    const-string v4, "PageSize"

    .line 3
    invoke-static {v4, v3}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v1, v5

    const-string v4, "Type"

    .line 4
    invoke-static {v4, v3}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v1, v4

    new-array v3, v5, [I

    const/16 v4, 0xc8

    aput v4, v3, v2

    const-string v2, "ID"

    .line 5
    invoke-static {v2, v3}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "Data"

    const-string v3, ""

    .line 6
    invoke-static {v2, v3}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 7
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/tv91/model/Highlight;

    invoke-interface {p0, v0, v1}, Lcom/tv91/z/b;->I(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tv91/model/Highlight;

    return-object v0
.end method

.method public static y(Lcom/tv91/z/b;Lcom/tv91/model/User;II)Lcom/tv91/model/Movie;
    .locals 10
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    const-class v0, Lcom/tv91/model/Movie;

    const-string v1, "SourceId"

    const-string v2, "MovieID"

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez p1, :cond_0

    .line 2
    sget-object p1, Lcom/tv91/z/b$a;->k:Lcom/tv91/z/b$a;

    new-array v3, v3, [Ljava/util/Map$Entry;

    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v2, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p2

    aput-object p2, v3, v5

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p2

    aput-object p2, v3, v4

    .line 5
    invoke-static {v3}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1, v0}, Lcom/tv91/z/b;->I(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/Movie;

    return-object p1

    .line 6
    :cond_0
    sget-object v6, Lcom/tv91/z/b$a;->a0:Lcom/tv91/z/b$a;

    const/4 v7, 0x4

    new-array v7, v7, [Ljava/util/Map$Entry;

    iget-object v8, p1, Lcom/tv91/model/User;->id:Ljava/lang/String;

    const-string v9, "MemberID"

    .line 7
    invoke-static {v9, v8}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v8

    aput-object v8, v7, v5

    iget-object p1, p1, Lcom/tv91/model/User;->token:Ljava/lang/String;

    const-string v5, "Token"

    .line 8
    invoke-static {v5, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    aput-object p1, v7, v4

    .line 9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    aput-object p1, v7, v3

    const/4 p1, 0x3

    .line 10
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p2

    aput-object p2, v7, p1

    .line 11
    invoke-static {v7}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v6, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1, v0}, Lcom/tv91/z/b;->I(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/Movie;

    return-object p1
.end method

.method public static z(Lcom/tv91/z/b;Ljava/lang/String;Ljava/lang/String;III)Ljava/lang/String;
    .locals 3
    .param p0, "_this"    # Lcom/tv91/z/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/z/b$a;->P:Lcom/tv91/z/b$a;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/util/Map$Entry;

    const-string v2, "MemberID"

    .line 2
    invoke-static {v2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Token"

    .line 3
    invoke-static {p1, p2}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "MovieID"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 5
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "Type"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v1, p2

    .line 6
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "SourceId"

    invoke-static {p2, p1}, Lcom/tv91/utils/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, v1, p2

    .line 7
    invoke-static {v1}, Lcom/tv91/utils/d;->c([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/tv91/z/b;->d(Lcom/tv91/z/b$a;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tv91/z/b;->S(Ljava/lang/String;)Lcom/tv91/z/b$b;

    move-result-object p1

    iget-object p1, p1, Lcom/tv91/z/b$b;->c:Ljava/lang/String;

    return-object p1
.end method
