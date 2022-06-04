<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>保存用户</title>
    <link rel="stylesheet" href="css/common.css"></link>
    <script type="text/javascript" src="https://cdn.staticfile.org/jquery/1.12.4/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            var form = document.forms[0];
            $(form).on("submit", function () {
                var firstname = $("input[name='user.firstname']");
                if ($(firstname).val().trim() == "") {
                    alert("姓名不能为空");
                    return false;
                }
            });
        });
    </script>
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
