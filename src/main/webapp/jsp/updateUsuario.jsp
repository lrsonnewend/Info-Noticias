<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="infonews.dao.UsuarioDAO" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ page contentType="text/html; charset=UTF-8" %>
        <%-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> --%>
        <link rel="stylesheet" href="./resources/css/style-page.css">
        <link rel="stylesheet" href="./resources/css/login-page.css">
        <link rel="stylesheet" href="./resources/css/noticias-page.css">        
        <link href="https://fonts.googleapis.com/css2?family=DM+Sans&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <title>Alterar</title>
    </head>
    <body>
        <jsp:include page="./navbarAdmin.jsp" />
        <div class="conteudo">
            <h3>Alterar usuário</h3>
            <form action="updateUsuario" method="post">
            <c:forEach items="${usuario}" var="u">
                    <input type="hidden" name="id" value="${u.id}" />
                    <input type="hidden" name="isAdmin" value="${u.isAdmin}" />
                    
                    <label for="uemail">Email</label>
                    <input type="text" name="email" value="${u.email}" />

                    <label for="usenha">Senha</label>
                    <input type="password" name="senha" value="${u.senha}" />

                    <%-- <label for="usenha">Admin</label>
                    <input type="checkbox" name="isAdmin" value="${u.isAdmin}" checked="true" /> --%>
                   
                    <input type="submit" value="Alterar">
                                   
            </c:forEach>
            </form>
        </div>
    </body>
</html>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
    crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
    integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
    crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
    integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
    crossorigin="anonymous"></script>