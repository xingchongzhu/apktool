.class public final synthetic Lcom/tv91/features/shared/c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroidx/appcompat/widget/Toolbar$f;


# instance fields
.field public final synthetic a:Lcom/tv91/features/shared/g;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/features/shared/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/features/shared/c;->a:Lcom/tv91/features/shared/g;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lcom/tv91/features/shared/c;->a:Lcom/tv91/features/shared/g;

    invoke-static {v0, p1}, Lcom/tv91/features/shared/g;->d(Lcom/tv91/features/shared/g;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
