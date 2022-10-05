const texto = document.querySelector("#texto");
const luz = document.querySelector("#luz");
const ventilador = document.querySelector("#ventilador");
var url = "https://residenciawell.cognitiveservices.azure.com/language/:analyze-conversations?api-version=2022-05-01"


function enviar() {
    const options = {
        method: 'POST',
        headers: {
            'Ocp-Apim-Subscription-Key': '69d99f410b15469098b15a9f79f45bd4',
            'Content-Type': 'application/json'
        },
        body: '{"kind":"Conversation","analysisInput":{"conversationItem":{"id":"1","text":"'+texto.value+'","modality":"text","language":"en","participantId":"1"}},"parameters":{"projectName":"autoresidwell","verbose":true,"deploymentName":"atomaticresidencedeploied","stringIndexType":"TextElement_V8"}}'
    };
    fetch(url, options)
        .then(response => response.json())
        .then(response => {
            if(response.result.prediction.intents[0].category == 'switch_on'){
                if(response.result.prediction.entities[0].text == 'light'){
                    luz.innerHTML="<img src='./assets/acesa.png'>";
                }else{
                    ventilador.innerHTML="<img src='./assets/girando.png'>";
                }
            }else{
                if(response.result.prediction.entities[0].text == 'light'){
                    luz.innerHTML="<img src='./assets/apagada.png'>";
                }else{
                    ventilador.innerHTML="<img src='./assets/parado.png'>";
                }
            }
        })
        .catch(err => console.error(err));
}