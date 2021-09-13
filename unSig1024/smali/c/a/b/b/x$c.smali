.class final enum Lc/a/b/b/x$c;
.super Ljava/lang/Enum;
.source "Iterators.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc/a/b/b/x$c;",
        ">;",
        "Ljava/util/Iterator<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lc/a/b/b/x$c;

.field private static final synthetic b:[Lc/a/b/b/x$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lc/a/b/b/x$c;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc/a/b/b/x$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/a/b/b/x$c;->a:Lc/a/b/b/x$c;

    const/4 v1, 0x1

    new-array v1, v1, [Lc/a/b/b/x$c;

    aput-object v0, v1, v2

    .line 2
    sput-object v1, Lc/a/b/b/x$c;->b:[Lc/a/b/b/x$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lc/a/b/b/x$c;
    .locals 1

    .line 1
    const-class v0, Lc/a/b/b/x$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc/a/b/b/x$c;

    return-object p0
.end method

.method public static values()[Lc/a/b/b/x$c;
    .locals 1

    .line 1
    sget-object v0, Lc/a/b/b/x$c;->b:[Lc/a/b/b/x$c;

    invoke-virtual {v0}, [Lc/a/b/b/x$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/a/b/b/x$c;

    return-object v0
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Lc/a/b/b/i;->c(Z)V

    return-void
.end method
