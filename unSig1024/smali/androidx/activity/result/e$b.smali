.class public final Landroidx/activity/result/e$b;
.super Ljava/lang/Object;
.source "IntentSenderRequest.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/result/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/content/IntentSender;

.field private b:Landroid/content/Intent;

.field private c:I

.field private d:I


# direct methods
.method public constructor <init>(Landroid/content/IntentSender;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/activity/result/e$b;->a:Landroid/content/IntentSender;

    return-void
.end method


# virtual methods
.method public a()Landroidx/activity/result/e;
    .locals 5

    .line 1
    new-instance v0, Landroidx/activity/result/e;

    iget-object v1, p0, Landroidx/activity/result/e$b;->a:Landroid/content/IntentSender;

    iget-object v2, p0, Landroidx/activity/result/e$b;->b:Landroid/content/Intent;

    iget v3, p0, Landroidx/activity/result/e$b;->c:I

    iget v4, p0, Landroidx/activity/result/e$b;->d:I

    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/activity/result/e;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    return-object v0
.end method

.method public b(Landroid/content/Intent;)Landroidx/activity/result/e$b;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/activity/result/e$b;->b:Landroid/content/Intent;

    return-object p0
.end method

.method public c(II)Landroidx/activity/result/e$b;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/activity/result/e$b;->d:I

    .line 2
    iput p2, p0, Landroidx/activity/result/e$b;->c:I

    return-object p0
.end method
