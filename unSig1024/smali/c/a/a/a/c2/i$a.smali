.class Lc/a/a/a/c2/i$a;
.super Ljava/lang/Thread;
.source "SimpleDecoder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/a/a/c2/i;-><init>([Lc/a/a/a/c2/f;[Lc/a/a/a/c2/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/a/a/a/c2/i;


# direct methods
.method constructor <init>(Lc/a/a/a/c2/i;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/c2/i$a;->a:Lc/a/a/a/c2/i;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/c2/i$a;->a:Lc/a/a/a/c2/i;

    invoke-static {v0}, Lc/a/a/a/c2/i;->f(Lc/a/a/a/c2/i;)V

    return-void
.end method
