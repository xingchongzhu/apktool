.class public final Lb/g/k/c$a;
.super Ljava/lang/Object;
.source "ContentInfoCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/g/k/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field a:Landroid/content/ClipData;

.field b:I

.field c:I

.field d:Landroid/net/Uri;

.field e:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lb/g/k/c$a;->a:Landroid/content/ClipData;

    .line 3
    iput p2, p0, Lb/g/k/c$a;->b:I

    return-void
.end method


# virtual methods
.method public a()Lb/g/k/c;
    .locals 1

    .line 1
    new-instance v0, Lb/g/k/c;

    invoke-direct {v0, p0}, Lb/g/k/c;-><init>(Lb/g/k/c$a;)V

    return-object v0
.end method

.method public b(Landroid/os/Bundle;)Lb/g/k/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lb/g/k/c$a;->e:Landroid/os/Bundle;

    return-object p0
.end method

.method public c(I)Lb/g/k/c$a;
    .locals 0

    .line 1
    iput p1, p0, Lb/g/k/c$a;->c:I

    return-object p0
.end method

.method public d(Landroid/net/Uri;)Lb/g/k/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lb/g/k/c$a;->d:Landroid/net/Uri;

    return-object p0
.end method
