<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>

<html>
<head>
    <title>保存用户</title>
</head>
<body>
<h1 style="color: red;">保存用户</h1>

<html:form action="saveUser">
    姓名：<html:text property="firstname"></html:text><br/>
    昵称：<html:text property="lastname"></html:text><br/>
    年龄：<html:text property="age"></html:text><br/>
    <html:submit value="提交"></html:submit>
</html:form>

</body>
</html>
