.class public final Lcom/tv91/w/a;
.super Lh/a/a$b;
.source "CrashReportTree.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lh/a/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method protected j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LogNotTimber"
        }
    .end annotation

    const/4 p2, 0x2

    if-eq p1, p2, :cond_4

    const/4 p2, 0x3

    if-ne p1, p2, :cond_0

    goto :goto_1

    :cond_0
    const-string p2, "ERROR_REPORT_91TV"

    if-eqz p4, :cond_3

    const/4 v0, 0x7

    if-eq p1, v0, :cond_2

    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x5

    if-ne p1, v0, :cond_4

    .line 1
    invoke-static {p2, p3, p4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :cond_2
    :goto_0
    const-string p1, "DEFAULT"

    .line 2
    invoke-static {p4, p1}, Lcom/umeng/umcrash/UMCrash;->generateCustomLog(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_1

    .line 3
    :cond_3
    invoke-static {p1, p2, p3}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_1
    return-void
.end method
