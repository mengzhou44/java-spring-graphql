package com.mengzhou.entities;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Book {
    private String id;
    private String title;
    private String author;

    // getters and setters
}