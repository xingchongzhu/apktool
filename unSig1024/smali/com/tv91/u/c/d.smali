.class public interface abstract Lcom/tv91/u/c/d;
.super Ljava/lang/Object;
.source "MoviesScreen.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/u/c/d$a;
    }
.end annotation


# static fields
.field public static final a:I

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    const/16 v2, 0x14

    goto :goto_0

    :cond_0
    const/16 v2, 0x28

    :goto_0
    sput v2, Lcom/tv91/u/c/d;->a:I

    if-ge v0, v1, :cond_1

    const/16 v0, 0xf

    goto :goto_1

    :cond_1
    const/16 v0, 0x1e

    .line 2
    :goto_1
    sput v0, Lcom/tv91/u/c/d;->b:I

    return-void
.end method
