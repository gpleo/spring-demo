package com.gopersist.demo.jpa.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gopersist.demo.jpa.entity.Blog;

public interface BlogService {
	Page<Blog> findAll(Pageable pageable);
	Blog findByBlogTitle(String blogTitle);
	Blog create(Blog blog);
}
