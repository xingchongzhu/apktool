.class Le/f0/i/g$l$b;
.super Le/f0/b;
.source "Http2Connection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/f0/i/g$l;->b(ZLe/f0/i/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:Le/f0/i/m;

.field final synthetic d:Le/f0/i/g$l;


# direct methods
.method varargs constructor <init>(Le/f0/i/g$l;Ljava/lang/String;[Ljava/lang/Object;ZLe/f0/i/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f0/i/g$l$b;->d:Le/f0/i/g$l;

    iput-boolean p4, p0, Le/f0/i/g$l$b;->b:Z

    iput-object p5, p0, Le/f0/i/g$l$b;->c:Le/f0/i/m;

    invoke-direct {p0, p2, p3}, Le/f0/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/f0/i/g$l$b;->d:Le/f0/i/g$l;

    iget-boolean v1, p0, Le/f0/i/g$l$b;->b:Z

    iget-object v2, p0, Le/f0/i/g$l$b;->c:Le/f0/i/m;

    invoke-virtual {v0, v1, v2}, Le/f0/i/g$l;->l(ZLe/f0/i/m;)V

    return-void
.end method
