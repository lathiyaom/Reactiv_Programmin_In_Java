package com.app.ReactivProgramminApp.BookServices;

import com.app.ReactivProgramminApp.Entity.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServicesI {

    public Mono<Book>createBook(Book book);
    public Flux<Book> getAll();
    public Mono<Book> get(int id);
    public Mono<Book>update(Book book,int id);
    public Mono<Book>delete(int id);
    public Flux<Book> search(String query);
}
