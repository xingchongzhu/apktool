.class public final synthetic Lcom/tv91/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field public static final synthetic a:Lcom/tv91/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/tv91/a;

    invoke-direct {v0}, Lcom/tv91/a;-><init>()V

    sput-object v0, Lcom/tv91/a;->a:Lcom/tv91/a;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p1, p2}, Lcom/tv91/App;->h(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method
