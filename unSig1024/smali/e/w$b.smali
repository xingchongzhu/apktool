.class public final Le/w$b;
.super Ljava/lang/Object;
.source "OkHttpClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field A:I

.field a:Le/n;

.field b:Ljava/net/Proxy;

.field c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/x;",
            ">;"
        }
    .end annotation
.end field

.field d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/k;",
            ">;"
        }
    .end annotation
.end field

.field final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/u;",
            ">;"
        }
    .end annotation
.end field

.field final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/u;",
            ">;"
        }
    .end annotation
.end field

.field g:Le/p$c;

.field h:Ljava/net/ProxySelector;

.field i:Le/m;

.field j:Le/f0/e/d;

.field k:Ljavax/net/SocketFactory;

.field l:Ljavax/net/ssl/SSLSocketFactory;

.field m:Le/f0/l/c;

.field n:Ljavax/net/ssl/HostnameVerifier;

.field o:Le/g;

.field p:Le/b;

.field q:Le/b;

.field r:Le/j;

.field s:Le/o;

.field t:Z

.field u:Z

.field v:Z

.field w:I

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/w$b;->e:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/w$b;->f:Ljava/util/List;

    .line 4
    new-instance v0, Le/n;

    invoke-direct {v0}, Le/n;-><init>()V

    iput-object v0, p0, Le/w$b;->a:Le/n;

    .line 5
    sget-object v0, Le/w;->a:Ljava/util/List;

    iput-object v0, p0, Le/w$b;->c:Ljava/util/List;

    .line 6
    sget-object v0, Le/w;->b:Ljava/util/List;

    iput-object v0, p0, Le/w$b;->d:Ljava/util/List;

    .line 7
    sget-object v0, Le/p;->a:Le/p;

    invoke-static {v0}, Le/p;->k(Le/p;)Le/p$c;

    move-result-object v0

    iput-object v0, p0, Le/w$b;->g:Le/p$c;

    .line 8
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    iput-object v0, p0, Le/w$b;->h:Ljava/net/ProxySelector;

    if-nez v0, :cond_0

    .line 9
    new-instance v0, Le/f0/k/a;

    invoke-direct {v0}, Le/f0/k/a;-><init>()V

    iput-object v0, p0, Le/w$b;->h:Ljava/net/ProxySelector;

    .line 10
    :cond_0
    sget-object v0, Le/m;->a:Le/m;

    iput-object v0, p0, Le/w$b;->i:Le/m;

    .line 11
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Le/w$b;->k:Ljavax/net/SocketFactory;

    .line 12
    sget-object v0, Le/f0/l/d;->a:Le/f0/l/d;

    iput-object v0, p0, Le/w$b;->n:Ljavax/net/ssl/HostnameVerifier;

    .line 13
    sget-object v0, Le/g;->a:Le/g;

    iput-object v0, p0, Le/w$b;->o:Le/g;

    .line 14
    sget-object v0, Le/b;->a:Le/b;

    iput-object v0, p0, Le/w$b;->p:Le/b;

    .line 15
    iput-object v0, p0, Le/w$b;->q:Le/b;

    .line 16
    new-instance v0, Le/j;

    invoke-direct {v0}, Le/j;-><init>()V

    iput-object v0, p0, Le/w$b;->r:Le/j;

    .line 17
    sget-object v0, Le/o;->a:Le/o;

    iput-object v0, p0, Le/w$b;->s:Le/o;

    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Le/w$b;->t:Z

    .line 19
    iput-boolean v0, p0, Le/w$b;->u:Z

    .line 20
    iput-boolean v0, p0, Le/w$b;->v:Z

    const/4 v0, 0x0

    .line 21
    iput v0, p0, Le/w$b;->w:I

    const/16 v1, 0x2710

    .line 22
    iput v1, p0, Le/w$b;->x:I

    .line 23
    iput v1, p0, Le/w$b;->y:I

    .line 24
    iput v1, p0, Le/w$b;->z:I

    .line 25
    iput v0, p0, Le/w$b;->A:I

    return-void
.end method


# virtual methods
.method public a(Le/u;)Le/w$b;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Le/w$b;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "interceptor == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()Le/w;
    .locals 1

    .line 1
    new-instance v0, Le/w;

    invoke-direct {v0, p0}, Le/w;-><init>(Le/w$b;)V

    return-object v0
.end method
