$(function() {
    /* caixa-confirmacao representa a id onde o caixa de confirmação deve ser criada no html */
    $( "#exclusao" ).dialog({
      resizable: false,
      height:140,

      /* 
       * Modal desativa os demais itens da tela, impossibilitando interação com eles,
       * forçando usuário a responder à pergunta da caixa de confirmação
       */ 
      modal: true,

      /* Os botões que você quer criar */
      buttons: {
        "Sim": function() {
          $( this ).dialog( "close" );
          alert("Você clicou em Sim!");
        },
        "Não": function() {
          $( this ).dialog( "close" );
          alert("Você clicou em Não");
        }
      }
    });
  });