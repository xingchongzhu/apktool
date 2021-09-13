.class public final synthetic Lcom/tv91/features/authentication/m/j;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# instance fields
.field public final synthetic a:Lcom/tv91/features/authentication/m/q;

.field public final synthetic b:Lb/g/j/a;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/features/authentication/m/q;Lb/g/j/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/authentication/m/j;->a:Lcom/tv91/features/authentication/m/q;

    iput-object p2, p0, Lcom/tv91/features/authentication/m/j;->b:Lb/g/j/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/tv91/features/authentication/m/j;->a:Lcom/tv91/features/authentication/m/q;

    iget-object v1, p0, Lcom/tv91/features/authentication/m/j;->b:Lb/g/j/a;

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {v0, v1, p1}, Lcom/tv91/features/authentication/m/q;->r2(Lb/g/j/a;Landroid/widget/TextView;)V

    return-void
.end method
