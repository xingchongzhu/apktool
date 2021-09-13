.class final Lc/a/b/b/x$b;
.super Lc/a/b/b/a;
.source "Iterators.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/b/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lc/a/b/b/a<",
        "TT;>;"
    }
.end annotation


# static fields
.field static final c:Lc/a/b/b/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/b/b/v0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final d:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TT;"
        }
    .end annotation
.end field

.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lc/a/b/b/x$b;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1, v1, v1}, Lc/a/b/b/x$b;-><init>([Ljava/lang/Object;III)V

    sput-object v0, Lc/a/b/b/x$b;->c:Lc/a/b/b/v0;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;III)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p3, p4}, Lc/a/b/b/a;-><init>(II)V

    .line 2
    iput-object p1, p0, Lc/a/b/b/x$b;->d:[Ljava/lang/Object;

    .line 3
    iput p2, p0, Lc/a/b/b/x$b;->e:I

    return-void
.end method


# virtual methods
.method protected a(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/a/b/b/x$b;->d:[Ljava/lang/Object;

    iget v1, p0, Lc/a/b/b/x$b;->e:I

    add-int/2addr v1, p1

    aget-object p1, v0, v1

    return-object p1
.end method
