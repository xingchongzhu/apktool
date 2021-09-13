.class Lcom/tv91/u/b/p0$b;
.super Lcom/tv91/features/shared/h/d;
.source "DownloadAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/u/b/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tv91/features/shared/h/d<",
        "Lcom/tv91/model/a;",
        ">;"
    }
.end annotation


# instance fields
.field private final A:I

.field private final B:I

.field private final w:Lcom/tv91/r/b;

.field private final x:Landroid/graphics/drawable/Drawable;

.field private final y:Landroid/graphics/drawable/Drawable;

.field private final z:Landroid/graphics/drawable/Drawable;


# direct methods
.method private constructor <init>(Lcom/tv91/r/b;)V
    .locals 1

    .line 2
    invoke-direct {p0, p1}, Lcom/tv91/features/shared/h/d;-><init>(Lb/r/a;)V

    .line 3
    iput-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    .line 4
    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    const v0, 0x7f060023

    invoke-virtual {p0, v0}, Lcom/tv91/features/shared/h/d;->O(I)I

    move-result v0

    invoke-direct {p1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object p1, p0, Lcom/tv91/u/b/p0$b;->x:Landroid/graphics/drawable/Drawable;

    const p1, 0x7f0800e5

    .line 5
    invoke-virtual {p0, p1}, Lcom/tv91/features/shared/h/d;->Q(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/b/p0$b;->y:Landroid/graphics/drawable/Drawable;

    const p1, 0x7f0800e8

    .line 6
    invoke-virtual {p0, p1}, Lcom/tv91/features/shared/h/d;->Q(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/tv91/u/b/p0$b;->z:Landroid/graphics/drawable/Drawable;

    const p1, 0x7f0600f3

    .line 7
    invoke-virtual {p0, p1}, Lcom/tv91/features/shared/h/d;->O(I)I

    move-result p1

    iput p1, p0, Lcom/tv91/u/b/p0$b;->A:I

    const p1, 0x7f060033

    .line 8
    invoke-virtual {p0, p1}, Lcom/tv91/features/shared/h/d;->O(I)I

    move-result p1

    iput p1, p0, Lcom/tv91/u/b/p0$b;->B:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/r/b;Lcom/tv91/u/b/p0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tv91/u/b/p0$b;-><init>(Lcom/tv91/r/b;)V

    return-void
.end method

.method static synthetic T(Lcom/tv91/u/b/p0$b;Lb/g/j/i;Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tv91/u/b/p0$b;->Y(Lb/g/j/i;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic U(Lcom/tv91/u/b/p0$b;Lcom/tv91/model/a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tv91/u/b/p0$b;->W(Lcom/tv91/model/a;Z)V

    return-void
.end method

.method static synthetic V(Lcom/tv91/u/b/p0$b;)Lcom/tv91/r/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    return-object p0
.end method

.method private W(Lcom/tv91/model/a;Z)V
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-object v0, v0, Lcom/tv91/model/Movie;->poster:Ljava/lang/String;

    .line 2
    iget-object v1, p0, Lcom/tv91/features/shared/h/d;->v:Lcom/tv91/z/f;

    invoke-interface {v1, v0}, Lcom/tv91/z/f;->b(Ljava/lang/String;)Lcom/tv91/z/f;

    move-result-object v0

    const v1, 0x7f08011a

    .line 3
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->e(I)Lcom/tv91/z/f;

    move-result-object v0

    .line 4
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->c(I)Lcom/tv91/z/f;

    move-result-object v0

    iget-object v1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v1, v1, Lcom/tv91/r/b;->c:Landroid/widget/ImageView;

    .line 5
    invoke-interface {v0, v1}, Lcom/tv91/z/f;->g(Landroid/widget/ImageView;)V

    .line 6
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->l:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-object v1, v1, Lcom/tv91/model/Movie;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/tv91/features/shared/h/d;->u:Landroid/content/Context;

    iget-object v2, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-wide v2, v2, Lcom/tv91/model/Movie;->fileSize:J

    invoke-static {v1, v2, v3}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    sget-object v0, Lcom/tv91/u/b/p0$a;->a:[I

    iget-object v1, p1, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 9
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/tv91/u/b/p0$b;->X(Lcom/tv91/model/a;)I

    move-result p1

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/b/p0$b;->e0(IZ)V

    goto :goto_0

    .line 10
    :pswitch_1
    invoke-direct {p0, p2}, Lcom/tv91/u/b/p0$b;->f0(Z)V

    goto :goto_0

    .line 11
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/tv91/u/b/p0$b;->X(Lcom/tv91/model/a;)I

    move-result p1

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/b/p0$b;->g0(IZ)V

    goto :goto_0

    .line 12
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/tv91/u/b/p0$b;->X(Lcom/tv91/model/a;)I

    move-result p1

    invoke-direct {p0, p1, p2}, Lcom/tv91/u/b/p0$b;->d0(IZ)V

    goto :goto_0

    .line 13
    :pswitch_4
    invoke-direct {p0, p1, p2}, Lcom/tv91/u/b/p0$b;->c0(Lcom/tv91/model/a;Z)V

    .line 14
    :goto_0
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->i:Lcom/tv91/features/shared/widget/DrawableTextView;

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_1

    :cond_0
    const/16 p2, 0x8

    :goto_1
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private X(Lcom/tv91/model/a;)I
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/tv91/utils/g;->g(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/tv91/model/a;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    const-string v3, "file"

    invoke-static {v2, v3}, Lcom/tv91/utils/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 3
    new-instance v2, Ljava/io/File;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    const/high16 v0, 0x42c80000    # 100.0f

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v1

    long-to-float v1, v1

    mul-float v1, v1, v0

    iget-object p1, p1, Lcom/tv91/model/a;->c:Lcom/tv91/model/Movie;

    iget-wide v2, p1, Lcom/tv91/model/Movie;->fileSize:J

    long-to-float p1, v2

    div-float/2addr v1, p1

    float-to-int v1, v1

    :cond_1
    return v1
.end method

.method private Y(Lb/g/j/i;Landroid/view/View$OnClickListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/g/j/i<",
            "Lcom/tv91/model/a;",
            ">;",
            "Landroid/view/View$OnClickListener;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->b:Landroid/widget/ImageView;

    new-instance v1, Lcom/tv91/u/b/c;

    invoke-direct {v1, p0, p1, p2}, Lcom/tv91/u/b/c;-><init>(Lcom/tv91/u/b/p0$b;Lb/g/j/i;Landroid/view/View$OnClickListener;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->j:Landroid/widget/TextView;

    new-instance v1, Lcom/tv91/u/b/d;

    invoke-direct {v1, p1, p2}, Lcom/tv91/u/b/d;-><init>(Lb/g/j/i;Landroid/view/View$OnClickListener;)V

    invoke-static {v1}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->i:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-static {p2}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->g:Lcom/tv91/features/shared/widget/DrawableTextView;

    invoke-static {p2}, Lcom/tv91/features/shared/i/e;->a(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private synthetic Z(Lb/g/j/i;Landroid/view/View$OnClickListener;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lb/g/j/i;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tv91/model/a;

    .line 2
    iget-object p1, p1, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    sget-object v0, Lcom/tv91/model/a$a;->a:Lcom/tv91/model/a$a;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/tv91/model/a$a;->c:Lcom/tv91/model/a$a;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/tv91/model/a$a;->b:Lcom/tv91/model/a$a;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/tv91/model/a$a;->h:Lcom/tv91/model/a$a;

    if-ne p1, v0, :cond_1

    :cond_0
    const/16 p1, 0x8

    .line 3
    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->e:Landroid/widget/ProgressBar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 5
    invoke-interface {p2, p3}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method static synthetic b0(Lb/g/j/i;Landroid/view/View$OnClickListener;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Lb/g/j/i;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/tv91/model/a;

    invoke-virtual {p0}, Lcom/tv91/model/a;->a()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 2
    invoke-interface {p1, p2}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private c0(Lcom/tv91/model/a;Z)V
    .locals 4

    .line 1
    iget-object p1, p1, Lcom/tv91/model/a;->f:Lcom/tv91/model/a$a;

    sget-object v0, Lcom/tv91/model/a$a;->d:Lcom/tv91/model/a$a;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    :goto_0
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->d:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->f:Landroid/widget/ProgressBar;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->j:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    const v3, 0x7f120063

    goto :goto_1

    :cond_1
    const v3, 0x7f120067

    :goto_1
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    .line 8
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->j:Landroid/widget/TextView;

    iget v3, p0, Lcom/tv91/u/b/p0$b;->A:I

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 9
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->g:Lcom/tv91/features/shared/widget/DrawableTextView;

    if-eqz p2, :cond_2

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    const/16 v1, 0x8

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private d0(IZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->d:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/tv91/u/b/p0$b;->x:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->f:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->f:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->h:Landroid/widget/TextView;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v1

    const-string p1, "%d%%"

    invoke-static {p1, v2}, Lcom/tv91/utils/g;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->b:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->b:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->y:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 8
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->e:Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 9
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->j:Landroid/widget/TextView;

    const v2, 0x7f120064

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 10
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->j:Landroid/widget/TextView;

    iget v2, p0, Lcom/tv91/u/b/p0$b;->B:I

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 11
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->i:Lcom/tv91/features/shared/widget/DrawableTextView;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private e0(IZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->d:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/tv91/u/b/p0$b;->x:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->f:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->f:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->h:Landroid/widget/TextView;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v1

    const-string p1, "%d%%"

    invoke-static {p1, v2}, Lcom/tv91/utils/g;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->b:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->z:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->e:Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 8
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->j:Landroid/widget/TextView;

    const v2, 0x7f120065

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 9
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->j:Landroid/widget/TextView;

    iget v2, p0, Lcom/tv91/u/b/p0$b;->A:I

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 10
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->i:Lcom/tv91/features/shared/widget/DrawableTextView;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private f0(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->d:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/tv91/u/b/p0$b;->x:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->f:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->j:Landroid/widget/TextView;

    const v2, 0x7f120066

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 7
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->j:Landroid/widget/TextView;

    iget v2, p0, Lcom/tv91/u/b/p0$b;->A:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->i:Lcom/tv91/features/shared/widget/DrawableTextView;

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private g0(IZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->d:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/tv91/u/b/p0$b;->x:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->f:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->f:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 4
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object v0, v0, Lcom/tv91/r/b;->h:Landroid/widget/TextView;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v1

    const-string p1, "%d%%"

    invoke-static {p1, v2}, Lcom/tv91/utils/g;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->b:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/tv91/u/b/p0$b;->z:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->b:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 8
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->e:Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 9
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->j:Landroid/widget/TextView;

    const v2, 0x7f120068

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 10
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->j:Landroid/widget/TextView;

    iget v2, p0, Lcom/tv91/u/b/p0$b;->A:I

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 11
    iget-object p1, p0, Lcom/tv91/u/b/p0$b;->w:Lcom/tv91/r/b;

    iget-object p1, p1, Lcom/tv91/r/b;->i:Lcom/tv91/features/shared/widget/DrawableTextView;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public synthetic a0(Lb/g/j/i;Landroid/view/View$OnClickListener;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/tv91/u/b/p0$b;->Z(Lb/g/j/i;Landroid/view/View$OnClickListener;Landroid/view/View;)V

    return-void
.end method
