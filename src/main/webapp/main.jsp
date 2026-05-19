<%--
  Created by IntelliJ IDEA.
  User: 29535
  Date: 2026/5/19
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户查询页面</title>
</head>
<body>
<!-- 查询条件的开始 -->
<fieldset>
    <legend>查询条件</legend>
    <form action="userSelect" method="post">
        用户姓名:
        <input type="search" name="username" required autofocus="autofocus">
        <button type="submit">查询</button>

    </form>
</fieldset>
<!-- 查询条件的结束 -->

<!-- 查询条件的开始 -->
<fieldset>
    <legend>查询结果</legend>
    <table border="1" cellpadding="5" rules="all">
        <tr>
            <th>序号</th>
            <th>用户编号</th>
            <th>用户密码</th>
            <th>用户邮箱</th>
            <th>用户性别</th>
            <th>用户手机</th>
            <th>注册日期</th>
            <th>操作</th>
        </tr>
    </table>
</fieldset>
<!-- 查询条件的开始 -->
</body>
</html>