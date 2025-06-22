package com.mengzhou.controller;

import com.mengzhou.entities.Book;
import com.mengzhou.service.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

import static com.mengzhou.entities.Book.*;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @QueryMapping
    public Book bookById(@Argument String id) {
        return bookService.getBookById(id);
    }

    @QueryMapping
    public List<Book> allBooks() {
        return bookService.getAllBooks();
    }

    @MutationMapping
    public Book addBook(@Argument String id, @Argument String title, @Argument String author) {
        Book newBook =  Book.builder().id(id).title(title).author(author).build();
        System.out.println(newBook);
        return newBook;
    }
}