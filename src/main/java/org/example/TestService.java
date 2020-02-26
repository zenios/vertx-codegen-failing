package org.example;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.UUID;

@VertxGen
public interface TestService {
    @Fluent
    TestService process(UUID id, Handler<AsyncResult<Void>> resultHandler);
}
