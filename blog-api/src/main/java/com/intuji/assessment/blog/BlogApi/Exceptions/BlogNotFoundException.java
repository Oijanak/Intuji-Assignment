package com.intuji.assessment.blog.BlogApi.Exceptions;



public class BlogNotFoundException extends RuntimeException{
    //Custom BlogNotFound Exception
    public BlogNotFoundException(int id){
        super("Blog not found of id "+id);
    }
}
