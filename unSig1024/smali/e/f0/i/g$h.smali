.class public Le/f0/i/g$h;
.super Ljava/lang/Object;
.source "Http2Connection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/f0/i/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field a:Ljava/net/Socket;

.field b:Ljava/lang/String;

.field c:Lf/e;

.field d:Lf/d;

.field e:Le/f0/i/g$j;

.field f:Le/f0/i/l;

.field g:Z

.field h:I


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Le/f0/i/g$j;->a:Le/f0/i/g$j;

    iput-object v0, p0, Le/f0/i/g$h;->e:Le/f0/i/g$j;

    .line 3
    sget-object v0, Le/f0/i/l;->a:Le/f0/i/l;

    iput-object v0, p0, Le/f0/i/g$h;->f:Le/f0/i/l;

    .line 4
    iput-boolean p1, p0, Le/f0/i/g$h;->g:Z

    return-void
.end method


# virtual methods
.method public a()Le/f0/i/g;
    .locals 1

    .line 1
    new-instance v0, Le/f0/i/g;

    invoke-direct {v0, p0}, Le/f0/i/g;-><init>(Le/f0/i/g$h;)V

    return-object v0
.end method

.method public b(Le/f0/i/g$j;)Le/f0/i/g$h;
    .locals 0

    .line 1
    iput-object p1, p0, Le/f0/i/g$h;->e:Le/f0/i/g$j;

    return-object p0
.end method

.method public c(I)Le/f0/i/g$h;
    .locals 0

    .line 1
    iput p1, p0, Le/f0/i/g$h;->h:I

    return-object p0
.end method

.method public d(Ljava/net/Socket;Ljava/lang/String;Lf/e;Lf/d;)Le/f0/i/g$h;
    .locals 0

    .line 1
    iput-object p1, p0, Le/f0/i/g$h;->a:Ljava/net/Socket;

    .line 2
    iput-object p2, p0, Le/f0/i/g$h;->b:Ljava/lang/String;

    .line 3
    iput-object p3, p0, Le/f0/i/g$h;->c:Lf/e;

    .line 4
    iput-object p4, p0, Le/f0/i/g$h;->d:Lf/d;

    return-object p0
.end method
