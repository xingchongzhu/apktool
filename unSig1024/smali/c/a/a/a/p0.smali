.class public final Lc/a/a/a/p0;
.super Ljava/lang/Exception;
.source "ExoPlaybackException.java"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:Lc/a/a/a/u0;

.field public final e:I

.field public final f:J

.field public final g:Lc/a/a/a/j2/b0;

.field final h:Z

.field private final i:Ljava/lang/Throwable;


# direct methods
.method private constructor <init>(ILjava/lang/Throwable;)V
    .locals 9

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    .line 1
    invoke-direct/range {v0 .. v8}, Lc/a/a/a/p0;-><init>(ILjava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;ILc/a/a/a/u0;IZ)V

    return-void
.end method

.method private constructor <init>(ILjava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;ILc/a/a/a/u0;IZ)V
    .locals 13

    move v0, p1

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v3, p5

    move-object/from16 v4, p6

    move/from16 v5, p7

    .line 2
    invoke-static/range {v0 .. v5}, Lc/a/a/a/p0;->f(ILjava/lang/String;Ljava/lang/String;ILc/a/a/a/u0;I)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    const/4 v9, 0x0

    move-object v1, p0

    move-object v3, p2

    move v4, p1

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v12, p8

    .line 4
    invoke-direct/range {v1 .. v12}, Lc/a/a/a/p0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/String;ILc/a/a/a/u0;ILc/a/a/a/j2/b0;JZ)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/String;ILc/a/a/a/u0;ILc/a/a/a/j2/b0;JZ)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    iput p3, p0, Lc/a/a/a/p0;->a:I

    .line 7
    iput-object p2, p0, Lc/a/a/a/p0;->i:Ljava/lang/Throwable;

    .line 8
    iput-object p4, p0, Lc/a/a/a/p0;->b:Ljava/lang/String;

    .line 9
    iput p5, p0, Lc/a/a/a/p0;->c:I

    .line 10
    iput-object p6, p0, Lc/a/a/a/p0;->d:Lc/a/a/a/u0;

    .line 11
    iput p7, p0, Lc/a/a/a/p0;->e:I

    .line 12
    iput-object p8, p0, Lc/a/a/a/p0;->g:Lc/a/a/a/j2/b0;

    .line 13
    iput-wide p9, p0, Lc/a/a/a/p0;->f:J

    .line 14
    iput-boolean p11, p0, Lc/a/a/a/p0;->h:Z

    return-void
.end method

.method public static b(Ljava/lang/Exception;)Lc/a/a/a/p0;
    .locals 10

    .line 1
    new-instance v9, Lc/a/a/a/p0;

    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v0, v9

    move-object v2, p0

    invoke-direct/range {v0 .. v8}, Lc/a/a/a/p0;-><init>(ILjava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;ILc/a/a/a/u0;IZ)V

    return-object v9
.end method

.method public static c(Ljava/lang/Throwable;Ljava/lang/String;ILc/a/a/a/u0;IZ)Lc/a/a/a/p0;
    .locals 10

    .line 1
    new-instance v9, Lc/a/a/a/p0;

    if-nez p3, :cond_0

    const/4 p4, 0x4

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    move v7, p4

    :goto_0
    const/4 v1, 0x1

    const/4 v3, 0x0

    move-object v0, v9

    move-object v2, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    move v8, p5

    .line 2
    invoke-direct/range {v0 .. v8}, Lc/a/a/a/p0;-><init>(ILjava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;ILc/a/a/a/u0;IZ)V

    return-object v9
.end method

.method public static d(Ljava/io/IOException;)Lc/a/a/a/p0;
    .locals 2

    .line 1
    new-instance v0, Lc/a/a/a/p0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lc/a/a/a/p0;-><init>(ILjava/lang/Throwable;)V

    return-object v0
.end method

.method public static e(Ljava/lang/RuntimeException;)Lc/a/a/a/p0;
    .locals 2

    .line 1
    new-instance v0, Lc/a/a/a/p0;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Lc/a/a/a/p0;-><init>(ILjava/lang/Throwable;)V

    return-object v0
.end method

.method private static f(ILjava/lang/String;Ljava/lang/String;ILc/a/a/a/u0;I)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 p2, 0x3

    if-eq p0, p2, :cond_0

    const-string p0, "Unexpected runtime error"

    goto :goto_0

    :cond_0
    const-string p0, "Remote error"

    goto :goto_0

    .line 1
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " error, index="

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", format="

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", format_supported="

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-static {p5}, Lc/a/a/a/i0;->b(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    const-string p0, "Source error"

    .line 3
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ": "

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_3
    return-object p0
.end method


# virtual methods
.method a(Lc/a/a/a/j2/b0;)Lc/a/a/a/p0;
    .locals 13

    .line 1
    new-instance v12, Lc/a/a/a/p0;

    .line 2
    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lc/a/a/a/p0;->i:Ljava/lang/Throwable;

    iget v3, p0, Lc/a/a/a/p0;->a:I

    iget-object v4, p0, Lc/a/a/a/p0;->b:Ljava/lang/String;

    iget v5, p0, Lc/a/a/a/p0;->c:I

    iget-object v6, p0, Lc/a/a/a/p0;->d:Lc/a/a/a/u0;

    iget v7, p0, Lc/a/a/a/p0;->e:I

    iget-wide v9, p0, Lc/a/a/a/p0;->f:J

    iget-boolean v11, p0, Lc/a/a/a/p0;->h:Z

    move-object v0, v12

    move-object v8, p1

    invoke-direct/range {v0 .. v11}, Lc/a/a/a/p0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/String;ILc/a/a/a/u0;ILc/a/a/a/j2/b0;JZ)V

    return-object v12
.end method

.method public g()Ljava/io/IOException;
    .locals 1

    .line 1
    iget v0, p0, Lc/a/a/a/p0;->a:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc/a/a/a/m2/f;->f(Z)V

    .line 2
    iget-object v0, p0, Lc/a/a/a/p0;->i:Ljava/lang/Throwable;

    invoke-static {v0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/IOException;

    return-object v0
.end method
