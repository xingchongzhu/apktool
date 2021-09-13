.class final Lc/a/a/a/k2/v/h$d;
.super Ljava/lang/Object;
.source "WebvttCueParser.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/k2/v/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lc/a/a/a/k2/v/h$d;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lc/a/a/a/k2/v/f;


# direct methods
.method public constructor <init>(ILc/a/a/a/k2/v/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lc/a/a/a/k2/v/h$d;->a:I

    .line 3
    iput-object p2, p0, Lc/a/a/a/k2/v/h$d;->b:Lc/a/a/a/k2/v/f;

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/a/k2/v/h$d;)I
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/k2/v/h$d;->a:I

    iget p1, p1, Lc/a/a/a/k2/v/h$d;->a:I

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lc/a/a/a/k2/v/h$d;

    invoke-virtual {p0, p1}, Lc/a/a/a/k2/v/h$d;->a(Lc/a/a/a/k2/v/h$d;)I

    move-result p1

    return p1
.end method
