.class public final synthetic Lcom/tv91/u/g/f0/d;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/g/f0/j;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/g/f0/j;Ljava/lang/String;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/g/f0/d;->a:Lcom/tv91/u/g/f0/j;

    iput-object p2, p0, Lcom/tv91/u/g/f0/d;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/tv91/u/g/f0/d;->c:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/tv91/u/g/f0/d;->a:Lcom/tv91/u/g/f0/j;

    iget-object v1, p0, Lcom/tv91/u/g/f0/d;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/tv91/u/g/f0/d;->c:Ljava/io/File;

    invoke-virtual {v0, v1, v2}, Lcom/tv91/u/g/f0/j;->r(Ljava/lang/String;Ljava/io/File;)V

    return-void
.end method
