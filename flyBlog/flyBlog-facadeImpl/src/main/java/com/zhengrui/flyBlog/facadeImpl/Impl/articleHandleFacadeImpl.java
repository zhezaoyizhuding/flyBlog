package com.zhengrui.flyBlog.facadeImpl.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.zhengrui.flyBlog.dao.articleHandle.IArticleHandle;
import com.zhengrui.flyBlog.facade.IarticleHandleFacade;
import com.zhengrui.flyBlog.model.body.Article;

@Service
public class articleHandleFacadeImpl implements IarticleHandleFacade{
   
	@Autowired
	IArticleHandle athandle;
	//返回单类文章列表
	public List<Article> selectTitleByLang(String lang){
		return athandle.selectTitleByLang(lang);
	}
	//根据文章标题返回文章内容
	public Article selectContentByTitle(String title){
		return athandle.selectContentByTitle(title);
	}
	//返回某品类的第一篇文章
	public Article getFirstTitleBylang(String lang){
		return athandle.getFirstTitleBylang(lang);
	}
	
	//写入文章
	public void addArticle(Article article){
		athandle.addArticle(article);
	}
	
	//根据文章标题删除文章
	public void deleteArticleByTitle(String title){
		athandle.deleteArticleByTitle(title);
	}
	
	//根据标题更新文章
	public Article updateArticleByTitle(Article article){
		return athandle.updateArticleByTitle(article);
	}
}
