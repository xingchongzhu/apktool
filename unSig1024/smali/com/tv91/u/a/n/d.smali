.class public final synthetic Lcom/tv91/u/a/n/d;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/b/a/c/a;


# static fields
.field public static final synthetic a:Lcom/tv91/u/a/n/d;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/tv91/u/a/n/d;

    invoke-direct {v0}, Lcom/tv91/u/a/n/d;-><init>()V

    sput-object v0, Lcom/tv91/u/a/n/d;->a:Lcom/tv91/u/a/n/d;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Lcom/tv91/u/a/n/o;->D2(Landroid/view/View;)Lcom/tv91/u/a/f;

    move-result-object p1

    return-object p1
.end method
