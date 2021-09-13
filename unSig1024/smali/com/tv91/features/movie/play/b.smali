.class public Lcom/tv91/features/movie/play/b;
.super Ljava/lang/Object;
.source "M3U8Parser.java"

# interfaces
.implements Lcom/google/android/exoplayer2/upstream/c0$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tv91/features/movie/play/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/exoplayer2/upstream/c0$a<",
        "Lcom/google/android/exoplayer2/source/hls/v/h;",
        ">;"
    }
.end annotation


# static fields
.field private static final A:Ljava/util/regex/Pattern;

.field private static final B:Ljava/util/regex/Pattern;

.field private static final C:Ljava/util/regex/Pattern;

.field private static final D:Ljava/util/regex/Pattern;

.field private static final E:Ljava/util/regex/Pattern;

.field private static final F:Ljava/util/regex/Pattern;

.field private static final G:Ljava/util/regex/Pattern;

.field private static final H:Ljava/util/regex/Pattern;

.field private static final I:Ljava/util/regex/Pattern;

.field private static final J:Ljava/util/regex/Pattern;

.field private static final K:Ljava/util/regex/Pattern;

.field private static final L:Ljava/util/regex/Pattern;

.field private static final M:Ljava/util/regex/Pattern;

.field private static final N:Ljava/util/regex/Pattern;

.field private static final O:Ljava/util/regex/Pattern;

.field private static final P:Ljava/util/regex/Pattern;

.field private static final Q:Ljava/util/regex/Pattern;

.field private static final R:Ljava/util/regex/Pattern;

.field private static final S:Ljava/util/regex/Pattern;

.field private static final T:Ljava/util/regex/Pattern;

.field private static final U:Ljava/util/regex/Pattern;

.field private static final V:Ljava/util/regex/Pattern;

.field private static final W:Ljava/util/regex/Pattern;

.field private static final X:Ljava/util/regex/Pattern;

.field private static final Y:Ljava/util/regex/Pattern;

.field private static final a:Ljava/util/regex/Pattern;

.field private static final b:Ljava/util/regex/Pattern;

.field private static final c:Ljava/util/regex/Pattern;

.field private static final d:Ljava/util/regex/Pattern;

.field private static final e:Ljava/util/regex/Pattern;

.field private static final f:Ljava/util/regex/Pattern;

.field private static final g:Ljava/util/regex/Pattern;

.field private static final h:Ljava/util/regex/Pattern;

.field private static final i:Ljava/util/regex/Pattern;

.field private static final j:Ljava/util/regex/Pattern;

.field private static final k:Ljava/util/regex/Pattern;

.field private static final l:Ljava/util/regex/Pattern;

.field private static final m:Ljava/util/regex/Pattern;

.field private static final n:Ljava/util/regex/Pattern;

.field private static final o:Ljava/util/regex/Pattern;

.field private static final p:Ljava/util/regex/Pattern;

.field private static final q:Ljava/util/regex/Pattern;

.field private static final r:Ljava/util/regex/Pattern;

.field private static final s:Ljava/util/regex/Pattern;

.field private static final t:Ljava/util/regex/Pattern;

.field private static final u:Ljava/util/regex/Pattern;

.field private static final v:Ljava/util/regex/Pattern;

.field private static final w:Ljava/util/regex/Pattern;

.field private static final x:Ljava/util/regex/Pattern;

.field private static final y:Ljava/util/regex/Pattern;

.field private static final z:Ljava/util/regex/Pattern;


# instance fields
.field private final Z:Lcom/google/android/exoplayer2/source/hls/v/f;

