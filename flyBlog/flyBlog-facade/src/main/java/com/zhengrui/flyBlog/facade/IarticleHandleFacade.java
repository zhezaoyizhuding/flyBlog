package com.zhengrui.flyBlog.facade;

import java.util.List;

import com.zhengrui.flyBlog.model.body.Article;
/*
 * 
*/
public interface IarticleHandleFacade {
	//根据文章标题返回文章内容
	public Article selectContentByTitle(String title);
	//写入文章
	public void addArticle(Article article);
}
