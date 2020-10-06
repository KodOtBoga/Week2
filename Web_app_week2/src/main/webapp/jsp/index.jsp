<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 23.09.2020
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<head>
    <style>
        #menu{
            margin-left: 1199px;
            color: black;
            font-family: "Malgun Gothic";
            background-color: wheat;
            height: 400px;
            width: 300px;
            padding-top: 40px;
            padding-left: 20px;
        }
        h1{
            text-align: center;
            font-family: "Agency FB";
        }
    </style>
</head>
<h1 style="background-color: cornflowerblue">Game is cool... Almost always</h1>
<div id="menu">
<form method="get" action="<%=request.getContextPath()%>/classes.UserController">
    <label for="username" style=" font-size: 20px; margin-top: 50px;padding-bottom: 50px">Enter your username here:</label><br>
    <input type="text" name="username" id="username" placeholder="Username"><br>
    <label for="password" style=" font-size: 20px; margin-top: 50px">Enter your password here:</label><br>
    <input type="password" name="password" id="password" placeholder="Password"><br>
    <input type="submit" value="Enter!" style="background-color: yellow; font-size: 20px; margin-top: 50px">
</form>
</div>
<%@include file="footer.jsp"%>
</html>
