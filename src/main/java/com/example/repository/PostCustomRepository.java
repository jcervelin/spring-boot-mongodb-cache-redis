package com.example.repository;

import com.example.model.Post;

import java.util.List;

public interface PostCustomRepository<Post, String> {

    //@Query("{ 'shares' : { $gte: 500} }, $orderby : { shares: 1 }")
    List<com.example.model.Post> getTopPosts();

    //@Query("{ 'shares' : { $gte: 500}, 'author.name' : ?0 }, $orderby : { shares: 1 }")
    List<com.example.model.Post> getTopPostsByName(java.lang.String name);

}
