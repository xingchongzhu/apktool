.class public final Lcom/google/android/material/datepicker/a$b;
.super Ljava/lang/Object;
.source "CalendarConstraints.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/datepicker/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field static final a:J

.field static final b:J


# instance fields
.field private c:J

.field private d:J

.field private e:Ljava/lang/Long;

.field private f:Lcom/google/android/material/datepicker/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x76c

    const/4 v1, 0x0

    .line 1
    invoke-static {v0, v1}, Lcom/google/android/material/datepicker/l;->m(II)Lcom/google/android/material/datepicker/l;

    move-result-object v0

    iget-wide v0, v0, Lcom/google/android/material/datepicker/l;->f:J

    invoke-static {v0, v1}, Lcom/google/android/material/datepicker/s;->a(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/material/datepicker/a$b;->a:J

    const/16 v0, 0x834

    const/16 v1, 0xb

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/material/datepicker/l;->m(II)Lcom/google/android/material/datepicker/l;

    move-result-object v0

    iget-wide v0, v0, Lcom/google/android/material/datepicker/l;->f:J

    invoke-static {v0, v1}, Lcom/google/android/material/datepicker/s;->a(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/material/datepicker/a$b;->b:J

    return-void
.end method

.method constructor <init>(Lcom/google/android/material/datepicker/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-wide v0, Lcom/google/android/material/datepicker/a$b;->a:J

    iput-wide v0, p0, Lcom/google/android/material/datepicker/a$b;->c:J

    .line 3
    sget-wide v0, Lcom/google/android/material/datepicker/a$b;->b:J

    iput-wide v0, p0, Lcom/google/android/material/datepicker/a$b;->d:J

    const-wide/high16 v0, -0x8000000000000000L

    .line 4
    invoke-static {v0, v1}, Lcom/google/android/material/datepicker/f;->l(J)Lcom/google/android/material/datepicker/f;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/datepicker/a$b;->f:Lcom/google/android/material/datepicker/a$c;

    .line 5
    invoke-static {p1}, Lcom/google/android/material/datepicker/a;->l(Lcom/google/android/material/datepicker/a;)Lcom/google/android/material/datepicker/l;

    move-result-object v0

    iget-wide v0, v0, Lcom/google/android/material/datepicker/l;->f:J

    iput-wide v0, p0, Lcom/google/android/material/datepicker/a$b;->c:J

    .line 6
    invoke-static {p1}, Lcom/google/android/material/datepicker/a;->m(Lcom/google/android/material/datepicker/a;)Lcom/google/android/material/datepicker/l;

    move-result-object v0

    iget-wide v0, v0, Lcom/google/android/material/datepicker/l;->f:J

    iput-wide v0, p0, Lcom/google/android/material/datepicker/a$b;->d:J

    .line 7
    invoke-static {p1}, Lcom/google/android/material/datepicker/a;->n(Lcom/google/android/material/datepicker/a;)Lcom/google/android/material/datepicker/l;

    move-result-object v0

    iget-wide v0, v0, Lcom/google/android/material/datepicker/l;->f:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/datepicker/a$b;->e:Ljava/lang/Long;

    .line 8
    invoke-static {p1}, Lcom/google/android/material/datepicker/a;->o(Lcom/google/android/material/datepicker/a;)Lcom/google/android/material/datepicker/a$c;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/datepicker/a$b;->f:Lcom/google/android/material/datepicker/a$c;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/material/datepicker/a;
    .locals 9

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/google/android/material/datepicker/a$b;->f:Lcom/google/android/material/datepicker/a$c;

    const-string v2, "DEEP_COPY_VALIDATOR_KEY"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 3
    new-instance v1, Lcom/google/android/material/datepicker/a;

    iget-wide v3, p0, Lcom/google/android/material/datepicker/a$b;->c:J

    .line 4
    invoke-static {v3, v4}, Lcom/google/android/material/datepicker/l;->n(J)Lcom/google/android/material/datepicker/l;

    move-result-object v4

    iget-wide v5, p0, Lcom/google/android/material/datepicker/a$b;->d:J

    .line 5
    invoke-static {v5, v6}, Lcom/google/android/material/datepicker/l;->n(J)Lcom/google/android/material/datepicker/l;

    move-result-object v5

    .line 6
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/material/datepicker/a$c;

    iget-object v0, p0, Lcom/google/android/material/datepicker/a$b;->e:Ljava/lang/Long;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/google/android/material/datepicker/l;->n(J)Lcom/google/android/material/datepicker/l;

    move-result-object v0

    :goto_0
    move-object v7, v0

    const/4 v8, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Lcom/google/android/material/datepicker/a;-><init>(Lcom/google/android/material/datepicker/l;Lcom/google/android/material/datepicker/l;Lcom/google/android/material/datepicker/a$c;Lcom/google/android/material/datepicker/l;Lcom/google/android/material/datepicker/a$a;)V

    return-object v1
.end method

.method public b(J)Lcom/google/android/material/datepicker/a$b;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/datepicker/a$b;->e:Ljava/lang/Long;

    return-object p0
.end method
