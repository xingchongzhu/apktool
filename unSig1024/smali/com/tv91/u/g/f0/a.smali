.class public final synthetic Lcom/tv91/u/g/f0/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/g/f0/i;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/g/f0/i;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/g/f0/a;->a:Lcom/tv91/u/g/f0/i;

    iput-object p2, p0, Lcom/tv91/u/g/f0/a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/tv91/u/g/f0/a;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/tv91/u/g/f0/a;->a:Lcom/tv91/u/g/f0/i;

    iget-object v1, p0, Lcom/tv91/u/g/f0/a;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/tv91/u/g/f0/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/tv91/u/g/f0/i;->r(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
