<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>显示用户列表</title>
    <style>
        body{ text-align: center;}
        table,table tr th, table tr td { border:1px solid #c0cad0;padding: 4px 10px; }
        table { min-height: 25px; line-height: 25px; text-align: center; border-collapse: collapse; padding:2px;}
    </style>
    <script>
        function del() {
            if (confirm("确认删除该条记录吗？")) {
                return true;
            }
            return false;
        }
    </script>
</head>
<body>
<h1 style="color: red;">用户列表</h1>

<table align="center">
    <th>序号</th>
    <th>姓名</th>
    <th>昵称</th>
    <th>年龄</th>
    <th>删除</th>
    <th>更新</th>

    <s:iterator value="#request.userList" var="us">
        <tr>
            <td><s:property value="#us.id"></s:property></td>
            <td><s:property value="#us.firstname"></s:property></td>
            <td><s:property value="#us.lastname"></s:property></td>
            <td><s:property value="#us.age"></s:property></td>
            <td><a href='removeUser.action?user.id=<s:property value="#us.id"></s:property>' onclick="return del();">删除</a></td>
            <td><a href='updateUser.action?user.id=<s:property value="#us.id"></s:property>'>更新</a></td>
        </tr>
    </s:iterator>

</table>
</body>
</html>
