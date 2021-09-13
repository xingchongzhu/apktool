.class public final synthetic Lc/a/a/a/a2/y0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lc/a/a/a/m2/s$a;


# instance fields
.field public final synthetic a:Lc/a/a/a/a2/d1$a;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/a2/d1$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/a2/y0;->a:Lc/a/a/a/a2/d1$a;

    iput-wide p2, p0, Lc/a/a/a/a2/y0;->b:J

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lc/a/a/a/a2/y0;->a:Lc/a/a/a/a2/d1$a;

    iget-wide v1, p0, Lc/a/a/a/a2/y0;->b:J

    check-cast p1, Lc/a/a/a/a2/d1;

    invoke-static {v0, v1, v2, p1}, Lc/a/a/a/a2/c1;->o0(Lc/a/a/a/a2/d1$a;JLc/a/a/a/a2/d1;)V

    return-void
.end method