.field private final a0:Lcom/google/android/exoplayer2/source/hls/v/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "AVERAGE-BANDWIDTH=(\\d+)\\b"

    .line 1
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->a:Ljava/util/regex/Pattern;

    const-string v0, "VIDEO=\"(.+?)\""

    .line 2
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->b:Ljava/util/regex/Pattern;

    const-string v0, "AUDIO=\"(.+?)\""

    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->c:Ljava/util/regex/Pattern;

    const-string v0, "SUBTITLES=\"(.+?)\""

    .line 4
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->d:Ljava/util/regex/Pattern;

    const-string v0, "CLOSED-CAPTIONS=\"(.+?)\""

    .line 5
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->e:Ljava/util/regex/Pattern;

    const-string v0, "[^-]BANDWIDTH=(\\d+)\\b"

    .line 6
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->f:Ljava/util/regex/Pattern;

    const-string v0, "CHANNELS=\"(.+?)\""

    .line 7
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->g:Ljava/util/regex/Pattern;

    const-string v0, "CODECS=\"(.+?)\""

    .line 8
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->h:Ljava/util/regex/Pattern;

    const-string v0, "RESOLUTION=(\\d+x\\d+)"

    .line 9
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->i:Ljava/util/regex/Pattern;

    const-string v0, "FRAME-RATE=([\\d\\.]+)\\b"

    .line 10
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->j:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-TARGETDURATION:(\\d+)\\b"

    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->k:Ljava/util/regex/Pattern;

    const-string v0, "DURATION=([\\d\\.]+)\\b"

    .line 12
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->l:Ljava/util/regex/Pattern;

    const-string v0, "PART-TARGET=([\\d\\.]+)\\b"

    .line 13
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->m:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-VERSION:(\\d+)\\b"

    .line 14
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->n:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-PLAYLIST-TYPE:(.+)\\b"

    .line 15
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->o:Ljava/util/regex/Pattern;

    const-string v0, "CAN-SKIP-UNTIL=([\\d\\.]+)\\b"

    .line 16
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->p:Ljava/util/regex/Pattern;

    const-string v0, "CAN-SKIP-DATERANGES"

    .line 17
    invoke-static {v0}, Lcom/tv91/features/movie/play/b;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->q:Ljava/util/regex/Pattern;

    const-string v0, "SKIPPED-SEGMENTS=(\\d+)\\b"

    .line 18
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->r:Ljava/util/regex/Pattern;

    const-string v0, "[:|,]HOLD-BACK=([\\d\\.]+)\\b"

    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->s:Ljava/util/regex/Pattern;

    const-string v0, "PART-HOLD-BACK=([\\d\\.]+)\\b"

    .line 20
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->t:Ljava/util/regex/Pattern;

    const-string v0, "CAN-BLOCK-RELOAD"

    .line 21
    invoke-static {v0}, Lcom/tv91/features/movie/play/b;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->u:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b"

    .line 22
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->v:Ljava/util/regex/Pattern;

    const-string v0, "#EXTINF:(-?[\\d\\.]+)\\b"

    .line 23
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->w:Ljava/util/regex/Pattern;

    const-string v0, "#EXTINF:[\\d\\.]+\\b,(.+)"

    .line 24
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->x:Ljava/util/regex/Pattern;

    const-string v0, "LAST-MSN=(\\d+)\\b"

    .line 25
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->y:Ljava/util/regex/Pattern;

    const-string v0, "LAST-PART=(\\d+)\\b"

    .line 26
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->z:Ljava/util/regex/Pattern;

    const-string v0, "TIME-OFFSET=(-?[\\d\\.]+)\\b"

    .line 27
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->A:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b"

    .line 28
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->B:Ljava/util/regex/Pattern;

    const-string v0, "BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\""

    .line 29
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->C:Ljava/util/regex/Pattern;

    const-string v0, "BYTERANGE-START=(\\d+)\\b"

    .line 30
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->D:Ljava/util/regex/Pattern;

    const-string v0, "BYTERANGE-LENGTH=(\\d+)\\b"

    .line 31
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->E:Ljava/util/regex/Pattern;

    const-string v0, "METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)"

    .line 32
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->F:Ljava/util/regex/Pattern;

    const-string v0, "KEYFORMAT=\"(.+?)\""

    .line 33
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->G:Ljava/util/regex/Pattern;

    const-string v0, "KEYFORMATVERSIONS=\"(.+?)\""

    .line 34
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->H:Ljava/util/regex/Pattern;

    const-string v0, "URI=\"(.+?)\""

    .line 35
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->I:Ljava/util/regex/Pattern;

    const-string v0, "IV=([^,.*]+)"

    .line 36
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->J:Ljava/util/regex/Pattern;

    const-string v0, "TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)"

    .line 37
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->K:Ljava/util/regex/Pattern;

    const-string v0, "TYPE=(PART|MAP)"

    .line 38
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->L:Ljava/util/regex/Pattern;

    const-string v0, "LANGUAGE=\"(.+?)\""

    .line 39
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->M:Ljava/util/regex/Pattern;

    const-string v0, "NAME=\"(.+?)\""

    .line 40
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->N:Ljava/util/regex/Pattern;

    const-string v0, "GROUP-ID=\"(.+?)\""

    .line 41
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->O:Ljava/util/regex/Pattern;

    const-string v0, "CHARACTERISTICS=\"(.+?)\""

    .line 42
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->P:Ljava/util/regex/Pattern;

    const-string v0, "INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\""

    .line 43
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->Q:Ljava/util/regex/Pattern;

    const-string v0, "AUTOSELECT"

    .line 44
    invoke-static {v0}, Lcom/tv91/features/movie/play/b;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->R:Ljava/util/regex/Pattern;

    const-string v0, "DEFAULT"

    .line 45
    invoke-static {v0}, Lcom/tv91/features/movie/play/b;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->S:Ljava/util/regex/Pattern;

    const-string v0, "FORCED"

    .line 46
    invoke-static {v0}, Lcom/tv91/features/movie/play/b;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->T:Ljava/util/regex/Pattern;

    const-string v0, "INDEPENDENT"

    .line 47
    invoke-static {v0}, Lcom/tv91/features/movie/play/b;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->U:Ljava/util/regex/Pattern;

    const-string v0, "GAP"

    .line 48
    invoke-static {v0}, Lcom/tv91/features/movie/play/b;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->V:Ljava/util/regex/Pattern;

    const-string v0, "VALUE=\"(.+?)\""

    .line 49
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->W:Ljava/util/regex/Pattern;

    const-string v0, "IMPORT=\"(.+?)\""

    .line 50
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->X:Ljava/util/regex/Pattern;

    const-string v0, "\\{\\$([a-zA-Z0-9\\-_]+)\\}"

    .line 51
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/tv91/features/movie/play/b;->Y:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/exoplayer2/source/hls/v/f;->d:Lcom/google/android/exoplayer2/source/hls/v/f;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/tv91/features/movie/play/b;-><init>(Lcom/google/android/exoplayer2/source/hls/v/f;Lcom/google/android/exoplayer2/source/hls/v/g;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/source/hls/v/f;Lcom/google/android/exoplayer2/source/hls/v/g;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/tv91/features/movie/play/b;->Z:Lcom/google/android/exoplayer2/source/hls/v/f;

    .line 4
    iput-object p2, p0, Lcom/tv91/features/movie/play/b;->a0:Lcom/google/android/exoplayer2/source/hls/v/g;

    return-void
.end method

.method private static A(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/features/movie/play/b;->Y:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 2
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 3
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 6
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/util/regex/Matcher;->quoteReplacement(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-virtual {p0, v0, v1}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static B(Ljava/io/BufferedReader;ZI)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    .line 1
    invoke-static {p2}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    invoke-static {p2}, Lc/a/a/a/m2/m0;->k0(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    :cond_0
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    move-result p2

    goto :goto_0

    :cond_1
    return p2
.end method

.method private static b(Ljava/io/BufferedReader;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0xef

    if-ne v0, v2, :cond_2

    .line 2
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    move-result v0

    const/16 v2, 0xbb

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    move-result v0

    const/16 v2, 0xbf

    if-eq v0, v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    move-result v0

    goto :goto_1

    :cond_1
    :goto_0
    return v1

    :cond_2
    :goto_1
    const/4 v2, 0x1

    .line 4
    invoke-static {p0, v2, v0}, Lcom/tv91/features/movie/play/b;->B(Ljava/io/BufferedReader;ZI)I

    move-result v0

    const/4 v2, 0x7

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_4

    const-string v4, "#EXTM3U"

    .line 5
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v0, v4, :cond_3

    return v1

    .line 6
    :cond_3
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    move-result v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 7
    :cond_4
    invoke-static {p0, v1, v0}, Lcom/tv91/features/movie/play/b;->B(Ljava/io/BufferedReader;ZI)I

    move-result p0

    .line 8
    invoke-static {p0}, Lc/a/a/a/m2/m0;->k0(I)Z

    move-result p0

    return p0
.end method

.method private static c(Ljava/lang/String;)Ljava/util/regex/Pattern;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "=("

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "NO"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "|"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "YES"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p0

    return-object p0
.end method

.method private static d(Ljava/lang/String;[Lc/a/a/a/e2/t$b;)Lc/a/a/a/e2/t;
    .locals 4

    .line 1
    array-length v0, p1

    new-array v0, v0, [Lc/a/a/a/e2/t$b;

    const/4 v1, 0x0

    .line 2
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 3
    aget-object v2, p1, v1

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lc/a/a/a/e2/t$b;->l([B)Lc/a/a/a/e2/t$b;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Lc/a/a/a/e2/t;

    invoke-direct {p1, p0, v0}, Lc/a/a/a/e2/t;-><init>(Ljava/lang/String;[Lc/a/a/a/e2/t$b;)V

    return-object p1
.end method

.method private static e(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p3, :cond_1

    return-object p3

    .line 1
    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static f(Ljava/util/ArrayList;Ljava/lang/String;)Lcom/google/android/exoplayer2/source/hls/v/f$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/google/android/exoplayer2/source/hls/v/f$b;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/exoplayer2/source/hls/v/f$b;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 2
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/source/hls/v/f$b;

    .line 3
    iget-object v2, v1, Lcom/google/android/exoplayer2/source/hls/v/f$b;->d:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static g(Ljava/util/ArrayList;Ljava/lang/String;)Lcom/google/android/exoplayer2/source/hls/v/f$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/google/android/exoplayer2/source/hls/v/f$b;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/exoplayer2/source/hls/v/f$b;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 2
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/source/hls/v/f$b;

    .line 3
    iget-object v2, v1, Lcom/google/android/exoplayer2/source/hls/v/f$b;->e:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static h(Ljava/util/ArrayList;Ljava/lang/String;)Lcom/google/android/exoplayer2/source/hls/v/f$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/google/android/exoplayer2/source/hls/v/f$b;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/exoplayer2/source/hls/v/f$b;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 2
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/source/hls/v/f$b;

    .line 3
    iget-object v2, v1, Lcom/google/android/exoplayer2/source/hls/v/f$b;->c:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static j(Ljava/lang/String;Ljava/util/regex/Pattern;)D
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p0

    return-wide p0
.end method

.method private static k(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lc/a/a/a/e2/t$b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lc/a/a/a/e2/t$b;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/features/movie/play/b;->H:Ljava/util/regex/Pattern;

    const-string v1, "1"

    .line 2
    invoke-static {p0, v0, v1, p2}, Lcom/tv91/features/movie/play/b;->u(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"

    .line 3
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const/16 v4, 0x2c

    const-string v5, "video/mp4"

    if-eqz v2, :cond_0

    .line 4
    sget-object p1, Lcom/tv91/features/movie/play/b;->I:Ljava/util/regex/Pattern;

    invoke-static {p0, p1, p2}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    .line 5
    new-instance p1, Lc/a/a/a/e2/t$b;

    sget-object p2, Lc/a/a/a/i0;->d:Ljava/util/UUID;

    .line 6
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    invoke-direct {p1, p2, v5, p0}, Lc/a/a/a/e2/t$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    return-object p1

    :cond_0
    const-string v2, "com.widevine"

    .line 7
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 8
    new-instance p1, Lc/a/a/a/e2/t$b;

    sget-object p2, Lc/a/a/a/i0;->d:Ljava/util/UUID;

    invoke-static {p0}, Lc/a/a/a/m2/m0;->g0(Ljava/lang/String;)[B

    move-result-object p0

    const-string v0, "hls"

    invoke-direct {p1, p2, v0, p0}, Lc/a/a/a/e2/t$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    return-object p1

    :cond_1
    const-string v2, "com.microsoft.playready"

    .line 9
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 10
    sget-object p1, Lcom/tv91/features/movie/play/b;->I:Ljava/util/regex/Pattern;

    invoke-static {p0, p1, p2}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    .line 12
    sget-object p1, Lc/a/a/a/i0;->e:Ljava/util/UUID;

    invoke-static {p1, p0}, Lc/a/a/a/f2/k0/l;->a(Ljava/util/UUID;[B)[B

    move-result-object p0

    .line 13
    new-instance p2, Lc/a/a/a/e2/t$b;

    invoke-direct {p2, p1, v5, p0}, Lc/a/a/a/e2/t$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    return-object p2

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method private static l(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "SAMPLE-AES-CENC"

    .line 1
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SAMPLE-AES-CTR"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const-string p0, "cbcs"

    goto :goto_1

    :cond_1
    :goto_0
    const-string p0, "cenc"

    :goto_1
    return-object p0
.end method

.method private static m(Ljava/lang/String;Ljava/util/regex/Pattern;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static n(Ljava/lang/String;Ljava/util/regex/Pattern;)J
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0

    return-wide p0
.end method

.method private static o(Lcom/tv91/features/movie/play/b$a;Ljava/lang/String;)Lcom/google/android/exoplayer2/source/hls/v/f;
    .locals 36
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v1, p1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 5
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 6
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 7
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 8
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 9
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 10
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x0

    const/4 v13, 0x0

    .line 11
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/tv91/features/movie/play/b$a;->a()Z

    move-result v14

    const-string v15, "application/x-mpegURL"

    if-eqz v14, :cond_f

    .line 12
    invoke-virtual/range {p0 .. p0}, Lcom/tv91/features/movie/play/b$a;->b()Ljava/lang/String;

    move-result-object v14

    const-string v9, "#EXT"

    .line 13
    invoke-virtual {v14, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 14
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    const-string v9, "#EXT-X-I-FRAME-STREAM-INF"

    .line 15
    invoke-virtual {v14, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    move/from16 v19, v10

    const-string v10, "#EXT-X-DEFINE"

    .line 16
    invoke-virtual {v14, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_1

    .line 17
    sget-object v9, Lcom/tv91/features/movie/play/b;->N:Ljava/util/regex/Pattern;

    .line 18
    invoke-static {v14, v9, v11}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Lcom/tv91/features/movie/play/b;->W:Ljava/util/regex/Pattern;

    .line 19
    invoke-static {v14, v10, v11}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    .line 20
    invoke-virtual {v11, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    const-string v10, "#EXT-X-INDEPENDENT-SEGMENTS"

    .line 21
    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    move-object v1, v0

    move-object/from16 v34, v3

    move-object/from16 v33, v4

    move-object/from16 v32, v5

    move-object/from16 v31, v6

    move-object/from16 v29, v7

    move-object/from16 v30, v8

    move-object/from16 v28, v12

    const/4 v10, 0x1

    goto/16 :goto_9

    :cond_2
    const-string v10, "#EXT-X-MEDIA"

    .line 22
    invoke-virtual {v14, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 23
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const-string v10, "#EXT-X-SESSION-KEY"

    .line 24
    invoke-virtual {v14, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_4

    .line 25
    sget-object v9, Lcom/tv91/features/movie/play/b;->G:Ljava/util/regex/Pattern;

    const-string v10, "identity"

    .line 26
    invoke-static {v14, v9, v10, v11}, Lcom/tv91/features/movie/play/b;->u(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    .line 27
    invoke-static {v14, v9, v11}, Lcom/tv91/features/movie/play/b;->k(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lc/a/a/a/e2/t$b;

    move-result-object v9

    if-eqz v9, :cond_5

    .line 28
    sget-object v10, Lcom/tv91/features/movie/play/b;->F:Ljava/util/regex/Pattern;

    invoke-static {v14, v10, v11}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    .line 29
    invoke-static {v10}, Lcom/tv91/features/movie/play/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 30
    new-instance v14, Lc/a/a/a/e2/t;

    const/4 v15, 0x1

    new-array v15, v15, [Lc/a/a/a/e2/t$b;

    const/16 v16, 0x0

    aput-object v9, v15, v16

    invoke-direct {v14, v10, v15}, Lc/a/a/a/e2/t;-><init>(Ljava/lang/String;[Lc/a/a/a/e2/t$b;)V

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    const-string v10, "#EXT-X-STREAM-INF"

    .line 31
    invoke-virtual {v14, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_6

    if-eqz v9, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    move-object v1, v0

    move-object/from16 v34, v3

    move-object/from16 v33, v4

    move-object/from16 v32, v5

    move-object/from16 v31, v6

    move-object/from16 v29, v7

    move-object/from16 v30, v8

    move-object/from16 v28, v12

    move/from16 v10, v19

    goto/16 :goto_9

    :cond_6
    :goto_2
    const-string v10, "CLOSED-CAPTIONS=NONE"

    .line 32
    invoke-virtual {v14, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    or-int/2addr v13, v10

    if-eqz v9, :cond_7

    const/16 v10, 0x4000

    move/from16 v20, v13

    goto :goto_3

    :cond_7
    move/from16 v20, v13

    const/4 v10, 0x0

    .line 33
    :goto_3
    sget-object v13, Lcom/tv91/features/movie/play/b;->f:Ljava/util/regex/Pattern;

    invoke-static {v14, v13}, Lcom/tv91/features/movie/play/b;->m(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v13

    move-object/from16 v28, v12

    .line 34
    sget-object v12, Lcom/tv91/features/movie/play/b;->a:Ljava/util/regex/Pattern;

    move-object/from16 v29, v7

    const/4 v7, -0x1

    invoke-static {v14, v12, v7}, Lcom/tv91/features/movie/play/b;->s(Ljava/lang/String;Ljava/util/regex/Pattern;I)I

    move-result v12

    .line 35
    sget-object v7, Lcom/tv91/features/movie/play/b;->h:Ljava/util/regex/Pattern;

    invoke-static {v14, v7, v11}, Lcom/tv91/features/movie/play/b;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v30, v8

    .line 36
    sget-object v8, Lcom/tv91/features/movie/play/b;->i:Ljava/util/regex/Pattern;

    .line 37
    invoke-static {v14, v8, v11}, Lcom/tv91/features/movie/play/b;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_a

    move-object/from16 v31, v6

    const-string v6, "x"

    .line 38
    invoke-static {v8, v6}, Lc/a/a/a/m2/m0;->D0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    .line 39
    aget-object v21, v6, v8

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    const/16 v18, 0x1

    .line 40
    aget-object v6, v6, v18

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    if-lez v8, :cond_9

    if-gtz v6, :cond_8

    goto :goto_4

    :cond_8
    move/from16 v17, v8

    goto :goto_5

    :cond_9
    :goto_4
    const/4 v6, -0x1

    const/16 v17, -0x1

    :goto_5
    move v8, v6

    move/from16 v6, v17

    goto :goto_6

    :cond_a
    move-object/from16 v31, v6

    const/4 v6, -0x1

    const/4 v8, -0x1

    :goto_6
    const/high16 v17, -0x40800000    # -1.0f

    move-object/from16 v32, v5

    .line 41
    sget-object v5, Lcom/tv91/features/movie/play/b;->j:Ljava/util/regex/Pattern;

    .line 42
    invoke-static {v14, v5, v11}, Lcom/tv91/features/movie/play/b;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_b

    .line 43
    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v17

    move-object/from16 v33, v4

    move/from16 v5, v17

    goto :goto_7

    :cond_b
    move-object/from16 v33, v4

    const/high16 v5, -0x40800000    # -1.0f

    .line 44
    :goto_7
    sget-object v4, Lcom/tv91/features/movie/play/b;->b:Ljava/util/regex/Pattern;

    invoke-static {v14, v4, v11}, Lcom/tv91/features/movie/play/b;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v34, v3

    .line 45
    sget-object v3, Lcom/tv91/features/movie/play/b;->c:Ljava/util/regex/Pattern;

    invoke-static {v14, v3, v11}, Lcom/tv91/features/movie/play/b;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v35, v0

    .line 46
    sget-object v0, Lcom/tv91/features/movie/play/b;->d:Ljava/util/regex/Pattern;

    .line 47
    invoke-static {v14, v0, v11}, Lcom/tv91/features/movie/play/b;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v0

    .line 48
    sget-object v0, Lcom/tv91/features/movie/play/b;->e:Ljava/util/regex/Pattern;

    .line 49
    invoke-static {v14, v0, v11}, Lcom/tv91/features/movie/play/b;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    if-eqz v9, :cond_c

    .line 50
    sget-object v9, Lcom/tv91/features/movie/play/b;->I:Ljava/util/regex/Pattern;

    .line 51
    invoke-static {v14, v9, v11}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v9}, Lc/a/a/a/m2/l0;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    goto :goto_8

    .line 52
    :cond_c
    invoke-virtual/range {p0 .. p0}, Lcom/tv91/features/movie/play/b$a;->a()Z

    move-result v9

    if-eqz v9, :cond_e

    .line 53
    invoke-virtual/range {p0 .. p0}, Lcom/tv91/features/movie/play/b$a;->b()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v11}, Lcom/tv91/features/movie/play/b;->A(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    .line 54
    invoke-static {v1, v9}, Lc/a/a/a/m2/l0;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    .line 55
    :goto_8
    new-instance v14, Lc/a/a/a/u0$b;

    invoke-direct {v14}, Lc/a/a/a/u0$b;-><init>()V

    .line 56
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v14, v1}, Lc/a/a/a/u0$b;->R(I)Lc/a/a/a/u0$b;

    move-result-object v1

    .line 57
    invoke-virtual {v1, v15}, Lc/a/a/a/u0$b;->K(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v1

    .line 58
    invoke-virtual {v1, v7}, Lc/a/a/a/u0$b;->I(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v1

    .line 59
    invoke-virtual {v1, v12}, Lc/a/a/a/u0$b;->G(I)Lc/a/a/a/u0$b;

    move-result-object v1

    .line 60
    invoke-virtual {v1, v13}, Lc/a/a/a/u0$b;->Z(I)Lc/a/a/a/u0$b;

    move-result-object v1

    .line 61
    invoke-virtual {v1, v6}, Lc/a/a/a/u0$b;->j0(I)Lc/a/a/a/u0$b;

    move-result-object v1

    .line 62
    invoke-virtual {v1, v8}, Lc/a/a/a/u0$b;->Q(I)Lc/a/a/a/u0$b;

    move-result-object v1

    .line 63
    invoke-virtual {v1, v5}, Lc/a/a/a/u0$b;->P(F)Lc/a/a/a/u0$b;

    move-result-object v1

    .line 64
    invoke-virtual {v1, v10}, Lc/a/a/a/u0$b;->c0(I)Lc/a/a/a/u0$b;

    move-result-object v1

    .line 65
    invoke-virtual {v1}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object v23

    .line 66
    new-instance v1, Lcom/google/android/exoplayer2/source/hls/v/f$b;

    move-object/from16 v21, v1

    move-object/from16 v22, v9

    move-object/from16 v24, v4

    move-object/from16 v25, v3

    move-object/from16 v26, v17

    move-object/from16 v27, v0

    invoke-direct/range {v21 .. v27}, Lcom/google/android/exoplayer2/source/hls/v/f$b;-><init>(Landroid/net/Uri;Lc/a/a/a/u0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v35

    .line 68
    invoke-virtual {v1, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    if-nez v5, :cond_d

    .line 69
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 70
    invoke-virtual {v1, v9, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    :cond_d
    new-instance v6, Lcom/google/android/exoplayer2/source/hls/r$b;

    move-object/from16 v21, v6

    move/from16 v22, v12

    move/from16 v23, v13

    move-object/from16 v24, v4

    move-object/from16 v25, v3

    move-object/from16 v26, v17

    move-object/from16 v27, v0

    invoke-direct/range {v21 .. v27}, Lcom/google/android/exoplayer2/source/hls/r$b;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v10, v19

    move/from16 v13, v20

    :goto_9
    move-object v0, v1

    move-object/from16 v12, v28

    move-object/from16 v7, v29

    move-object/from16 v8, v30

    move-object/from16 v6, v31

    move-object/from16 v5, v32

    move-object/from16 v4, v33

    move-object/from16 v3, v34

    move-object/from16 v1, p1

    goto/16 :goto_0

    .line 72
    :cond_e
    new-instance v0, Lc/a/a/a/g1;

    const-string v1, "#EXT-X-STREAM-INF must be followed by another line"

    invoke-direct {v0, v1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    move-object v1, v0

    move-object/from16 v34, v3

    move-object/from16 v33, v4

    move-object/from16 v32, v5

    move-object/from16 v31, v6

    move-object/from16 v29, v7

    move-object/from16 v30, v8

    move/from16 v19, v10

    move-object/from16 v28, v12

    .line 73
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 74
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v4, 0x0

    .line 75
    :goto_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    if-ge v4, v5, :cond_12

    .line 76
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/exoplayer2/source/hls/v/f$b;

    .line 77
    iget-object v7, v5, Lcom/google/android/exoplayer2/source/hls/v/f$b;->a:Landroid/net/Uri;

    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_11

    .line 78
    iget-object v7, v5, Lcom/google/android/exoplayer2/source/hls/v/f$b;->b:Lc/a/a/a/u0;

    iget-object v7, v7, Lc/a/a/a/u0;->j:Lc/a/a/a/h2/a;

    if-nez v7, :cond_10

    const/4 v7, 0x1

    goto :goto_b

    :cond_10
    const/4 v7, 0x0

    :goto_b
    invoke-static {v7}, Lc/a/a/a/m2/f;->f(Z)V

    .line 79
    new-instance v7, Lcom/google/android/exoplayer2/source/hls/r;

    iget-object v8, v5, Lcom/google/android/exoplayer2/source/hls/v/f$b;->a:Landroid/net/Uri;

    .line 80
    invoke-virtual {v1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-direct {v7, v6, v6, v8}, Lcom/google/android/exoplayer2/source/hls/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 81
    new-instance v6, Lc/a/a/a/h2/a;

    const/4 v8, 0x1

    new-array v9, v8, [Lc/a/a/a/h2/a$b;

    const/4 v8, 0x0

    aput-object v7, v9, v8

    invoke-direct {v6, v9}, Lc/a/a/a/h2/a;-><init>([Lc/a/a/a/h2/a$b;)V

    .line 82
    iget-object v7, v5, Lcom/google/android/exoplayer2/source/hls/v/f$b;->b:Lc/a/a/a/u0;

    invoke-virtual {v7}, Lc/a/a/a/u0;->l()Lc/a/a/a/u0$b;

    move-result-object v7

    invoke-virtual {v7, v6}, Lc/a/a/a/u0$b;->X(Lc/a/a/a/h2/a;)Lc/a/a/a/u0$b;

    move-result-object v6

    invoke-virtual {v6}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object v6

    .line 83
    invoke-virtual {v5, v6}, Lcom/google/android/exoplayer2/source/hls/v/f$b;->a(Lc/a/a/a/u0;)Lcom/google/android/exoplayer2/source/hls/v/f$b;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_11
    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_12
    move-object v1, v6

    move-object v8, v1

    const/4 v0, 0x0

    .line 84
    :goto_c
    invoke-virtual/range {v34 .. v34}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v0, v4, :cond_24

    move-object/from16 v4, v34

    .line 85
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 86
    sget-object v7, Lcom/tv91/features/movie/play/b;->O:Ljava/util/regex/Pattern;

    invoke-static {v5, v7, v11}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    .line 87
    sget-object v9, Lcom/tv91/features/movie/play/b;->N:Ljava/util/regex/Pattern;

    invoke-static {v5, v9, v11}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    .line 88
    new-instance v10, Lc/a/a/a/u0$b;

    invoke-direct {v10}, Lc/a/a/a/u0$b;-><init>()V

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, ":"

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 89
    invoke-virtual {v10, v12}, Lc/a/a/a/u0$b;->S(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v10

    .line 90
    invoke-virtual {v10, v9}, Lc/a/a/a/u0$b;->U(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v10

    .line 91
    invoke-virtual {v10, v15}, Lc/a/a/a/u0$b;->K(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v10

    .line 92
    invoke-static {v5}, Lcom/tv91/features/movie/play/b;->x(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v10, v12}, Lc/a/a/a/u0$b;->g0(I)Lc/a/a/a/u0$b;

    move-result-object v10

    .line 93
    invoke-static {v5, v11}, Lcom/tv91/features/movie/play/b;->w(Ljava/lang/String;Ljava/util/Map;)I

    move-result v12

    invoke-virtual {v10, v12}, Lc/a/a/a/u0$b;->c0(I)Lc/a/a/a/u0$b;

    move-result-object v10

    sget-object v12, Lcom/tv91/features/movie/play/b;->M:Ljava/util/regex/Pattern;

    .line 94
    invoke-static {v5, v12, v11}, Lcom/tv91/features/movie/play/b;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v12}, Lc/a/a/a/u0$b;->V(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v10

    .line 95
    sget-object v12, Lcom/tv91/features/movie/play/b;->I:Ljava/util/regex/Pattern;

    invoke-static {v5, v12, v11}, Lcom/tv91/features/movie/play/b;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v14, p1

    if-nez v12, :cond_13

    move-object v12, v6

    goto :goto_d

    .line 96
    :cond_13
    invoke-static {v14, v12}, Lc/a/a/a/m2/l0;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v12

    .line 97
    :goto_d
    new-instance v6, Lc/a/a/a/h2/a;

    move-object/from16 v34, v4

    const/4 v4, 0x1

    new-array v14, v4, [Lc/a/a/a/h2/a$b;

    new-instance v4, Lcom/google/android/exoplayer2/source/hls/r;

    move-object/from16 v20, v15

    .line 98
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v15

    invoke-direct {v4, v7, v9, v15}, Lcom/google/android/exoplayer2/source/hls/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    const/4 v15, 0x0

    aput-object v4, v14, v15

    invoke-direct {v6, v14}, Lc/a/a/a/h2/a;-><init>([Lc/a/a/a/h2/a$b;)V

    .line 99
    sget-object v4, Lcom/tv91/features/movie/play/b;->K:Ljava/util/regex/Pattern;

    invoke-static {v5, v4, v11}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v14

    const/4 v15, 0x2

    sparse-switch v14, :sswitch_data_0

    :goto_e
    const/4 v4, -0x1

    goto :goto_f

    :sswitch_0
    const-string v14, "VIDEO"

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    goto :goto_e

    :cond_14
    const/4 v4, 0x3

    goto :goto_f

    :sswitch_1
    const-string v14, "AUDIO"

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_15

    goto :goto_e

    :cond_15
    const/4 v4, 0x2

    goto :goto_f

    :sswitch_2
    const-string v14, "CLOSED-CAPTIONS"

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    goto :goto_e

    :cond_16
    const/4 v4, 0x1

    goto :goto_f

    :sswitch_3
    const-string v14, "SUBTITLES"

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_17

    goto :goto_e

    :cond_17
    const/4 v4, 0x0

    :goto_f
    packed-switch v4, :pswitch_data_0

    :goto_10
    move-object/from16 v22, v8

    move-object/from16 v6, v31

    move-object/from16 v8, v32

    move-object/from16 v14, v33

    :goto_11
    const/16 v16, 0x0

    goto/16 :goto_17

    .line 100
    :pswitch_0
    invoke-static {v2, v7}, Lcom/tv91/features/movie/play/b;->h(Ljava/util/ArrayList;Ljava/lang/String;)Lcom/google/android/exoplayer2/source/hls/v/f$b;

    move-result-object v4

    if-eqz v4, :cond_18

    .line 101
    iget-object v4, v4, Lcom/google/android/exoplayer2/source/hls/v/f$b;->b:Lc/a/a/a/u0;

    .line 102
    iget-object v5, v4, Lc/a/a/a/u0;->i:Ljava/lang/String;

    invoke-static {v5, v15}, Lc/a/a/a/m2/m0;->G(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    .line 103
    invoke-virtual {v10, v5}, Lc/a/a/a/u0$b;->I(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v14

    .line 104
    invoke-static {v5}, Lc/a/a/a/m2/w;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v14, v5}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v5

    iget v14, v4, Lc/a/a/a/u0;->q:I

    .line 105
    invoke-virtual {v5, v14}, Lc/a/a/a/u0$b;->j0(I)Lc/a/a/a/u0$b;

    move-result-object v5

    iget v14, v4, Lc/a/a/a/u0;->r:I

    .line 106
    invoke-virtual {v5, v14}, Lc/a/a/a/u0$b;->Q(I)Lc/a/a/a/u0$b;

    move-result-object v5

    iget v4, v4, Lc/a/a/a/u0;->s:F

    .line 107
    invoke-virtual {v5, v4}, Lc/a/a/a/u0$b;->P(F)Lc/a/a/a/u0$b;

    :cond_18
    if-nez v12, :cond_19

    goto :goto_10

    .line 108
    :cond_19
    invoke-virtual {v10, v6}, Lc/a/a/a/u0$b;->X(Lc/a/a/a/h2/a;)Lc/a/a/a/u0$b;

    .line 109
    new-instance v4, Lcom/google/android/exoplayer2/source/hls/v/f$a;

    invoke-virtual {v10}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object v5

    invoke-direct {v4, v12, v5, v7, v9}, Lcom/google/android/exoplayer2/source/hls/v/f$a;-><init>(Landroid/net/Uri;Lc/a/a/a/u0;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v14, v33

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v22, v8

    move-object/from16 v6, v31

    move-object/from16 v8, v32

    goto :goto_11

    :pswitch_1
    move-object/from16 v14, v33

    .line 110
    invoke-static {v2, v7}, Lcom/tv91/features/movie/play/b;->f(Ljava/util/ArrayList;Ljava/lang/String;)Lcom/google/android/exoplayer2/source/hls/v/f$b;

    move-result-object v4

    if-eqz v4, :cond_1a

    .line 111
    iget-object v15, v4, Lcom/google/android/exoplayer2/source/hls/v/f$b;->b:Lc/a/a/a/u0;

    iget-object v15, v15, Lc/a/a/a/u0;->i:Ljava/lang/String;

    move-object/from16 v22, v8

    const/4 v8, 0x1

    invoke-static {v15, v8}, Lc/a/a/a/m2/m0;->G(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v15

    .line 112
    invoke-virtual {v10, v15}, Lc/a/a/a/u0$b;->I(Ljava/lang/String;)Lc/a/a/a/u0$b;

    .line 113
    invoke-static {v15}, Lc/a/a/a/m2/w;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    goto :goto_12

    :cond_1a
    move-object/from16 v22, v8

    const/4 v15, 0x0

    .line 114
    :goto_12
    sget-object v8, Lcom/tv91/features/movie/play/b;->g:Ljava/util/regex/Pattern;

    .line 115
    invoke-static {v5, v8, v11}, Lcom/tv91/features/movie/play/b;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1b

    const-string v8, "/"

    .line 116
    invoke-static {v5, v8}, Lc/a/a/a/m2/m0;->E0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    const/16 v16, 0x0

    aget-object v8, v8, v16

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 117
    invoke-virtual {v10, v8}, Lc/a/a/a/u0$b;->H(I)Lc/a/a/a/u0$b;

    const-string v8, "audio/eac3"

    .line 118
    invoke-virtual {v8, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1c

    const-string v8, "/JOC"

    invoke-virtual {v5, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1c

    const-string v15, "audio/eac3-joc"

    goto :goto_13

    :cond_1b
    const/16 v16, 0x0

    .line 119
    :cond_1c
    :goto_13
    invoke-virtual {v10, v15}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    if-eqz v12, :cond_1d

    .line 120
    invoke-virtual {v10, v6}, Lc/a/a/a/u0$b;->X(Lc/a/a/a/h2/a;)Lc/a/a/a/u0$b;

    .line 121
    new-instance v4, Lcom/google/android/exoplayer2/source/hls/v/f$a;

    invoke-virtual {v10}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object v5

    invoke-direct {v4, v12, v5, v7, v9}, Lcom/google/android/exoplayer2/source/hls/v/f$a;-><init>(Landroid/net/Uri;Lc/a/a/a/u0;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v8, v32

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_15

    :cond_1d
    move-object/from16 v8, v32

    if-eqz v4, :cond_20

    .line 122
    invoke-virtual {v10}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object v4

    move-object/from16 v22, v4

    goto :goto_15

    :pswitch_2
    move-object/from16 v22, v8

    move-object/from16 v8, v32

    move-object/from16 v14, v33

    const/16 v16, 0x0

    .line 123
    sget-object v4, Lcom/tv91/features/movie/play/b;->Q:Ljava/util/regex/Pattern;

    invoke-static {v5, v4, v11}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "CC"

    .line 124
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1e

    .line 125
    invoke-virtual {v4, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const-string v5, "application/cea-608"

    goto :goto_14

    :cond_1e
    const/4 v5, 0x7

    .line 126
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const-string v5, "application/cea-708"

    :goto_14
    if-nez v1, :cond_1f

    .line 127
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 128
    :cond_1f
    invoke-virtual {v10, v5}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v5

    .line 129
    invoke-virtual {v5, v4}, Lc/a/a/a/u0$b;->F(I)Lc/a/a/a/u0$b;

    .line 130
    invoke-virtual {v10}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_20
    :goto_15
    move-object/from16 v6, v31

    goto :goto_17

    :pswitch_3
    move-object/from16 v22, v8

    move-object/from16 v8, v32

    move-object/from16 v14, v33

    const/16 v16, 0x0

    .line 131
    invoke-static {v2, v7}, Lcom/tv91/features/movie/play/b;->g(Ljava/util/ArrayList;Ljava/lang/String;)Lcom/google/android/exoplayer2/source/hls/v/f$b;

    move-result-object v4

    if-eqz v4, :cond_21

    .line 132
    iget-object v4, v4, Lcom/google/android/exoplayer2/source/hls/v/f$b;->b:Lc/a/a/a/u0;

    iget-object v4, v4, Lc/a/a/a/u0;->i:Ljava/lang/String;

    const/4 v5, 0x3

    invoke-static {v4, v5}, Lc/a/a/a/m2/m0;->G(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    .line 133
    invoke-virtual {v10, v4}, Lc/a/a/a/u0$b;->I(Ljava/lang/String;)Lc/a/a/a/u0$b;

    .line 134
    invoke-static {v4}, Lc/a/a/a/m2/w;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_16

    :cond_21
    const/4 v4, 0x0

    :goto_16
    if-nez v4, :cond_22

    const-string v4, "text/vtt"

    .line 135
    :cond_22
    invoke-virtual {v10, v4}, Lc/a/a/a/u0$b;->e0(Ljava/lang/String;)Lc/a/a/a/u0$b;

    move-result-object v4

    invoke-virtual {v4, v6}, Lc/a/a/a/u0$b;->X(Lc/a/a/a/h2/a;)Lc/a/a/a/u0$b;

    if-eqz v12, :cond_23

    .line 136
    new-instance v4, Lcom/google/android/exoplayer2/source/hls/v/f$a;

    .line 137
    invoke-virtual {v10}, Lc/a/a/a/u0$b;->E()Lc/a/a/a/u0;

    move-result-object v5

    invoke-direct {v4, v12, v5, v7, v9}, Lcom/google/android/exoplayer2/source/hls/v/f$a;-><init>(Landroid/net/Uri;Lc/a/a/a/u0;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v6, v31

    .line 138
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :cond_23
    move-object/from16 v6, v31

    const-string v4, "HlsPlaylistParser"

    const-string v5, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"

    .line 139
    invoke-static {v4, v5}, Lc/a/a/a/m2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    :goto_17
    add-int/lit8 v0, v0, 0x1

    move-object/from16 v31, v6

    move-object/from16 v32, v8

    move-object/from16 v33, v14

    move-object/from16 v15, v20

    move-object/from16 v8, v22

    const/4 v6, 0x0

    goto/16 :goto_c

    :cond_24
    move-object/from16 v22, v8

    move-object/from16 v6, v31

    move-object/from16 v8, v32

    move-object/from16 v14, v33

    if-eqz v13, :cond_25

    .line 140
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    move-object v9, v0

    goto :goto_18

    :cond_25
    move-object v9, v1

    .line 141
    :goto_18
    new-instance v13, Lcom/google/android/exoplayer2/source/hls/v/f;

    move-object v0, v13

    move-object/from16 v1, p1

    move-object/from16 v2, v30

    move-object v4, v14

    move-object v5, v8

    move-object/from16 v7, v29

    move-object/from16 v8, v22

    move/from16 v10, v19

    move-object/from16 v12, v28

    invoke-direct/range {v0 .. v12}, Lcom/google/android/exoplayer2/source/hls/v/f;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lc/a/a/a/u0;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    return-object v13

    nop

    :sswitch_data_0
    .sparse-switch
        -0x392db8c5 -> :sswitch_3
        -0x13dc6572 -> :sswitch_2
        0x3bba3b6 -> :sswitch_1
        0x4de1c5b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static p(Lcom/google/android/exoplayer2/source/hls/v/f;Lcom/google/android/exoplayer2/source/hls/v/g;Lcom/tv91/features/movie/play/b$a;Ljava/lang/String;)Lcom/google/android/exoplayer2/source/hls/v/g;
    .locals 93
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget-boolean v2, v0, Lcom/google/android/exoplayer2/source/hls/v/h;->c:Z

    .line 2
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 3
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 4
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 5
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 6
    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 7
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 8
    new-instance v6, Lcom/google/android/exoplayer2/source/hls/v/g$f;

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v19, 0x0

    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v22, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v24, 0x0

    move-object/from16 v16, v6

    invoke-direct/range {v16 .. v24}, Lcom/google/android/exoplayer2/source/hls/v/g$f;-><init>(JZJJZ)V

    .line 9
    new-instance v7, Ljava/util/TreeMap;

    invoke-direct {v7}, Ljava/util/TreeMap;-><init>()V

    const-string v9, ""

    const-wide/16 v17, 0x0

    move/from16 v33, v2

    move-object/from16 v54, v6

    move-object/from16 v39, v9

    move-wide/from16 v23, v17

    move-wide/from16 v26, v23

    move-wide/from16 v36, v26

    move-wide/from16 v48, v36

    move-wide/from16 v78, v48

    move-wide/from16 v80, v78

    move-wide/from16 v84, v80

    move-wide/from16 v86, v84

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v25, 0x0

    const/16 v28, 0x1

    const-wide v29, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v31, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v38, 0x0

    const/16 v52, 0x0

    const/16 v55, 0x0

    const-wide/16 v74, -0x1

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    .line 10
    :cond_0
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lcom/tv91/features/movie/play/b$a;->a()Z

    move-result v40

    if-eqz v40, :cond_44

    .line 11
    invoke-virtual/range {p2 .. p2}, Lcom/tv91/features/movie/play/b$a;->b()Ljava/lang/String;

    move-result-object v11

    const-string v10, "#EXT"

    .line 12
    invoke-virtual {v11, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_1

    .line 13
    invoke-interface {v8, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    const-string v10, "#EXT-X-PLAYLIST-TYPE"

    .line 14
    invoke-virtual {v11, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 15
    sget-object v10, Lcom/tv91/features/movie/play/b;->o:Ljava/util/regex/Pattern;

    invoke-static {v11, v10, v3}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "VOD"

    .line 16
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    const/4 v6, 0x1

    goto :goto_0

    :cond_2
    const-string v11, "EVENT"

    .line 17
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    const/4 v6, 0x2

    goto :goto_0

    :cond_3
    const-string v10, "#EXT-X-I-FRAMES-ONLY"

    .line 18
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v82, 0x1

    goto :goto_0

    :cond_4
    const-string v10, "#EXT-X-START"

    .line 19
    invoke-virtual {v11, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    const-wide v40, 0x412e848000000000L    # 1000000.0

    if-eqz v10, :cond_5

    .line 20
    sget-object v10, Lcom/tv91/features/movie/play/b;->A:Ljava/util/regex/Pattern;

    invoke-static {v11, v10}, Lcom/tv91/features/movie/play/b;->j(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v10

    mul-double v10, v10, v40

    double-to-long v10, v10

    move-wide/from16 v21, v10

    goto :goto_0

    :cond_5
    const-string v10, "#EXT-X-SERVER-CONTROL"

    .line 21
    invoke-virtual {v11, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_6

    .line 22
    invoke-static {v11}, Lcom/tv91/features/movie/play/b;->y(Ljava/lang/String;)Lcom/google/android/exoplayer2/source/hls/v/g$f;

    move-result-object v54

    goto :goto_0

    :cond_6
    const-string v10, "#EXT-X-PART-INF"

    .line 23
    invoke-virtual {v11, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_7

    .line 24
    sget-object v10, Lcom/tv91/features/movie/play/b;->m:Ljava/util/regex/Pattern;

    invoke-static {v11, v10}, Lcom/tv91/features/movie/play/b;->j(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v10

    mul-double v10, v10, v40

    double-to-long v10, v10

    move-wide/from16 v31, v10

    goto :goto_0

    :cond_7
    const-string v10, "#EXT-X-MAP"

    .line 25
    invoke-virtual {v11, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    move/from16 v89, v2

    const-string v2, "@"

    if-eqz v10, :cond_c

    .line 26
    sget-object v10, Lcom/tv91/features/movie/play/b;->I:Ljava/util/regex/Pattern;

    invoke-static {v11, v10, v3}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v41

    .line 27
    sget-object v10, Lcom/tv91/features/movie/play/b;->C:Ljava/util/regex/Pattern;

    invoke-static {v11, v10, v3}, Lcom/tv91/features/movie/play/b;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_9

    .line 28
    invoke-static {v10, v2}, Lc/a/a/a/m2/m0;->D0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v10, 0x0

    .line 29
    aget-object v11, v2, v10

    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    move-wide/from16 v42, v10

    .line 30
    array-length v10, v2

    const/4 v11, 0x1

    if-le v10, v11, :cond_8

    .line 31
    aget-object v2, v2, v11

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    move-wide/from16 v44, v42

    move-wide/from16 v42, v10

    goto :goto_1

    :cond_8
    move-wide/from16 v44, v42

    move-wide/from16 v42, v36

    goto :goto_1

    :cond_9
    move-wide/from16 v42, v36

    move-wide/from16 v44, v74

    :goto_1
    if-eqz v12, :cond_b

    if-eqz v13, :cond_a

    goto :goto_2

    .line 32
    :cond_a
    new-instance v0, Lc/a/a/a/g1;

    const-string v1, "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."

    invoke-direct {v0, v1}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw v0

    .line 33
    :cond_b
    :goto_2
    new-instance v83, Lcom/google/android/exoplayer2/source/hls/v/g$d;

    move-object/from16 v40, v83

    move-object/from16 v46, v12

    move-object/from16 v47, v13

    invoke-direct/range {v40 .. v47}, Lcom/google/android/exoplayer2/source/hls/v/g$d;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    move-wide/from16 v36, v17

    move/from16 v2, v89

    const-wide/16 v74, -0x1

    goto/16 :goto_0

    :cond_c
    const-string v10, "#EXT-X-TARGETDURATION"

    .line 34
    invoke-virtual {v11, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_d

    .line 35
    sget-object v2, Lcom/tv91/features/movie/play/b;->k:Ljava/util/regex/Pattern;

    invoke-static {v11, v2}, Lcom/tv91/features/movie/play/b;->m(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v2

    int-to-long v10, v2

    const-wide/32 v29, 0xf4240

    mul-long v29, v29, v10

    :goto_3
    move/from16 v2, v89

    goto/16 :goto_0

    :cond_d
    const-string v10, "#EXT-X-MEDIA-SEQUENCE"

    .line 36
    invoke-virtual {v11, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_e

    .line 37
    sget-object v2, Lcom/tv91/features/movie/play/b;->v:Ljava/util/regex/Pattern;

    invoke-static {v11, v2}, Lcom/tv91/features/movie/play/b;->n(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    move-result-wide v80

    move-wide/from16 v26, v80

    goto :goto_3

    :cond_e
    const-string v10, "#EXT-X-VERSION"

    .line 38
    invoke-virtual {v11, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_f

    .line 39
    sget-object v2, Lcom/tv91/features/movie/play/b;->n:Ljava/util/regex/Pattern;

    invoke-static {v11, v2}, Lcom/tv91/features/movie/play/b;->m(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v28

    goto :goto_3

    :cond_f
    const-string v10, "#EXT-X-DEFINE"

    .line 40
    invoke-virtual {v11, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_12

    .line 41
    sget-object v2, Lcom/tv91/features/movie/play/b;->X:Ljava/util/regex/Pattern;

    invoke-static {v11, v2, v3}, Lcom/tv91/features/movie/play/b;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_10

    .line 42
    iget-object v10, v0, Lcom/google/android/exoplayer2/source/hls/v/f;->m:Ljava/util/Map;

    invoke-interface {v10, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    if-eqz v10, :cond_11

    .line 43
    invoke-virtual {v3, v2, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 44
    :cond_10
    sget-object v2, Lcom/tv91/features/movie/play/b;->N:Ljava/util/regex/Pattern;

    .line 45
    invoke-static {v11, v2, v3}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    sget-object v10, Lcom/tv91/features/movie/play/b;->W:Ljava/util/regex/Pattern;

    .line 46
    invoke-static {v11, v10, v3}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    .line 47
    invoke-virtual {v3, v2, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    :goto_4
    move-object/from16 v91, v9

    move-object v10, v12

    move-object v9, v13

    move-object/from16 v92, v14

    move-object/from16 v12, v76

    move-wide/from16 v13, v80

    const/4 v1, 0x0

    const-wide/16 v40, -0x1

    move/from16 v80, v6

    move-object/from16 v76, v8

    goto/16 :goto_1b

    :cond_12
    const-string v10, "#EXTINF"

    .line 48
    invoke-virtual {v11, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_13

    .line 49
    sget-object v2, Lcom/tv91/features/movie/play/b;->w:Ljava/util/regex/Pattern;

    .line 50
    invoke-static {v11, v2}, Lcom/tv91/features/movie/play/b;->j(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v42

    move-object v10, v12

    move-object/from16 v90, v13

    mul-double v12, v42, v40

    double-to-long v12, v12

    .line 51
    sget-object v2, Lcom/tv91/features/movie/play/b;->x:Ljava/util/regex/Pattern;

    invoke-static {v11, v2, v9, v3}, Lcom/tv91/features/movie/play/b;->u(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v39

    move-wide/from16 v84, v12

    move/from16 v2, v89

    move-object/from16 v13, v90

    :goto_5
    move-object v12, v10

    goto/16 :goto_0

    :cond_13
    move-object v10, v12

    move-object/from16 v90, v13

    const-string v12, "#EXT-X-SKIP"

    .line 52
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    const-wide/16 v42, 0x1

    if-eqz v12, :cond_1b

    .line 53
    sget-object v2, Lcom/tv91/features/movie/play/b;->r:Ljava/util/regex/Pattern;

    invoke-static {v11, v2}, Lcom/tv91/features/movie/play/b;->m(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v2

    if-eqz v1, :cond_14

    .line 54
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_14

    const/4 v11, 0x1

    goto :goto_6

    :cond_14
    const/4 v11, 0x0

    :goto_6
    invoke-static {v11}, Lc/a/a/a/m2/f;->f(Z)V

    .line 55
    invoke-static/range {p1 .. p1}, Lc/a/a/a/m2/m0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/exoplayer2/source/hls/v/g;

    iget-wide v11, v11, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    sub-long v11, v26, v11

    long-to-int v12, v11

    add-int/2addr v2, v12

    if-ltz v12, :cond_1a

    .line 56
    iget-object v11, v1, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    if-gt v2, v11, :cond_1a

    move-object/from16 v91, v9

    move-object v11, v10

    move-wide/from16 v9, v78

    move-object/from16 v13, v90

    :goto_7
    if-ge v12, v2, :cond_19

    .line 57
    iget-object v11, v1, Lcom/google/android/exoplayer2/source/hls/v/g;->p:Ljava/util/List;

    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/exoplayer2/source/hls/v/g$d;

    move-object/from16 v40, v13

    move-object/from16 v92, v14

    .line 58
    iget-wide v13, v1, Lcom/google/android/exoplayer2/source/hls/v/g;->i:J

    cmp-long v38, v26, v13

    if-eqz v38, :cond_15

    .line 59
    iget v13, v1, Lcom/google/android/exoplayer2/source/hls/v/g;->h:I

    sub-int v13, v13, v25

    iget v14, v11, Lcom/google/android/exoplayer2/source/hls/v/g$e;->d:I

    add-int/2addr v13, v14

    .line 60
    invoke-virtual {v11, v9, v10, v13}, Lcom/google/android/exoplayer2/source/hls/v/g$d;->b(JI)Lcom/google/android/exoplayer2/source/hls/v/g$d;

    move-result-object v11

    .line 61
    :cond_15
    invoke-interface {v15, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    iget-wide v13, v11, Lcom/google/android/exoplayer2/source/hls/v/g$e;->c:J

    add-long/2addr v9, v13

    .line 63
    iget-wide v13, v11, Lcom/google/android/exoplayer2/source/hls/v/g$e;->j:J

    const-wide/16 v44, -0x1

    cmp-long v38, v13, v44

    if-eqz v38, :cond_16

    .line 64
    iget-wide v0, v11, Lcom/google/android/exoplayer2/source/hls/v/g$e;->i:J

    add-long/2addr v0, v13

    move-wide/from16 v36, v0

    .line 65
    :cond_16
    iget v0, v11, Lcom/google/android/exoplayer2/source/hls/v/g$e;->d:I

    .line 66
    iget-object v1, v11, Lcom/google/android/exoplayer2/source/hls/v/g$e;->b:Lcom/google/android/exoplayer2/source/hls/v/g$d;

    .line 67
    iget-object v13, v11, Lcom/google/android/exoplayer2/source/hls/v/g$e;->f:Lc/a/a/a/e2/t;

    .line 68
    iget-object v14, v11, Lcom/google/android/exoplayer2/source/hls/v/g$e;->g:Ljava/lang/String;

    move/from16 v38, v0

    .line 69
    iget-object v0, v11, Lcom/google/android/exoplayer2/source/hls/v/g$e;->h:Ljava/lang/String;

    move-object/from16 v41, v1

    if-eqz v0, :cond_18

    .line 70
    invoke-static/range {v80 .. v81}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_8

    :cond_17
    move-object/from16 v0, v40

    goto :goto_9

    .line 71
    :cond_18
    :goto_8
    iget-object v0, v11, Lcom/google/android/exoplayer2/source/hls/v/g$e;->h:Ljava/lang/String;

    :goto_9
    add-long v80, v80, v42

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, p1

    move-wide/from16 v48, v9

    move-object v11, v14

    move/from16 v77, v38

    move-object/from16 v83, v41

    move-object/from16 v14, v92

    move-object/from16 v38, v13

    move-object v13, v0

    move-object/from16 v0, p0

    goto :goto_7

    :cond_19
    move-object/from16 v40, v13

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v78, v9

    move-object v12, v11

    move/from16 v2, v89

    goto/16 :goto_1d

    .line 72
    :cond_1a
    new-instance v0, Lcom/google/android/exoplayer2/source/hls/v/i$a;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/source/hls/v/i$a;-><init>()V

    throw v0

    :cond_1b
    move-object/from16 v91, v9

    move-object/from16 v92, v14

    const-string v0, "#EXT-X-KEY"

    .line 73
    invoke-virtual {v11, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 74
    sget-object v0, Lcom/tv91/features/movie/play/b;->F:Ljava/util/regex/Pattern;

    invoke-static {v11, v0, v3}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 75
    sget-object v1, Lcom/tv91/features/movie/play/b;->G:Ljava/util/regex/Pattern;

    const-string v2, "identity"

    .line 76
    invoke-static {v11, v1, v2, v3}, Lcom/tv91/features/movie/play/b;->u(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    const-string v9, "NONE"

    .line 77
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1c

    .line 78
    invoke-virtual {v7}, Ljava/util/TreeMap;->clear()V

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_a
    const/16 v38, 0x0

    goto :goto_c

    .line 79
    :cond_1c
    sget-object v9, Lcom/tv91/features/movie/play/b;->J:Ljava/util/regex/Pattern;

    invoke-static {v11, v9, v3}, Lcom/tv91/features/movie/play/b;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    .line 80
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1e

    const-string v1, "AES-128"

    .line 81
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 82
    sget-object v0, Lcom/tv91/features/movie/play/b;->I:Ljava/util/regex/Pattern;

    invoke-static {v11, v0, v3}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    move-object v13, v9

    goto :goto_c

    :cond_1d
    move-object v13, v9

    const/4 v12, 0x0

    goto :goto_c

    :cond_1e
    move-object/from16 v12, v76

    if-nez v12, :cond_1f

    .line 83
    invoke-static {v0}, Lcom/tv91/features/movie/play/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v76, v0

    goto :goto_b

    :cond_1f
    move-object/from16 v76, v12

    .line 84
    :goto_b
    invoke-static {v11, v1, v3}, Lcom/tv91/features/movie/play/b;->k(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lc/a/a/a/e2/t$b;

    move-result-object v0

    if-eqz v0, :cond_1d

    .line 85
    invoke-virtual {v7, v1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v13, v9

    const/4 v12, 0x0

    goto :goto_a

    :goto_c
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v89

    move-object/from16 v9, v91

    move-object/from16 v14, v92

    goto/16 :goto_0

    :cond_20
    move-object/from16 v12, v76

    const-string v0, "#EXT-X-BYTERANGE"

    .line 86
    invoke-virtual {v11, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_22

    .line 87
    sget-object v0, Lcom/tv91/features/movie/play/b;->B:Ljava/util/regex/Pattern;

    invoke-static {v11, v0, v3}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 88
    invoke-static {v0, v2}, Lc/a/a/a/m2/m0;->D0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 89
    aget-object v2, v0, v1

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v74

    .line 90
    array-length v1, v0

    const/4 v9, 0x1

    if-le v1, v9, :cond_21

    .line 91
    aget-object v0, v0, v9

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v36

    :cond_21
    :goto_d
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v76, v12

    move/from16 v2, v89

    move-object/from16 v13, v90

    move-object/from16 v9, v91

    move-object/from16 v14, v92

    goto/16 :goto_5

    :cond_22
    const/4 v9, 0x1

    const-string v0, "#EXT-X-DISCONTINUITY-SEQUENCE"

    .line 92
    invoke-virtual {v11, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x3a

    if-eqz v0, :cond_23

    .line 93
    invoke-virtual {v11, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/2addr v0, v9

    invoke-virtual {v11, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v76, v12

    move-object/from16 v13, v90

    move-object/from16 v9, v91

    move-object/from16 v14, v92

    const/4 v2, 0x1

    goto/16 :goto_5

    :cond_23
    const-string v0, "#EXT-X-DISCONTINUITY"

    .line 94
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_24

    add-int/lit8 v77, v77, 0x1

    goto :goto_d

    :cond_24
    const-string v0, "#EXT-X-PROGRAM-DATE-TIME"

    .line 95
    invoke-virtual {v11, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_26

    cmp-long v0, v23, v17

    if-nez v0, :cond_25

    .line 96
    invoke-virtual {v11, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-virtual {v11, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc/a/a/a/m2/m0;->x0(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lc/a/a/a/i0;->c(J)J

    move-result-wide v0

    sub-long v23, v0, v78

    goto :goto_d

    :cond_25
    :goto_e
    move-object/from16 v76, v8

    move-wide/from16 v13, v80

    move-object/from16 v9, v90

    const/4 v1, 0x0

    const-wide/16 v40, -0x1

    move/from16 v80, v6

    goto/16 :goto_1b

    :cond_26
    const-string v0, "#EXT-X-GAP"

    .line 97
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v76, v12

    move/from16 v2, v89

    move-object/from16 v13, v90

    move-object/from16 v9, v91

    move-object/from16 v14, v92

    const/16 v52, 0x1

    goto/16 :goto_5

    :cond_27
    const-string v0, "#EXT-X-INDEPENDENT-SEGMENTS"

    .line 98
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v76, v12

    move/from16 v2, v89

    move-object/from16 v13, v90

    move-object/from16 v9, v91

    move-object/from16 v14, v92

    const/16 v33, 0x1

    goto/16 :goto_5

    :cond_28
    const-string v0, "#EXT-X-ENDLIST"

    .line 99
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v76, v12

    move/from16 v2, v89

    move-object/from16 v13, v90

    move-object/from16 v9, v91

    move-object/from16 v14, v92

    const/16 v34, 0x1

    goto/16 :goto_5

    :cond_29
    const-string v0, "#EXT-X-RENDITION-REPORT"

    .line 100
    invoke-virtual {v11, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 101
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    add-long v0, v26, v0

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v2

    int-to-long v13, v2

    sub-long/2addr v0, v13

    .line 102
    sget-object v2, Lcom/tv91/features/movie/play/b;->y:Ljava/util/regex/Pattern;

    invoke-static {v11, v2, v0, v1}, Lcom/tv91/features/movie/play/b;->t(Ljava/lang/String;Ljava/util/regex/Pattern;J)J

    move-result-wide v0

    .line 103
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2a

    invoke-static {v15}, Lc/a/b/b/w;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/exoplayer2/source/hls/v/g$d;

    iget-object v2, v2, Lcom/google/android/exoplayer2/source/hls/v/g$d;->m:Ljava/util/List;

    goto :goto_f

    :cond_2a
    move-object v2, v5

    :goto_f
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v9, v31, v13

    if-eqz v9, :cond_2b

    .line 104
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v9, 0x1

    sub-int/2addr v2, v9

    goto :goto_10

    :cond_2b
    const/4 v2, -0x1

    .line 105
    :goto_10
    sget-object v9, Lcom/tv91/features/movie/play/b;->z:Ljava/util/regex/Pattern;

    invoke-static {v11, v9, v2}, Lcom/tv91/features/movie/play/b;->s(Ljava/lang/String;Ljava/util/regex/Pattern;I)I

    move-result v2

    .line 106
    sget-object v9, Lcom/tv91/features/movie/play/b;->I:Ljava/util/regex/Pattern;

    invoke-static {v11, v9, v3}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v11, p3

    .line 107
    invoke-static {v11, v9}, Lc/a/a/a/m2/l0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    .line 108
    new-instance v13, Lcom/google/android/exoplayer2/source/hls/v/g$c;

    invoke-direct {v13, v9, v0, v1, v2}, Lcom/google/android/exoplayer2/source/hls/v/g$c;-><init>(Landroid/net/Uri;JI)V

    move-object/from16 v0, v92

    invoke-interface {v0, v9, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_e

    :cond_2c
    move-object/from16 v0, v92

    const-string v1, "#EXT-X-PRELOAD-HINT"

    .line 109
    invoke-virtual {v11, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_34

    move-object/from16 v1, v55

    if-eqz v1, :cond_2d

    :goto_11
    move-object/from16 v92, v0

    move-object/from16 v55, v1

    goto/16 :goto_e

    .line 110
    :cond_2d
    sget-object v2, Lcom/tv91/features/movie/play/b;->L:Ljava/util/regex/Pattern;

    invoke-static {v11, v2, v3}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    const-string v9, "PART"

    .line 111
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2e

    goto :goto_11

    .line 112
    :cond_2e
    sget-object v2, Lcom/tv91/features/movie/play/b;->I:Ljava/util/regex/Pattern;

    invoke-static {v11, v2, v3}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v57

    .line 113
    sget-object v2, Lcom/tv91/features/movie/play/b;->D:Ljava/util/regex/Pattern;

    const-wide/16 v13, -0x1

    .line 114
    invoke-static {v11, v2, v13, v14}, Lcom/tv91/features/movie/play/b;->t(Ljava/lang/String;Ljava/util/regex/Pattern;J)J

    move-result-wide v40

    .line 115
    sget-object v2, Lcom/tv91/features/movie/play/b;->E:Ljava/util/regex/Pattern;

    .line 116
    invoke-static {v11, v2, v13, v14}, Lcom/tv91/features/movie/play/b;->t(Ljava/lang/String;Ljava/util/regex/Pattern;J)J

    move-result-wide v69

    move-wide/from16 v13, v80

    move-object/from16 v9, v90

    .line 117
    invoke-static {v13, v14, v10, v9}, Lcom/tv91/features/movie/play/b;->e(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v66

    if-nez v38, :cond_30

    .line 118
    invoke-virtual {v7}, Ljava/util/TreeMap;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_30

    .line 119
    invoke-virtual {v7}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v2

    move-object/from16 v92, v0

    const/4 v11, 0x0

    new-array v0, v11, [Lc/a/a/a/e2/t$b;

    .line 120
    invoke-interface {v2, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/a/a/a/e2/t$b;

    .line 121
    new-instance v2, Lc/a/a/a/e2/t;

    invoke-direct {v2, v12, v0}, Lc/a/a/a/e2/t;-><init>(Ljava/lang/String;[Lc/a/a/a/e2/t$b;)V

    if-nez v35, :cond_2f

    .line 122
    invoke-static {v12, v0}, Lcom/tv91/features/movie/play/b;->d(Ljava/lang/String;[Lc/a/a/a/e2/t$b;)Lc/a/a/a/e2/t;

    move-result-object v35

    :cond_2f
    move-object/from16 v38, v2

    goto :goto_12

    :cond_30
    move-object/from16 v92, v0

    :goto_12
    const-wide/16 v42, -0x1

    cmp-long v0, v40, v42

    if-eqz v0, :cond_32

    cmp-long v0, v69, v42

    if-eqz v0, :cond_31

    goto :goto_13

    :cond_31
    move-object/from16 v55, v1

    goto :goto_15

    .line 123
    :cond_32
    :goto_13
    new-instance v55, Lcom/google/android/exoplayer2/source/hls/v/g$b;

    const-wide/16 v59, 0x0

    cmp-long v0, v40, v42

    if-eqz v0, :cond_33

    move-wide/from16 v67, v40

    goto :goto_14

    :cond_33
    move-wide/from16 v67, v17

    :goto_14
    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x1

    move-object/from16 v56, v55

    move-object/from16 v58, v83

    move/from16 v61, v77

    move-wide/from16 v62, v48

    move-object/from16 v64, v38

    move-object/from16 v65, v10

    invoke-direct/range {v56 .. v73}, Lcom/google/android/exoplayer2/source/hls/v/g$b;-><init>(Ljava/lang/String;Lcom/google/android/exoplayer2/source/hls/v/g$d;JIJLc/a/a/a/e2/t;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    :goto_15
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v76, v12

    move-wide/from16 v80, v13

    move/from16 v2, v89

    goto/16 :goto_1c

    :cond_34
    move-object/from16 v92, v0

    move-object/from16 v1, v55

    move-wide/from16 v13, v80

    move-object/from16 v9, v90

    const-string v0, "#EXT-X-PART"

    .line 124
    invoke-virtual {v11, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3b

    .line 125
    invoke-static {v13, v14, v10, v9}, Lcom/tv91/features/movie/play/b;->e(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v66

    .line 126
    sget-object v0, Lcom/tv91/features/movie/play/b;->I:Ljava/util/regex/Pattern;

    invoke-static {v11, v0, v3}, Lcom/tv91/features/movie/play/b;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v57

    .line 127
    sget-object v0, Lcom/tv91/features/movie/play/b;->l:Ljava/util/regex/Pattern;

    .line 128
    invoke-static {v11, v0}, Lcom/tv91/features/movie/play/b;->j(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v42

    move-object/from16 v55, v1

    mul-double v0, v42, v40

    double-to-long v0, v0

    move-object/from16 v76, v8

    .line 129
    sget-object v8, Lcom/tv91/features/movie/play/b;->U:Ljava/util/regex/Pattern;

    move/from16 v80, v6

    const/4 v6, 0x0

    .line 130
    invoke-static {v11, v8, v6}, Lcom/tv91/features/movie/play/b;->q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v8

    if-eqz v33, :cond_35

    .line 131
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v40

    if-eqz v40, :cond_35

    const/16 v88, 0x1

    goto :goto_16

    :cond_35
    const/16 v88, 0x0

    :goto_16
    or-int v72, v8, v88

    .line 132
    sget-object v8, Lcom/tv91/features/movie/play/b;->V:Ljava/util/regex/Pattern;

    invoke-static {v11, v8, v6}, Lcom/tv91/features/movie/play/b;->q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v71

    .line 133
    sget-object v8, Lcom/tv91/features/movie/play/b;->C:Ljava/util/regex/Pattern;

    invoke-static {v11, v8, v3}, Lcom/tv91/features/movie/play/b;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_36

    .line 134
    invoke-static {v8, v2}, Lc/a/a/a/m2/m0;->D0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 135
    aget-object v8, v2, v6

    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v40

    .line 136
    array-length v6, v2

    const/4 v8, 0x1

    if-le v6, v8, :cond_37

    .line 137
    aget-object v2, v2, v8

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v86

    goto :goto_17

    :cond_36
    const/4 v8, 0x1

    const-wide/16 v40, -0x1

    :cond_37
    :goto_17
    const-wide/16 v42, -0x1

    cmp-long v2, v40, v42

    if-nez v2, :cond_38

    move-wide/from16 v86, v17

    :cond_38
    if-nez v38, :cond_3a

    .line 138
    invoke-virtual {v7}, Ljava/util/TreeMap;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3a

    .line 139
    invoke-virtual {v7}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v2

    const/4 v6, 0x0

    new-array v11, v6, [Lc/a/a/a/e2/t$b;

    .line 140
    invoke-interface {v2, v11}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lc/a/a/a/e2/t$b;

    .line 141
    new-instance v6, Lc/a/a/a/e2/t;

    invoke-direct {v6, v12, v2}, Lc/a/a/a/e2/t;-><init>(Ljava/lang/String;[Lc/a/a/a/e2/t$b;)V

    if-nez v35, :cond_39

    .line 142
    invoke-static {v12, v2}, Lcom/tv91/features/movie/play/b;->d(Ljava/lang/String;[Lc/a/a/a/e2/t$b;)Lc/a/a/a/e2/t;

    move-result-object v35

    :cond_39
    move-object/from16 v38, v6

    .line 143
    :cond_3a
    new-instance v2, Lcom/google/android/exoplayer2/source/hls/v/g$b;

    move-object/from16 v56, v2

    const/16 v73, 0x0

    move-object/from16 v58, v83

    move-wide/from16 v59, v0

    move/from16 v61, v77

    move-wide/from16 v62, v48

    move-object/from16 v64, v38

    move-object/from16 v65, v10

    move-wide/from16 v67, v86

    move-wide/from16 v69, v40

    invoke-direct/range {v56 .. v73}, Lcom/google/android/exoplayer2/source/hls/v/g$b;-><init>(Ljava/lang/String;Lcom/google/android/exoplayer2/source/hls/v/g$d;JIJLc/a/a/a/e2/t;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-long v48, v48, v0

    const-wide/16 v0, -0x1

    cmp-long v2, v40, v0

    if-eqz v2, :cond_43

    add-long v86, v86, v40

    goto/16 :goto_1b

    :cond_3b
    move-object/from16 v55, v1

    move/from16 v80, v6

    move-object/from16 v76, v8

    const/4 v8, 0x1

    const-string v0, "#"

    .line 144
    invoke-virtual {v11, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_42

    .line 145
    invoke-static {v13, v14, v10, v9}, Lcom/tv91/features/movie/play/b;->e(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    add-long v1, v13, v42

    .line 146
    invoke-static {v11, v3}, Lcom/tv91/features/movie/play/b;->A(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    .line 147
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/exoplayer2/source/hls/v/g$d;

    const-wide/16 v13, -0x1

    cmp-long v40, v74, v13

    if-nez v40, :cond_3c

    move-wide/from16 v13, v17

    goto :goto_18

    :cond_3c
    if-eqz v82, :cond_3d

    if-nez v83, :cond_3d

    if-nez v11, :cond_3d

    .line 148
    new-instance v11, Lcom/google/android/exoplayer2/source/hls/v/g$d;

    const-wide/16 v42, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    move-object/from16 v40, v11

    move-object/from16 v41, v6

    move-wide/from16 v44, v36

    invoke-direct/range {v40 .. v47}, Lcom/google/android/exoplayer2/source/hls/v/g$d;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    .line 149
    invoke-virtual {v4, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3d
    move-wide/from16 v13, v36

    :goto_18
    if-nez v38, :cond_3e

    .line 150
    invoke-virtual {v7}, Ljava/util/TreeMap;->isEmpty()Z

    move-result v36

    if-nez v36, :cond_3e

    .line 151
    invoke-virtual {v7}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v8

    move-wide/from16 v56, v1

    const/4 v1, 0x0

    new-array v2, v1, [Lc/a/a/a/e2/t$b;

    .line 152
    invoke-interface {v8, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lc/a/a/a/e2/t$b;

    .line 153
    new-instance v8, Lc/a/a/a/e2/t;

    invoke-direct {v8, v12, v2}, Lc/a/a/a/e2/t;-><init>(Ljava/lang/String;[Lc/a/a/a/e2/t$b;)V

    if-nez v35, :cond_3f

    .line 154
    invoke-static {v12, v2}, Lcom/tv91/features/movie/play/b;->d(Ljava/lang/String;[Lc/a/a/a/e2/t$b;)Lc/a/a/a/e2/t;

    move-result-object v35

    goto :goto_19

    :cond_3e
    move-wide/from16 v56, v1

    const/4 v1, 0x0

    move-object/from16 v8, v38

    .line 155
    :cond_3f
    :goto_19
    new-instance v2, Lcom/google/android/exoplayer2/source/hls/v/g$d;

    if-eqz v83, :cond_40

    move-object/from16 v38, v83

    goto :goto_1a

    :cond_40
    move-object/from16 v38, v11

    :goto_1a
    move-object/from16 v36, v2

    move-object/from16 v37, v6

    move-wide/from16 v40, v84

    move/from16 v42, v77

    move-wide/from16 v43, v78

    move-object/from16 v45, v8

    move-object/from16 v46, v10

    move-object/from16 v47, v0

    move-wide/from16 v48, v13

    move-wide/from16 v50, v74

    move-object/from16 v53, v5

    invoke-direct/range {v36 .. v53}, Lcom/google/android/exoplayer2/source/hls/v/g$d;-><init>(Ljava/lang/String;Lcom/google/android/exoplayer2/source/hls/v/g$d;Ljava/lang/String;JIJLc/a/a/a/e2/t;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    invoke-interface {v15, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-long v48, v78, v84

    .line 156
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v40, -0x1

    cmp-long v0, v74, v40

    if-eqz v0, :cond_41

    add-long v13, v13, v74

    :cond_41
    move-wide/from16 v36, v13

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v38, v8

    move-object v13, v9

    move-wide/from16 v84, v17

    move-wide/from16 v74, v40

    move-wide/from16 v78, v48

    move-object/from16 v8, v76

    move/from16 v6, v80

    move/from16 v2, v89

    move-object/from16 v9, v91

    move-object/from16 v39, v9

    move-object/from16 v14, v92

    const/16 v52, 0x0

    move-object/from16 v76, v12

    move-wide/from16 v80, v56

    goto/16 :goto_5

    :cond_42
    const/4 v1, 0x0

    const-wide/16 v40, -0x1

    :cond_43
    :goto_1b
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, v76

    move/from16 v6, v80

    move/from16 v2, v89

    move-object/from16 v76, v12

    move-wide/from16 v80, v13

    :goto_1c
    move-object/from16 v14, v92

    move-object v13, v9

    move-object v12, v10

    :goto_1d
    move-object/from16 v9, v91

    goto/16 :goto_0

    :cond_44
    move/from16 v89, v2

    move/from16 v80, v6

    move-object/from16 v76, v8

    move-object/from16 v92, v14

    const/4 v1, 0x0

    if-eqz v55, :cond_45

    move-object/from16 v0, v55

    .line 157
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 158
    :cond_45
    new-instance v0, Lcom/google/android/exoplayer2/source/hls/v/g;

    cmp-long v2, v23, v17

    if-eqz v2, :cond_46

    move-object v2, v5

    const/4 v1, 0x1

    goto :goto_1e

    :cond_46
    move-object v2, v5

    :goto_1e
    move-object v5, v0

    move/from16 v6, v80

    move-object/from16 v7, p3

    move-object/from16 v8, v76

    move-wide/from16 v9, v21

    move-wide/from16 v11, v23

    move/from16 v13, v89

    move-object/from16 v3, v92

    move/from16 v14, v25

    move-object v4, v15

    move-wide/from16 v15, v26

    move/from16 v17, v28

    move-wide/from16 v18, v29

    move-wide/from16 v20, v31

    move/from16 v22, v33

    move/from16 v23, v34

    move/from16 v24, v1

    move-object/from16 v25, v35

    move-object/from16 v26, v4

    move-object/from16 v27, v2

    move-object/from16 v28, v54

    move-object/from16 v29, v3

    invoke-direct/range {v5 .. v29}, Lcom/google/android/exoplayer2/source/hls/v/g;-><init>(ILjava/lang/String;Ljava/util/List;JJZIJIJJZZZLc/a/a/a/e2/t;Ljava/util/List;Ljava/util/List;Lcom/google/android/exoplayer2/source/hls/v/g$f;Ljava/util/Map;)V

    return-object v0
.end method

.method private static q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 2
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 3
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "YES"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_0
    return p2
.end method

.method private static r(Ljava/lang/String;Ljava/util/regex/Pattern;D)D
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 2
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 3
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p0

    return-wide p0

    :cond_0
    return-wide p2
.end method

.method private static s(Ljava/lang/String;Ljava/util/regex/Pattern;I)I
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 2
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 3
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_0
    return p2
.end method

.method private static t(Ljava/lang/String;Ljava/util/regex/Pattern;J)J
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 2
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 3
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0

    return-wide p0

    :cond_0
    return-wide p2
.end method

.method private static u(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 2
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lc/a/a/a/m2/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object p2, p0

    check-cast p2, Ljava/lang/String;

    .line 3
    :cond_0
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_2

    if-nez p2, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {p2, p3}, Lcom/tv91/features/movie/play/b;->A(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p2

    :cond_2
    :goto_0
    return-object p2
.end method

.method private static v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, v0, p2}, Lcom/tv91/features/movie/play/b;->u(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static w(Ljava/lang/String;Ljava/util/Map;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/tv91/features/movie/play/b;->P:Ljava/util/regex/Pattern;

    .line 2
    invoke-static {p0, v0, p1}, Lcom/tv91/features/movie/play/b;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    .line 3
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return v0

    :cond_0
    const-string p1, ","

    .line 4
    invoke-static {p0, p1}, Lc/a/a/a/m2/m0;->D0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const-string p1, "public.accessibility.describes-video"

    .line 5
    invoke-static {p0, p1}, Lc/a/a/a/m2/m0;->r([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v0, 0x200

    :cond_1
    const-string p1, "public.accessibility.transcribes-spoken-dialog"

    .line 6
    invoke-static {p0, p1}, Lc/a/a/a/m2/m0;->r([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    or-int/lit16 v0, v0, 0x1000

    :cond_2
    const-string p1, "public.accessibility.describes-music-and-sound"

    .line 7
    invoke-static {p0, p1}, Lc/a/a/a/m2/m0;->r([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    or-int/lit16 v0, v0, 0x400

    :cond_3
    const-string p1, "public.easy-to-read"

    .line 8
    invoke-static {p0, p1}, Lc/a/a/a/m2/m0;->r([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    or-int/lit16 v0, v0, 0x2000

    :cond_4
    return v0
.end method

.method private static x(Ljava/lang/String;)I
    .locals 3

    .line 1
    sget-object v0, Lcom/tv91/features/movie/play/b;->S:Ljava/util/regex/Pattern;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/tv91/features/movie/play/b;->q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    sget-object v2, Lcom/tv91/features/movie/play/b;->T:Ljava/util/regex/Pattern;

    invoke-static {p0, v2, v1}, Lcom/tv91/features/movie/play/b;->q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    or-int/lit8 v0, v0, 0x2

    .line 3
    :cond_1
    sget-object v2, Lcom/tv91/features/movie/play/b;->R:Ljava/util/regex/Pattern;

    invoke-static {p0, v2, v1}, Lcom/tv91/features/movie/play/b;->q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result p0

    if-eqz p0, :cond_2

    or-int/lit8 v0, v0, 0x4

    :cond_2
    return v0
.end method

.method private static y(Ljava/lang/String;)Lcom/google/android/exoplayer2/source/hls/v/g$f;
    .locals 19

    move-object/from16 v0, p0

    .line 1
    sget-object v1, Lcom/tv91/features/movie/play/b;->p:Ljava/util/regex/Pattern;

    const-wide/high16 v2, -0x3c20000000000000L    # -9.223372036854776E18

    .line 2
    invoke-static {v0, v1, v2, v3}, Lcom/tv91/features/movie/play/b;->r(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v4

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v8, 0x412e848000000000L    # 1000000.0

    cmpl-double v1, v4, v2

    if-nez v1, :cond_0

    move-wide v11, v6

    goto :goto_0

    :cond_0
    mul-double v4, v4, v8

    double-to-long v4, v4

    move-wide v11, v4

    .line 3
    :goto_0
    sget-object v1, Lcom/tv91/features/movie/play/b;->q:Ljava/util/regex/Pattern;

    const/4 v4, 0x0

    .line 4
    invoke-static {v0, v1, v4}, Lcom/tv91/features/movie/play/b;->q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v13

    .line 5
    sget-object v1, Lcom/tv91/features/movie/play/b;->s:Ljava/util/regex/Pattern;

    .line 6
    invoke-static {v0, v1, v2, v3}, Lcom/tv91/features/movie/play/b;->r(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v14

    cmpl-double v1, v14, v2

    if-nez v1, :cond_1

    move-wide v14, v6

    goto :goto_1

    :cond_1
    mul-double v14, v14, v8

    double-to-long v14, v14

    .line 7
    :goto_1
    sget-object v1, Lcom/tv91/features/movie/play/b;->t:Ljava/util/regex/Pattern;

    invoke-static {v0, v1, v2, v3}, Lcom/tv91/features/movie/play/b;->r(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v16

    cmpl-double v1, v16, v2

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    mul-double v1, v16, v8

    double-to-long v6, v1

    :goto_2
    move-wide/from16 v16, v6

    .line 8
    sget-object v1, Lcom/tv91/features/movie/play/b;->u:Ljava/util/regex/Pattern;

    .line 9
    invoke-static {v0, v1, v4}, Lcom/tv91/features/movie/play/b;->q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v18

    .line 10
    new-instance v0, Lcom/google/android/exoplayer2/source/hls/v/g$f;

    move-object v10, v0

    invoke-direct/range {v10 .. v18}, Lcom/google/android/exoplayer2/source/hls/v/g$f;-><init>(JZJJZ)V

    return-object v0
.end method

.method private static z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lc/a/a/a/g1;
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Lcom/tv91/features/movie/play/b;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    return-object p2

    .line 2
    :cond_0
    new-instance p2, Lc/a/a/a/g1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t match "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " in "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public bridge synthetic a(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/tv91/features/movie/play/b;->i(Landroid/net/Uri;Ljava/io/InputStream;)Lcom/google/android/exoplayer2/source/hls/v/h;

    move-result-object p1

    return-object p1
.end method

.method public i(Landroid/net/Uri;Ljava/io/InputStream;)Lcom/google/android/exoplayer2/source/hls/v/h;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 2
    new-instance p2, Ljava/util/ArrayDeque;

    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    .line 3
    :try_start_0
    invoke-static {v0}, Lcom/tv91/features/movie/play/b;->b(Ljava/io/BufferedReader;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 4
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 5
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "#EXT-X-STREAM-INF"

    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 8
    invoke-interface {p2, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 9
    new-instance v1, Lcom/tv91/features/movie/play/b$a;

    invoke-direct {v1, p2, v0}, Lcom/tv91/features/movie/play/b$a;-><init>(Ljava/util/Queue;Ljava/io/BufferedReader;)V

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tv91/features/movie/play/b;->o(Lcom/tv91/features/movie/play/b$a;Ljava/lang/String;)Lcom/google/android/exoplayer2/source/hls/v/f;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    invoke-static {v0}, Lc/a/a/a/m2/m0;->m(Ljava/io/Closeable;)V

    return-object p1

    :cond_1
    :try_start_1
    const-string v2, "#EXT-X-TARGETDURATION"

    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "#EXT-X-MEDIA-SEQUENCE"

    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "#EXTINF"

    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "#EXT-X-KEY"

    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "#EXT-X-BYTERANGE"

    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "#EXT-X-DISCONTINUITY"

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "#EXT-X-DISCONTINUITY-SEQUENCE"

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "#EXT-X-ENDLIST"

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    .line 19
    :cond_2
    invoke-interface {p2, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 20
    :cond_3
    :goto_1
    invoke-interface {p2, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 21
    iget-object v1, p0, Lcom/tv91/features/movie/play/b;->Z:Lcom/google/android/exoplayer2/source/hls/v/f;

    iget-object v2, p0, Lcom/tv91/features/movie/play/b;->a0:Lcom/google/android/exoplayer2/source/hls/v/g;

    new-instance v3, Lcom/tv91/features/movie/play/b$a;

    invoke-direct {v3, p2, v0}, Lcom/tv91/features/movie/play/b$a;-><init>(Ljava/util/Queue;Ljava/io/BufferedReader;)V

    .line 22
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    .line 23
    invoke-static {v1, v2, v3, p1}, Lcom/tv91/features/movie/play/b;->p(Lcom/google/android/exoplayer2/source/hls/v/f;Lcom/google/android/exoplayer2/source/hls/v/g;Lcom/tv91/features/movie/play/b$a;Ljava/lang/String;)Lcom/google/android/exoplayer2/source/hls/v/g;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    invoke-static {v0}, Lc/a/a/a/m2/m0;->m(Ljava/io/Closeable;)V

    return-object p1

    :cond_4
    invoke-static {v0}, Lc/a/a/a/m2/m0;->m(Ljava/io/Closeable;)V

    .line 25
    new-instance p1, Lc/a/a/a/g1;

    const-string p2, "Failed to parse the playlist, could not identify any tags."

    invoke-direct {p1, p2}, Lc/a/a/a/g1;-><init>(Ljava/lang/String;)V

    throw p1

    .line 26
    :cond_5
    :try_start_2
    new-instance p2, Lc/a/a/a/j2/r0;

    const-string v1, "Input does not start with the #EXTM3U header."

    invoke-direct {p2, v1, p1}, Lc/a/a/a/j2/r0;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    .line 27
    invoke-static {v0}, Lc/a/a/a/m2/m0;->m(Ljava/io/Closeable;)V

    .line 28
    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method
