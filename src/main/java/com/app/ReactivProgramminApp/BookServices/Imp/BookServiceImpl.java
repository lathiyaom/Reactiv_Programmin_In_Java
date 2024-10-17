package com.app.ReactivProgramminApp.BookServices.Imp;

import com.app.ReactivProgramminApp.BookServices.ServicesI;
import com.app.ReactivProgramminApp.Entity.Book;
import com.app.ReactivProgramminApp.Respository.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class BookServiceImpl implements ServicesI {
    @Autowired
    private repo repo1;

    @Override
    public Mono<Book> createBook(Book book) {
        System.out.println(Thread.currentThread().getName());
        Mono<Book> save = repo1.save(book);
        return save;
    }

    @Override
    public Flux<Book> getAll() {
        Flux<Book> all = repo1.findAll().delayElements(Duration.ofSeconds(2)).log();
        return all;
    }

    @Override
    public Mono<Book> get(int id) {
        Mono<Book> byId = repo1.findById(id);
        return byId;
    }

    @Override
    public Mono<Book> update(Book book, int id) {
        Mono<Book> old = repo1.findById(id);
        return old.flatMap(data->{
            data.setAuthor(book.getAuthor());
            data.setDescriptions(book.getDescriptions());
            data.setName(book.getName());
            data.setPublisher(book.getPublisher());
            return repo1.save(data);
        });
    }

    @Override
    public Mono<Book> delete(int id) {
        Mono<Book> byId = repo1.findById(id);
        repo1.deleteById(id);
        return byId;
    }

    @Override
    public Flux<Book> search(String query) {
        return null;
    }
}
