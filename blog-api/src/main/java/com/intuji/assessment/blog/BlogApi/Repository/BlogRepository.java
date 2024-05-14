package com.intuji.assessment.blog.BlogApi.Repository;

import com.intuji.assessment.blog.BlogApi.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
//JPA repository for blog table for communating with blog table
public interface BlogRepository extends JpaRepository<Blog,Integer> {
}
