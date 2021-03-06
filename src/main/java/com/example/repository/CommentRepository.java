package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Comment;

@Repository
public class CommentRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;

	private static final RowMapper<Comment> COMMENT_ROW_MAPPER = new BeanPropertyRowMapper<>(Comment.class);

	/**
	 * 記事IDに紐づいたコメントを検索する.
	 * 
	 * @param articleId
	 * @return コメント情報
	 */
	public List<Comment> findByArticleId(int articleId) {

		String sql = "SELECT id, name, content,article_id FROM comments"
				+ " WHERE article_id = :articleId ORDER BY id DESC;";

		SqlParameterSource param = new MapSqlParameterSource().addValue("articleId", articleId);

		return template.query(sql, param, COMMENT_ROW_MAPPER);
	}

	/**
	 * コメント情報を挿入する.
	 * 
	 * @param comment
	 */
	public void insert(Comment comment) {
		SqlParameterSource param = new BeanPropertySqlParameterSource(comment);
		String sql = "INSERT INTO comments(name, content, article_id)VALUES(:name,:content,:articleId)";
		template.update(sql, param);
	}

	/**
	 * コメント情報を削除する.
	 * 
	 * @param articleId
	 */
	public void deleteByArticleId(int articleId) {
		String sql = "DELETE FROM comments WHERE article_id = :articleId";
		
		SqlParameterSource param = new MapSqlParameterSource().addValue("articleId", articleId);

		template.update(sql, param);
	}
	
	
}
