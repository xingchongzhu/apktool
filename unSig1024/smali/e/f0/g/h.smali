.class public final Le/f0/g/h;
.super Le/c0;
.source "RealResponseBody.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:J

.field private final c:Lf/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLf/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/c0;-><init>()V

    .line 2
    iput-object p1, p0, Le/f0/g/h;->a:Ljava/lang/String;

    .line 3
    iput-wide p2, p0, Le/f0/g/h;->b:J

    .line 4
    iput-object p4, p0, Le/f0/g/h;->c:Lf/e;

    return-void
.end method


# virtual methods
.method public C()J
    .locals 2

    .line 1
    iget-wide v0, p0, Le/f0/g/h;->b:J

    return-wide v0
.end method

.method public D()Le/v;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f0/g/h;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Le/v;->d(Ljava/lang/String;)Le/v;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public H()Lf/e;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f0/g/h;->c:Lf/e;

    return-object v0
.end method
