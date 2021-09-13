.class public final synthetic Lcom/tv91/features/authentication/n/p;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/features/authentication/n/i0;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/features/authentication/n/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/authentication/n/p;->a:Lcom/tv91/features/authentication/n/i0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/tv91/features/authentication/n/p;->a:Lcom/tv91/features/authentication/n/i0;

    check-cast p1, Lcom/tv91/model/User;

    invoke-virtual {v0, p1}, Lcom/tv91/features/authentication/n/i0;->v2(Lcom/tv91/model/User;)V

    return-void
.end method
