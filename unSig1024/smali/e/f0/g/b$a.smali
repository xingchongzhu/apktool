.class final Le/f0/g/b$a;
.super Lf/g;
.source "CallServerInterceptor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/f0/g/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field b:J


# direct methods
.method constructor <init>(Lf/r;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lf/g;-><init>(Lf/r;)V

    return-void
.end method


# virtual methods
.method public f(Lf/c;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3}, Lf/g;->f(Lf/c;J)V

    .line 2
    iget-wide v0, p0, Le/f0/g/b$a;->b:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Le/f0/g/b$a;->b:J

    return-void
.end method
