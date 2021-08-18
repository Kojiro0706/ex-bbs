package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.domain.Article;



/**
 * 記事の情報を操作するリポジトリクラス.
 * 
 * @author kojiro0706
 *
 */
@Repository
public class ArticleRepository {

	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<Article> ARTICLE_ROW_MAPPER = new BeanPropertyRowMapper<>(Article.class);
	
	
	/**
	 * 全件検索をおこなう.
	 * 
	 * @return 記事情報
	 */
	public List<Article> findAll(){
		String sql = "SELECT id, name, content, article_id FROM articles ORDER BY id";
		
		List<Article> articleList = template.query(sql, ARTICLE_ROW_MAPPER);
		
		return articleList;
	}
}