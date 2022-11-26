var para = document.createElement("p");
var node = document.createTextNode ("This is new.");
para.appendChild(node);

//depois substitua outro elemento já existente
var parent = document.getElementById("div1");
var child = document.getElementById("p1");
parent.replaceChild (para,child); //newNode, element.childNodes[0] (a ser subistituído)