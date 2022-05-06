<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>保存用户</title>
</head>
<body>
<h1 style="color: red;">保存用户</h1>

<s:form action="saveUser">
    <s:textfield name="user.firstname" label="%{getText('firstname')}"></s:textfield>
    <s:textfield name="user.lastname" label="%{getText('lastname')}"></s:textfield>
    <s:textfield name="user.age" label="%{getText('age')}"></s:textfield>

    <s:submit value="提交"></s:submit>
</s:form>

</body>
</html>
