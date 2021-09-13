.class Lcom/tv91/features/shared/i/f$b;
.super Ljava/lang/Object;
.source "Editors.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/features/shared/i/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lb/g/j/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/a<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(ILb/g/j/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lb/g/j/a<",
            "Landroid/widget/TextView;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/tv91/features/shared/i/f$b;->a:I

    const/16 p1, 0x42

    .line 4
    iput p1, p0, Lcom/tv91/features/shared/i/f$b;->b:I

    if-nez p2, :cond_0

    .line 5
    sget-object p2, Lcom/tv91/features/shared/i/b;->a:Lcom/tv91/features/shared/i/b;

    :cond_0
    iput-object p2, p0, Lcom/tv91/features/shared/i/f$b;->c:Lb/g/j/a;

    return-void
.end method

.method synthetic constructor <init>(ILb/g/j/a;Lcom/tv91/features/shared/i/f$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tv91/features/shared/i/f$b;-><init>(ILb/g/j/a;)V

    return-void
.end method

.method private a(Landroid/content/Context;Landroid/view/View;)V
    .locals 1

    .line 1
    const-class v0, Landroid/view/inputmethod/InputMethodManager;

    invoke-static {p1, v0}, Landroidx/core/content/a;->g(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p2

    const/4 v0, 0x2

    invoke-virtual {p1, p2, v0}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_0
    return-void
.end method

.method static synthetic b(Landroid/widget/TextView;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/tv91/features/shared/i/f$b;->a:I

    if-eq p2, v0, :cond_1

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p2

    iget p3, p0, Lcom/tv91/features/shared/i/f$b;->b:I

    if-ne p2, p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 2
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lcom/tv91/features/shared/i/f$b;->a(Landroid/content/Context;Landroid/view/View;)V

    .line 3
    iget-object p2, p0, Lcom/tv91/features/shared/i/f$b;->c:Lb/g/j/a;

    invoke-interface {p2, p1}, Lb/g/j/a;->a(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
