.class Lcom/tv91/utils/Jsons$DateDeserializer;
.super Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;
.source "Jsons.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tv91/utils/Jsons;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DateDeserializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer<",
        "Ljava/util/Date;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    const-class v0, Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;-><init>(Ljava/lang/Class;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tv91/utils/Jsons$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tv91/utils/Jsons$DateDeserializer;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JsonProcessingException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/tv91/utils/Jsons$DateDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method public deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/util/Date;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getValueAsString()Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-static {p1}, Lcom/tv91/utils/a;->c(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p2, "yyyy/MM/dd"

    .line 4
    invoke-static {p1, p2}, Lcom/tv91/utils/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object p2

    :cond_0
    return-object p2
.end method
