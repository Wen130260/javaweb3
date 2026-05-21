package com.test.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// @WebServlet注释:修饰的类会成为Java web项目中的Servlet,服务器启动时,会将Servlet相关的信息加载到内存中
// urlPatterns属性:设置那些url可以访问到当前的Servlet,是String[]。如果只有一个URL，则数组的大括号可以省略
@WebServlet(urlPatterns = "/userServlet")
public class UserSelectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
