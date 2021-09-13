.class public Lcom/tv91/utils/f$a;
.super Landroidx/fragment/app/Fragment;
.source "Permissions.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/utils/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private d0:Lcom/tv91/utils/f$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method static synthetic l2(Lcom/tv91/utils/f$a;Lcom/tv91/utils/f$b;[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tv91/utils/f$a;->m2(Lcom/tv91/utils/f$b;[Ljava/lang/String;)V

    return-void
.end method

.method private varargs m2(Lcom/tv91/utils/f$b;[Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/utils/f$a;->d0:Lcom/tv91/utils/f$b;

    const/16 p1, 0x17

    .line 2
    invoke-virtual {p0, p2, p1}, Landroidx/fragment/app/Fragment;->L1([Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public J0(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->J0(Landroid/os/Bundle;)V

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->f2(Z)V

    return-void
.end method

.method public d1(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M1()Landroidx/fragment/app/e;

    move-result-object p1

    iget-object v0, p0, Lcom/tv91/utils/f$a;->d0:Lcom/tv91/utils/f$b;

    invoke-static {p1, p2, p3, v0}, Lcom/tv91/utils/f;->a(Landroid/app/Activity;[Ljava/lang/String;[ILcom/tv91/utils/f$b;)V

    return-void
.end method
