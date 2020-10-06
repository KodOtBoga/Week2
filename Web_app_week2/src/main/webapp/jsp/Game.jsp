<%@ page import="classes.GameList" %>
<%@ page import="classes.User" %>
<!DOCTYPE HTML>
<HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="header.jsp"%>

<div style="text-align: center; width: 100%; height: 100%; background-color: cadetblue; padding-bottom: 30px">
<br>
<h3>Wanna play? choose / search a good game</h3>
<form method="post" action="<%=request.getContextPath()%>/servlets.Servlet">
    <input type="text" name="GameName" placeholder="GameName"><br>
    <h3>Which game genre u would prefer</h3>
    <select name="Genre">
    <option value="Shooter">Shooter</option>
        <option value="Strategy">Strategy</option>
        <option value="Horor">Horor</option>
        <option value="Adventure">Adventure</option>
        <option value="Relax">Relax</option>
    </select><br>
    <hr>
    <p>
    <h3>There is a lot of game like game age gap, write ur choice pls</h3>
    </p>
    <input type="text" name="Age"><br>
    <h3>Did you accept rules and policy?</h3><h3>
    yes<input type="radio" name="Privacy" value="True">
    yes, but another button<input type="radio" name="Privacy" value="False">
    <br>
    <br>
    <input type="submit" value="Send" style="color: white;background-color: black; font-size: 20px; margin-top: 50px; border-radius: 20px">
</h3>
</form>
</div>
<%@include file="footer.jsp"%>
</HTML>