.class Le/m$a;
.super Ljava/lang/Object;
.source "CookieJar.java"

# interfaces
.implements Le/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/t;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/t;",
            ")",
            "Ljava/util/List<",
            "Le/l;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public b(Le/t;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/t;",
            "Ljava/util/List<",
            "Le/l;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
