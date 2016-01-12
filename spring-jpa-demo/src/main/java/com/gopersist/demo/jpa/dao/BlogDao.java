package com.gopersist.demo.jpa.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.gopersist.demo.jpa.entity.Blog;

public interface BlogDao extends Repository<Blog, Long>{
	Page<Blog> findAll(Pageable pageable);
	Blog findByBlogTitle(String blogTitle);
	Blog save(Blog blog);
}
