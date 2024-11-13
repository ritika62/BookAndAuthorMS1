package com.spring.AuthorSpecification.AuthorSpecification.Dao;

import com.spring.AuthorSpecification.AuthorSpecification.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AuthorDao extends JpaRepository<Author,Long>, JpaSpecificationExecutor<Author> {
}
