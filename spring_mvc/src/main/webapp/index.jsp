<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>首页</title>
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h3>index 页面</h3>
<a href="hello">欢迎登录</a>

<h3>请求参数绑定-属性包含对象</h3>
<form class="form-inline" action="params_obj">
    <div class="form-group">
        <label class="sr-only" for="username">用户名：</label>
        <input type="text" class="form-control" id="username" name="username" placeholder="用户名">
    </div>
    <div class="form-group">
        <label class="sr-only" for="password">密码：</label>
        <input type="password" class="form-control" id="password" name="password" placeholder="密码">
    </div>
    <div class="form-group">
        <label class="sr-only" for="user_name">姓名：</label>
        <input type="text" class="form-control" id="user_name" name="user.name" placeholder="姓名">
    </div>
    <div class="form-group">
        <label class="sr-only" for="user_age">年龄：</label>
        <input type="number" class="form-control" id="user_age" name="user.age" placeholder="年龄">
    </div>

    <button type="submit" class="btn btn-default">提交</button>
</form>

<h3>请求参数绑定-属性包含集合</h3>
<form class="form-inline" action="params_collection">
    <div class="form-group">
        <label class="sr-only" for="name1"></label>
        <input type="text" class="form-control" id="name1" name="name" placeholder="姓名">
    </div>
    <div class="form-group">
        <label class="sr-only" for="age1"></label>
        <input type="number" class="form-control" id="age1" name="age" placeholder="年龄">
    </div>
    <div class="form-group">
        <label class="sr-only" for="username1"></label>
        <input type="text" class="form-control" id="username1" name="list[0].username" placeholder="用户名">
    </div>
    <div class="form-group">
        <label class="sr-only" for="password1"></label>
        <input type="password" class="form-control" id="password1" name="list[0].password" placeholder="密码">
    </div>
    <div class="form-group">
        <label class="sr-only" for="username2"></label>
        <input type="text" class="form-control" id="username2" name="map['first'].username" placeholder="用户名">
    </div>
    <div class="form-group">
        <label class="sr-only" for="password2"></label>
        <input type="password" class="form-control" id="password2" name="map['first'].password" placeholder="密码">
    </div>

    <button type="submit" class="btn btn-default">提交</button>
</form>

<h3>请求参数绑定-属性包含日期</h3>
<form class="form-inline" action="params_date">
    <div class="form-group">
        <label class="sr-only" for="name2"></label>
        <input type="text" class="form-control" id="name2" name="name" placeholder="姓名">
    </div>
    <div class="form-group">
        <label class="sr-only" for="age2"></label>
        <input type="number" class="form-control" id="age2" name="age" placeholder="年龄">
    </div>
    <div class="form-group">
        <label class="sr-only" for="birthday"></label>
        <input type="text" class="form-control" id="birthday" name="birthday" placeholder="生日">
    </div>
    <button type="submit" class="btn btn-default">提交</button>
</form>

<h3>请求参数绑定-请求参数为日期</h3>
<form class="form-inline" action="date">
    <div class="form-group">
        <label class="sr-only" for="date"></label>
        <input type="text" class="form-control" id="date" name="date" placeholder="日期">
    </div>
    <button type="submit" class="btn btn-default">提交</button>
</form>

<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</body>
</html>
