<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <%@ page contentType="text/html; charset=UTF-8" %>        
        <link rel="stylesheet" href="./resources/css/style-page.css">
        <link rel="stylesheet" href="./resources/css/login-page.css">
        <link rel="stylesheet" href="./resources/css/createNews-page.css">
        <%-- <link rel="stylesheet" href="./resources/css/noticias-page.css">         --%>
        <link href="https://fonts.googleapis.com/css2?family=DM+Sans&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <title>Criar nova notícia</title>
    </head>
    <body>
        <jsp:include page="./navbarAdmin.jsp" />
            <div class="conteudo">
                <section>
                    <h1>Nova notícia</h1>
                    <form action="noticias" method="post">
                        <label for="tituloNoticia">Título</label>
                        <input type="text" id="titulo" name="titulo">

                        <label for="corpoNoticia">Corpo</label>
                        <textarea id="corpo" name="corpo"></textarea>

                        <label for="dataNoticia">Data de publicação</label>
                        <input type="text" id="data" name="data" placeholder="dd/mm/aaaa">

                        <label for="imagemNoticia">Link para imagem</label>
                        <input type="text" id="linkImg" name="linkImg" placeholder="">

                        <input type="submit" value="Cadastrar">
                    </form>
                </section>
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