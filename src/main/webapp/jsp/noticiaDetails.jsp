<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <%@ page contentType="text/html; charset=UTF-8" %>
        <%-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> --%>
        <link rel="stylesheet" href="./resources/css/style-page.css">
        <%-- <link rel="stylesheet" href="./resources/css/noticias-page.css"> --%>
        <link href="https://fonts.googleapis.com/css2?family=DM+Sans&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <title>Confira aqui todas as notícias!</title>
        
    </head>
    <body>
        <jsp:include page="./navbarLogin.jsp" />
        <div class="conteudo">
            <section>
                <div class="row">
                    <c:forEach items="${noticias}" var="n">
                        <div>
                            <h1><c:out value="${n.titulo}" /></h1>
                            <h6 style="color: gray;">
                                <b>Data de publicação: <c:out value="${n.dataCriacao}"/></b>
                            </h6>
                        </div>
                        <div style="margin-top:6rem;"></div>
                        <div class="w3-container w3-center">
                            <img src="${n.linkImg}">
                            <br><br>
                            <h5><c:out value="${n.corpo}" /></h5>
                        </div>
                    </c:forEach>
                    <div><a href="/Info-Noticias/noticiasLogin">Voltar</a>
                </div>
            </section>
        </div>
    </body>
</html>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="resources/js/usuarios.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
    crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
    integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
    crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
    integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
    crossorigin="anonymous"></script>