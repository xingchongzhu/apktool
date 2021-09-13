.class public final synthetic Lcom/tv91/features/shared/i/d;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/features/shared/i/i;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/features/shared/i/i;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/shared/i/d;->a:Lcom/tv91/features/shared/i/i;

    iput-object p2, p0, Lcom/tv91/features/shared/i/d;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/features/shared/i/d;->a:Lcom/tv91/features/shared/i/i;

    iget-object v1, p0, Lcom/tv91/features/shared/i/d;->b:Ljava/lang/Runnable;

    check-cast p1, Lcom/tv91/features/shared/i/i;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/features/shared/i/i;->b(Ljava/lang/Runnable;Lcom/tv91/features/shared/i/i;)V

    return-void
.end method
