.class Lb/p/q$a;
.super Lb/p/n;
.source "TransitionSet.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/p/q;->W()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/p/m;

.field final synthetic b:Lb/p/q;


# direct methods
.method constructor <init>(Lb/p/q;Lb/p/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb/p/q$a;->b:Lb/p/q;

    iput-object p2, p0, Lb/p/q$a;->a:Lb/p/m;

    invoke-direct {p0}, Lb/p/n;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lb/p/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb/p/q$a;->a:Lb/p/m;

    invoke-virtual {v0}, Lb/p/m;->W()V

    .line 2
    invoke-virtual {p1, p0}, Lb/p/m;->O(Lb/p/m$f;)Lb/p/m;

    return-void
.end method
