.class final Lc/a/a/a/f1$c;
.super Ljava/lang/Object;
.source "MediaSourceList.java"

# interfaces
.implements Lc/a/a/a/e1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field public final a:Lc/a/a/a/j2/y;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/a/j2/d0$a;",
            ">;"
        }
    .end annotation
.end field

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>(Lc/a/a/a/j2/d0;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lc/a/a/a/j2/y;

    invoke-direct {v0, p1, p2}, Lc/a/a/a/j2/y;-><init>(Lc/a/a/a/j2/d0;Z)V

    iput-object v0, p0, Lc/a/a/a/f1$c;->a:Lc/a/a/a/j2/y;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f1$c;->c:Ljava/util/List;

    .line 4
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/f1$c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/f1$c;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public b()Lc/a/a/a/x1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/f1$c;->a:Lc/a/a/a/j2/y;

    invoke-virtual {v0}, Lc/a/a/a/j2/y;->K()Lc/a/a/a/x1;

    move-result-object v0

    return-object v0
.end method

.method public c(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc/a/a/a/f1$c;->d:I

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lc/a/a/a/f1$c;->e:Z

    .line 3
    iget-object p1, p0, Lc/a/a/a/f1$c;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method
