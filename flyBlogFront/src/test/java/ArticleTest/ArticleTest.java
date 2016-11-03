package ArticleTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhengrui.flyBlog.model.body.Article;
import com.zhengrui.flyBlog.facade.services.IarticleHandleService;

@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class ArticleTest extends AbstractJUnit4SpringContextTests{
	
	@Autowired
	private IarticleHandleService articlehandle;
	@Test
	public void addTest(){
		Article article=new Article();
		article.setArticleId("w123");
		article.setAuthor("mazhang");
		article.setContent("如上图所示，红色的部分是冲突代码：theirs表示当前服务器端最新的代码，Mine表示自己修改后的代码，Merged表示合并后的代码。点击红色后右键选择："
	     	+"use this text block就可以将该部分代码作为合并后的代码/n接下来再说说由于冲突导致重要代码被覆盖的情况。冲突发生时如果采取的措施不对可能会导致部分代码丢失，"
	        +"如果想要还原之前的代码也很容易。选择文件->右键选择show log在这里面你可以看见之前提交的所有版本，找到你想要恢复的版本右键选择revert to this version 就可以恢复了.");
		article.setLanguage("文学");
		article.setTitle("我的大学");
		Date date=new Date();
		DateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=dateformat.format(date);
		article.setDate(time);
		articlehandle.addArticle(article);
	}
	@Test
	public void getContentTest(){
		Article article=articlehandle.selectContentByTitle("python之路");
		System.out.println(article.getContent());
	}
}
