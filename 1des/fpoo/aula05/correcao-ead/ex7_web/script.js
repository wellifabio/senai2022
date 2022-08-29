var p1 = document.querySelector("#p1");
var p2 = document.querySelector("#p2");
var p3 = document.querySelector("#p3");
var p4 = document.querySelector("#p4");
var p5 = document.querySelector("#p5");
var total = 0;

function processa(){
    if(p1.checked) total++;
    if(p2.checked) total++;
    if(p3.checked) total++;
    if(p4.checked) total++;
    if(p5.checked) total++;
    
    if(total < 2){
		alert("Está liberado.");
	}else if(total < 3){
		alert("Você é Suspeito.");
	}else if(total < 5){
		alert("Você é cúmplice.");
	}else{
		alert("Você é o assassino.");
	}
}
