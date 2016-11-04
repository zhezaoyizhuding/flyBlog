package java.com.zhengrui.flyBlog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.zhengrui.flyBlog.dao.articleHandle.IArticleHandle;
import com.zhengrui.flyBlog.model.body.Article;
import com.zhengrui.flyBlog.service.services.IarticleHandleService;

@Component
public class articleHandleServiceImpl implements IarticleHandleService{

	@Autowired
	private IArticleHandle articlehandle;
	//根据文章标题返回文章内容
	public Article selectContentByTitle(String title){
	    return articlehandle.selectContentByTitle(title);
	}
	//返回单类文章列表
	public List<Article> selectTitleByLang(String lang){
		return articlehandle.selectTitleByLang(lang);
	}
	//返回某品类的第一篇文章
	public Article getFirstTitleBylang(String lang){
		return articlehandle.getFirstTitleBylang(lang);
	}
		
	//写入文章
	public void addArticle(Article article){
		articlehandle.addArticle(article);
	}
		
	//根据文章标题删除文章
	public void deleteArticleByTitle(String title){
		articlehandle.deleteArticleByTitle(title);
	}
		
	//根据标题更新文章
	public Article updateArticleByTitle(Article article){
		return articlehandle.updateArticleByTitle(article);
	}
	
}
