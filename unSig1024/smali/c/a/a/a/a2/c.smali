.class public final synthetic Lc/a/a/a/a2/c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lc/a/a/a/m2/s$a;


# instance fields
.field public final synthetic a:Lc/a/a/a/a2/d1$a;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/a2/d1$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/a2/c;->a:Lc/a/a/a/a2/d1$a;

    iput p2, p0, Lc/a/a/a/a2/c;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lc/a/a/a/a2/c;->a:Lc/a/a/a/a2/d1$a;

    iget v1, p0, Lc/a/a/a/a2/c;->b:I

    check-cast p1, Lc/a/a/a/a2/d1;

    invoke-static {v0, v1, p1}, Lc/a/a/a/a2/c1;->L0(Lc/a/a/a/a2/d1$a;ILc/a/a/a/a2/d1;)V

    return-void
.end method
