.class public Landroidx/fragment/app/Fragment;
.super Ljava/lang/Object;
.source "Fragment.java"

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements Landroidx/lifecycle/i;
.implements Landroidx/lifecycle/u;
.implements Landroidx/savedstate/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/Fragment$h;,
        Landroidx/fragment/app/Fragment$k;,
        Landroidx/fragment/app/Fragment$i;,
        Landroidx/fragment/app/Fragment$l;,
        Landroidx/fragment/app/Fragment$j;
    }
.end annotation


# static fields
.field static final a:Ljava/lang/Object;


# instance fields
.field A:Z

.field B:Z

.field C:Z

.field D:Z

.field G:Z

.field H:Z

.field private I:Z

.field J:Landroid/view/ViewGroup;

.field K:Landroid/view/View;

.field L:Z

.field M:Z

.field N:Landroidx/fragment/app/Fragment$h;

.field O:Ljava/lang/Runnable;

.field P:Z

.field Q:Z

.field R:F

.field S:Landroid/view/LayoutInflater;

.field T:Z

.field U:Landroidx/lifecycle/f$c;

.field V:Landroidx/lifecycle/j;

.field W:Landroidx/fragment/app/b0;

.field X:Landroidx/lifecycle/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/n<",
            "Landroidx/lifecycle/i;",
            ">;"
        }
    .end annotation
.end field

.field Y:Landroidx/lifecycle/s$a;

.field Z:Landroidx/savedstate/b;

.field private a0:I

.field b:I

.field private final b0:Ljava/util/concurrent/atomic/AtomicInteger;

.field c:Landroid/os/Bundle;

.field private final c0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment$j;",
            ">;"
        }
    .end annotation
.end field

.field d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field e:Landroid/os/Bundle;

.field f:Ljava/lang/Boolean;

.field g:Ljava/lang/String;

.field h:Landroid/os/Bundle;

.field i:Landroidx/fragment/app/Fragment;

.field j:Ljava/lang/String;

.field k:I

.field private l:Ljava/lang/Boolean;

.field m:Z

.field n:Z

.field o:Z

.field p:Z

.field q:Z

.field r:Z

.field s:I

.field t:Landroidx/fragment/app/n;

.field u:Landroidx/fragment/app/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/fragment/app/k<",
            "*>;"
        }
    .end annotation
.end field

.field v:Landroidx/fragment/app/n;

.field w:Landroidx/fragment/app/Fragment;

.field x:I

.field y:I

.field z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/fragment/app/Fragment;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Landroidx/fragment/app/Fragment;->b:I

    .line 3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->j:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->l:Ljava/lang/Boolean;

    .line 6
    new-instance v0, Landroidx/fragment/app/o;

    invoke-direct {v0}, Landroidx/fragment/app/o;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->H:Z

    .line 8
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->M:Z

    .line 9
    new-instance v0, Landroidx/fragment/app/Fragment$a;

    invoke-direct {v0, p0}, Landroidx/fragment/app/Fragment$a;-><init>(Landroidx/fragment/app/Fragment;)V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->O:Ljava/lang/Runnable;

    .line 10
    sget-object v0, Landroidx/lifecycle/f$c;->e:Landroidx/lifecycle/f$c;

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->U:Landroidx/lifecycle/f$c;

    .line 11
    new-instance v0, Landroidx/lifecycle/n;

    invoke-direct {v0}, Landroidx/lifecycle/n;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->X:Landroidx/lifecycle/n;

    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->b0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->c0:Ljava/util/ArrayList;

    .line 14
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->o0()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 15
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 16
    iput p1, p0, Landroidx/fragment/app/Fragment;->a0:I

    return-void
.end method

.method private I1(Landroidx/activity/result/f/a;Lb/b/a/c/a;Landroidx/activity/result/b;)Landroidx/activity/result/c;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/activity/result/f/a<",
            "TI;TO;>;",
            "Lb/b/a/c/a<",
            "Ljava/lang/Void;",
            "Landroidx/activity/result/ActivityResultRegistry;",
            ">;",
            "Landroidx/activity/result/b<",
            "TO;>;)",
            "Landroidx/activity/result/c<",
            "TI;>;"
        }
    .end annotation

    .line 1
    iget v0, p0, Landroidx/fragment/app/Fragment;->b:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 3
    new-instance v1, Landroidx/fragment/app/Fragment$f;

    move-object v2, v1

    move-object v3, p0

    move-object v4, p2

    move-object v5, v0

    move-object v6, p1

    move-object v7, p3

    invoke-direct/range {v2 .. v7}, Landroidx/fragment/app/Fragment$f;-><init>(Landroidx/fragment/app/Fragment;Lb/b/a/c/a;Ljava/util/concurrent/atomic/AtomicReference;Landroidx/activity/result/f/a;Landroidx/activity/result/b;)V

    invoke-direct {p0, v1}, Landroidx/fragment/app/Fragment;->K1(Landroidx/fragment/app/Fragment$j;)V

    .line 4
    new-instance p2, Landroidx/fragment/app/Fragment$g;

    invoke-direct {p2, p0, v0, p1}, Landroidx/fragment/app/Fragment$g;-><init>(Landroidx/fragment/app/Fragment;Ljava/util/concurrent/atomic/AtomicReference;Landroidx/activity/result/f/a;)V

    return-object p2

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Fragment "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private K1(Landroidx/fragment/app/Fragment$j;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/fragment/app/Fragment;->b:I

    if-ltz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment$j;->a()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->c0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method private R1()V
    .locals 2

    const/4 v0, 0x3

    .line 1
    invoke-static {v0}, Landroidx/fragment/app/n;->G0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto RESTORE_VIEW_STATE: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->S1(Landroid/os/Bundle;)V

    :cond_1
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    return-void
.end method

