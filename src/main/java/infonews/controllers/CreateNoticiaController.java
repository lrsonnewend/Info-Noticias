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

@WebServlet(urlPatterns = { "/createNoticia" })
public class CreateNoticiaController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res){
        try{
            req.getRequestDispatcher("/jsp/createNoticia.jsp").forward(req, res);
        }catch(Exception e){
            System.err.println("Erro ao listar notícias: "+e);
        }
    }   
}