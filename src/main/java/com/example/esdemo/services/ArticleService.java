package com.example.esdemo.services;

import com.example.esdemo.documents.Article;
import com.example.esdemo.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by skpat_000 on 26-06-2016.
 */
@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @PostConstruct
    public void createDoc() {
        Article article = new Article();
        article.setTitle("Howdy Sanjay!");
        articleRepository.save(article);
    }
}
