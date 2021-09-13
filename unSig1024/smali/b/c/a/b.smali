.class Lb/c/a/b;
.super Lb/c/a/d;
.source "CardViewApi17Impl.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lb/c/a/d;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 1

    .line 1
    new-instance v0, Lb/c/a/b$a;

    invoke-direct {v0, p0}, Lb/c/a/b$a;-><init>(Lb/c/a/b;)V

    sput-object v0, Lb/c/a/h;->b:Lb/c/a/h$a;

    return-void
.end method
