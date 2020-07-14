package infonews.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "/createUsuario" })
public class CreateUsuarioController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res){
        try{
            req.getRequestDispatcher("/jsp/createUsuario.jsp").forward(req, res);
        }catch(Exception e){
            System.err.println("Erro ao listar notícias: "+e);
        }
    }
}