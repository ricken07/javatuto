package cg.yekolab.controller;

import cg.yekolab.model.User;
import interceptor.UserBean;
import java.io.IOException;
import java.util.Map;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
public class LoginController extends HttpServlet {
    private HttpSession session;
    @Inject
    private UserBean userBean;

    public LoginController() {
    }
    public void sessionStart(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        session=req.getSession();
        if (session.getAttribute("user")!=null) {
            this.getServletContext().getRequestDispatcher("/main.jsp").forward(req, resp);
        }
        this.getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        sessionStart(req, resp);
    }
    
   

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           session=req.getSession();
           
          
        try {
            if (req.getParameter("btn").equalsIgnoreCase("1")) {
                //click sur le bouton Connexion
                final String login = req.getParameter("login");
                final String pass = req.getParameter("pass");
                boolean isOK = false;
                for (Map.Entry<Integer, User> u 
                        : userBean.allUsers().entrySet()) {
                    User value = u.getValue();
                    int key = u.getKey();
                    if (value.getLogin().equals(login)
                            && value.getPass().equals(pass)) {
                        req.setAttribute("user", value);
                        session.setAttribute("user", value);
                        isOK = true;
                    }
                    
                }
                
                if (isOK) {
                    this.getServletContext().getRequestDispatcher("/main.jsp")
                            .forward(req, resp);
                } else {
                    req.setAttribute("message", "Identification invalide");
                    this.getServletContext().getRequestDispatcher("/login.jsp")
                            .forward(req, resp);
                }
            } else {
                //click sur le bouton S'enregistrer 
                //resp.sendRedirect(req.getContextPath()+"/register.jsp");
                this.getServletContext().getRequestDispatcher("/register.jsp")
                        .forward(req, resp);
            }
        } catch (NullPointerException e) {
            //resp.sendRedirect(req.getContextPath()+"/login.jsp");
            this.getServletContext().getRequestDispatcher("/login.jsp")
                    .forward(req, resp);
        }
    }

}
    

