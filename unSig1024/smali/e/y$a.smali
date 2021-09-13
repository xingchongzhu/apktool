.class Le/y$a;
.super Lf/a;
.source "RealCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/y;-><init>(Le/w;Le/z;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Le/y;


# direct methods
.method constructor <init>(Le/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/y$a;->k:Le/y;

    invoke-direct {p0}, Lf/a;-><init>()V

    return-void
.end method


# virtual methods
.method protected t()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/y$a;->k:Le/y;

    invoke-virtual {v0}, Le/y;->cancel()V

    return-void
.end method
