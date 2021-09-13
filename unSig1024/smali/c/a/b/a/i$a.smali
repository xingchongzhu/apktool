.class final Lc/a/b/a/i$a;
.super Ljava/lang/Object;
.source "Splitter.java"

# interfaces
.implements Lc/a/b/a/i$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/b/a/i;->e(Lc/a/b/a/b;)Lc/a/b/a/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/a/b/a/b;


# direct methods
.method constructor <init>(Lc/a/b/a/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/b/a/i$a;->a:Lc/a/b/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lc/a/b/a/i;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lc/a/b/a/i$a;->b(Lc/a/b/a/i;Ljava/lang/CharSequence;)Lc/a/b/a/i$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lc/a/b/a/i;Ljava/lang/CharSequence;)Lc/a/b/a/i$b;
    .locals 1

    .line 1
    new-instance v0, Lc/a/b/a/i$a$a;

    invoke-direct {v0, p0, p1, p2}, Lc/a/b/a/i$a$a;-><init>(Lc/a/b/a/i$a;Lc/a/b/a/i;Ljava/lang/CharSequence;)V

    return-object v0
.end method
