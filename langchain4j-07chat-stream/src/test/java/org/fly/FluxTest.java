package org.fly;

import lombok.val;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class FluxTest {

    @Test
    public void test001() {
        Flux<Integer> flux = Flux.just(1, 2, 3, 4, 5);
        flux.subscribe(System.out::println);
    }

    @Test
    public void test002() {
        val just = Flux.just("Hello", "World", "!");
        System.out.println(just);
    }
}
