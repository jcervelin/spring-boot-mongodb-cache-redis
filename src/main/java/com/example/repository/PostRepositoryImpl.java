package com.example.repository;

import com.example.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public class PostRepositoryImpl implements PostCustomRepository{

    private MongoTemplate mongoTemplate;

    @Autowired
    public PostRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }


    @Override
    public List<Post> getTopPosts() {
        Query query = new Query();
        query.addCriteria(Criteria.where("shares").gt(500));
        query.with(new Sort(Sort.Direction.DESC, "shares"));
        List<Post> posts = mongoTemplate.find(query,Post.class);
        return posts;
    }

    @Override
    public List<Post> getTopPostsByName(String name) {
        Query query = new Query();
        query.addCriteria(Criteria
                .where("shares").gt(500)
                .where("author.name").regex(name));
        query.with(new Sort(Sort.Direction.DESC, "shares"));
        List<Post> posts = mongoTemplate.find(query,Post.class);
        return posts;    }
}
