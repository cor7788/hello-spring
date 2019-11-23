<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>欢迎页面</title>
</head>
<body>
<h3>hello 页面</h3>

${requestScope.user} <br>
${sessionScope.user} <br>
${requestScope.zs} <br>
${requestScope.msg}<br>
</body>
</html>
