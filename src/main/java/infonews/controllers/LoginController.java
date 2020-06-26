package infonews.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import infonews.dao.UsuarioDAO;
import infonews.models.Usuario;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "/login" })
public class LoginController extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res){
        try{
            req.getRequestDispatcher("/jsp/login.jsp").forward(req, res);
        }catch (Exception e){
			System.out.println("Erro ao acessar pagina de login: "+e);
		}
    }
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res){
        UsuarioDAO dao = new UsuarioDAO();

        String email = req.getParameter("email");
        
        String senha = req.getParameter("senha");
        
        Usuario usuario = new Usuario();        
        
        usuario = dao.findByEmail(email);
        if(usuario.getIsAdmin()){
            try{
                res.sendRedirect(req.getContextPath() + "/admin");
            }catch (Exception e){
                System.out.println("Erro ao ir para home: "+e);
            }
        }
        
        else{
            try{
                res.sendRedirect(req.getContextPath() + "/usuario");
            }catch (Exception e){
                System.out.println("Erro ao ir para home: "+e);
            }
        }
        // try{
        //     req.getRequestDispatcher("/jsp/indexLogin.jsp").forward(req, res);
        // }catch (Exception e){
        //     System.out.println("Erro ao ir para home: "+e);
        // }       
    }
}