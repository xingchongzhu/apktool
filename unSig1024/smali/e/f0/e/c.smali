.class public final Le/f0/e/c;
.super Ljava/lang/Object;
.source "CacheStrategy.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/f0/e/c$a;
    }
.end annotation


# instance fields
.field public final a:Le/z;

.field public final b:Le/b0;


# direct methods
.method constructor <init>(Le/z;Le/b0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f0/e/c;->a:Le/z;

    .line 3
    iput-object p2, p0, Le/f0/e/c;->b:Le/b0;

    return-void
.end method

.method public static a(Le/b0;Le/z;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Le/b0;->D()I

    move-result v0

    const/16 v1, 0xc8

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    const/16 v1, 0x19a

    if-eq v0, v1, :cond_2

    const/16 v1, 0x19e

    if-eq v0, v1, :cond_2

    const/16 v1, 0x1f5

    if-eq v0, v1, :cond_2

    const/16 v1, 0xcb

    if-eq v0, v1, :cond_2

    const/16 v1, 0xcc

    if-eq v0, v1, :cond_2

    const/16 v1, 0x133

    if-eq v0, v1, :cond_0

    const/16 v1, 0x134

    if-eq v0, v1, :cond_2

    const/16 v1, 0x194

    if-eq v0, v1, :cond_2

    const/16 v1, 0x195

    if-eq v0, v1, :cond_2

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :cond_0
    :pswitch_0
    const-string v0, "Expires"

    .line 2
    invoke-virtual {p0, v0}, Le/b0;->F(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 3
    invoke-virtual {p0}, Le/b0;->C()Le/d;

    move-result-object v0

    invoke-virtual {v0}, Le/d;->d()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 4
    invoke-virtual {p0}, Le/b0;->C()Le/d;

    move-result-object v0

    invoke-virtual {v0}, Le/d;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 5
    invoke-virtual {p0}, Le/b0;->C()Le/d;

    move-result-object v0

    invoke-virtual {v0}, Le/d;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return v2

    .line 6
    :cond_2
    :goto_1
    :pswitch_1
    invoke-virtual {p0}, Le/b0;->C()Le/d;

    move-result-object p0

    invoke-virtual {p0}, Le/d;->i()Z

    move-result p0

    if-nez p0, :cond_3

    invoke-virtual {p1}, Le/z;->b()Le/d;

    move-result-object p0

    invoke-virtual {p0}, Le/d;->i()Z

    move-result p0

    if-nez p0, :cond_3

    const/4 v2, 0x1

    :cond_3
    return v2

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
