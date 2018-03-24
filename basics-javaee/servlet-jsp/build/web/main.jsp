<%-- 
    Document   : main
    Created on : 26 oct. 2017, 15:57:36
    Author     : Orion WAMBERT
--%>

<%@page import="cg.yekolab.controller.LoginController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
    </head>
    <body>
        
        
        
 
        <h1>Affichage du profile de l'utilisateur</h1>
        
        Nom:<strong>${user.nom}</strong><br>
        Prenom:<strong>${user.prenom}</strong><br>
        Genre:<strong>${user.genre}</strong><br>
        Login:<strong>${(user.login)}</strong><br><br>
        
        <div align="center">
            <form method="POST" action="/exo/home">
                <input type="submit" name="deconnexion" value="fermer ma session">
            </form>
        </div>
    </body>
</html>
