.class public Lcom/Test;
.super Ljava/lang/Object;
.source "Test.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private user:Lcom/User;


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    .prologue
    .line 15
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    iget-object v1, p0, Lcom/Test;->user:Lcom/User;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 16
    return-void
.end method
