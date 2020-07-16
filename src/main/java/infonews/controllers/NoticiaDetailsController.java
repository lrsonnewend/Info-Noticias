package infonews.controllers;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import infonews.dao.NoticiaDAO;
import infonews.models.Noticia;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "/noticiaDetails" })
public class NoticiaDetailsController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res){
        NoticiaDAO dao  = new NoticiaDAO(); 
        
        String id = req.getParameter("id");

        int idNoticia = Integer.parseInt(id);
        
        List<Noticia> noticias = dao.findById(idNoticia);

        try{
            req.setAttribute("noticias", noticias);
            req.getRequestDispatcher("/jsp/noticiaDetails.jsp").forward(req, res);
        }catch(Exception e){
            System.err.println("Erro ao pegar notícia: "+e);
        }
    }
}