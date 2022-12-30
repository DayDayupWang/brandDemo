<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link href="css/login.css" rel="stylesheet">
</head>

<body>
<div id="loginDiv" style="height: 350px">
    <form action="/brand-demo/loginServlet" method="post" id="form">
        <h1 id="loginMsg">LOGIN IN</h1>
        <%--JSP将Java代码和特定变动内容嵌入到静态的页面中，实现以静态页面为模板，动态生成其中的部分内容--%>
        <%--此处接受来自LoginServlet的信息--%>
        <div id="errorMsg">${login_msg} ${register_msg}</div>
        <%--通过 el表达式value="${cookie.username.value}" 在勾选了复选框时，对页面cookie进行持久化--%>
        <p>Username:<input id="username" name="username" value="${cookie.username.value}" type="text"></p>

        <p>Password:<input id="password" name="password" value="${cookie.password.value}" type="password"></p>
        <p>Remember:<input id="remember" name="remember" value="1" type="checkbox"></p>
        <div id="subDiv">
            <input type="submit" class="button" value="login up">
            <input type="reset" class="button" value="reset">&nbsp;&nbsp;&nbsp;
            <a href="register.jsp">没有账号？</a>
        </div>
    </form>
</div>


</body>
</html>