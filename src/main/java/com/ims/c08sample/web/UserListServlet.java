package com.ims.c08sample.web;

import com.ims.c08sample.dao.UserDao;
import com.ims.c08sample.model.PageBean;
import com.ims.c08sample.util.DbUtil;
import com.ims.c08sample.util.JsonUtil;
import com.ims.c08sample.util.ResponseUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

public class UserListServlet extends HttpServlet {

    /**
     *
     */
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
        String page = request.getParameter("page");
        String rows = request.getParameter("rows");
        PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
        Connection connection = null;
        try {
            connection = dbUtil.getConn();
            JSONObject result = new JSONObject();
            JSONArray jsonArray = JsonUtil.formatRsToJsonArray(userDao.userList(connection, pageBean));
            int total = userDao.userCount(connection);
            result.put("rows", jsonArray);
            result.put("total", total);
            ResponseUtil.write(response, result);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                dbUtil.closeConn(connection);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
