.class public interface abstract Le/b;
.super Ljava/lang/Object;
.source "Authenticator.java"


# static fields
.field public static final a:Le/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b$a;

    invoke-direct {v0}, Le/b$a;-><init>()V

    sput-object v0, Le/b;->a:Le/b;

    return-void
.end method


# virtual methods
.method public abstract a(Le/d0;Le/b0;)Le/z;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
