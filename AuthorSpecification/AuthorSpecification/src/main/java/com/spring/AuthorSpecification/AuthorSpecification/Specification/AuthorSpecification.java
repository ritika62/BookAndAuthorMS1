package com.spring.AuthorSpecification.AuthorSpecification.Specification;

import com.spring.AuthorSpecification.AuthorSpecification.Controller.RequestPojo;
import com.spring.AuthorSpecification.AuthorSpecification.Entity.Author;
import org.springframework.data.jpa.domain.Specification;

public class AuthorSpecification {

    public static Specification<Author> hasAuthorName(String authorName) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("authorName"), authorName);
    }

    public static Specification<Author> emailEqualTo(String email) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("email"), email);
    }

    public static Specification<Author> hasNationality(String nationality) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("nationality"), nationality);
    }

    public static Specification<Author> idEqualTo(Long id) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("id"), id);
    }


    public static Specification<Author> filterAuthors(RequestPojo requestPojo) {
        Specification<Author> spec = Specification.where(null);

        if (requestPojo.getAuthorName() != null) {
            spec = spec.or(AuthorSpecification.hasAuthorName(requestPojo.getAuthorName()));
        }
        if (requestPojo.getEmail() != null) {
            spec = spec.or(AuthorSpecification.emailEqualTo(requestPojo.getEmail()));
        }

        if (requestPojo.getNationality() != null) {
            spec = spec.and(AuthorSpecification.hasNationality(requestPojo.getNationality()));
        }

        return spec;
    }

}



