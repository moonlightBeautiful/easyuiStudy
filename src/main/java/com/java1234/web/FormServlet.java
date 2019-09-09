package com.java1234.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

/**
 * @author gaoxu
 * @date 2019-09-02 16:59
 * @description ... 类
 */

public class FormServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        System.out.println("姓名：" + request.getParameter("name"));
        System.out.println("Email：" + request.getParameter("email"));
        System.out.println("电话："+request.getParameter("phone"));
        System.out.println("主题：" + request.getParameter("subject"));
        System.out.println("内容：" + request.getParameter("message"));
        System.out.println("语言：" + request.getParameter("language"));

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out =response.getWriter();
        out.println("ajax提交成功");
        out.flush();
        out.close();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

}
