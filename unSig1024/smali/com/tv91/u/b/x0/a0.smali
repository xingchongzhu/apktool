.class public final synthetic Lcom/tv91/u/b/x0/a0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tv91/u/b/x0/o1;

.field public final synthetic b:Lcom/tv91/model/a;

.field public final synthetic c:Landroid/os/ParcelFileDescriptor;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/tv91/u/b/x0/o1;Lcom/tv91/model/a;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tv91/u/b/x0/a0;->a:Lcom/tv91/u/b/x0/o1;

    iput-object p2, p0, Lcom/tv91/u/b/x0/a0;->b:Lcom/tv91/model/a;

    iput-object p3, p0, Lcom/tv91/u/b/x0/a0;->c:Landroid/os/ParcelFileDescriptor;

    iput-object p4, p0, Lcom/tv91/u/b/x0/a0;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/tv91/u/b/x0/a0;->a:Lcom/tv91/u/b/x0/o1;

    iget-object v1, p0, Lcom/tv91/u/b/x0/a0;->b:Lcom/tv91/model/a;

    iget-object v2, p0, Lcom/tv91/u/b/x0/a0;->c:Landroid/os/ParcelFileDescriptor;

    iget-object v3, p0, Lcom/tv91/u/b/x0/a0;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/tv91/u/b/x0/o1;->s(Lcom/tv91/model/a;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V

    return-void
.end method
