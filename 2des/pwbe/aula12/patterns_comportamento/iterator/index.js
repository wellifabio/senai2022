//Este pattern normalmente simplifica uma grande estrutura "if else"
//Exemplo 1:
function getItemIf(item){
    if(item == "cidade"){
        return "km";
    }else if(item == "caminhada"){
        return "m";
    }else if(item == "mesa"){
        return "cm";
    }else if(item == "caneta"){
        return "mm";
    }else {
        return "m";
    }
}

function getItemCase(item){
    switch(item){
        case "cidade": return "km";
        case "caminhada": return "m";
        case "mesa": return "cm";
        case "caneta": return "mm";
        default: return "m";
    }
}

const iterator = {
    "cidade" : "km",
    "caminhada" : "m",
    "mesa" : "cm",
    "caneta" : "mm"
}

function getIterator(item){
    return iterator[item] == undefined ? "m" : iterator[item];
}

let item = prompt("Digite o item que deseja saber a medida: ");
console.log(`O item buscado é "${item}"`);
console.log(getItemIf(item));
console.log(getItemCase(item));
console.log(getIterator(item));