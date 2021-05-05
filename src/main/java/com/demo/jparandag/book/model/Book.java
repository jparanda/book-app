package com.demo.jparandag.book.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"book\"")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_generator")
    @SequenceGenerator(name = "book_generator", sequenceName = "book_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "author")
    private String author;

    @Column(name = "topic")
    private String topic;

    @Column(name = "total_pages")
    private String totalPages;

    @Column(name = "price")
    private String price;

    @Column(name = "publishDate")
    private String publishDate;

    @Column(name = "registered_on")
    @CreationTimestamp
    private LocalDateTime registeredOn;

}
