package Reactive;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;


public class FluxInReactor {
    
    Flux<String> emptyFlux() {
        return Flux.empty();
    }

    Flux<String> fooBarFluxFromValues() {
        return Flux.just("foo", "bar");
    }

    Flux<String> fooBarFluxFromList() {
        List<String> list = Arrays.asList("foo", "bar");
        return Flux.fromIterable(list);
    }

    Flux<String> errorFlux() {
        return Flux.error(IllegalStateException::new);
    }

    Flux<Long> counter() {
        return Flux.interval(Duration.ofMillis(100)).take(10);
    }
}
