.class public final Lc/a/c/d;
.super Lc/a/c/f;
.source "FormatException.java"


# static fields
.field private static final c:Lc/a/c/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc/a/c/d;

    invoke-direct {v0}, Lc/a/c/d;-><init>()V

    .line 2
    sput-object v0, Lc/a/c/d;->c:Lc/a/c/d;

    sget-object v1, Lc/a/c/f;->b:[Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v1}, Ljava/lang/Exception;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/c/f;-><init>()V

    return-void
.end method

.method public static a()Lc/a/c/d;
    .locals 1

    .line 1
    sget-boolean v0, Lc/a/c/f;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Lc/a/c/d;

    invoke-direct {v0}, Lc/a/c/d;-><init>()V

    return-object v0

    :cond_0
    sget-object v0, Lc/a/c/d;->c:Lc/a/c/d;

    return-object v0
.end method
