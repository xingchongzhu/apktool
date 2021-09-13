.class Le/f0/i/g$b;
.super Le/f0/b;
.source "Http2Connection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/f0/i/g;->j0(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:J

.field final synthetic d:Le/f0/i/g;


# direct methods
.method varargs constructor <init>(Le/f0/i/g;Ljava/lang/String;[Ljava/lang/Object;IJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f0/i/g$b;->d:Le/f0/i/g;

    iput p4, p0, Le/f0/i/g$b;->b:I

    iput-wide p5, p0, Le/f0/i/g$b;->c:J

    invoke-direct {p0, p2, p3}, Le/f0/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Le/f0/i/g$b;->d:Le/f0/i/g;

    iget-object v0, v0, Le/f0/i/g;->x:Le/f0/i/j;

    iget v1, p0, Le/f0/i/g$b;->b:I

    iget-wide v2, p0, Le/f0/i/g$b;->c:J

    invoke-virtual {v0, v1, v2, v3}, Le/f0/i/j;->O(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2
    :catch_0
    iget-object v0, p0, Le/f0/i/g$b;->d:Le/f0/i/g;

    invoke-static {v0}, Le/f0/i/g;->B(Le/f0/i/g;)V

    :goto_0
    return-void
.end method
