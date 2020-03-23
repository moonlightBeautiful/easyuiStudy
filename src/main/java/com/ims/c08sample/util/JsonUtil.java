package com.ims.c08sample.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonUtil {

    public static JSONArray formatRsToJsonArray(ResultSet resultSet) throws Exception {
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int columnCount = resultSetMetaData.getColumnCount();
        JSONArray jsonArray = new JSONArray();
        while (resultSet.next()) {
            JSONObject jsonObject = new JSONObject();
            for (int i = 1; i <= columnCount; i++) {
                jsonObject.put(resultSetMetaData.getColumnName(i), resultSet.getObject(i));
            }
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }
}
