.class Le/f0/i/g$l$c;
.super Le/f0/b;
.source "Http2Connection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/f0/i/g$l;->l(ZLe/f0/i/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Le/f0/i/g$l;


# direct methods
.method varargs constructor <init>(Le/f0/i/g$l;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f0/i/g$l$c;->b:Le/f0/i/g$l;

    invoke-direct {p0, p2, p3}, Le/f0/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f0/i/g$l$c;->b:Le/f0/i/g$l;

    iget-object v0, v0, Le/f0/i/g$l;->c:Le/f0/i/g;

    iget-object v1, v0, Le/f0/i/g;->c:Le/f0/i/g$j;

    invoke-virtual {v1, v0}, Le/f0/i/g$j;->a(Le/f0/i/g;)V

    return-void
.end method
