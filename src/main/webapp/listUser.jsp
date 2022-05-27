<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

<html>
<head>
    <title>显示用户列表</title>
    <style>
        table, table tr th, table tr td {
            border: 1px solid #c0cad0;
        }

        table {
            min-height: 25px;
            line-height: 25px;
            text-align: center;
            border-collapse: collapse;
            padding: 2px;
        }
    </style>
</head>
<body>
<h1 style="color: red;">用户列表</h1>

<table>
    <th>序号</th>
    <th><bean:message key="firstname"></bean:message></th>
    <th>昵称</th>
    <th>年龄</th>
    <th>删除</th>
    <th>更新</th>

    <logic:iterate name="userListForm" property="userList" id="us">
        <tr>
            <td><bean:write name="us" property="id"></bean:write></td>
            <td><bean:write name="us" property="firstname"></bean:write></td>
            <td><bean:write name="us" property="lastname"></bean:write></td>
            <td><bean:write name="us" property="age"></bean:write></td>
            <td>删除</td>
            <td>更新</td>
        </tr>
    </logic:iterate>

</table>

</body>
</html>
