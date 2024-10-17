package com.app.ReactivProgramminApp;

import com.app.ReactivProgramminApp.Entity.Book;
import com.app.ReactivProgramminApp.Respository.repo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class RepositoryTest {
    private repo repo1;

    @Autowired
    public RepositoryTest(repo repo1) {
        this.repo1 = repo1;
    }
    @Test
    public void findMthodTest()
    {
        System.out.println("dsovnn");
        Mono<Book> byName =repo1.findByName("ok1");
        StepVerifier.create(byName)
                .expectNextCount(1).verifyComplete();
    }
    @Test
    public void getAllNullBook()
    {
        System.out.println("dv");
        Flux<Book> ok = repo1.getAllNullBook("ok");
        StepVerifier.create(ok)
                .expectNextCount(3)
                .verifyComplete();
        ok.subscribe(data->{
            System.out.println(data.getAuthor());
        });
    }
}
