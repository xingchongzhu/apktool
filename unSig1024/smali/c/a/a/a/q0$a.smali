.class final Lc/a/a/a/q0$a;
.super Ljava/lang/Object;
.source "ExoPlayerImpl.java"

# interfaces
.implements Lc/a/a/a/e1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lc/a/a/a/x1;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lc/a/a/a/x1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/a/a/q0$a;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lc/a/a/a/q0$a;->b:Lc/a/a/a/x1;

    return-void
.end method

.method static synthetic c(Lc/a/a/a/q0$a;Lc/a/a/a/x1;)Lc/a/a/a/x1;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/a/a/q0$a;->b:Lc/a/a/a/x1;

    return-object p1
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0$a;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public b()Lc/a/a/a/x1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/a/a/a/q0$a;->b:Lc/a/a/a/x1;

    return-object v0
.end method
