.class public final synthetic Lc/a/a/a/a2/z0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lc/a/a/a/m2/s$a;


# instance fields
.field public final synthetic a:Lc/a/a/a/a2/d1$a;

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/a2/d1$a;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/a2/z0;->a:Lc/a/a/a/a2/d1$a;

    iput p2, p0, Lc/a/a/a/a2/z0;->b:I

    iput-wide p3, p0, Lc/a/a/a/a2/z0;->c:J

    iput-wide p5, p0, Lc/a/a/a/a2/z0;->d:J

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 7

    iget-object v0, p0, Lc/a/a/a/a2/z0;->a:Lc/a/a/a/a2/d1$a;

    iget v1, p0, Lc/a/a/a/a2/z0;->b:I

    iget-wide v2, p0, Lc/a/a/a/a2/z0;->c:J

    iget-wide v4, p0, Lc/a/a/a/a2/z0;->d:J

    move-object v6, p1

    check-cast v6, Lc/a/a/a/a2/d1;

    invoke-static/range {v0 .. v6}, Lc/a/a/a/a2/c1;->q0(Lc/a/a/a/a2/d1$a;IJJLc/a/a/a/a2/d1;)V

    return-void
.end method
