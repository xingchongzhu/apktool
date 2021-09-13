.class public final Lc/a/a/a/c2/b;
.super Ljava/lang/Object;
.source "CryptoInfo.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/c2/b$b;
    }
.end annotation


# instance fields
.field public a:[B

.field public b:[B

.field public c:I

.field public d:[I

.field public e:[I

.field public f:I

.field public g:I

.field public h:I

.field private final i:Landroid/media/MediaCodec$CryptoInfo;

.field private final j:Lc/a/a/a/c2/b$b;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/media/MediaCodec$CryptoInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$CryptoInfo;-><init>()V

    iput-object v0, p0, Lc/a/a/a/c2/b;->i:Landroid/media/MediaCodec$CryptoInfo;

    .line 3
    sget v1, Lc/a/a/a/m2/m0;->a:I

    const/4 v2, 0x0

    const/16 v3, 0x18

    if-lt v1, v3, :cond_0

    new-instance v1, Lc/a/a/a/c2/b$b;

    invoke-direct {v1, v0, v2}, Lc/a/a/a/c2/b$b;-><init>(Landroid/media/MediaCodec$CryptoInfo;Lc/a/a/a/c2/b$a;)V

    move-object v2, v1

    :cond_0
    iput-object v2, p0, Lc/a/a/a/c2/b;->j:Lc/a/a/a/c2/b$b;

    return-void
.end method


# virtual methods
.method public a()Landroid/media/MediaCodec$CryptoInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/c2/b;->i:Landroid/media/MediaCodec$CryptoInfo;

    return-object v0
.end method

.method public b(I)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lc/a/a/a/c2/b;->d:[I

    if-nez v0, :cond_1

    const/4 v0, 0x1

    new-array v0, v0, [I

    .line 2
    iput-object v0, p0, Lc/a/a/a/c2/b;->d:[I

    .line 3
    iget-object v1, p0, Lc/a/a/a/c2/b;->i:Landroid/media/MediaCodec$CryptoInfo;

    iput-object v0, v1, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 4
    :cond_1
    iget-object v0, p0, Lc/a/a/a/c2/b;->d:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    add-int/2addr v2, p1

    aput v2, v0, v1

    return-void
.end method

.method public c(I[I[I[B[BIII)V
    .locals 1

    .line 1
    iput p1, p0, Lc/a/a/a/c2/b;->f:I

    .line 2
    iput-object p2, p0, Lc/a/a/a/c2/b;->d:[I

    .line 3
    iput-object p3, p0, Lc/a/a/a/c2/b;->e:[I

    .line 4
    iput-object p4, p0, Lc/a/a/a/c2/b;->b:[B

    .line 5
    iput-object p5, p0, Lc/a/a/a/c2/b;->a:[B

    .line 6
    iput p6, p0, Lc/a/a/a/c2/b;->c:I

    .line 7
    iput p7, p0, Lc/a/a/a/c2/b;->g:I

    .line 8
    iput p8, p0, Lc/a/a/a/c2/b;->h:I

    .line 9
    iget-object v0, p0, Lc/a/a/a/c2/b;->i:Landroid/media/MediaCodec$CryptoInfo;

    iput p1, v0, Landroid/media/MediaCodec$CryptoInfo;->numSubSamples:I

    .line 10
    iput-object p2, v0, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 11
    iput-object p3, v0, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfEncryptedData:[I

    .line 12
    iput-object p4, v0, Landroid/media/MediaCodec$CryptoInfo;->key:[B

    .line 13
    iput-object p5, v0, Landroid/media/MediaCodec$CryptoInfo;->iv:[B

    .line 14
    iput p6, v0, Landroid/media/MediaCodec$CryptoInfo;->mode:I

    .line 15
    sget p1, Lc/a/a/a/m2/m0;->a:I

    const/16 p2, 0x18

    if-lt p1, p2, :cond_0

    .line 16
    iget-object p1, p0, Lc/a/a/a/c2/b;->j:Lc/a/a/a/c2/b$b;

    invoke-static {p1}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/c2/b$b;

    invoke-static {p1, p7, p8}, Lc/a/a/a/c2/b$b;->a(Lc/a/a/a/c2/b$b;II)V

    :cond_0
    return-void
.end method
