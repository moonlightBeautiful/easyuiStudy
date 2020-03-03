/*
package com.ims.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonUtil {

    */
/**
     * 把ResultSet集合转换成JsonArray数组
     *
     * @param rs
     * @return
     * @throws Exception
     *//*

    public static JSONArray formatResultSetToJsonArray(ResultSet rs) throws Exception {
        ResultSetMetaData md = rs.getMetaData();
        int num = md.getColumnCount();
        JSONArray jsonArray = new JSONArray();
        while (rs.next()) {
            JSONObject jsonObject = new JSONObject();
            for (int i = 1; i <= num; i++) {
                jsonObject.put(md.getColumnName(i), rs.getObject(md.getColumnName(i)));
            }
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }
}
*/
