<%@ page import="classes.GameList" %>
<%@ page import="classes.Game" %>
<%@ page import="classes.User" %>
<%@ page import="servlets.Servlet" %>
<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 12.09.2020
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
    <%!User user; %>
<%  user = (User) request.getAttribute("user");
    Game anime = (Game) request.getAttribute("anime");
%>
<h3>I think UR searching for this anime</h3>
<h4>Anime name: <%=anime.getGameName()%></h4>
<h4>Anime Genre: <%=anime.getGameGanre()%></h4>
<h4>This anime intended for people aged: <%=anime.getGameAgeCategory()%></h4>
<h3>This anime is registred by the id: <%= anime.getUserId()%></h3>
<%@include file="footer.jsp"%>