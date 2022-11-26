function NumeroPerfeito(valor){
                
    var total = 0;
    var i;

    for(i = 1; i < (Math.round(valor / 2) + 1); i++){
        if (valor % i == 0) {
            total += i;
        }
    }
    if(total == valor){
        alert("Número Perfeito");
    }
    else{
        alert("O Número não é Perfeito");
    }
}