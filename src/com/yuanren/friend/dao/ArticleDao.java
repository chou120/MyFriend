package com.yuanren.friend.dao;

import com.yuanren.friend.pojo.Article;

public interface ArticleDao {


    void addArticle(Article  article);

    void updateArticle(Article  article);

    //根据标题删除帖子
    void  deleteArticle(String  title);



}
