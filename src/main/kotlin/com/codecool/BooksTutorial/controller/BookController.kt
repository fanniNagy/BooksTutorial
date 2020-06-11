package com.codecool.BooksTutorial.controller

import com.codecool.BooksTutorial.model.Book
import com.codecool.BooksTutorial.repository.BookRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController(val repository: BookRepository){

    @PostMapping("/book")
    fun addBooks(@RequestBody book: Book){
        repository.save(book)
    }

    @GetMapping("/book")
    fun getAllBooks() = repository.findAll().toList();

}