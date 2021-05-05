package com.demo.jparandag.book.service;

import com.demo.jparandag.book.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    Book registerBook(Book person);

    List<Book> retrieveAllBooks();

    Optional<Book> retrieveBookByIsbn(String isbn);
}
