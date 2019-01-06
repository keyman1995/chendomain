<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8"/>
    </head>
    <body>
        <h2>Login Page</h2>
        <form action="/cpp/toLogin" method="post">
            <div>
                <span>用户名</span><input name="userName" type="text"/>
            </div>
            <div>
                <span>密码</span><input name="password" type="password"/>
            </div>
            <div>
                <button type="submit">登录</button>
            </div>

        </form>
    </body>
</html>

