package com.spring.AuthorSpecification.AuthorSpecification.Service;

import com.spring.AuthorSpecification.AuthorSpecification.Controller.RequestPojo;
import com.spring.AuthorSpecification.AuthorSpecification.Dao.AuthorDao;
import com.spring.AuthorSpecification.AuthorSpecification.Entity.Author;
import com.spring.AuthorSpecification.AuthorSpecification.Specification.AuthorSpecification;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {

    private  final AuthorDao authorDao;

    public List<Author> filterAuthors(RequestPojo requestPojo) {
        Specification<Author> spec = AuthorSpecification.filterAuthors(requestPojo);

        return authorDao.findAll(spec);
    }
}



