<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <%@ page contentType="text/html; charset=UTF-8" %>
        <%-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> --%>
        <link rel="stylesheet" href="./resources/css/style-page.css">
        <link rel="stylesheet" href="./resources/css/noticias-page.css">
        <link rel="stylesheet" href="./resources/css/table-style.css">        
        <link href="https://fonts.googleapis.com/css2?family=DM+Sans&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>        
        <script src="./resources/js/noticias.js"></script>

        <title>Notícias Admin</title>
    </head>
    <body>
        <jsp:include page="./navbarLogin.jsp" />
        <div class="conteudo">
            <section>
                <h2>Notícias</h2>
                <div class="row">
                    <table>
                        <thead>
                            <tr>
                                <td><b>#Id</b></td>
                                <td><b>Título</b></td>
                                <td><b>Ações</b></td>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${noticias}" var="n">
                                <tr>
                                    <td><c:out value="${n.id}" /></td>
                                    <td><c:out value="${n.titulo}" /></td>
                                    <td>
                                        <a href="#" onclick="remover(${n.id})">Excluir</a> |
                                        <a href="/Info-Noticias/updateNoticia?id=${n.id}">Alterar</a>
                                    </td>
                                </tr>                                 
                            </c:forEach>
                        </tbody>
                    </table>
                    <div>
                        <p>
                            <a href="/Info-Noticias/createNoticia">Cadastrar nova notícia</a>
                        </p>
                    </div>
                </div>
            </section>
        </div>
    </body>
</html>