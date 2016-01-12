package com.gopersist.demo.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Spring Repository中，表名字段名必须是小写，并由下划线分隔单词
 * 
 * @author leo
 *
 */
@Entity
@Table(name="app_blog", uniqueConstraints={@UniqueConstraint(columnNames={"blog_title"})})
public class Blog implements Serializable {
	private static final long serialVersionUID = 4183202804497988605L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="blog_title", nullable = false)
	private String blogTitle;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
}
