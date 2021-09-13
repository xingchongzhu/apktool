.class public final Lc/a/a/a/b2/s$a;
.super Ljava/lang/Exception;
.source "AudioSink.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/b2/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lc/a/a/a/u0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lc/a/a/a/u0;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p2, p0, Lc/a/a/a/b2/s$a;->a:Lc/a/a/a/u0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Lc/a/a/a/u0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 2
    iput-object p2, p0, Lc/a/a/a/b2/s$a;->a:Lc/a/a/a/u0;

    return-void
.end method
