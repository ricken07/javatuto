package cg.yekolab.controller;


import cg.yekolab.model.User;
import interceptor.UserBean;
import java.io.IOException;
import java.util.Iterator;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Orion WAMBERT
 */
@WebServlet(value = "/")
public class LoginController extends HttpServlet{

    @Inject
    private UserBean userBean;
    
    public LoginController() {
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/login.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String c=req.getParameter("btn");
         
         String login=req.getParameter("login");
         String pass=req.getParameter("pass");
         
                  
       
        
       
       
       
        if (Integer.valueOf(c)==1) {
            //Mise en place de la connexion
        
            for(User user:userBean.allUsers().values()){
                if (login.equalsIgnoreCase(user.getLogin()) && pass.equalsIgnoreCase(user.getPass())) {
                    
                    req.setAttribute("nom", user.getNom());
                    req.setAttribute("prenom", user.getPrenom());
                    req.setAttribute("genre", user.getGenre());
                    req.setAttribute("login", user.getLogin());
                    req.setAttribute("pass", user.getPass());
                    this.getServletContext().getRequestDispatcher("/main.jsp");
                }
            }
    req.setAttribute("message", "<em>coordonnées incorrect ou non trouvé  <a href='/exo/register.jsp'>cliquez ici</a> pour vous enregistrer</em>");
            this.getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
           
            
           
            
        }else{
            /**
             * 
             * Redirection vers la page d'enregistrement
             */
            
             this.getServletContext().getRequestDispatcher("/register.jsp").forward(req, resp);
        }
    }
    
}
