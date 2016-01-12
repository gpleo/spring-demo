package com.gopersist.demo.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gopersist.demo.jpa.dao.BlogDao;
import com.gopersist.demo.jpa.entity.Blog;
import com.gopersist.demo.jpa.service.BlogService;

@Service("blogService")
public class BlogServiceImpl implements BlogService{
	private final BlogDao blogDao;
	
	@Autowired
	public BlogServiceImpl(BlogDao blogDao) {
		this.blogDao = blogDao;
	}
	
	@Override
	public Page<Blog> findAll(Pageable pageable) {
		return this.blogDao.findAll(pageable);
	}

	@Override
	public Blog findByBlogTitle(String blogTitle) {
		return this.blogDao.findByBlogTitle(blogTitle);
	}

	@Override
	public Blog create(Blog blog) {
		return this.blogDao.save(blog);
	}
}
