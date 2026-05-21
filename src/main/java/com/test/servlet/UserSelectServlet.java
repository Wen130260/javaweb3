package com.test.servlet;

import com.test.dao.UserMessageDao;
import com.test.entity.UserMessage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

// @WebServlet注释:修饰的类会成为Java web项目中的Servlet,服务器启动时,会将Servlet相关的信息加载到内存中
// urlPatterns属性:设置那些url可以访问到当前的Servlet,是String[]。如果只有一个URL，则数组的大括号可以省略
@WebServlet(urlPatterns = "/userServlet")
public class UserSelectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //获得用户在浏览器中输入的查询条件
        String userName = req.getParameter("userName");
        //查询满足条件的用户信息
        UserMessageDao dao = new UserMessageDao();
        List<UserMessage> list = dao.selectByUserName(userName);
        list.forEach(System.out::println);
    }
}