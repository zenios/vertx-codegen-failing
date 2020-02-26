package org.example;

import java.util.UUID;
import java.util.function.Function;

public class MyMappers {
    public static final Function<UUID, String> SERIALIZER = UUID::toString;
    public static final Function<String, UUID> DESERIALIZER = UUID::fromString;
}
