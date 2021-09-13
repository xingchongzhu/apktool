.class final enum Lcom/tv91/x/h$b;
.super Ljava/lang/Enum;
.source "Navigator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/x/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tv91/x/h$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/tv91/x/h$b;

.field public static final enum b:Lcom/tv91/x/h$b;

.field public static final enum c:Lcom/tv91/x/h$b;

.field private static final synthetic d:[Lcom/tv91/x/h$b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/tv91/x/h$b;

    const-string v1, "FORWARD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/tv91/x/h$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tv91/x/h$b;->a:Lcom/tv91/x/h$b;

    new-instance v1, Lcom/tv91/x/h$b;

    const-string v3, "BACKWARD"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/tv91/x/h$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/tv91/x/h$b;->b:Lcom/tv91/x/h$b;

    new-instance v3, Lcom/tv91/x/h$b;

    const-string v5, "REPLACE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/tv91/x/h$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/tv91/x/h$b;->c:Lcom/tv91/x/h$b;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/tv91/x/h$b;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 2
    sput-object v5, Lcom/tv91/x/h$b;->d:[Lcom/tv91/x/h$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tv91/x/h$b;
    .locals 1

    .line 1
    const-class v0, Lcom/tv91/x/h$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tv91/x/h$b;

    return-object p0
.end method

.method public static values()[Lcom/tv91/x/h$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/x/h$b;->d:[Lcom/tv91/x/h$b;

    invoke-virtual {v0}, [Lcom/tv91/x/h$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tv91/x/h$b;

    return-object v0
.end method
