package com.app.ReactivProgramminApp.Respository;


import com.app.ReactivProgramminApp.Entity.Book;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface repo extends ReactiveCrudRepository<Book,Integer> {
    public Mono<Book>findByName(String name);

    @Query("select * from `bookdetails` where name = :name")
    public Flux<Book>getAllNullBook(String name);

}
