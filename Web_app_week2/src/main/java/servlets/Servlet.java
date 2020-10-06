package servlets;

import classes.Game;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String animeName = request.getParameter("AnimeName");
        String genre = request.getParameter("Genre");
        int age = Integer.parseInt(request.getParameter("Age"));
        Game anime = chooseAnime(animeName,genre,age);
        request.setAttribute("anime", anime);
        //request.getRequestDispatcher(request.getContextPath()+"/jsp/Output.jsp").forward(request, response);
        request.setAttribute("IDE", "Fairy_Tail");
        request.getRequestDispatcher("/servlets.Forward2").forward(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    public Game chooseAnime(String animeName, String genre, int age){
        Game anime = new Game();
        anime.setUserId(254);
        anime.setGameGanre(genre);
        anime.setGameAgeCategory(age);
        anime.setGameName(animeName);
        if(anime.getGameId() == null){
            anime.setGameId("4587515");
            //When we will work with sessions I'l make id identity
        }
        return anime;
    }
}
