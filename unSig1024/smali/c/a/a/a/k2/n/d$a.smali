.class final Lc/a/a/a/k2/n/d$a;
.super Ljava/lang/Object;
.source "Cea708Decoder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/k2/n/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lc/a/a/a/k2/n/d$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Lc/a/a/a/k2/c;

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/k2/n/a;->a:Lc/a/a/a/k2/n/a;

    sput-object v0, Lc/a/a/a/k2/n/d$a;->a:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;FIIFIFZII)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lc/a/a/a/k2/c$b;

    invoke-direct {v0}, Lc/a/a/a/k2/c$b;-><init>()V

    .line 3
    invoke-virtual {v0, p1}, Lc/a/a/a/k2/c$b;->n(Ljava/lang/CharSequence;)Lc/a/a/a/k2/c$b;

    move-result-object p1

    .line 4
    invoke-virtual {p1, p2}, Lc/a/a/a/k2/c$b;->o(Landroid/text/Layout$Alignment;)Lc/a/a/a/k2/c$b;

    move-result-object p1

    .line 5
    invoke-virtual {p1, p3, p4}, Lc/a/a/a/k2/c$b;->h(FI)Lc/a/a/a/k2/c$b;

    move-result-object p1

    .line 6
    invoke-virtual {p1, p5}, Lc/a/a/a/k2/c$b;->i(I)Lc/a/a/a/k2/c$b;

    move-result-object p1

    .line 7
    invoke-virtual {p1, p6}, Lc/a/a/a/k2/c$b;->j(F)Lc/a/a/a/k2/c$b;

    move-result-object p1

    .line 8
    invoke-virtual {p1, p7}, Lc/a/a/a/k2/c$b;->k(I)Lc/a/a/a/k2/c$b;

    move-result-object p1

    .line 9
    invoke-virtual {p1, p8}, Lc/a/a/a/k2/c$b;->m(F)Lc/a/a/a/k2/c$b;

    move-result-object p1

    if-eqz p9, :cond_0

    .line 10
    invoke-virtual {p1, p10}, Lc/a/a/a/k2/c$b;->r(I)Lc/a/a/a/k2/c$b;

    .line 11
    :cond_0
    invoke-virtual {p1}, Lc/a/a/a/k2/c$b;->a()Lc/a/a/a/k2/c;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/k2/n/d$a;->b:Lc/a/a/a/k2/c;

    .line 12
    iput p11, p0, Lc/a/a/a/k2/n/d$a;->c:I

    return-void
.end method

.method static synthetic a()Ljava/util/Comparator;
    .locals 1

    .line 1
    sget-object v0, Lc/a/a/a/k2/n/d$a;->a:Ljava/util/Comparator;

    return-object v0
.end method

.method static synthetic b(Lc/a/a/a/k2/n/d$a;Lc/a/a/a/k2/n/d$a;)I
    .locals 0

    .line 1
    iget p1, p1, Lc/a/a/a/k2/n/d$a;->c:I

    iget p0, p0, Lc/a/a/a/k2/n/d$a;->c:I

    invoke-static {p1, p0}, Ljava/lang/Integer;->compare(II)I

    move-result p0

    return p0
.end method
