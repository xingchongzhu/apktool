.class public interface abstract Le/m;
.super Ljava/lang/Object;
.source "CookieJar.java"


# static fields
.field public static final a:Le/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/m$a;

    invoke-direct {v0}, Le/m$a;-><init>()V

    sput-object v0, Le/m;->a:Le/m;

    return-void
.end method


# virtual methods
.method public abstract a(Le/t;)Ljava/util/List;
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
.end method

.method public abstract b(Le/t;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/t;",
            "Ljava/util/List<",
            "Le/l;",
            ">;)V"
        }
    .end annotation
.end method
