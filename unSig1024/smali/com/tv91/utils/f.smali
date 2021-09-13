.class public final Lcom/tv91/utils/f;
.super Ljava/lang/Object;
.source "Permissions.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/utils/f$a;,
        Lcom/tv91/utils/f$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/tv91/utils/f;->a:Ljava/util/List;

    return-void
.end method

.method public static a(Landroid/app/Activity;[Ljava/lang/String;[ILcom/tv91/utils/f$b;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    .line 4
    :goto_0
    array-length v4, p1

    if-ge v3, v4, :cond_2

    .line 5
    aget-object v4, p1, v3

    .line 6
    aget v5, p2, v3

    if-nez v5, :cond_0

    .line 7
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 8
    :cond_0
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    invoke-static {p0, v4}, Landroidx/core/app/a;->n(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 10
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 11
    :cond_2
    invoke-interface {p3, v0, v1, v2}, Lcom/tv91/utils/f$b;->i(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static varargs b(Landroid/app/Activity;Lcom/tv91/utils/f$b;[Ljava/lang/String;)V
    .locals 8

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 2
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    sget-object p2, Lcom/tv91/utils/f;->a:Ljava/util/List;

    invoke-interface {p1, p0, p2, p2}, Lcom/tv91/utils/f$b;->i(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    array-length v2, p2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, p2, v4

    .line 5
    invoke-virtual {p0, v5}, Landroid/app/Activity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_1

    .line 6
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 7
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    sget-object p2, Lcom/tv91/utils/f;->a:Ljava/util/List;

    invoke-interface {p1, p0, p2, p2}, Lcom/tv91/utils/f$b;->i(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void

    .line 9
    :cond_3
    instance-of v0, p0, Landroidx/fragment/app/e;

    if-eqz v0, :cond_5

    .line 10
    check-cast p0, Landroidx/fragment/app/e;

    invoke-virtual {p0}, Landroidx/fragment/app/e;->t()Landroidx/fragment/app/n;

    move-result-object p0

    const-string v0, "permission_fragment_tag"

    .line 11
    invoke-virtual {p0, v0}, Landroidx/fragment/app/n;->i0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    check-cast v1, Lcom/tv91/utils/f$a;

    if-nez v1, :cond_4

    .line 12
    new-instance v1, Lcom/tv91/utils/f$a;

    invoke-direct {v1}, Lcom/tv91/utils/f$a;-><init>()V

    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/n;->m()Landroidx/fragment/app/x;

    move-result-object p0

    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/x;->e(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/x;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/x;->j()V

    .line 14
    :cond_4
    invoke-static {v1, p1, p2}, Lcom/tv91/utils/f$a;->l2(Lcom/tv91/utils/f$a;Lcom/tv91/utils/f$b;[Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    new-array p1, v3, [Ljava/lang/Object;

    const-string v0, "Must override onRequestPermissionsResult"

    .line 15
    invoke-static {v0, p1}, Lh/a/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    invoke-virtual {p0, p2, v1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    :goto_1
    return-void
.end method
