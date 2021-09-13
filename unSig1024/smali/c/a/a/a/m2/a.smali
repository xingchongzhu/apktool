.class public final synthetic Lc/a/a/a/m2/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final synthetic b:I

.field public final synthetic c:Lc/a/a/a/m2/s$a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;ILc/a/a/a/m2/s$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/m2/a;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput p2, p0, Lc/a/a/a/m2/a;->b:I

    iput-object p3, p0, Lc/a/a/a/m2/a;->c:Lc/a/a/a/m2/s$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc/a/a/a/m2/a;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget v1, p0, Lc/a/a/a/m2/a;->b:I

    iget-object v2, p0, Lc/a/a/a/m2/a;->c:Lc/a/a/a/m2/s$a;

    invoke-static {v0, v1, v2}, Lc/a/a/a/m2/s;->f(Ljava/util/concurrent/CopyOnWriteArraySet;ILc/a/a/a/m2/s$a;)V

    return-void
.end method
