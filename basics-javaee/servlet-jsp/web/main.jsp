<%-- 
    Document   : main
    Created on : 26 oct. 2017, 15:57:36
    Author     : HP Notebook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Affichage du profile de l'utilisateur</h1>
        
        <h2>Bienvenue ${login}</h2>
        
        <h3>Informations:</h3>
        <hr>
        Nom:<strong>${nom}</strong>
        <br>
        Prenom:<strong>${prenom}</strong>
        <br>
        Genre:<strong>${genre}</strong>
        <br>
        Login:<strong>${login}</strong>
        <br>
        Mdp:<strong>${mdp}</strong>
        <hr>
        
        
    </body>
</html>
