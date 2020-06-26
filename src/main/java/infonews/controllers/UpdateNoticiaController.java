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

@WebServlet(urlPatterns = { "/updateNoticia" })
public class UpdateNoticiaController  extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res){
        NoticiaDAO dao  = new NoticiaDAO();

        List<Noticia> noticias = dao.getAllNews();

        try{
            req.getRequestDispatcher("/jsp/updateNoticia.jsp").forward(req, res);
        }catch(Exception e){
            System.err.println("Erro ao listar notícias: "+e);
        }
    }    
}