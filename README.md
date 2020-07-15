# Info-Noticias
Projeto da matéria de Laboratório de Eng. de Software

# Criaço da base de dados
Abra o terminal para executar o arquivo script.sql com o comando sudo mysql -u<usuario> -p<senha> bdnews < script.sql. Depois disso, todas as tabelas serão criadas no banco de dados.

# Procedimento de build e execução
Abra o prompt de comando na pasta raiz onde está localizado o projeto;
execute o comando **gradle AppRun** para executar a aplicação.
A url da aplicação que será gerada é a seguinte: **localhost:8080/Info-Noticias**
Para fazer o build da aplicação, utilize o comando **gradle build**
Para mudar a senha do banco de dados, vá ao diretório **src/main/java/infonews/resources/META-INF** e troque a senha de acesso ao banco localizada na linha 17 do arquivo persistence.xml

# Estrutura do projeto
* build.gradle: arquivo que contêm toda as dependências do projeto;
* src/main/java/infonews/controllers: diretório onde se encontra os servlets que fazem o mapeamento dos endpoints do sistema;
* src/main/java/infonews/dao: diretório que contêm os Data Access Object para realizar a persistência de dados no banco de dados;
* src/main/java/infonews/models: contêm os arquivos de regra de negócio do sistema e que são entidades no banco de dados;
* src/main/java/infonews/resources/META-INF: diretório onde é armazenado o arquivo persistence.xml que faz a configuração do framework Hibernate para banco de dados.
* src/main/java/infonews/webapp/jsp: contêm todas as páginas web do sistema;
* src/main/java/infonews/webapp/resources: diretório com os arquivos com funçes ajax e jquery para manipulação de algumas atividades do sistema.
