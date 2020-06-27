function remover(id) {
    $.ajax({
        url: `usuariosAdmin?id=${id}`,
        type: 'DELETE',
        success: function(response) {
          window.location.reload();
        },
        error: function (response) {
          alert('Erro ao excluir notícia.');
        }
     });
}