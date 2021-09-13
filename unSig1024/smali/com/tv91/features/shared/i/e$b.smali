.class Lcom/tv91/features/shared/i/e$b;
.super Ljava/lang/Object;
.source "Clicks.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/features/shared/i/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:J

.field private final b:Landroid/view/View$OnClickListener;

.field private c:J


# direct methods
.method private constructor <init>(JLandroid/view/View$OnClickListener;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/tv91/features/shared/i/e$b;->c:J

    .line 4
    iput-wide p1, p0, Lcom/tv91/features/shared/i/e$b;->a:J

    if-nez p3, :cond_0

    .line 5
    sget-object p3, Lcom/tv91/features/shared/i/a;->a:Lcom/tv91/features/shared/i/a;

    :cond_0
    iput-object p3, p0, Lcom/tv91/features/shared/i/e$b;->b:Landroid/view/View$OnClickListener;

    return-void
.end method

.method synthetic constructor <init>(JLandroid/view/View$OnClickListener;Lcom/tv91/features/shared/i/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/tv91/features/shared/i/e$b;-><init>(JLandroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic a(Landroid/view/View;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2
    :try_start_0
    iget-wide v2, p0, Lcom/tv91/features/shared/i/e$b;->c:J

    sub-long v2, v0, v2

    iget-wide v4, p0, Lcom/tv91/features/shared/i/e$b;->a:J

    cmp-long v6, v2, v4

    if-lez v6, :cond_0

    .line 3
    iget-object v2, p0, Lcom/tv91/features/shared/i/e$b;->b:Landroid/view/View$OnClickListener;

    invoke-interface {v2, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :cond_0
    iput-wide v0, p0, Lcom/tv91/features/shared/i/e$b;->c:J

    return-void

    :catchall_0
    move-exception p1

    iput-wide v0, p0, Lcom/tv91/features/shared/i/e$b;->c:J

    .line 5
    throw p1
.end method
