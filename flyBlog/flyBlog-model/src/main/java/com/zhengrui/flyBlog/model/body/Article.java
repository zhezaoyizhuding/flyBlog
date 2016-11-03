package com.zhengrui.flyBlog.model.body;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable{
        
	private static final long serialVersionUID = 14555555555555L;
	
	    String articleId;
        String title;
        String author;
        String content;
        String language;
        String date;
		public String getArticleId() {
			return articleId;
		}
		public void setArticleId(String articleId) {
			this.articleId = articleId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
       
}
