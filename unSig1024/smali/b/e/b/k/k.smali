.class public Lb/e/b/k/k;
.super Lb/e/b/k/i;
.source "VirtualLayout.java"


# instance fields
.field private F0:I

.field private G0:I

.field private H0:I

.field private I0:I

.field private J0:I

.field private K0:I

.field private L0:I

.field private M0:I

.field private N0:Z

.field private O0:I

.field private P0:I

.field protected Q0:Lb/e/b/k/m/b$a;

.field R0:Lb/e/b/k/m/b$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lb/e/b/k/i;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lb/e/b/k/k;->F0:I

    .line 3
    iput v0, p0, Lb/e/b/k/k;->G0:I

    .line 4
    iput v0, p0, Lb/e/b/k/k;->H0:I

    .line 5
    iput v0, p0, Lb/e/b/k/k;->I0:I

    .line 6
    iput v0, p0, Lb/e/b/k/k;->J0:I

    .line 7
    iput v0, p0, Lb/e/b/k/k;->K0:I

    .line 8
    iput v0, p0, Lb/e/b/k/k;->L0:I

    .line 9
    iput v0, p0, Lb/e/b/k/k;->M0:I

    .line 10
    iput-boolean v0, p0, Lb/e/b/k/k;->N0:Z

    .line 11
    iput v0, p0, Lb/e/b/k/k;->O0:I

    .line 12
    iput v0, p0, Lb/e/b/k/k;->P0:I

    .line 13
    new-instance v0, Lb/e/b/k/m/b$a;

    invoke-direct {v0}, Lb/e/b/k/m/b$a;-><init>()V

    iput-object v0, p0, Lb/e/b/k/k;->Q0:Lb/e/b/k/m/b$a;

    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lb/e/b/k/k;->R0:Lb/e/b/k/m/b$b;

    return-void
.end method


# virtual methods
.method public b(Lb/e/b/k/f;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lb/e/b/k/k;->c1()V

    return-void
.end method

.method public c1()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget v1, p0, Lb/e/b/k/i;->E0:I

    if-ge v0, v1, :cond_1

    .line 2
    iget-object v1, p0, Lb/e/b/k/i;->D0:[Lb/e/b/k/e;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v1, v2}, Lb/e/b/k/e;->E0(Z)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public d1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lb/e/b/k/k;->N0:Z

    return v0
.end method