.method private T()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->U:Landroidx/lifecycle/f$c;

    sget-object v1, Landroidx/lifecycle/f$c;->b:Landroidx/lifecycle/f$c;

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/Fragment;

    if-nez v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/Fragment;

    invoke-direct {v1}, Landroidx/fragment/app/Fragment;->T()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0

    .line 3
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method private o0()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/lifecycle/j;

    invoke-direct {v0, p0}, Landroidx/lifecycle/j;-><init>(Landroidx/lifecycle/i;)V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->V:Landroidx/lifecycle/j;

    .line 2
    invoke-static {p0}, Landroidx/savedstate/b;->a(Landroidx/savedstate/c;)Landroidx/savedstate/b;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->Z:Landroidx/savedstate/b;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->Y:Landroidx/lifecycle/s$a;

    return-void
.end method

.method public static q0(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, ": make sure class name exists, is public, and has an empty constructor that is public"

    const-string v1, "Unable to instantiate fragment "

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    .line 2
    invoke-static {p0, p1}, Landroidx/fragment/app/j;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    .line 3
    invoke-virtual {p0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/fragment/app/Fragment;

    if-eqz p2, :cond_0

    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p2, v2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 5
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->W1(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 6
    new-instance p2, Landroidx/fragment/app/Fragment$i;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": calling Fragment constructor caused an exception"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroidx/fragment/app/Fragment$i;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_1
    move-exception p0

    .line 7
    new-instance p2, Landroidx/fragment/app/Fragment$i;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": could not find Fragment constructor"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroidx/fragment/app/Fragment$i;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_2
    move-exception p0

    .line 8
    new-instance p2, Landroidx/fragment/app/Fragment$i;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroidx/fragment/app/Fragment$i;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_3
    move-exception p0

    .line 9
    new-instance p2, Landroidx/fragment/app/Fragment$i;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroidx/fragment/app/Fragment$i;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method private y()Landroidx/fragment/app/Fragment$h;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroidx/fragment/app/Fragment$h;

    invoke-direct {v0}, Landroidx/fragment/app/Fragment$h;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    return-object v0
.end method


# virtual methods
.method A()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "fragment_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_rq#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->b0:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final A0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/n;->L0()Z

    move-result v0

    return v0
.end method

.method A1(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->a1(Z)V

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/n;->O(Z)V

    return-void
.end method

.method public final B()Landroidx/fragment/app/e;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/k;->h()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/e;

    :goto_0
    return-object v0
.end method

.method public final B0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->t0()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method B1(Landroid/view/Menu;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 2
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->H:Z

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->b1(Landroid/view/Menu;)V

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/n;->P(Landroid/view/Menu;)Z

    move-result p1

    or-int/2addr v1, p1

    :cond_1
    return v1
.end method

.method public C()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/Fragment$h;->r:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method C0()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->S0()V

    return-void
.end method

.method C1()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    invoke-virtual {v0, p0}, Landroidx/fragment/app/n;->J0(Landroidx/fragment/app/Fragment;)Z

    move-result v0

    .line 2
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->l:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v1, v0, :cond_1

    .line 4
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Landroidx/fragment/app/Fragment;->l:Ljava/lang/Boolean;

    .line 5
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->c1(Z)V

    .line 6
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->Q()V

    :cond_1
    return-void
.end method

.method public D()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/Fragment$h;->q:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public D0(Landroid/os/Bundle;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method D1()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->S0()V

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/n;->b0(Z)Z

    const/4 v0, 0x7

    .line 3
    iput v0, p0, Landroidx/fragment/app/Fragment;->b:I

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->e1()V

    .line 6
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->V:Landroidx/lifecycle/j;

    sget-object v1, Landroidx/lifecycle/f$b;->ON_RESUME:Landroidx/lifecycle/f$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/j;->h(Landroidx/lifecycle/f$b;)V

    .line 8
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 9
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/b0;->a(Landroidx/lifecycle/f$b;)V

    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->R()V

    return-void

    .line 11
    :cond_1
    new-instance v0, Landroidx/fragment/app/f0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onResume()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/f0;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method E()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$h;->a:Landroid/view/View;

    return-object v0
.end method

.method public E0(IILandroid/content/Intent;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x2

    .line 1
    invoke-static {v0}, Landroidx/fragment/app/n;->G0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " received the following in onActivityResult(): requestCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " resultCode: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " data: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FragmentManager"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method E1(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->f1(Landroid/os/Bundle;)V

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->Z:Landroidx/savedstate/b;

    invoke-virtual {v0, p1}, Landroidx/savedstate/b;->d(Landroid/os/Bundle;)V

    .line 3
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->i1()Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "android:support:fragments"

    .line 4
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method

.method F()Landroid/animation/Animator;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$h;->b:Landroid/animation/Animator;

    return-object v0
.end method

.method public F0(Landroid/app/Activity;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method F1()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->S0()V

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/n;->b0(Z)Z

    const/4 v0, 0x5

    .line 3
    iput v0, p0, Landroidx/fragment/app/Fragment;->b:I

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->g1()V

    .line 6
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->V:Landroidx/lifecycle/j;

    sget-object v1, Landroidx/lifecycle/f$b;->ON_START:Landroidx/lifecycle/f$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/j;->h(Landroidx/lifecycle/f$b;)V

    .line 8
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 9
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/b0;->a(Landroidx/lifecycle/f$b;)V

    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->S()V

    return-void

    .line 11
    :cond_1
    new-instance v0, Landroidx/fragment/app/f0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onStart()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/f0;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final G()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->h:Landroid/os/Bundle;

    return-object v0
.end method

.method public G0(Landroid/content/Context;)V
    .locals 1

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    .line 2
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/k;->h()Landroid/app/Activity;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    .line 4
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->F0(Landroid/app/Activity;)V

    :cond_1
    return-void
.end method

.method G1()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->U()V

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    sget-object v1, Landroidx/lifecycle/f$b;->ON_STOP:Landroidx/lifecycle/f$b;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/b0;->a(Landroidx/lifecycle/f$b;)V

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->V:Landroidx/lifecycle/j;

    sget-object v1, Landroidx/lifecycle/f$b;->ON_STOP:Landroidx/lifecycle/f$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/j;->h(Landroidx/lifecycle/f$b;)V

    const/4 v0, 0x4

    .line 5
    iput v0, p0, Landroidx/fragment/app/Fragment;->b:I

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h1()V

    .line 8
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz v0, :cond_1

    return-void

    .line 9
    :cond_1
    new-instance v0, Landroidx/fragment/app/f0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onStop()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/f0;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final H()Landroidx/fragment/app/n;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " has not been attached yet."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public H0(Landroidx/fragment/app/Fragment;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method H1()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->i1(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->V()V

    return-void
.end method

.method public I()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/k;->i()Landroid/content/Context;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public I0(Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method J()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget v0, v0, Landroidx/fragment/app/Fragment$h;->d:I

    return v0
.end method

.method public J0(Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    .line 2
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->Q1(Landroid/os/Bundle;)V

    .line 3
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/n;->K0(I)Z

    move-result p1

    if-nez p1, :cond_0

    .line 4
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {p1}, Landroidx/fragment/app/n;->D()V

    :cond_0
    return-void
.end method

.method public final J1(Landroidx/activity/result/f/a;Landroidx/activity/result/b;)Landroidx/activity/result/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/activity/result/f/a<",
            "TI;TO;>;",
            "Landroidx/activity/result/b<",
            "TO;>;)",
            "Landroidx/activity/result/c<",
            "TI;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/fragment/app/Fragment$e;

    invoke-direct {v0, p0}, Landroidx/fragment/app/Fragment$e;-><init>(Landroidx/fragment/app/Fragment;)V

    invoke-direct {p0, p1, v0, p2}, Landroidx/fragment/app/Fragment;->I1(Landroidx/activity/result/f/a;Lb/b/a/c/a;Landroidx/activity/result/b;)Landroidx/activity/result/c;

    move-result-object p1

    return-object p1
.end method

.method public K()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$h;->k:Ljava/lang/Object;

    return-object v0
.end method

.method public K0(IZI)Landroid/view/animation/Animation;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method L()Landroidx/core/app/h;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$h;->s:Landroidx/core/app/h;

    return-object v0
.end method

.method public L0(IZI)Landroid/animation/Animator;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final L1([Ljava/lang/String;I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->W()Landroidx/fragment/app/n;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Landroidx/fragment/app/n;->M0(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Fragment "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " not attached to Activity"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method M()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget v0, v0, Landroidx/fragment/app/Fragment$h;->e:I

    return v0
.end method

.method public M0(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0

    return-void
.end method

.method public final M1()Landroidx/fragment/app/e;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()Landroidx/fragment/app/e;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not attached to an activity."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public N()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$h;->m:Ljava/lang/Object;

    return-object v0
.end method

.method public N0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    iget p3, p0, Landroidx/fragment/app/Fragment;->a0:I

    if-eqz p3, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final N1()Landroid/os/Bundle;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " does not have any arguments."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method O()Landroidx/core/app/h;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$h;->t:Landroidx/core/app/h;

    return-object v0
.end method

.method public O0()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method public final O1()Landroid/content/Context;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->I()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not attached to a context."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method P()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$h;->v:Landroid/view/View;

    return-object v0
.end method

.method public P0()V
    .locals 0

    return-void
.end method

.method public final P1()Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->l0()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not return a View from onCreateView() or this was called before onCreateView()."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final Q()Landroidx/fragment/app/n;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    return-object v0
.end method

.method public Q0()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method Q1(Landroid/os/Bundle;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "android:support:fragments"

    .line 1
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/n;->g1(Landroid/os/Parcelable;)V

    .line 3
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {p1}, Landroidx/fragment/app/n;->D()V

    :cond_0
    return-void
.end method

.method public final R()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/k;->m()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public R0()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method public S(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroidx/fragment/app/k;->n()Landroid/view/LayoutInflater;

    move-result-object p1

    .line 3
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->v0()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    invoke-static {p1, v0}, Lb/g/k/g;->b(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public S0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->S(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    return-object p1
.end method

.method final S1(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->d:Landroid/util/SparseArray;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v2, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 3
    iput-object v1, p0, Landroidx/fragment/app/Fragment;->d:Landroid/util/SparseArray;

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    iget-object v2, p0, Landroidx/fragment/app/Fragment;->e:Landroid/os/Bundle;

    invoke-virtual {v0, v2}, Landroidx/fragment/app/b0;->g(Landroid/os/Bundle;)V

    .line 6
    iput-object v1, p0, Landroidx/fragment/app/Fragment;->e:Landroid/os/Bundle;

    :cond_1
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    .line 8
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->j1(Landroid/os/Bundle;)V

    .line 9
    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz p1, :cond_3

    .line 10
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz p1, :cond_2

    .line 11
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    sget-object v0, Landroidx/lifecycle/f$b;->ON_CREATE:Landroidx/lifecycle/f$b;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/b0;->a(Landroidx/lifecycle/f$b;)V

    :cond_2
    return-void

    .line 12
    :cond_3
    new-instance p1, Landroidx/fragment/app/f0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onViewStateRestored()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroidx/fragment/app/f0;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public T0(Z)V
    .locals 0

    return-void
.end method

.method T1(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment$h;

    move-result-object v0

    iput-object p1, v0, Landroidx/fragment/app/Fragment$h;->a:Landroid/view/View;

    return-void
.end method

.method U()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget v0, v0, Landroidx/fragment/app/Fragment$h;->h:I

    return v0
.end method

.method public U0(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method U1(IIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment$h;

    move-result-object v0

    iput p1, v0, Landroidx/fragment/app/Fragment$h;->d:I

    .line 3
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment$h;

    move-result-object p1

    iput p2, p1, Landroidx/fragment/app/Fragment$h;->e:I

    .line 4
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment$h;

    move-result-object p1

    iput p3, p1, Landroidx/fragment/app/Fragment$h;->f:I

    .line 5
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment$h;

    move-result-object p1

    iput p4, p1, Landroidx/fragment/app/Fragment$h;->g:I

    return-void
.end method

.method public final V()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/Fragment;

    return-object v0
.end method

.method public V0(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 1

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    .line 2
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/k;->h()Landroid/app/Activity;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    .line 4
    invoke-virtual {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->U0(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    :cond_1
    return-void
.end method

.method V1(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment$h;

    move-result-object v0

    iput-object p1, v0, Landroidx/fragment/app/Fragment$h;->b:Landroid/animation/Animator;

    return-void
.end method

.method public final W()Landroidx/fragment/app/n;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not associated with a fragment manager."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public W0(Z)V
    .locals 0

    return-void
.end method

.method public W1(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->A0()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment already added and state has been saved"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    :goto_0
    iput-object p1, p0, Landroidx/fragment/app/Fragment;->h:Landroid/os/Bundle;

    return-void
.end method

.method X()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget-boolean v0, v0, Landroidx/fragment/app/Fragment$h;->c:Z

    return v0
.end method

.method public X0(Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method X1(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment$h;

    move-result-object v0

    iput-object p1, v0, Landroidx/fragment/app/Fragment$h;->v:Landroid/view/View;

    return-void
.end method

.method Y()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget v0, v0, Landroidx/fragment/app/Fragment$h;->f:I

    return v0
.end method

.method public Y0(Landroid/view/Menu;)V
    .locals 0

    return-void
.end method

.method Y1(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment$h;

    move-result-object v0

    iput-boolean p1, v0, Landroidx/fragment/app/Fragment$h;->y:Z

    return-void
.end method

.method Z()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget v0, v0, Landroidx/fragment/app/Fragment$h;->g:I

    return v0
.end method

.method public Z0()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method public Z1(Landroidx/fragment/app/Fragment$l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p1, Landroidx/fragment/app/Fragment$l;->a:Landroid/os/Bundle;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 3
    :goto_0
    iput-object p1, p0, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    return-void

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment already added"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method a0()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    .line 2
    :cond_0
    iget v0, v0, Landroidx/fragment/app/Fragment$h;->u:F

    return v0
.end method

.method public a1(Z)V
    .locals 0

    return-void
.end method

.method public a2(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->H:Z

    if-eq v0, p1, :cond_0

    .line 2
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->H:Z

    .line 3
    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->G:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->r0()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->t0()Z

    move-result p1

    if-nez p1, :cond_0

    .line 4
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    invoke-virtual {p1}, Landroidx/fragment/app/k;->s()V

    :cond_0
    return-void
.end method

.method public b()Landroidx/lifecycle/f;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->V:Landroidx/lifecycle/j;

    return-object v0
.end method

.method public b0()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$h;->n:Ljava/lang/Object;

    sget-object v1, Landroidx/fragment/app/Fragment;->a:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public b1(Landroid/view/Menu;)V
    .locals 0

    return-void
.end method

.method b2(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment$h;

    .line 3
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    iput p1, v0, Landroidx/fragment/app/Fragment$h;->h:I

    return-void
.end method

.method public final c0()Landroid/content/res/Resources;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O1()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public c1(Z)V
    .locals 0

    return-void
.end method

.method c2(Landroidx/fragment/app/Fragment$k;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment$h;

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    iget-object v1, v0, Landroidx/fragment/app/Fragment$h;->x:Landroidx/fragment/app/Fragment$k;

    if-ne p1, v1, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    if-nez v1, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Trying to set a replacement startPostponedEnterTransition on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :cond_2
    :goto_0
    iget-boolean v1, v0, Landroidx/fragment/app/Fragment$h;->w:Z

    if-eqz v1, :cond_3

    .line 5
    iput-object p1, v0, Landroidx/fragment/app/Fragment$h;->x:Landroidx/fragment/app/Fragment$k;

    :cond_3
    if-eqz p1, :cond_4

    .line 6
    invoke-interface {p1}, Landroidx/fragment/app/Fragment$k;->b()V

    :cond_4
    return-void
.end method

.method public final d()Landroidx/savedstate/SavedStateRegistry;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->Z:Landroidx/savedstate/b;

    invoke-virtual {v0}, Landroidx/savedstate/b;->b()Landroidx/savedstate/SavedStateRegistry;

    move-result-object v0

    return-object v0
.end method

.method public d0()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$h;->l:Ljava/lang/Object;

    sget-object v1, Landroidx/fragment/app/Fragment;->a:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public d1(I[Ljava/lang/String;[I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method d2(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment$h;

    move-result-object v0

    iput-boolean p1, v0, Landroidx/fragment/app/Fragment$h;->c:Z

    return-void
.end method

.method public e0()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$h;->o:Ljava/lang/Object;

    return-object v0
.end method

.method public e1()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method e2(F)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment$h;

    move-result-object v0

    iput p1, v0, Landroidx/fragment/app/Fragment$h;->u:F

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f0()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$h;->p:Ljava/lang/Object;

    sget-object v1, Landroidx/fragment/app/Fragment;->a:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->e0()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public f1(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public f2(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->C:Z

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {v0, p0}, Landroidx/fragment/app/n;->i(Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0, p0}, Landroidx/fragment/app/n;->e1(Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->D:Z

    :goto_0
    return-void
.end method

.method g0()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/Fragment$h;->i:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    .line 2
    :cond_1
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public g1()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method g2(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment$h;

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    iput-object p1, v0, Landroidx/fragment/app/Fragment$h;->i:Ljava/util/ArrayList;

    .line 3
    iput-object p2, v0, Landroidx/fragment/app/Fragment$h;->j:Ljava/util/ArrayList;

    return-void
.end method

.method h0()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/Fragment$h;->j:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    .line 2
    :cond_1
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public h1()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method public h2(Z)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->M:Z

    const/4 v1, 0x5

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    iget v0, p0, Landroidx/fragment/app/Fragment;->b:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->T:Z

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    .line 4
    invoke-virtual {v0, p0}, Landroidx/fragment/app/n;->w(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/u;

    move-result-object v2

    .line 5
    invoke-virtual {v0, v2}, Landroidx/fragment/app/n;->U0(Landroidx/fragment/app/u;)V

    .line 6
    :cond_0
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->M:Z

    .line 7
    iget v0, p0, Landroidx/fragment/app/Fragment;->b:I

    if-ge v0, v1, :cond_1

    if-nez p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->L:Z

    .line 8
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    if-eqz v0, :cond_2

    .line 9
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/Fragment;->f:Ljava/lang/Boolean;

    :cond_2
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i0(I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public i1(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public i2(Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/Fragment;->j2(Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void
.end method

.method public final varargs j0(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public j1(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method public j2(Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    .line 2
    invoke-virtual {v0, p0, p1, v1, p2}, Landroidx/fragment/app/k;->r(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Fragment "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " not attached to Activity"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k0()Landroidx/fragment/app/Fragment;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->i:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->j:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 3
    invoke-virtual {v0, v1}, Landroidx/fragment/app/n;->g0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method k1(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->S0()V

    const/4 v0, 0x3

    .line 2
    iput v0, p0, Landroidx/fragment/app/Fragment;->b:I

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    .line 4
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->D0(Landroid/os/Bundle;)V

    .line 5
    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz p1, :cond_0

    .line 6
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->R1()V

    .line 7
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {p1}, Landroidx/fragment/app/n;->z()V

    return-void

    .line 8
    :cond_0
    new-instance p1, Landroidx/fragment/app/f0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onActivityCreated()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroidx/fragment/app/f0;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public k2()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-eqz v0, :cond_3

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment$h;

    move-result-object v0

    iget-boolean v0, v0, Landroidx/fragment/app/Fragment$h;->w:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment$h;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/fragment/app/Fragment$h;->w:Z

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    invoke-virtual {v1}, Landroidx/fragment/app/k;->k()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 5
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    invoke-virtual {v0}, Landroidx/fragment/app/k;->k()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/Fragment$b;

    invoke-direct {v1, p0}, Landroidx/fragment/app/Fragment$b;-><init>(Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->v(Z)V

    :cond_3
    :goto_0
    return-void
.end method

.method public l0()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    return-object v0
.end method

.method l1()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->c0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment$j;

    .line 2
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment$j;->a()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->c0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroidx/fragment/app/g;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p0}, Landroidx/fragment/app/n;->k(Landroidx/fragment/app/k;Landroidx/fragment/app/g;Landroidx/fragment/app/Fragment;)V

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Landroidx/fragment/app/Fragment;->b:I

    .line 6
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    .line 7
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    invoke-virtual {v0}, Landroidx/fragment/app/k;->i()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->G0(Landroid/content/Context;)V

    .line 8
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz v0, :cond_1

    .line 9
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    invoke-virtual {v0, p0}, Landroidx/fragment/app/n;->J(Landroidx/fragment/app/Fragment;)V

    .line 10
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->A()V

    return-void

    .line 11
    :cond_1
    new-instance v0, Landroidx/fragment/app/f0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onAttach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/f0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public m0()Landroidx/lifecycle/i;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access the Fragment View\'s LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method m1(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/n;->B(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public n0()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Landroidx/lifecycle/i;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->X:Landroidx/lifecycle/n;

    return-object v0
.end method

.method n1(Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->I0(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/n;->C(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method o1(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->S0()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Landroidx/fragment/app/Fragment;->b:I

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Landroidx/fragment/app/Fragment;->I:Z

    .line 4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt v1, v2, :cond_0

    .line 5
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->V:Landroidx/lifecycle/j;

    new-instance v2, Landroidx/fragment/app/Fragment$5;

    invoke-direct {v2, p0}, Landroidx/fragment/app/Fragment$5;-><init>(Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/j;->a(Landroidx/lifecycle/h;)V

    .line 6
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->Z:Landroidx/savedstate/b;

    invoke-virtual {v1, p1}, Landroidx/savedstate/b;->c(Landroid/os/Bundle;)V

    .line 7
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->J0(Landroid/os/Bundle;)V

    .line 8
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->T:Z

    .line 9
    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz p1, :cond_1

    .line 10
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->V:Landroidx/lifecycle/j;

    sget-object v0, Landroidx/lifecycle/f$b;->ON_CREATE:Landroidx/lifecycle/f$b;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/j;->h(Landroidx/lifecycle/f$b;)V

    return-void

    .line 11
    :cond_1
    new-instance p1, Landroidx/fragment/app/f0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onCreate()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroidx/fragment/app/f0;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M1()Landroidx/fragment/app/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method public p()Landroidx/lifecycle/t;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    if-eqz v0, :cond_1

    .line 2
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->T()I

    move-result v0

    sget-object v1, Landroidx/lifecycle/f$c;->b:Landroidx/lifecycle/f$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    invoke-virtual {v0, p0}, Landroidx/fragment/app/n;->B0(Landroidx/fragment/app/Fragment;)Landroidx/lifecycle/t;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access ViewModels from detached fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method p0()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->o0()V

    .line 2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->m:Z

    .line 4
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->n:Z

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->o:Z

    .line 6
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->p:Z

    .line 7
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->q:Z

    .line 8
    iput v0, p0, Landroidx/fragment/app/Fragment;->s:I

    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    .line 10
    new-instance v2, Landroidx/fragment/app/o;

    invoke-direct {v2}, Landroidx/fragment/app/o;-><init>()V

    iput-object v2, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    .line 11
    iput-object v1, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    .line 12
    iput v0, p0, Landroidx/fragment/app/Fragment;->x:I

    .line 13
    iput v0, p0, Landroidx/fragment/app/Fragment;->y:I

    .line 14
    iput-object v1, p0, Landroidx/fragment/app/Fragment;->z:Ljava/lang/String;

    .line 15
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z

    .line 16
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->B:Z

    return-void
.end method

.method p1(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 2
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->H:Z

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/Fragment;->M0(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1, p2}, Landroidx/fragment/app/n;->E(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result p1

    or-int/2addr v1, p1

    :cond_1
    return v1
.end method

.method q1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->S0()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->r:Z

    .line 3
    new-instance v0, Landroidx/fragment/app/b0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/lifecycle/t;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/b0;-><init>(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/t;)V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    .line 4
    invoke-virtual {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->N0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    invoke-virtual {p1}, Landroidx/fragment/app/b0;->e()V

    .line 6
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    invoke-static {p1, p2}, Landroidx/lifecycle/v;->a(Landroid/view/View;Landroidx/lifecycle/i;)V

    .line 7
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    invoke-static {p1, p2}, Landroidx/lifecycle/w;->a(Landroid/view/View;Landroidx/lifecycle/u;)V

    .line 8
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    invoke-static {p1, p2}, Landroidx/savedstate/d;->a(Landroid/view/View;Landroidx/savedstate/c;)V

    .line 9
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->X:Landroidx/lifecycle/n;

    iget-object p2, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/n;->j(Ljava/lang/Object;)V

    goto :goto_0

    .line 10
    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    invoke-virtual {p1}, Landroidx/fragment/app/b0;->f()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    :goto_0
    return-void

    .line 12
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Called getViewLifecycleOwner() but onCreateView() returned null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final r0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->m:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method r1()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->F()V

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->V:Landroidx/lifecycle/j;

    sget-object v1, Landroidx/lifecycle/f$b;->ON_DESTROY:Landroidx/lifecycle/f$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/j;->h(Landroidx/lifecycle/f$b;)V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Landroidx/fragment/app/Fragment;->b:I

    .line 4
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->T:Z

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O0()V

    .line 7
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz v0, :cond_0

    return-void

    .line 8
    :cond_0
    new-instance v0, Landroidx/fragment/app/f0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDestroy()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/f0;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final s0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->B:Z

    return v0
.end method

.method s1()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->G()V

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    invoke-virtual {v0}, Landroidx/fragment/app/b0;->b()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$c;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/f$c;->c:Landroidx/lifecycle/f$c;

    .line 3
    invoke-virtual {v0, v1}, Landroidx/lifecycle/f$c;->a(Landroidx/lifecycle/f$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    sget-object v1, Landroidx/lifecycle/f$b;->ON_DESTROY:Landroidx/lifecycle/f$b;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/b0;->a(Landroidx/lifecycle/f$b;)V

    :cond_0
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Landroidx/fragment/app/Fragment;->b:I

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q0()V

    .line 8
    iget-boolean v1, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz v1, :cond_1

    .line 9
    invoke-static {p0}, Lb/m/a/a;->b(Landroidx/lifecycle/i;)Lb/m/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lb/m/a/a;->c()V

    .line 10
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->r:Z

    return-void

    .line 11
    :cond_1
    new-instance v0, Landroidx/fragment/app/f0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDestroyView()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/f0;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final t0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z

    return v0
.end method

.method t1()V
    .locals 3

    const/4 v0, -0x1

    .line 1
    iput v0, p0, Landroidx/fragment/app/Fragment;->b:I

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->R0()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->S:Landroid/view/LayoutInflater;

    .line 5
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->F0()Z

    move-result v0

    if-nez v0, :cond_0

    .line 7
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->F()V

    .line 8
    new-instance v0, Landroidx/fragment/app/o;

    invoke-direct {v0}, Landroidx/fragment/app/o;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    :cond_0
    return-void

    .line 9
    :cond_1
    new-instance v0, Landroidx/fragment/app/f0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDetach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/f0;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    iget v1, p0, Landroidx/fragment/app/Fragment;->x:I

    if-eqz v1, :cond_0

    const-string v1, " id=0x"

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    iget v1, p0, Landroidx/fragment/app/Fragment;->x:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->z:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " tag="

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, ")"

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method u0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget-boolean v0, v0, Landroidx/fragment/app/Fragment$h;->y:Z

    return v0
.end method

.method u1(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->S0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/Fragment;->S:Landroid/view/LayoutInflater;

    return-object p1
.end method

.method v(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 2
    iput-boolean v2, v0, Landroidx/fragment/app/Fragment$h;->w:Z

    .line 3
    iget-object v2, v0, Landroidx/fragment/app/Fragment$h;->x:Landroidx/fragment/app/Fragment$k;

    .line 4
    iput-object v1, v0, Landroidx/fragment/app/Fragment$h;->x:Landroidx/fragment/app/Fragment$k;

    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    .line 5
    invoke-interface {v1}, Landroidx/fragment/app/Fragment$k;->a()V

    goto :goto_1

    .line 6
    :cond_1
    sget-boolean v0, Landroidx/fragment/app/n;->b:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->J:Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    if-eqz v1, :cond_3

    .line 7
    invoke-static {v0, v1}, Landroidx/fragment/app/d0;->n(Landroid/view/ViewGroup;Landroidx/fragment/app/n;)Landroidx/fragment/app/d0;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroidx/fragment/app/d0;->p()V

    if-eqz p1, :cond_2

    .line 9
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    invoke-virtual {p1}, Landroidx/fragment/app/k;->k()Landroid/os/Handler;

    move-result-object p1

    new-instance v1, Landroidx/fragment/app/Fragment$c;

    invoke-direct {v1, p0, v0}, Landroidx/fragment/app/Fragment$c;-><init>(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/d0;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    .line 10
    :cond_2
    invoke-virtual {v0}, Landroidx/fragment/app/d0;->g()V

    :cond_3
    :goto_1
    return-void
.end method

.method final v0()Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/fragment/app/Fragment;->s:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method v1()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->onLowMemory()V

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->H()V

    return-void
.end method

.method w()Landroidx/fragment/app/g;
    .locals 1

    .line 1
    new-instance v0, Landroidx/fragment/app/Fragment$d;

    invoke-direct {v0, p0}, Landroidx/fragment/app/Fragment$d;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method public final w0()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->H:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/Fragment;

    .line 2
    invoke-virtual {v0, v1}, Landroidx/fragment/app/n;->I0(Landroidx/fragment/app/Fragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method w1(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->W0(Z)V

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/n;->I(Z)V

    return-void
.end method

.method public x(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2
    iget v0, p0, Landroidx/fragment/app/Fragment;->x:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mContainerId=#"

    .line 3
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 4
    iget v0, p0, Landroidx/fragment/app/Fragment;->y:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mTag="

    .line 5
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->z:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/Fragment;->b:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mWho="

    .line 7
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBackStackNesting="

    .line 8
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/Fragment;->s:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 9
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAdded="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->m:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mRemoving="

    .line 10
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->n:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mFromLayout="

    .line 11
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->o:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mInLayout="

    .line 12
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->p:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 13
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHidden="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mDetached="

    .line 14
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->B:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mMenuVisible="

    .line 15
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->H:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mHasMenu="

    .line 16
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 17
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mRetainInstance="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->C:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mUserVisibleHint="

    .line 18
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->M:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 19
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    .line 20
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentManager="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->t:Landroidx/fragment/app/n;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 22
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    if-eqz v0, :cond_1

    .line 23
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHost="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 24
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->u:Landroidx/fragment/app/k;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 25
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_2

    .line 26
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mParentFragment="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/Fragment;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 28
    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->h:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    .line 29
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mArguments="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->h:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 30
    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    .line 31
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedFragmentState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 32
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 33
    :cond_4
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->d:Landroid/util/SparseArray;

    if-eqz v0, :cond_5

    .line 34
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 35
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->d:Landroid/util/SparseArray;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 36
    :cond_5
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->e:Landroid/os/Bundle;

    if-eqz v0, :cond_6

    .line 37
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewRegistryState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->e:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 39
    :cond_6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->k0()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 40
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mTarget="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    const-string v0, " mTargetRequestCode="

    .line 41
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 42
    iget v0, p0, Landroidx/fragment/app/Fragment;->k:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 43
    :cond_7
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mPopDirection="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X()Z

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 44
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->J()I

    move-result v0

    if-eqz v0, :cond_8

    .line 45
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getEnterAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->J()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 46
    :cond_8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M()I

    move-result v0

    if-eqz v0, :cond_9

    .line 47
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getExitAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 48
    :cond_9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Y()I

    move-result v0

    if-eqz v0, :cond_a

    .line 49
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getPopEnterAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Y()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 51
    :cond_a
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Z()I

    move-result v0

    if-eqz v0, :cond_b

    .line 52
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getPopExitAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Z()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 53
    :cond_b
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->J:Landroid/view/ViewGroup;

    if-eqz v0, :cond_c

    .line 54
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mContainer="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->J:Landroid/view/ViewGroup;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 55
    :cond_c
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz v0, :cond_d

    .line 56
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 57
    :cond_d
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->E()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 58
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAnimatingAway="

    .line 59
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 60
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->E()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 61
    :cond_e
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->I()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 62
    invoke-static {p0}, Lb/m/a/a;->b(Landroidx/lifecycle/i;)Lb/m/a/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lb/m/a/a;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 63
    :cond_f
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Child "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "  "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/n;->X(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method x0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->N:Landroidx/fragment/app/Fragment$h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget-boolean v0, v0, Landroidx/fragment/app/Fragment$h;->w:Z

    return v0
.end method

.method x1(Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z

    if-nez v0, :cond_1

    .line 2
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->H:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->X0(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/n;->K(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final y0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->n:Z

    return v0
.end method

.method y1(Landroid/view/Menu;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z

    if-nez v0, :cond_1

    .line 2
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->H:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->Y0(Landroid/view/Menu;)V

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/n;->L(Landroid/view/Menu;)V

    :cond_1
    return-void
.end method

.method z(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 2
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/n;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    return-object p1
.end method

.method final z0()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->V()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->y0()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z0()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method z1()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->N()V

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/fragment/app/b0;

    sget-object v1, Landroidx/lifecycle/f$b;->ON_PAUSE:Landroidx/lifecycle/f$b;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/b0;->a(Landroidx/lifecycle/f$b;)V

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->V:Landroidx/lifecycle/j;

    sget-object v1, Landroidx/lifecycle/f$b;->ON_PAUSE:Landroidx/lifecycle/f$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/j;->h(Landroidx/lifecycle/f$b;)V

    const/4 v0, 0x6

    .line 5
    iput v0, p0, Landroidx/fragment/app/Fragment;->b:I

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Z0()V

    .line 8
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz v0, :cond_1

    return-void

    .line 9
    :cond_1
    new-instance v0, Landroidx/fragment/app/f0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onPause()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/f0;-><init>(Ljava/lang/String;)V

    throw v0
.end method
