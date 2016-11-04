package com.zhengrui.flyBlog.facadeImpl.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.zhengrui.flyBlog.dao.articleHandle.IArticleHandle;
import com.zhengrui.flyBlog.facade.IarticleHandleFacade;
import com.zhengrui.flyBlog.model.body.Article;
import com.zhengrui.flyBlog.service.services.IarticleHandleService;

@Component
public class articleHandleFacadeImpl implements IarticleHandleFacade{

	@Autowired
	private IarticleHandleService ahservice;
	//根据文章标题返回文章内容
	public Article selectContentByTitle(String title){ 
		return ahservice.selectContentByTitle(title);
	}
	//写入文章
	public void addArticle(Article article){
		ahservice.addArticle(article);
	}
}
