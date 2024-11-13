package com.spring.AuthorSpecification.AuthorSpecification.Controller;

import com.spring.AuthorSpecification.AuthorSpecification.Entity.Author;
import com.spring.AuthorSpecification.AuthorSpecification.Service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AuthorController {

    private AuthorService authorService;

    @PostMapping("/authors/filter")
    @ResponseStatus(HttpStatus.OK)
    public List<Author> filterAuthors(@RequestBody RequestPojo requestPojo) {
        return authorService.filterAuthors(requestPojo);
    }
}




