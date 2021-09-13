.class Le/c0$a;
.super Le/c0;
.source "ResponseBody.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/c0;->E(Le/v;JLf/e;)Le/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Le/v;

.field final synthetic b:J

.field final synthetic c:Lf/e;


# direct methods
.method constructor <init>(Le/v;JLf/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/c0$a;->a:Le/v;

    iput-wide p2, p0, Le/c0$a;->b:J

    iput-object p4, p0, Le/c0$a;->c:Lf/e;

    invoke-direct {p0}, Le/c0;-><init>()V

    return-void
.end method


# virtual methods
.method public C()J
    .locals 2

    .line 1
    iget-wide v0, p0, Le/c0$a;->b:J

    return-wide v0
.end method

.method public D()Le/v;
    .locals 1

    .line 1
    iget-object v0, p0, Le/c0$a;->a:Le/v;

    return-object v0
.end method

.method public H()Lf/e;
    .locals 1

    .line 1
    iget-object v0, p0, Le/c0$a;->c:Lf/e;

    return-object v0
.end method
