.class Lcom/tv91/z/i/a$c;
.super Lcom/bumptech/glide/load/o/g;
.source "GlideImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/z/i/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bumptech/glide/load/o/g;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p2, p0, Lcom/tv91/z/i/a$c;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tv91/z/i/a$c;->i:Ljava/lang/String;

    return-object v0
.end method
