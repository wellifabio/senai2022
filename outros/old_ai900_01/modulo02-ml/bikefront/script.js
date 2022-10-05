function enviar(){
    document.querySelectorAll(".data").forEach(e=>{
        let data = {};
        data[e.id]=e.value;
        console.log(data);
    });
}

/*
const options = {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json',
        Authorization: 'Bearer iGSwOyL3DMXE74R8Y1nbZVyb6HpgrGZr'
    },
    body: '{"Inputs":{"data":[{"day":29,"mnth":8,"year":2022,"season":3,"holiday":false,"weekday":1,"workingday":false,"weathersit":2,"temp":0.4,"atemp":0.3,"hum":0.7,"windspeed":0.1}]},"GlobalParameters":0}'
};

fetch('https://biketeste.brazilsouth.inference.ml.azure.com/score', options)
    .then(response => response.json())
    .then(response => console.log(response))
    .catch(err => console.error(err));
*/