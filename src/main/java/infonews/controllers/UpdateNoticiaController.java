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

        String id = req.getParameter("id");
        
        int idNoticia = Integer.parseInt(id);

        List<Noticia> noticia = dao.findById(idNoticia);

        try{
            req.setAttribute("noticia", noticia);
            req.getRequestDispatcher("/jsp/updateNoticia.jsp").forward(req, res);
        }catch(Exception e){
            System.err.println("Erro ao listar notícias: "+e);
        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res){
        NoticiaDAO dao = new NoticiaDAO();
        
        Noticia noticia = new Noticia();        
        String id = req.getParameter("id").toString();

        noticia.setId(Integer.parseInt(id));
        noticia.setTitulo(req.getParameter("titulo").toString());
        noticia.setCorpo(req.getParameter("corpo").toString());
        noticia.setDataCriacao(req.getParameter("data").toString());
        noticia.setLinkImg(req.getParameter("linkImg").toString());
        
        dao.updateNews(noticia);
        try{
            res.sendRedirect(req.getContextPath() + "/noticiasAdmin");
        }catch (Exception e){
            System.out.println("Erro ao ir para home: "+e);
        }
    }
}
