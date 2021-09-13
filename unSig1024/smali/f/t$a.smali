.class final Lf/t$a;
.super Lf/t;
.source "Timeout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf/t;-><init>()V

    return-void
.end method


# virtual methods
.method public d(J)Lf/t;
    .locals 0

    return-object p0
.end method

.method public f()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public g(JLjava/util/concurrent/TimeUnit;)Lf/t;
    .locals 0

    return-object p0
.end method
