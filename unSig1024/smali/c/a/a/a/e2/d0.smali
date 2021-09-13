.class public interface abstract Lc/a/a/a/e2/d0;
.super Ljava/lang/Object;
.source "ExoMediaDrm.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/a/e2/d0$d;,
        Lc/a/a/a/e2/d0$a;,
        Lc/a/a/a/e2/d0$b;,
        Lc/a/a/a/e2/d0$c;
    }
.end annotation


# virtual methods
.method public abstract a()V
.end method

.method public abstract b()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lc/a/a/a/e2/c0;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c([B[B)V
.end method

.method public abstract d([B)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e([B)V
.end method

.method public abstract f(Lc/a/a/a/e2/d0$b;)V
.end method

.method public abstract g([B[B)[B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/media/NotProvisionedException;,
            Landroid/media/DeniedByServerException;
        }
    .end annotation
.end method

.method public abstract h([B)Lc/a/a/a/e2/c0;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/media/MediaCryptoException;
        }
    .end annotation
.end method

.method public abstract i()Lc/a/a/a/e2/d0$d;
.end method

.method public abstract j([B)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/media/DeniedByServerException;
        }
    .end annotation
.end method

.method public abstract k([BLjava/util/List;ILjava/util/HashMap;)Lc/a/a/a/e2/d0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/util/List<",
            "Lc/a/a/a/e2/t$b;",
            ">;I",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lc/a/a/a/e2/d0$a;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/media/NotProvisionedException;
        }
    .end annotation
.end method

.method public abstract l()[B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/media/MediaDrmException;
        }
    .end annotation
.end method
