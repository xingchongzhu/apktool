package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class InetSocketAddressSerializer extends StdScalarSerializer<InetSocketAddress> {
    public InetSocketAddressSerializer() {
        super(InetSocketAddress.class);
    }

    public void serialize(InetSocketAddress inetSocketAddress, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String str;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int indexOf = hostName.indexOf(47);
        if (indexOf >= 0) {
            if (indexOf == 0) {
                if (address instanceof Inet6Address) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[");
                    sb.append(hostName.substring(1));
                    sb.append("]");
                    str = sb.toString();
                } else {
                    str = hostName.substring(1);
                }
                hostName = str;
            } else {
                hostName = hostName.substring(0, indexOf);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hostName);
        sb2.append(":");
        sb2.append(inetSocketAddress.getPort());
        jsonGenerator.writeString(sb2.toString());
    }

    public void serializeWithType(InetSocketAddress inetSocketAddress, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId((Object) inetSocketAddress, InetSocketAddress.class, JsonToken.VALUE_STRING));
        serialize(inetSocketAddress, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }
}
