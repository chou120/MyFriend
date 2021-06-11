package com.yuanren.friend.dao.DaoService;

import com.yuanren.friend.dao.ArticleDao;
import com.yuanren.friend.dao.MemberDao;
import com.yuanren.friend.pojo.Article;
import com.yuanren.friend.pojo.Member;
import com.yuanren.friend.util.DbConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDaoImpl implements MemberDao {

    private Connection con;
    private PreparedStatement  ps;
    private ResultSet resultSet;

    @Override
    public boolean login(Member member) {
        con=DbConn.getConnection();//链接数据库
        String  sql="select id,password from member where id=? and password=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,member.getId());
            ps.setString(2,member.getPassword());
            resultSet=ps.executeQuery();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public void register(Member member) {

    }

    @Override
    public void updateMember(String id, Member member) {

    }
}
