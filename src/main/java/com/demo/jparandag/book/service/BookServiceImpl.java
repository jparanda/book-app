package com.demo.jparandag.book.service;

import com.demo.jparandag.book.model.Book;
import com.demo.jparandag.book.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Override
    public Book registerBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> retrieveAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> retrieveBookByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }
}
