package com.codecool.BooksTutorial.controller

import com.codecool.BooksTutorial.model.Book
import com.codecool.BooksTutorial.repository.BookRepository
import org.springframework.web.bind.annotation.*

@RestController
class BookController(val repository: BookRepository){

    @PostMapping("/book")
    fun addBooks(@RequestBody book: Book){
        repository.save(book)
    }

    @GetMapping("/book")
    fun getAllBooks() = repository.findAll().toList();

    @GetMapping("/book/{title}")
    fun getBookByTitle(@PathVariable("title")title: String) = repository.findByTitle(title)

}