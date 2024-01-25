package com.foticc.demo.graphql.controller;

import com.foticc.demo.graphql.records.Author;
import com.foticc.demo.graphql.records.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("greeting")
public class GreetingController {


    @QueryMapping("bookById")
    public Book hello(@Argument String id) {
        System.out.println("id = " + id);
        return Book.getById(id);
    }

    @QueryMapping("allBook")
    public List<Book> all() {
        return Book.allBook();
    }


    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.authorId());
    }

}
