package com.app.ReactivProgramminApp.BookServices.Controller;


import com.app.ReactivProgramminApp.BookServices.ServicesI;
import com.app.ReactivProgramminApp.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.processing.Generated;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private ServicesI servicesI;

    @PostMapping("/add")
    public Mono<Book>save(@RequestBody Book book)
    {
        return servicesI.createBook(book);
    }
    @GetMapping
    public Flux<Book>getAll()
    {
        return servicesI.getAll();
    }
    @GetMapping("/{bookid}")
    public Mono<Book> getAbook(@PathVariable int bookid)
    {
            return servicesI.get(bookid);
    }
    @DeleteMapping("/{bookid}")
    public Mono<Book>delete(@PathVariable int bookid)
    {
        return servicesI.delete(bookid);
    }
    @PutMapping("/{bookid}")
    public Mono<Book>update(@RequestBody Book book,@PathVariable int bookid)
    {
        return servicesI.update(book,bookid);
    }
}
