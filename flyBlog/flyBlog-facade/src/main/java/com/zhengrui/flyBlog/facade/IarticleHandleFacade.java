package com.zhengrui.flyBlog.facade;

import java.util.List;

import com.zhengrui.flyBlog.model.body.Article;
/*
 * 
*/
public interface IarticleHandleFacade {
	//返回单类文章列表
	public List<Article> selectTitleByLang(String lang);
	//根据文章标题返回文章内容
	public Article selectContentByTitle(String title);
	//返回某品类的第一篇文章
	public Article getFirstTitleBylang(String lang);
	
	//写入文章
	public void addArticle(Article article);
	
	//根据文章标题删除文章
	public void deleteArticleByTitle(String title);
	
	//根据标题更新文章
	public Article updateArticleByTitle(Article article);
}
