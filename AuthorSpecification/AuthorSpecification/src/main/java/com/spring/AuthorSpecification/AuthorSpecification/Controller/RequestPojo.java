package com.spring.AuthorSpecification.AuthorSpecification.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestPojo {
    private String authorName;
    private String email;
    private String nationality;
    }
