package com.zhengrui.flyBlog.facadeImpl.Impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
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
	public String selectContentByTitle(String title){
		Article article=athandle.selectContentByTitle(title);
		String url=article.getContent();
		String context="";
		try{
			File filename=new File(url);
			InputStreamReader reader=new InputStreamReader(new FileInputStream(filename));
			@SuppressWarnings("resource")
			BufferedReader br=new BufferedReader(reader);
			String line="";
			line=br.readLine();
			context=line;
			System.out.println(line);
			System.out.println(context);
			while(line!=null){
				line=br.readLine();
				context+=line;
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("读取文件失败");
		}
		return context;	
	}
	//返回某品类的第一篇文章
	public Article getFirstTitleBylang(String lang){
		return athandle.getFirstTitleBylang(lang);
	}
	
	//写入文章
	public void addArticle(Article article){
		try{
			String url = "D:\\gitrepo\\article\\"+article.getArticleId();
			File filename= new File(url);
			BufferedWriter out = new BufferedWriter(new FileWriter(filename));
			out.write(article.getContent());
			out.flush();
			out.close();
			article.setContent(url);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("写入文件失败");
		}
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
