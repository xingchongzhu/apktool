.class public final enum Lcom/tv91/features/shared/i/i;
.super Ljava/lang/Enum;
.source "Scrolls.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tv91/features/shared/i/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/tv91/features/shared/i/i;

.field public static final enum b:Lcom/tv91/features/shared/i/i;

.field public static final enum c:Lcom/tv91/features/shared/i/i;

.field public static final enum d:Lcom/tv91/features/shared/i/i;

.field public static final enum e:Lcom/tv91/features/shared/i/i;

.field public static final enum f:Lcom/tv91/features/shared/i/i;

.field private static final synthetic g:[Lcom/tv91/features/shared/i/i;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lcom/tv91/features/shared/i/i;

    const-string v1, "SCROLL_UP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/tv91/features/shared/i/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tv91/features/shared/i/i;->a:Lcom/tv91/features/shared/i/i;

    new-instance v1, Lcom/tv91/features/shared/i/i;

    const-string v3, "SCROLL_DOWN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/tv91/features/shared/i/i;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/tv91/features/shared/i/i;->b:Lcom/tv91/features/shared/i/i;

    new-instance v3, Lcom/tv91/features/shared/i/i;

    const-string v5, "REACH_TOP"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/tv91/features/shared/i/i;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/tv91/features/shared/i/i;->c:Lcom/tv91/features/shared/i/i;

    new-instance v5, Lcom/tv91/features/shared/i/i;

    const-string v7, "REACH_BOTTOM"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/tv91/features/shared/i/i;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/tv91/features/shared/i/i;->d:Lcom/tv91/features/shared/i/i;

    new-instance v7, Lcom/tv91/features/shared/i/i;

    const-string v9, "AT_TOP"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/tv91/features/shared/i/i;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/tv91/features/shared/i/i;->e:Lcom/tv91/features/shared/i/i;

    new-instance v9, Lcom/tv91/features/shared/i/i;

    const-string v11, "AT_BOTTOM"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lcom/tv91/features/shared/i/i;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/tv91/features/shared/i/i;->f:Lcom/tv91/features/shared/i/i;

    const/4 v11, 0x6

    new-array v11, v11, [Lcom/tv91/features/shared/i/i;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    .line 2
    sput-object v11, Lcom/tv91/features/shared/i/i;->g:[Lcom/tv91/features/shared/i/i;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private synthetic a(Ljava/lang/Runnable;Lcom/tv91/features/shared/i/i;)V
    .locals 0

    if-ne p0, p2, :cond_0

    .line 1
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tv91/features/shared/i/i;
    .locals 1

    .line 1
    const-class v0, Lcom/tv91/features/shared/i/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tv91/features/shared/i/i;

    return-object p0
.end method

.method public static values()[Lcom/tv91/features/shared/i/i;
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/features/shared/i/i;->g:[Lcom/tv91/features/shared/i/i;

    invoke-virtual {v0}, [Lcom/tv91/features/shared/i/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tv91/features/shared/i/i;

    return-object v0
.end method


# virtual methods
.method public synthetic b(Ljava/lang/Runnable;Lcom/tv91/features/shared/i/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tv91/features/shared/i/i;->a(Ljava/lang/Runnable;Lcom/tv91/features/shared/i/i;)V

    return-void
.end method

.method public c(ILjava/lang/Runnable;)Landroidx/recyclerview/widget/RecyclerView$t;
    .locals 2

    .line 1
    new-instance v0, Lcom/tv91/features/shared/i/h;

    new-instance v1, Lcom/tv91/features/shared/i/d;

    invoke-direct {v1, p0, p2}, Lcom/tv91/features/shared/i/d;-><init>(Lcom/tv91/features/shared/i/i;Ljava/lang/Runnable;)V

    const/4 p2, 0x0

    invoke-direct {v0, p1, v1, p2}, Lcom/tv91/features/shared/i/h;-><init>(ILb/g/j/a;Lcom/tv91/features/shared/i/g;)V

    return-object v0
.end method

.method public d(Ljava/lang/Runnable;)Landroidx/recyclerview/widget/RecyclerView$t;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/tv91/features/shared/i/i;->c(ILjava/lang/Runnable;)Landroidx/recyclerview/widget/RecyclerView$t;

    move-result-object p1

    return-object p1
.end method
