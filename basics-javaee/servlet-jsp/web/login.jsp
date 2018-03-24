<%-- 
    Document   : login
    Created on : 26 oct. 2017, 15:57:21
    Author     : Orion WAMBERT
--%>

<%@page import="cg.yekolab.controller.LoginController"%>
<%
          
            
            %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connexion</title>
    </head>
    <body>
        
        <br/><br/>
        <form method="POST" action="/exo">
            
            <!-- Message -->
            <div> ${message!=null?message:""}</div>
            <fieldset> <legend>Formulaire</legend>
                <div>
                    Login:   <input type="text" name="login"/><br/><br/>
                    Mot de passe : <input type="password" name="pass"/><br/><br/>
                    <button type="submit" name="btn" value="1">Connexion</button>
                    <button type="submit" name="btn" value="2">S'enregistrer</button>
                </div>
            </fieldset>
        </form>
    </body>
</html>
