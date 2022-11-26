var para = document.createElement("p"); //NÃO TAVA PEGANDO PQ FICAVA "VERDE" MAS O TEXTO TAVA ESCRITO ERRADO
var node = document.createTextNode ("This is new."); //document.tudoJunto!
para.appendChild(node); //só até aqui não modificará a página!

//depois adicione a outro elemento já existente
var element = document.getElementById("criação");
element.appendChild(para);