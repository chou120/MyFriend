package com.yuanren.friend.service;

import com.yuanren.friend.pojo.Member;

public interface MemberService {

    //会员登录
    boolean   login(Member member);

    //会员注册
    void   register(Member member);

    //会员修改信息
    void updateMember(String id ,Member member);






}
