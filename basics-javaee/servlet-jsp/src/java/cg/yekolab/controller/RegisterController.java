package cg.yekolab.controller;

import cg.yekolab.model.User;
import interceptor.UserBean;
import java.io.IOException;
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
 * and open the template in the edConnexionitor.
 */
/**
 *
 * @author Orion WAMBERT
 */
@WebServlet(value = "/register")
public class RegisterController extends HttpServlet {
    private HttpSession session;
    @Inject
    private UserBean userBean;

    public RegisterController() {
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
        
             if (req.getParameter("btn1").equalsIgnoreCase("1")) {
            //click sur le bouton Valider
            User user = new User(userBean.allUsers().size() + 1,
                    req.getParameter("nom"),
                    req.getParameter("prenom"),
                    req.getParameter("genre"),
                    req.getParameter("login"),
                    req.getParameter("pass"));
            userBean.addUser(user);
          //  session.setAttribute("user", user);
            req.setAttribute("message", "Enregistrement OK");
            this.getServletContext().getRequestDispatcher("/register.jsp")
                    .forward(req, resp);
        } else {
            //click sur le bouton Connexion (retour a la page de login)
            //resp.sendRedirect(req.getContextPath()+"/login.jsp");
            this.getServletContext().getRequestDispatcher("/login.jsp")
                    .forward(req, resp);
        }
    }
        }
       


