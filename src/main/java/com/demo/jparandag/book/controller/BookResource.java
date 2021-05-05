package com.demo.jparandag.book.controller;

import com.demo.jparandag.book.model.Book;
import com.demo.jparandag.book.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.NoSuchElementException;

@Slf4j
@RestController
@RequestMapping("/book-api/v1")
public class BookResource {

    private BookService bookService;

    public BookResource(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/books")
    public ResponseEntity<Book> saveBook(@RequestBody Book book) throws URISyntaxException {
        Book newBook = bookService.registerBook(book);
        log.info("creating new book...");
        return ResponseEntity.created(new URI(newBook.getId().toString())).body(newBook);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        List<Book> books = bookService.retrieveAllBooks();
        log.info("Getting {} books from DB ", books.size());
        return books;
    }

    @GetMapping("/books/{isbn}")
    public Book getBodyById(@PathVariable String isbn){
        log.info("Getting the book with ISBN -> {}", isbn);
        return bookService.retrieveBookByIsbn(isbn)
                .orElseThrow(() -> new NoSuchElementException("Book doesn't exists for isbn :" + isbn));
    }

}
