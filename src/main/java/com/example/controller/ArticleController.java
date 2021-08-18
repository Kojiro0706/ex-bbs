package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Article;
import com.example.repository.ArticleRepository;


/**
 * 記事情報とコメント情報を操作するコントローラークラス.
 * 
 * @author kojiro0706
 *
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ArticleRepository articleRepository;
	
	
	/**
	 * 記事情報を一覧で表示する.
	 * 
	 * @param model
	 * @return 記事情報
	 */
	@RequestMapping("")
	public String index(Model model) {
		
		List<Article> articleList = articleRepository.findAll();
		
		model.addAttribute("articleList", articleList);
		
		return "article-list";
	}
	
}
