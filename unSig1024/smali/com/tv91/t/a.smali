.class public final Lcom/tv91/t/a;
.super Ljava/lang/Object;
.source "DefaultSchedulers.java"

# interfaces
.implements Lcom/tv91/t/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/t/a$c;,
        Lcom/tv91/t/a$b;,
        Lcom/tv91/t/a$d;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/tv91/t/a$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tv91/t/a$d;-><init>(Lcom/tv91/t/a$a;)V

    iput-object v0, p0, Lcom/tv91/t/a;->a:Ljava/util/concurrent/Executor;

    .line 3
    new-instance v0, Lcom/tv91/t/a$b;

    invoke-direct {v0, v1}, Lcom/tv91/t/a$b;-><init>(Lcom/tv91/t/a$a;)V

    iput-object v0, p0, Lcom/tv91/t/a;->b:Ljava/util/concurrent/Executor;

    .line 4
    new-instance v0, Lcom/tv91/t/a$c;

    invoke-direct {v0, v1}, Lcom/tv91/t/a$c;-><init>(Lcom/tv91/t/a$a;)V

    iput-object v0, p0, Lcom/tv91/t/a;->c:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/t/a;->a:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public b()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/t/a;->c:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public c()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/t/a;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method
