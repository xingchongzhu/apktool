.class public final synthetic Lcom/tv91/u/e/g/e;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/b/a/c/a;


# static fields
.field public static final synthetic a:Lcom/tv91/u/e/g/e;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/tv91/u/e/g/e;

    invoke-direct {v0}, Lcom/tv91/u/e/g/e;-><init>()V

    sput-object v0, Lcom/tv91/u/e/g/e;->a:Lcom/tv91/u/e/g/e;

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

    invoke-static {p1}, Lcom/tv91/u/e/g/x;->I2(Landroid/view/View;)Lcom/tv91/u/e/b;

    move-result-object p1

    return-object p1
.end method
