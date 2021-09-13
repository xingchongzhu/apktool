.class Lcom/tv91/z/i/a$a;
.super Ljava/lang/Object;
.source "GlideImageLoader.java"

# interfaces
.implements Lcom/tv91/z/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tv91/z/i/a;->f(Lcom/tv91/utils/i/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tv91/utils/i/a;

.field final synthetic b:Lcom/tv91/z/i/a;


# direct methods
.method constructor <init>(Lcom/tv91/z/i/a;Lcom/tv91/utils/i/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tv91/z/i/a$a;->b:Lcom/tv91/z/i/a;

    iput-object p2, p0, Lcom/tv91/z/i/a$a;->a:Lcom/tv91/utils/i/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/z/i/a$a;->a:Lcom/tv91/utils/i/a;

    invoke-interface {v0, p1, p2}, Lcom/tv91/utils/i/a;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic b(Ljava/lang/String;Lcom/tv91/s/c;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/tv91/z/e;->a(Lcom/tv91/z/f$a;Ljava/lang/String;Lcom/tv91/s/c;)V

    return-void
.end method
