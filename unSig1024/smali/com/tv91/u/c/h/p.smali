.class public final synthetic Lcom/tv91/u/c/h/p;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lb/g/j/a;


# static fields
.field public static final synthetic a:Lcom/tv91/u/c/h/p;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/tv91/u/c/h/p;

    invoke-direct {v0}, Lcom/tv91/u/c/h/p;-><init>()V

    sput-object v0, Lcom/tv91/u/c/h/p;->a:Lcom/tv91/u/c/h/p;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/tv91/model/Movie;

    invoke-static {p1}, Lcom/tv91/u/c/h/u;->v2(Lcom/tv91/model/Movie;)V

    return-void
.end method
