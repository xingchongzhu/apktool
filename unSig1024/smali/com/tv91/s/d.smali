.class public final enum Lcom/tv91/s/d;
.super Ljava/lang/Enum;
.source "InputError.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tv91/s/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/tv91/s/d;

.field public static final enum b:Lcom/tv91/s/d;

.field public static final enum c:Lcom/tv91/s/d;

.field public static final enum d:Lcom/tv91/s/d;

.field public static final enum e:Lcom/tv91/s/d;

.field public static final enum f:Lcom/tv91/s/d;

.field public static final enum g:Lcom/tv91/s/d;

.field public static final enum h:Lcom/tv91/s/d;

.field public static final enum i:Lcom/tv91/s/d;

.field public static final enum j:Lcom/tv91/s/d;

.field public static final enum k:Lcom/tv91/s/d;

.field public static final enum l:Lcom/tv91/s/d;

.field public static final enum m:Lcom/tv91/s/d;

.field public static final enum n:Lcom/tv91/s/d;

.field public static final enum o:Lcom/tv91/s/d;

.field private static final synthetic p:[Lcom/tv91/s/d;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .line 1
    new-instance v0, Lcom/tv91/s/d;

    const-string v1, "EMPTY_ACCOUNT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/tv91/s/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tv91/s/d;->a:Lcom/tv91/s/d;

    .line 2
    new-instance v1, Lcom/tv91/s/d;

    const-string v3, "INVALID_ACCOUNT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/tv91/s/d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/tv91/s/d;->b:Lcom/tv91/s/d;

    .line 3
    new-instance v3, Lcom/tv91/s/d;

    const-string v5, "EMPTY_PWD"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/tv91/s/d;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/tv91/s/d;->c:Lcom/tv91/s/d;

    .line 4
    new-instance v5, Lcom/tv91/s/d;

    const-string v7, "EMPTY_NEW_PWD"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/tv91/s/d;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/tv91/s/d;->d:Lcom/tv91/s/d;

    .line 5
    new-instance v7, Lcom/tv91/s/d;

    const-string v9, "EMPTY_PHONE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/tv91/s/d;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/tv91/s/d;->e:Lcom/tv91/s/d;

    .line 6
    new-instance v9, Lcom/tv91/s/d;

    const-string v11, "EMPTY_SMS"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lcom/tv91/s/d;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/tv91/s/d;->f:Lcom/tv91/s/d;

    .line 7
    new-instance v11, Lcom/tv91/s/d;

    const-string v13, "SHORT_PWD"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lcom/tv91/s/d;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lcom/tv91/s/d;->g:Lcom/tv91/s/d;

    .line 8
    new-instance v13, Lcom/tv91/s/d;

    const-string v15, "MISMATCH_PWD"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Lcom/tv91/s/d;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lcom/tv91/s/d;->h:Lcom/tv91/s/d;

    .line 9
    new-instance v15, Lcom/tv91/s/d;

    const-string v14, "USED_ACCOUNT"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Lcom/tv91/s/d;-><init>(Ljava/lang/String;I)V

    sput-object v15, Lcom/tv91/s/d;->i:Lcom/tv91/s/d;

    .line 10
    new-instance v14, Lcom/tv91/s/d;

    const-string v12, "EMPTY_NICKNAME"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, Lcom/tv91/s/d;-><init>(Ljava/lang/String;I)V

    sput-object v14, Lcom/tv91/s/d;->j:Lcom/tv91/s/d;

    .line 11
    new-instance v12, Lcom/tv91/s/d;

    const-string v10, "USED_NICKNAME"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8}, Lcom/tv91/s/d;-><init>(Ljava/lang/String;I)V

    sput-object v12, Lcom/tv91/s/d;->k:Lcom/tv91/s/d;

    .line 12
    new-instance v10, Lcom/tv91/s/d;

    const-string v8, "EMPTY_CODE"

    const/16 v6, 0xb

    invoke-direct {v10, v8, v6}, Lcom/tv91/s/d;-><init>(Ljava/lang/String;I)V

    sput-object v10, Lcom/tv91/s/d;->l:Lcom/tv91/s/d;

    .line 13
    new-instance v8, Lcom/tv91/s/d;

    const-string v6, "EMPTY_EMAIL"

    const/16 v4, 0xc

    invoke-direct {v8, v6, v4}, Lcom/tv91/s/d;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lcom/tv91/s/d;->m:Lcom/tv91/s/d;

    .line 14
    new-instance v6, Lcom/tv91/s/d;

    const-string v4, "INVALID_EMAIL"

    const/16 v2, 0xd

    invoke-direct {v6, v4, v2}, Lcom/tv91/s/d;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lcom/tv91/s/d;->n:Lcom/tv91/s/d;

    .line 15
    new-instance v4, Lcom/tv91/s/d;

    const-string v2, "EMPTY_WITHDRAW_ANY"

    move-object/from16 v17, v6

    const/16 v6, 0xe

    invoke-direct {v4, v2, v6}, Lcom/tv91/s/d;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/tv91/s/d;->o:Lcom/tv91/s/d;

    const/16 v2, 0xf

    new-array v2, v2, [Lcom/tv91/s/d;

    const/16 v16, 0x0

    aput-object v0, v2, v16

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v3, v2, v0

    const/4 v0, 0x3

    aput-object v5, v2, v0

    const/4 v0, 0x4

    aput-object v7, v2, v0

    const/4 v0, 0x5

    aput-object v9, v2, v0

    const/4 v0, 0x6

    aput-object v11, v2, v0

    const/4 v0, 0x7

    aput-object v13, v2, v0

    const/16 v0, 0x8

    aput-object v15, v2, v0

    const/16 v0, 0x9

    aput-object v14, v2, v0

    const/16 v0, 0xa

    aput-object v12, v2, v0

    const/16 v0, 0xb

    aput-object v10, v2, v0

    const/16 v0, 0xc

    aput-object v8, v2, v0

    const/16 v0, 0xd

    aput-object v17, v2, v0

    aput-object v4, v2, v6

    .line 16
    sput-object v2, Lcom/tv91/s/d;->p:[Lcom/tv91/s/d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tv91/s/d;
    .locals 1

    .line 1
    const-class v0, Lcom/tv91/s/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tv91/s/d;

    return-object p0
.end method

.method public static values()[Lcom/tv91/s/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/tv91/s/d;->p:[Lcom/tv91/s/d;

    invoke-virtual {v0}, [Lcom/tv91/s/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tv91/s/d;

    return-object v0
.end method
