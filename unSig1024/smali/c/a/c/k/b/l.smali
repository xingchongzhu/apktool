.class public final enum Lc/a/c/k/b/l;
.super Ljava/lang/Enum;
.source "SymbolShapeHint.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc/a/c/k/b/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lc/a/c/k/b/l;

.field public static final enum b:Lc/a/c/k/b/l;

.field public static final enum c:Lc/a/c/k/b/l;

.field private static final synthetic d:[Lc/a/c/k/b/l;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lc/a/c/k/b/l;

    const-string v1, "FORCE_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc/a/c/k/b/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/a/c/k/b/l;->a:Lc/a/c/k/b/l;

    .line 2
    new-instance v1, Lc/a/c/k/b/l;

    const-string v3, "FORCE_SQUARE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lc/a/c/k/b/l;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lc/a/c/k/b/l;->b:Lc/a/c/k/b/l;

    .line 3
    new-instance v3, Lc/a/c/k/b/l;

    const-string v5, "FORCE_RECTANGLE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lc/a/c/k/b/l;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lc/a/c/k/b/l;->c:Lc/a/c/k/b/l;

    const/4 v5, 0x3

    new-array v5, v5, [Lc/a/c/k/b/l;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Lc/a/c/k/b/l;->d:[Lc/a/c/k/b/l;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lc/a/c/k/b/l;
    .locals 1

    .line 1
    const-class v0, Lc/a/c/k/b/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc/a/c/k/b/l;

    return-object p0
.end method

.method public static values()[Lc/a/c/k/b/l;
    .locals 1

    .line 1
    sget-object v0, Lc/a/c/k/b/l;->d:[Lc/a/c/k/b/l;

    invoke-virtual {v0}, [Lc/a/c/k/b/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/a/c/k/b/l;

    return-object v0
.end method
