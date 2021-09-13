.class Lb/g/h/a$b;
.super Ljava/lang/Object;
.source "CallbackWithHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/g/h/a;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/g/h/f$c;

.field final synthetic b:I

.field final synthetic c:Lb/g/h/a;


# direct methods
.method constructor <init>(Lb/g/h/a;Lb/g/h/f$c;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb/g/h/a$b;->c:Lb/g/h/a;

    iput-object p2, p0, Lb/g/h/a$b;->a:Lb/g/h/f$c;

    iput p3, p0, Lb/g/h/a$b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lb/g/h/a$b;->a:Lb/g/h/f$c;

    iget v1, p0, Lb/g/h/a$b;->b:I

    invoke-virtual {v0, v1}, Lb/g/h/f$c;->a(I)V

    return-void
.end method
