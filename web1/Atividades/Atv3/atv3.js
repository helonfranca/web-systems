function cookie_in(){
    var cookies = navigator.cookieEnabled;
    
    if( cookies == 0){
        alert ("Cookies NãO estão habilitados")
    }
    if( cookies == 1){
        alert ("Cookies estão habilitados")
    }
    
}

function cookie_out(){
    alert ("Coloque o mouse sobre a imagem!")
}
