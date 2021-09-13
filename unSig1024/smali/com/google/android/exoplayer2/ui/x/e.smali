.class final Lcom/google/android/exoplayer2/ui/x/e;
.super Ljava/lang/Object;
.source "ProjectionRenderer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/ui/x/e$a;
    }
.end annotation


# static fields
.field private static final a:[Ljava/lang/String;

.field private static final b:[Ljava/lang/String;

.field private static final c:[F

.field private static final d:[F

.field private static final e:[F

.field private static final f:[F

.field private static final g:[F


# instance fields
.field private h:I

.field private i:Lcom/google/android/exoplayer2/ui/x/e$a;

.field private j:Lcom/google/android/exoplayer2/ui/x/e$a;

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const-string v0, "uniform mat4 uMvpMatrix;"

    const-string v1, "uniform mat3 uTexMatrix;"

    const-string v2, "attribute vec4 aPosition;"

    const-string v3, "attribute vec2 aTexCoords;"

    const-string v4, "varying vec2 vTexCoords;"

    const-string v5, "void main() {"

    const-string v6, "  gl_Position = uMvpMatrix * aPosition;"

    const-string v7, "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;"

    const-string v8, "}"

    .line 1
    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/exoplayer2/ui/x/e;->a:[Ljava/lang/String;

    const-string v1, "#extension GL_OES_EGL_image_external : require"

    const-string v2, "precision mediump float;"

    const-string v3, "uniform samplerExternalOES uTexture;"

    const-string v4, "varying vec2 vTexCoords;"

    const-string v5, "void main() {"

    const-string v6, "  gl_FragColor = texture2D(uTexture, vTexCoords);"

    const-string v7, "}"

    .line 2
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/exoplayer2/ui/x/e;->b:[Ljava/lang/String;

    const/16 v0, 0x9

    new-array v1, v0, [F

    .line 3
    fill-array-data v1, :array_0

    sput-object v1, Lcom/google/android/exoplayer2/ui/x/e;->c:[F

    new-array v1, v0, [F

    .line 4
    fill-array-data v1, :array_1

    sput-object v1, Lcom/google/android/exoplayer2/ui/x/e;->d:[F

    new-array v1, v0, [F

    .line 5
    fill-array-data v1, :array_2

    sput-object v1, Lcom/google/android/exoplayer2/ui/x/e;->e:[F

    new-array v1, v0, [F

    .line 6
    fill-array-data v1, :array_3

    sput-object v1, Lcom/google/android/exoplayer2/ui/x/e;->f:[F

    new-array v0, v0, [F

    .line 7
    fill-array-data v0, :array_4

    sput-object v0, Lcom/google/android/exoplayer2/ui/x/e;->g:[F

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        -0x41000000    # -0.5f
        0x0
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        -0x41000000    # -0.5f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_3
    .array-data 4
        0x3f000000    # 0.5f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_4
    .array-data 4
        0x3f000000    # 0.5f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lc/a/a/a/n2/a0/d;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lc/a/a/a/n2/a0/d;->a:Lc/a/a/a/n2/a0/d$a;

    .line 2
    iget-object p0, p0, Lc/a/a/a/n2/a0/d;->b:Lc/a/a/a/n2/a0/d$a;

    .line 3
    invoke-virtual {v0}, Lc/a/a/a/n2/a0/d$a;->b()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    .line 4
    invoke-virtual {v0, v2}, Lc/a/a/a/n2/a0/d$a;->a(I)Lc/a/a/a/n2/a0/d$b;

    move-result-object v0

    iget v0, v0, Lc/a/a/a/n2/a0/d$b;->a:I

    if-nez v0, :cond_0

    .line 5
    invoke-virtual {p0}, Lc/a/a/a/n2/a0/d$a;->b()I

    move-result v0

    if-ne v0, v3, :cond_0

    .line 6
    invoke-virtual {p0, v2}, Lc/a/a/a/n2/a0/d$a;->a(I)Lc/a/a/a/n2/a0/d$b;

    move-result-object p0

    iget p0, p0, Lc/a/a/a/n2/a0/d$b;->a:I

    if-nez p0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method


# virtual methods
.method a(I[FZ)V
    .locals 18

    move-object/from16 v0, p0

    if-eqz p3, :cond_0

    .line 1
    iget-object v1, v0, Lcom/google/android/exoplayer2/ui/x/e;->j:Lcom/google/android/exoplayer2/ui/x/e$a;

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/google/android/exoplayer2/ui/x/e;->i:Lcom/google/android/exoplayer2/ui/x/e$a;

    :goto_0
    if-nez v1, :cond_1

    return-void

    .line 2
    :cond_1
    iget v2, v0, Lcom/google/android/exoplayer2/ui/x/e;->k:I

    invoke-static {v2}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 3
    invoke-static {}, Lc/a/a/a/m2/p;->b()V

    .line 4
    iget v2, v0, Lcom/google/android/exoplayer2/ui/x/e;->n:I

    invoke-static {v2}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 5
    iget v2, v0, Lcom/google/android/exoplayer2/ui/x/e;->o:I

    invoke-static {v2}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 6
    invoke-static {}, Lc/a/a/a/m2/p;->b()V

    .line 7
    iget v2, v0, Lcom/google/android/exoplayer2/ui/x/e;->h:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3

    if-eqz p3, :cond_2

    .line 8
    sget-object v2, Lcom/google/android/exoplayer2/ui/x/e;->e:[F

    goto :goto_1

    :cond_2
    sget-object v2, Lcom/google/android/exoplayer2/ui/x/e;->d:[F

    goto :goto_1

    :cond_3
    const/4 v4, 0x2

    if-ne v2, v4, :cond_5

    if-eqz p3, :cond_4

    .line 9
    sget-object v2, Lcom/google/android/exoplayer2/ui/x/e;->g:[F

    goto :goto_1

    :cond_4
    sget-object v2, Lcom/google/android/exoplayer2/ui/x/e;->f:[F

    goto :goto_1

    .line 10
    :cond_5
    sget-object v2, Lcom/google/android/exoplayer2/ui/x/e;->c:[F

    .line 11
    :goto_1
    iget v4, v0, Lcom/google/android/exoplayer2/ui/x/e;->m:I

    const/4 v5, 0x0

    invoke-static {v4, v3, v5, v2, v5}, Landroid/opengl/GLES20;->glUniformMatrix3fv(IIZ[FI)V

    .line 12
    iget v2, v0, Lcom/google/android/exoplayer2/ui/x/e;->l:I

    move-object/from16 v4, p2

    invoke-static {v2, v3, v5, v4, v5}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    const v2, 0x84c0

    .line 13
    invoke-static {v2}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    const v2, 0x8d65

    move/from16 v3, p1

    .line 14
    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 15
    iget v2, v0, Lcom/google/android/exoplayer2/ui/x/e;->p:I

    invoke-static {v2, v5}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 16
    invoke-static {}, Lc/a/a/a/m2/p;->b()V

    .line 17
    iget v6, v0, Lcom/google/android/exoplayer2/ui/x/e;->n:I

    const/4 v7, 0x3

    const/16 v8, 0x1406

    const/4 v9, 0x0

    const/16 v10, 0xc

    .line 18
    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/x/e$a;->a(Lcom/google/android/exoplayer2/ui/x/e$a;)Ljava/nio/FloatBuffer;

    move-result-object v11

    .line 19
    invoke-static/range {v6 .. v11}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 20
    invoke-static {}, Lc/a/a/a/m2/p;->b()V

    .line 21
    iget v12, v0, Lcom/google/android/exoplayer2/ui/x/e;->o:I

    const/4 v13, 0x2

    const/16 v14, 0x1406

    const/4 v15, 0x0

    const/16 v16, 0x8

    .line 22
    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/x/e$a;->b(Lcom/google/android/exoplayer2/ui/x/e$a;)Ljava/nio/FloatBuffer;

    move-result-object v17

    .line 23
    invoke-static/range {v12 .. v17}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 24
    invoke-static {}, Lc/a/a/a/m2/p;->b()V

    .line 25
    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/x/e$a;->c(Lcom/google/android/exoplayer2/ui/x/e$a;)I

    move-result v2

    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/x/e$a;->d(Lcom/google/android/exoplayer2/ui/x/e$a;)I

    move-result v1

    invoke-static {v2, v5, v1}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 26
    invoke-static {}, Lc/a/a/a/m2/p;->b()V

    .line 27
    iget v1, v0, Lcom/google/android/exoplayer2/ui/x/e;->n:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 28
    iget v1, v0, Lcom/google/android/exoplayer2/ui/x/e;->o:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    return-void
.end method

.method b()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/exoplayer2/ui/x/e;->a:[Ljava/lang/String;

    sget-object v1, Lcom/google/android/exoplayer2/ui/x/e;->b:[Ljava/lang/String;

    invoke-static {v0, v1}, Lc/a/a/a/m2/p;->d([Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/exoplayer2/ui/x/e;->k:I

    const-string v1, "uMvpMatrix"

    .line 2
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/exoplayer2/ui/x/e;->l:I

    .line 3
    iget v0, p0, Lcom/google/android/exoplayer2/ui/x/e;->k:I

    const-string v1, "uTexMatrix"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/exoplayer2/ui/x/e;->m:I

    .line 4
    iget v0, p0, Lcom/google/android/exoplayer2/ui/x/e;->k:I

    const-string v1, "aPosition"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/exoplayer2/ui/x/e;->n:I

    .line 5
    iget v0, p0, Lcom/google/android/exoplayer2/ui/x/e;->k:I

    const-string v1, "aTexCoords"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/exoplayer2/ui/x/e;->o:I

    .line 6
    iget v0, p0, Lcom/google/android/exoplayer2/ui/x/e;->k:I

    const-string v1, "uTexture"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/exoplayer2/ui/x/e;->p:I

    return-void
.end method

.method public d(Lc/a/a/a/n2/a0/d;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/x/e;->c(Lc/a/a/a/n2/a0/d;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p1, Lc/a/a/a/n2/a0/d;->c:I

    iput v0, p0, Lcom/google/android/exoplayer2/ui/x/e;->h:I

    .line 3
    new-instance v0, Lcom/google/android/exoplayer2/ui/x/e$a;

    iget-object v1, p1, Lc/a/a/a/n2/a0/d;->a:Lc/a/a/a/n2/a0/d$a;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lc/a/a/a/n2/a0/d$a;->a(I)Lc/a/a/a/n2/a0/d$b;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/ui/x/e$a;-><init>(Lc/a/a/a/n2/a0/d$b;)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/x/e;->i:Lcom/google/android/exoplayer2/ui/x/e$a;

    .line 4
    iget-boolean v1, p1, Lc/a/a/a/n2/a0/d;->d:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/exoplayer2/ui/x/e$a;

    iget-object p1, p1, Lc/a/a/a/n2/a0/d;->b:Lc/a/a/a/n2/a0/d$a;

    invoke-virtual {p1, v2}, Lc/a/a/a/n2/a0/d$a;->a(I)Lc/a/a/a/n2/a0/d$b;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/android/exoplayer2/ui/x/e$a;-><init>(Lc/a/a/a/n2/a0/d$b;)V

    :goto_0
    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/x/e;->j:Lcom/google/android/exoplayer2/ui/x/e$a;

    return-void
.end method
