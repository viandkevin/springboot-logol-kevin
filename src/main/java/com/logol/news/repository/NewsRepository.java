package com.logol.news.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logol.news.model.News;

@Repository
public interface NewsRepository extends JpaRepository<News, String> {

	void delete(News newsDeleted);
	 
    List<News> findAll();
 
    Optional<News> findOne(Integer id);
 
    News save(News persisted);

}
