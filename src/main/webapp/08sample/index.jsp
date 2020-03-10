<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/17 0017
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
    <link rel="stylesheet" type="text/css" href="../jquery-easyui-1.4.2/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../jquery-easyui-1.4.2/themes/icon.css">
    <script type="text/javascript" src="../jquery-easyui-1.4.2/jquery.min.js"></script>
    <script type="text/javascript" src="../jquery-easyui-1.4.2/jquery.easyui.min.js"></script>
</head>
<body>
<div id="loginAndRegDialog" title="用户登陆" style="width:250px;height:200px">
    <form id="loginInputForm" method="post">
        <table>
            <tr>
                <th align="right">用户名</th>
                <td><input name="name"></td>
            </tr>
            <tr>
                <th align="right">密码</th>
                <td><input name="password" type="password"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
<script>
    var loginAndRegDialog;
    $(function () {
        loginAndRegDialog = $('#loginAndRegDialog').dialog({
            closable: false,
            modal: true,
            buttons: [
                {
                    text: '注册',
                    handler: function () {

                    }
                }, {
                    text: '登陆',
                    handler: function () {
                        console.log("点击登陆按钮");
                    }
                }]
        });
    });
</script>