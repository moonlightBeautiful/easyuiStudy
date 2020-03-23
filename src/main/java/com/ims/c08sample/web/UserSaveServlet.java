package com.ims.c08sample.web;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ims.c08sample.dao.UserDao;
import com.ims.c08sample.model.User;
import com.ims.c08sample.util.DbUtil;
import com.ims.c08sample.util.ResponseUtil;
import com.ims.c08sample.util.StringUtil;
import net.sf.json.JSONObject;


public class UserSaveServlet extends HttpServlet {

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
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String qq = request.getParameter("qq");
        String id = request.getParameter("id");

        User user = new User(name, phone, email, qq);
        if (StringUtil.isNotEmpty(id)) {
            user.setId(Integer.parseInt(id));
        }

        Connection con = null;
        try {
            int saveNums = 0;
            con = dbUtil.getConn();
            JSONObject result = new JSONObject();
            if (StringUtil.isNotEmpty(id)) {
                saveNums = userDao.userModify(con, user);
            } else {
                saveNums = userDao.userAdd(con, user);
            }
            if (saveNums == 1) {
                result.put("success", "true");
            } else {
                result.put("success", "true");
                result.put("errorMsg", "保存失败~");
            }
            ResponseUtil.write(response, result);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                dbUtil.closeConn(con);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }


}
