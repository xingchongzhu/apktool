.class final Lcom/google/android/exoplayer2/ui/r$c;
.super Ljava/lang/Object;
.source "SpannedToHtmlConverter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/ui/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# static fields
.field private static final a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/google/android/exoplayer2/ui/r$c;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/google/android/exoplayer2/ui/r$c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final c:I

.field public final d:I

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/exoplayer2/ui/e;->a:Lcom/google/android/exoplayer2/ui/e;

    sput-object v0, Lcom/google/android/exoplayer2/ui/r$c;->a:Ljava/util/Comparator;

    .line 2
    sget-object v0, Lcom/google/android/exoplayer2/ui/f;->a:Lcom/google/android/exoplayer2/ui/f;

    sput-object v0, Lcom/google/android/exoplayer2/ui/r$c;->b:Ljava/util/Comparator;

    return-void
.end method

.method private constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/google/android/exoplayer2/ui/r$c;->c:I

    .line 4
    iput p2, p0, Lcom/google/android/exoplayer2/ui/r$c;->d:I

    .line 5
    iput-object p3, p0, Lcom/google/android/exoplayer2/ui/r$c;->e:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/google/android/exoplayer2/ui/r$c;->f:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Lcom/google/android/exoplayer2/ui/r$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/exoplayer2/ui/r$c;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a()Ljava/util/Comparator;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/exoplayer2/ui/r$c;->b:Ljava/util/Comparator;

    return-object v0
.end method

.method static synthetic b()Ljava/util/Comparator;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/exoplayer2/ui/r$c;->a:Ljava/util/Comparator;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/exoplayer2/ui/r$c;Lcom/google/android/exoplayer2/ui/r$c;)I
    .locals 2

    .line 1
    iget v0, p1, Lcom/google/android/exoplayer2/ui/r$c;->d:I

    iget v1, p0, Lcom/google/android/exoplayer2/ui/r$c;->d:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/r$c;->e:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/exoplayer2/ui/r$c;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    .line 3
    :cond_1
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/r$c;->f:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/exoplayer2/ui/r$c;->f:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method static synthetic d(Lcom/google/android/exoplayer2/ui/r$c;Lcom/google/android/exoplayer2/ui/r$c;)I
    .locals 2

    .line 1
    iget v0, p1, Lcom/google/android/exoplayer2/ui/r$c;->c:I

    iget v1, p0, Lcom/google/android/exoplayer2/ui/r$c;->c:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 2
    :cond_0
    iget-object v0, p1, Lcom/google/android/exoplayer2/ui/r$c;->e:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/r$c;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    .line 3
    :cond_1
    iget-object p1, p1, Lcom/google/android/exoplayer2/ui/r$c;->f:Ljava/lang/String;

    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/r$c;->f:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method
