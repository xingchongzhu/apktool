.class public final synthetic Lcom/tv91/features/authentication/n/z;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/authentication/n/z;->a:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/tv91/features/authentication/n/z;->a:Ljava/lang/Runnable;

    check-cast p1, Landroid/widget/TextView;

    invoke-static {v0, p1}, Lcom/tv91/features/authentication/n/l0;->C2(Ljava/lang/Runnable;Landroid/widget/TextView;)V

    return-void
.end method
