package com.mengzhou.service;

import com.mengzhou.entities.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService {
    private final Map<String, Book> books = new HashMap<>();

    public BookService() {
        Book book = new Book();
        book.setId("1");
        book.setTitle("1984");
        book.setAuthor("George Orwell");
        books.put(book.getId(), book);
    }

    public Book getBookById(String id) {
        return books.get(id);
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }
}