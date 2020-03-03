package com.ims.web;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
public class DataGridServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 审计 审计  安全管理员 授权 系统管理员 管理系统 组织 用户
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String key = parameterNames.nextElement();
            String value = request.getParameter(key);
            System.out.println(key + ":" + value);
        }

        int pageNumber = Integer.parseInt(request.getParameter("page"));
        int pageSize = Integer.parseInt(request.getParameter("rows"));

        JSONObject result = new JSONObject();
        JSONArray rows = new JSONArray();
        result.put("total",800);
       for(int i = (pageNumber-1)*pageSize+1 ; i <= pageNumber*pageSize;i++ ){
           JSONObject row = new JSONObject();
           row.put("id","oid"+i);
           row.put("name","name"+i);
           row.put("date", new SimpleDateFormat("yyyy-mm-dd").format(new Date()));
           row.put("amount",i);
           rows.add(row);
        }
        result.put("rows",rows);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        out.print(result.toString());
        System.out.println(result);
        out.flush();
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

}