CREATE DATABASE bdnews;

USE bdnews;

CREATE TABLE usuarios(
    id INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR NOT NULL,
    senha VARCHAR NOT NULL,
    isAdmin BOOLEAN NOT NULL
);

CREATE TABLE noticias(
    id INT PRIMARY KEY AUTO_INCREMENT,
    corpo VARCHAR NOT NULL,
    titulo VARCHAR NOT NULL,
    data_criacao VARCHAR NOT NULL,
    link_img VARCHAR
);

INSERT INTO usuarios(email, senha, isAdmin) 
values("email@teste.com", 1234, true);

INSERT INTO usuarios(email, senha, isAdmin)
values("usuario@email.com", 1234, false);

INSERT INTO noticias(corpo, titulo, data_criacao, link_img)
values("O governo liberou a verba para auxílio de pessoas desempregadas para poderem ter uma renda extra para as coisas básicas: alimentos e pagar contas.", "07/04/2020", "https://www.blogdovestibular.com/wp-content/uploads/2020/05/auxilio-emergencial-caixa-economica-federal-2020-1024x572.jpg", "Governo libera auxílio emergencial de R$600,00 reais.");

