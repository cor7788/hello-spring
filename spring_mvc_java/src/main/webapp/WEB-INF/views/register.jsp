<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>注册用户</title>
</head>
<body>
<h3>注册用户</h3>
<form action="${pageContext.request.contextPath}/user/signUp" method="post" enctype="multipart/form-data">
    <label for="email">邮箱啊：</label>
    <input id="email" type="email" name="email"><br>
    <label for="username">用户名：</label>
    <input id="username" type="text" name="username"><br>
    <label for="password">密码啊：</label>
    <input id="password" type="password" name="password"><br>
    <input id="photo" type="file" name="photo"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
