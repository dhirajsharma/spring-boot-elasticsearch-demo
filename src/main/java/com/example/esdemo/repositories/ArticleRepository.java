package com.example.esdemo.repositories;

import com.example.esdemo.documents.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by skpat_000 on 26-06-2016.
 */
public interface ArticleRepository extends ElasticsearchRepository<Article, String> {

    Page<Article> findByTitle(String title, Pageable pageable);

    @Query("{\"bool\": {\"must\": [{\"match\": {\"title\": \"?0\"}}]}}")
    Page<Article> findByAuthorsNameUsingCustomQuery(String title, Pageable pageable);
}