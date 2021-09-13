.class public final synthetic Lc/a/a/a/a2/o;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lc/a/a/a/m2/s$a;


# instance fields
.field public final synthetic a:Lc/a/a/a/a2/d1$a;

.field public final synthetic b:Lc/a/a/a/z0;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/a2/d1$a;Lc/a/a/a/z0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/a2/o;->a:Lc/a/a/a/a2/d1$a;

    iput-object p2, p0, Lc/a/a/a/a2/o;->b:Lc/a/a/a/z0;

    iput p3, p0, Lc/a/a/a/a2/o;->c:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lc/a/a/a/a2/o;->a:Lc/a/a/a/a2/d1$a;

    iget-object v1, p0, Lc/a/a/a/a2/o;->b:Lc/a/a/a/z0;

    iget v2, p0, Lc/a/a/a/a2/o;->c:I

    check-cast p1, Lc/a/a/a/a2/d1;

    invoke-static {v0, v1, v2, p1}, Lc/a/a/a/a2/c1;->G0(Lc/a/a/a/a2/d1$a;Lc/a/a/a/z0;ILc/a/a/a/a2/d1;)V

    return-void
.end method
