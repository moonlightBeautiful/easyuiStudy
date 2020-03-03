/*
package com.ims.web;

import java.io.IOException;
import java.sql.Connection;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.ims.dao.UserDao;
import com.ims.model.PageBean;
import com.ims.util.DbUtil;
import com.ims.util.JsonUtil;
import com.ims.util.ResponseUtil;

public class UserListServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    DbUtil dbUtil = new DbUtil();
    UserDao userDao = new UserDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        */
/*Enumeration enu = request.getParameterNames();
        while (enu.hasMoreElements()) {
            String paraName = (String) enu.nextElement();
            System.out.println(paraName + ": " + request.getParameter(paraName));
        }*//*


        String page = request.getParameter("page");
        String pageSize = request.getParameter("rows");

        PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(pageSize));
        JSONObject result = new JSONObject();
        Connection con = null;

        try {
            con = dbUtil.getCon();
            int total = userDao.userCount(con);
            JSONArray jsonArray = JsonUtil.formatResultSetToJsonArray(userDao.userList(con, pageBean));
            result.put("total", total);
            result.put("rows", jsonArray);

            ResponseUtil.write(response, result);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                dbUtil.closeCon(con);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }


}
*/
