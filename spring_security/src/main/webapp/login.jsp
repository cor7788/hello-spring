<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登陆页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    <label>
        用户名：<input type="text" name="username">
    </label><br>
    <label>
        密码：<input type="password" name="password">
    </label><br>
    <input type="submit" value="提交">
</form>
</body>
</html>