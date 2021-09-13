.class public final Lc/a/a/a/a1$b;
.super Ljava/lang/Object;
.source "MediaMetadata.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/a/a1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lc/a/a/a/a1;
    .locals 3

    .line 1
    new-instance v0, Lc/a/a/a/a1;

    iget-object v1, p0, Lc/a/a/a/a1$b;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc/a/a/a/a1;-><init>(Ljava/lang/String;Lc/a/a/a/a1$a;)V

    return-object v0
.end method
