.class public final synthetic Lcom/tv91/u/b/x0/u0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/u/b/x0/v1;

.field public final synthetic b:Lcom/tv91/model/a;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/b/x0/v1;Lcom/tv91/model/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/b/x0/u0;->a:Lcom/tv91/u/b/x0/v1;

    iput-object p2, p0, Lcom/tv91/u/b/x0/u0;->b:Lcom/tv91/model/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/u/b/x0/u0;->a:Lcom/tv91/u/b/x0/v1;

    iget-object v1, p0, Lcom/tv91/u/b/x0/u0;->b:Lcom/tv91/model/a;

    check-cast p1, Ljava/io/File;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/u/b/x0/v1;->G(Lcom/tv91/model/a;Ljava/io/File;)V

    return-void
.end method
