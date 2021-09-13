.class public final enum Le/f0/i/b;
.super Ljava/lang/Enum;
.source "ErrorCode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f0/i/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Le/f0/i/b;

.field public static final enum b:Le/f0/i/b;

.field public static final enum c:Le/f0/i/b;

.field public static final enum d:Le/f0/i/b;

.field public static final enum e:Le/f0/i/b;

.field public static final enum f:Le/f0/i/b;

.field public static final enum g:Le/f0/i/b;

.field public static final enum h:Le/f0/i/b;

.field public static final enum i:Le/f0/i/b;

.field public static final enum j:Le/f0/i/b;

.field public static final enum k:Le/f0/i/b;

.field private static final synthetic l:[Le/f0/i/b;


# instance fields
.field public final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Le/f0/i/b;

    const-string v1, "NO_ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Le/f0/i/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f0/i/b;->a:Le/f0/i/b;

    .line 2
    new-instance v1, Le/f0/i/b;

    const-string v3, "PROTOCOL_ERROR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Le/f0/i/b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Le/f0/i/b;->b:Le/f0/i/b;

    .line 3
    new-instance v3, Le/f0/i/b;

    const-string v5, "INTERNAL_ERROR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Le/f0/i/b;-><init>(Ljava/lang/String;II)V

    sput-object v3, Le/f0/i/b;->c:Le/f0/i/b;

    .line 4
    new-instance v5, Le/f0/i/b;

    const-string v7, "FLOW_CONTROL_ERROR"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Le/f0/i/b;-><init>(Ljava/lang/String;II)V

    sput-object v5, Le/f0/i/b;->d:Le/f0/i/b;

    .line 5
    new-instance v7, Le/f0/i/b;

    const-string v9, "REFUSED_STREAM"

    const/4 v10, 0x4

    const/4 v11, 0x7

    invoke-direct {v7, v9, v10, v11}, Le/f0/i/b;-><init>(Ljava/lang/String;II)V

    sput-object v7, Le/f0/i/b;->e:Le/f0/i/b;

    .line 6
    new-instance v9, Le/f0/i/b;

    const-string v12, "CANCEL"

    const/4 v13, 0x5

    const/16 v14, 0x8

    invoke-direct {v9, v12, v13, v14}, Le/f0/i/b;-><init>(Ljava/lang/String;II)V

    sput-object v9, Le/f0/i/b;->f:Le/f0/i/b;

    .line 7
    new-instance v12, Le/f0/i/b;

    const-string v15, "COMPRESSION_ERROR"

    const/4 v13, 0x6

    const/16 v10, 0x9

    invoke-direct {v12, v15, v13, v10}, Le/f0/i/b;-><init>(Ljava/lang/String;II)V

    sput-object v12, Le/f0/i/b;->g:Le/f0/i/b;

    .line 8
    new-instance v15, Le/f0/i/b;

    const-string v13, "CONNECT_ERROR"

    const/16 v8, 0xa

    invoke-direct {v15, v13, v11, v8}, Le/f0/i/b;-><init>(Ljava/lang/String;II)V

    sput-object v15, Le/f0/i/b;->h:Le/f0/i/b;

    .line 9
    new-instance v13, Le/f0/i/b;

    const-string v11, "ENHANCE_YOUR_CALM"

    const/16 v6, 0xb

    invoke-direct {v13, v11, v14, v6}, Le/f0/i/b;-><init>(Ljava/lang/String;II)V

    sput-object v13, Le/f0/i/b;->i:Le/f0/i/b;

    .line 10
    new-instance v11, Le/f0/i/b;

    const-string v14, "INADEQUATE_SECURITY"

    const/16 v4, 0xc

    invoke-direct {v11, v14, v10, v4}, Le/f0/i/b;-><init>(Ljava/lang/String;II)V

    sput-object v11, Le/f0/i/b;->j:Le/f0/i/b;

    .line 11
    new-instance v4, Le/f0/i/b;

    const-string v14, "HTTP_1_1_REQUIRED"

    const/16 v10, 0xd

    invoke-direct {v4, v14, v8, v10}, Le/f0/i/b;-><init>(Ljava/lang/String;II)V

    sput-object v4, Le/f0/i/b;->k:Le/f0/i/b;

    new-array v6, v6, [Le/f0/i/b;

    aput-object v0, v6, v2

    const/4 v0, 0x1

    aput-object v1, v6, v0

    const/4 v0, 0x2

    aput-object v3, v6, v0

    const/4 v0, 0x3

    aput-object v5, v6, v0

    const/4 v0, 0x4

    aput-object v7, v6, v0

    const/4 v0, 0x5

    aput-object v9, v6, v0

    const/4 v0, 0x6

    aput-object v12, v6, v0

    const/4 v0, 0x7

    aput-object v15, v6, v0

    const/16 v0, 0x8

    aput-object v13, v6, v0

    const/16 v0, 0x9

    aput-object v11, v6, v0

    aput-object v4, v6, v8

    .line 12
    sput-object v6, Le/f0/i/b;->l:[Le/f0/i/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Le/f0/i/b;->m:I

    return-void
.end method

.method public static a(I)Le/f0/i/b;
    .locals 5

    .line 1
    invoke-static {}, Le/f0/i/b;->values()[Le/f0/i/b;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    iget v4, v3, Le/f0/i/b;->m:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Le/f0/i/b;
    .locals 1

    .line 1
    const-class v0, Le/f0/i/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/f0/i/b;

    return-object p0
.end method

.method public static values()[Le/f0/i/b;
    .locals 1

    .line 1
    sget-object v0, Le/f0/i/b;->l:[Le/f0/i/b;

    invoke-virtual {v0}, [Le/f0/i/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/f0/i/b;

    return-object v0
.end method
