var modelo = document.querySelector(".modelo");

function duplicar() {
    let novo = modelo.cloneNode(true);

    novo.classList.remove("modelo");

    novo.querySelector("#img").src= ".....";

    novo.querySelector("#algum").value = "OI";

    /*novo.querySelector("#btRemove").addEventListener("click",()=>{
        novo.remove();
    })*/
    
    document.querySelector("body").appendChild(novo);
}

function remover(element) {
    element.parentNode.remove();
}