.class public final synthetic Lc/a/a/a/n2/i;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/a/a/a/n2/z$a;

.field public final synthetic b:J

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/n2/z$a;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/n2/i;->a:Lc/a/a/a/n2/z$a;

    iput-wide p2, p0, Lc/a/a/a/n2/i;->b:J

    iput p4, p0, Lc/a/a/a/n2/i;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lc/a/a/a/n2/i;->a:Lc/a/a/a/n2/z$a;

    iget-wide v1, p0, Lc/a/a/a/n2/i;->b:J

    iget v3, p0, Lc/a/a/a/n2/i;->c:I

    invoke-virtual {v0, v1, v2, v3}, Lc/a/a/a/n2/z$a;->v(JI)V

    return-void
.end method
