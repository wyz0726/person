<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询所有</title>
    <style>
        *{
            font-size:small;
        }
    </style>
</head>
<body>
<a href="toAddUser">新增</a>
<table border="1" width="50%">
    <tr>
        <td>用户id</td>
        <td>密码</td>
        <td>年龄</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.uid}</td>
            <td>${user.password}</td>
            <td>${user.age}</td>
            <td>
                <a href="deleteUser?uid=${user.uid}">删除</a>
                <a href="toUpdateUser?uid=${user.uid}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
