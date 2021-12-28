package br.com.desafios;
/*
Desafio
Voc� est� ajudando a desenvolver um sistema de gerenciamento de weblog chamado Weblogger Brasil. 
Embora Weblogger Brasil coloque todo o conte�do direto no website em HTML, nem todos autores apreciam usar tags HTML em seus textos. 
Para tornar a vida deles mais f�ceis, Weblogger Brasil oferece uma sintaxe simples chamada atalhos para obter alguns efeitos textuais 
em HTML. Sua tarefa �, dado um documento escrito com atalhos, traduzi-lo para o HTML apropriado.

Um atalho � usado para colocar texto em it�lico. HTML faz isto com as tags <i> e </i>, mas no Weblogger Brasil um autor pode simplesmente 
colocar um peda�o de texto entre dois caracteres de sublinhado, '_'. Portanto, onde um autor escreve

  Voc� _deveria_ ver a foca no zoologico!
                
Weblogger Brasil vai publicar o seguinte:

  Voc� <i>deveria</i> ver a foca no zoologico!
                
Outro atalho serve para colocar texto em negrito, o que, em HTML, � feito com as tags <b> e </b>. 
Weblogger Brasil permite aos autores fazer o mesmo com pares do caractere asterisco, '*'. Quando um autor escreve o texto

  Marque a conta *a receber* para *paga*.
                
ele vai sair no website assim:

  Marque a conta <b>a receber</b> para <b>paga</b>.
                
Entrada
A entrada contem v�rios casos de teste. Cada caso de teste � composto por uma linha que contem uma string texto, 
com zero ou mais usos dos atalhos it�lico e negrito. Cada texto tem de 1 a 50 caracteres, inclusive. 
Os �nicos caracteres permitidos no texto s�o os caracteres alfab�ticos (de 'a' a 'z' e de 'A' a 'Z'), o sublinhado ('_'), 
o asterisco ('*'), o caractere de espa�o e os s�mbolos de pontua��o ',', ';', '.', '!', '?', '-', '(' e ')'. 
O caractere sublinhado '_' ocorre no texto um n�mero par de vezes. O asterisco '*' tamb�m aparece um n�mero par de vezes no texto. 
Nenhuma substring do texto entre um par de sublinhados ou entre um par de asteriscos pode conter outros sublinhados ou asteriscos, 
respectivamente.

Sa�da
Para cada linha de entrada seu programa deve gerar uma linha de sa�da com o texto traduzido para HTML como demonstrado nos exemplos 
abaixo. Para tornar it�lico um peda�o de texto no HTML, voc� deve iniciar este peda�o com a tag <i> e termin�-lo com a tag </i>. 
Para texto em negrito, inicie com <b> e termine com </b>.

Exemplo de Entrada									Exemplo de Sa�da
Voc� _deveria_ ver a foca no zoologico!				Voc� <i>deveria</i> ver a foca no zoologico!
Marque a conta *a receber* para *paga*.				Marque a conta <b>a receber</b> para <b>paga</b>.*/




public class WebLoggerBrasil {

}
