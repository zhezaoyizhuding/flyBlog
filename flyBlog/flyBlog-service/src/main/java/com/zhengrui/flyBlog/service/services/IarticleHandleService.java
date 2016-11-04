package com.zhengrui.flyBlog.service.services;

import java.util.List;

import com.zhengrui.flyBlog.model.body.Article;
/*
 * 该层主要进行事务处理，可将多条sql操作封装在一个函数中，或者對存入前和取出後的數據進行預處理，緩存操作也在該層中進行
*/
public interface IarticleHandleService {
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
