<%--
  Created by IntelliJ IDEA.
  User: kanghongwei
  Date: 2021/1/7
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>测试登录系统</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/commons.css" />
    <script src="js/jquery-3.5.1.min.js"/>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        function changeImage(){
            document.getElementById("yzmtp").src = "DrawImage?"+Math.random();
        }
    </script>
</head>
<body style="background-image: url(image/timg.gif); background-size: 100% 100%; background-attachment: fixed; background-repeat: no-repeat";>
<div id="loginTitle" style="margin-left:590px;margin-top: 150px;color: white"><h2 >学生管理系统后台用户登录</h2></div>
<div id="loginContainer">
    <form class="form-inline" action="LoginController/loginCheck.do" method="post">
        <div class="form-group">
            <div style="height:20px; width:200px;  text-align: center;margin-top: 5px; margin-left:100px;color:red;">${msg}</div>
            <div class="input-group inp" style="margin-top:10px;">
                <div class="input-group-addon"><i class="glyphicon glyphicon-user"></i></div>
                <input type="text" class="form-control" id="username" name="username" placeholder="请输入用户名">
            </div>
            <div class="input-group inp">
                <div class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></div>
                <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">
            </div>

            <div class="input-group inp">
                <button type="submit" class="btn btn-info" style="width:100%;background-color: #5cb85c;border: #5cb85c" >登陆</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>