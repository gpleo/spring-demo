package com.gopersist.demo.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gopersist.demo.jpa.entity.Blog;
import com.gopersist.demo.jpa.service.BlogService;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@Controller
public class App {
	@Autowired
	private BlogService blogService;
	
	@RequestMapping({})
    @ResponseBody
    Page<Blog> home(
    		@RequestParam(defaultValue="0") int page,
    		@RequestParam(defaultValue="10") int size
    		) {
		Page<Blog> blogs = this.blogService.findAll(new PageRequest(page, size));
        return blogs;
    }
	
	@RequestMapping({"/create"})
    @ResponseBody
	Blog create(@RequestParam(defaultValue="title") String title) {
		Blog blog = new Blog();
		blog.setBlogTitle(title);
		this.blogService.create(blog);
		return blog;
	}
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
