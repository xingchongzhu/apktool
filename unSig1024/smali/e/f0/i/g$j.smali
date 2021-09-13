.class public abstract Le/f0/i/g$j;
.super Ljava/lang/Object;
.source "Http2Connection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/f0/i/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "j"
.end annotation


# static fields
.field public static final a:Le/f0/i/g$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f0/i/g$j$a;

    invoke-direct {v0}, Le/f0/i/g$j$a;-><init>()V

    sput-object v0, Le/f0/i/g$j;->a:Le/f0/i/g$j;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f0/i/g;)V
    .locals 0

    return-void
.end method

.method public abstract b(Le/f0/i/i;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
