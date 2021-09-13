.class public final synthetic Lc/a/a/a/c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lc/a/a/a/m2/s$a;


# instance fields
.field public final synthetic a:Lc/a/a/a/h1;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lc/a/a/a/h1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/a/c;->a:Lc/a/a/a/h1;

    iput p2, p0, Lc/a/a/a/c;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lc/a/a/a/c;->a:Lc/a/a/a/h1;

    iget v1, p0, Lc/a/a/a/c;->b:I

    check-cast p1, Lc/a/a/a/l1$a;

    invoke-static {v0, v1, p1}, Lc/a/a/a/q0;->F0(Lc/a/a/a/h1;ILc/a/a/a/l1$a;)V

    return-void
.end method
