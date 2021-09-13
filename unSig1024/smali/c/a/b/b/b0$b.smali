.class abstract enum Lc/a/b/b/b0$b;
.super Ljava/lang/Enum;
.source "Maps.java"

# interfaces
.implements Lc/a/b/a/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x440a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc/a/b/b/b0$b;",
        ">;",
        "Lc/a/b/a/e<",
        "Ljava/util/Map$Entry<",
        "**>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lc/a/b/b/b0$b;

.field public static final enum b:Lc/a/b/b/b0$b;

.field private static final synthetic c:[Lc/a/b/b/b0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lc/a/b/b/b0$b$a;

    const-string v1, "KEY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc/a/b/b/b0$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/a/b/b/b0$b;->a:Lc/a/b/b/b0$b;

    .line 2
    new-instance v1, Lc/a/b/b/b0$b$b;

    const-string v3, "VALUE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lc/a/b/b/b0$b$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lc/a/b/b/b0$b;->b:Lc/a/b/b/b0$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lc/a/b/b/b0$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lc/a/b/b/b0$b;->c:[Lc/a/b/b/b0$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILc/a/b/b/a0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lc/a/b/b/b0$b;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lc/a/b/b/b0$b;
    .locals 1

    .line 1
    const-class v0, Lc/a/b/b/b0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc/a/b/b/b0$b;

    return-object p0
.end method

.method public static values()[Lc/a/b/b/b0$b;
    .locals 1

    .line 1
    sget-object v0, Lc/a/b/b/b0$b;->c:[Lc/a/b/b/b0$b;

    invoke-virtual {v0}, [Lc/a/b/b/b0$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/a/b/b/b0$b;

    return-object v0
.end method
