.class Lcom/tv91/z/i/a$b;
.super Lcom/bumptech/glide/r/j/c;
.source "GlideImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/z/i/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/r/j/c<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final d:Ljava/lang/String;

.field private final e:Lcom/tv91/z/f$a;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/tv91/z/f$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bumptech/glide/r/j/c;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/tv91/z/i/a$b;->d:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/tv91/z/i/a$b;->e:Lcom/tv91/z/f$a;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/tv91/z/f$a;Lcom/tv91/z/i/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tv91/z/i/a$b;-><init>(Ljava/lang/String;Lcom/tv91/z/f$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic d(Ljava/lang/Object;Lcom/bumptech/glide/r/k/b;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lcom/tv91/z/i/a$b;->l(Landroid/graphics/Bitmap;Lcom/bumptech/glide/r/k/b;)V

    return-void
.end method

.method public e(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/tv91/z/i/a$b;->e:Lcom/tv91/z/f$a;

    iget-object v0, p0, Lcom/tv91/z/i/a$b;->d:Ljava/lang/String;

    new-instance v1, Lcom/tv91/s/c;

    invoke-direct {v1}, Lcom/tv91/s/c;-><init>()V

    invoke-interface {p1, v0, v1}, Lcom/tv91/z/f$a;->b(Ljava/lang/String;Lcom/tv91/s/c;)V

    return-void
.end method

.method public h(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public l(Landroid/graphics/Bitmap;Lcom/bumptech/glide/r/k/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lcom/bumptech/glide/r/k/b<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lcom/tv91/z/i/a$b;->e:Lcom/tv91/z/f$a;

    iget-object v0, p0, Lcom/tv91/z/i/a$b;->d:Ljava/lang/String;

    invoke-interface {p2, v0, p1}, Lcom/tv91/z/f$a;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method
